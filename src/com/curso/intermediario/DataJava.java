package com.curso.intermediario;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
/* Formato ISO 8601: PADRÃO UNIVERSAL DE DATA E HORAS
 *  formato basico: AAAA-MM-DD
 *  formato extendido: UTC -> AAAA-MM-DDThh:mm:ssZ || Fuso -> AAAA-MM-DDThh:mm:ss-(diferença de fuso)
 */
public class DataJava {
    //Apenas data
    LocalDate d01 = LocalDate.now();
    //Datas e horas | Instant => Fuso | LocalDateTime => Data e Hora Local
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();
    
    LocalDate d04 = LocalDate.parse("2022-01-17");
    LocalDateTime d05 = LocalDateTime.parse("1998-01-17T01:30:26");
    Instant d06 = Instant.parse("1998-01-17T01:30:26Z");
    // -3 horas de fuso
    Instant d07 = Instant.parse("1998-01-17T01:30:26-03:00");
    
    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
    DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		   DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;
    
    LocalDate d08 = LocalDate.parse("20/10/2022", fmt01);
    LocalDateTime d09 = LocalDateTime.parse("17/01/1998 02:00");
    LocalDate d10 = LocalDate.of(2022,01,14);
    
    // for (String s : ZoneId.getAvailableZoneIds())
    //      System.out.println(s);
    
    //Conversão Java 9+
    //LocalDate conversaoLd1 = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
    //LocalDate conversaoLd2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
    LocalDate conversaoD1 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toLocalDate();
    LocalDate conversaoD2 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")).toLocalDate();
    LocalDateTime conversaoD3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
    LocalDateTime conversaoD4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
    
    public void executar(){
        
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());
        
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
    }
    
    
}
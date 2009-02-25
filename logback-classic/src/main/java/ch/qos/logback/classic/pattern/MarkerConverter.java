package ch.qos.logback.classic.pattern;

import org.slf4j.Marker;

import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * Return the event's marker value(s).
 * 
 * @author S&eacute;bastien Pennec
 */
public class MarkerConverter extends ClassicConverter {

  private static String EMPTY = "";

  public String convert(ILoggingEvent le) {
    Marker marker = le.getMarker();
    if (marker == null) {
      return EMPTY;
    } else {
      return marker.toString();
    }
  }

}

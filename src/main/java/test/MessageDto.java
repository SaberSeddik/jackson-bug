package test;

public class MessageDto {
    private final EventDto eventDto;

    public MessageDto(EventDto eventDto) {
        this.eventDto = eventDto;
    }

    public EventDto getEventDto() {
        return eventDto;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "eventDto=" + eventDto +
                '}';
    }
}

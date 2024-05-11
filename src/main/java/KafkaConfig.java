@Configuration
@EnableKafka
public class KafkaConfig {

    @Bean
    public KafkaReceiver listener() {
        return new KafkaReceiver();
    }

}

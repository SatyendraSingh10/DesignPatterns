package in.ss.design.patterns.chainofresponsibility;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Currency {
    @NonNull
    private int amount;
}

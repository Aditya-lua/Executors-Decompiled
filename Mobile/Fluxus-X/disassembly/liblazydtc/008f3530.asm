; cpr::util::progressUserFunction<cpr::CancellationCallback> @ 008f3530
008f3530	stp x29,x30,[sp, #-0x10]!
008f3534	mov x29,sp
008f3538	bl 0x00c30db0
008f353c	mvn w8,w0
008f3540	and w0,w8,#0x1
008f3544	ldp x29,x30,[sp], #0x10
008f3548	ret

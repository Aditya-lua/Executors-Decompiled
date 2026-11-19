; cpr::Session::SetOption @ 008f3020
008f3020	add x0,x0,#0x80
008f3024	mov x2,x1
008f3028	cmp x0,x1
008f302c	b.eq 0x008f3038
008f3030	ldr x1,[x2], #0x8
008f3034	b 0x00c31630
008f3038	ret

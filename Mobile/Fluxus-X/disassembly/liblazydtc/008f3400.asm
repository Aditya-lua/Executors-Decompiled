; cpr::Session::SetOption @ 008f3400
008f3400	mov x8,x0
008f3404	add x0,x0,#0xb0
008f3408	cmp x0,x1
008f340c	b.eq 0x008f3424
008f3410	ldr w9,[x1, #0x20]
008f3414	mov x2,xzr
008f3418	str w9,[x8, #0xd0]
008f341c	ldr x1,[x1, #0x10]
008f3420	b 0x00c31480
008f3424	ret

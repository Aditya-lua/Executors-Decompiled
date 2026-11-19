; cpr::Session::SetOption @ 008f33d8
008f33d8	mov x8,x0
008f33dc	add x0,x0,#0xb0
008f33e0	cmp x0,x1
008f33e4	b.eq 0x008f33fc
008f33e8	ldr w9,[x1, #0x20]
008f33ec	mov x2,xzr
008f33f0	str w9,[x8, #0xd0]
008f33f4	ldr x1,[x1, #0x10]
008f33f8	b 0x00c31480
008f33fc	ret

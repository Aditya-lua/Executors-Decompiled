; cpr::Session::SetOption @ 008f3168
008f3168	stp x20,x19,[sp, #-0x20]!
008f316c	stp x29,x30,[sp, #0x10]
008f3170	add x29,sp,#0x10
008f3174	ldr x8,[x0, #0x18]
008f3178	mov x20,x0
008f317c	ldrb w2,[x1]
008f3180	mov x19,x1
008f3184	ldr x0,[x8]
008f3188	mov w1,#0x40
008f318c	bl 0x00c317c0
008f3190	ldr x8,[x20, #0x18]
008f3194	ldrb w9,[x19]
008f3198	ldp x29,x30,[sp, #0x10]
008f319c	mov w1,#0x51
008f31a0	ldr x0,[x8]
008f31a4	cmp w9,#0x0
008f31a8	mov w8,#0x2
008f31ac	csel x2,xzr,x8,eq
008f31b0	ldp x20,x19,[sp], #0x20
008f31b4	b 0x00c317c0

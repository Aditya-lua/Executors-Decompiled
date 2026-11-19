; cpr::Session::SetOption @ 008f2e2c
008f2e2c	str x19,[sp, #-0x20]!
008f2e30	stp x29,x30,[sp, #0x10]
008f2e34	add x29,sp,#0x10
008f2e38	ldr x8,[x0, #0x18]
008f2e3c	mov x0,x1
008f2e40	ldr x19,[x8]
008f2e44	bl 0x00c31410
008f2e48	ldp x29,x30,[sp, #0x10]
008f2e4c	mov w1,#0x9c
008f2e50	mov x2,x0
008f2e54	mov x0,x19
008f2e58	ldr x19,[sp], #0x20
008f2e5c	b 0x00c317c0

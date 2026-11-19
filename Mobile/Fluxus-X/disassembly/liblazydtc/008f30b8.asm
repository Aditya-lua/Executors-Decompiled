; cpr::Session::SetOption @ 008f30b8
008f30b8	stp x20,x19,[sp, #-0x20]!
008f30bc	stp x29,x30,[sp, #0x10]
008f30c0	add x29,sp,#0x10
008f30c4	mov w8,#0x1
008f30c8	ldr x9,[x0, #0x18]
008f30cc	strb w8,[x0, #0x10]
008f30d0	ldrb w8,[x1, #0x8]
008f30d4	ldr x10,[x1, #0x10]
008f30d8	mov x20,x0
008f30dc	ldr x0,[x9]
008f30e0	lsr w9,w8,#0x1
008f30e4	tst w8,#0x1
008f30e8	mov x19,x1
008f30ec	csel x2,x9,x10,eq
008f30f0	mov w1,#0x75a8
008f30f4	bl 0x00c317c0
008f30f8	ldr x8,[x20, #0x18]
008f30fc	ldrb w9,[x19, #0x8]
008f3100	ldr x10,[x19, #0x18]
008f3104	ldp x29,x30,[sp, #0x10]
008f3108	ldr x0,[x8]
008f310c	add x8,x19,#0x9
008f3110	tst w9,#0x1
008f3114	csel x2,x8,x10,eq
008f3118	mov w1,#0x27b5
008f311c	ldp x20,x19,[sp], #0x20
008f3120	b 0x00c317c0

; cpr::Session::SetBody @ 008ee9f8
008ee9f8	stp x20,x19,[sp, #-0x20]!
008ee9fc	stp x29,x30,[sp, #0x10]
008eea00	add x29,sp,#0x10
008eea04	mov w8,#0x1
008eea08	ldr x9,[x0, #0x18]
008eea0c	strb w8,[x0, #0x10]
008eea10	ldrb w8,[x1, #0x8]
008eea14	ldr x10,[x1, #0x10]
008eea18	mov x20,x0
008eea1c	ldr x0,[x9]
008eea20	lsr w9,w8,#0x1
008eea24	tst w8,#0x1
008eea28	mov x19,x1
008eea2c	csel x2,x9,x10,eq
008eea30	mov w1,#0x75a8
008eea34	bl 0x00c317c0
008eea38	ldr x8,[x20, #0x18]
008eea3c	ldrb w9,[x19, #0x8]
008eea40	ldr x10,[x19, #0x18]
008eea44	ldp x29,x30,[sp, #0x10]
008eea48	ldr x0,[x8]
008eea4c	add x8,x19,#0x9
008eea50	tst w9,#0x1
008eea54	csel x2,x8,x10,eq
008eea58	mov w1,#0x271f
008eea5c	ldp x20,x19,[sp], #0x20
008eea60	b 0x00c317c0

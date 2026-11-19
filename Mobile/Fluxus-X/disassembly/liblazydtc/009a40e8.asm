; ix::SocketOpenSSL::openSSLServerHandshake @ 009a40e8
009a40e8	sub sp,sp,#0x50
009a40ec	stp x22,x21,[sp, #0x20]
009a40f0	stp x20,x19,[sp, #0x30]
009a40f4	stp x29,x30,[sp, #0x40]
009a40f8	add x29,sp,#0x40
009a40fc	mrs x22,tpidr_el0
009a4100	ldr x8,[x22, #0x28]
009a4104	mov x19,x1
009a4108	mov x20,x0
009a410c	str x8,[sp, #0x18]
009a4110	ldr x8,[x20, #0x40]
009a4114	cbz x8,0x009a4170
009a4118	ldr x8,[x20, #0x48]
009a411c	cbz x8,0x009a4170
009a4120	bl 0x00c323e0
009a4124	ldr x0,[x20, #0x40]
009a4128	bl 0x00c34050
009a412c	mov w21,w0
009a4130	cmp w0,#0x1
009a4134	b.eq 0x009a41ac
009a4138	ldr x0,[x20, #0x40]
009a413c	mov w1,w21
009a4140	bl 0x00c32910
009a4144	orr w8,w0,#0x1
009a4148	cmp w8,#0x3
009a414c	b.eq 0x009a4110
009a4150	mov x8,sp
009a4154	mov x0,x20
009a4158	mov w1,w21
009a415c	bl 0x00c33fa0
009a4160	ldrb w8,[x19]
009a4164	tbnz w8,#0x0,0x009a4178
009a4168	strh wzr,[x19]
009a416c	b 0x009a4198
009a4170	mov w0,wzr
009a4174	b 0x009a41ac
009a4178	ldr x8,[x19, #0x10]
009a417c	strb wzr,[x8]
009a4180	ldrb w8,[x19]
009a4184	str xzr,[x19, #0x8]
009a4188	tbz w8,#0x0,0x009a4198
009a418c	ldr x0,[x19, #0x10]
009a4190	bl 0x00c301d0
009a4194	str xzr,[x19]
009a4198	ldr x8,[sp, #0x10]
009a419c	mov w0,wzr
009a41a0	str x8,[x19, #0x10]
009a41a4	ldr q0,[sp]
009a41a8	str q0,[x19]
009a41ac	ldr x8,[x22, #0x28]
009a41b0	ldr x9,[sp, #0x18]
009a41b4	cmp x8,x9
009a41b8	b.ne 0x009a41d0
009a41bc	ldp x29,x30,[sp, #0x40]
009a41c0	ldp x20,x19,[sp, #0x30]
009a41c4	ldp x22,x21,[sp, #0x20]
009a41c8	add sp,sp,#0x50
009a41cc	ret
009a41d0	bl 0x00c2fec0

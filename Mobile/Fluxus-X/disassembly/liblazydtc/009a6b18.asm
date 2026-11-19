; dtls1_get_timeout @ 009a6b18
009a6b18	sub sp,sp,#0x30
009a6b1c	stp x20,x19,[sp, #0x10]
009a6b20	stp x29,x30,[sp, #0x20]
009a6b24	ldr x8,[x0, #0x4b8]
009a6b28	mov x20,x0
009a6b2c	mov x19,x1
009a6b30	add x29,sp,#0x20
009a6b34	ldr x9,[x8, #0x1f0]
009a6b38	cbnz x9,0x009a6b44
009a6b3c	ldr x8,[x8, #0x1f8]
009a6b40	cbz x8,0x009a6bd8
009a6b44	mov x0,sp
009a6b48	mov x1,xzr
009a6b4c	bl 0x00c31ff0
009a6b50	ldr x9,[x20, #0x4b8]
009a6b54	ldr x8,[sp]
009a6b58	ldr x10,[x9, #0x1f0]
009a6b5c	cmp x10,x8
009a6b60	b.lt 0x009a6bc0
009a6b64	b.ne 0x009a6b7c
009a6b68	ldr x11,[x9, #0x1f8]
009a6b6c	ldr x10,[sp, #0x8]
009a6b70	cmp x11,x10
009a6b74	b.gt 0x009a6b80
009a6b78	b 0x009a6bc0
009a6b7c	ldr x10,[sp, #0x8]
009a6b80	ldr q0,[x9, #0x1f0]
009a6b84	str q0,[x19]
009a6b88	ldp x9,x11,[x19]
009a6b8c	sub x9,x9,x8
009a6b90	subs x8,x11,x10
009a6b94	stp x9,x8,[x19]
009a6b98	b.pl 0x009a6bb0
009a6b9c	mov w10,#0x4240
009a6ba0	movk w10,#0xf, LSL #16
009a6ba4	sub x9,x9,#0x1
009a6ba8	add x8,x8,x10
009a6bac	stp x9,x8,[x19]
009a6bb0	cbnz x9,0x009a6bc4
009a6bb4	mov w9,#0x3a97
009a6bb8	cmp x8,x9
009a6bbc	b.gt 0x009a6bc4
009a6bc0	stp xzr,xzr,[x19]
009a6bc4	mov x0,x19
009a6bc8	ldp x29,x30,[sp, #0x20]
009a6bcc	ldp x20,x19,[sp, #0x10]
009a6bd0	add sp,sp,#0x30
009a6bd4	ret
009a6bd8	mov x19,xzr
009a6bdc	b 0x009a6bc4

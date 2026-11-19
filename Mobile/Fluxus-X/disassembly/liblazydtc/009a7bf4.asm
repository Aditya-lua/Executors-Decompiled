; dtls1_dispatch_alert @ 009a7bf4
009a7bf4	sub sp,sp,#0x30
009a7bf8	stp x20,x19,[sp, #0x10]
009a7bfc	stp x29,x30,[sp, #0x20]
009a7c00	ldrb w8,[x0, #0x1a8]
009a7c04	str wzr,[x0, #0x1a4]
009a7c08	mov w1,#0x15
009a7c0c	add x2,sp,#0xc
009a7c10	strb w8,[sp, #0xc]
009a7c14	ldrb w8,[x0, #0x1a9]
009a7c18	mov w3,#0x2
009a7c1c	mov x5,sp
009a7c20	mov w4,wzr
009a7c24	add x29,sp,#0x20
009a7c28	mov x19,x0
009a7c2c	strb w8,[sp, #0xd]
009a7c30	bl 0x00c344f0
009a7c34	mov w20,w0
009a7c38	cmp w0,#0x0
009a7c3c	b.le 0x009a7cac
009a7c40	ldr x0,[x19, #0x18]
009a7c44	mov w1,#0xb
009a7c48	mov x2,xzr
009a7c4c	mov x3,xzr
009a7c50	bl 0x00c321a0
009a7c54	ldr x8,[x19, #0x4c0]
009a7c58	cbz x8,0x009a7c7c
009a7c5c	ldr w1,[x19]
009a7c60	ldr x6,[x19, #0x4c8]
009a7c64	add x3,x19,#0x1a8
009a7c68	mov w0,#0x1
009a7c6c	mov w2,#0x15
009a7c70	mov w4,#0x2
009a7c74	mov x5,x19
009a7c78	blr x8
009a7c7c	ldr x8,[x19, #0x978]
009a7c80	cbnz x8,0x009a7c90
009a7c84	ldr x8,[x19, #0x9a8]
009a7c88	ldr x8,[x8, #0x120]
009a7c8c	cbz x8,0x009a7cb4
009a7c90	ldrb w9,[x19, #0x1a8]
009a7c94	ldrb w2,[x19, #0x1a9]
009a7c98	mov w1,#0x4008
009a7c9c	mov x0,x19
009a7ca0	bfm w2,w9,#0x18,#0x7
009a7ca4	blr x8
009a7ca8	b 0x009a7cb4
009a7cac	mov w8,#0x1
009a7cb0	str w8,[x19, #0x1a4]
009a7cb4	mov w0,w20
009a7cb8	ldp x29,x30,[sp, #0x20]
009a7cbc	ldp x20,x19,[sp, #0x10]
009a7cc0	add sp,sp,#0x30
009a7cc4	ret

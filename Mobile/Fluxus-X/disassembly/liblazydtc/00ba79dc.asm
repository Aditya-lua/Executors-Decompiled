; mbedtls_rsa_pkcs1_encrypt @ 00ba79dc
00ba79dc	str x27,[sp, #-0x60]!
00ba79e0	stp x26,x25,[sp, #0x10]
00ba79e4	stp x24,x23,[sp, #0x20]
00ba79e8	stp x22,x21,[sp, #0x30]
00ba79ec	stp x20,x19,[sp, #0x40]
00ba79f0	stp x29,x30,[sp, #0x50]
00ba79f4	add x29,sp,#0x50
00ba79f8	ldr w8,[x0, #0xe0]
00ba79fc	mov x19,x5
00ba7a00	mov x20,x4
00ba7a04	mov x21,x3
00ba7a08	mov x23,x2
00ba7a0c	mov x22,x0
00ba7a10	cmp w8,#0x1
00ba7a14	mov x24,x1
00ba7a18	b.eq 0x00ba7adc
00ba7a1c	cbnz w8,0x00ba7b18
00ba7a20	cmn x21,#0xc
00ba7a24	mov w0,#0xffffbf80
00ba7a28	b.hi 0x00ba7b1c
00ba7a2c	ldr x8,[x22, #0x8]
00ba7a30	add x9,x21,#0xb
00ba7a34	cmp x8,x9
00ba7a38	b.cc 0x00ba7b1c
00ba7a3c	strb wzr,[x19]
00ba7a40	cbz x24,0x00ba7b38
00ba7a44	orr x9,xzr,#-0x3
00ba7a48	sub x9,x9,x21
00ba7a4c	add x25,x19,#0x2
00ba7a50	adds x26,x8,x9
00ba7a54	mov w8,#0x2
00ba7a58	strb w8,[x19, #0x1]
00ba7a5c	b.eq 0x00ba7a9c
00ba7a60	sub x26,x26,#0x1
00ba7a64	mov w27,#0x64
00ba7a68	mov w2,#0x1
00ba7a6c	mov x0,x23
00ba7a70	mov x1,x25
00ba7a74	blr x24
00ba7a78	ldrb w8,[x25]
00ba7a7c	cbnz w8,0x00ba7a8c
00ba7a80	subs w27,w27,#0x1
00ba7a84	b.eq 0x00ba7a8c
00ba7a88	cbz w0,0x00ba7a68
00ba7a8c	cbnz w0,0x00ba7b40
00ba7a90	cbz w27,0x00ba7b40
00ba7a94	add x25,x25,#0x1
00ba7a98	cbnz x26,0x00ba7a60
00ba7a9c	strb wzr,[x25]
00ba7aa0	cbz x21,0x00ba7ab4
00ba7aa4	add x0,x25,#0x1
00ba7aa8	mov x1,x20
00ba7aac	mov x2,x21
00ba7ab0	bl 0x00c2ffd0
00ba7ab4	mov x0,x22
00ba7ab8	mov x1,x19
00ba7abc	mov x2,x19
00ba7ac0	ldp x29,x30,[sp, #0x50]
00ba7ac4	ldp x20,x19,[sp, #0x40]
00ba7ac8	ldp x22,x21,[sp, #0x30]
00ba7acc	ldp x24,x23,[sp, #0x20]
00ba7ad0	ldp x26,x25,[sp, #0x10]
00ba7ad4	ldr x27,[sp], #0x60
00ba7ad8	b 0x00c43470
00ba7adc	mov x0,x22
00ba7ae0	mov x1,x24
00ba7ae4	mov x2,x23
00ba7ae8	mov x5,x21
00ba7aec	mov x6,x20
00ba7af0	mov x7,x19
00ba7af4	ldp x29,x30,[sp, #0x50]
00ba7af8	ldp x20,x19,[sp, #0x40]
00ba7afc	ldp x22,x21,[sp, #0x30]
00ba7b00	ldp x24,x23,[sp, #0x20]
00ba7b04	ldp x26,x25,[sp, #0x10]
00ba7b08	mov x3,xzr
00ba7b0c	mov x4,xzr
00ba7b10	ldr x27,[sp], #0x60
00ba7b14	b 0x00c43380
00ba7b18	mov w0,#0xffffbf00
00ba7b1c	ldp x29,x30,[sp, #0x50]
00ba7b20	ldp x20,x19,[sp, #0x40]
00ba7b24	ldp x22,x21,[sp, #0x30]
00ba7b28	ldp x24,x23,[sp, #0x20]
00ba7b2c	ldp x26,x25,[sp, #0x10]
00ba7b30	ldr x27,[sp], #0x60
00ba7b34	ret
00ba7b38	mov w0,#0xffffbf80
00ba7b3c	b 0x00ba7b1c
00ba7b40	mov w8,#0xffffbb80
00ba7b44	add w0,w0,w8
00ba7b48	b 0x00ba7b1c

; tls_process_cert_status_body @ 009e09c0
009e09c0	str x21,[sp, #-0x30]!
009e09c4	stp x20,x19,[sp, #0x10]
009e09c8	stp x29,x30,[sp, #0x20]
009e09cc	ldr x8,[x1, #0x8]
009e09d0	mov x19,x0
009e09d4	add x29,sp,#0x20
009e09d8	cbz x8,0x009e0a78
009e09dc	ldr x9,[x1]
009e09e0	mov x20,x1
009e09e4	sub x10,x8,#0x1
009e09e8	mov x11,x9
009e09ec	ldrb w12,[x11], #0x1
009e09f0	cmp w12,#0x1
009e09f4	stp x11,x10,[x1]
009e09f8	b.ne 0x009e0a78
009e09fc	cmp x10,#0x3
009e0a00	b.cc 0x009e0aa0
009e0a04	ldrb w10,[x9, #0x1]
009e0a08	ldrb w11,[x9, #0x2]
009e0a0c	ldrb w12,[x9, #0x3]
009e0a10	sub x8,x8,#0x4
009e0a14	lsl x10,x10,#0x10
009e0a18	bfm x10,x11,#0x38,#0x7
009e0a1c	orr x21,x10,x12
009e0a20	add x9,x9,#0x4
009e0a24	cmp x8,x21
009e0a28	stp x9,x8,[x20]
009e0a2c	b.ne 0x009e0aa0
009e0a30	adrp x1,0x2d7000
009e0a34	add x1,x1,#0xb1a
009e0a38	mov w2,#0xa58
009e0a3c	mov x0,x21
009e0a40	bl 0x00c32320
009e0a44	str x0,[x19, #0xa88]
009e0a48	cbz x0,0x009e0ae4
009e0a4c	str x21,[x19, #0xa90]
009e0a50	ldr x8,[x20, #0x8]
009e0a54	cmp x8,x21
009e0a58	b.cs 0x009e0b14
009e0a5c	bl 0x00c342a0
009e0a60	adrp x0,0x2d7000
009e0a64	adrp x2,0x2b7000
009e0a68	add x0,x0,#0xb1a
009e0a6c	add x2,x2,#0x833
009e0a70	mov w1,#0xa60
009e0a74	b 0x009e0ab8
009e0a78	bl 0x00c342a0
009e0a7c	adrp x0,0x2d7000
009e0a80	adrp x2,0x2b7000
009e0a84	add x0,x0,#0xb1a
009e0a88	add x2,x2,#0x833
009e0a8c	mov w1,#0xa50
009e0a90	bl 0x00c342b0
009e0a94	mov w1,#0x32
009e0a98	mov w2,#0x149
009e0a9c	b 0x009e0ac4
009e0aa0	bl 0x00c342a0
009e0aa4	adrp x0,0x2d7000
009e0aa8	adrp x2,0x2b7000
009e0aac	add x0,x0,#0xb1a
009e0ab0	add x2,x2,#0x833
009e0ab4	mov w1,#0xa55
009e0ab8	bl 0x00c342b0
009e0abc	mov w1,#0x32
009e0ac0	mov w2,#0x9f
009e0ac4	mov x0,x19
009e0ac8	mov x3,xzr
009e0acc	bl 0x00c34410
009e0ad0	mov w0,wzr
009e0ad4	ldp x29,x30,[sp, #0x20]
009e0ad8	ldp x20,x19,[sp, #0x10]
009e0adc	ldr x21,[sp], #0x30
009e0ae0	ret
009e0ae4	str xzr,[x19, #0xa90]
009e0ae8	bl 0x00c342a0
009e0aec	adrp x0,0x2d7000
009e0af0	adrp x2,0x2b7000
009e0af4	add x0,x0,#0xb1a
009e0af8	add x2,x2,#0x833
009e0afc	mov w1,#0xa5b
009e0b00	bl 0x00c342b0
009e0b04	mov w2,#0x100
009e0b08	mov w1,#0x50
009e0b0c	movk w2,#0xc, LSL #16
009e0b10	b 0x009e0ac4
009e0b14	ldr x1,[x20]
009e0b18	mov x2,x21
009e0b1c	bl 0x00c2ffd0
009e0b20	ldp x8,x9,[x20]
009e0b24	mov w0,#0x1
009e0b28	add x8,x8,x21
009e0b2c	sub x9,x9,x21
009e0b30	stp x8,x9,[x20]
009e0b34	b 0x009e0ad4

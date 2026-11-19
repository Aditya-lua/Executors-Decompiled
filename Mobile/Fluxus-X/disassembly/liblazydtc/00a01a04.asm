; bn_expand2 @ 00a01a04
00a01a04	str x21,[sp, #-0x30]!
00a01a08	stp x20,x19,[sp, #0x10]
00a01a0c	stp x29,x30,[sp, #0x20]
00a01a10	ldr w8,[x0, #0xc]
00a01a14	mov x19,x0
00a01a18	mov w20,w1
00a01a1c	add x29,sp,#0x20
00a01a20	cmp w8,w1
00a01a24	b.ge 0x00a01b34
00a01a28	cmp w20,#0x800, LSL #12
00a01a2c	b.lt 0x00a01a58
00a01a30	bl 0x00c342a0
00a01a34	adrp x0,0x2b5000
00a01a38	adrp x2,0x2cf000
00a01a3c	add x0,x0,#0xa6d
00a01a40	add x2,x2,#0x989
00a01a44	mov w1,#0x10f
00a01a48	bl 0x00c342b0
00a01a4c	orr w0,wzr,#0x3
00a01a50	mov w1,#0x72
00a01a54	b 0x00a01b28
00a01a58	ldr w8,[x19, #0x14]
00a01a5c	tbnz w8,#0x1,0x00a01ac8
00a01a60	adrp x1,0x2b5000
00a01a64	sbfiz x0,x20,#0x3,#0x20
00a01a68	add x1,x1,#0xa6d
00a01a6c	tbnz w8,#0x3,0x00a01af0
00a01a70	mov w2,#0x119
00a01a74	bl 0x00c34250
00a01a78	mov x21,x0
00a01a7c	cbz x0,0x00a01b00
00a01a80	ldrsw x8,[x19, #0x8]
00a01a84	cmp w8,#0x1
00a01a88	b.lt 0x00a01a9c
00a01a8c	ldr x1,[x19]
00a01a90	lsl x2,x8,#0x3
00a01a94	mov x0,x21
00a01a98	bl 0x00c2ffd0
00a01a9c	ldr x0,[x19]
00a01aa0	cbz x0,0x00a01b50
00a01aa4	ldrsw x8,[x19, #0xc]
00a01aa8	ldrb w9,[x19, #0x14]
00a01aac	adrp x2,0x2b5000
00a01ab0	add x2,x2,#0xa6d
00a01ab4	lsl x1,x8,#0x3
00a01ab8	tbnz w9,#0x3,0x00a01b48
00a01abc	mov w3,#0xcf
00a01ac0	bl 0x00c345e0
00a01ac4	b 0x00a01b50
00a01ac8	bl 0x00c342a0
00a01acc	adrp x0,0x2b5000
00a01ad0	adrp x2,0x2cf000
00a01ad4	add x0,x0,#0xa6d
00a01ad8	add x2,x2,#0x989
00a01adc	mov w1,#0x113
00a01ae0	bl 0x00c342b0
00a01ae4	orr w0,wzr,#0x3
00a01ae8	mov w1,#0x69
00a01aec	b 0x00a01b28
00a01af0	mov w2,#0x117
00a01af4	bl 0x00c35710
00a01af8	mov x21,x0
00a01afc	cbnz x0,0x00a01a80
00a01b00	bl 0x00c342a0
00a01b04	adrp x0,0x2b5000
00a01b08	adrp x2,0x2cf000
00a01b0c	add x0,x0,#0xa6d
00a01b10	add x2,x2,#0x989
00a01b14	mov w1,#0x11b
00a01b18	bl 0x00c342b0
00a01b1c	mov w1,#0x100
00a01b20	orr w0,wzr,#0x3
00a01b24	movk w1,#0xc, LSL #16
00a01b28	mov x2,xzr
00a01b2c	bl 0x00c342c0
00a01b30	mov x19,xzr
00a01b34	mov x0,x19
00a01b38	ldp x29,x30,[sp, #0x20]
00a01b3c	ldp x20,x19,[sp, #0x10]
00a01b40	ldr x21,[sp], #0x30
00a01b44	ret
00a01b48	mov w3,#0xcd
00a01b4c	bl 0x00c38e10
00a01b50	str x21,[x19]
00a01b54	str w20,[x19, #0xc]
00a01b58	b 0x00a01b34

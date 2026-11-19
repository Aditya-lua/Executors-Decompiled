; FUN_00b41a48 @ 00b41a48
00b41a48	stp x28,x27,[sp, #-0x60]!
00b41a4c	stp x22,x21,[sp, #0x30]
00b41a50	mov x21,x2
00b41a54	mov x2,x1
00b41a58	adrp x1,0x2a7000
00b41a5c	add x1,x1,#0x2d3
00b41a60	stp x26,x25,[sp, #0x10]
00b41a64	stp x24,x23,[sp, #0x20]
00b41a68	stp x20,x19,[sp, #0x40]
00b41a6c	stp x29,x30,[sp, #0x50]
00b41a70	add x29,sp,#0x50
00b41a74	mov x20,x3
00b41a78	mov x19,x0
00b41a7c	bl 0x00c32250
00b41a80	cmp w0,#0x1
00b41a84	b.lt 0x00b41b50
00b41a88	cbz x20,0x00b41b34
00b41a8c	orr x28,xzr,#-0x7777777777777778
00b41a90	adrp x23,0x2bc000
00b41a94	adrp x22,0x2ab000
00b41a98	adrp x24,0x2a3000
00b41a9c	mov x25,xzr
00b41aa0	mov x26,xzr
00b41aa4	sub x27,x20,#0x1
00b41aa8	movk x28,#0x8889
00b41aac	add x23,x23,#0xda4
00b41ab0	add x22,x22,#0x32c
00b41ab4	add x24,x24,#0xe88
00b41ab8	umulh x8,x26,x28
00b41abc	lsr x8,x8,#0x3
00b41ac0	lsl x9,x8,#0x4
00b41ac4	sub x8,x9,x8
00b41ac8	cmn x25,x8
00b41acc	b.ne 0x00b41b04
00b41ad0	cbz x26,0x00b41aec
00b41ad4	adrp x1,0x2c4000
00b41ad8	mov x0,x19
00b41adc	add x1,x1,#0xdae
00b41ae0	bl 0x00c32250
00b41ae4	cmp w0,#0x1
00b41ae8	b.lt 0x00b41b50
00b41aec	adrp x1,0x2d0000
00b41af0	mov x0,x19
00b41af4	add x1,x1,#0x464
00b41af8	bl 0x00c32250
00b41afc	cmp w0,#0x1
00b41b00	b.lt 0x00b41b50
00b41b04	ldrb w2,[x21, x26]
00b41b08	cmp x27,x26
00b41b0c	csel x3,x22,x23,eq
00b41b10	mov x0,x19
00b41b14	mov x1,x24
00b41b18	bl 0x00c32250
00b41b1c	cmp w0,#0x1
00b41b20	b.lt 0x00b41b50
00b41b24	add x26,x26,#0x1
00b41b28	cmp x26,x20
00b41b2c	sub x25,x25,#0x1
00b41b30	b.cc 0x00b41ab8
00b41b34	adrp x1,0x2c4000
00b41b38	add x1,x1,#0xdae
00b41b3c	mov x0,x19
00b41b40	bl 0x00c32250
00b41b44	cmp w0,#0x0
00b41b48	cset w0,gt
00b41b4c	b 0x00b41b54
00b41b50	mov w0,wzr
00b41b54	ldp x29,x30,[sp, #0x50]
00b41b58	ldp x20,x19,[sp, #0x40]
00b41b5c	ldp x22,x21,[sp, #0x30]
00b41b60	ldp x24,x23,[sp, #0x20]
00b41b64	ldp x26,x25,[sp, #0x10]
00b41b68	ldp x28,x27,[sp], #0x60
00b41b6c	ret

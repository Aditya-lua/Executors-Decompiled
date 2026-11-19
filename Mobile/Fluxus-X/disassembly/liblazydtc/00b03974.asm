; FUN_00b03974 @ 00b03974
00b03974	stp x28,x27,[sp, #-0x60]!
00b03978	stp x22,x21,[sp, #0x30]
00b0397c	mov x22,x0
00b03980	mov x0,x2
00b03984	stp x26,x25,[sp, #0x10]
00b03988	stp x24,x23,[sp, #0x20]
00b0398c	stp x20,x19,[sp, #0x40]
00b03990	stp x29,x30,[sp, #0x50]
00b03994	add x29,sp,#0x50
00b03998	mov x20,x2
00b0399c	mov x21,x1
00b039a0	bl 0x00c325e0
00b039a4	mov w23,w0
00b039a8	mov x0,xzr
00b039ac	mov w1,w23
00b039b0	bl 0x00c34790
00b039b4	mov x19,x0
00b039b8	cbz x0,0x00b03ae4
00b039bc	cmp w23,#0x1
00b039c0	b.lt 0x00b03bb4
00b039c4	adrp x25,0x2ba000
00b039c8	adrp x26,0x2aa000
00b039cc	mov w24,wzr
00b039d0	add x25,x25,#0x589
00b039d4	add x26,x26,#0xb1b
00b039d8	b 0x00b03a8c
00b039dc	ldr x0,[x27, #0x10]
00b039e0	cbz x0,0x00b03aac
00b039e4	mov x1,x26
00b039e8	bl 0x00c301f0
00b039ec	cbnz w0,0x00b03aac
00b039f0	cbz x21,0x00b03b20
00b039f4	ldrb w8,[x21]
00b039f8	tbnz w8,#0x0,0x00b03ad4
00b039fc	ldr x0,[x21, #0x8]
00b03a00	cbz x0,0x00b03b20
00b03a04	mov w1,#0x55
00b03a08	mov w2,#0xffffffff
00b03a0c	bl 0x00c39970
00b03a10	tbnz w0,#0x1f,0x00b03ad4
00b03a14	mov w1,w0
00b03a18	ldr x0,[x21, #0x8]
00b03a1c	bl 0x00c39960
00b03a20	cbz x0,0x00b03b48
00b03a24	bl 0x00c40870
00b03a28	cbz x0,0x00b03b48
00b03a2c	mov x27,x0
00b03a30	bl 0x00c325e0
00b03a34	mov w28,w0
00b03a38	mov x0,x19
00b03a3c	mov w1,w28
00b03a40	bl 0x00c40240
00b03a44	cbz w0,0x00b03b70
00b03a48	cmp w28,#0x1
00b03a4c	b.lt 0x00b03a78
00b03a50	mov w26,wzr
00b03a54	mov x0,x27
00b03a58	mov w1,w26
00b03a5c	bl 0x00c32610
00b03a60	mov x1,x0
00b03a64	mov x0,x19
00b03a68	bl 0x00c347a0
00b03a6c	add w26,w26,#0x1
00b03a70	cmp w28,w26
00b03a74	b.ne 0x00b03a54
00b03a78	mov x0,x27
00b03a7c	bl 0x00c34770
00b03a80	adrp x26,0x2aa000
00b03a84	add x26,x26,#0xb1b
00b03a88	b 0x00b03ad4
00b03a8c	mov x0,x20
00b03a90	mov w1,w24
00b03a94	bl 0x00c32610
00b03a98	mov x27,x0
00b03a9c	ldr x0,[x0, #0x8]
00b03aa0	mov x1,x25
00b03aa4	bl 0x00c408b0
00b03aa8	cbz w0,0x00b039dc
00b03aac	mov x0,xzr
00b03ab0	mov x1,x22
00b03ab4	mov x2,x21
00b03ab8	mov x3,x27
00b03abc	mov w4,wzr
00b03ac0	bl 0x00b041e4
00b03ac4	cbz x0,0x00b03ba0
00b03ac8	mov x1,x0
00b03acc	mov x0,x19
00b03ad0	bl 0x00c347a0
00b03ad4	add w24,w24,#0x1
00b03ad8	cmp w24,w23
00b03adc	b.lt 0x00b03a8c
00b03ae0	b 0x00b03bb4
00b03ae4	bl 0x00c342a0
00b03ae8	adrp x0,0x2bc000
00b03aec	adrp x2,0x2b6000
00b03af0	add x0,x0,#0x63d
00b03af4	add x2,x2,#0x581
00b03af8	mov w1,#0x136
00b03afc	bl 0x00c342b0
00b03b00	mov w1,#0x100
00b03b04	mov w0,#0x22
00b03b08	movk w1,#0xc, LSL #16
00b03b0c	mov x2,xzr
00b03b10	bl 0x00c342c0
00b03b14	mov x0,xzr
00b03b18	bl 0x00c34770
00b03b1c	b 0x00b03bb4
00b03b20	bl 0x00c342a0
00b03b24	adrp x0,0x2bc000
00b03b28	adrp x2,0x2d2000
00b03b2c	add x0,x0,#0x63d
00b03b30	add x2,x2,#0x4d9
00b03b34	mov w1,#0x15b
00b03b38	bl 0x00c342b0
00b03b3c	mov w0,#0x22
00b03b40	orr w1,wzr,#0x7f
00b03b44	b 0x00b03b98
00b03b48	bl 0x00c342a0
00b03b4c	adrp x0,0x2bc000
00b03b50	adrp x2,0x2d2000
00b03b54	add x0,x0,#0x63d
00b03b58	add x2,x2,#0x4d9
00b03b5c	mov w1,#0x163
00b03b60	bl 0x00c342b0
00b03b64	mov w0,#0x22
00b03b68	orr w1,wzr,#0x7e
00b03b6c	b 0x00b03b98
00b03b70	bl 0x00c342a0
00b03b74	adrp x0,0x2bc000
00b03b78	adrp x2,0x2d2000
00b03b7c	add x0,x0,#0x63d
00b03b80	add x2,x2,#0x4d9
00b03b84	mov w1,#0x169
00b03b88	bl 0x00c342b0
00b03b8c	mov w1,#0x100
00b03b90	mov w0,#0x22
00b03b94	movk w1,#0xc, LSL #16
00b03b98	mov x2,xzr
00b03b9c	bl 0x00c342c0
00b03ba0	adrp x1,0xcb5000
00b03ba4	ldr x1,[x1, #0x6b8]
00b03ba8	mov x0,x19
00b03bac	bl 0x00c32600
00b03bb0	mov x19,xzr
00b03bb4	mov x0,x19
00b03bb8	ldp x29,x30,[sp, #0x50]
00b03bbc	ldp x20,x19,[sp, #0x40]
00b03bc0	ldp x22,x21,[sp, #0x30]
00b03bc4	ldp x24,x23,[sp, #0x20]
00b03bc8	ldp x26,x25,[sp, #0x10]
00b03bcc	ldp x28,x27,[sp], #0x60
00b03bd0	ret

; EVP_PKEY_fromdata @ 00a74a28
00a74a28	str x23,[sp, #-0x40]!
00a74a2c	stp x22,x21,[sp, #0x10]
00a74a30	stp x20,x19,[sp, #0x20]
00a74a34	stp x29,x30,[sp, #0x30]
00a74a38	add x29,sp,#0x30
00a74a3c	cbz x0,0x00a74a4c
00a74a40	ldrb w8,[x0]
00a74a44	mov x22,x0
00a74a48	tbnz w8,#0x3,0x00a74a90
00a74a4c	bl 0x00c342a0
00a74a50	adrp x0,0x2d9000
00a74a54	adrp x2,0x2b4000
00a74a58	add x0,x0,#0xd3a
00a74a5c	add x2,x2,#0x32a
00a74a60	mov w1,#0x172
00a74a64	bl 0x00c342b0
00a74a68	orr w0,wzr,#0x6
00a74a6c	mov w1,#0x96
00a74a70	mov x2,xzr
00a74a74	bl 0x00c342c0
00a74a78	orr w0,wzr,#0xfffffffe
00a74a7c	ldp x29,x30,[sp, #0x30]
00a74a80	ldp x20,x19,[sp, #0x20]
00a74a84	ldp x22,x21,[sp, #0x10]
00a74a88	ldr x23,[sp], #0x40
00a74a8c	ret
00a74a90	mov x19,x1
00a74a94	cbz x1,0x00a74ab0
00a74a98	ldr x0,[x19]
00a74a9c	mov x20,x3
00a74aa0	mov w21,w2
00a74aa4	cbz x0,0x00a74ab8
00a74aa8	mov x23,xzr
00a74aac	b 0x00a74ac8
00a74ab0	mov w0,#0xffffffff
00a74ab4	b 0x00a74a7c
00a74ab8	bl 0x00c36450
00a74abc	mov x23,x0
00a74ac0	str x0,[x19]
00a74ac4	cbz x0,0x00a74afc
00a74ac8	ldr x1,[x22, #0x20]
00a74acc	mov w2,w21
00a74ad0	mov x3,x20
00a74ad4	bl 0x00c3d330
00a74ad8	cbz x0,0x00a74ae4
00a74adc	mov w0,#0x1
00a74ae0	b 0x00a74a7c
00a74ae4	cbz x23,0x00a74af4
00a74ae8	mov x0,x23
00a74aec	str xzr,[x19]
00a74af0	bl 0x00c32450
00a74af4	mov w0,wzr
00a74af8	b 0x00a74a7c
00a74afc	bl 0x00c342a0
00a74b00	adrp x0,0x2d9000
00a74b04	adrp x2,0x2b4000
00a74b08	add x0,x0,#0xd3a
00a74b0c	add x2,x2,#0x32a
00a74b10	mov w1,#0x17d
00a74b14	bl 0x00c342b0
00a74b18	mov w1,#0x100
00a74b1c	orr w0,wzr,#0x6
00a74b20	movk w1,#0xc, LSL #16
00a74b24	mov x2,xzr
00a74b28	bl 0x00c342c0
00a74b2c	mov w0,#0xffffffff
00a74b30	b 0x00a74a7c

; OSSL_ENCODER_to_bio @ 00a61a4c
00a61a4c	sub sp,sp,#0x70
00a61a50	movi v0.2D,#0x0
00a61a54	stp xzr,x19,[sp, #0x48]
00a61a58	stp x29,x30,[sp, #0x60]
00a61a5c	add x29,sp,#0x60
00a61a60	stur q0,[sp, #0x38]
00a61a64	stur q0,[sp, #0x28]
00a61a68	stur q0,[sp, #0x18]
00a61a6c	stp x0,x1,[sp, #0x8]
00a61a70	cbz x0,0x00a61ab0
00a61a74	mov x19,x0
00a61a78	ldr x0,[x0, #0x18]
00a61a7c	cbz x0,0x00a61ab0
00a61a80	bl 0x00c325e0
00a61a84	str w0,[sp, #0x18]
00a61a88	cbz w0,0x00a61ab4
00a61a8c	ldr x8,[x19, #0x28]
00a61a90	cbz x8,0x00a61af8
00a61a94	ldr x8,[x19, #0x20]
00a61a98	cbz x8,0x00a61af8
00a61a9c	add x0,sp,#0x8
00a61aa0	bl 0x00a61b40
00a61aa4	cmp w0,#0x0
00a61aa8	cset w0,gt
00a61aac	b 0x00a61ae8
00a61ab0	str wzr,[sp, #0x18]
00a61ab4	bl 0x00c342a0
00a61ab8	adrp x0,0x2a0000
00a61abc	adrp x2,0x2a7000
00a61ac0	add x0,x0,#0x26d
00a61ac4	add x2,x2,#0xfbb
00a61ac8	mov w1,#0x37
00a61acc	bl 0x00c342b0
00a61ad0	adrp x2,0x2bf000
00a61ad4	add x2,x2,#0xca4
00a61ad8	mov w0,#0x3b
00a61adc	mov w1,#0x65
00a61ae0	bl 0x00c342c0
00a61ae4	mov w0,wzr
00a61ae8	ldp x29,x30,[sp, #0x60]
00a61aec	ldr x19,[sp, #0x50]
00a61af0	add sp,sp,#0x70
00a61af4	ret
00a61af8	bl 0x00c342a0
00a61afc	adrp x0,0x2a0000
00a61b00	adrp x2,0x2a7000
00a61b04	add x0,x0,#0x26d
00a61b08	add x2,x2,#0xfbb
00a61b0c	orr w1,wzr,#0x3f
00a61b10	bl 0x00c342b0
00a61b14	mov w1,#0x105
00a61b18	mov w0,#0x3b
00a61b1c	movk w1,#0xc, LSL #16
00a61b20	mov x2,xzr
00a61b24	b 0x00a61ae0

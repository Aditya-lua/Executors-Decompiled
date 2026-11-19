; ossl_d2i_X25519_PUBKEY @ 00b1def4
00b1def4	sub sp,sp,#0x40
00b1def8	stp x22,x21,[sp, #0x10]
00b1defc	stp x20,x19,[sp, #0x20]
00b1df00	stp x29,x30,[sp, #0x30]
00b1df04	ldr x8,[x1]
00b1df08	mov x20,x1
00b1df0c	mov x19,x0
00b1df10	add x1,sp,#0x8
00b1df14	mov w5,#0x1
00b1df18	mov x0,xzr
00b1df1c	mov x3,xzr
00b1df20	mov x4,xzr
00b1df24	add x29,sp,#0x30
00b1df28	str x8,[sp, #0x8]
00b1df2c	bl 0x00b1d214
00b1df30	cbz x0,0x00b1df80
00b1df34	mov x22,x0
00b1df38	bl 0x00c324b0
00b1df3c	cmp w0,#0x40a
00b1df40	b.ne 0x00b1df78
00b1df44	mov x0,x22
00b1df48	bl 0x00c3da00
00b1df4c	mov x21,x0
00b1df50	mov x0,x22
00b1df54	bl 0x00c32450
00b1df58	cbz x21,0x00b1df84
00b1df5c	ldr x8,[sp, #0x8]
00b1df60	str x8,[x20]
00b1df64	cbz x19,0x00b1df84
00b1df68	ldr x0,[x19]
00b1df6c	bl 0x00c3b270
00b1df70	str x21,[x19]
00b1df74	b 0x00b1df84
00b1df78	mov x0,x22
00b1df7c	bl 0x00c32450
00b1df80	mov x21,xzr
00b1df84	mov x0,x21
00b1df88	ldp x29,x30,[sp, #0x30]
00b1df8c	ldp x20,x19,[sp, #0x20]
00b1df90	ldp x22,x21,[sp, #0x10]
00b1df94	add sp,sp,#0x40
00b1df98	ret

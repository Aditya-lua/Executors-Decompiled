; ossl_d2i_ED25519_PUBKEY @ 00b1dc84
00b1dc84	sub sp,sp,#0x40
00b1dc88	stp x22,x21,[sp, #0x10]
00b1dc8c	stp x20,x19,[sp, #0x20]
00b1dc90	stp x29,x30,[sp, #0x30]
00b1dc94	ldr x8,[x1]
00b1dc98	mov x20,x1
00b1dc9c	mov x19,x0
00b1dca0	add x1,sp,#0x8
00b1dca4	mov w5,#0x1
00b1dca8	mov x0,xzr
00b1dcac	mov x3,xzr
00b1dcb0	mov x4,xzr
00b1dcb4	add x29,sp,#0x30
00b1dcb8	str x8,[sp, #0x8]
00b1dcbc	bl 0x00b1d214
00b1dcc0	cbz x0,0x00b1dcf8
00b1dcc4	mov x22,x0
00b1dcc8	bl 0x00c3d9e0
00b1dccc	mov x21,x0
00b1dcd0	mov x0,x22
00b1dcd4	bl 0x00c32450
00b1dcd8	cbz x21,0x00b1dcfc
00b1dcdc	ldr x8,[sp, #0x8]
00b1dce0	str x8,[x20]
00b1dce4	cbz x19,0x00b1dcfc
00b1dce8	ldr x0,[x19]
00b1dcec	bl 0x00c3b270
00b1dcf0	str x21,[x19]
00b1dcf4	b 0x00b1dcfc
00b1dcf8	mov x21,xzr
00b1dcfc	mov x0,x21
00b1dd00	ldp x29,x30,[sp, #0x30]
00b1dd04	ldp x20,x19,[sp, #0x20]
00b1dd08	ldp x22,x21,[sp, #0x10]
00b1dd0c	add sp,sp,#0x40
00b1dd10	ret

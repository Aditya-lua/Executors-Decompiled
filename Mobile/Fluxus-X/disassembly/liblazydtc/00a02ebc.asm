; BN_GENCB_new @ 00a02ebc
00a02ebc	stp x29,x30,[sp, #-0x10]!
00a02ec0	adrp x1,0x2b5000
00a02ec4	add x1,x1,#0xa6d
00a02ec8	orr w0,wzr,#0x18
00a02ecc	mov w2,#0x3f2
00a02ed0	mov x29,sp
00a02ed4	bl 0x00c32320
00a02ed8	cbz x0,0x00a02ee4
00a02edc	ldp x29,x30,[sp], #0x10
00a02ee0	ret
00a02ee4	bl 0x00c342a0
00a02ee8	adrp x0,0x2b5000
00a02eec	adrp x2,0x2bf000
00a02ef0	add x0,x0,#0xa6d
00a02ef4	add x2,x2,#0xab3
00a02ef8	mov w1,#0x3f3
00a02efc	bl 0x00c342b0
00a02f00	mov w1,#0x100
00a02f04	orr w0,wzr,#0x3
00a02f08	movk w1,#0xc, LSL #16
00a02f0c	mov x2,xzr
00a02f10	bl 0x00c342c0
00a02f14	mov x0,xzr
00a02f18	ldp x29,x30,[sp], #0x10
00a02f1c	ret

; evp_keymgmt_util_fromdata @ 00a65c8c
00a65c8c	str x23,[sp, #-0x40]!
00a65c90	stp x22,x21,[sp, #0x10]
00a65c94	mov x21,x0
00a65c98	mov x0,x1
00a65c9c	stp x20,x19,[sp, #0x20]
00a65ca0	stp x29,x30,[sp, #0x30]
00a65ca4	add x29,sp,#0x30
00a65ca8	mov x22,x3
00a65cac	mov w23,w2
00a65cb0	mov x20,x1
00a65cb4	bl 0x00c3d210
00a65cb8	mov x19,x0
00a65cbc	cbz x0,0x00a65d30
00a65cc0	mov x0,x20
00a65cc4	mov x1,x19
00a65cc8	mov w2,w23
00a65ccc	mov x3,x22
00a65cd0	bl 0x00c3d3a0
00a65cd4	cbz w0,0x00a65d30
00a65cd8	cbz x21,0x00a65d00
00a65cdc	cbz x20,0x00a65d00
00a65ce0	mov x0,x21
00a65ce4	mov x1,x20
00a65ce8	bl 0x00c3d200
00a65cec	cbz w0,0x00a65d00
00a65cf0	mov x0,x21
00a65cf4	str x19,[x21, #0x68]
00a65cf8	bl 0x00a65640
00a65cfc	b 0x00a65d40
00a65d00	bl 0x00c342a0
00a65d04	adrp x0,0x2cd000
00a65d08	adrp x2,0x2bd000
00a65d0c	add x0,x0,#0xabe
00a65d10	add x2,x2,#0xaf1
00a65d14	mov w1,#0x41
00a65d18	bl 0x00c342b0
00a65d1c	mov w1,#0x103
00a65d20	orr w0,wzr,#0x6
00a65d24	movk w1,#0xc, LSL #16
00a65d28	mov x2,xzr
00a65d2c	bl 0x00c342c0
00a65d30	mov x0,x20
00a65d34	mov x1,x19
00a65d38	bl 0x00c3b730
00a65d3c	mov x19,xzr
00a65d40	mov x0,x19
00a65d44	ldp x29,x30,[sp, #0x30]
00a65d48	ldp x20,x19,[sp, #0x20]
00a65d4c	ldp x22,x21,[sp, #0x10]
00a65d50	ldr x23,[sp], #0x40
00a65d54	ret

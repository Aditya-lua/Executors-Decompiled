; ossl_ec_GFp_simple_point_set_affine_coordinates @ 00a39c58
00a39c58	str x23,[sp, #-0x40]!
00a39c5c	stp x22,x21,[sp, #0x10]
00a39c60	stp x20,x19,[sp, #0x20]
00a39c64	stp x29,x30,[sp, #0x30]
00a39c68	add x29,sp,#0x30
00a39c6c	cbz x2,0x00a39cb8
00a39c70	mov x20,x3
00a39c74	cbz x3,0x00a39cb8
00a39c78	mov x19,x4
00a39c7c	mov x21,x2
00a39c80	mov x22,x1
00a39c84	mov x23,x0
00a39c88	bl 0x00c38de0
00a39c8c	mov x1,x22
00a39c90	mov x2,x21
00a39c94	mov x3,x20
00a39c98	mov x5,x19
00a39c9c	ldp x29,x30,[sp, #0x30]
00a39ca0	ldp x20,x19,[sp, #0x20]
00a39ca4	ldp x22,x21,[sp, #0x10]
00a39ca8	mov x4,x0
00a39cac	mov x0,x23
00a39cb0	ldr x23,[sp], #0x40
00a39cb4	b 0x00c3b070
00a39cb8	bl 0x00c342a0
00a39cbc	adrp x0,0x2c7000
00a39cc0	adrp x2,0x2b7000
00a39cc4	add x0,x0,#0x8a7
00a39cc8	add x2,x2,#0xaf8
00a39ccc	mov w1,#0x1ed
00a39cd0	bl 0x00c342b0
00a39cd4	mov w1,#0x102
00a39cd8	mov w0,#0x10
00a39cdc	movk w1,#0xc, LSL #16
00a39ce0	mov x2,xzr
00a39ce4	bl 0x00c342c0
00a39ce8	ldp x29,x30,[sp, #0x30]
00a39cec	ldp x20,x19,[sp, #0x20]
00a39cf0	ldp x22,x21,[sp, #0x10]
00a39cf4	mov w0,wzr
00a39cf8	ldr x23,[sp], #0x40
00a39cfc	ret

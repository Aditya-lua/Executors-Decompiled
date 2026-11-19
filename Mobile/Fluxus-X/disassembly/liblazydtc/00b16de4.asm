; ASN1_digest @ 00b16de4
00b16de4	str x25,[sp, #-0x50]!
00b16de8	stp x24,x23,[sp, #0x10]
00b16dec	stp x20,x19,[sp, #0x30]
00b16df0	mov x20,x1
00b16df4	mov x24,x0
00b16df8	mov x0,x2
00b16dfc	mov x1,xzr
00b16e00	stp x22,x21,[sp, #0x20]
00b16e04	stp x29,x30,[sp, #0x40]
00b16e08	add x29,sp,#0x40
00b16e0c	mov x19,x4
00b16e10	mov x21,x3
00b16e14	mov x23,x2
00b16e18	blr x24
00b16e1c	cmp w0,#0x0
00b16e20	b.le 0x00b16e90
00b16e24	sxtw x25,w0
00b16e28	adrp x1,0x2a4000
00b16e2c	add x1,x1,#0xb78
00b16e30	mov w2,#0x27
00b16e34	mov x0,x25
00b16e38	bl 0x00c32320
00b16e3c	cbz x0,0x00b16ec0
00b16e40	mov x22,x0
00b16e44	str x0,[sp, #0x8]
00b16e48	add x1,sp,#0x8
00b16e4c	mov x0,x23
00b16e50	blr x24
00b16e54	mov x0,x22
00b16e58	mov x1,x25
00b16e5c	mov x2,x21
00b16e60	mov x3,x19
00b16e64	mov x4,x20
00b16e68	mov x5,xzr
00b16e6c	bl 0x00c370c0
00b16e70	adrp x1,0x2a4000
00b16e74	add x1,x1,#0xb78
00b16e78	cbz w0,0x00b16ef4
00b16e7c	mov w2,#0x32
00b16e80	mov x0,x22
00b16e84	bl 0x00c32310
00b16e88	mov w0,#0x1
00b16e8c	b 0x00b16f04
00b16e90	bl 0x00c342a0
00b16e94	adrp x0,0x2a4000
00b16e98	adrp x2,0x2c0000
00b16e9c	add x0,x0,#0xb78
00b16ea0	add x2,x2,#0x6ee
00b16ea4	mov w1,#0x24
00b16ea8	bl 0x00c342b0
00b16eac	mov w8,#0x100
00b16eb0	movk w8,#0xc, LSL #16
00b16eb4	add w1,w8,#0x3
00b16eb8	mov w0,#0xd
00b16ebc	b 0x00b16ee8
00b16ec0	bl 0x00c342a0
00b16ec4	adrp x0,0x2a4000
00b16ec8	adrp x2,0x2c0000
00b16ecc	add x0,x0,#0xb78
00b16ed0	add x2,x2,#0x6ee
00b16ed4	mov w1,#0x28
00b16ed8	bl 0x00c342b0
00b16edc	mov w1,#0x100
00b16ee0	mov w0,#0xd
00b16ee4	movk w1,#0xc, LSL #16
00b16ee8	mov x2,xzr
00b16eec	bl 0x00c342c0
00b16ef0	b 0x00b16f00
00b16ef4	mov w2,#0x2f
00b16ef8	mov x0,x22
00b16efc	bl 0x00c32310
00b16f00	mov w0,wzr
00b16f04	ldp x29,x30,[sp, #0x40]
00b16f08	ldp x20,x19,[sp, #0x30]
00b16f0c	ldp x22,x21,[sp, #0x20]
00b16f10	ldp x24,x23,[sp, #0x10]
00b16f14	ldr x25,[sp], #0x50
00b16f18	ret

; ASN1_item_i2d_mem_bio @ 00ab9eb4
00ab9eb4	str x21,[sp, #-0x30]!
00ab9eb8	stp x20,x19,[sp, #0x10]
00ab9ebc	stp x29,x30,[sp, #0x20]
00ab9ec0	add x29,sp,#0x20
00ab9ec4	cbz x0,0x00ab9f08
00ab9ec8	mov x20,x1
00ab9ecc	cbz x1,0x00ab9f08
00ab9ed0	mov x21,x0
00ab9ed4	bl 0x00c32280
00ab9ed8	bl 0x00c32240
00ab9edc	mov x19,x0
00ab9ee0	cbz x0,0x00ab9f3c
00ab9ee4	mov x0,x21
00ab9ee8	mov x1,x19
00ab9eec	mov x2,x20
00ab9ef0	bl 0x00ab9dcc
00ab9ef4	cmp w0,#0x0
00ab9ef8	b.gt 0x00ab9f3c
00ab9efc	mov x0,x19
00ab9f00	bl 0x00c31a40
00ab9f04	b 0x00ab9f38
00ab9f08	bl 0x00c342a0
00ab9f0c	adrp x0,0x2d0000
00ab9f10	adrp x2,0x2a2000
00ab9f14	add x0,x0,#0x263
00ab9f18	add x2,x2,#0xb7e
00ab9f1c	mov w1,#0x76
00ab9f20	bl 0x00c342b0
00ab9f24	mov w1,#0x102
00ab9f28	mov w0,#0xd
00ab9f2c	movk w1,#0xc, LSL #16
00ab9f30	mov x2,xzr
00ab9f34	bl 0x00c342c0
00ab9f38	mov x19,xzr
00ab9f3c	mov x0,x19
00ab9f40	ldp x29,x30,[sp, #0x20]
00ab9f44	ldp x20,x19,[sp, #0x10]
00ab9f48	ldr x21,[sp], #0x30
00ab9f4c	ret

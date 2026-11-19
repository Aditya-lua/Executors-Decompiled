; mbedtls_entropy_init @ 00b761dc
00b761dc	str x19,[sp, #-0x20]!
00b761e0	stp x29,x30,[sp, #0x10]
00b761e4	add x29,sp,#0x10
00b761e8	mov x19,x0
00b761ec	add x0,x0,#0x18
00b761f0	mov w2,#0x328
00b761f4	mov w1,wzr
00b761f8	bl 0x00c301c0
00b761fc	mov x0,x19
00b76200	bl 0x00c42840
00b76204	ldrsw x8,[x19, #0x1c]
00b76208	cmp w8,#0x13
00b7620c	b.gt 0x00b7623c
00b76210	adrp x10,0xcb5000
00b76214	ldr x10,[x10, #0xaa0]
00b76218	mov w9,#0x28
00b7621c	mov w11,#0x20
00b76220	mov w12,#0x1
00b76224	add w13,w8,#0x1
00b76228	madd x8,x8,x9,x19
00b7622c	stp x10,xzr,[x8, #0x20]
00b76230	str x11,[x8, #0x38]
00b76234	str w12,[x8, #0x40]
00b76238	str w13,[x19, #0x1c]
00b7623c	ldp x29,x30,[sp, #0x10]
00b76240	ldr x19,[sp], #0x20
00b76244	ret

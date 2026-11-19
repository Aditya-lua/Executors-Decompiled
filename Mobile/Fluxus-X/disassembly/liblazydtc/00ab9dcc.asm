; ASN1_item_i2d_bio @ 00ab9dcc
00ab9dcc	str x21,[sp, #-0x30]!
00ab9dd0	mov x8,x0
00ab9dd4	stp x20,x19,[sp, #0x10]
00ab9dd8	mov x19,x1
00ab9ddc	add x1,sp,#0x8
00ab9de0	mov x0,x2
00ab9de4	mov x2,x8
00ab9de8	stp x29,x30,[sp, #0x20]
00ab9dec	add x29,sp,#0x20
00ab9df0	str xzr,[sp, #0x8]
00ab9df4	bl 0x00c36170
00ab9df8	ldr x1,[sp, #0x8]
00ab9dfc	cbz x1,0x00ab9e50
00ab9e00	mov w20,w0
00ab9e04	mov x0,x19
00ab9e08	mov w2,w20
00ab9e0c	bl 0x00c34240
00ab9e10	cmp w20,w0
00ab9e14	b.eq 0x00ab9e48
00ab9e18	mov w21,wzr
00ab9e1c	cmp w0,#0x1
00ab9e20	b.lt 0x00ab9e88
00ab9e24	ldr x8,[sp, #0x8]
00ab9e28	add w21,w0,w21
00ab9e2c	sub w20,w20,w0
00ab9e30	mov x0,x19
00ab9e34	add x1,x8,w21, SXTW 
00ab9e38	mov w2,w20
00ab9e3c	bl 0x00c34240
00ab9e40	cmp w20,w0
00ab9e44	b.ne 0x00ab9e1c
00ab9e48	mov w19,#0x1
00ab9e4c	b 0x00ab9e8c
00ab9e50	bl 0x00c342a0
00ab9e54	adrp x0,0x2d0000
00ab9e58	adrp x2,0x2ba000
00ab9e5c	add x0,x0,#0x263
00ab9e60	add x2,x2,#0x628
00ab9e64	mov w1,#0x5e
00ab9e68	bl 0x00c342b0
00ab9e6c	mov w1,#0x100
00ab9e70	mov w0,#0xd
00ab9e74	movk w1,#0xc, LSL #16
00ab9e78	mov x2,xzr
00ab9e7c	bl 0x00c342c0
00ab9e80	mov w19,wzr
00ab9e84	b 0x00ab9ea0
00ab9e88	mov w19,wzr
00ab9e8c	ldr x0,[sp, #0x8]
00ab9e90	adrp x1,0x2d0000
00ab9e94	add x1,x1,#0x263
00ab9e98	mov w2,#0x6d
00ab9e9c	bl 0x00c32310
00ab9ea0	mov w0,w19
00ab9ea4	ldp x29,x30,[sp, #0x20]
00ab9ea8	ldp x20,x19,[sp, #0x10]
00ab9eac	ldr x21,[sp], #0x30
00ab9eb0	ret

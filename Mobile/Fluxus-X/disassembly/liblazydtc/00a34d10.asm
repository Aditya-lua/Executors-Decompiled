; EC_POINT_point2buf @ 00a34d10
00a34d10	str x25,[sp, #-0x50]!
00a34d14	stp x20,x19,[sp, #0x30]
00a34d18	mov x20,x4
00a34d1c	mov x19,x3
00a34d20	mov x3,xzr
00a34d24	mov x4,xzr
00a34d28	mov x5,xzr
00a34d2c	stp x24,x23,[sp, #0x10]
00a34d30	stp x22,x21,[sp, #0x20]
00a34d34	stp x29,x30,[sp, #0x40]
00a34d38	add x29,sp,#0x40
00a34d3c	mov w21,w2
00a34d40	mov x22,x1
00a34d44	mov x23,x0
00a34d48	bl 0x00a34b70
00a34d4c	cbz x0,0x00a34de0
00a34d50	adrp x1,0x2bd000
00a34d54	add x1,x1,#0x968
00a34d58	mov w2,#0x8f
00a34d5c	mov x25,x0
00a34d60	bl 0x00c32320
00a34d64	cbz x0,0x00a34d94
00a34d68	mov x24,x0
00a34d6c	mov x0,x23
00a34d70	mov x1,x22
00a34d74	mov w2,w21
00a34d78	mov x3,x24
00a34d7c	mov x4,x25
00a34d80	mov x5,x20
00a34d84	bl 0x00a34b70
00a34d88	cbz x0,0x00a34dc8
00a34d8c	str x24,[x19]
00a34d90	b 0x00a34de0
00a34d94	bl 0x00c342a0
00a34d98	adrp x0,0x2bd000
00a34d9c	adrp x2,0x2b5000
00a34da0	add x0,x0,#0x968
00a34da4	add x2,x2,#0xbc7
00a34da8	mov w1,#0x90
00a34dac	bl 0x00c342b0
00a34db0	mov w1,#0x100
00a34db4	mov w0,#0x10
00a34db8	movk w1,#0xc, LSL #16
00a34dbc	mov x2,xzr
00a34dc0	bl 0x00c342c0
00a34dc4	b 0x00a34ddc
00a34dc8	adrp x1,0x2bd000
00a34dcc	add x1,x1,#0x968
00a34dd0	mov w2,#0x95
00a34dd4	mov x0,x24
00a34dd8	bl 0x00c32310
00a34ddc	mov x0,xzr
00a34de0	ldp x29,x30,[sp, #0x40]
00a34de4	ldp x20,x19,[sp, #0x30]
00a34de8	ldp x22,x21,[sp, #0x20]
00a34dec	ldp x24,x23,[sp, #0x10]
00a34df0	ldr x25,[sp], #0x50
00a34df4	ret

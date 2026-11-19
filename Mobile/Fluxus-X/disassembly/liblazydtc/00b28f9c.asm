; FUN_00b28f9c @ 00b28f9c
00b28f9c	stp x20,x19,[sp, #-0x20]!
00b28fa0	stp x29,x30,[sp, #0x10]
00b28fa4	add x29,sp,#0x10
00b28fa8	mov x19,x0
00b28fac	bl 0x00c41000
00b28fb0	cbz w0,0x00b29000
00b28fb4	adrp x1,0x2d4000
00b28fb8	add x1,x1,#0x775
00b28fbc	mov w0,#0x1d8
00b28fc0	mov w2,#0x34
00b28fc4	bl 0x00c34250
00b28fc8	mov x20,x0
00b28fcc	cbz x0,0x00b29004
00b28fd0	mov w0,#0x100
00b28fd4	bl 0x00c414a0
00b28fd8	mov x6,x0
00b28fdc	mov w1,#0x100
00b28fe0	mov w2,#0x80
00b28fe4	mov w4,#0x1
00b28fe8	mov x0,x20
00b28fec	mov x3,xzr
00b28ff0	mov x5,xzr
00b28ff4	mov x7,x19
00b28ff8	bl 0x00c41280
00b28ffc	b 0x00b29004
00b29000	mov x20,xzr
00b29004	ldp x29,x30,[sp, #0x10]
00b29008	mov x0,x20
00b2900c	ldp x20,x19,[sp], #0x20
00b29010	ret

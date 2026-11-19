; FUN_00b4e36c @ 00b4e36c
00b4e36c	stp x22,x21,[sp, #-0x30]!
00b4e370	stp x20,x19,[sp, #0x10]
00b4e374	stp x29,x30,[sp, #0x20]
00b4e378	add x29,sp,#0x20
00b4e37c	mov x19,x2
00b4e380	mov w21,w1
00b4e384	bl 0x00c41210
00b4e388	mov x22,x0
00b4e38c	bl 0x00c41000
00b4e390	mov w8,#0x87
00b4e394	tst w21,w8
00b4e398	mov x20,xzr
00b4e39c	b.eq 0x00b4e3f0
00b4e3a0	cbz w0,0x00b4e3f0
00b4e3a4	adrp x1,0x2c6000
00b4e3a8	add x1,x1,#0x737
00b4e3ac	mov w0,#0x88
00b4e3b0	mov w2,#0x3eb
00b4e3b4	bl 0x00c34250
00b4e3b8	mov x20,x0
00b4e3bc	cbz x0,0x00b4e3f0
00b4e3c0	mov x0,x20
00b4e3c4	mov x1,x19
00b4e3c8	str x22,[x20]
00b4e3cc	stp w21,wzr,[x20, #0x78]
00b4e3d0	bl 0x00b4e498
00b4e3d4	cbnz w0,0x00b4e3f0
00b4e3d8	adrp x1,0x2c6000
00b4e3dc	add x1,x1,#0x737
00b4e3e0	orr w2,wzr,#0x3f0
00b4e3e4	mov x0,x20
00b4e3e8	bl 0x00c32310
00b4e3ec	mov x20,xzr
00b4e3f0	mov x0,x20
00b4e3f4	ldp x29,x30,[sp, #0x20]
00b4e3f8	ldp x20,x19,[sp, #0x10]
00b4e3fc	ldp x22,x21,[sp], #0x30
00b4e400	ret

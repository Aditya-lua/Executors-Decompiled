; FUN_00b4f1f0 @ 00b4f1f0
00b4f1f0	stp x22,x21,[sp, #-0x30]!
00b4f1f4	stp x20,x19,[sp, #0x10]
00b4f1f8	stp x29,x30,[sp, #0x20]
00b4f1fc	add x29,sp,#0x20
00b4f200	mov x20,x2
00b4f204	mov w21,w1
00b4f208	bl 0x00c41210
00b4f20c	mov x22,x0
00b4f210	bl 0x00c41000
00b4f214	mov w8,#0x87
00b4f218	tst w21,w8
00b4f21c	mov x19,xzr
00b4f220	b.eq 0x00b4f2d8
00b4f224	cbz w0,0x00b4f2d8
00b4f228	adrp x1,0x2c6000
00b4f22c	add x1,x1,#0x737
00b4f230	mov w0,#0x88
00b4f234	mov w2,#0x3eb
00b4f238	bl 0x00c34250
00b4f23c	mov x19,x0
00b4f240	cbz x0,0x00b4f2d8
00b4f244	mov x0,x19
00b4f248	mov x1,x20
00b4f24c	str x22,[x19]
00b4f250	stp w21,wzr,[x19, #0x78]
00b4f254	bl 0x00b4e498
00b4f258	cbz w0,0x00b4f2c0
00b4f25c	ldr x8,[x19, #0x8]
00b4f260	cbnz x8,0x00b4f2d8
00b4f264	adrp x0,0x2d8000
00b4f268	adrp x1,0x2c6000
00b4f26c	add x0,x0,#0x541
00b4f270	add x1,x1,#0x737
00b4f274	mov w2,#0x401
00b4f278	bl 0x00c34600
00b4f27c	str x0,[x19, #0x8]
00b4f280	cbnz x0,0x00b4f2d8
00b4f284	bl 0x00c342a0
00b4f288	adrp x0,0x2c6000
00b4f28c	adrp x2,0x2b4000
00b4f290	add x0,x0,#0x737
00b4f294	add x2,x2,#0xea3
00b4f298	mov w1,#0x403
00b4f29c	bl 0x00c342b0
00b4f2a0	mov w1,#0x100
00b4f2a4	mov w0,#0x39
00b4f2a8	movk w1,#0xc, LSL #16
00b4f2ac	mov x2,xzr
00b4f2b0	bl 0x00c342c0
00b4f2b4	mov x0,x19
00b4f2b8	bl 0x00b4ea10
00b4f2bc	b 0x00b4f2d4
00b4f2c0	adrp x1,0x2c6000
00b4f2c4	add x1,x1,#0x737
00b4f2c8	orr w2,wzr,#0x3f0
00b4f2cc	mov x0,x19
00b4f2d0	bl 0x00c32310
00b4f2d4	mov x19,xzr
00b4f2d8	mov x0,x19
00b4f2dc	ldp x29,x30,[sp, #0x20]
00b4f2e0	ldp x20,x19,[sp, #0x10]
00b4f2e4	ldp x22,x21,[sp], #0x30
00b4f2e8	ret

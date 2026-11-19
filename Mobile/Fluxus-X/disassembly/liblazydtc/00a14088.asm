; SCT_set1_signature @ 00a14088
00a14088	stp x22,x21,[sp, #-0x30]!
00a1408c	stp x20,x19,[sp, #0x10]
00a14090	stp x29,x30,[sp, #0x20]
00a14094	mov x22,x0
00a14098	mov x20,x0
00a1409c	ldr x0,[x22, #0x48]!
00a140a0	mov x21,x1
00a140a4	adrp x1,0x2a7000
00a140a8	mov x19,x2
00a140ac	add x1,x1,#0xdc3
00a140b0	mov w2,#0xb3
00a140b4	add x29,sp,#0x20
00a140b8	bl 0x00c32310
00a140bc	mov w0,#0x1
00a140c0	str wzr,[x22, #0x18]
00a140c4	stp xzr,xzr,[x22]
00a140c8	cbz x21,0x00a14130
00a140cc	cbz x19,0x00a14130
00a140d0	adrp x2,0x2a7000
00a140d4	add x2,x2,#0xdc3
00a140d8	mov w3,#0xb9
00a140dc	mov x0,x21
00a140e0	mov x1,x19
00a140e4	bl 0x00c345f0
00a140e8	str x0,[x22]
00a140ec	cbz x0,0x00a140fc
00a140f0	mov w0,#0x1
00a140f4	str x19,[x20, #0x50]
00a140f8	b 0x00a14130
00a140fc	bl 0x00c342a0
00a14100	adrp x0,0x2a7000
00a14104	adrp x2,0x2c5000
00a14108	add x0,x0,#0xdc3
00a1410c	add x2,x2,#0x823
00a14110	mov w1,#0xbb
00a14114	bl 0x00c342b0
00a14118	mov w1,#0x100
00a1411c	mov w0,#0x32
00a14120	movk w1,#0xc, LSL #16
00a14124	mov x2,xzr
00a14128	bl 0x00c342c0
00a1412c	mov w0,wzr
00a14130	ldp x29,x30,[sp, #0x20]
00a14134	ldp x20,x19,[sp, #0x10]
00a14138	ldp x22,x21,[sp], #0x30
00a1413c	ret

; OBJ_sn2nid @ 00aae4c0
00aae4c0	sub sp,sp,#0x60
00aae4c4	stp x20,x19,[sp, #0x40]
00aae4c8	mov x19,x0
00aae4cc	add x20,sp,#0x18
00aae4d0	mov w0,#0x40
00aae4d4	mov x1,xzr
00aae4d8	stp x29,x30,[sp, #0x50]
00aae4dc	add x29,sp,#0x50
00aae4e0	str x20,[sp, #0x10]
00aae4e4	bl 0x00c35500
00aae4e8	adrp x8,0xd22000
00aae4ec	ldr x0,[x8, #0x188]
00aae4f0	str x19,[sp, #0x18]
00aae4f4	cbz x0,0x00aae518
00aae4f8	mov w8,#0x1
00aae4fc	mov x1,sp
00aae500	str w8,[sp]
00aae504	str x20,[sp, #0x8]
00aae508	bl 0x00c34de0
00aae50c	cbz x0,0x00aae518
00aae510	ldr x8,[x0, #0x8]
00aae514	b 0x00aae554
00aae518	adrp x1,0x770000
00aae51c	adrp x4,0xaaf000
00aae520	add x1,x1,#0xef8
00aae524	add x4,x4,#0xa8
00aae528	add x0,sp,#0x10
00aae52c	mov w2,#0x4d7
00aae530	mov w3,#0x4
00aae534	mov w5,wzr
00aae538	bl 0x00c3de50
00aae53c	cbz x0,0x00aae558
00aae540	ldr w8,[x0]
00aae544	adrp x10,0xc6d000
00aae548	mov w9,#0x28
00aae54c	add x10,x10,#0xa58
00aae550	madd x8,x8,x9,x10
00aae554	ldr w0,[x8, #0x10]!
00aae558	ldp x29,x30,[sp, #0x50]
00aae55c	ldp x20,x19,[sp, #0x40]
00aae560	add sp,sp,#0x60
00aae564	ret

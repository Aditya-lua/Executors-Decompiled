; OBJ_ln2nid @ 00aae568
00aae568	sub sp,sp,#0x60
00aae56c	stp x20,x19,[sp, #0x40]
00aae570	mov x19,x0
00aae574	add x20,sp,#0x18
00aae578	mov w0,#0x40
00aae57c	mov x1,xzr
00aae580	stp x29,x30,[sp, #0x50]
00aae584	add x29,sp,#0x50
00aae588	str x20,[sp, #0x10]
00aae58c	bl 0x00c35500
00aae590	adrp x8,0xd22000
00aae594	ldr x0,[x8, #0x188]
00aae598	str x19,[sp, #0x20]
00aae59c	cbz x0,0x00aae5c0
00aae5a0	mov w8,#0x2
00aae5a4	mov x1,sp
00aae5a8	str w8,[sp]
00aae5ac	str x20,[sp, #0x8]
00aae5b0	bl 0x00c34de0
00aae5b4	cbz x0,0x00aae5c0
00aae5b8	ldr x8,[x0, #0x8]
00aae5bc	b 0x00aae5fc
00aae5c0	adrp x1,0x76f000
00aae5c4	adrp x4,0xaaf000
00aae5c8	add x1,x1,#0xb9c
00aae5cc	add x4,x4,#0x80
00aae5d0	add x0,sp,#0x10
00aae5d4	mov w2,#0x4d7
00aae5d8	mov w3,#0x4
00aae5dc	mov w5,wzr
00aae5e0	bl 0x00c3de50
00aae5e4	cbz x0,0x00aae600
00aae5e8	ldr w8,[x0]
00aae5ec	adrp x10,0xc6d000
00aae5f0	mov w9,#0x28
00aae5f4	add x10,x10,#0xa58
00aae5f8	madd x8,x8,x9,x10
00aae5fc	ldr w0,[x8, #0x10]!
00aae600	ldp x29,x30,[sp, #0x50]
00aae604	ldp x20,x19,[sp, #0x40]
00aae608	add sp,sp,#0x60
00aae60c	ret

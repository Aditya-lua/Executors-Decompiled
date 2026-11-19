; FUN_00b5f234 @ 00b5f234
00b5f234	stp x22,x21,[sp, #-0x30]!
00b5f238	stp x20,x19,[sp, #0x10]
00b5f23c	stp x29,x30,[sp, #0x20]
00b5f240	add x29,sp,#0x20
00b5f244	mov x19,x3
00b5f248	mov x20,x2
00b5f24c	mov x21,x1
00b5f250	mov x22,x0
00b5f254	bl 0x00c41000
00b5f258	cbz w0,0x00b5f280
00b5f25c	mov x2,x20
00b5f260	mov x3,x19
00b5f264	ldp x29,x30,[sp, #0x20]
00b5f268	ldp x20,x19,[sp, #0x10]
00b5f26c	mov w4,#0x20
00b5f270	mov x0,x22
00b5f274	mov x1,x21
00b5f278	ldp x22,x21,[sp], #0x30
00b5f27c	b 0x00b60790
00b5f280	ldp x29,x30,[sp, #0x20]
00b5f284	ldp x20,x19,[sp, #0x10]
00b5f288	ldp x22,x21,[sp], #0x30
00b5f28c	ret

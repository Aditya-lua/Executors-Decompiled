; EC_GROUP_get_cofactor @ 00a30e30
00a30e30	str x19,[sp, #-0x20]!
00a30e34	stp x29,x30,[sp, #0x10]
00a30e38	ldr x8,[x0, #0x18]
00a30e3c	add x29,sp,#0x10
00a30e40	cbz x8,0x00a30e6c
00a30e44	mov x19,x0
00a30e48	mov x0,x1
00a30e4c	mov x1,x8
00a30e50	bl 0x00c36990
00a30e54	cbz x0,0x00a30e70
00a30e58	ldr x0,[x19, #0x18]
00a30e5c	bl 0x00c369b0
00a30e60	cmp w0,#0x0
00a30e64	cset w0,eq
00a30e68	b 0x00a30e70
00a30e6c	mov w0,wzr
00a30e70	ldp x29,x30,[sp, #0x10]
00a30e74	ldr x19,[sp], #0x20
00a30e78	ret

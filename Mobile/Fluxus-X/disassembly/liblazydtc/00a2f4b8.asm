; EC_KEY_set_public_key @ 00a2f4b8
00a2f4b8	stp x20,x19,[sp, #-0x20]!
00a2f4bc	stp x29,x30,[sp, #0x10]
00a2f4c0	ldr x8,[x0]
00a2f4c4	mov x19,x0
00a2f4c8	mov x20,x1
00a2f4cc	add x29,sp,#0x10
00a2f4d0	ldr x8,[x8, #0x38]
00a2f4d4	cbz x8,0x00a2f4e8
00a2f4d8	mov x0,x19
00a2f4dc	mov x1,x20
00a2f4e0	blr x8
00a2f4e4	cbz w0,0x00a2f514
00a2f4e8	ldr x0,[x19, #0x20]
00a2f4ec	bl 0x00c3ab60
00a2f4f0	ldr x1,[x19, #0x18]
00a2f4f4	mov x0,x20
00a2f4f8	bl 0x00c3afb0
00a2f4fc	ldr x8,[x19, #0x68]
00a2f500	cmp x0,#0x0
00a2f504	str x0,[x19, #0x20]
00a2f508	cset w0,ne
00a2f50c	add x8,x8,#0x1
00a2f510	str x8,[x19, #0x68]
00a2f514	ldp x29,x30,[sp, #0x10]
00a2f518	ldp x20,x19,[sp], #0x20
00a2f51c	ret

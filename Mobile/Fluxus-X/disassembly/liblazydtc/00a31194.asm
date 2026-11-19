; EC_GROUP_get_degree @ 00a31194
00a31194	ldr x8,[x0]
00a31198	ldr x1,[x8, #0x38]
00a3119c	cbz x1,0x00a311a4
00a311a0	br x1
00a311a4	stp x29,x30,[sp, #-0x10]!
00a311a8	mov x29,sp
00a311ac	bl 0x00c342a0
00a311b0	adrp x0,0x29e000
00a311b4	adrp x2,0x2b2000
00a311b8	add x0,x0,#0xa7
00a311bc	add x2,x2,#0x165
00a311c0	mov w1,#0x25e
00a311c4	bl 0x00c342b0
00a311c8	mov w1,#0x101
00a311cc	mov w0,#0x10
00a311d0	movk w1,#0xc, LSL #16
00a311d4	mov x2,xzr
00a311d8	bl 0x00c342c0
00a311dc	mov w0,wzr
00a311e0	ldp x29,x30,[sp], #0x10
00a311e4	ret

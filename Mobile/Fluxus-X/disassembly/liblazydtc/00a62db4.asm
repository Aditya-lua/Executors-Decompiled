; FUN_00a62db4 @ 00a62db4
00a62db4	stp x22,x21,[sp, #-0x30]!
00a62db8	stp x20,x19,[sp, #0x10]
00a62dbc	stp x29,x30,[sp, #0x20]
00a62dc0	ldr x20,[x1, #0x10]
00a62dc4	mov x21,x0
00a62dc8	add x29,sp,#0x20
00a62dcc	mov x19,x1
00a62dd0	mov x0,x20
00a62dd4	bl 0x00c3b840
00a62dd8	mov x22,x0
00a62ddc	mov x0,x20
00a62de0	bl 0x00c3b850
00a62de4	ldr x8,[x22, #0x78]
00a62de8	ldr w1,[x19, #0x8]
00a62dec	mov x2,x21
00a62df0	blr x8
00a62df4	str x0,[x19, #0x20]
00a62df8	ldp x29,x30,[sp, #0x20]
00a62dfc	ldp x20,x19,[sp, #0x10]
00a62e00	cmp x0,#0x0
00a62e04	cset w8,ne
00a62e08	mov w0,w8
00a62e0c	ldp x22,x21,[sp], #0x30
00a62e10	ret

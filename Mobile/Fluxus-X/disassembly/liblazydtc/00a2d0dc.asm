; BN_GF2m_arr2poly @ 00a2d0dc
00a2d0dc	stp x20,x19,[sp, #-0x20]!
00a2d0e0	mov x20,x0
00a2d0e4	mov x0,x1
00a2d0e8	stp x29,x30,[sp, #0x10]
00a2d0ec	add x29,sp,#0x10
00a2d0f0	mov x19,x1
00a2d0f4	bl 0x00c38e00
00a2d0f8	ldr w1,[x20]
00a2d0fc	cmn w1,#0x1
00a2d100	b.eq 0x00a2d120
00a2d104	add x20,x20,#0x4
00a2d108	mov x0,x19
00a2d10c	bl 0x00c38db0
00a2d110	cbz w0,0x00a2d124
00a2d114	ldr w1,[x20], #0x4
00a2d118	cmn w1,#0x1
00a2d11c	b.ne 0x00a2d108
00a2d120	mov w0,#0x1
00a2d124	ldp x29,x30,[sp, #0x10]
00a2d128	ldp x20,x19,[sp], #0x20
00a2d12c	ret

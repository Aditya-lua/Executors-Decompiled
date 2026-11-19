; EC_GROUP_get_order @ 00a30dd0
00a30dd0	str x19,[sp, #-0x20]!
00a30dd4	stp x29,x30,[sp, #0x10]
00a30dd8	ldr x8,[x0, #0x10]
00a30ddc	add x29,sp,#0x10
00a30de0	cbz x8,0x00a30e0c
00a30de4	mov x19,x1
00a30de8	mov x0,x1
00a30dec	mov x1,x8
00a30df0	bl 0x00c36990
00a30df4	cbz x0,0x00a30e10
00a30df8	mov x0,x19
00a30dfc	bl 0x00c369b0
00a30e00	cmp w0,#0x0
00a30e04	cset w0,eq
00a30e08	b 0x00a30e10
00a30e0c	mov w0,wzr
00a30e10	ldp x29,x30,[sp, #0x10]
00a30e14	ldr x19,[sp], #0x20
00a30e18	ret

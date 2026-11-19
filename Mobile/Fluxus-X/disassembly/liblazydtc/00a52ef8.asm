; engine_table_cleanup @ 00a52ef8
00a52ef8	stp x20,x19,[sp, #-0x20]!
00a52efc	stp x29,x30,[sp, #0x10]
00a52f00	adrp x20,0xcb5000
00a52f04	ldr x20,[x20, #0x5d8]
00a52f08	mov x19,x0
00a52f0c	add x29,sp,#0x10
00a52f10	ldr x8,[x20]
00a52f14	mov x0,x8
00a52f18	bl 0x00c356a0
00a52f1c	cbz w0,0x00a52f50
00a52f20	ldr x0,[x19]
00a52f24	cbz x0,0x00a52f40
00a52f28	adrp x1,0xa52000
00a52f2c	add x1,x1,#0xf5c
00a52f30	bl 0x00c395e0
00a52f34	ldr x0,[x19]
00a52f38	bl 0x00c34db0
00a52f3c	str xzr,[x19]
00a52f40	ldr x0,[x20]
00a52f44	ldp x29,x30,[sp, #0x10]
00a52f48	ldp x20,x19,[sp], #0x20
00a52f4c	b 0x00c35690
00a52f50	ldp x29,x30,[sp, #0x10]
00a52f54	ldp x20,x19,[sp], #0x20
00a52f58	ret

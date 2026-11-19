; FUN_00935d48 @ 00935d48
00935d48	stp x22,x21,[sp, #-0x30]!
00935d4c	stp x20,x19,[sp, #0x10]
00935d50	stp x29,x30,[sp, #0x20]
00935d54	add x29,sp,#0x20
00935d58	adrp x8,0xcc4000
00935d5c	add x8,x8,#0x690
00935d60	mov x19,x0
00935d64	mov w0,#0x1
00935d68	mov w1,#0x20
00935d6c	ldr x8,[x8]
00935d70	blr x8
00935d74	mov x20,x0
00935d78	cbz x0,0x00935dec
00935d7c	adrp x8,0xc4f000
00935d80	add x8,x8,#0xaf8
00935d84	mov w9,#0x4
00935d88	str x20,[x20, #0x10]
00935d8c	str x8,[x20]
00935d90	str w9,[x20, #0x18]
00935d94	ldr x21,[x19, #0x138]
00935d98	cbz x21,0x00935dd4
00935d9c	adrp x22,0xcc4000
00935da0	add x22,x22,#0x678
00935da4	ldr x8,[x21, #0x8]
00935da8	mov x0,x19
00935dac	mov x1,x21
00935db0	str x8,[x19, #0x138]
00935db4	ldr x8,[x21]
00935db8	ldr x8,[x8, #0x18]
00935dbc	blr x8
00935dc0	ldr x8,[x22]
00935dc4	mov x0,x21
00935dc8	blr x8
00935dcc	ldr x21,[x19, #0x138]
00935dd0	cbnz x21,0x00935da4
00935dd4	mov x0,x19
00935dd8	mov x1,x20
00935ddc	ldp x29,x30,[sp, #0x20]
00935de0	ldp x20,x19,[sp, #0x10]
00935de4	ldp x22,x21,[sp], #0x30
00935de8	b 0x00935924
00935dec	adrp x8,0xcc4000
00935df0	add x8,x8,#0x678
00935df4	ldr x8,[x8]
00935df8	blr x8
00935dfc	ldp x29,x30,[sp, #0x20]
00935e00	ldp x20,x19,[sp, #0x10]
00935e04	mov w0,#0x1b
00935e08	ldp x22,x21,[sp], #0x30
00935e0c	ret

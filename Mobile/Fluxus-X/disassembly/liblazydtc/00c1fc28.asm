; FUN_00c1fc28 @ 00c1fc28
00c1fc28	paciasp
00c1fc2c	stp x29,x30,[sp, #-0x30]!
00c1fc30	str x21,[sp, #0x10]
00c1fc34	stp x20,x19,[sp, #0x20]
00c1fc38	mov x29,sp
00c1fc3c	ldp x9,x10,[x1, #0x8]
00c1fc40	mov x19,x1
00c1fc44	ldr x8,[x1]
00c1fc48	mov x21,x0
00c1fc4c	add x11,x9,#0x2
00c1fc50	cmp x11,x10
00c1fc54	b.ls 0x00c1fc84
00c1fc58	lsl x10,x10,#0x1
00c1fc5c	add x9,x9,#0x3e2
00c1fc60	mov x0,x8
00c1fc64	cmp x10,x9
00c1fc68	csel x1,x10,x9,hi
00c1fc6c	str x1,[x19, #0x10]
00c1fc70	bl 0x00c30950
00c1fc74	str x0,[x19]
00c1fc78	cbz x0,0x00c1fd0c
00c1fc7c	ldr x9,[x19, #0x8]
00c1fc80	mov x8,x0
00c1fc84	mov w10,#0x7066
00c1fc88	strh w10,[x8, x9#0x0]
00c1fc8c	ldr x8,[x19, #0x8]
00c1fc90	add x8,x8,#0x2
00c1fc94	str x8,[x19, #0x8]
00c1fc98	ldr x20,[x21, #0x18]
00c1fc9c	cbz x20,0x00c1fcf8
00c1fca0	ldr x10,[x19, #0x10]
00c1fca4	add x9,x8,x20
00c1fca8	ldr x21,[x21, #0x10]
00c1fcac	ldr x0,[x19]
00c1fcb0	cmp x9,x10
00c1fcb4	b.ls 0x00c1fcdc
00c1fcb8	lsl x8,x10,#0x1
00c1fcbc	add x9,x9,#0x3e0
00c1fcc0	cmp x8,x9
00c1fcc4	csel x1,x8,x9,hi
00c1fcc8	str x1,[x19, #0x10]
00c1fccc	bl 0x00c30950
00c1fcd0	str x0,[x19]
00c1fcd4	cbz x0,0x00c1fd10
00c1fcd8	ldr x8,[x19, #0x8]
00c1fcdc	add x0,x0,x8
00c1fce0	mov x1,x21
00c1fce4	mov x2,x20
00c1fce8	bl 0x00c2ffd0
00c1fcec	ldr x8,[x19, #0x8]
00c1fcf0	add x8,x8,x20
00c1fcf4	str x8,[x19, #0x8]
00c1fcf8	ldp x20,x19,[sp, #0x20]
00c1fcfc	ldr x21,[sp, #0x10]
00c1fd00	ldp x29,x30,[sp], #0x30
00c1fd04	autiasp
00c1fd08	ret
00c1fd0c	bl 0x00c30b40
00c1fd10	bl 0x00c30b40

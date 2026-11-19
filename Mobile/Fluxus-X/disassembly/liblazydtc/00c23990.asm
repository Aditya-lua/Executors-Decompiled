; FUN_00c23990 @ 00c23990
00c23990	paciasp
00c23994	stp x29,x30,[sp, #-0x30]!
00c23998	str x21,[sp, #0x10]
00c2399c	stp x20,x19,[sp, #0x20]
00c239a0	mov x29,sp
00c239a4	ldr x21,[x0, #0x10]
00c239a8	mov x20,x0
00c239ac	mov x19,x1
00c239b0	ldr x8,[x21]
00c239b4	mov x0,x21
00c239b8	ldr x8,[x8, #0x20]
00c239bc	blr x8
00c239c0	ldurh w8,[x21, #0x9]
00c239c4	and w8,w8,#0xc0
00c239c8	cmp w8,#0x40
00c239cc	b.eq 0x00c239e4
00c239d0	ldr x8,[x21]
00c239d4	mov x0,x21
00c239d8	mov x1,x19
00c239dc	ldr x8,[x8, #0x28]
00c239e0	blr x8
00c239e4	ldp x8,x9,[x19, #0x8]
00c239e8	ldr x0,[x19]
00c239ec	add x10,x8,#0x2
00c239f0	cmp x10,x9
00c239f4	b.ls 0x00c23a1c
00c239f8	lsl x9,x9,#0x1
00c239fc	add x8,x8,#0x3e2
00c23a00	cmp x9,x8
00c23a04	csel x1,x9,x8,hi
00c23a08	str x1,[x19, #0x10]
00c23a0c	bl 0x00c30950
00c23a10	str x0,[x19]
00c23a14	cbz x0,0x00c23a90
00c23a18	ldr x8,[x19, #0x8]
00c23a1c	mov w9,#0x3a3a
00c23a20	strh w9,[x0, x8#0x0]
00c23a24	mov x1,x19
00c23a28	ldr x8,[x19, #0x8]
00c23a2c	ldr x20,[x20, #0x18]
00c23a30	add x8,x8,#0x2
00c23a34	ldr x9,[x20]
00c23a38	mov x0,x20
00c23a3c	str x8,[x19, #0x8]
00c23a40	ldr x8,[x9, #0x20]
00c23a44	blr x8
00c23a48	ldurh w8,[x20, #0x9]
00c23a4c	and w8,w8,#0xc0
00c23a50	cmp w8,#0x40
00c23a54	b.ne 0x00c23a6c
00c23a58	ldp x20,x19,[sp, #0x20]
00c23a5c	ldr x21,[sp, #0x10]
00c23a60	ldp x29,x30,[sp], #0x30
00c23a64	autiasp
00c23a68	ret
00c23a6c	ldr x8,[x20]
00c23a70	mov x0,x20
00c23a74	ldr x16,[x8, #0x28]
00c23a78	mov x1,x19
00c23a7c	ldp x20,x19,[sp, #0x20]
00c23a80	ldr x21,[sp, #0x10]
00c23a84	ldp x29,x30,[sp], #0x30
00c23a88	autiasp
00c23a8c	br x16
00c23a90	bl 0x00c30b40

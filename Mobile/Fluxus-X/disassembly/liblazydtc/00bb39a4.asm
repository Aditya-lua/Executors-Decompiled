; ZSTD_createDDict_advanced @ 00bb39a4
00bb39a4	ldp x8,x9,[x4]
00bb39a8	cmp x8,#0x0
00bb39ac	cset w10,eq
00bb39b0	cmp x9,#0x0
00bb39b4	cset w9,eq
00bb39b8	eor w9,w10,w9
00bb39bc	tbz w9,#0x0,0x00bb39c8
00bb39c0	mov x0,xzr
00bb39c4	ret
00bb39c8	stp x29,x30,[sp, #-0x40]!
00bb39cc	str x23,[sp, #0x10]
00bb39d0	stp x22,x21,[sp, #0x20]
00bb39d4	stp x20,x19,[sp, #0x30]
00bb39d8	mov x29,sp
00bb39dc	mov x22,x4
00bb39e0	mov w19,w3
00bb39e4	mov w20,w2
00bb39e8	mov x21,x1
00bb39ec	mov x23,x0
00bb39f0	cbz x8,0x00bb3a08
00bb39f4	ldr x0,[x22, #0x10]
00bb39f8	mov w1,#0x6ad8
00bb39fc	blr x8
00bb3a00	cbnz x0,0x00bb3a14
00bb3a04	b 0x00bb3a94
00bb3a08	mov w0,#0x6ad8
00bb3a0c	bl 0x00c308d0
00bb3a10	cbz x0,0x00bb3a94
00bb3a14	ldr x8,[x22, #0x10]
00bb3a18	ldr q0,[x22]
00bb3a1c	mov x1,x23
00bb3a20	mov x2,x21
00bb3a24	mov w3,w20
00bb3a28	mov w4,w19
00bb3a2c	str x8,[x0, #0x6ad0]
00bb3a30	mov x22,x0
00bb3a34	str q0,[x0, #0x6ac0]
00bb3a38	bl 0x00bb3aa8
00bb3a3c	cmn x0,#0x77
00bb3a40	b.cs 0x00bb3a4c
00bb3a44	mov x0,x22
00bb3a48	b 0x00bb3a94
00bb3a4c	ldr x1,[x22]
00bb3a50	ldr x20,[x22, #0x6ac8]
00bb3a54	ldr x19,[x22, #0x6ad0]
00bb3a58	cbz x1,0x00bb3a6c
00bb3a5c	cbz x20,0x00bb3a80
00bb3a60	mov x0,x19
00bb3a64	blr x20
00bb3a68	b 0x00bb3a70
00bb3a6c	cbz x20,0x00bb3a88
00bb3a70	mov x0,x19
00bb3a74	mov x1,x22
00bb3a78	blr x20
00bb3a7c	b 0x00bb3a90
00bb3a80	mov x0,x1
00bb3a84	bl 0x00c30960
00bb3a88	mov x0,x22
00bb3a8c	bl 0x00c30960
00bb3a90	mov x0,xzr
00bb3a94	ldp x20,x19,[sp, #0x30]
00bb3a98	ldr x23,[sp, #0x10]
00bb3a9c	ldp x22,x21,[sp, #0x20]
00bb3aa0	ldp x29,x30,[sp], #0x40
00bb3aa4	ret

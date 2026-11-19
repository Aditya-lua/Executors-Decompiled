; OSSL_STORE_vctrl @ 00ae99c8
00ae99c8	sub sp,sp,#0xd0
00ae99cc	stp x22,x21,[sp, #0xa0]
00ae99d0	stp x20,x19,[sp, #0xb0]
00ae99d4	stp x29,x30,[sp, #0xc0]
00ae99d8	ldr x8,[x0, #0x8]
00ae99dc	mov x20,x2
00ae99e0	mov x19,x0
00ae99e4	mov w21,w1
00ae99e8	add x29,sp,#0xc0
00ae99ec	cbz x8,0x00ae9a7c
00ae99f0	ldr x22,[x8, #0xa8]
00ae99f4	cbz x22,0x00ae9aac
00ae99f8	add x0,sp,#0x50
00ae99fc	mov w2,#0x50
00ae9a00	mov w1,wzr
00ae9a04	bl 0x00c301c0
00ae9a08	cmp w21,#0x1
00ae9a0c	b.ne 0x00ae9a6c
00ae9a10	ldrsw x8,[x20, #0x18]
00ae9a14	tbz w8,#0x1f,0x00ae9a28
00ae9a18	add w9,w8,#0x8
00ae9a1c	cmp w9,#0x0
00ae9a20	str w9,[x20, #0x18]
00ae9a24	b.le 0x00ae9ac4
00ae9a28	ldr x8,[x20]
00ae9a2c	add x9,x8,#0x8
00ae9a30	str x9,[x20]
00ae9a34	ldr x8,[x8]
00ae9a38	adrp x0,0x2a2000
00ae9a3c	add x0,x0,#0xcd8
00ae9a40	add x1,sp,#0x4c
00ae9a44	ldr w8,[x8]
00ae9a48	str w8,[sp, #0x4c]
00ae9a4c	add x8,sp,#0x20
00ae9a50	bl 0x00c36260
00ae9a54	ldr x8,[sp, #0x40]
00ae9a58	ldp q1,q0,[sp, #0x20]
00ae9a5c	str x8,[sp, #0x70]
00ae9a60	stp q1,q0,[sp, #0x50]
00ae9a64	ldr x8,[x19, #0x8]
00ae9a68	ldr x22,[x8, #0xa8]
00ae9a6c	ldr x0,[x19, #0x10]
00ae9a70	add x1,sp,#0x50
00ae9a74	blr x22
00ae9a78	b 0x00ae9ab0
00ae9a7c	ldr x8,[x19]
00ae9a80	ldr x8,[x8, #0x20]
00ae9a84	cbz x8,0x00ae9aac
00ae9a88	ldr q0,[x20, #0x10]
00ae9a8c	ldr x0,[x19, #0x10]
00ae9a90	mov x2,sp
00ae9a94	mov w1,w21
00ae9a98	str q0,[sp, #0x10]
00ae9a9c	ldr q0,[x20]
00ae9aa0	str q0,[sp]
00ae9aa4	blr x8
00ae9aa8	b 0x00ae9ab0
00ae9aac	mov w0,#0x1
00ae9ab0	ldp x29,x30,[sp, #0xc0]
00ae9ab4	ldp x20,x19,[sp, #0xb0]
00ae9ab8	ldp x22,x21,[sp, #0xa0]
00ae9abc	add sp,sp,#0xd0
00ae9ac0	ret
00ae9ac4	ldr x9,[x20, #0x8]
00ae9ac8	add x8,x9,x8
00ae9acc	b 0x00ae9a34

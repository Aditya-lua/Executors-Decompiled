; FUN_00a00a14 @ 00a00a14
00a00a14	stp x22,x21,[sp, #-0x30]!
00a00a18	stp x20,x19,[sp, #0x10]
00a00a1c	stp x29,x30,[sp, #0x20]
00a00a20	ldr w8,[x0, #0x30]
00a00a24	ldr x9,[x0, #0x40]
00a00a28	mov x21,x1
00a00a2c	orr w1,wzr,#0xf
00a00a30	tst w8,#0x200
00a00a34	cset w8,eq
00a00a38	ldr x22,[x9, w8, UXTW #0x3]
00a00a3c	add x29,sp,#0x20
00a00a40	mov w19,w2
00a00a44	mov x20,x0
00a00a48	bl 0x00c32190
00a00a4c	tbnz w19,#0x1f,0x00a00a9c
00a00a50	ldr x8,[x22]
00a00a54	cmp x8,w19, SXTW 
00a00a58	csel w19,w8,w19,cc
00a00a5c	cbz x21,0x00a00aa0
00a00a60	cmp w19,#0x1
00a00a64	b.lt 0x00a00aa0
00a00a68	ldr x1,[x22, #0x8]
00a00a6c	sxtw x20,w19
00a00a70	mov x0,x21
00a00a74	mov x2,x20
00a00a78	bl 0x00c2ffd0
00a00a7c	ldp x8,x10,[x22]
00a00a80	ldr x9,[x22, #0x10]
00a00a84	sub x8,x8,x20
00a00a88	sub x9,x9,x20
00a00a8c	add x10,x10,x20
00a00a90	stp x8,x10,[x22]
00a00a94	str x9,[x22, #0x10]
00a00a98	b 0x00a00ab8
00a00a9c	ldr x8,[x22]
00a00aa0	cbnz x8,0x00a00ab8
00a00aa4	ldr w19,[x20, #0x38]
00a00aa8	cbz w19,0x00a00ab8
00a00aac	mov w1,#0x9
00a00ab0	mov x0,x20
00a00ab4	bl 0x00c322a0
00a00ab8	mov w0,w19
00a00abc	ldp x29,x30,[sp, #0x20]
00a00ac0	ldp x20,x19,[sp, #0x10]
00a00ac4	ldp x22,x21,[sp], #0x30
00a00ac8	ret

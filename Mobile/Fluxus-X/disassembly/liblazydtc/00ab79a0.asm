; FUN_00ab79a0 @ 00ab79a0
00ab79a0	stp x22,x21,[sp, #-0x30]!
00ab79a4	stp x20,x19,[sp, #0x10]
00ab79a8	mov w21,w2
00ab79ac	mov w20,w1
00ab79b0	cmp w1,#0x4
00ab79b4	mov x19,x0
00ab79b8	stp x29,x30,[sp, #0x20]
00ab79bc	add x29,sp,#0x20
00ab79c0	b.lt 0x00ab79e0
00ab79c4	cbz w3,0x00ab79e0
00ab79c8	adrp x1,0x774000
00ab79cc	add x1,x1,#0x468
00ab79d0	orr w2,wzr,#0x3
00ab79d4	mov x0,x19
00ab79d8	bl 0x00c300b0
00ab79dc	cbz w0,0x00ab7a7c
00ab79e0	tbnz w21,#0x1,0x00ab7a9c
00ab79e4	tbnz w21,#0x2,0x00ab7a30
00ab79e8	cmp w20,#0x1
00ab79ec	b.lt 0x00ab7a74
00ab79f0	mov x21,xzr
00ab79f4	sxtw x20,w20
00ab79f8	mov w22,#0x20
00ab79fc	ldrb w0,[x19, x21]
00ab7a00	cmp w0,#0xa
00ab7a04	b.eq 0x00ab7ac8
00ab7a08	cmp w0,#0xd
00ab7a0c	b.eq 0x00ab7ac8
00ab7a10	mov w1,#0x40
00ab7a14	bl 0x00c377c0
00ab7a18	cbz w0,0x00ab7a20
00ab7a1c	strb w22,[x19, x21]
00ab7a20	add x21,x21,#0x1
00ab7a24	cmp x21,x20
00ab7a28	b.lt 0x00ab79fc
00ab7a2c	b 0x00ab7ac8
00ab7a30	cmp w20,#0x1
00ab7a34	b.lt 0x00ab7a74
00ab7a38	mov x21,xzr
00ab7a3c	sxtw x20,w20
00ab7a40	ldrb w0,[x19, x21]
00ab7a44	mov w1,#0x400
00ab7a48	bl 0x00c377c0
00ab7a4c	cbz w0,0x00ab7ac8
00ab7a50	ldrb w8,[x19, x21]
00ab7a54	cmp w8,#0xa
00ab7a58	b.eq 0x00ab7ac8
00ab7a5c	cmp w8,#0xd
00ab7a60	b.eq 0x00ab7ac8
00ab7a64	add x21,x21,#0x1
00ab7a68	cmp x21,x20
00ab7a6c	b.lt 0x00ab7a40
00ab7a70	b 0x00ab7ac8
00ab7a74	mov w21,wzr
00ab7a78	b 0x00ab7ac8
00ab7a7c	sxtw x8,w20
00ab7a80	sub x20,x8,#0x3
00ab7a84	add x1,x19,#0x3
00ab7a88	mov x0,x19
00ab7a8c	mov x2,x20
00ab7a90	bl 0x00c2ff60
00ab7a94	strb wzr,[x19, x20]
00ab7a98	tbz w21,#0x1,0x00ab79e4
00ab7a9c	tbnz w20,#0x1f,0x00ab7ac4
00ab7aa0	sxtw x20,w20
00ab7aa4	ldrb w8,[x19, x20]
00ab7aa8	cmp w8,#0x20
00ab7aac	b.hi 0x00ab7ac4
00ab7ab0	sub x8,x20,#0x1
00ab7ab4	cmp x20,#0x0
00ab7ab8	mov x20,x8
00ab7abc	b.gt 0x00ab7aa4
00ab7ac0	mov w20,w8
00ab7ac4	add w21,w20,#0x1
00ab7ac8	mov w8,#0xa
00ab7acc	strh w8,[x19, w21, SXTW #0x0]
00ab7ad0	ldp x29,x30,[sp, #0x20]
00ab7ad4	ldp x20,x19,[sp, #0x10]
00ab7ad8	add w0,w21,#0x1
00ab7adc	ldp x22,x21,[sp], #0x30
00ab7ae0	ret

; FUN_00c229d4 @ 00c229d4
00c229d4	paciasp
00c229d8	stp x29,x30,[sp, #-0x30]!
00c229dc	str x21,[sp, #0x10]
00c229e0	stp x20,x19,[sp, #0x20]
00c229e4	mov x29,sp
00c229e8	ldp x9,x10,[x1, #0x8]
00c229ec	mov x19,x1
00c229f0	ldr x8,[x1]
00c229f4	mov x20,x0
00c229f8	add x11,x9,#0x5
00c229fc	cmp x11,x10
00c22a00	b.ls 0x00c22a30
00c22a04	lsl x10,x10,#0x1
00c22a08	add x9,x9,#0x3e5
00c22a0c	mov x0,x8
00c22a10	cmp x10,x9
00c22a14	csel x1,x10,x9,hi
00c22a18	str x1,[x19, #0x10]
00c22a1c	bl 0x00c30950
00c22a20	str x0,[x19]
00c22a24	cbz x0,0x00c22b80
00c22a28	ldr x9,[x19, #0x8]
00c22a2c	mov x8,x0
00c22a30	mov w10,#0x7473
00c22a34	add x8,x8,x9
00c22a38	mov w9,#0x3a
00c22a3c	movk w10,#0x3a64, LSL #16
00c22a40	strb w9,[x8, #0x4]
00c22a44	str w10,[x8]
00c22a48	ldr x8,[x19, #0x8]
00c22a4c	ldr w9,[x20, #0xc]
00c22a50	add x8,x8,#0x5
00c22a54	cmp w9,#0x2
00c22a58	str x8,[x19, #0x8]
00c22a5c	b.gt 0x00c22a84
00c22a60	sub w10,w9,#0x1
00c22a64	cmp w10,#0x2
00c22a68	b.cs 0x00c22aa4
00c22a6c	cmp w9,#0x2
00c22a70	adrp x20,0x2ce000
00c22a74	add x20,x20,#0xc6e
00c22a78	b.cc 0x00c22ac0
00c22a7c	mov w21,#0x6
00c22a80	b 0x00c22ad4
00c22a84	cmp w9,#0x3
00c22a88	b.eq 0x00c22ab4
00c22a8c	cmp w9,#0x5
00c22a90	b.ne 0x00c22ac8
00c22a94	adrp x20,0x2cc000
00c22a98	add x20,x20,#0xa79
00c22a9c	mov w21,#0x8
00c22aa0	b 0x00c22ad4
00c22aa4	adrp x20,0x2ca000
00c22aa8	add x20,x20,#0x9ee
00c22aac	mov w21,#0x9
00c22ab0	b 0x00c22af8
00c22ab4	adrp x20,0x2d8000
00c22ab8	add x20,x20,#0xe7a
00c22abc	b 0x00c22ad0
00c22ac0	mov w21,#0xc
00c22ac4	b 0x00c22af8
00c22ac8	adrp x20,0x2d4000
00c22acc	add x20,x20,#0xc5d
00c22ad0	mov w21,#0x7
00c22ad4	ldr w9,[x20]
00c22ad8	mov w11,#0x6162
00c22adc	ldrh w10,[x20, #0x4]
00c22ae0	movk w11,#0x6973, LSL #16
00c22ae4	cmp w9,w11
00c22ae8	mov w9,#0x5f63
00c22aec	ccmp w10,w9,#0x0,eq
00c22af0	b.ne 0x00c22b60
00c22af4	add x20,x20,#0x6
00c22af8	ldr x10,[x19, #0x10]
00c22afc	add x9,x8,x21
00c22b00	ldr x0,[x19]
00c22b04	cmp x9,x10
00c22b08	b.ls 0x00c22b30
00c22b0c	lsl x8,x10,#0x1
00c22b10	add x9,x9,#0x3e0
00c22b14	cmp x8,x9
00c22b18	csel x1,x8,x9,hi
00c22b1c	str x1,[x19, #0x10]
00c22b20	bl 0x00c30950
00c22b24	str x0,[x19]
00c22b28	cbz x0,0x00c22b84
00c22b2c	ldr x8,[x19, #0x8]
00c22b30	add x0,x0,x8
00c22b34	mov x1,x20
00c22b38	mov x2,x21
00c22b3c	bl 0x00c2ffd0
00c22b40	ldr x8,[x19, #0x8]
00c22b44	add x8,x8,x21
00c22b48	str x8,[x19, #0x8]
00c22b4c	ldp x20,x19,[sp, #0x20]
00c22b50	ldr x21,[sp, #0x10]
00c22b54	ldp x29,x30,[sp], #0x30
00c22b58	autiasp
00c22b5c	ret
00c22b60	adrp x0,0x29f000
00c22b64	add x0,x0,#0x357
00c22b68	adrp x1,0x2c0000
00c22b6c	add x1,x1,#0xcf7
00c22b70	adrp x3,0x2ab000
00c22b74	add x3,x3,#0x32c
00c22b78	mov w2,#0x6be
00c22b7c	bl 0x00c0de94
00c22b80	bl 0x00c30b40
00c22b84	bl 0x00c30b40

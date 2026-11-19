; dtls1_ctrl @ 009a69bc
009a69bc	sub sp,sp,#0x30
009a69c0	stp x20,x19,[sp, #0x10]
009a69c4	mov x19,x3
009a69c8	cmp w1,#0x49
009a69cc	mov x20,x0
009a69d0	stp x29,x30,[sp, #0x20]
009a69d4	add x29,sp,#0x20
009a69d8	b.le 0x009a69fc
009a69dc	cmp w1,#0x4a
009a69e0	b.eq 0x009a6a58
009a69e4	cmp w1,#0x78
009a69e8	b.eq 0x009a6a64
009a69ec	cmp w1,#0x79
009a69f0	b.ne 0x009a6a9c
009a69f4	mov w0,#0x100
009a69f8	b 0x009a6b00
009a69fc	cmp w1,#0x11
009a6a00	b.eq 0x009a6a80
009a6a04	cmp w1,#0x49
009a6a08	b.ne 0x009a6a9c
009a6a0c	ldr x8,[x20, #0x4b8]
009a6a10	ldr x9,[x8, #0x1f0]
009a6a14	cbnz x9,0x009a6a20
009a6a18	ldr x8,[x8, #0x1f8]
009a6a1c	cbz x8,0x009a6b10
009a6a20	mov x0,sp
009a6a24	mov x1,xzr
009a6a28	bl 0x00c31ff0
009a6a2c	ldr x9,[x20, #0x4b8]
009a6a30	ldr x8,[sp]
009a6a34	ldr x10,[x9, #0x1f0]
009a6a38	cmp x10,x8
009a6a3c	b.lt 0x009a6af0
009a6a40	b.ne 0x009a6aac
009a6a44	ldr x11,[x9, #0x1f8]
009a6a48	ldr x10,[sp, #0x8]
009a6a4c	cmp x11,x10
009a6a50	b.gt 0x009a6ab0
009a6a54	b 0x009a6af0
009a6a58	mov x0,x20
009a6a5c	bl 0x009a6be0
009a6a60	b 0x009a6afc
009a6a64	cmp x2,#0x100
009a6a68	mov x0,xzr
009a6a6c	b.lt 0x009a6b00
009a6a70	ldr x8,[x20, #0x4b8]
009a6a74	mov w0,#0x1
009a6a78	str x2,[x8, #0x128]
009a6a7c	b 0x009a6b00
009a6a80	cmp x2,#0xd0
009a6a84	mov x0,xzr
009a6a88	b.lt 0x009a6b00
009a6a8c	ldr x8,[x20, #0x4b8]
009a6a90	mov x0,x2
009a6a94	str x2,[x8, #0x130]
009a6a98	b 0x009a6b00
009a6a9c	mov x0,x20
009a6aa0	mov x3,x19
009a6aa4	bl 0x00c34180
009a6aa8	b 0x009a6afc
009a6aac	ldr x10,[sp, #0x8]
009a6ab0	ldr q0,[x9, #0x1f0]
009a6ab4	str q0,[x19]
009a6ab8	ldp x9,x11,[x19]
009a6abc	sub x8,x9,x8
009a6ac0	subs x9,x11,x10
009a6ac4	stp x8,x9,[x19]
009a6ac8	b.pl 0x009a6ae0
009a6acc	mov w10,#0x4240
009a6ad0	movk w10,#0xf, LSL #16
009a6ad4	sub x8,x8,#0x1
009a6ad8	add x9,x9,x10
009a6adc	stp x8,x9,[x19]
009a6ae0	mov w10,#0x3a97
009a6ae4	cmp x9,x10
009a6ae8	b.gt 0x009a6af4
009a6aec	cbnz x8,0x009a6af4
009a6af0	stp xzr,xzr,[x19]
009a6af4	cmp x19,#0x0
009a6af8	cset w0,ne
009a6afc	sxtw x0,w0
009a6b00	ldp x29,x30,[sp, #0x20]
009a6b04	ldp x20,x19,[sp, #0x10]
009a6b08	add sp,sp,#0x30
009a6b0c	ret
009a6b10	mov x19,xzr
009a6b14	b 0x009a6af4

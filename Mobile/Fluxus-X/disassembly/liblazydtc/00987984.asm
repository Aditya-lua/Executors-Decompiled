; ix::SocketServer::SocketServer @ 00987984
00987984	sub sp,sp,#0xa0
00987988	stp x28,x27,[sp, #0x40]
0098798c	stp x26,x25,[sp, #0x50]
00987990	stp x24,x23,[sp, #0x60]
00987994	stp x22,x21,[sp, #0x70]
00987998	stp x20,x19,[sp, #0x80]
0098799c	stp x29,x30,[sp, #0x90]
009879a0	add x29,sp,#0x90
009879a4	adrp x8,0xcb4000
009879a8	ldr x8,[x8, #0xff0]
009879ac	mov x26,x0
009879b0	str w1,[x0, #0x8]
009879b4	mov w22,w5
009879b8	add x8,x8,#0x10
009879bc	str x8,[x0]
009879c0	str xzr,[x26, #0x10]!
009879c4	stp xzr,xzr,[x0, #0x18]
009879c8	ldrb w8,[x2]
009879cc	mov x23,x4
009879d0	mov x19,x0
009879d4	mov w24,w3
009879d8	str x26,[sp, #0x20]
009879dc	tbnz w8,#0x0,0x009879f4
009879e0	ldr x8,[x2, #0x10]
009879e4	str x8,[x26, #0x10]
009879e8	ldr q0,[x2]
009879ec	str q0,[x26]
009879f0	b 0x00987a50
009879f4	ldr x21,[x2, #0x8]
009879f8	cmn x21,#0x10
009879fc	b.cs 0x00987bc8
00987a00	ldr x25,[x2, #0x10]
00987a04	cmp x21,#0x17
00987a08	b.cs 0x00987a1c
00987a0c	lsl w8,w21,#0x1
00987a10	strb w8,[x26], #0x1
00987a14	cbnz x21,0x00987a3c
00987a18	b 0x00987a4c
00987a1c	add x8,x21,#0x10
00987a20	and x27,x8,#-0x10
00987a24	mov x0,x27
00987a28	bl 0x00c2fed0
00987a2c	orr x8,x27,#0x1
00987a30	mov x26,x0
00987a34	stp x21,x0,[x19, #0x18]
00987a38	str x8,[x19, #0x10]
00987a3c	mov x0,x26
00987a40	mov x1,x25
00987a44	mov x2,x21
00987a48	bl 0x00c2ffd0
00987a4c	strb wzr,[x26, x21]
00987a50	mov x21,x19
00987a54	mov w8,#0xffffffff
00987a58	str xzr,[x21, #0x44]!
00987a5c	stp w22,w8,[x21, #-0xc]
00987a60	add x8,x21,#0x5c
00987a64	stp xzr,xzr,[x21, #0x18]
00987a68	stp xzr,xzr,[x21, #0x8]
00987a6c	add x26,x21,#0x54
00987a70	str x8,[sp, #0x38]
00987a74	add x8,x21,#0x84
00987a78	stur x23,[x21, #-0x14]
00987a7c	mov x23,x21
00987a80	mov x20,x21
00987a84	add x27,x21,#0x44
00987a88	str x8,[sp, #0x30]
00987a8c	add x8,x21,#0xb4
00987a90	mov w2,#0x88
00987a94	mov x0,x26
00987a98	mov w1,wzr
00987a9c	stur w24,[x21, #-0x1c]
00987aa0	sturb wzr,[x21, #-0x4]
00987aa4	str x8,[sp, #0x28]
00987aa8	str xzr,[x23, #0x2c]!
00987aac	strb wzr,[x21, #0x34]
00987ab0	str xzr,[x20, #0x3c]!
00987ab4	stur x27,[x21, #0x44]
00987ab8	stur x27,[x21, #0x4c]
00987abc	add x28,x21,#0xdc
00987ac0	bl 0x00c301c0
00987ac4	adrp x8,0xcb4000
00987ac8	ldr x8,[x8, #0xff8]
00987acc	adrp x9,0xcb4000
00987ad0	ldr x9,[x9, #0xe90]
00987ad4	add x24,x21,#0x10c
00987ad8	add x8,x8,#0x10
00987adc	stur x8,[x21, #0xdc]
00987ae0	add x8,x21,#0x13c
00987ae4	mov w2,#0x48
00987ae8	mov x0,x24
00987aec	mov w1,wzr
00987af0	stur x28,[x21, #0xfc]
00987af4	stur x9,[x21, #0xe4]
00987af8	str x8,[sp, #0x18]
00987afc	bl 0x00c301c0
00987b00	orr w8,wzr,#0xc
00987b04	strb w8,[x21, #0x13c]
00987b08	mov w8,#0x5953
00987b0c	add x9,x21,#0x13d
00987b10	movk w8,#0x5453, LSL #16
00987b14	add x10,x21,#0x141
00987b18	mov w11,#0x4d45
00987b1c	add x25,x21,#0x154
00987b20	str w8,[x9]
00987b24	add x8,x21,#0x164
00987b28	orr w9,wzr,#0xe
00987b2c	strh w11,[x10]
00987b30	add x10,x21,#0x15c
00987b34	strb wzr,[x21, #0x143]
00987b38	str xzr,[x8]
00987b3c	add x8,x21,#0x159
00987b40	str xzr,[x25]
00987b44	strb w9,[x21, #0x154]
00987b48	mov w9,#0x4c55
00987b4c	str xzr,[x10]
00987b50	strh w9,[x8]
00987b54	mov w9,#0x4544
00987b58	add x10,x21,#0x155
00987b5c	mov w8,#0x54
00987b60	movk w9,#0x4146, LSL #16
00987b64	str w9,[x10]
00987b68	add x22,x21,#0x174
00987b6c	add x9,x21,#0x184
00987b70	strb w8,[x21, #0x15b]
00987b74	add x8,x21,#0x17c
00987b78	strb wzr,[x21, #0x15c]
00987b7c	strh wzr,[x21, #0x16c]
00987b80	str xzr,[x9]
00987b84	str xzr,[x22]
00987b88	str xzr,[x8]
00987b8c	strb wzr,[x21, #0x18c]
00987b90	add x8,x21,#0x194
00987b94	bl 0x00c33490
00987b98	add x0,x19,#0x1e0
00987b9c	mov w2,#0x59
00987ba0	mov w1,wzr
00987ba4	bl 0x00c301c0
00987ba8	ldp x29,x30,[sp, #0x90]
00987bac	ldp x20,x19,[sp, #0x80]
00987bb0	ldp x22,x21,[sp, #0x70]
00987bb4	ldp x24,x23,[sp, #0x60]
00987bb8	ldp x26,x25,[sp, #0x50]
00987bbc	ldp x28,x27,[sp, #0x40]
00987bc0	add sp,sp,#0xa0
00987bc4	ret
00987bc8	mov x0,x26
00987bcc	bl 0x00c30ce0

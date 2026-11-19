; ix::HttpClient::HttpClient @ 00971a8c
00971a8c	sub sp,sp,#0x90
00971a90	str x27,[sp, #0x30]
00971a94	stp x26,x25,[sp, #0x40]
00971a98	stp x24,x23,[sp, #0x50]
00971a9c	stp x22,x21,[sp, #0x60]
00971aa0	stp x20,x19,[sp, #0x70]
00971aa4	stp x29,x30,[sp, #0x80]
00971aa8	add x29,sp,#0x80
00971aac	mrs x24,tpidr_el0
00971ab0	ldr x8,[x24, #0x28]
00971ab4	and w9,w1,#0x1
00971ab8	mov x20,x0
00971abc	mov x19,x0
00971ac0	str x8,[sp, #0x28]
00971ac4	strb w9,[x20], #0x8
00971ac8	mov w2,#0x89
00971acc	mov x0,x20
00971ad0	mov w1,wzr
00971ad4	bl 0x00c301c0
00971ad8	mov x21,x19
00971adc	str xzr,[x21, #0x98]!
00971ae0	add x22,x21,#0x10
00971ae4	str xzr,[x21, #0x8]
00971ae8	mov x0,x22
00971aec	bl 0x00c33230
00971af0	add x23,x19,#0xd0
00971af4	mov w2,#0x48
00971af8	mov x0,x23
00971afc	mov w1,wzr
00971b00	bl 0x00c301c0
00971b04	orr w8,wzr,#0xc
00971b08	add x10,x19,#0x105
00971b0c	strb w8,[x19, #0x100]
00971b10	mov w8,#0x4d45
00971b14	strh w8,[x10]
00971b18	mov w8,#0x5953
00971b1c	add x9,x19,#0x101
00971b20	movk w8,#0x5453, LSL #16
00971b24	orr w10,wzr,#0xe
00971b28	str w8,[x9]
00971b2c	add x9,x19,#0x11d
00971b30	stp xzr,xzr,[x19, #0x118]
00971b34	strb w10,[x19, #0x118]
00971b38	mov w10,#0x4c55
00971b3c	strb wzr,[x19, #0x107]
00971b40	str xzr,[x19, #0x128]
00971b44	strh w10,[x9]
00971b48	mov w10,#0x4544
00971b4c	add x8,x19,#0x119
00971b50	movk w10,#0x4146, LSL #16
00971b54	str w10,[x8]
00971b58	ldrb w8,[x19]
00971b5c	mov w9,#0x54
00971b60	strb w9,[x19, #0x11f]
00971b64	strb wzr,[x19, #0x120]
00971b68	strh wzr,[x19, #0x130]
00971b6c	stp xzr,xzr,[x19, #0x140]
00971b70	str xzr,[x19, #0x138]
00971b74	strb wzr,[x19, #0x150]
00971b78	strb wzr,[x19, #0x158]
00971b7c	cbz w8,0x00971bd0
00971b80	adrp x8,0xcb4000
00971b84	ldr x8,[x8, #0xee8]
00971b88	movi v0.2D,#0x0
00971b8c	add x25,x19,#0x100
00971b90	add x26,x19,#0x118
00971b94	add x27,x19,#0x138
00971b98	mov v0.D[0x0],x8
00971b9c	str q0,[sp, #0x10]
00971ba0	str x19,[sp, #0x8]
00971ba4	add x0,sp,#0x20
00971ba8	add x1,sp,#0x10
00971bac	add x2,sp,#0x8
00971bb0	bl 0x009722e4
00971bb4	ldr x8,[x21]
00971bb8	cbnz x8,0x00971c04
00971bbc	ldr x8,[sp, #0x20]
00971bc0	add x0,sp,#0x20
00971bc4	str x8,[x21]
00971bc8	str xzr,[sp, #0x20]
00971bcc	bl 0x00c2ff80
00971bd0	ldr x8,[x24, #0x28]
00971bd4	ldr x9,[sp, #0x28]
00971bd8	cmp x8,x9
00971bdc	b.ne 0x00971c00
00971be0	ldp x29,x30,[sp, #0x80]
00971be4	ldp x20,x19,[sp, #0x70]
00971be8	ldp x22,x21,[sp, #0x60]
00971bec	ldp x24,x23,[sp, #0x50]
00971bf0	ldp x26,x25,[sp, #0x40]
00971bf4	ldr x27,[sp, #0x30]
00971bf8	add sp,sp,#0x90
00971bfc	ret
00971c00	bl 0x00c2fec0
00971c04	bl 0x00c2fff0

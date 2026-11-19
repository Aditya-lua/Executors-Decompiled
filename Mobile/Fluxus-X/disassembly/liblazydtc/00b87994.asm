; psa_copy_key @ 00b87994
00b87994	sub sp,sp,#0xa0
00b87998	str x27,[sp, #0x40]
00b8799c	stp x26,x25,[sp, #0x50]
00b879a0	stp x24,x23,[sp, #0x60]
00b879a4	stp x22,x21,[sp, #0x70]
00b879a8	stp x20,x19,[sp, #0x80]
00b879ac	stp x29,x30,[sp, #0x90]
00b879b0	add x29,sp,#0x90
00b879b4	mrs x26,tpidr_el0
00b879b8	ldr x8,[x26, #0x28]
00b879bc	mov x21,x1
00b879c0	mov x19,x2
00b879c4	str x8,[sp, #0x38]
00b879c8	stp xzr,xzr,[sp, #0x28]
00b879cc	ldr x8,[x1, #0x10]
00b879d0	str x8,[sp, #0x20]
00b879d4	ldr q0,[x1]
00b879d8	add x1,sp,#0x30
00b879dc	stp xzr,xzr,[sp]
00b879e0	str q0,[sp, #0x10]
00b879e4	str wzr,[x2]
00b879e8	bl 0x00c43190
00b879ec	mov w20,w0
00b879f0	cbz w0,0x00b87a34
00b879f4	ldr x19,[sp, #0x28]
00b879f8	cbz x19,0x00b87b38
00b879fc	mov x21,x19
00b87a00	ldr x0,[x21, #0x28]!
00b87a04	cbz x0,0x00b87a10
00b87a08	ldr x1,[x19, #0x30]
00b87a0c	bl 0x00c42230
00b87a10	stp xzr,xzr,[x21]
00b87a14	ldr w8,[x19, #0x18]
00b87a18	sub w9,w8,#0x2
00b87a1c	cmp w9,#0x2
00b87a20	b.cs 0x00b87a5c
00b87a24	ldr x8,[x19, #0x20]
00b87a28	cmp x8,#0x1
00b87a2c	b.ne 0x00b87a6c
00b87a30	b 0x00b87a80
00b87a34	ldr x20,[sp, #0x30]
00b87a38	ldr w27,[x20, #0x8]
00b87a3c	tbnz w27,#0x1,0x00b87aa0
00b87a40	mov x0,x20
00b87a44	str xzr,[sp, #0x30]
00b87a48	bl 0x00c431e0
00b87a4c	mov w20,#0xffffff7b
00b87a50	ldr x19,[sp, #0x28]
00b87a54	cbnz x19,0x00b879fc
00b87a58	b 0x00b87b38
00b87a5c	cmp w8,#0x1
00b87a60	b.ne 0x00b87a6c
00b87a64	ldr x8,[x19, #0x20]
00b87a68	cbz x8,0x00b87a80
00b87a6c	movi v0.2D,#0x0
00b87a70	str xzr,[x19, #0x30]
00b87a74	stp q0,q0,[x19, #0x10]
00b87a78	str q0,[x19]
00b87a7c	b 0x00b87b38
00b87a80	ldrb w0,[x19, #0x1c]
00b87a84	movi v0.2D,#0x0
00b87a88	mov x1,x19
00b87a8c	stp xzr,xzr,[x19, #0x28]
00b87a90	stp q0,q0,[x19]
00b87a94	str xzr,[x19, #0x20]
00b87a98	bl 0x00c43180
00b87a9c	b 0x00b87b38
00b87aa0	ldrh w8,[x21]
00b87aa4	cbz w8,0x00b87ab4
00b87aa8	ldrh w9,[x20]
00b87aac	cmp w8,w9
00b87ab0	b.ne 0x00b87b2c
00b87ab4	ldrh w8,[x21, #0x2]
00b87ab8	ldrh w9,[x20, #0x2]
00b87abc	cbz w8,0x00b87acc
00b87ac0	cmp w8,w9
00b87ac4	b.eq 0x00b87ad0
00b87ac8	b 0x00b87b2c
00b87acc	mov w8,w9
00b87ad0	strh w8,[sp, #0x12]
00b87ad4	ldrh w8,[x20]
00b87ad8	ldr w21,[sp, #0x1c]
00b87adc	strh w8,[sp, #0x10]
00b87ae0	ldr w24,[x20, #0xc]
00b87ae4	ldrh w25,[x20]
00b87ae8	mov w1,w21
00b87aec	mov w2,w24
00b87af0	mov w0,w25
00b87af4	bl 0x00b90dcc
00b87af8	ldr w22,[sp, #0x20]
00b87afc	ldr w23,[x20, #0x10]
00b87b00	mov w20,w0
00b87b04	mov w0,w25
00b87b08	mov w1,w22
00b87b0c	mov w2,w23
00b87b10	bl 0x00b90dcc
00b87b14	cbz w24,0x00b87b20
00b87b18	cbz w21,0x00b87b20
00b87b1c	cbz w20,0x00b87b2c
00b87b20	cbz w23,0x00b87b74
00b87b24	cbz w22,0x00b87b74
00b87b28	cbnz w0,0x00b87b74
00b87b2c	mov w20,#0xffffff79
00b87b30	ldr x19,[sp, #0x28]
00b87b34	cbnz x19,0x00b879fc
00b87b38	ldr x0,[sp, #0x30]
00b87b3c	bl 0x00c431e0
00b87b40	ldr x8,[x26, #0x28]
00b87b44	ldr x9,[sp, #0x38]
00b87b48	cmp x8,x9
00b87b4c	b.ne 0x00b87cc8
00b87b50	mov w0,w20
00b87b54	ldp x29,x30,[sp, #0x90]
00b87b58	ldp x20,x19,[sp, #0x80]
00b87b5c	ldp x22,x21,[sp, #0x70]
00b87b60	ldp x24,x23,[sp, #0x60]
00b87b64	ldp x26,x25,[sp, #0x50]
00b87b68	ldr x27,[sp, #0x40]
00b87b6c	add sp,sp,#0xa0
00b87b70	ret
00b87b74	ldr w8,[sp, #0x18]
00b87b78	str w0,[sp, #0x20]
00b87b7c	add x0,sp,#0x10
00b87b80	add x1,sp,#0x28
00b87b84	and w8,w8,w27
00b87b88	add x2,sp,#0x8
00b87b8c	stp w8,w20,[sp, #0x18]
00b87b90	bl 0x00b8785c
00b87b94	mov w20,w0
00b87b98	cbnz w0,0x00b879f4
00b87b9c	ldp x21,x8,[sp, #0x28]
00b87ba0	ldr w9,[x21, #0x4]
00b87ba4	ldr w10,[x8, #0x4]
00b87ba8	eor w9,w10,w9
00b87bac	cmp w9,#0xff
00b87bb0	b.ls 0x00b87bc4
00b87bb4	mov w20,#0xffffff7a
00b87bb8	ldr x19,[sp, #0x28]
00b87bbc	cbnz x19,0x00b879fc
00b87bc0	b 0x00b87b38
00b87bc4	ldr w9,[sp, #0x14]
00b87bc8	cmp w9,#0x100
00b87bcc	b.cs 0x00b87be8
00b87bd0	ldr x9,[x21, #0x28]
00b87bd4	cbz x9,0x00b87c14
00b87bd8	mov w20,#0xffffff75
00b87bdc	ldr x19,[sp, #0x28]
00b87be0	cbnz x19,0x00b879fc
00b87be4	b 0x00b87b38
00b87be8	add x0,sp,#0x10
00b87bec	mov x1,sp
00b87bf0	bl 0x00c42f10
00b87bf4	mov w20,w0
00b87bf8	cbnz w0,0x00b879f4
00b87bfc	ldr x19,[sp, #0x28]
00b87c00	ldr x8,[x19, #0x28]
00b87c04	cbz x8,0x00b87c84
00b87c08	mov w20,#0xffffff75
00b87c0c	cbnz x19,0x00b879fc
00b87c10	b 0x00b87b38
00b87c14	ldp x20,x22,[x8, #0x28]
00b87c18	mov w0,#0x1
00b87c1c	mov x1,x22
00b87c20	bl 0x00c30a30
00b87c24	str x0,[x21, #0x28]
00b87c28	cbz x0,0x00b87ca4
00b87c2c	mov x1,x20
00b87c30	mov x2,x22
00b87c34	str x22,[x21, #0x30]
00b87c38	bl 0x00c2ffd0
00b87c3c	ldrb w8,[x21, #0x4]
00b87c40	cbz w8,0x00b87c58
00b87c44	ldp x1,x2,[x21, #0x28]
00b87c48	mov x0,x21
00b87c4c	bl 0x00c43250
00b87c50	mov w20,w0
00b87c54	cbnz w0,0x00b879f4
00b87c58	ldr w8,[x21, #0x14]
00b87c5c	str w8,[x19]
00b87c60	ldr w8,[x21, #0x18]
00b87c64	cmp w8,#0x1
00b87c68	b.ne 0x00b87cb4
00b87c6c	mov w8,#0x2
00b87c70	str w8,[x21, #0x18]
00b87c74	ldr x0,[sp, #0x30]
00b87c78	bl 0x00c431e0
00b87c7c	mov w20,w0
00b87c80	b 0x00b87b40
00b87c84	ldr x20,[sp]
00b87c88	mov w0,#0x1
00b87c8c	mov x1,x20
00b87c90	bl 0x00c30a30
00b87c94	str x0,[x19, #0x28]
00b87c98	cbz x0,0x00b87ca4
00b87c9c	str x20,[x19, #0x30]
00b87ca0	b 0x00b87b2c
00b87ca4	mov w20,#0xffffff73
00b87ca8	ldr x19,[sp, #0x28]
00b87cac	cbnz x19,0x00b879fc
00b87cb0	b 0x00b87b38
00b87cb4	mov w20,#0xffffff69
00b87cb8	str wzr,[x19]
00b87cbc	ldr x19,[sp, #0x28]
00b87cc0	cbnz x19,0x00b879fc
00b87cc4	b 0x00b87b38
00b87cc8	bl 0x00c2fec0

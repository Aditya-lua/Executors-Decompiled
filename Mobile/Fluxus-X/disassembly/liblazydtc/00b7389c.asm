; FUN_00b7389c @ 00b7389c
00b7389c	stp x28,x25,[sp, #-0x50]!
00b738a0	stp x24,x23,[sp, #0x10]
00b738a4	stp x22,x21,[sp, #0x20]
00b738a8	stp x20,x19,[sp, #0x30]
00b738ac	stp x29,x30,[sp, #0x40]
00b738b0	add x29,sp,#0x40
00b738b4	sub sp,sp,#0x330
00b738b8	mrs x23,tpidr_el0
00b738bc	ldr x8,[x23, #0x28]
00b738c0	mov x21,x2
00b738c4	mov x20,x1
00b738c8	mov x19,x0
00b738cc	cmp x2,#0x180
00b738d0	stur x8,[x29, #-0x48]
00b738d4	b.ls 0x00b738e0
00b738d8	mov w20,#0xffffffc8
00b738dc	b 0x00b73b54
00b738e0	add x0,sp,#0x188
00b738e4	mov w2,#0x1a0
00b738e8	mov w1,wzr
00b738ec	add x22,sp,#0x188
00b738f0	bl 0x00c301c0
00b738f4	add x22,x22,#0x18
00b738f8	rev w8,w21
00b738fc	orr w9,wzr,#0x30
00b73900	mov x0,x22
00b73904	mov x1,x20
00b73908	mov x2,x21
00b7390c	str w8,[sp, #0x198]
00b73910	strb w9,[sp, #0x19f]
00b73914	bl 0x00c2ffd0
00b73918	adrp x8,0x29d000
00b7391c	adrp x9,0x29d000
00b73920	ldr q0,[x8, #0x1e0]
00b73924	ldr q1,[x9, #0x180]
00b73928	mov w8,#0x80
00b7392c	add x0,sp,#0x10
00b73930	strb w8,[x22, x21]
00b73934	stp q0,q1,[sp, #0x130]
00b73938	bl 0x00c41920
00b7393c	add x0,sp,#0x10
00b73940	add x1,sp,#0x130
00b73944	mov w2,#0x100
00b73948	bl 0x00c41940
00b7394c	mov w20,w0
00b73950	cbnz w0,0x00b73b0c
00b73954	add x21,x21,#0x19
00b73958	add x22,sp,#0x188
00b7395c	mov w24,#0x10
00b73960	mov x25,x21
00b73964	stp xzr,xzr,[sp]
00b73968	cbz x25,0x00b739a8
00b7396c	ldr q0,[x22], #0x10
00b73970	ldr q1,[sp]
00b73974	cmp x25,#0x10
00b73978	csel x8,x25,x24,cc
00b7397c	add x0,sp,#0x10
00b73980	eor v0.16B,v0.16B,v1.16B
00b73984	mov w1,#0x1
00b73988	mov x2,sp
00b7398c	mov x3,sp
00b73990	str q0,[sp]
00b73994	sub x25,x25,x8
00b73998	bl 0x00c418e0
00b7399c	mov w20,w0
00b739a0	cbz w0,0x00b73968
00b739a4	b 0x00b73b0c
00b739a8	ldrb w8,[sp, #0x18b]
00b739ac	ldr q0,[sp]
00b739b0	add x22,sp,#0x188
00b739b4	mov w24,#0x10
00b739b8	add w8,w8,#0x1
00b739bc	mov x25,x21
00b739c0	stp xzr,xzr,[sp]
00b739c4	str q0,[sp, #0x150]
00b739c8	strb w8,[sp, #0x18b]
00b739cc	cbz x25,0x00b73a0c
00b739d0	ldr q0,[x22], #0x10
00b739d4	ldr q1,[sp]
00b739d8	cmp x25,#0x10
00b739dc	csel x8,x25,x24,cc
00b739e0	add x0,sp,#0x10
00b739e4	eor v0.16B,v0.16B,v1.16B
00b739e8	mov w1,#0x1
00b739ec	mov x2,sp
00b739f0	mov x3,sp
00b739f4	str q0,[sp]
00b739f8	sub x25,x25,x8
00b739fc	bl 0x00c418e0
00b73a00	mov w20,w0
00b73a04	cbz w0,0x00b739cc
00b73a08	b 0x00b73b0c
00b73a0c	ldrb w8,[sp, #0x18b]
00b73a10	ldr q0,[sp]
00b73a14	add x22,sp,#0x188
00b73a18	mov w24,#0x10
00b73a1c	add w8,w8,#0x1
00b73a20	stp xzr,xzr,[sp]
00b73a24	str q0,[sp, #0x160]
00b73a28	strb w8,[sp, #0x18b]
00b73a2c	cbz x21,0x00b73a6c
00b73a30	ldr q0,[x22], #0x10
00b73a34	ldr q1,[sp]
00b73a38	cmp x21,#0x10
00b73a3c	csel x8,x21,x24,cc
00b73a40	add x0,sp,#0x10
00b73a44	eor v0.16B,v0.16B,v1.16B
00b73a48	mov w1,#0x1
00b73a4c	mov x2,sp
00b73a50	mov x3,sp
00b73a54	str q0,[sp]
00b73a58	sub x21,x21,x8
00b73a5c	bl 0x00c418e0
00b73a60	mov w20,w0
00b73a64	cbz w0,0x00b73a2c
00b73a68	b 0x00b73b0c
00b73a6c	ldrb w8,[sp, #0x18b]
00b73a70	ldr q0,[sp]
00b73a74	add x0,sp,#0x10
00b73a78	add x1,sp,#0x150
00b73a7c	add w8,w8,#0x1
00b73a80	mov w2,#0x100
00b73a84	add x21,sp,#0x150
00b73a88	str q0,[sp, #0x170]
00b73a8c	strb w8,[sp, #0x18b]
00b73a90	bl 0x00c41940
00b73a94	mov w20,w0
00b73a98	cbnz w0,0x00b73b0c
00b73a9c	add x21,x21,#0x20
00b73aa0	add x0,sp,#0x10
00b73aa4	mov w1,#0x1
00b73aa8	mov x2,x21
00b73aac	mov x3,x21
00b73ab0	bl 0x00c418e0
00b73ab4	mov w20,w0
00b73ab8	cbnz w0,0x00b73b0c
00b73abc	ldr q0,[x21]
00b73ac0	add x0,sp,#0x10
00b73ac4	mov w1,#0x1
00b73ac8	mov x2,x21
00b73acc	mov x3,x21
00b73ad0	str q0,[x19]
00b73ad4	bl 0x00c418e0
00b73ad8	mov w20,w0
00b73adc	cbnz w0,0x00b73b0c
00b73ae0	ldr q0,[x21]
00b73ae4	add x0,sp,#0x10
00b73ae8	mov w1,#0x1
00b73aec	mov x2,x21
00b73af0	mov x3,x21
00b73af4	str q0,[x19, #0x10]
00b73af8	bl 0x00c418e0
00b73afc	mov w20,w0
00b73b00	cbnz w0,0x00b73b0c
00b73b04	ldr q0,[x21]
00b73b08	str q0,[x19, #0x20]
00b73b0c	add x0,sp,#0x10
00b73b10	bl 0x00c41910
00b73b14	add x0,sp,#0x188
00b73b18	mov w1,#0x1a0
00b73b1c	bl 0x00c42220
00b73b20	add x0,sp,#0x150
00b73b24	orr w1,wzr,#0x30
00b73b28	bl 0x00c42220
00b73b2c	add x0,sp,#0x130
00b73b30	mov w1,#0x20
00b73b34	bl 0x00c42220
00b73b38	mov x0,sp
00b73b3c	mov w1,#0x10
00b73b40	bl 0x00c42220
00b73b44	cbz w20,0x00b73b54
00b73b48	orr w1,wzr,#0x30
00b73b4c	mov x0,x19
00b73b50	bl 0x00c42220
00b73b54	ldr x8,[x23, #0x28]
00b73b58	ldur x9,[x29, #-0x48]
00b73b5c	cmp x8,x9
00b73b60	b.ne 0x00b73b84
00b73b64	mov w0,w20
00b73b68	add sp,sp,#0x330
00b73b6c	ldp x29,x30,[sp, #0x40]
00b73b70	ldp x20,x19,[sp, #0x30]
00b73b74	ldp x22,x21,[sp, #0x20]
00b73b78	ldp x24,x23,[sp, #0x10]
00b73b7c	ldp x28,x25,[sp], #0x50
00b73b80	ret
00b73b84	bl 0x00c2fec0

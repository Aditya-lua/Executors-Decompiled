; std::__ndk1::to_wstring @ 00bca978
00bca978	paciasp
00bca97c	sub sp,sp,#0x70
00bca980	stp x29,x30,[sp, #0x30]
00bca984	str x23,[sp, #0x40]
00bca988	stp x22,x21,[sp, #0x50]
00bca98c	stp x20,x19,[sp, #0x60]
00bca990	add x29,sp,#0x30
00bca994	mov w0,#0x58
00bca998	str q0,[sp]
00bca99c	mov x19,x8
00bca9a0	bl 0x00c2fed0
00bca9a4	movi v0.2D,#0x0
00bca9a8	adrp x8,0x29d000
00bca9ac	str x0,[sp, #0x20]
00bca9b0	ldr q1,[x8, #0x210]
00bca9b4	str wzr,[x0, #0x50]
00bca9b8	str q1,[sp, #0x10]
00bca9bc	stp q0,q0,[x0]
00bca9c0	stp q0,q0,[x0, #0x20]
00bca9c4	str q0,[x0, #0x40]
00bca9c8	add x0,sp,#0x10
00bca9cc	mov w1,#0x15
00bca9d0	mov w2,wzr
00bca9d4	add x20,sp,#0x10
00bca9d8	bl 0x00c43da0
00bca9dc	ldrb w8,[sp, #0x10]
00bca9e0	ldr x9,[sp, #0x18]
00bca9e4	orr x22,x20,#0x4
00bca9e8	adrp x20,0x789000
00bca9ec	add x20,x20,#0xec4
00bca9f0	mov w23,#0x1
00bca9f4	lsr x10,x8,#0x1
00bca9f8	tst w8,#0x1
00bca9fc	csel x21,x10,x9,eq
00bcaa00	ldr x9,[sp, #0x20]
00bcaa04	tst w8,#0x1
00bcaa08	csel x0,x22,x9,eq
00bcaa0c	ldr q0,[sp]
00bcaa10	add x1,x21,#0x1
00bcaa14	mov x2,x20
00bcaa18	bl 0x00c43840
00bcaa1c	tbnz w0,#0x1f,0x00bcaa34
00bcaa20	mov w1,w0
00bcaa24	cmp x21,x1
00bcaa28	b.cs 0x00bcaa50
00bcaa2c	mov x21,x1
00bcaa30	b 0x00bcaa38
00bcaa34	orr x21,x23,x21, LSL #0x1
00bcaa38	add x0,sp,#0x10
00bcaa3c	mov x1,x21
00bcaa40	mov w2,wzr
00bcaa44	bl 0x00c43da0
00bcaa48	ldrb w8,[sp, #0x10]
00bcaa4c	b 0x00bcaa00
00bcaa50	add x0,sp,#0x10
00bcaa54	mov w2,wzr
00bcaa58	bl 0x00c43da0
00bcaa5c	ldr q0,[sp, #0x10]
00bcaa60	ldr x8,[sp, #0x20]
00bcaa64	add x0,sp,#0x10
00bcaa68	stp xzr,xzr,[sp, #0x18]
00bcaa6c	str q0,[x19]
00bcaa70	str x8,[x19, #0x10]
00bcaa74	str xzr,[sp, #0x10]
00bcaa78	bl 0x00c43dc0
00bcaa7c	ldp x20,x19,[sp, #0x60]
00bcaa80	ldr x23,[sp, #0x40]
00bcaa84	ldp x22,x21,[sp, #0x50]
00bcaa88	ldp x29,x30,[sp, #0x30]
00bcaa8c	add sp,sp,#0x70
00bcaa90	autiasp
00bcaa94	ret

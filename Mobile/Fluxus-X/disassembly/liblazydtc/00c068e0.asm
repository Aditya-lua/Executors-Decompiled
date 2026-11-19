; std::__ndk1::__time_get_storage<char>::init @ 00c068e0
00c068e0	paciasp
00c068e4	sub sp,sp,#0x100
00c068e8	stp x29,x30,[sp, #0xc0]
00c068ec	stp x24,x23,[sp, #0xd0]
00c068f0	stp x22,x21,[sp, #0xe0]
00c068f4	stp x20,x19,[sp, #0xf0]
00c068f8	add x29,sp,#0xc0
00c068fc	movi v0.2D,#0x0
00c06900	mov x20,x1
00c06904	mov x19,x0
00c06908	mov x24,xzr
00c0690c	adrp x21,0x2c0000
00c06910	add x21,x21,#0xc64
00c06914	add x22,x0,#0xb0
00c06918	adrp x23,0x2b5000
00c0691c	add x23,x23,#0xa9
00c06920	stur xzr,[x29, #-0x10]
00c06924	stp q0,q0,[x29, #-0x30]
00c06928	stur q0,[x29, #-0x40]
00c0692c	ldr x4,[x19]
00c06930	add x0,sp,#0x1c
00c06934	sub x3,x29,#0x40
00c06938	mov w1,#0x64
00c0693c	mov x2,x21
00c06940	stur w24,[x29, #-0x28]
00c06944	bl 0x00c43b60
00c06948	sub x0,x22,#0xa8
00c0694c	add x1,sp,#0x1c
00c06950	bl 0x0080269c
00c06954	ldr x4,[x19]
00c06958	add x0,sp,#0x1c
00c0695c	sub x3,x29,#0x40
00c06960	mov w1,#0x64
00c06964	mov x2,x23
00c06968	bl 0x00c43b60
00c0696c	add x1,sp,#0x1c
00c06970	mov x0,x22
00c06974	bl 0x0080269c
00c06978	add x24,x24,#0x1
00c0697c	add x22,x22,#0x18
00c06980	cmp x24,#0x7
00c06984	b.ne 0x00c0692c
00c06988	mov x24,xzr
00c0698c	adrp x21,0x2ba000
00c06990	add x21,x21,#0xc87
00c06994	add x22,x19,#0x278
00c06998	adrp x23,0x2a6000
00c0699c	add x23,x23,#0xf35
00c069a0	ldr x4,[x19]
00c069a4	add x0,sp,#0x1c
00c069a8	sub x3,x29,#0x40
00c069ac	mov w1,#0x64
00c069b0	mov x2,x21
00c069b4	stur w24,[x29, #-0x30]
00c069b8	bl 0x00c43b60
00c069bc	sub x0,x22,#0x120
00c069c0	add x1,sp,#0x1c
00c069c4	bl 0x0080269c
00c069c8	ldr x4,[x19]
00c069cc	add x0,sp,#0x1c
00c069d0	sub x3,x29,#0x40
00c069d4	mov w1,#0x64
00c069d8	mov x2,x23
00c069dc	bl 0x00c43b60
00c069e0	add x1,sp,#0x1c
00c069e4	mov x0,x22
00c069e8	bl 0x0080269c
00c069ec	add x24,x24,#0x1
00c069f0	add x22,x22,#0x18
00c069f4	cmp x24,#0xc
00c069f8	b.ne 0x00c069a0
00c069fc	ldr x4,[x19]
00c06a00	adrp x21,0x2ab000
00c06a04	add x21,x21,#0x219
00c06a08	mov w8,#0x1
00c06a0c	add x0,sp,#0x1c
00c06a10	sub x3,x29,#0x40
00c06a14	mov w1,#0x64
00c06a18	mov x2,x21
00c06a1c	stur w8,[x29, #-0x38]
00c06a20	bl 0x00c43b60
00c06a24	add x0,x19,#0x398
00c06a28	add x1,sp,#0x1c
00c06a2c	bl 0x0080269c
00c06a30	ldr x4,[x19]
00c06a34	mov w8,#0xd
00c06a38	add x0,sp,#0x1c
00c06a3c	sub x3,x29,#0x40
00c06a40	mov w1,#0x64
00c06a44	mov x2,x21
00c06a48	stur w8,[x29, #-0x38]
00c06a4c	bl 0x00c43b60
00c06a50	add x0,x19,#0x3b0
00c06a54	add x1,sp,#0x1c
00c06a58	bl 0x0080269c
00c06a5c	mov x8,sp
00c06a60	mov x0,x19
00c06a64	mov w1,#0x63
00c06a68	mov x2,x20
00c06a6c	bl 0x00c44690
00c06a70	ldrb w8,[x19, #0x3c8]
00c06a74	add x21,x19,#0x3c8
00c06a78	tbz w8,#0x0,0x00c06a8c
00c06a7c	ldr x8,[x19, #0x3c8]
00c06a80	ldr x0,[x19, #0x3d8]
00c06a84	and x1,x8,#-0x2
00c06a88	bl 0x00c2fe80
00c06a8c	ldr x8,[sp, #0x10]
00c06a90	ldr q0,[sp]
00c06a94	mov x0,x19
00c06a98	mov w1,#0x72
00c06a9c	mov x2,x20
00c06aa0	str x8,[x21, #0x10]
00c06aa4	mov x8,sp
00c06aa8	str q0,[x21]
00c06aac	bl 0x00c44690
00c06ab0	ldrb w8,[x19, #0x3e0]
00c06ab4	add x21,x19,#0x3e0
00c06ab8	tbz w8,#0x0,0x00c06acc
00c06abc	ldr x8,[x19, #0x3e0]
00c06ac0	ldr x0,[x19, #0x3f0]
00c06ac4	and x1,x8,#-0x2
00c06ac8	bl 0x00c2fe80
00c06acc	ldr x8,[sp, #0x10]
00c06ad0	ldr q0,[sp]
00c06ad4	mov x0,x19
00c06ad8	mov w1,#0x78
00c06adc	mov x2,x20
00c06ae0	str x8,[x21, #0x10]
00c06ae4	mov x8,sp
00c06ae8	str q0,[x21]
00c06aec	bl 0x00c44690
00c06af0	ldrb w8,[x19, #0x3f8]
00c06af4	add x21,x19,#0x3f8
00c06af8	tbz w8,#0x0,0x00c06b0c
00c06afc	ldr x8,[x19, #0x3f8]
00c06b00	ldr x0,[x19, #0x408]
00c06b04	and x1,x8,#-0x2
00c06b08	bl 0x00c2fe80
00c06b0c	ldr x8,[sp, #0x10]
00c06b10	ldr q0,[sp]
00c06b14	mov x0,x19
00c06b18	mov w1,#0x58
00c06b1c	mov x2,x20
00c06b20	str x8,[x21, #0x10]
00c06b24	mov x8,sp
00c06b28	str q0,[x21]
00c06b2c	bl 0x00c44690
00c06b30	ldrb w8,[x19, #0x410]
00c06b34	add x20,x19,#0x410
00c06b38	tbz w8,#0x0,0x00c06b4c
00c06b3c	ldr x8,[x19, #0x410]
00c06b40	ldr x0,[x19, #0x420]
00c06b44	and x1,x8,#-0x2
00c06b48	bl 0x00c2fe80
00c06b4c	ldr q0,[sp]
00c06b50	ldr x8,[sp, #0x10]
00c06b54	str q0,[x20]
00c06b58	str x8,[x20, #0x10]
00c06b5c	ldp x20,x19,[sp, #0xf0]
00c06b60	ldp x22,x21,[sp, #0xe0]
00c06b64	ldp x24,x23,[sp, #0xd0]
00c06b68	ldp x29,x30,[sp, #0xc0]
00c06b6c	add sp,sp,#0x100
00c06b70	autiasp
00c06b74	ret

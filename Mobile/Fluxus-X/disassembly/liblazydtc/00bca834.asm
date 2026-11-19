; std::__ndk1::to_wstring @ 00bca834
00bca834	paciasp
00bca838	sub sp,sp,#0x60
00bca83c	str d8,[sp, #0x20]
00bca840	stp x29,x30,[sp, #0x28]
00bca844	str x23,[sp, #0x38]
00bca848	stp x22,x21,[sp, #0x40]
00bca84c	stp x20,x19,[sp, #0x50]
00bca850	add x29,sp,#0x28
00bca854	mov w0,#0x58
00bca858	fmov d8,d0
00bca85c	mov x19,x8
00bca860	bl 0x00c2fed0
00bca864	movi v0.2D,#0x0
00bca868	adrp x8,0x29d000
00bca86c	str x0,[sp, #0x10]
00bca870	ldr q1,[x8, #0x210]
00bca874	str wzr,[x0, #0x50]
00bca878	str q1,[sp]
00bca87c	stp q0,q0,[x0]
00bca880	stp q0,q0,[x0, #0x20]
00bca884	str q0,[x0, #0x40]
00bca888	mov x0,sp
00bca88c	mov w1,#0x15
00bca890	mov w2,wzr
00bca894	mov x20,sp
00bca898	bl 0x00c43da0
00bca89c	ldrb w8,[sp]
00bca8a0	ldr x9,[sp, #0x8]
00bca8a4	orr x22,x20,#0x4
00bca8a8	adrp x20,0x789000
00bca8ac	add x20,x20,#0xe54
00bca8b0	mov w23,#0x1
00bca8b4	lsr x10,x8,#0x1
00bca8b8	tst w8,#0x1
00bca8bc	csel x21,x10,x9,eq
00bca8c0	ldr x9,[sp, #0x10]
00bca8c4	tst w8,#0x1
00bca8c8	csel x0,x22,x9,eq
00bca8cc	fmov d0,d8
00bca8d0	add x1,x21,#0x1
00bca8d4	mov x2,x20
00bca8d8	bl 0x00c43840
00bca8dc	tbnz w0,#0x1f,0x00bca8f4
00bca8e0	mov w1,w0
00bca8e4	cmp x21,x1
00bca8e8	b.cs 0x00bca910
00bca8ec	mov x21,x1
00bca8f0	b 0x00bca8f8
00bca8f4	orr x21,x23,x21, LSL #0x1
00bca8f8	mov x0,sp
00bca8fc	mov x1,x21
00bca900	mov w2,wzr
00bca904	bl 0x00c43da0
00bca908	ldrb w8,[sp]
00bca90c	b 0x00bca8c0
00bca910	mov x0,sp
00bca914	mov w2,wzr
00bca918	bl 0x00c43da0
00bca91c	ldr q0,[sp]
00bca920	ldr x8,[sp, #0x10]
00bca924	mov x0,sp
00bca928	stp xzr,xzr,[sp, #0x8]
00bca92c	str q0,[x19]
00bca930	str x8,[x19, #0x10]
00bca934	str xzr,[sp]
00bca938	bl 0x00c43dc0
00bca93c	ldp x20,x19,[sp, #0x50]
00bca940	ldr x23,[sp, #0x38]
00bca944	ldp x22,x21,[sp, #0x40]
00bca948	ldr d8,[sp, #0x20]
00bca94c	ldp x29,x30,[sp, #0x28]
00bca950	add sp,sp,#0x60
00bca954	autiasp
00bca958	ret

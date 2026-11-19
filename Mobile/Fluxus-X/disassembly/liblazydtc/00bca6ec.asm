; std::__ndk1::to_wstring @ 00bca6ec
00bca6ec	paciasp
00bca6f0	sub sp,sp,#0x60
00bca6f4	str d8,[sp, #0x20]
00bca6f8	stp x29,x30,[sp, #0x28]
00bca6fc	str x23,[sp, #0x38]
00bca700	stp x22,x21,[sp, #0x40]
00bca704	stp x20,x19,[sp, #0x50]
00bca708	add x29,sp,#0x28
00bca70c	mov w0,#0x58
00bca710	fmov s8,s0
00bca714	mov x19,x8
00bca718	bl 0x00c2fed0
00bca71c	movi v0.2D,#0x0
00bca720	adrp x8,0x29d000
00bca724	str x0,[sp, #0x10]
00bca728	ldr q1,[x8, #0x210]
00bca72c	str wzr,[x0, #0x50]
00bca730	str q1,[sp]
00bca734	stp q0,q0,[x0]
00bca738	stp q0,q0,[x0, #0x20]
00bca73c	str q0,[x0, #0x40]
00bca740	mov x0,sp
00bca744	mov w1,#0x15
00bca748	mov w2,wzr
00bca74c	mov x20,sp
00bca750	bl 0x00c43da0
00bca754	ldrb w8,[sp]
00bca758	fcvt d8,s8
00bca75c	ldr x9,[sp, #0x8]
00bca760	orr x22,x20,#0x4
00bca764	adrp x20,0x789000
00bca768	add x20,x20,#0xe54
00bca76c	lsr x10,x8,#0x1
00bca770	tst w8,#0x1
00bca774	mov w23,#0x1
00bca778	csel x21,x10,x9,eq
00bca77c	ldr x9,[sp, #0x10]
00bca780	tst w8,#0x1
00bca784	csel x0,x22,x9,eq
00bca788	fmov d0,d8
00bca78c	add x1,x21,#0x1
00bca790	mov x2,x20
00bca794	bl 0x00c43840
00bca798	tbnz w0,#0x1f,0x00bca7b0
00bca79c	mov w1,w0
00bca7a0	cmp x21,x1
00bca7a4	b.cs 0x00bca7cc
00bca7a8	mov x21,x1
00bca7ac	b 0x00bca7b4
00bca7b0	orr x21,x23,x21, LSL #0x1
00bca7b4	mov x0,sp
00bca7b8	mov x1,x21
00bca7bc	mov w2,wzr
00bca7c0	bl 0x00c43da0
00bca7c4	ldrb w8,[sp]
00bca7c8	b 0x00bca77c
00bca7cc	mov x0,sp
00bca7d0	mov w2,wzr
00bca7d4	bl 0x00c43da0
00bca7d8	ldr q0,[sp]
00bca7dc	ldr x8,[sp, #0x10]
00bca7e0	mov x0,sp
00bca7e4	stp xzr,xzr,[sp, #0x8]
00bca7e8	str q0,[x19]
00bca7ec	str x8,[x19, #0x10]
00bca7f0	str xzr,[sp]
00bca7f4	bl 0x00c43dc0
00bca7f8	ldp x20,x19,[sp, #0x50]
00bca7fc	ldr x23,[sp, #0x38]
00bca800	ldp x22,x21,[sp, #0x40]
00bca804	ldr d8,[sp, #0x20]
00bca808	ldp x29,x30,[sp, #0x28]
00bca80c	add sp,sp,#0x60
00bca810	autiasp
00bca814	ret

; std::__ndk1::ios_base::move @ 00bce3dc
00bce3dc	paciasp
00bce3e0	stp x29,x30,[sp, #-0x20]!
00bce3e4	stp x20,x19,[sp, #0x10]
00bce3e8	mov x29,sp
00bce3ec	ldr w8,[x1, #0x8]
00bce3f0	ldr q0,[x1, #0x10]
00bce3f4	mov x19,x1
00bce3f8	mov x20,x0
00bce3fc	str xzr,[x0, #0x28]
00bce400	str w8,[x0, #0x8]
00bce404	ldr d1,[x1, #0x20]
00bce408	str q0,[x0, #0x10]
00bce40c	add x1,x1,#0x30
00bce410	str d1,[x0, #0x20]
00bce414	add x0,x0,#0x30
00bce418	bl 0x00c30660
00bce41c	ldur q2,[x19, #0x48]
00bce420	ldur q0,[x19, #0x38]
00bce424	movi v1.2D,#0x0
00bce428	stur q2,[x20, #0x48]
00bce42c	stur q0,[x20, #0x38]
00bce430	ldr q0,[x19, #0x60]
00bce434	ldr x8,[x19, #0x58]
00bce438	stur q1,[x19, #0x48]
00bce43c	str q0,[x20, #0x60]
00bce440	stur q1,[x19, #0x38]
00bce444	ldur q0,[x19, #0x78]
00bce448	str x8,[x20, #0x58]
00bce44c	ldr x8,[x19, #0x70]
00bce450	str xzr,[x19, #0x58]
00bce454	str q1,[x19, #0x60]
00bce458	str x8,[x20, #0x70]
00bce45c	str xzr,[x19, #0x70]
00bce460	stur q0,[x20, #0x78]
00bce464	stur q1,[x19, #0x78]
00bce468	ldp x20,x19,[sp, #0x10]
00bce46c	ldp x29,x30,[sp], #0x20
00bce470	autiasp
00bce474	ret

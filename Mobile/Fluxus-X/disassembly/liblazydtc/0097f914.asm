; FUN_0097f914 @ 0097f914
0097f914	str x23,[sp, #-0x40]!
0097f918	stp x22,x21,[sp, #0x10]
0097f91c	stp x20,x19,[sp, #0x20]
0097f920	stp x29,x30,[sp, #0x30]
0097f924	add x29,sp,#0x30
0097f928	mov x21,x0
0097f92c	mov w0,#0x28
0097f930	bl 0x00c2fed0
0097f934	adrp x8,0xc51000
0097f938	add x8,x8,#0xac8
0097f93c	add x8,x8,#0x10
0097f940	str x8,[x0]
0097f944	ldr x8,[x21, #0x8]
0097f948	mov x19,x0
0097f94c	str x8,[x0, #0x8]
0097f950	str xzr,[x0, #0x10]!
0097f954	stp xzr,xzr,[x19, #0x18]
0097f958	mov x8,x21
0097f95c	ldrb w9,[x8, #0x10]!
0097f960	tbnz w9,#0x0,0x0097f978
0097f964	ldr x9,[x8, #0x10]
0097f968	str x9,[x0, #0x10]
0097f96c	ldr q0,[x8]
0097f970	str q0,[x0]
0097f974	b 0x0097f9d8
0097f978	ldr x20,[x21, #0x18]
0097f97c	cmn x20,#0x10
0097f980	b.cs 0x0097f9f0
0097f984	ldr x21,[x21, #0x20]
0097f988	cmp x20,#0x17
0097f98c	b.cs 0x0097f9a4
0097f990	lsl w8,w20,#0x1
0097f994	add x22,x19,#0x11
0097f998	strb w8,[x19, #0x10]
0097f99c	cbnz x20,0x0097f9c4
0097f9a0	b 0x0097f9d4
0097f9a4	add x8,x20,#0x10
0097f9a8	and x23,x8,#-0x10
0097f9ac	mov x0,x23
0097f9b0	bl 0x00c2fed0
0097f9b4	orr x8,x23,#0x1
0097f9b8	mov x22,x0
0097f9bc	stp x20,x0,[x19, #0x18]
0097f9c0	str x8,[x19, #0x10]
0097f9c4	mov x0,x22
0097f9c8	mov x1,x21
0097f9cc	mov x2,x20
0097f9d0	bl 0x00c2ffd0
0097f9d4	strb wzr,[x22, x20]
0097f9d8	mov x0,x19
0097f9dc	ldp x29,x30,[sp, #0x30]
0097f9e0	ldp x20,x19,[sp, #0x20]
0097f9e4	ldp x22,x21,[sp, #0x10]
0097f9e8	ldr x23,[sp], #0x40
0097f9ec	ret
0097f9f0	bl 0x00c30ce0

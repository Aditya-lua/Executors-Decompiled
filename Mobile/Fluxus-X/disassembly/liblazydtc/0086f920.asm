; FUN_0086f920 @ 0086f920
0086f920	stp x29,x30,[sp, #-0x40]!
0086f924	str x23,[sp, #0x10]
0086f928	stp x22,x21,[sp, #0x20]
0086f92c	stp x20,x19,[sp, #0x30]
0086f930	mov x29,sp
0086f934	mov x19,x0
0086f938	ldr x9,[x0, #0x10]
0086f93c	ldr x0,[x0]
0086f940	mov x20,x2
0086f944	sub x8,x9,x0
0086f948	cmp x3,x8, ASR #0x3
0086f94c	b.ls 0x0086f9dc
0086f950	mov x23,x1
0086f954	cbz x0,0x0086f978
0086f958	mov x1,x8
0086f95c	str x0,[x19, #0x8]
0086f960	mov x21,x3
0086f964	bl 0x00c2fe80
0086f968	mov x3,x21
0086f96c	mov x9,xzr
0086f970	stp xzr,xzr,[x19]
0086f974	str xzr,[x19, #0x10]
0086f978	lsr x8,x3,#0x3d
0086f97c	cbnz x8,0x0086fa54
0086f980	asr x8,x9,#0x2
0086f984	orr x10,xzr,#0x7ffffffffffffff8
0086f988	cmp x8,x3
0086f98c	csel x8,x8,x3,hi
0086f990	cmp x9,x10
0086f994	mov x9,#0x1fffffffffffffff
0086f998	csel x8,x8,x9,cc
0086f99c	lsr x9,x8,#0x3d
0086f9a0	cbnz x9,0x0086fa54
0086f9a4	lsl x22,x8,#0x3
0086f9a8	mov x0,x22
0086f9ac	bl 0x00c2fed0
0086f9b0	mov x21,x0
0086f9b4	subs x20,x20,x23
0086f9b8	add x8,x0,x22
0086f9bc	stp x0,x0,[x19]
0086f9c0	str x8,[x19, #0x10]
0086f9c4	b.eq 0x0086fa18
0086f9c8	mov x1,x23
0086f9cc	mov x0,x21
0086f9d0	mov x2,x20
0086f9d4	bl 0x00c2ffd0
0086f9d8	b 0x0086fa18
0086f9dc	ldr x21,[x19, #0x8]
0086f9e0	sub x2,x21,x0
0086f9e4	cmp x3,x2, ASR #0x3
0086f9e8	b.ls 0x0086fa20
0086f9ec	cmp x21,x0
0086f9f0	add x22,x1,x2
0086f9f4	b.eq 0x0086fa00
0086f9f8	bl 0x00c2ff60
0086f9fc	ldr x21,[x19, #0x8]
0086fa00	subs x20,x20,x22
0086fa04	b.eq 0x0086fa18
0086fa08	mov x0,x21
0086fa0c	mov x1,x22
0086fa10	mov x2,x20
0086fa14	bl 0x00c2ff60
0086fa18	add x8,x21,x20
0086fa1c	b 0x0086fa3c
0086fa20	subs x20,x20,x1
0086fa24	b.eq 0x0086fa38
0086fa28	mov x2,x20
0086fa2c	mov x21,x0
0086fa30	bl 0x00c2ff60
0086fa34	mov x0,x21
0086fa38	add x8,x0,x20
0086fa3c	str x8,[x19, #0x8]
0086fa40	ldp x20,x19,[sp, #0x30]
0086fa44	ldr x23,[sp, #0x10]
0086fa48	ldp x22,x21,[sp, #0x20]
0086fa4c	ldp x29,x30,[sp], #0x40
0086fa50	ret
0086fa54	bl 0x0086f78c

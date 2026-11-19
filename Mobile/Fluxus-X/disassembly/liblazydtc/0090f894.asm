; FUN_0090f894 @ 0090f894
0090f894	str x23,[sp, #-0x40]!
0090f898	stp x22,x21,[sp, #0x10]
0090f89c	stp x20,x19,[sp, #0x20]
0090f8a0	stp x29,x30,[sp, #0x30]
0090f8a4	add x29,sp,#0x30
0090f8a8	strb wzr,[x1]
0090f8ac	adrp x8,0xcc4000
0090f8b0	add x8,x8,#0x690
0090f8b4	mov x22,x1
0090f8b8	mov x20,x0
0090f8bc	mov w0,#0x1
0090f8c0	ldr x8,[x8]
0090f8c4	mov w1,#0x9e
0090f8c8	mov w21,w2
0090f8cc	mov w23,#0x1
0090f8d0	blr x8
0090f8d4	mov x19,x0
0090f8d8	cbz x0,0x0090f958
0090f8dc	mov x8,x19
0090f8e0	strh w23,[x8, #0x30]!
0090f8e4	mov x0,x20
0090f8e8	stur x8,[x8, #-0x10]
0090f8ec	bl 0x00c2ff50
0090f8f0	add x2,x0,#0x1
0090f8f4	cmp x2,#0x6d
0090f8f8	b.cc 0x0090f920
0090f8fc	adrp x8,0xcc4000
0090f900	add x8,x8,#0x678
0090f904	mov x0,x19
0090f908	ldr x8,[x8]
0090f90c	blr x8
0090f910	mov w8,#0x1
0090f914	mov x19,xzr
0090f918	strb w8,[x22]
0090f91c	b 0x0090f958
0090f920	mov x8,x0
0090f924	add w9,w8,#0x3
0090f928	movi v0.2S,#0x1
0090f92c	and w9,w9,#0x7fffffff
0090f930	stur d0,[x19, #0x4]
0090f934	str w9,[x19, #0x10]
0090f938	tbz w21,#0x0,0x0090f94c
0090f93c	add x0,x19,#0x33
0090f940	mov x1,x20
0090f944	mov x2,x8
0090f948	b 0x0090f954
0090f94c	add x0,x19,#0x32
0090f950	mov x1,x20
0090f954	bl 0x00c2ffd0
0090f958	mov x0,x19
0090f95c	ldp x29,x30,[sp, #0x30]
0090f960	ldp x20,x19,[sp, #0x20]
0090f964	ldp x22,x21,[sp, #0x10]
0090f968	ldr x23,[sp], #0x40
0090f96c	ret

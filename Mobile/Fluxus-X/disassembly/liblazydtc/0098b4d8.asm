; ix::UrlParser::parse @ 0098b4d8
0098b4d8	sub sp,sp,#0x30
0098b4dc	str x19,[sp, #0x10]
0098b4e0	stp x29,x30,[sp, #0x20]
0098b4e4	add x29,sp,#0x20
0098b4e8	mrs x19,tpidr_el0
0098b4ec	ldr x8,[x19, #0x28]
0098b4f0	add x6,sp,#0x4
0098b4f4	str x8,[sp, #0x8]
0098b4f8	bl 0x00c331b0
0098b4fc	ldr x8,[x19, #0x28]
0098b500	ldr x9,[sp, #0x8]
0098b504	cmp x8,x9
0098b508	b.ne 0x0098b520
0098b50c	ldp x29,x30,[sp, #0x20]
0098b510	ldr x19,[sp, #0x10]
0098b514	and w0,w0,#0x1
0098b518	add sp,sp,#0x30
0098b51c	ret
0098b520	bl 0x00c2fec0

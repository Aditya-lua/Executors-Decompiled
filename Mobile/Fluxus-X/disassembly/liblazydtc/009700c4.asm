; FUN_009700c4 @ 009700c4
009700c4	sub sp,sp,#0x30
009700c8	str x19,[sp, #0x10]
009700cc	stp x29,x30,[sp, #0x20]
009700d0	add x29,sp,#0x20
009700d4	mrs x19,tpidr_el0
009700d8	ldr x8,[x19, #0x28]
009700dc	add x3,sp,#0x4
009700e0	mov w2,wzr
009700e4	str x8,[sp, #0x8]
009700e8	strb wzr,[sp, #0x4]
009700ec	bl 0x00970c2c
009700f0	ldr x8,[x19, #0x28]
009700f4	ldr x9,[sp, #0x8]
009700f8	cmp x8,x9
009700fc	b.ne 0x00970110
00970100	ldp x29,x30,[sp, #0x20]
00970104	ldr x19,[sp, #0x10]
00970108	add sp,sp,#0x30
0097010c	ret
00970110	bl 0x00c2fec0

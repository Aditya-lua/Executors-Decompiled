; std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::__append @ 0097f3dc
0097f3dc	str x25,[sp, #-0x50]!
0097f3e0	stp x24,x23,[sp, #0x10]
0097f3e4	stp x22,x21,[sp, #0x20]
0097f3e8	stp x20,x19,[sp, #0x30]
0097f3ec	stp x29,x30,[sp, #0x40]
0097f3f0	add x29,sp,#0x40
0097f3f4	ldp x25,x8,[x0, #0x8]
0097f3f8	mov x20,x1
0097f3fc	mov x19,x0
0097f400	sub x9,x8,x25
0097f404	cmp x9,x1
0097f408	b.cs 0x0097f444
0097f40c	ldr x21,[x19]
0097f410	sub x22,x25,x21
0097f414	adds x9,x22,x20
0097f418	b.mi 0x0097f4e8
0097f41c	sub x8,x8,x21
0097f420	orr x10,xzr,#0x3ffffffffffffffe
0097f424	cmp x8,x10
0097f428	b.hi 0x0097f460
0097f42c	lsl x8,x8,#0x1
0097f430	cmp x8,x9
0097f434	csel x24,x9,x8,cc
0097f438	cbnz x24,0x0097f464
0097f43c	mov x23,xzr
0097f440	b 0x0097f470
0097f444	strb wzr,[x25]
0097f448	ldr x8,[x19, #0x8]
0097f44c	subs x20,x20,#0x1
0097f450	add x25,x8,#0x1
0097f454	str x25,[x19, #0x8]
0097f458	b.ne 0x0097f444
0097f45c	b 0x0097f4d0
0097f460	orr x24,xzr,#0x7fffffffffffffff
0097f464	mov x0,x24
0097f468	bl 0x00c2fed0
0097f46c	mov x23,x0
0097f470	add x0,x23,x22
0097f474	add x8,x25,x20
0097f478	mov w1,wzr
0097f47c	mov x2,x20
0097f480	add x24,x23,x24
0097f484	sub x25,x8,x21
0097f488	bl 0x00c301c0
0097f48c	cmp x22,#0x1
0097f490	add x20,x23,x25
0097f494	b.lt 0x0097f4a8
0097f498	mov x0,x23
0097f49c	mov x1,x21
0097f4a0	mov x2,x22
0097f4a4	bl 0x00c2ffd0
0097f4a8	stp x23,x20,[x19]
0097f4ac	str x24,[x19, #0x10]
0097f4b0	cbz x21,0x0097f4d0
0097f4b4	mov x0,x21
0097f4b8	ldp x29,x30,[sp, #0x40]
0097f4bc	ldp x20,x19,[sp, #0x30]
0097f4c0	ldp x22,x21,[sp, #0x20]
0097f4c4	ldp x24,x23,[sp, #0x10]
0097f4c8	ldr x25,[sp], #0x50
0097f4cc	b 0x00c301d0
0097f4d0	ldp x29,x30,[sp, #0x40]
0097f4d4	ldp x20,x19,[sp, #0x30]
0097f4d8	ldp x22,x21,[sp, #0x20]
0097f4dc	ldp x24,x23,[sp, #0x10]
0097f4e0	ldr x25,[sp], #0x50
0097f4e4	ret
0097f4e8	mov x0,x19
0097f4ec	bl 0x00c30bd0

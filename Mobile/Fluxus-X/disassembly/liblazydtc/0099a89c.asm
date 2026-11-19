; std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::assign @ 0099a89c
0099a89c	stp x22,x21,[sp, #-0x30]!
0099a8a0	stp x20,x19,[sp, #0x10]
0099a8a4	stp x29,x30,[sp, #0x20]
0099a8a8	add x29,sp,#0x20
0099a8ac	mov x19,x0
0099a8b0	ldr x8,[x0, #0x10]
0099a8b4	ldr x0,[x0]
0099a8b8	mov x21,x1
0099a8bc	mov x20,x2
0099a8c0	sub x9,x8,x0
0099a8c4	cmp x9,x1
0099a8c8	b.cs 0x0099a904
0099a8cc	cbz x0,0x0099a8e4
0099a8d0	str x0,[x19, #0x8]
0099a8d4	bl 0x00c301d0
0099a8d8	mov x8,xzr
0099a8dc	stp xzr,xzr,[x19]
0099a8e0	str xzr,[x19, #0x10]
0099a8e4	tbnz x21,#0x3f,0x0099aa08
0099a8e8	orr x9,xzr,#0x3ffffffffffffffe
0099a8ec	cmp x8,x9
0099a8f0	b.hi 0x0099a928
0099a8f4	lsl x8,x8,#0x1
0099a8f8	cmp x8,x21
0099a8fc	csel x22,x21,x8,cc
0099a900	b 0x0099a92c
0099a904	ldr x8,[x19, #0x8]
0099a908	sub x8,x8,x0
0099a90c	cmp x8,x21
0099a910	csel x9,x8,x21,cc
0099a914	cbz x9,0x0099a9c0
0099a918	cmp x9,#0x20
0099a91c	b.cs 0x0099a960
0099a920	mov x10,x0
0099a924	b 0x0099a9b0
0099a928	orr x22,xzr,#0x7fffffffffffffff
0099a92c	mov x0,x22
0099a930	bl 0x00c2fed0
0099a934	add x8,x0,x22
0099a938	stp x0,x0,[x19]
0099a93c	str x8,[x19, #0x10]
0099a940	ldrb w8,[x20]
0099a944	subs x21,x21,#0x1
0099a948	strb w8,[x0]
0099a94c	ldr x8,[x19, #0x8]
0099a950	add x0,x8,#0x1
0099a954	str x0,[x19, #0x8]
0099a958	b.ne 0x0099a940
0099a95c	b 0x0099a9f8
0099a960	add x10,x20,#0x1
0099a964	cmp x10,x0
0099a968	b.ls 0x0099a97c
0099a96c	add x10,x0,x9
0099a970	cmp x10,x20
0099a974	mov x10,x0
0099a978	b.hi 0x0099a9b0
0099a97c	ld1r {v0.16B},[x20]
0099a980	and x11,x9,#-0x20
0099a984	add x10,x0,x11
0099a988	sub x12,x9,x11
0099a98c	add x13,x0,#0x10
0099a990	mov x14,x11
0099a994	stp q0,q0,[x13, #-0x10]
0099a998	subs x14,x14,#0x20
0099a99c	add x13,x13,#0x20
0099a9a0	b.ne 0x0099a994
0099a9a4	cmp x9,x11
0099a9a8	mov x9,x12
0099a9ac	b.eq 0x0099a9c0
0099a9b0	ldrb w11,[x20]
0099a9b4	subs x9,x9,#0x1
0099a9b8	strb w11,[x10], #0x1
0099a9bc	b.ne 0x0099a9b0
0099a9c0	subs x8,x8,x21
0099a9c4	b.cs 0x0099a9ec
0099a9c8	ldr x9,[x19, #0x8]
0099a9cc	ldrb w10,[x20]
0099a9d0	adds x8,x8,#0x1
0099a9d4	strb w10,[x9]
0099a9d8	ldr x9,[x19, #0x8]
0099a9dc	add x9,x9,#0x1
0099a9e0	str x9,[x19, #0x8]
0099a9e4	b.ne 0x0099a9cc
0099a9e8	b 0x0099a9f8
0099a9ec	ldr x8,[x19]
0099a9f0	add x8,x8,x21
0099a9f4	str x8,[x19, #0x8]
0099a9f8	ldp x29,x30,[sp, #0x20]
0099a9fc	ldp x20,x19,[sp, #0x10]
0099aa00	ldp x22,x21,[sp], #0x30
0099aa04	ret
0099aa08	mov x0,x19
0099aa0c	bl 0x00c30bd0

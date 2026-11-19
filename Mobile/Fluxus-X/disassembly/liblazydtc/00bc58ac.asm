; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::insert @ 00bc58ac
00bc58ac	paciasp
00bc58b0	stp x29,x30,[sp, #-0x40]!
00bc58b4	stp x24,x23,[sp, #0x10]
00bc58b8	stp x22,x21,[sp, #0x20]
00bc58bc	stp x20,x19,[sp, #0x30]
00bc58c0	mov x29,sp
00bc58c4	ldrb w8,[x0]
00bc58c8	ldr x9,[x0, #0x8]
00bc58cc	lsr x10,x8,#0x1
00bc58d0	tst w8,#0x1
00bc58d4	csel x20,x10,x9,eq
00bc58d8	cmp x20,x1
00bc58dc	b.cc 0x00bc5a00
00bc58e0	mov x21,x2
00bc58e4	cbz x2,0x00bc59e8
00bc58e8	ldr x9,[x0]
00bc58ec	tst w8,#0x1
00bc58f0	mov w8,#0x4
00bc58f4	mov x22,x1
00bc58f8	mov w19,w3
00bc58fc	and x10,x9,#-0x2
00bc5900	sub x10,x10,#0x1
00bc5904	csel x1,x8,x10,eq
00bc5908	sub x8,x1,x20
00bc590c	cmp x8,x21
00bc5910	b.cs 0x00bc5944
00bc5914	add x24,x20,x21
00bc5918	mov x3,x20
00bc591c	mov x4,x22
00bc5920	sub x2,x24,x1
00bc5924	mov x5,xzr
00bc5928	mov x6,x21
00bc592c	mov x23,x0
00bc5930	bl 0x00c43d70
00bc5934	mov x0,x23
00bc5938	ldr x23,[x23, #0x10]
00bc593c	str x24,[x0, #0x8]
00bc5940	b 0x00bc5978
00bc5944	ldr x8,[x0, #0x10]
00bc5948	add x10,x0,#0x4
00bc594c	tst x9,#0x1
00bc5950	csel x23,x10,x8,eq
00bc5954	subs x9,x20,x22
00bc5958	b.eq 0x00bc5978
00bc595c	add x1,x23,x22, LSL #0x2
00bc5960	lsl x2,x9,#0x2
00bc5964	mov x24,x0
00bc5968	add x8,x1,x21, LSL #0x2
00bc596c	mov x0,x8
00bc5970	bl 0x00c2ff60
00bc5974	mov x0,x24
00bc5978	add x11,x23,x22, LSL #0x2
00bc597c	cmp x21,#0x8
00bc5980	mov x9,x21
00bc5984	mov x8,x11
00bc5988	b.cc 0x00bc59bc
00bc598c	and x10,x21,#-0x8
00bc5990	dup v0.4S,w19
00bc5994	and x9,x21,#0x7
00bc5998	add x8,x11,x10, LSL #0x2
00bc599c	add x11,x11,#0x10
00bc59a0	mov x12,x10
00bc59a4	subs x12,x12,#0x8
00bc59a8	stp q0,q0,[x11, #-0x10]
00bc59ac	add x11,x11,#0x20
00bc59b0	b.ne 0x00bc59a4
00bc59b4	cmp x21,x10
00bc59b8	b.eq 0x00bc59c8
00bc59bc	subs x9,x9,#0x1
00bc59c0	str w19,[x8], #0x4
00bc59c4	b.ne 0x00bc59bc
00bc59c8	ldrb w9,[x0]
00bc59cc	add x8,x20,x21
00bc59d0	tbnz w9,#0x0,0x00bc59e0
00bc59d4	lsl w9,w8,#0x1
00bc59d8	strb w9,[x0]
00bc59dc	b 0x00bc59e4
00bc59e0	str x8,[x0, #0x8]
00bc59e4	str wzr,[x23, x8, LSL #0x2]
00bc59e8	ldp x20,x19,[sp, #0x30]
00bc59ec	ldp x22,x21,[sp, #0x20]
00bc59f0	ldp x24,x23,[sp, #0x10]
00bc59f4	ldp x29,x30,[sp], #0x40
00bc59f8	autiasp
00bc59fc	ret
00bc5a00	bl 0x00bc531c

; std::__ndk1::ctype<wchar_t>::do_widen @ 00bfc924
00bfc924	bti c
00bfc928	cmp x1,x2
00bfc92c	b.eq 0x00bfc96c
00bfc930	sub x9,x2,x1
00bfc934	cmp x9,#0x20
00bfc938	b.cc 0x00bfc950
00bfc93c	cmp x3,x2
00bfc940	b.cs 0x00bfc974
00bfc944	add x8,x3,x9, LSL #0x2
00bfc948	cmp x1,x8
00bfc94c	b.cs 0x00bfc974
00bfc950	mov x8,x3
00bfc954	mov x0,x1
00bfc958	ldrb w9,[x0], #0x1
00bfc95c	cmp x0,x2
00bfc960	str w9,[x8], #0x4
00bfc964	b.ne 0x00bfc958
00bfc968	ret
00bfc96c	mov x0,x1
00bfc970	ret
00bfc974	adrp x11,0x29c000
00bfc978	and x10,x9,#-0x20
00bfc97c	adrp x12,0x29d000
00bfc980	ldr q0,[x11, #0x890]
00bfc984	adrp x11,0x29c000
00bfc988	adrp x13,0x29c000
00bfc98c	add x8,x3,x10, LSL #0x2
00bfc990	ldr q1,[x12, #0xa0]
00bfc994	ldr q2,[x11, #0xcc0]
00bfc998	ldr q3,[x13, #0x20]
00bfc99c	add x0,x1,x10
00bfc9a0	add x11,x1,#0x10
00bfc9a4	add x12,x3,#0x40
00bfc9a8	mov x13,x10
00bfc9ac	ldp q4,q5,[x11, #-0x10]
00bfc9b0	subs x13,x13,#0x20
00bfc9b4	add x11,x11,#0x20
00bfc9b8	tbl v6.16B,{v4.16B},v3.16B
00bfc9bc	tbl v7.16B,{v4.16B},v2.16B
00bfc9c0	tbl v16.16B,{v4.16B},v1.16B
00bfc9c4	tbl v4.16B,{v4.16B},v0.16B
00bfc9c8	tbl v17.16B,{v5.16B},v3.16B
00bfc9cc	stp q7,q6,[x12, #-0x20]
00bfc9d0	tbl v6.16B,{v5.16B},v2.16B
00bfc9d4	tbl v7.16B,{v5.16B},v1.16B
00bfc9d8	tbl v5.16B,{v5.16B},v0.16B
00bfc9dc	stp q4,q16,[x12, #-0x40]
00bfc9e0	stp q6,q17,[x12, #0x20]
00bfc9e4	stp q5,q7,[x12], #0x80
00bfc9e8	b.ne 0x00bfc9ac
00bfc9ec	cmp x9,x10
00bfc9f0	b.ne 0x00bfc958
00bfc9f4	b 0x00bfc968

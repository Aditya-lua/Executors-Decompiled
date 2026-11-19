; bn_mul_add_words @ 00a04828
00a04828	cmp w2,#0x1
00a0482c	b.lt 0x00a049a4
00a04830	mov x8,x0
00a04834	and x9,x3,#0xffffffff
00a04838	subs w12,w2,#0x4
00a0483c	lsr x10,x3,#0x20
00a04840	mov x0,xzr
00a04844	b.cc 0x00a049ac
00a04848	and w11,w12,#0xfffffffc
00a0484c	add x13,x11,#0x4
00a04850	add x11,x8,x13, LSL #0x3
00a04854	mov x14,x1
00a04858	ldr x15,[x14]
00a0485c	sub w2,w2,#0x4
00a04860	and x16,x15,#0xffffffff
00a04864	lsr x15,x15,#0x20
00a04868	mul x17,x16,x10
00a0486c	mul x18,x15,x9
00a04870	mul x16,x16,x9
00a04874	mul x15,x15,x10
00a04878	adds x17,x17,x18
00a0487c	cset w18,cs
00a04880	adds x16,x16,x17, LSL #0x20
00a04884	add x15,x15,x17, LSR #0x20
00a04888	ldp x17,x3,[x8]
00a0488c	add x15,x15,x18, LSL #0x20
00a04890	cinc x15,x15,cs
00a04894	adds x16,x16,x0
00a04898	cinc x15,x15,cs
00a0489c	adds x16,x16,x17
00a048a0	str x16,[x8]
00a048a4	ldr x16,[x14, #0x8]
00a048a8	cinc x15,x15,cs
00a048ac	and x17,x16,#0xffffffff
00a048b0	lsr x16,x16,#0x20
00a048b4	mul x18,x17,x10
00a048b8	mul x0,x16,x9
00a048bc	mul x16,x16,x10
00a048c0	adds x18,x18,x0
00a048c4	mul x17,x17,x9
00a048c8	cset w0,cs
00a048cc	add x16,x16,x18, LSR #0x20
00a048d0	adds x17,x17,x18, LSL #0x20
00a048d4	add x16,x16,x0, LSL #0x20
00a048d8	cinc x16,x16,cs
00a048dc	adds x15,x15,x17
00a048e0	cinc x16,x16,cs
00a048e4	adds x15,x15,x3
00a048e8	str x15,[x8, #0x8]
00a048ec	ldr x15,[x14, #0x10]
00a048f0	cinc x16,x16,cs
00a048f4	and x17,x15,#0xffffffff
00a048f8	lsr x15,x15,#0x20
00a048fc	mul x18,x17,x10
00a04900	mul x0,x15,x9
00a04904	mul x17,x17,x9
00a04908	mul x15,x15,x10
00a0490c	adds x18,x18,x0
00a04910	cset w0,cs
00a04914	adds x17,x17,x18, LSL #0x20
00a04918	add x15,x15,x18, LSR #0x20
00a0491c	ldp x18,x3,[x8, #0x10]
00a04920	add x15,x15,x0, LSL #0x20
00a04924	cinc x15,x15,cs
00a04928	adds x16,x16,x17
00a0492c	cinc x15,x15,cs
00a04930	adds x16,x16,x18
00a04934	str x16,[x8, #0x10]
00a04938	ldr x16,[x14, #0x18]
00a0493c	cinc x15,x15,cs
00a04940	add x14,x14,#0x20
00a04944	and x17,x16,#0xffffffff
00a04948	lsr x16,x16,#0x20
00a0494c	mul x18,x17,x10
00a04950	mul x0,x16,x9
00a04954	mul x16,x16,x10
00a04958	adds x18,x18,x0
00a0495c	mul x17,x17,x9
00a04960	cset w0,cs
00a04964	add x16,x16,x18, LSR #0x20
00a04968	adds x17,x17,x18, LSL #0x20
00a0496c	add x16,x16,x0, LSL #0x20
00a04970	cinc x16,x16,cs
00a04974	adds x15,x15,x17
00a04978	cinc x16,x16,cs
00a0497c	adds x15,x15,x3
00a04980	cinc x0,x16,cs
00a04984	str x15,[x8, #0x18]
00a04988	cmp w2,#0x3
00a0498c	add x8,x8,#0x20
00a04990	b.hi 0x00a04858
00a04994	ands w2,w12,#0x3
00a04998	b.eq 0x00a04a04
00a0499c	add x1,x1,x13, LSL #0x3
00a049a0	b 0x00a049b0
00a049a4	mov x0,xzr
00a049a8	ret
00a049ac	mov x11,x8
00a049b0	ldr x8,[x1], #0x8
00a049b4	ldr x12,[x11]
00a049b8	and x13,x8,#0xffffffff
00a049bc	lsr x8,x8,#0x20
00a049c0	mul x14,x13,x10
00a049c4	mul x15,x8,x9
00a049c8	mul x8,x8,x10
00a049cc	adds x14,x14,x15
00a049d0	mul x13,x13,x9
00a049d4	cset w15,cs
00a049d8	add x8,x8,x14, LSR #0x20
00a049dc	adds x13,x13,x14, LSL #0x20
00a049e0	add x8,x8,x15, LSL #0x20
00a049e4	cinc x8,x8,cs
00a049e8	adds x13,x13,x0
00a049ec	cinc x8,x8,cs
00a049f0	adds x12,x13,x12
00a049f4	cinc x0,x8,cs
00a049f8	subs w2,w2,#0x1
00a049fc	str x12,[x11], #0x8
00a04a00	b.ne 0x00a049b0
00a04a04	ret

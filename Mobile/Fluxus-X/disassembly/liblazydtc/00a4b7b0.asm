; gf_mulw_unsigned @ 00a4b7b0
00a4b7b0	ldp x9,x10,[x1]
00a4b7b4	ldp x11,x12,[x1, #0x20]
00a4b7b8	ldp x13,x14,[x1, #0x10]
00a4b7bc	ldp x15,x16,[x1, #0x30]
00a4b7c0	mov w8,w2
00a4b7c4	mul x17,x9,x8
00a4b7c8	umulh x9,x9,x8
00a4b7cc	mul x18,x11,x8
00a4b7d0	umulh x11,x11,x8
00a4b7d4	umulh x1,x10,x8
00a4b7d8	mul x10,x10,x8
00a4b7dc	umulh x2,x12,x8
00a4b7e0	mul x12,x12,x8
00a4b7e4	umulh x3,x13,x8
00a4b7e8	mul x13,x13,x8
00a4b7ec	umulh x4,x15,x8
00a4b7f0	mul x15,x15,x8
00a4b7f4	umulh x5,x14,x8
00a4b7f8	mul x14,x14,x8
00a4b7fc	umulh x6,x16,x8
00a4b800	mul x8,x16,x8
00a4b804	extr x16,x9,x17,#0x38
00a4b808	adds x10,x10,x16
00a4b80c	lsr x9,x9,#0x38
00a4b810	adcs x9,x1,x9
00a4b814	extr x16,x11,x18,#0x38
00a4b818	adds x12,x12,x16
00a4b81c	lsr x11,x11,#0x38
00a4b820	adcs x11,x2,x11
00a4b824	extr x16,x9,x10,#0x38
00a4b828	adds x13,x13,x16
00a4b82c	lsr x9,x9,#0x38
00a4b830	and x16,x18,#0xffffffffffffff
00a4b834	adcs x9,x3,x9
00a4b838	and x18,x12,#0xffffffffffffff
00a4b83c	extr x12,x11,x12,#0x38
00a4b840	lsr x11,x11,#0x38
00a4b844	adds x12,x15,x12
00a4b848	extr x15,x9,x13,#0x38
00a4b84c	adcs x11,x4,x11
00a4b850	lsr x9,x9,#0x38
00a4b854	adds x14,x14,x15
00a4b858	fmov d1,x13
00a4b85c	extr x13,x11,x12,#0x38
00a4b860	adcs x9,x5,x9
00a4b864	lsr x11,x11,#0x38
00a4b868	fmov d2,x14
00a4b86c	adds x8,x8,x13
00a4b870	movi v0.2D,#0xffffffffffffff
00a4b874	mov v1.D[0x1],v2.D[0x0]
00a4b878	adcs x11,x6,x11
00a4b87c	extr x15,x9,x14,#0x38
00a4b880	fmov d2,x12
00a4b884	and v1.16B,v1.16B,v0.16B
00a4b888	extr x12,x11,x8,#0x38
00a4b88c	lsr x9,x9,#0x38
00a4b890	str q1,[x0, #0x10]
00a4b894	fmov d1,x8
00a4b898	lsr x8,x11,#0x38
00a4b89c	adds x11,x15,x12
00a4b8a0	adcs x9,x9,x8
00a4b8a4	adds x11,x11,x16
00a4b8a8	and x17,x17,#0xffffffffffffff
00a4b8ac	adcs x9,x9,xzr
00a4b8b0	and x13,x11,#0xffffffffffffff
00a4b8b4	extr x9,x9,x11,#0x38
00a4b8b8	adds x11,x12,x17
00a4b8bc	adcs x8,x8,xzr
00a4b8c0	and x10,x10,#0xffffffffffffff
00a4b8c4	mov v2.D[0x1],v1.D[0x0]
00a4b8c8	extr x8,x8,x11,#0x38
00a4b8cc	and v0.16B,v2.16B,v0.16B
00a4b8d0	add x9,x18,x9
00a4b8d4	and x12,x11,#0xffffffffffffff
00a4b8d8	add x8,x10,x8
00a4b8dc	str q0,[x0, #0x30]
00a4b8e0	stp x13,x9,[x0, #0x20]
00a4b8e4	stp x12,x8,[x0]
00a4b8e8	ret

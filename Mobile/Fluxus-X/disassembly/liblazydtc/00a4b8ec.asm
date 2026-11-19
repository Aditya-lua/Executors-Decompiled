; gf_sqr @ 00a4b8ec
00a4b8ec	str x27,[sp, #-0x50]!
00a4b8f0	stp x26,x25,[sp, #0x10]
00a4b8f4	stp x24,x23,[sp, #0x20]
00a4b8f8	stp x22,x21,[sp, #0x30]
00a4b8fc	stp x20,x19,[sp, #0x40]
00a4b900	ldp x3,x10,[x1]
00a4b904	ldp x16,x9,[x1, #0x10]
00a4b908	ldp x13,x8,[x1, #0x20]
00a4b90c	ldp x15,x14,[x1, #0x30]
00a4b910	umulh x25,x3,x3
00a4b914	mul x1,x9,x3
00a4b918	mul x7,x16,x10
00a4b91c	add x4,x13,x3
00a4b920	add x12,x14,x9
00a4b924	umulh x17,x9,x3
00a4b928	umulh x6,x16,x10
00a4b92c	adds x1,x7,x1
00a4b930	mul x7,x12,x4
00a4b934	adcs x6,x6,x17
00a4b938	add x11,x8,x10
00a4b93c	add x18,x15,x16
00a4b940	umulh x26,x12,x4
00a4b944	subs x7,x7,x1
00a4b948	mul x17,x18,x11
00a4b94c	sbcs x26,x26,x6
00a4b950	adds x17,x7,x17
00a4b954	umulh x7,x18,x11
00a4b958	mul x5,x14,x13
00a4b95c	adcs x7,x26,x7
00a4b960	umulh x2,x14,x13
00a4b964	adds x1,x1,x5
00a4b968	mul x20,x15,x8
00a4b96c	adcs x2,x6,x2
00a4b970	umulh x19,x15,x8
00a4b974	lsl x5,x11,#0x1
00a4b978	adds x1,x1,x20
00a4b97c	mul x20,x18,x18
00a4b980	adcs x19,x2,x19
00a4b984	mul x2,x5,x12
00a4b988	adds x2,x20,x2
00a4b98c	umulh x20,x18,x18
00a4b990	umulh x5,x5,x12
00a4b994	adcs x5,x20,x5
00a4b998	extr x20,x7,x17,#0x37
00a4b99c	adds x20,x2,x20
00a4b9a0	lsr x7,x7,#0x37
00a4b9a4	mul x26,x3,x3
00a4b9a8	adcs x5,x5,x7
00a4b9ac	mul x7,x4,x4
00a4b9b0	lsl x21,x8,#0x1
00a4b9b4	umulh x2,x4,x4
00a4b9b8	subs x7,x7,x26
00a4b9bc	mul x6,x21,x14
00a4b9c0	sbcs x2,x2,x25
00a4b9c4	adds x6,x7,x6
00a4b9c8	umulh x21,x21,x14
00a4b9cc	mul x24,x15,x15
00a4b9d0	adcs x2,x2,x21
00a4b9d4	umulh x23,x15,x15
00a4b9d8	adds x6,x6,x24
00a4b9dc	adcs x2,x2,x23
00a4b9e0	adds x6,x6,x20
00a4b9e4	extr x23,x19,x1,#0x37
00a4b9e8	adcs x27,x2,x5
00a4b9ec	lsl x22,x10,#0x1
00a4b9f0	adds x2,x6,x23
00a4b9f4	lsr x19,x19,#0x37
00a4b9f8	mul x21,x16,x16
00a4b9fc	adcs x19,x27,x19
00a4ba00	mul x23,x22,x9
00a4ba04	umulh x7,x16,x16
00a4ba08	adds x21,x21,x23
00a4ba0c	lsl x27,x3,#0x1
00a4ba10	umulh x3,x22,x9
00a4ba14	mul x6,x13,x13
00a4ba18	adcs x7,x7,x3
00a4ba1c	umulh x24,x13,x13
00a4ba20	adds x6,x6,x26
00a4ba24	adcs x24,x24,x25
00a4ba28	adds x6,x6,x20
00a4ba2c	lsl x3,x18,#0x1
00a4ba30	adcs x5,x24,x5
00a4ba34	lsl x4,x4,#0x1
00a4ba38	umulh x24,x3,x12
00a4ba3c	mul x26,x3,x12
00a4ba40	subs x3,x6,x21
00a4ba44	mul x20,x10,x27
00a4ba48	umulh x6,x11,x4
00a4ba4c	sbcs x5,x5,x7
00a4ba50	umulh x7,x18,x4
00a4ba54	mul x18,x18,x4
00a4ba58	mul x4,x11,x4
00a4ba5c	umulh x25,x10,x27
00a4ba60	subs x4,x4,x20
00a4ba64	sbcs x6,x6,x25
00a4ba68	lsl x23,x15,#0x1
00a4ba6c	adds x4,x4,x26
00a4ba70	mul x22,x23,x14
00a4ba74	adcs x6,x6,x24
00a4ba78	adds x4,x4,x22
00a4ba7c	umulh x21,x23,x14
00a4ba80	adcs x6,x6,x21
00a4ba84	extr x21,x19,x2,#0x38
00a4ba88	adds x4,x4,x21
00a4ba8c	umulh x21,x16,x27
00a4ba90	mul x22,x16,x27
00a4ba94	lsl x16,x16,#0x1
00a4ba98	lsr x19,x19,#0x38
00a4ba9c	adcs x6,x6,x19
00a4baa0	mul x19,x16,x9
00a4baa4	subs x19,x20,x19
00a4baa8	umulh x16,x16,x9
00a4baac	sbcs x16,x25,x16
00a4bab0	adds x19,x19,x26
00a4bab4	lsl x13,x13,#0x1
00a4bab8	adcs x16,x16,x24
00a4babc	mul x20,x8,x13
00a4bac0	adds x19,x19,x20
00a4bac4	umulh x20,x15,x13
00a4bac8	mul x15,x15,x13
00a4bacc	umulh x13,x8,x13
00a4bad0	adcs x13,x16,x13
00a4bad4	extr x16,x5,x3,#0x38
00a4bad8	adds x16,x19,x16
00a4badc	lsr x5,x5,#0x38
00a4bae0	adcs x13,x13,x5
00a4bae4	umulh x5,x10,x10
00a4bae8	mul x10,x10,x10
00a4baec	adds x10,x22,x10
00a4baf0	umulh x19,x14,x14
00a4baf4	mul x14,x14,x14
00a4baf8	umulh x22,x12,x12
00a4bafc	mul x12,x12,x12
00a4bb00	adcs x5,x21,x5
00a4bb04	adds x14,x14,x12
00a4bb08	mul x21,x11,x11
00a4bb0c	adcs x19,x19,x22
00a4bb10	adds x14,x14,x21
00a4bb14	umulh x11,x11,x11
00a4bb18	adcs x11,x19,x11
00a4bb1c	subs x14,x14,x10
00a4bb20	sbcs x11,x11,x5
00a4bb24	adds x14,x14,x18
00a4bb28	adcs x11,x11,x7
00a4bb2c	extr x18,x6,x4,#0x38
00a4bb30	adds x14,x14,x18
00a4bb34	lsr x18,x6,#0x38
00a4bb38	adcs x11,x11,x18
00a4bb3c	mul x18,x9,x9
00a4bb40	subs x12,x12,x18
00a4bb44	umulh x9,x9,x9
00a4bb48	sbcs x9,x22,x9
00a4bb4c	adds x10,x12,x10
00a4bb50	adcs x9,x9,x5
00a4bb54	mul x12,x8,x8
00a4bb58	adds x10,x10,x12
00a4bb5c	umulh x8,x8,x8
00a4bb60	adcs x8,x9,x8
00a4bb64	adds x9,x10,x15
00a4bb68	adcs x8,x8,x20
00a4bb6c	extr x10,x13,x16,#0x38
00a4bb70	adds x9,x9,x10
00a4bb74	lsr x10,x13,#0x38
00a4bb78	adcs x8,x8,x10
00a4bb7c	fmov d1,x9
00a4bb80	extr x9,x8,x9,#0x38
00a4bb84	ubfiz x10,x1,#0x1,#0x37
00a4bb88	adds x9,x9,x10
00a4bb8c	lsr x8,x8,#0x38
00a4bb90	ubfiz x10,x17,#0x1,#0x37
00a4bb94	extr x12,x11,x14,#0x38
00a4bb98	adcs x8,x8,xzr
00a4bb9c	adds x10,x12,x10
00a4bba0	lsr x11,x11,#0x38
00a4bba4	fmov d0,x16
00a4bba8	and x12,x2,#0xffffffffffffff
00a4bbac	extr x8,x8,x9,#0x38
00a4bbb0	adcs x11,x11,xzr
00a4bbb4	ldp x20,x19,[sp, #0x40]
00a4bbb8	ldp x22,x21,[sp, #0x30]
00a4bbbc	ldp x24,x23,[sp, #0x20]
00a4bbc0	ldp x26,x25,[sp, #0x10]
00a4bbc4	and x18,x4,#0xffffffffffffff
00a4bbc8	add x8,x12,x8
00a4bbcc	and x12,x10,#0xffffffffffffff
00a4bbd0	extr x10,x11,x10,#0x38
00a4bbd4	and x11,x3,#0xffffffffffffff
00a4bbd8	mov v0.D[0x1],v1.D[0x0]
00a4bbdc	movi v1.2D,#0xffffffffffffff
00a4bbe0	str x18,[x0, #0x28]
00a4bbe4	and x18,x14,#0xffffffffffffff
00a4bbe8	add x8,x8,x10
00a4bbec	add x10,x11,x10
00a4bbf0	and x9,x9,#0xffffffffffffff
00a4bbf4	and v0.16B,v0.16B,v1.16B
00a4bbf8	str x18,[x0, #0x30]
00a4bbfc	str x12,[x0, #0x38]
00a4bc00	stp x9,x8,[x0, #0x18]
00a4bc04	str x10,[x0]
00a4bc08	stur q0,[x0, #0x8]
00a4bc0c	ldr x27,[sp], #0x50
00a4bc10	ret

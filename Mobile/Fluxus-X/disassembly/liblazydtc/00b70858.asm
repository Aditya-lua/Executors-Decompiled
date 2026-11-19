; mbedtls_aria_setkey_dec @ 00b70858
00b70858	str x19,[sp, #-0x20]!
00b7085c	stp x29,x30,[sp, #0x10]
00b70860	add x29,sp,#0x10
00b70864	mov x19,x0
00b70868	bl 0x00c41a20
00b7086c	cbnz w0,0x00b70a54
00b70870	ldrb w8,[x19]
00b70874	cbz x8,0x00b70a50
00b70878	mov x9,xzr
00b7087c	add x10,x19,#0x4
00b70880	mov x11,x8
00b70884	lsl x12,x9,#0x4
00b70888	lsl x13,x11,#0x4
00b7088c	ldr q0,[x10,x13]
00b70890	ldr q1,[x10,x12]
00b70894	add x9,x9,#0x1
00b70898	sub x11,x11,#0x1
00b7089c	cmp x9,x11
00b708a0	str q0,[x10,x12]
00b708a4	str q1,[x10,x13]
00b708a8	b.lt 0x00b70884
00b708ac	cmp w8,#0x2
00b708b0	mov w0,wzr
00b708b4	b.cc 0x00b70a54
00b708b8	sub x9,x8,#0x1
00b708bc	cmp x9,#0x4
00b708c0	b.cs 0x00b708cc
00b708c4	mov w9,#0x1
00b708c8	b 0x00b709a8
00b708cc	sub w10,w8,#0x1
00b708d0	and w10,w10,#0x3
00b708d4	sub x11,x9,x10
00b708d8	add x9,x11,#0x1
00b708dc	add x12,x19,#0x14
00b708e0	ld4 {v0.4S,v1.4S,v2.4S,v3.4S},[x12]
00b708e4	movi v4.2D,#0xff00ff00ff00ff
00b708e8	movi v5.2D,#0xff00ff00ff00ff
00b708ec	movi v6.2D,#0xff00ff00ff00ff
00b708f0	ushr v19.4S,v2.4S,#0x8
00b708f4	shl v20.4S,v2.4S,0x8
00b708f8	ushr v7.4S,v1.4S,#0x10
00b708fc	shl v16.4S,v1.4S,0x10
00b70900	ushr v17.4S,v3.4S,#0x10
00b70904	shl v18.4S,v3.4S,0x10
00b70908	ushr v22.4S,v0.4S,#0x10
00b7090c	bsl v4.16B,v19.16B,v20.16B
00b70910	shl v19.4S,v0.4S,0x10
00b70914	rev32 v21.16B,v3.16B
00b70918	rev32 v20.16B,v2.16B
00b7091c	orr v7.16B,v7.16B,v16.16B
00b70920	rev32 v16.16B,v1.16B
00b70924	orr v17.16B,v17.16B,v18.16B
00b70928	orr v18.16B,v22.16B,v19.16B
00b7092c	eor v19.16B,v4.16B,v1.16B
00b70930	eor v21.16B,v21.16B,v18.16B
00b70934	eor v17.16B,v20.16B,v17.16B
00b70938	eor v16.16B,v18.16B,v16.16B
00b7093c	ushr v18.4S,v19.4S,#0x8
00b70940	shl v19.4S,v19.4S,0x8
00b70944	eor v20.16B,v17.16B,v0.16B
00b70948	ushr v22.4S,v17.4S,#0x10
00b7094c	shl v17.4S,v17.4S,0x10
00b70950	bsl v5.16B,v18.16B,v19.16B
00b70954	eor v0.16B,v3.16B,v16.16B
00b70958	orr v1.16B,v22.16B,v17.16B
00b7095c	eor v2.16B,v21.16B,v5.16B
00b70960	eor v1.16B,v2.16B,v1.16B
00b70964	eor v4.16B,v4.16B,v16.16B
00b70968	eor v17.16B,v20.16B,v2.16B
00b7096c	ushr v20.4S,v1.4S,#0x8
00b70970	shl v1.4S,v1.4S,0x8
00b70974	bsl v6.16B,v20.16B,v1.16B
00b70978	ushr v3.4S,v2.4S,#0x10
00b7097c	shl v5.4S,v2.4S,0x10
00b70980	rev32 v2.16B,v2.16B
00b70984	eor v16.16B,v6.16B,v7.16B
00b70988	rev32 v0.16B,v0.16B
00b7098c	orr v3.16B,v3.16B,v5.16B
00b70990	eor v19.16B,v4.16B,v2.16B
00b70994	eor v18.16B,v0.16B,v3.16B
00b70998	subs x11,x11,#0x4
00b7099c	st4 {v16.4S,v17.4S,v18.4S,v19.4S},[x12], #0x40
00b709a0	b.ne 0x00b708e0
00b709a4	cbz w10,0x00b70a50
00b709a8	add x12,x19,x9, LSL #0x4
00b709ac	orr w10,wzr,#0xff00ff00
00b709b0	orr w11,wzr,#0xff00ff
00b709b4	add x12,x12,#0x8
00b709b8	sub x8,x8,x9
00b709bc	ldp w9,w13,[x12]
00b709c0	ldur w14,[x12, #-0x4]
00b709c4	ldr w15,[x12, #0x8]
00b709c8	subs x8,x8,#0x1
00b709cc	and w16,w11,w13, LSR #0x8
00b709d0	and w17,w10,w13, LSL #0x8
00b709d4	rev w18,w15
00b709d8	ror w0,w14,#0x10
00b709dc	rev w1,w9
00b709e0	orr w16,w16,w17
00b709e4	rev w13,w13
00b709e8	eor w17,w18,w0
00b709ec	eor w18,w0,w1
00b709f0	eor w0,w16,w9
00b709f4	eor w13,w13,w15, ROR #0x10
00b709f8	eor w16,w16,w18
00b709fc	eor w15,w15,w18
00b70a00	and w18,w11,w0, LSR #0x8
00b70a04	and w0,w10,w0, LSL #0x8
00b70a08	orr w18,w18,w0
00b70a0c	eor w14,w13,w14
00b70a10	rev w15,w15
00b70a14	eor w17,w17,w18
00b70a18	eor w14,w14,w17
00b70a1c	eor w13,w17,w13, ROR #0x10
00b70a20	eor w15,w15,w17, ROR #0x10
00b70a24	stp w14,w15,[x12]
00b70a28	and w14,w11,w13, LSR #0x8
00b70a2c	and w13,w10,w13, LSL #0x8
00b70a30	rev w18,w17
00b70a34	orr w13,w14,w13
00b70a38	eor w16,w16,w18
00b70a3c	eor w9,w13,w9, ROR #0x10
00b70a40	str w16,[x12, #0x8]
00b70a44	stur w9,[x12, #-0x4]
00b70a48	add x12,x12,#0x10
00b70a4c	b.ne 0x00b709bc
00b70a50	mov w0,wzr
00b70a54	ldp x29,x30,[sp, #0x10]
00b70a58	ldr x19,[sp], #0x20
00b70a5c	ret

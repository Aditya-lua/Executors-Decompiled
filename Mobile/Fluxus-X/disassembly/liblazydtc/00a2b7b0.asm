; BN_GF2m_mod_arr @ 00a2b7b0
00a2b7b0	str x21,[sp, #-0x30]!
00a2b7b4	stp x20,x19,[sp, #0x10]
00a2b7b8	stp x29,x30,[sp, #0x20]
00a2b7bc	ldr w11,[x2]
00a2b7c0	mov x19,x0
00a2b7c4	add x29,sp,#0x20
00a2b7c8	cbz w11,0x00a2b980
00a2b7cc	mov x21,x1
00a2b7d0	ldr w1,[x1, #0x8]
00a2b7d4	mov x20,x2
00a2b7d8	cmp x21,x19
00a2b7dc	b.eq 0x00a2b880
00a2b7e0	mov x0,x19
00a2b7e4	bl 0x00c38e80
00a2b7e8	cbz x0,0x00a2ba64
00a2b7ec	ldr w1,[x21, #0x8]
00a2b7f0	cmp w1,#0x1
00a2b7f4	b.lt 0x00a2b878
00a2b7f8	ldr x8,[x21]
00a2b7fc	ldr x9,[x19]
00a2b800	mov x11,xzr
00a2b804	cmp w1,#0x4
00a2b808	sxtw x10,w1
00a2b80c	b.cc 0x00a2b860
00a2b810	lsl x11,x10,#0x3
00a2b814	add x12,x8,x11
00a2b818	cmp x9,x12
00a2b81c	b.cs 0x00a2b830
00a2b820	add x11,x9,x11
00a2b824	cmp x8,x11
00a2b828	mov x11,xzr
00a2b82c	b.cc 0x00a2b860
00a2b830	and x11,x10,#-0x4
00a2b834	add x12,x8,#0x10
00a2b838	add x13,x9,#0x10
00a2b83c	mov x14,x11
00a2b840	ldp q0,q1,[x12, #-0x10]
00a2b844	add x12,x12,#0x20
00a2b848	subs x14,x14,#0x4
00a2b84c	stp q0,q1,[x13, #-0x10]
00a2b850	add x13,x13,#0x20
00a2b854	b.ne 0x00a2b840
00a2b858	cmp x11,x10
00a2b85c	b.eq 0x00a2b878
00a2b860	lsl x12,x11,#0x3
00a2b864	ldr x13,[x8, x12#0x0]
00a2b868	add x11,x11,#0x1
00a2b86c	cmp x11,x10
00a2b870	str x13,[x9, x12#0x0]
00a2b874	b.lt 0x00a2b860
00a2b878	str w1,[x19, #0x8]
00a2b87c	ldr w11,[x20]
00a2b880	ldr x8,[x19]
00a2b884	add w9,w11,#0x3f
00a2b888	cmp w11,#0x0
00a2b88c	csel w10,w9,w11,lt
00a2b890	asr w12,w10,#0x6
00a2b894	sub w13,w1,#0x1
00a2b898	cmp w13,w12
00a2b89c	b.le 0x00a2b98c
00a2b8a0	sub w9,w11,w12, LSL #0x6
00a2b8a4	mov w14,#0x40
00a2b8a8	sxtw x13,w13
00a2b8ac	sxtw x10,w12
00a2b8b0	sub w15,w14,w9
00a2b8b4	add x16,x20,#0x8
00a2b8b8	ldr x17,[x8, x13, LSL #0x3]
00a2b8bc	cbz x17,0x00a2b968
00a2b8c0	ldr w18,[x20, #0x4]
00a2b8c4	sub x0,x13,x10
00a2b8c8	sub x1,x0,#0x1
00a2b8cc	str xzr,[x8, x13, LSL #0x3]
00a2b8d0	cbz w18,0x00a2b934
00a2b8d4	mov x2,x16
00a2b8d8	mov w3,w18
00a2b8dc	sub w3,w11,w3
00a2b8e0	add w4,w3,#0x3f
00a2b8e4	cmp w3,#0x0
00a2b8e8	csel w5,w4,w3,lt
00a2b8ec	sub w4,w13,w5, ASR #0x6
00a2b8f0	sbfiz x6,x4,#0x3,#0x20
00a2b8f4	ldr x7,[x8, x6#0x0]
00a2b8f8	and w5,w5,#0xffffffc0
00a2b8fc	sub w3,w3,w5
00a2b900	lsr x5,x17,x3
00a2b904	eor x5,x7,x5
00a2b908	str x5,[x8, x6#0x0]
00a2b90c	cbz w3,0x00a2b92c
00a2b910	sxtw x4,w4
00a2b914	add x4,x8,x4, LSL #0x3
00a2b918	ldur x5,[x4, #-0x8]
00a2b91c	sub w3,w14,w3
00a2b920	lsl x3,x17,x3
00a2b924	eor x3,x5,x3
00a2b928	stur x3,[x4, #-0x8]
00a2b92c	ldr w3,[x2], #0x4
00a2b930	cbnz w3,0x00a2b8dc
00a2b934	lsl x2,x0,#0x3
00a2b938	ldr x3,[x8, x2#0x0]
00a2b93c	lsr x4,x17,x9
00a2b940	eor x3,x3,x4
00a2b944	str x3,[x8, x2#0x0]
00a2b948	cbz w9,0x00a2b960
00a2b94c	lsl x2,x1,#0x3
00a2b950	ldr x3,[x8, x2#0x0]
00a2b954	lsl x17,x17,x15
00a2b958	eor x17,x3,x17
00a2b95c	str x17,[x8, x2#0x0]
00a2b960	ldr x17,[x8, x13, LSL #0x3]
00a2b964	cbnz x17,0x00a2b8cc
00a2b968	sub x13,x13,#0x1
00a2b96c	cmp x13,x10
00a2b970	b.gt 0x00a2b8b8
00a2b974	cmp w13,w12
00a2b978	b.eq 0x00a2b9a8
00a2b97c	b 0x00a2ba58
00a2b980	mov x0,x19
00a2b984	bl 0x00c38e00
00a2b988	b 0x00a2ba60
00a2b98c	cmp w11,#0x0
00a2b990	csel w9,w9,w11,lt
00a2b994	and w9,w9,#0xffffffc0
00a2b998	sub w9,w11,w9
00a2b99c	sxtw x10,w12
00a2b9a0	cmp w13,w12
00a2b9a4	b.ne 0x00a2ba58
00a2b9a8	ldr x17,[x8, x10, LSL #0x3]
00a2b9ac	mov w11,w9
00a2b9b0	lsr x12,x17,x11
00a2b9b4	cbz x12,0x00a2ba58
00a2b9b8	ldr w13,[x20, #0x4]
00a2b9bc	mov w14,#0x40
00a2b9c0	sub w15,w14,w9
00a2b9c4	add x16,x20,#0x8
00a2b9c8	lsl x17,x17,x15
00a2b9cc	lsr x17,x17,x15
00a2b9d0	cmp w9,#0x0
00a2b9d4	csel x17,xzr,x17,eq
00a2b9d8	str x17,[x8, x10, LSL #0x3]
00a2b9dc	ldr x17,[x8]
00a2b9e0	eor x17,x17,x12
00a2b9e4	str x17,[x8]
00a2b9e8	cbz w13,0x00a2ba4c
00a2b9ec	mov x17,x16
00a2b9f0	mov w18,w13
00a2b9f4	add w0,w18,#0x3f
00a2b9f8	cmp w18,#0x0
00a2b9fc	csel w0,w0,w18,lt
00a2ba00	asr w1,w0,#0x6
00a2ba04	sbfiz x1,x1,#0x3,#0x20
00a2ba08	ldr x2,[x8, x1#0x0]
00a2ba0c	and w3,w0,#0xffffffc0
00a2ba10	subs w18,w18,w3
00a2ba14	lsl x3,x12,x18
00a2ba18	eor x2,x2,x3
00a2ba1c	str x2,[x8, x1#0x0]
00a2ba20	b.eq 0x00a2ba44
00a2ba24	sub w18,w14,w18
00a2ba28	lsr x18,x12,x18
00a2ba2c	cbz x18,0x00a2ba44
00a2ba30	sbfx x0,x0,#0x6,#0x1a
00a2ba34	add x0,x8,x0, LSL #0x3
00a2ba38	ldr x1,[x0, #0x8]
00a2ba3c	eor x18,x1,x18
00a2ba40	str x18,[x0, #0x8]
00a2ba44	ldr w18,[x17], #0x4
00a2ba48	cbnz w18,0x00a2b9f4
00a2ba4c	ldr x17,[x8, x10, LSL #0x3]
00a2ba50	lsr x12,x17,x11
00a2ba54	cbnz x12,0x00a2b9c8
00a2ba58	mov x0,x19
00a2ba5c	bl 0x00c38e40
00a2ba60	mov w0,#0x1
00a2ba64	ldp x29,x30,[sp, #0x20]
00a2ba68	ldp x20,x19,[sp, #0x10]
00a2ba6c	ldr x21,[sp], #0x30
00a2ba70	ret

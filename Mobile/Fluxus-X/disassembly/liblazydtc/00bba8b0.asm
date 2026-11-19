; ZSTD_buildFSETable @ 00bba8b0
00bba8b0	str x25,[sp, #-0x40]!
00bba8b4	stp x24,x23,[sp, #0x10]
00bba8b8	stp x22,x21,[sp, #0x20]
00bba8bc	stp x20,x19,[sp, #0x30]
00bba8c0	mov w12,#0x1
00bba8c4	adds w11,w2,#0x1
00bba8c8	add x9,x0,#0x8
00bba8cc	lsl w8,w12,w5
00bba8d0	sub w10,w8,#0x1
00bba8d4	b.cc 0x00bba8ec
00bba8d8	lsr w11,w8,#0x3
00bba8dc	stp w12,w5,[x0]
00bba8e0	add w11,w11,w8, LSR #0x1
00bba8e4	add w14,w11,#0x3
00bba8e8	b 0x00bbaa6c
00bba8ec	sub w12,w5,#0x1
00bba8f0	mov w13,#0x10000
00bba8f4	mov x14,xzr
00bba8f8	lsl w12,w13,w12
00bba8fc	mov w15,#0x1
00bba900	mov w13,w10
00bba904	asr w16,w12,#0x10
00bba908	add x12,x6,#0x6a
00bba90c	b 0x00bba92c
00bba910	cmp w16,w17
00bba914	and w17,w17,#0xffff
00bba918	csel w15,w15,wzr,gt
00bba91c	strh w17,[x6, x14, LSL #0x1]
00bba920	add x14,x14,#0x1
00bba924	cmp x11,x14
00bba928	b.eq 0x00bba94c
00bba92c	ldrsh w17,[x1, x14, LSL #0x1]
00bba930	cmn w17,#0x1
00bba934	b.ne 0x00bba910
00bba938	add x17,x9,w13, UXTW  #0x3
00bba93c	sub w13,w13,#0x1
00bba940	str w14,[x17, #0x4]
00bba944	mov w17,#0x1
00bba948	b 0x00bba91c
00bba94c	lsr w17,w8,#0x3
00bba950	cmp w13,w10
00bba954	stp w15,w5,[x0]
00bba958	b.ne 0x00bbaa10
00bba95c	mov x13,xzr
00bba960	mov x14,xzr
00bba964	mov x16,xzr
00bba968	add w15,w17,#0x3
00bba96c	add x17,x6,#0x82
00bba970	mov w2,#0x10
00bba974	orr x7,xzr,#0x101010101010101
00bba978	b 0x00bba990
00bba97c	add x13,x13,#0x1
00bba980	add x14,x14,x19
00bba984	add x16,x16,x7
00bba988	cmp x13,x11
00bba98c	b.eq 0x00bbaa68
00bba990	ldrsh x19,[x1, x13, LSL #0x1]
00bba994	add x20,x12,x14
00bba998	str x16,[x20]
00bba99c	cmp x19,#0x9
00bba9a0	b.lt 0x00bba97c
00bba9a4	cmp x19,#0x10
00bba9a8	csel x21,x19,x2,hi
00bba9ac	sub x21,x21,#0x9
00bba9b0	cmp x21,#0x18
00bba9b4	b.cs 0x00bba9c0
00bba9b8	mov w21,#0x8
00bba9bc	b 0x00bba9fc
00bba9c0	lsr x21,x21,#0x3
00bba9c4	dup v0.2D,x16
00bba9c8	add x22,x21,#0x1
00bba9cc	mov w21,#0x8
00bba9d0	and x23,x22,#0x3ffffffffffffffc
00bba9d4	lsr x24,x23,#0x2
00bba9d8	mov x25,x23
00bba9dc	bfm x21,x24,#0x3b,#0x3a
00bba9e0	add x24,x17,x14
00bba9e4	subs x25,x25,#0x4
00bba9e8	stp q0,q0,[x24, #-0x10]
00bba9ec	add x24,x24,#0x20
00bba9f0	b.ne 0x00bba9e4
00bba9f4	cmp x22,x23
00bba9f8	b.eq 0x00bba97c
00bba9fc	str x16,[x20, x21#0x0]
00bbaa00	add x21,x21,#0x8
00bbaa04	cmp x21,x19
00bbaa08	b.cc 0x00bba9fc
00bbaa0c	b 0x00bba97c
00bbaa10	add w15,w17,w8, LSR #0x1
00bbaa14	mov x12,xzr
00bbaa18	mov w14,wzr
00bbaa1c	add w15,w15,#0x3
00bbaa20	b 0x00bbaa30
00bbaa24	add x12,x12,#0x1
00bbaa28	cmp x12,x11
00bbaa2c	b.eq 0x00bbaab8
00bbaa30	ldrsh w16,[x1, x12, LSL #0x1]
00bbaa34	cmp w16,#0x1
00bbaa38	b.lt 0x00bbaa24
00bbaa3c	mov w17,wzr
00bbaa40	add x2,x9,w14, UXTW  #0x3
00bbaa44	str w12,[x2, #0x4]
00bbaa48	add w14,w15,w14
00bbaa4c	and w14,w14,w10
00bbaa50	cmp w14,w13
00bbaa54	b.hi 0x00bbaa48
00bbaa58	add w17,w17,#0x1
00bbaa5c	cmp w17,w16
00bbaa60	b.ne 0x00bbaa40
00bbaa64	b 0x00bbaa24
00bbaa68	add w14,w15,w8, LSR #0x1
00bbaa6c	ubfiz x13,x14,#0x1,#0x20
00bbaa70	mov x11,xzr
00bbaa74	mov x12,xzr
00bbaa78	mov w14,w14
00bbaa7c	and x15,x12,x10
00bbaa80	add x16,x6,x11
00bbaa84	add w1,w12,w14
00bbaa88	ldrb w17,[x16, #0x6a]
00bbaa8c	add x15,x9,x15, LSL #0x3
00bbaa90	add x11,x11,#0x2
00bbaa94	add w12,w12,w13
00bbaa98	cmp x11,x8
00bbaa9c	str w17,[x15, #0x4]
00bbaaa0	and x15,x1,x10
00bbaaa4	and x12,x12,x10
00bbaaa8	ldrb w16,[x16, #0x6b]
00bbaaac	add x15,x9,x15, LSL #0x3
00bbaab0	str w16,[x15, #0x4]
00bbaab4	b.cc 0x00bbaa7c
00bbaab8	sub w9,w5,#0x1f
00bbaabc	add x10,x0,#0xc
00bbaac0	mov x11,x8
00bbaac4	ldr w12,[x10]
00bbaac8	subs x11,x11,#0x1
00bbaacc	ldrh w13,[x6, x12, LSL #0x1]
00bbaad0	clz w14,w13
00bbaad4	add w14,w9,w14
00bbaad8	lsl w15,w13,w14
00bbaadc	add w13,w13,#0x1
00bbaae0	strh w13,[x6, x12, LSL #0x1]
00bbaae4	sturb w14,[x10, #-0x1]
00bbaae8	sub w13,w15,w8
00bbaaec	sturh w13,[x10, #-0x4]
00bbaaf0	ldrb w13,[x4, x12]
00bbaaf4	ldr w12,[x3, x12, LSL #0x2]
00bbaaf8	sturb w13,[x10, #-0x2]
00bbaafc	str w12,[x10], #0x8
00bbab00	b.ne 0x00bbaac4
00bbab04	ldp x20,x19,[sp, #0x30]
00bbab08	ldp x22,x21,[sp, #0x20]
00bbab0c	ldp x24,x23,[sp, #0x10]
00bbab10	ldr x25,[sp], #0x40
00bbab14	ret

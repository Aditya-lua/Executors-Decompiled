; ossl_asn1_time_to_tm @ 009ee624
009ee624	sub sp,sp,#0xc0
009ee628	stp x28,x27,[sp, #0x60]
009ee62c	stp x26,x25,[sp, #0x70]
009ee630	stp x24,x23,[sp, #0x80]
009ee634	stp x22,x21,[sp, #0x90]
009ee638	stp x20,x19,[sp, #0xa0]
009ee63c	stp x29,x30,[sp, #0xb0]
009ee640	ldr w8,[x1, #0x4]
009ee644	mov x20,x1
009ee648	mov x11,x0
009ee64c	add x29,sp,#0xb0
009ee650	cmp w8,#0x18
009ee654	b.eq 0x009ee680
009ee658	cmp w8,#0x17
009ee65c	mov w0,wzr
009ee660	b.ne 0x009eeab0
009ee664	ldr x9,[x20, #0x10]
009ee668	mov w28,#0x5
009ee66c	orr w10,wzr,#0x6
009ee670	and x13,x9,#0x100
009ee674	lsr x9,x13,#0x7
009ee678	add w9,w9,#0xb
009ee67c	b 0x009ee69c
009ee680	ldr x9,[x20, #0x10]
009ee684	mov w10,#0xd
009ee688	orr w28,wzr,#0x6
009ee68c	and x13,x9,#0x100
009ee690	lsr x9,x13,#0x7
009ee694	orr w9,w9,w10
009ee698	orr w10,wzr,#0x7
009ee69c	str w10,[sp, #0x24]
009ee6a0	ldr w10,[x20]
009ee6a4	ldr x12,[x20, #0x8]
009ee6a8	mov w0,wzr
009ee6ac	movi v0.2D,#0x0
009ee6b0	cmp w10,w9
009ee6b4	str xzr,[sp, #0x58]
009ee6b8	stur q0,[sp, #0x48]
009ee6bc	stur q0,[sp, #0x38]
009ee6c0	stur q0,[sp, #0x28]
009ee6c4	b.lt 0x009eeab0
009ee6c8	cmp x13,#0x0
009ee6cc	cset w9,eq
009ee6d0	mov w19,wzr
009ee6d4	mov x24,xzr
009ee6d8	mov w25,wzr
009ee6dc	add x26,x12,#0x1
009ee6e0	sub x22,x10,#0x1
009ee6e4	sub x21,x10,#0x2
009ee6e8	eor w23,w9,#0x1
009ee6ec	stp x10,x11,[sp, #0x10]
009ee6f0	str wzr,[sp, #0x20]
009ee6f4	stp x13,x12,[sp]
009ee6f8	add x27,x26,x24
009ee6fc	ldurb w0,[x27, #-0x1]
009ee700	cmp w28,#0x0
009ee704	cset w9,ne
009ee708	orr w9,w9,w23
009ee70c	tbnz w9,#0x0,0x009ee734
009ee710	sub w9,w0,#0x2b
009ee714	cmp w9,#0x2f
009ee718	b.hi 0x009ee734
009ee71c	mov w10,#0x1
009ee720	lsl x9,x10,x9
009ee724	mov x10,#0x800000008000
009ee728	movk x10,#0x5
009ee72c	tst x9,x10
009ee730	b.ne 0x009ee9f4
009ee734	bl 0x00c379b0
009ee738	cbz w0,0x009eeab0
009ee73c	cmp x22,x24
009ee740	b.eq 0x009eeaac
009ee744	ldrb w0,[x26, x24]
009ee748	ldurb w27,[x27, #-0x1]
009ee74c	bl 0x00c379b0
009ee750	cbz w0,0x009eeab0
009ee754	cmp x21,x24
009ee758	b.eq 0x009eeaac
009ee75c	ldr w8,[x20, #0x4]
009ee760	ldrb w9,[x26, x24]
009ee764	adrp x10,0x74d000
009ee768	add x10,x10,#0xed8
009ee76c	cmp w8,#0x17
009ee770	cinc w11,w25,eq
009ee774	ldr w12,[x10, w11, UXTW #0x2]
009ee778	mov w10,#0xa
009ee77c	madd w9,w27,w10,w9
009ee780	sub w10,w9,#0x210
009ee784	cmp w10,w12
009ee788	b.lt 0x009eeaac
009ee78c	adrp x12,0x74d000
009ee790	add x12,x12,#0xefc
009ee794	ldr w12,[x12, x11, LSL #0x2]
009ee798	cmp w10,w12
009ee79c	b.gt 0x009eeaac
009ee7a0	and w12,w11,#0x7fffffff
009ee7a4	cmp w12,#0x6
009ee7a8	b.hi 0x009ee9dc
009ee7ac	adrp x12,0x74d000
009ee7b0	and x11,x11,#0x7fffffff
009ee7b4	add x12,x12,#0xebc
009ee7b8	ldrsw x11,[x12, x11, LSL #0x2]
009ee7bc	sub w9,w9,#0x1e0
009ee7c0	add x11,x11,x12
009ee7c4	br x11
009ee7c8	mov w9,#0x64
009ee7cc	mul w9,w10,w9
009ee7d0	sub w9,w9,#0x76c
009ee7d4	b 0x009ee878
009ee7d8	cmp w8,#0x17
009ee7dc	b.ne 0x009ee870
009ee7e0	add w11,w9,#0x34
009ee7e4	cmp w9,#0x62
009ee7e8	csel w9,w11,w10,lt
009ee7ec	b 0x009ee878
009ee7f0	sub w19,w9,#0x31
009ee7f4	str w19,[sp, #0x38]
009ee7f8	b 0x009ee9dc
009ee7fc	cmp w19,#0x1
009ee800	b.ne 0x009ee884
009ee804	ldr w11,[sp, #0x20]
009ee808	mov w12,#0x851f
009ee80c	movk w12,#0x51eb, LSL #16
009ee810	mov w15,#0x190
009ee814	add w11,w11,#0x76c
009ee818	smull x13,w11,w12
009ee81c	lsr x12,x13,#0x3f
009ee820	asr x14,x13,#0x27
009ee824	add w14,w14,w12
009ee828	msub w14,w14,w15,w11
009ee82c	cbz w14,0x009ee89c
009ee830	asr x13,x13,#0x25
009ee834	add w12,w13,w12
009ee838	mov w13,#0x64
009ee83c	msub w12,w12,w13,w11
009ee840	cmp w12,#0x0
009ee844	cset w12,ne
009ee848	tst w11,#0x3
009ee84c	cset w11,eq
009ee850	and w11,w12,w11
009ee854	b 0x009ee8a0
009ee858	str w10,[sp, #0x30]
009ee85c	b 0x009ee9dc
009ee860	str w10,[sp, #0x2c]
009ee864	b 0x009ee9dc
009ee868	str w10,[sp, #0x28]
009ee86c	b 0x009ee9dc
009ee870	ldr w9,[sp, #0x20]
009ee874	add w9,w9,w10
009ee878	str w9,[sp, #0x20]
009ee87c	str w9,[sp, #0x3c]
009ee880	b 0x009ee9dc
009ee884	adrp x11,0x74d000
009ee888	add x11,x11,#0xf20
009ee88c	ldr w11,[x11, w19, SXTW #0x2]
009ee890	cmp w10,w11
009ee894	b.le 0x009ee8ac
009ee898	b 0x009eeaac
009ee89c	mov w11,#0x1
009ee8a0	orr w11,w11,#0x1c
009ee8a4	cmp w10,w11
009ee8a8	b.gt 0x009eeaac
009ee8ac	adrp x11,0x74d000
009ee8b0	add x11,x11,#0xf80
009ee8b4	ldr w11,[x11, w19, SXTW #0x2]
009ee8b8	str w10,[sp, #0x34]
009ee8bc	cmp w19,#0x2
009ee8c0	add w10,w9,w11
009ee8c4	sub w11,w10,#0x31
009ee8c8	str w11,[sp, #0x44]
009ee8cc	b.lt 0x009ee924
009ee8d0	ldr w10,[sp, #0x20]
009ee8d4	mov w12,#0x851f
009ee8d8	movk w12,#0x51eb, LSL #16
009ee8dc	mov w15,#0x190
009ee8e0	add w10,w10,#0x76c
009ee8e4	smull x13,w10,w12
009ee8e8	lsr x12,x13,#0x3f
009ee8ec	asr x14,x13,#0x27
009ee8f0	add w14,w14,w12
009ee8f4	msub w14,w14,w15,w10
009ee8f8	cbz w14,0x009ee934
009ee8fc	asr x13,x13,#0x25
009ee900	add w12,w13,w12
009ee904	mov w13,#0x64
009ee908	msub w12,w12,w13,w10
009ee90c	cmp w12,#0x0
009ee910	cset w12,ne
009ee914	tst w10,#0x3
009ee918	cset w13,eq
009ee91c	and w12,w12,w13
009ee920	b 0x009ee938
009ee924	ldr w10,[sp, #0x20]
009ee928	add w11,w19,#0xe
009ee92c	add w10,w10,#0x76b
009ee930	b 0x009ee944
009ee934	mov w12,#0x1
009ee938	add w11,w12,w11
009ee93c	str w11,[sp, #0x44]
009ee940	add w11,w19,#0x2
009ee944	mov w12,#0x851f
009ee948	mov w13,#0xd
009ee94c	mov w14,#0x6667
009ee950	movk w12,#0x51eb, LSL #16
009ee954	mul w11,w11,w13
009ee958	movk w14,#0x6666, LSL #16
009ee95c	smull x12,w10,w12
009ee960	smull x11,w11,w14
009ee964	lsr x13,x12,#0x20
009ee968	lsr x12,x12,#0x3f
009ee96c	lsr x15,x11,#0x20
009ee970	lsr x11,x11,#0x3f
009ee974	add w14,w12,w13, ASR #0x5
009ee978	add w12,w12,w13, ASR #0x7
009ee97c	mov w13,#0x64
009ee980	add w11,w11,w15, ASR #0x1
009ee984	msub w10,w14,w13,w10
009ee988	add w9,w9,w11
009ee98c	add w13,w14,w14, LSL #0x2
009ee990	add w14,w10,#0x3
009ee994	cmp w10,#0x0
009ee998	add w9,w9,w10
009ee99c	csel w11,w14,w10,lt
009ee9a0	add w9,w9,w12
009ee9a4	add w9,w9,w11, ASR #0x2
009ee9a8	add w9,w9,w13
009ee9ac	mov w10,#0x2493
009ee9b0	sub w9,w9,#0x2a
009ee9b4	movk w10,#0x9249, LSL #16
009ee9b8	smull x10,w9,w10
009ee9bc	lsr x10,x10,#0x20
009ee9c0	add w10,w10,w9
009ee9c4	asr w11,w10,#0x2
009ee9c8	add w10,w11,w10, LSR #0x1f
009ee9cc	lsl w11,w10,#0x3
009ee9d0	sub w10,w11,w10
009ee9d4	sub w9,w9,w10
009ee9d8	str w9,[sp, #0x40]
009ee9dc	ldr w9,[sp, #0x24]
009ee9e0	add w25,w25,#0x1
009ee9e4	add x24,x24,#0x2
009ee9e8	sub w28,w28,#0x1
009ee9ec	cmp w25,w9
009ee9f0	b.cc 0x009ee6f8
009ee9f4	ldp x21,x26,[sp, #0x10]
009ee9f8	ldp x22,x23,[sp]
009ee9fc	cmp w8,#0x18
009eea00	b.ne 0x009eea64
009eea04	ldrb w8,[x23, w24, UXTW ]
009eea08	cmp w8,#0x2e
009eea0c	b.ne 0x009eea64
009eea10	mov w0,wzr
009eea14	cbnz x22,0x009eeab0
009eea18	orr w19,w24,#0x1
009eea1c	cmp w19,w21
009eea20	mov w0,wzr
009eea24	b.eq 0x009eeab0
009eea28	cmp w19,w21
009eea2c	mov w24,w19
009eea30	b.ge 0x009eea50
009eea34	mov w24,w19
009eea38	ldrb w0,[x23, x24]
009eea3c	bl 0x00c379b0
009eea40	cbz w0,0x009eea50
009eea44	add x24,x24,#0x1
009eea48	cmp w21,w24
009eea4c	b.gt 0x009eea38
009eea50	cmp w19,w24
009eea54	b.eq 0x009eeaac
009eea58	cmp w24,w21
009eea5c	mov w0,wzr
009eea60	b.eq 0x009eeab0
009eea64	ldrb w8,[x23, w24, SXTW ]
009eea68	cmp w8,#0x5a
009eea6c	b.ne 0x009eead0
009eea70	add w20,w24,#0x1
009eea74	cmp w20,w21
009eea78	mov w0,wzr
009eea7c	b.ne 0x009eeab0
009eea80	cbz x26,0x009eeaa4
009eea84	ldr x8,[sp, #0x58]
009eea88	str x8,[x26, #0x30]
009eea8c	ldur q0,[sp, #0x48]
009eea90	str q0,[x26, #0x20]
009eea94	ldur q0,[sp, #0x38]
009eea98	str q0,[x26, #0x10]
009eea9c	ldur q0,[sp, #0x28]
009eeaa0	str q0,[x26]
009eeaa4	mov w0,#0x1
009eeaa8	b 0x009eeab0
009eeaac	mov w0,wzr
009eeab0	ldp x29,x30,[sp, #0xb0]
009eeab4	ldp x20,x19,[sp, #0xa0]
009eeab8	ldp x22,x21,[sp, #0x90]
009eeabc	ldp x24,x23,[sp, #0x80]
009eeac0	ldp x26,x25,[sp, #0x70]
009eeac4	ldp x28,x27,[sp, #0x60]
009eeac8	add sp,sp,#0xc0
009eeacc	ret
009eead0	mov w0,wzr
009eead4	cbnz x22,0x009eeab0
009eead8	cmp w8,#0x2d
009eeadc	b.eq 0x009eeaec
009eeae0	cmp w8,#0x2b
009eeae4	mov w0,wzr
009eeae8	b.ne 0x009eeab0
009eeaec	cmp w8,#0x2d
009eeaf0	mov w8,#0x1
009eeaf4	add w9,w24,#0x5
009eeaf8	cneg w19,w8,ne
009eeafc	cmp w9,w21
009eeb00	mov w0,wzr
009eeb04	b.ne 0x009eeab0
009eeb08	add w8,w24,#0x1
009eeb0c	sxtw x22,w8
009eeb10	ldrb w0,[x23, x22]
009eeb14	bl 0x00c379b0
009eeb18	cbz w0,0x009eeab0
009eeb1c	add x25,x22,#0x1
009eeb20	ldrb w0,[x23, x25]
009eeb24	ldrb w21,[x23, x22]
009eeb28	mov x27,x23
009eeb2c	bl 0x00c379b0
009eeb30	cbz w0,0x009eeab0
009eeb34	ldr w8,[x20, #0x4]
009eeb38	ldr w10,[sp, #0x24]
009eeb3c	ldrb w9,[x27, x25]
009eeb40	mov w11,#0xa
009eeb44	cmp w8,#0x17
009eeb48	add w23,w10,#0x1
009eeb4c	csel w8,w23,w10,eq
009eeb50	adrp x10,0x74d000
009eeb54	add x10,x10,#0xed8
009eeb58	ldr w10,[x10, w8, UXTW #0x2]
009eeb5c	madd w9,w21,w11,w9
009eeb60	sub w21,w9,#0x210
009eeb64	mov w0,wzr
009eeb68	cmp w21,w10
009eeb6c	b.lt 0x009eeab0
009eeb70	adrp x9,0x74d000
009eeb74	add x9,x9,#0xefc
009eeb78	ldr w8,[x9, x8, LSL #0x2]
009eeb7c	mov w0,wzr
009eeb80	cmp w21,w8
009eeb84	b.gt 0x009eeab0
009eeb88	add x25,x22,#0x2
009eeb8c	ldrb w0,[x27, x25]
009eeb90	bl 0x00c379b0
009eeb94	cbz w0,0x009eeab0
009eeb98	add x22,x22,#0x3
009eeb9c	ldrb w0,[x27, x22]
009eeba0	ldrb w25,[x27, x25]
009eeba4	bl 0x00c379b0
009eeba8	cbz w0,0x009eeab0
009eebac	ldr w8,[x20, #0x4]
009eebb0	ldr w9,[sp, #0x24]
009eebb4	ldrb w10,[x27, x22]
009eebb8	mov w0,wzr
009eebbc	cmp w8,#0x17
009eebc0	add w9,w9,#0x2
009eebc4	adrp x8,0x74d000
009eebc8	csel w9,w9,w23,eq
009eebcc	add x8,x8,#0xed8
009eebd0	ldr w11,[x8, w9, UXTW #0x2]
009eebd4	mov w8,#0xa
009eebd8	madd w8,w25,w8,w10
009eebdc	sub w8,w8,#0x210
009eebe0	cmp w8,w11
009eebe4	b.lt 0x009eeab0
009eebe8	adrp x10,0x74d000
009eebec	add x10,x10,#0xefc
009eebf0	ldr w9,[x10, x9, LSL #0x2]
009eebf4	mov w0,wzr
009eebf8	cmp w8,w9
009eebfc	b.gt 0x009eeab0
009eec00	add w20,w24,#0x5
009eec04	cbz x26,0x009eec3c
009eec08	mov w9,#0xe10
009eec0c	mul w9,w21,w9
009eec10	orr w10,wzr,#0x3c
009eec14	madd w8,w8,w10,w9
009eec18	cbz w8,0x009eec3c
009eec1c	mul w8,w8,w19
009eec20	sxtw x2,w8
009eec24	add x0,sp,#0x28
009eec28	mov w1,wzr
009eec2c	bl 0x00c37990
009eec30	ldp x21,x26,[sp, #0x10]
009eec34	cbnz w0,0x009eea74
009eec38	b 0x009eeab0
009eec3c	ldp x21,x26,[sp, #0x10]
009eec40	b 0x009eea74

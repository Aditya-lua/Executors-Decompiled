; ossl_aria_set_encrypt_key @ 00a8c5dc
00a8c5dc	sub sp,sp,#0xb0
00a8c5e0	add w9,w1,#0x100
00a8c5e4	add w10,w1,#0x11f
00a8c5e8	cmp w9,#0x0
00a8c5ec	mov x8,x0
00a8c5f0	csel w11,w10,w9,lt
00a8c5f4	mov w0,#0xffffffff
00a8c5f8	stp x28,x27,[sp, #0x50]
00a8c5fc	stp x26,x25,[sp, #0x60]
00a8c600	stp x24,x23,[sp, #0x70]
00a8c604	stp x22,x21,[sp, #0x80]
00a8c608	stp x20,x19,[sp, #0x90]
00a8c60c	stp x29,x30,[sp, #0xa0]
00a8c610	cbz x8,0x00a8ce68
00a8c614	cbz x2,0x00a8ce68
00a8c618	subs w10,w1,#0x80
00a8c61c	b.eq 0x00a8c630
00a8c620	cmp w1,#0x100
00a8c624	b.eq 0x00a8c630
00a8c628	cmp w1,#0xc0
00a8c62c	b.ne 0x00a8c880
00a8c630	asr w11,w11,#0x5
00a8c634	str w11,[x2, #0x110]
00a8c638	ldrb w20,[x8]
00a8c63c	ldrb w21,[x8, #0x4]
00a8c640	ldrb w22,[x8, #0x8]
00a8c644	sub w12,w1,#0x41
00a8c648	cmp w10,#0x0
00a8c64c	ldrb w14,[x8, #0x5]
00a8c650	ldrb w16,[x8, #0x9]
00a8c654	ldrb w25,[x8, #0xc]
00a8c658	adrp x26,0x76a000
00a8c65c	csel w10,w12,w10,lt
00a8c660	ldrb w12,[x8, #0x1]
00a8c664	ldrb w0,[x8, #0xd]
00a8c668	add x26,x26,#0x4d0
00a8c66c	asr w11,w10,#0x6
00a8c670	ldrb w15,[x8, #0x6]
00a8c674	ldrb w17,[x8, #0xa]
00a8c678	ldrb w7,[x8, #0xe]
00a8c67c	ldrb w13,[x8, #0x2]
00a8c680	ldrb w18,[x8, #0x3]
00a8c684	ldrb w3,[x8, #0x7]
00a8c688	ldrb w4,[x8, #0xb]
00a8c68c	ldrb w19,[x8, #0xf]
00a8c690	add x11,x26,w11, SXTW  #0x4
00a8c694	stp w21,w20,[sp, #0x28]
00a8c698	lsl w21,w21,#0x18
00a8c69c	str w22,[sp, #0x24]
00a8c6a0	lsl w22,w22,#0x18
00a8c6a4	ldp w26,w28,[x11]
00a8c6a8	ldp w29,w11,[x11, #0x8]
00a8c6ac	lsl w20,w20,#0x18
00a8c6b0	lsl w30,w25,#0x18
00a8c6b4	bfm w21,w14,#0x10,#0x7
00a8c6b8	bfm w22,w16,#0x10,#0x7
00a8c6bc	bfm w20,w12,#0x10,#0x7
00a8c6c0	bfm w30,w0,#0x10,#0x7
00a8c6c4	mov w14,w21
00a8c6c8	mov w0,w22
00a8c6cc	mov w12,w20
00a8c6d0	str w30,[sp, #0xc]
00a8c6d4	bfm w14,w15,#0x18,#0x7
00a8c6d8	bfm w0,w17,#0x18,#0x7
00a8c6dc	bfm w30,w7,#0x18,#0x7
00a8c6e0	bfm w12,w13,#0x18,#0x7
00a8c6e4	orr w13,w14,w3
00a8c6e8	orr w14,w0,w4
00a8c6ec	orr w15,w30,w19
00a8c6f0	adrp x24,0x769000
00a8c6f4	adrp x23,0x769000
00a8c6f8	orr w12,w12,w18
00a8c6fc	eor w17,w28,w13
00a8c700	eor w0,w29,w14
00a8c704	eor w11,w11,w15
00a8c708	add x24,x24,#0x4d0
00a8c70c	add x23,x23,#0x8d0
00a8c710	stp w4,w3,[sp, #0x48]
00a8c714	stp w18,w12,[sp, #0x30]
00a8c718	lsr w28,w17,#0x18
00a8c71c	ubfx w29,w17,#0x10,#0x8
00a8c720	lsr w30,w0,#0x18
00a8c724	ubfx w18,w0,#0x10,#0x8
00a8c728	lsr w3,w11,#0x18
00a8c72c	ubfx w4,w11,#0x10,#0x8
00a8c730	ldr w28,[x24, w28, UXTW #0x2]
00a8c734	ldr w29,[x23, w29, UXTW #0x2]
00a8c738	ldr w30,[x24, w30, UXTW #0x2]
00a8c73c	ldr w18,[x23, w18, UXTW #0x2]
00a8c740	ldr w3,[x24, w3, UXTW #0x2]
00a8c744	ldr w4,[x23, w4, UXTW #0x2]
00a8c748	eor w12,w26,w12
00a8c74c	stp w15,w14,[sp, #0x38]
00a8c750	lsr w7,w12,#0x18
00a8c754	ubfx w26,w12,#0x10,#0x8
00a8c758	adrp x14,0x769000
00a8c75c	stp w20,w25,[sp, #0x18]
00a8c760	stp w13,w19,[sp, #0x40]
00a8c764	ldr w7,[x24, w7, UXTW #0x2]
00a8c768	ldr w26,[x23, w26, UXTW #0x2]
00a8c76c	eor w28,w29,w28
00a8c770	eor w18,w18,w30
00a8c774	eor w3,w4,w3
00a8c778	add x14,x14,#0xcd0
00a8c77c	ubfx w4,w12,#0x8,#0x8
00a8c780	ubfx w29,w17,#0x8,#0x8
00a8c784	ubfx w30,w0,#0x8,#0x8
00a8c788	ubfx w25,w11,#0x8,#0x8
00a8c78c	adrp x13,0x76a000
00a8c790	ldr w4,[x14, w4, UXTW #0x2]
00a8c794	ldr w29,[x14, w29, UXTW #0x2]
00a8c798	ldr w30,[x14, w30, UXTW #0x2]
00a8c79c	ldr w25,[x14, w25, UXTW #0x2]
00a8c7a0	and w17,w17,#0xff
00a8c7a4	and w0,w0,#0xff
00a8c7a8	and w11,w11,#0xff
00a8c7ac	add x13,x13,#0xd0
00a8c7b0	and w12,w12,#0xff
00a8c7b4	ldr w17,[x13, w17, UXTW #0x2]
00a8c7b8	ldr w0,[x13, w0, UXTW #0x2]
00a8c7bc	ldr w11,[x13, w11, UXTW #0x2]
00a8c7c0	ldr w12,[x13, w12, UXTW #0x2]
00a8c7c4	eor w7,w26,w7
00a8c7c8	eor w4,w7,w4
00a8c7cc	eor w7,w28,w29
00a8c7d0	eor w18,w18,w30
00a8c7d4	eor w3,w3,w25
00a8c7d8	eor w17,w7,w17
00a8c7dc	eor w18,w18,w0
00a8c7e0	eor w11,w3,w11
00a8c7e4	eor w12,w4,w12
00a8c7e8	eor w17,w17,w18
00a8c7ec	eor w18,w11,w18
00a8c7f0	eor w0,w17,w12
00a8c7f4	eor w12,w18,w12
00a8c7f8	eor w11,w11,w17
00a8c7fc	lsl w17,w12,#0x8
00a8c800	lsr w12,w12,#0x8
00a8c804	and w17,w17,#0xff00ff00
00a8c808	and w12,w12,#0xff00ff
00a8c80c	orr w12,w17,w12
00a8c810	eor w17,w18,w0
00a8c814	ror w17,w17,#0x10
00a8c818	rev w11,w11
00a8c81c	eor w12,w12,w17
00a8c820	eor w18,w17,w11
00a8c824	eor w7,w12,w0
00a8c828	mov w5,wzr
00a8c82c	mov w9,wzr
00a8c830	mov w6,wzr
00a8c834	mov w27,wzr
00a8c838	stp w22,w21,[sp, #0x10]
00a8c83c	orr w22,wzr,#0xff00ff00
00a8c840	cmp w1,#0x81
00a8c844	sbfx x10,x10,#0x6,#0x1a
00a8c848	eor w11,w12,w11
00a8c84c	eor w17,w18,w0
00a8c850	eor w12,w7,w18
00a8c854	orr w21,wzr,#0xff00ff
00a8c858	b.lt 0x00a8c890
00a8c85c	ldp w9,w18,[x8, #0x10]
00a8c860	cmp w1,#0xc1
00a8c864	rev w5,w9
00a8c868	rev w9,w18
00a8c86c	b.lt 0x00a8c888
00a8c870	ldp w18,w8,[x8, #0x18]
00a8c874	rev w6,w18
00a8c878	rev w27,w8
00a8c87c	b 0x00a8c890
00a8c880	orr w0,wzr,#0xfffffffe
00a8c884	b 0x00a8ce68
00a8c888	mov w6,wzr
00a8c88c	mov w27,wzr
00a8c890	adrp x8,0x76a000
00a8c894	add x8,x8,#0x4d0
00a8c898	add x29,x8,x10, LSL #0x4
00a8c89c	ldp w0,w8,[sp, #0x34]
00a8c8a0	ldp w16,w15,[sp, #0x3c]
00a8c8a4	eor w7,w5,w7
00a8c8a8	eor w5,w17,w9
00a8c8ac	eor w6,w12,w6
00a8c8b0	str w1,[sp, #0x20]
00a8c8b4	eor w1,w11,w27
00a8c8b8	ldp w30,w25,[x29, #0x10]
00a8c8bc	eor w18,w15,w7, LSL #0xd
00a8c8c0	eor w10,w16,w5, LSL #0xd
00a8c8c4	eor w11,w8,w6, LSL #0xd
00a8c8c8	eor w3,w0,w7, LSR #0x1f
00a8c8cc	eor w17,w0,w7, LSR #0x13
00a8c8d0	eor w4,w15,w7, LSL #0x1
00a8c8d4	eor w12,w16,w5, LSL #0x1
00a8c8d8	eor w18,w18,w5, LSR #0x13
00a8c8dc	eor w10,w10,w6, LSR #0x13
00a8c8e0	eor w11,w11,w1, LSR #0x13
00a8c8e4	eor w3,w3,w1, LSL #0x1
00a8c8e8	ldp w27,w9,[x29, #0x18]
00a8c8ec	eor w17,w17,w1, LSL #0xd
00a8c8f0	str w18,[x2, #0x4]
00a8c8f4	eor w18,w0,w5, LSL #0x1d
00a8c8f8	str w10,[x2, #0x8]
00a8c8fc	eor w10,w15,w6, LSL #0x1d
00a8c900	str w11,[x2, #0xc]
00a8c904	eor w11,w16,w7, LSR #0x3
00a8c908	str w3,[x2, #0x40]
00a8c90c	eor w3,w8,w7, LSL #0x1d
00a8c910	eor w4,w4,w5, LSR #0x1f
00a8c914	eor w12,w12,w6, LSR #0x1f
00a8c918	str w17,[x2]
00a8c91c	eor w17,w8,w6, LSL #0x1
00a8c920	str w4,[x2, #0x44]
00a8c924	eor w4,w0,w7, LSL #0x1f
00a8c928	str w12,[x2, #0x48]
00a8c92c	eor w12,w15,w5, LSL #0x1f
00a8c930	eor w18,w18,w6, LSR #0x3
00a8c934	eor w10,w10,w1, LSR #0x3
00a8c938	eor w11,w11,w1, LSL #0x1d
00a8c93c	eor w3,w3,w5, LSR #0x3
00a8c940	str wzr,[sp, #0x8]
00a8c944	eor w17,w17,w1, LSR #0x1f
00a8c948	eor w4,w4,w5, LSR #0x1
00a8c94c	eor w12,w12,w6, LSR #0x1
00a8c950	stp w18,w10,[x2, #0x80]
00a8c954	stp w11,w3,[x2, #0x88]
00a8c958	eor w10,w30,w7
00a8c95c	eor w11,w25,w5
00a8c960	str w17,[x2, #0x4c]
00a8c964	stp w4,w12,[x2, #0xc0]
00a8c968	lsr w17,w10,#0x18
00a8c96c	ubfx w18,w10,#0x10,#0x8
00a8c970	lsr w4,w11,#0x18
00a8c974	ubfx w25,w11,#0x10,#0x8
00a8c978	ldr w17,[x14, w17, UXTW #0x2]
00a8c97c	ldr w18,[x13, w18, UXTW #0x2]
00a8c980	ldr w4,[x14, w4, UXTW #0x2]
00a8c984	ldr w25,[x13, w25, UXTW #0x2]
00a8c988	eor w12,w27,w6
00a8c98c	eor w9,w9,w1
00a8c990	ubfx w3,w10,#0x8,#0x8
00a8c994	lsr w27,w12,#0x18
00a8c998	ubfx w30,w12,#0x10,#0x8
00a8c99c	eor w17,w18,w17
00a8c9a0	lsr w18,w9,#0x18
00a8c9a4	eor w4,w25,w4
00a8c9a8	ubfx w25,w9,#0x10,#0x8
00a8c9ac	ldr w27,[x14, w27, UXTW #0x2]
00a8c9b0	ldr w30,[x13, w30, UXTW #0x2]
00a8c9b4	ldr w18,[x14, w18, UXTW #0x2]
00a8c9b8	ldr w25,[x13, w25, UXTW #0x2]
00a8c9bc	ldr w3,[x24, w3, UXTW #0x2]
00a8c9c0	eor w27,w30,w27
00a8c9c4	ubfx w30,w11,#0x8,#0x8
00a8c9c8	eor w18,w25,w18
00a8c9cc	ubfx w25,w12,#0x8,#0x8
00a8c9d0	eor w17,w17,w3
00a8c9d4	ubfx w3,w9,#0x8,#0x8
00a8c9d8	ldr w30,[x24, w30, UXTW #0x2]
00a8c9dc	ldr w25,[x24, w25, UXTW #0x2]
00a8c9e0	ldr w3,[x24, w3, UXTW #0x2]
00a8c9e4	and w11,w11,#0xff
00a8c9e8	and w12,w12,#0xff
00a8c9ec	and w9,w9,#0xff
00a8c9f0	and w10,w10,#0xff
00a8c9f4	ldr w11,[x23, w11, UXTW #0x2]
00a8c9f8	ldr w12,[x23, w12, UXTW #0x2]
00a8c9fc	ldr w9,[x23, w9, UXTW #0x2]
00a8ca00	ldr w10,[x23, w10, UXTW #0x2]
00a8ca04	eor w4,w4,w30
00a8ca08	eor w25,w27,w25
00a8ca0c	eor w18,w18,w3
00a8ca10	eor w11,w4,w11
00a8ca14	eor w12,w25,w12
00a8ca18	eor w9,w18,w9
00a8ca1c	eor w10,w17,w10
00a8ca20	eor w11,w11,w12
00a8ca24	eor w12,w9,w12
00a8ca28	eor w17,w11,w10
00a8ca2c	eor w10,w12,w10
00a8ca30	eor w9,w9,w11
00a8ca34	eor w11,w12,w17
00a8ca38	rev w10,w10
00a8ca3c	and w12,w22,w9, LSL #0x8
00a8ca40	and w9,w21,w9, LSR #0x8
00a8ca44	ror w17,w17,#0x10
00a8ca48	eor w10,w10,w11
00a8ca4c	ldp w30,w19,[x29, #0x20]
00a8ca50	orr w9,w12,w9
00a8ca54	eor w12,w17,w15
00a8ca58	eor w17,w10,w17
00a8ca5c	eor w11,w9,w11
00a8ca60	eor w10,w10,w8
00a8ca64	eor w25,w17,w0
00a8ca68	ldp w3,w20,[x29, #0x28]
00a8ca6c	eor w27,w12,w11
00a8ca70	eor w12,w17,w16
00a8ca74	eor w9,w10,w9
00a8ca78	eor w17,w7,w25, LSR #0x13
00a8ca7c	eor w18,w5,w25, LSL #0xd
00a8ca80	eor w17,w17,w9, LSL #0xd
00a8ca84	eor w29,w12,w11
00a8ca88	eor w11,w27,w19
00a8ca8c	eor w4,w7,w25, LSR #0x1f
00a8ca90	eor w19,w5,w25, LSL #0x1
00a8ca94	str w17,[x2, #0x10]
00a8ca98	eor w17,w6,w25, LSR #0x3
00a8ca9c	eor w18,w18,w27, LSR #0x13
00a8caa0	eor w10,w25,w30
00a8caa4	str w18,[x2, #0x14]
00a8caa8	eor w18,w1,w25, LSL #0x1d
00a8caac	eor w4,w4,w9, LSL #0x1
00a8cab0	eor w19,w19,w27, LSR #0x1f
00a8cab4	eor w17,w17,w9, LSL #0x1d
00a8cab8	eor w12,w9,w20
00a8cabc	eor w3,w29,w3
00a8cac0	str w4,[x2, #0x50]
00a8cac4	lsr w4,w10,#0x18
00a8cac8	str w19,[x2, #0x54]
00a8cacc	lsr w19,w11,#0x18
00a8cad0	str w17,[x2, #0x98]
00a8cad4	eor w18,w18,w27, LSR #0x3
00a8cad8	lsr w17,w12,#0x18
00a8cadc	ldr w4,[x24, w4, UXTW #0x2]
00a8cae0	ldr w19,[x24, w19, UXTW #0x2]
00a8cae4	str w18,[x2, #0x9c]
00a8cae8	lsr w18,w3,#0x18
00a8caec	ldr w17,[x24, w17, UXTW #0x2]
00a8caf0	ldr w18,[x24, w18, UXTW #0x2]
00a8caf4	ubfx w20,w10,#0x10,#0x8
00a8caf8	ubfx w24,w11,#0x10,#0x8
00a8cafc	ubfx w30,w12,#0x10,#0x8
00a8cb00	ubfx w21,w3,#0x10,#0x8
00a8cb04	ldr w20,[x23, w20, UXTW #0x2]
00a8cb08	ldr w24,[x23, w24, UXTW #0x2]
00a8cb0c	ldr w30,[x23, w30, UXTW #0x2]
00a8cb10	ldr w21,[x23, w21, UXTW #0x2]
00a8cb14	ubfx w23,w10,#0x8,#0x8
00a8cb18	ubfx w22,w11,#0x8,#0x8
00a8cb1c	ubfx w26,w12,#0x8,#0x8
00a8cb20	ubfx w28,w3,#0x8,#0x8
00a8cb24	and w10,w10,#0xff
00a8cb28	and w11,w11,#0xff
00a8cb2c	and w12,w12,#0xff
00a8cb30	and w3,w3,#0xff
00a8cb34	ldr w10,[x13, w10, UXTW #0x2]
00a8cb38	ldr w11,[x13, w11, UXTW #0x2]
00a8cb3c	ldr w12,[x13, w12, UXTW #0x2]
00a8cb40	ldr w3,[x13, w3, UXTW #0x2]
00a8cb44	eor w13,w6,w29, LSR #0x13
00a8cb48	eor w13,w13,w27, LSL #0xd
00a8cb4c	ldr w23,[x14, w23, UXTW #0x2]
00a8cb50	ldr w22,[x14, w22, UXTW #0x2]
00a8cb54	ldr w26,[x14, w26, UXTW #0x2]
00a8cb58	ldr w28,[x14, w28, UXTW #0x2]
00a8cb5c	str w13,[x2, #0x18]
00a8cb60	eor w13,w1,w9, LSR #0x13
00a8cb64	eor w13,w13,w29, LSL #0xd
00a8cb68	str w13,[x2, #0x1c]
00a8cb6c	eor w13,w6,w29, LSR #0x1f
00a8cb70	eor w13,w13,w27, LSL #0x1
00a8cb74	str w13,[x2, #0x58]
00a8cb78	eor w13,w1,w9, LSR #0x1f
00a8cb7c	eor w13,w13,w29, LSL #0x1
00a8cb80	str w13,[x2, #0x5c]
00a8cb84	eor w13,w7,w29, LSR #0x3
00a8cb88	eor w13,w13,w27, LSL #0x1d
00a8cb8c	str w13,[x2, #0x90]
00a8cb90	eor w13,w5,w9, LSR #0x3
00a8cb94	ldr w14,[sp, #0x18]
00a8cb98	eor w13,w13,w29, LSL #0x1d
00a8cb9c	str w13,[x2, #0x94]
00a8cba0	eor w13,w20,w4
00a8cba4	eor w13,w13,w23
00a8cba8	eor w18,w21,w18
00a8cbac	eor w10,w13,w10
00a8cbb0	eor w13,w18,w28
00a8cbb4	extr w18,w8,w14,#0x13
00a8cbb8	ldr w14,[sp, #0x14]
00a8cbbc	eor w4,w24,w19
00a8cbc0	eor w4,w4,w22
00a8cbc4	eor w11,w4,w11
00a8cbc8	extr w4,w0,w14,#0x13
00a8cbcc	ldr w14,[sp, #0x10]
00a8cbd0	eor w17,w30,w17
00a8cbd4	eor w17,w17,w26
00a8cbd8	eor w12,w17,w12
00a8cbdc	extr w19,w15,w14,#0x13
00a8cbe0	ldr w14,[sp, #0xc]
00a8cbe4	eor w13,w13,w3
00a8cbe8	eor w11,w11,w13
00a8cbec	eor w13,w12,w13
00a8cbf0	extr w20,w16,w14,#0x13
00a8cbf4	ldr w14,[sp, #0x2c]
00a8cbf8	eor w12,w12,w11
00a8cbfc	eor w11,w11,w10
00a8cc00	eor w10,w13,w10
00a8cc04	lsr w21,w14,#0x7
00a8cc08	ldr w14,[sp, #0x28]
00a8cc0c	eor w13,w13,w11
00a8cc10	rev w12,w12
00a8cc14	ror w13,w13,#0x10
00a8cc18	lsr w22,w14,#0x7
00a8cc1c	ldr w14,[sp, #0x24]
00a8cc20	str w5,[sp, #0x2c]
00a8cc24	bfm w21,w8,#0x1f,#0x1e
00a8cc28	bfm w22,w0,#0x1f,#0x1e
00a8cc2c	lsr w23,w14,#0x7
00a8cc30	ldr w14,[sp, #0x1c]
00a8cc34	bfm w23,w15,#0x1f,#0x1e
00a8cc38	lsr w24,w14,#0x7
00a8cc3c	ldr w14,[sp, #0x4c]
00a8cc40	bfm w24,w16,#0x1f,#0x1e
00a8cc44	extr w26,w14,w16,#0x3
00a8cc48	ldr w14,[sp, #0x48]
00a8cc4c	extr w3,w14,w8,#0x3
00a8cc50	orr w14,wzr,#0xff00ff00
00a8cc54	and w17,w14,w10, LSL #0x8
00a8cc58	orr w14,wzr,#0xff00ff
00a8cc5c	and w10,w14,w10, LSR #0x8
00a8cc60	ldr w14,[sp, #0x44]
00a8cc64	orr w10,w17,w10
00a8cc68	eor w17,w11,w5
00a8cc6c	mov w5,w1
00a8cc70	eor w30,w10,w13
00a8cc74	eor w13,w13,w12
00a8cc78	extr w28,w14,w0,#0x3
00a8cc7c	eor w12,w12,w5
00a8cc80	eor w14,w30,w11
00a8cc84	eor w10,w17,w13
00a8cc88	eor w13,w13,w6
00a8cc8c	eor w11,w12,w30
00a8cc90	eor w12,w13,w14
00a8cc94	eor w17,w14,w7
00a8cc98	eor w14,w18,w17
00a8cc9c	eor w18,w4,w10
00a8cca0	eor w4,w19,w12
00a8cca4	eor w19,w20,w11
00a8cca8	eor w13,w29,w10, LSL #0xd
00a8ccac	ldr w30,[sp, #0x30]
00a8ccb0	str w19,[x2, #0x3c]
00a8ccb4	eor w19,w29,w10, LSL #0x1
00a8ccb8	ldr w1,[sp, #0x20]
00a8ccbc	eor w13,w13,w12, LSR #0x13
00a8ccc0	eor w19,w19,w12, LSR #0x1f
00a8ccc4	eor w20,w22,w10
00a8ccc8	eor w21,w21,w17
00a8cccc	str w13,[x2, #0x28]
00a8ccd0	eor w13,w9,w11, LSR #0x13
00a8ccd4	ldr w0,[sp, #0x8]
00a8ccd8	str w19,[x2, #0x68]
00a8ccdc	eor w19,w9,w11, LSR #0x1f
00a8cce0	stp w21,w20,[x2, #0x70]
00a8cce4	eor w21,w25,w10, LSL #0x1d
00a8cce8	eor w20,w27,w11, LSR #0x3
00a8ccec	eor w13,w13,w12, LSL #0xd
00a8ccf0	eor w19,w19,w12, LSL #0x1
00a8ccf4	eor w22,w24,w11
00a8ccf8	eor w23,w23,w12
00a8ccfc	eor w21,w21,w12, LSR #0x3
00a8cd00	eor w20,w20,w12, LSL #0x1d
00a8cd04	str w13,[x2, #0x2c]
00a8cd08	extr w13,w30,w15,#0x3
00a8cd0c	str w14,[x2, #0x30]
00a8cd10	eor w14,w16,w6, LSL #0x1f
00a8cd14	str w18,[x2, #0x34]
00a8cd18	eor w18,w8,w7, LSR #0x1
00a8cd1c	str w4,[x2, #0x38]
00a8cd20	eor w4,w27,w10, LSR #0x13
00a8cd24	str w19,[x2, #0x6c]
00a8cd28	eor w19,w27,w10, LSR #0x1f
00a8cd2c	stp w23,w22,[x2, #0x78]
00a8cd30	eor w23,w9,w10, LSR #0x3
00a8cd34	eor w22,w25,w17, LSR #0x13
00a8cd38	str w21,[x2, #0xa0]
00a8cd3c	eor w21,w25,w17, LSR #0x1f
00a8cd40	str w20,[x2, #0xa4]
00a8cd44	eor w20,w29,w17, LSR #0x3
00a8cd48	cmp w1,#0x81
00a8cd4c	eor w14,w14,w5, LSR #0x1
00a8cd50	eor w18,w18,w5, LSL #0x1f
00a8cd54	eor w3,w3,w10
00a8cd58	eor w13,w13,w11
00a8cd5c	eor w4,w4,w17, LSL #0xd
00a8cd60	eor w19,w19,w17, LSL #0x1
00a8cd64	eor w23,w23,w17, LSL #0x1d
00a8cd68	eor w24,w26,w17
00a8cd6c	eor w26,w28,w12
00a8cd70	eor w22,w22,w11, LSL #0xd
00a8cd74	eor w21,w21,w11, LSL #0x1
00a8cd78	eor w20,w20,w11, LSL #0x1d
00a8cd7c	stp w24,w3,[x2, #0xb0]
00a8cd80	stp w26,w13,[x2, #0xb8]
00a8cd84	stp w22,w4,[x2, #0x20]
00a8cd88	stp w21,w19,[x2, #0x60]
00a8cd8c	stp w20,w23,[x2, #0xa8]
00a8cd90	stp w14,w18,[x2, #0xc8]
00a8cd94	b.lt 0x00a8ce68
00a8cd98	ldr w8,[sp, #0x2c]
00a8cd9c	eor w13,w7,w25, LSL #0x1f
00a8cda0	eor w13,w13,w27, LSR #0x1
00a8cda4	cmp w1,#0xc1
00a8cda8	eor w14,w8,w29, LSR #0x1
00a8cdac	eor w14,w14,w27, LSL #0x1f
00a8cdb0	stp w13,w14,[x2, #0xd0]
00a8cdb4	eor w13,w5,w25, LSR #0x1
00a8cdb8	eor w18,w6,w9, LSR #0x1
00a8cdbc	eor w14,w25,w10, LSR #0x1
00a8cdc0	eor w1,w27,w10, LSL #0x1f
00a8cdc4	eor w3,w29,w11, LSR #0x1
00a8cdc8	eor w13,w13,w9, LSL #0x1f
00a8cdcc	eor w9,w9,w17, LSR #0x1
00a8cdd0	mov w0,wzr
00a8cdd4	eor w18,w18,w29, LSL #0x1f
00a8cdd8	eor w14,w14,w17, LSL #0x1f
00a8cddc	eor w1,w1,w12, LSR #0x1
00a8cde0	eor w3,w3,w12, LSL #0x1f
00a8cde4	eor w9,w9,w11, LSL #0x1f
00a8cde8	stp w18,w13,[x2, #0xd8]
00a8cdec	stp w14,w1,[x2, #0xe0]
00a8cdf0	stp w3,w9,[x2, #0xe8]
00a8cdf4	b.lt 0x00a8ce68
00a8cdf8	ldp w13,w9,[sp, #0x44]
00a8cdfc	ldp w14,w8,[sp, #0x34]
00a8ce00	ldp w3,w1,[sp, #0x3c]
00a8ce04	ldr w18,[sp, #0x4c]
00a8ce08	mov w0,wzr
00a8ce0c	extr w9,w9,w8,#0x1
00a8ce10	eor w15,w8,w7, LSR #0xd
00a8ce14	ldr w8,[sp, #0x2c]
00a8ce18	extr w13,w13,w14,#0x1
00a8ce1c	eor w14,w14,w7, LSL #0x13
00a8ce20	extr w16,w30,w1,#0x1
00a8ce24	extr w18,w18,w3,#0x1
00a8ce28	eor w1,w1,w8, LSL #0x13
00a8ce2c	eor w3,w3,w6, LSL #0x13
00a8ce30	eor w16,w16,w17
00a8ce34	eor w10,w18,w10
00a8ce38	eor w9,w9,w12
00a8ce3c	eor w11,w13,w11
00a8ce40	eor w8,w14,w8, LSR #0xd
00a8ce44	eor w12,w1,w6, LSR #0xd
00a8ce48	eor w13,w3,w5, LSR #0xd
00a8ce4c	eor w14,w15,w5, LSL #0x13
00a8ce50	stp w16,w10,[x2, #0xf0]
00a8ce54	stp w9,w11,[x2, #0xf8]
00a8ce58	str w8,[x2, #0x100]
00a8ce5c	str w12,[x2, #0x104]
00a8ce60	str w13,[x2, #0x108]
00a8ce64	str w14,[x2, #0x10c]
00a8ce68	ldp x29,x30,[sp, #0xa0]
00a8ce6c	ldp x20,x19,[sp, #0x90]
00a8ce70	ldp x22,x21,[sp, #0x80]
00a8ce74	ldp x24,x23,[sp, #0x70]
00a8ce78	ldp x26,x25,[sp, #0x60]
00a8ce7c	ldp x28,x27,[sp, #0x50]
00a8ce80	add sp,sp,#0xb0
00a8ce84	ret

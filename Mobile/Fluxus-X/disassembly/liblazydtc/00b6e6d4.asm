; mbedtls_internal_aes_encrypt @ 00b6e6d4
00b6e6d4	sub sp,sp,#0x50
00b6e6d8	str x19,[sp, #0x30]
00b6e6dc	stp x29,x30,[sp, #0x40]
00b6e6e0	add x29,sp,#0x40
00b6e6e4	mrs x19,tpidr_el0
00b6e6e8	ldr x8,[x19, #0x28]
00b6e6ec	adrp x9,0xd24000
00b6e6f0	adrp x10,0xd24000
00b6e6f4	adrp x11,0xd25000
00b6e6f8	stur x8,[x29, #-0x18]
00b6e6fc	ldr x8,[x0, #0x8]
00b6e700	ldr d0,[x1]
00b6e704	adrp x13,0xd25000
00b6e708	add x9,x9,#0xa08
00b6e70c	add x8,x0,x8, LSL #0x2
00b6e710	ldp d1,d2,[x8, #0x10]
00b6e714	add x10,x10,#0xe08
00b6e718	add x11,x11,#0x208
00b6e71c	add x8,x8,#0x3c
00b6e720	eor v0.8B,v1.8B,v0.8B
00b6e724	ldr d1,[x1, #0x8]
00b6e728	fmov w17,s0
00b6e72c	add x13,x13,#0x608
00b6e730	eor v1.8B,v2.8B,v1.8B
00b6e734	stp d0,d1,[sp, #0x8]
00b6e738	ldr w12,[x0]
00b6e73c	mov w0,v0.S[0x1]
00b6e740	mov w16,v1.S[0x1]
00b6e744	fmov w18,s1
00b6e748	asr w12,w12,#0x1
00b6e74c	b 0x00b6e82c
00b6e750	ldr w0,[x9, x0, LSL #0x2]
00b6e754	ubfx w1,w15,#0x8,#0x8
00b6e758	ubfx w3,w16,#0x10,#0x8
00b6e75c	ldr w1,[x10, w1, UXTW #0x2]
00b6e760	lsr w4,w18,#0x18
00b6e764	ldr w3,[x11, w3, UXTW #0x2]
00b6e768	ldr w4,[x13, w4, UXTW #0x2]
00b6e76c	eor w17,w0,w17
00b6e770	eor w17,w17,w1
00b6e774	eor w17,w17,w3
00b6e778	eor w17,w17,w4
00b6e77c	and w5,w15,#0xff
00b6e780	str w17,[sp, #0x8]
00b6e784	ubfx w0,w16,#0x8,#0x8
00b6e788	ldr w5,[x9, w5, UXTW #0x2]
00b6e78c	ldur w1,[x8, #-0x8]
00b6e790	ubfx w3,w18,#0x10,#0x8
00b6e794	ldr w0,[x10, w0, UXTW #0x2]
00b6e798	lsr w4,w14,#0x18
00b6e79c	ldr w3,[x11, w3, UXTW #0x2]
00b6e7a0	ldr w4,[x13, w4, UXTW #0x2]
00b6e7a4	eor w1,w5,w1
00b6e7a8	eor w0,w1,w0
00b6e7ac	eor w0,w0,w3
00b6e7b0	eor w0,w0,w4
00b6e7b4	and w5,w16,#0xff
00b6e7b8	str w0,[sp, #0xc]
00b6e7bc	ubfx w1,w18,#0x8,#0x8
00b6e7c0	ldr w5,[x9, w5, UXTW #0x2]
00b6e7c4	ldur w3,[x8, #-0x4]
00b6e7c8	ldr w1,[x10, w1, UXTW #0x2]
00b6e7cc	ubfx w4,w14,#0x10,#0x8
00b6e7d0	ldr w4,[x11, w4, UXTW #0x2]
00b6e7d4	eor w3,w5,w3
00b6e7d8	eor w1,w3,w1
00b6e7dc	lsr w3,w15,#0x18
00b6e7e0	ldr w3,[x13, w3, UXTW #0x2]
00b6e7e4	eor w1,w1,w4
00b6e7e8	and w18,w18,#0xff
00b6e7ec	ldr w4,[x9, w18, UXTW #0x2]
00b6e7f0	eor w18,w1,w3
00b6e7f4	str w18,[sp, #0x10]
00b6e7f8	ubfx w14,w14,#0x8,#0x8
00b6e7fc	ldr w1,[x8], #0x20
00b6e800	ubfx w15,w15,#0x10,#0x8
00b6e804	ldr w14,[x10, w14, UXTW #0x2]
00b6e808	lsr w16,w16,#0x18
00b6e80c	ldr w15,[x11, w15, UXTW #0x2]
00b6e810	ldr w16,[x13, w16, UXTW #0x2]
00b6e814	eor w1,w4,w1
00b6e818	eor w14,w1,w14
00b6e81c	eor w14,w14,w15
00b6e820	eor w16,w14,w16
00b6e824	sub w12,w12,#0x1
00b6e828	str w16,[sp, #0x14]
00b6e82c	and w15,w17,#0xff
00b6e830	ldur w14,[x8, #-0x1c]
00b6e834	ubfx w1,w0,#0x8,#0x8
00b6e838	ldr w15,[x9, w15, UXTW #0x2]
00b6e83c	ubfx w3,w18,#0x10,#0x8
00b6e840	ldr w1,[x10, w1, UXTW #0x2]
00b6e844	lsr w4,w16,#0x18
00b6e848	ldr w3,[x11, w3, UXTW #0x2]
00b6e84c	ldr w4,[x13, w4, UXTW #0x2]
00b6e850	eor w14,w15,w14
00b6e854	eor w14,w14,w1
00b6e858	eor w14,w14,w3
00b6e85c	eor w14,w14,w4
00b6e860	and w5,w0,#0xff
00b6e864	str w14,[sp, #0x18]
00b6e868	ubfx w15,w18,#0x8,#0x8
00b6e86c	ldr w5,[x9, w5, UXTW #0x2]
00b6e870	ldur w1,[x8, #-0x18]
00b6e874	ubfx w3,w16,#0x10,#0x8
00b6e878	ldr w15,[x10, w15, UXTW #0x2]
00b6e87c	lsr w4,w17,#0x18
00b6e880	ldr w3,[x11, w3, UXTW #0x2]
00b6e884	ldr w4,[x13, w4, UXTW #0x2]
00b6e888	eor w1,w5,w1
00b6e88c	eor w15,w1,w15
00b6e890	eor w15,w15,w3
00b6e894	eor w15,w15,w4
00b6e898	and w5,w18,#0xff
00b6e89c	str w15,[sp, #0x1c]
00b6e8a0	ubfx w1,w16,#0x8,#0x8
00b6e8a4	ldr w5,[x9, w5, UXTW #0x2]
00b6e8a8	ldur w4,[x8, #-0x14]
00b6e8ac	ubfx w3,w17,#0x10,#0x8
00b6e8b0	ldr w1,[x10, w1, UXTW #0x2]
00b6e8b4	ldr w3,[x11, w3, UXTW #0x2]
00b6e8b8	eor w4,w5,w4
00b6e8bc	and w16,w16,#0xff
00b6e8c0	eor w1,w4,w1
00b6e8c4	eor w1,w1,w3
00b6e8c8	lsr w3,w0,#0x18
00b6e8cc	ldr w3,[x13, w3, UXTW #0x2]
00b6e8d0	ldr w4,[x9, w16, UXTW #0x2]
00b6e8d4	ubfx w17,w17,#0x8,#0x8
00b6e8d8	ldr w17,[x10, w17, UXTW #0x2]
00b6e8dc	eor w16,w1,w3
00b6e8e0	str w16,[sp, #0x20]
00b6e8e4	ldur w1,[x8, #-0x10]
00b6e8e8	ubfx w0,w0,#0x10,#0x8
00b6e8ec	ldr w0,[x11, w0, UXTW #0x2]
00b6e8f0	lsr w18,w18,#0x18
00b6e8f4	ldr w18,[x13, w18, UXTW #0x2]
00b6e8f8	eor w1,w4,w1
00b6e8fc	eor w17,w1,w17
00b6e900	eor w17,w17,w0
00b6e904	eor w18,w17,w18
00b6e908	str w18,[sp, #0x24]
00b6e90c	ldur w17,[x8, #-0xc]
00b6e910	cmp w12,#0x2
00b6e914	and w0,w14,#0xff
00b6e918	b.ge 0x00b6e750
00b6e91c	adrp x9,0xd23000
00b6e920	add x9,x9,#0x908
00b6e924	ubfx w10,w15,#0x8,#0x8
00b6e928	ldrb w11,[x9, x0]
00b6e92c	ubfx w12,w16,#0x10,#0x8
00b6e930	ldrb w10,[x9, w10, UXTW ]
00b6e934	lsr w13,w18,#0x18
00b6e938	ldrb w12,[x9, w12, UXTW ]
00b6e93c	ldrb w13,[x9, w13, UXTW ]
00b6e940	eor w11,w17,w11
00b6e944	eor w10,w11,w10, LSL #0x8
00b6e948	eor w10,w10,w12, LSL #0x10
00b6e94c	eor w10,w10,w13, LSL #0x18
00b6e950	and w0,w15,#0xff
00b6e954	str w10,[sp, #0x8]
00b6e958	ubfx w17,w16,#0x8,#0x8
00b6e95c	ldrb w0,[x9, w0, UXTW ]
00b6e960	ldur w11,[x8, #-0x8]
00b6e964	ubfx w12,w18,#0x10,#0x8
00b6e968	ldrb w17,[x9, w17, UXTW ]
00b6e96c	lsr w13,w14,#0x18
00b6e970	ldrb w12,[x9, w12, UXTW ]
00b6e974	ldrb w13,[x9, w13, UXTW ]
00b6e978	eor w11,w11,w0
00b6e97c	eor w11,w11,w17, LSL #0x8
00b6e980	eor w11,w11,w12, LSL #0x10
00b6e984	eor w11,w11,w13, LSL #0x18
00b6e988	and w0,w16,#0xff
00b6e98c	str w11,[sp, #0xc]
00b6e990	ubfx w17,w18,#0x8,#0x8
00b6e994	ldrb w0,[x9, w0, UXTW ]
00b6e998	ldur w13,[x8, #-0x4]
00b6e99c	ubfx w12,w14,#0x10,#0x8
00b6e9a0	ldrb w17,[x9, w17, UXTW ]
00b6e9a4	ldrb w12,[x9, w12, UXTW ]
00b6e9a8	eor w13,w13,w0
00b6e9ac	ubfx w14,w14,#0x8,#0x8
00b6e9b0	eor w13,w13,w17, LSL #0x8
00b6e9b4	eor w12,w13,w12, LSL #0x10
00b6e9b8	lsr w13,w15,#0x18
00b6e9bc	ldrb w13,[x9, w13, UXTW ]
00b6e9c0	and w17,w18,#0xff
00b6e9c4	ldrb w17,[x9, w17, UXTW ]
00b6e9c8	ubfx w15,w15,#0x10,#0x8
00b6e9cc	eor w12,w12,w13, LSL #0x18
00b6e9d0	str w12,[sp, #0x10]
00b6e9d4	ldr w8,[x8]
00b6e9d8	ldrb w13,[x9, w14, UXTW ]
00b6e9dc	lsr w16,w16,#0x18
00b6e9e0	ldrb w14,[x9, w15, UXTW ]
00b6e9e4	ldrb w9,[x9, w16, UXTW ]
00b6e9e8	eor w8,w8,w17
00b6e9ec	eor w8,w8,w13, LSL #0x8
00b6e9f0	eor w8,w8,w14, LSL #0x10
00b6e9f4	eor w8,w8,w9, LSL #0x18
00b6e9f8	add x0,sp,#0x8
00b6e9fc	mov w1,#0x20
00b6ea00	str w8,[sp, #0x14]
00b6ea04	stp w10,w11,[x2]
00b6ea08	stp w12,w8,[x2, #0x8]
00b6ea0c	bl 0x00c42220
00b6ea10	ldr x8,[x19, #0x28]
00b6ea14	ldur x9,[x29, #-0x18]
00b6ea18	cmp x8,x9
00b6ea1c	b.ne 0x00b6ea34
00b6ea20	ldp x29,x30,[sp, #0x40]
00b6ea24	ldr x19,[sp, #0x30]
00b6ea28	mov w0,wzr
00b6ea2c	add sp,sp,#0x50
00b6ea30	ret
00b6ea34	bl 0x00c2fec0

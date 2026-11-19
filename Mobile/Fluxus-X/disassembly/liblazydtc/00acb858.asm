; RC4 @ 00acb858
00acb858	ldrb w8,[x0]
00acb85c	ldrb w10,[x0, #0x1]
00acb860	lsr x13,x1,#0x3
00acb864	cbz x13,0x00acba6c
00acb868	sub w9,w1,#0x8
00acb86c	and x11,x1,#-0x8
00acb870	and w12,w9,#0xfffffff8
00acb874	add x9,x2,x11
00acb878	add w12,w8,w12
00acb87c	neg x13,x13
00acb880	mov x14,x3
00acb884	add w16,w8,#0x1
00acb888	add x15,x0,#0x2
00acb88c	and x16,x16,#0xff
00acb890	ldrb w17,[x15, x16]
00acb894	adds x13,x13,#0x1
00acb898	add w10,w17,w10, UXTB 
00acb89c	and w18,w10,#0xff
00acb8a0	ldrb w4,[x15, x18]
00acb8a4	strb w4,[x15, x16]
00acb8a8	add w16,w4,w17
00acb8ac	strb w17,[x15, x18]
00acb8b0	and w16,w16,#0xff
00acb8b4	ldrb w17,[x2]
00acb8b8	ldrb w16,[x15, w16, UXTW ]
00acb8bc	add w18,w8,#0x2
00acb8c0	and x18,x18,#0xff
00acb8c4	eor w16,w17,w16
00acb8c8	strb w16,[x14]
00acb8cc	ldrb w16,[x15, x18]
00acb8d0	add w10,w10,w16
00acb8d4	and w17,w10,#0xff
00acb8d8	ldrb w4,[x15, x17]
00acb8dc	strb w4,[x15, x18]
00acb8e0	strb w16,[x15, x17]
00acb8e4	add w16,w4,w16
00acb8e8	and w16,w16,#0xff
00acb8ec	ldrb w17,[x2, #0x1]
00acb8f0	ldrb w16,[x15, w16, UXTW ]
00acb8f4	add w18,w8,#0x3
00acb8f8	and x18,x18,#0xff
00acb8fc	eor w16,w17,w16
00acb900	strb w16,[x14, #0x1]
00acb904	ldrb w16,[x15, x18]
00acb908	add w10,w10,w16
00acb90c	and w17,w10,#0xff
00acb910	ldrb w4,[x15, x17]
00acb914	strb w4,[x15, x18]
00acb918	strb w16,[x15, x17]
00acb91c	add w16,w4,w16
00acb920	and w16,w16,#0xff
00acb924	ldrb w17,[x2, #0x2]
00acb928	ldrb w16,[x15, w16, UXTW ]
00acb92c	add w18,w8,#0x4
00acb930	and x18,x18,#0xff
00acb934	eor w16,w17,w16
00acb938	strb w16,[x14, #0x2]
00acb93c	ldrb w16,[x15, x18]
00acb940	add w10,w10,w16
00acb944	and w17,w10,#0xff
00acb948	ldrb w4,[x15, x17]
00acb94c	strb w4,[x15, x18]
00acb950	strb w16,[x15, x17]
00acb954	add w16,w4,w16
00acb958	and w16,w16,#0xff
00acb95c	ldrb w17,[x2, #0x3]
00acb960	ldrb w16,[x15, w16, UXTW ]
00acb964	add w18,w8,#0x5
00acb968	and x18,x18,#0xff
00acb96c	eor w16,w17,w16
00acb970	strb w16,[x14, #0x3]
00acb974	ldrb w16,[x15, x18]
00acb978	add w10,w10,w16
00acb97c	and w17,w10,#0xff
00acb980	ldrb w4,[x15, x17]
00acb984	strb w4,[x15, x18]
00acb988	strb w16,[x15, x17]
00acb98c	add w16,w4,w16
00acb990	and w16,w16,#0xff
00acb994	ldrb w17,[x2, #0x4]
00acb998	ldrb w16,[x15, w16, UXTW ]
00acb99c	add w18,w8,#0x6
00acb9a0	and x18,x18,#0xff
00acb9a4	eor w16,w17,w16
00acb9a8	strb w16,[x14, #0x4]
00acb9ac	ldrb w16,[x15, x18]
00acb9b0	add w10,w10,w16
00acb9b4	and w17,w10,#0xff
00acb9b8	ldrb w4,[x15, x17]
00acb9bc	strb w4,[x15, x18]
00acb9c0	strb w16,[x15, x17]
00acb9c4	add w16,w4,w16
00acb9c8	and w16,w16,#0xff
00acb9cc	ldrb w17,[x2, #0x5]
00acb9d0	ldrb w16,[x15, w16, UXTW ]
00acb9d4	add w18,w8,#0x7
00acb9d8	and x18,x18,#0xff
00acb9dc	add w8,w8,#0x8
00acb9e0	eor w16,w17,w16
00acb9e4	strb w16,[x14, #0x5]
00acb9e8	ldrb w16,[x15, x18]
00acb9ec	add w10,w10,w16
00acb9f0	and w17,w10,#0xff
00acb9f4	ldrb w4,[x15, x17]
00acb9f8	strb w4,[x15, x18]
00acb9fc	strb w16,[x15, x17]
00acba00	add w16,w4,w16
00acba04	and w16,w16,#0xff
00acba08	ldrb w17,[x2, #0x6]
00acba0c	ldrb w16,[x15, w16, UXTW ]
00acba10	and x18,x8,#0xff
00acba14	eor w16,w17,w16
00acba18	strb w16,[x14, #0x6]
00acba1c	ldrb w16,[x15, x18]
00acba20	add w10,w10,w16
00acba24	and w17,w10,#0xff
00acba28	ldrb w4,[x15, x17]
00acba2c	strb w4,[x15, x18]
00acba30	strb w16,[x15, x17]
00acba34	add w16,w4,w16
00acba38	and w16,w16,#0xff
00acba3c	ldrb w17,[x2, #0x7]
00acba40	ldrb w15,[x15, w16, UXTW ]
00acba44	add x2,x2,#0x8
00acba48	eor w15,w17,w15
00acba4c	strb w15,[x14, #0x7]
00acba50	add x14,x14,#0x8
00acba54	b.ne 0x00acb884
00acba58	add w8,w12,#0x8
00acba5c	add x3,x3,x11
00acba60	ands x11,x1,#0x7
00acba64	b.ne 0x00acba78
00acba68	b 0x00acbc58
00acba6c	mov x9,x2
00acba70	ands x11,x1,#0x7
00acba74	b.eq 0x00acbc58
00acba78	orr w12,wzr,#0x6
00acba7c	sub x11,x12,x11
00acba80	add w13,w8,#0x1
00acba84	add x12,x0,#0x2
00acba88	and x14,x13,#0xff
00acba8c	ldrb w15,[x12, x14]
00acba90	cmp x11,#0x5
00acba94	add w10,w15,w10, UXTB 
00acba98	and w16,w10,#0xff
00acba9c	ldrb w17,[x12, x16]
00acbaa0	strb w17,[x12, x14]
00acbaa4	add w14,w17,w15
00acbaa8	strb w15,[x12, x16]
00acbaac	and w14,w14,#0xff
00acbab0	ldrb w15,[x9]
00acbab4	ldrb w14,[x12, w14, UXTW ]
00acbab8	eor w14,w15,w14
00acbabc	strb w14,[x3]
00acbac0	b.eq 0x00acbc54
00acbac4	add w13,w8,#0x2
00acbac8	and x14,x13,#0xff
00acbacc	ldrb w15,[x12, x14]
00acbad0	cmp x11,#0x4
00acbad4	add w10,w10,w15
00acbad8	and w16,w10,#0xff
00acbadc	ldrb w17,[x12, x16]
00acbae0	strb w17,[x12, x14]
00acbae4	add w14,w17,w15
00acbae8	strb w15,[x12, x16]
00acbaec	and w14,w14,#0xff
00acbaf0	ldrb w15,[x9, #0x1]
00acbaf4	ldrb w12,[x12, w14, UXTW ]
00acbaf8	eor w12,w15,w12
00acbafc	strb w12,[x3, #0x1]
00acbb00	b.eq 0x00acbc54
00acbb04	add w13,w8,#0x3
00acbb08	add x12,x0,#0x2
00acbb0c	and x14,x13,#0xff
00acbb10	ldrb w15,[x12, x14]
00acbb14	cmp x11,#0x3
00acbb18	add w10,w10,w15
00acbb1c	and w16,w10,#0xff
00acbb20	ldrb w17,[x12, x16]
00acbb24	strb w17,[x12, x14]
00acbb28	add w14,w17,w15
00acbb2c	strb w15,[x12, x16]
00acbb30	and w14,w14,#0xff
00acbb34	ldrb w15,[x9, #0x2]
00acbb38	ldrb w14,[x12, w14, UXTW ]
00acbb3c	eor w14,w15,w14
00acbb40	strb w14,[x3, #0x2]
00acbb44	b.eq 0x00acbc54
00acbb48	add w13,w8,#0x4
00acbb4c	and x14,x13,#0xff
00acbb50	ldrb w15,[x12, x14]
00acbb54	cmp x11,#0x2
00acbb58	add w10,w10,w15
00acbb5c	and w16,w10,#0xff
00acbb60	ldrb w17,[x12, x16]
00acbb64	strb w17,[x12, x14]
00acbb68	add w14,w17,w15
00acbb6c	strb w15,[x12, x16]
00acbb70	and w14,w14,#0xff
00acbb74	ldrb w15,[x9, #0x3]
00acbb78	ldrb w12,[x12, w14, UXTW ]
00acbb7c	eor w12,w15,w12
00acbb80	strb w12,[x3, #0x3]
00acbb84	b.eq 0x00acbc54
00acbb88	add w13,w8,#0x5
00acbb8c	add x12,x0,#0x2
00acbb90	and x14,x13,#0xff
00acbb94	ldrb w15,[x12, x14]
00acbb98	cmp x11,#0x1
00acbb9c	add w10,w10,w15
00acbba0	and w16,w10,#0xff
00acbba4	ldrb w17,[x12, x16]
00acbba8	strb w17,[x12, x14]
00acbbac	add w14,w17,w15
00acbbb0	strb w15,[x12, x16]
00acbbb4	and w14,w14,#0xff
00acbbb8	ldrb w15,[x9, #0x4]
00acbbbc	ldrb w14,[x12, w14, UXTW ]
00acbbc0	eor w14,w15,w14
00acbbc4	strb w14,[x3, #0x4]
00acbbc8	b.eq 0x00acbc54
00acbbcc	add w13,w8,#0x6
00acbbd0	and x14,x13,#0xff
00acbbd4	ldrb w15,[x12, x14]
00acbbd8	add w10,w10,w15
00acbbdc	and w16,w10,#0xff
00acbbe0	ldrb w17,[x12, x16]
00acbbe4	strb w17,[x12, x14]
00acbbe8	add w14,w17,w15
00acbbec	strb w15,[x12, x16]
00acbbf0	and w14,w14,#0xff
00acbbf4	ldrb w12,[x12, w14, UXTW ]
00acbbf8	ldrb w14,[x9, #0x5]
00acbbfc	eor w12,w14,w12
00acbc00	strb w12,[x3, #0x5]
00acbc04	cbz x11,0x00acbc54
00acbc08	add w8,w8,#0x7
00acbc0c	add x12,x0,#0x2
00acbc10	and x13,x8,#0xff
00acbc14	ldrb w14,[x12, x13]
00acbc18	add x11,x11,#0x7
00acbc1c	cmp x11,#0x6
00acbc20	add w10,w10,w14
00acbc24	and w15,w10,#0xff
00acbc28	ldrb w16,[x12, x15]
00acbc2c	strb w16,[x12, x13]
00acbc30	add w13,w16,w14
00acbc34	strb w14,[x12, x15]
00acbc38	and w13,w13,#0xff
00acbc3c	ldrb w14,[x9, #0x6]
00acbc40	ldrb w12,[x12, w13, UXTW ]
00acbc44	eor w12,w14,w12
00acbc48	strb w12,[x3, #0x6]
00acbc4c	b.ne 0x00acba80
00acbc50	b 0x00acbc58
00acbc54	mov w8,w13
00acbc58	strb w8,[x0]
00acbc5c	strb w10,[x0, #0x1]
00acbc60	ret

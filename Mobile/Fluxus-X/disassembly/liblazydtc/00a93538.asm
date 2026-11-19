; DES_cfb_encrypt @ 00a93538
00a93538	cmp w2,#0x0
00a9353c	add w8,w2,#0x7
00a93540	add w9,w2,#0xe
00a93544	sub w11,w2,#0x1
00a93548	csel w10,w8,w2,lt
00a9354c	cmp w8,#0x0
00a93550	csel w8,w9,w8,lt
00a93554	cmp w11,#0x3f
00a93558	b.hi 0x00a93c88
00a9355c	sub sp,sp,#0xe0
00a93560	stp x28,x27,[sp, #0x80]
00a93564	stp x26,x25,[sp, #0x90]
00a93568	stp x24,x23,[sp, #0xa0]
00a9356c	stp x22,x21,[sp, #0xb0]
00a93570	stp x20,x19,[sp, #0xc0]
00a93574	stp x29,x30,[sp, #0xd0]
00a93578	ldp w28,w27,[x5]
00a9357c	asr w8,w8,#0x3
00a93580	asr w9,w10,#0x3
00a93584	and w10,w10,#0xfffffff8
00a93588	sxtw x26,w8
00a9358c	mov x21,x3
00a93590	mov w22,w2
00a93594	mov x23,x1
00a93598	mov x24,x0
00a9359c	sub w10,w2,w10
00a935a0	cmp x26,x3
00a935a4	add x29,sp,#0xd0
00a935a8	str w10,[sp, #0x5c]
00a935ac	str x4,[sp, #0x60]
00a935b0	str x5,[sp, #0x8]
00a935b4	cbz w6,0x00a938e0
00a935b8	b.hi 0x00a938e4
00a935bc	sub w19,w8,#0x1
00a935c0	ldr w8,[sp, #0x5c]
00a935c4	sxtw x10,w9
00a935c8	mov w9,#0x8
00a935cc	add x20,sp,#0x68
00a935d0	sub w25,w9,w8
00a935d4	add x8,x10,#0x1
00a935d8	stp x8,x10,[sp, #0x48]
00a935dc	add x8,x10,#0x2
00a935e0	str x8,[sp, #0x40]
00a935e4	add x8,x10,#0x3
00a935e8	str x8,[sp, #0x38]
00a935ec	add x8,x10,#0x4
00a935f0	str x8,[sp, #0x30]
00a935f4	add x8,x10,#0x5
00a935f8	str x8,[sp, #0x28]
00a935fc	add x8,x10,#0x6
00a93600	str x8,[sp, #0x20]
00a93604	add x8,x10,#0x7
00a93608	str x8,[sp, #0x18]
00a9360c	add x8,x10,#0x8
00a93610	str x8,[sp, #0x10]
00a93614	b 0x00a93620
00a93618	mov w8,w10
00a9361c	b 0x00a936a8
00a93620	sub x0,x29,#0x58
00a93624	mov w2,#0x1
00a93628	mov x1,x4
00a9362c	stp w28,w27,[x29, #-0x58]
00a93630	bl 0x00c39a00
00a93634	mov w10,wzr
00a93638	cmp w19,#0x7
00a9363c	add x9,x24,x26
00a93640	b.hi 0x00a93618
00a93644	adrp x8,0x76e000
00a93648	add x8,x8,#0x6f0
00a9364c	mov x11,x8
00a93650	ldrsw x8,[x8, x19, LSL #0x2]
00a93654	mov w12,w10
00a93658	add x13,x8,x11
00a9365c	mov w8,w10
00a93660	mov w11,w10
00a93664	br x13
00a93668	ldrb w8,[x9, #-0x1]!
00a9366c	lsl w10,w8,#0x18
00a93670	ldrb w8,[x9, #-0x1]!
00a93674	orr w10,w10,w8, LSL #0x10
00a93678	ldrb w8,[x9, #-0x1]!
00a9367c	orr w10,w10,w8, LSL #0x8
00a93680	ldrb w8,[x9, #-0x1]!
00a93684	orr w10,w10,w8
00a93688	ldrb w8,[x9, #-0x1]!
00a9368c	lsl w8,w8,#0x18
00a93690	ldrb w11,[x9, #-0x1]!
00a93694	orr w11,w8,w11, LSL #0x10
00a93698	ldrb w8,[x9, #-0x1]!
00a9369c	orr w12,w11,w8, LSL #0x8
00a936a0	ldrb w8,[x9, #-0x1]!
00a936a4	orr w8,w12,w8
00a936a8	ldp w11,w12,[x29, #-0x58]
00a936ac	ldr x4,[sp, #0x60]
00a936b0	cmp w19,#0x7
00a936b4	eor w8,w11,w8
00a936b8	eor w10,w12,w10
00a936bc	add x11,x23,x26
00a936c0	b.hi 0x00a93714
00a936c4	adrp x12,0x76e000
00a936c8	add x12,x12,#0x710
00a936cc	mov x13,x12
00a936d0	ldrsw x12,[x12, x19, LSL #0x2]
00a936d4	add x12,x12,x13
00a936d8	br x12
00a936dc	lsr w12,w10,#0x18
00a936e0	strb w12,[x11, #-0x1]!
00a936e4	lsr w12,w10,#0x10
00a936e8	strb w12,[x11, #-0x1]!
00a936ec	lsr w12,w10,#0x8
00a936f0	strb w12,[x11, #-0x1]!
00a936f4	strb w10,[x11, #-0x1]!
00a936f8	lsr w12,w8,#0x18
00a936fc	strb w12,[x11, #-0x1]!
00a93700	lsr w12,w8,#0x10
00a93704	strb w12,[x11, #-0x1]!
00a93708	lsr w12,w8,#0x8
00a9370c	strb w12,[x11, #-0x1]!
00a93710	strb w8,[x11, #-0x1]!
00a93714	sub x21,x21,x26
00a93718	add x24,x9,x26
00a9371c	cmp w22,#0x20
00a93720	add x23,x11,x26
00a93724	b.eq 0x00a938cc
00a93728	cmp w22,#0x40
00a9372c	b.ne 0x00a9373c
00a93730	mov w27,w8
00a93734	mov w8,w10
00a93738	b 0x00a938cc
00a9373c	lsr w9,w28,#0x8
00a93740	strb w9,[sp, #0x69]
00a93744	lsr w9,w28,#0x10
00a93748	lsr w11,w28,#0x18
00a9374c	ldr w16,[sp, #0x5c]
00a93750	strb w9,[sp, #0x6a]
00a93754	lsr w9,w27,#0x8
00a93758	strb w11,[sp, #0x6b]
00a9375c	lsr w11,w27,#0x10
00a93760	lsr w12,w27,#0x18
00a93764	strb w9,[sp, #0x6d]
00a93768	lsr w9,w8,#0x8
00a9376c	strb w11,[sp, #0x6e]
00a93770	lsr w11,w8,#0x10
00a93774	strb w12,[sp, #0x6f]
00a93778	lsr w12,w8,#0x18
00a9377c	strb w8,[sp, #0x70]
00a93780	lsr w8,w10,#0x8
00a93784	strb w9,[sp, #0x71]
00a93788	lsr w9,w10,#0x10
00a9378c	strb w11,[sp, #0x72]
00a93790	lsr w11,w10,#0x18
00a93794	strb w28,[sp, #0x68]
00a93798	strb w27,[sp, #0x6c]
00a9379c	strb w12,[sp, #0x73]
00a937a0	strb w10,[sp, #0x74]
00a937a4	strb w8,[sp, #0x75]
00a937a8	strb w9,[sp, #0x76]
00a937ac	strb w11,[sp, #0x77]
00a937b0	cbz w16,0x00a9388c
00a937b4	ldp x10,x8,[sp, #0x48]
00a937b8	ldp x13,x12,[sp, #0x28]
00a937bc	ldp x15,x14,[sp, #0x18]
00a937c0	ldrb w8,[x20, x8]
00a937c4	ldrb w9,[x20, x10]
00a937c8	lsl w8,w8,w16
00a937cc	lsr w9,w9,w25
00a937d0	orr w27,w9,w8
00a937d4	strb w27,[sp, #0x68]
00a937d8	ldrb w8,[x20, x10]
00a937dc	ldp x11,x10,[sp, #0x38]
00a937e0	lsl w8,w8,w16
00a937e4	ldrb w9,[x20, x10]
00a937e8	lsr w9,w9,w25
00a937ec	orr w9,w9,w8
00a937f0	strb w9,[sp, #0x69]
00a937f4	ldrb w8,[x20, x10]
00a937f8	ldrb w10,[x20, x11]
00a937fc	lsl w8,w8,w16
00a93800	lsr w10,w10,w25
00a93804	orr w10,w10,w8
00a93808	strb w10,[sp, #0x6a]
00a9380c	ldrb w8,[x20, x11]
00a93810	ldrb w11,[x20, x12]
00a93814	lsl w8,w8,w16
00a93818	lsr w11,w11,w25
00a9381c	orr w11,w11,w8
00a93820	strb w11,[sp, #0x6b]
00a93824	ldrb w8,[x20, x12]
00a93828	ldrb w12,[x20, x13]
00a9382c	lsl w8,w8,w16
00a93830	lsr w12,w12,w25
00a93834	orr w8,w12,w8
00a93838	strb w8,[sp, #0x6c]
00a9383c	ldrb w12,[x20, x13]
00a93840	ldrb w13,[x20, x14]
00a93844	lsl w12,w12,w16
00a93848	lsr w13,w13,w25
00a9384c	orr w12,w13,w12
00a93850	strb w12,[sp, #0x6d]
00a93854	ldrb w13,[x20, x14]
00a93858	ldrb w14,[x20, x15]
00a9385c	lsl w13,w13,w16
00a93860	lsr w14,w14,w25
00a93864	orr w13,w14,w13
00a93868	strb w13,[sp, #0x6e]
00a9386c	ldrb w14,[x20, x15]
00a93870	ldr x15,[sp, #0x10]
00a93874	lsl w14,w14,w16
00a93878	ldrb w15,[x20, x15]
00a9387c	lsr w15,w15,w25
00a93880	orr w14,w15,w14
00a93884	strb w14,[sp, #0x6f]
00a93888	b 0x00a938b4
00a9388c	ldr x8,[sp, #0x50]
00a93890	ldr x27,[x20, x8#0x0]
00a93894	lsr x9,x27,#0x8
00a93898	lsr x10,x27,#0x10
00a9389c	lsr x11,x27,#0x18
00a938a0	lsr x8,x27,#0x20
00a938a4	lsr x12,x27,#0x28
00a938a8	lsr x13,x27,#0x30
00a938ac	lsr x14,x27,#0x38
00a938b0	str x27,[sp, #0x68]
00a938b4	bfm w27,w9,#0x18,#0x7
00a938b8	bfm w8,w12,#0x18,#0x7
00a938bc	bfm w27,w10,#0x10,#0x7
00a938c0	bfm w8,w13,#0x10,#0x7
00a938c4	bfm w27,w11,#0x8,#0x7
00a938c8	bfm w8,w14,#0x8,#0x7
00a938cc	cmp x21,x26
00a938d0	mov w28,w27
00a938d4	mov w27,w8
00a938d8	b.cs 0x00a93620
00a938dc	b 0x00a93c2c
00a938e0	b.ls 0x00a938ec
00a938e4	mov w8,w27
00a938e8	b 0x00a93c2c
00a938ec	sub w19,w8,#0x1
00a938f0	ldr w8,[sp, #0x5c]
00a938f4	sxtw x10,w9
00a938f8	mov w9,#0x8
00a938fc	add x25,sp,#0x68
00a93900	sub w8,w9,w8
00a93904	str w8,[sp, #0x48]
00a93908	add x8,x10,#0x1
00a9390c	str x8,[sp, #0x40]
00a93910	add x8,x10,#0x2
00a93914	str x8,[sp, #0x38]
00a93918	add x8,x10,#0x3
00a9391c	str x8,[sp, #0x30]
00a93920	add x8,x10,#0x4
00a93924	str x8,[sp, #0x28]
00a93928	add x8,x10,#0x5
00a9392c	str x8,[sp, #0x20]
00a93930	add x8,x10,#0x6
00a93934	str x8,[sp, #0x18]
00a93938	add x8,x10,#0x7
00a9393c	str x8,[sp, #0x10]
00a93940	add x8,x10,#0x8
00a93944	mov w20,w28
00a93948	str x10,[sp, #0x50]
00a9394c	str x8,[sp]
00a93950	b 0x00a9395c
00a93954	mov w11,w9
00a93958	b 0x00a939e4
00a9395c	sub x0,x29,#0x58
00a93960	mov w2,#0x1
00a93964	mov x1,x4
00a93968	stp w20,w27,[x29, #-0x58]
00a9396c	bl 0x00c39a00
00a93970	mov w9,wzr
00a93974	cmp w19,#0x7
00a93978	add x10,x24,x26
00a9397c	b.hi 0x00a93954
00a93980	adrp x8,0x76e000
00a93984	add x8,x8,#0x730
00a93988	mov x11,x8
00a9398c	ldrsw x8,[x8, x19, LSL #0x2]
00a93990	mov w12,w9
00a93994	add x13,x8,x11
00a93998	mov w8,w9
00a9399c	mov w11,w9
00a939a0	br x13
00a939a4	ldrb w8,[x10, #-0x1]!
00a939a8	lsl w9,w8,#0x18
00a939ac	ldrb w8,[x10, #-0x1]!
00a939b0	orr w9,w9,w8, LSL #0x10
00a939b4	ldrb w8,[x10, #-0x1]!
00a939b8	orr w9,w9,w8, LSL #0x8
00a939bc	ldrb w8,[x10, #-0x1]!
00a939c0	orr w9,w9,w8
00a939c4	ldrb w8,[x10, #-0x1]!
00a939c8	lsl w8,w8,#0x18
00a939cc	ldrb w11,[x10, #-0x1]!
00a939d0	orr w11,w8,w11, LSL #0x10
00a939d4	ldrb w8,[x10, #-0x1]!
00a939d8	orr w12,w11,w8, LSL #0x8
00a939dc	ldrb w8,[x10, #-0x1]!
00a939e0	orr w11,w12,w8
00a939e4	ldr x4,[sp, #0x60]
00a939e8	cmp w22,#0x20
00a939ec	b.eq 0x00a93b5c
00a939f0	cmp w22,#0x40
00a939f4	mov w28,w11
00a939f8	mov w8,w9
00a939fc	b.eq 0x00a93ba8
00a93a00	lsr w13,w27,#0x18
00a93a04	strb w13,[sp, #0x6f]
00a93a08	lsr w13,w11,#0x18
00a93a0c	lsr w8,w20,#0x8
00a93a10	strb w13,[sp, #0x73]
00a93a14	lsr w13,w9,#0x18
00a93a18	strb w8,[sp, #0x69]
00a93a1c	lsr w8,w20,#0x10
00a93a20	lsr w12,w20,#0x18
00a93a24	strb w13,[sp, #0x77]
00a93a28	ldr w13,[sp, #0x5c]
00a93a2c	strb w8,[sp, #0x6a]
00a93a30	lsr w8,w27,#0x8
00a93a34	strb w12,[sp, #0x6b]
00a93a38	lsr w12,w27,#0x10
00a93a3c	strb w8,[sp, #0x6d]
00a93a40	lsr w8,w11,#0x8
00a93a44	strb w12,[sp, #0x6e]
00a93a48	lsr w12,w11,#0x10
00a93a4c	strb w8,[sp, #0x71]
00a93a50	lsr w8,w9,#0x8
00a93a54	strb w12,[sp, #0x72]
00a93a58	lsr w12,w9,#0x10
00a93a5c	strb w20,[sp, #0x68]
00a93a60	strb w27,[sp, #0x6c]
00a93a64	strb w11,[sp, #0x70]
00a93a68	strb w9,[sp, #0x74]
00a93a6c	strb w8,[sp, #0x75]
00a93a70	strb w12,[sp, #0x76]
00a93a74	cbz w13,0x00a93b68
00a93a78	ldr x8,[sp, #0x50]
00a93a7c	ldr x14,[sp, #0x40]
00a93a80	ldr w1,[sp, #0x48]
00a93a84	mov w0,w13
00a93a88	ldrb w8,[x25, x8]
00a93a8c	ldrb w12,[x25, x14]
00a93a90	ldp x16,x15,[sp, #0x20]
00a93a94	ldp x18,x17,[sp, #0x10]
00a93a98	lsl w8,w8,w13
00a93a9c	lsr w12,w12,w1
00a93aa0	orr w28,w12,w8
00a93aa4	strb w28,[sp, #0x68]
00a93aa8	ldrb w8,[x25, x14]
00a93aac	ldp x14,x13,[sp, #0x30]
00a93ab0	lsl w8,w8,w0
00a93ab4	ldrb w12,[x25, x13]
00a93ab8	lsr w12,w12,w1
00a93abc	orr w12,w12,w8
00a93ac0	strb w12,[sp, #0x69]
00a93ac4	ldrb w8,[x25, x13]
00a93ac8	ldrb w13,[x25, x14]
00a93acc	lsl w8,w8,w0
00a93ad0	lsr w13,w13,w1
00a93ad4	orr w13,w13,w8
00a93ad8	strb w13,[sp, #0x6a]
00a93adc	ldrb w8,[x25, x14]
00a93ae0	ldrb w14,[x25, x15]
00a93ae4	lsl w8,w8,w0
00a93ae8	lsr w14,w14,w1
00a93aec	orr w14,w14,w8
00a93af0	strb w14,[sp, #0x6b]
00a93af4	ldrb w8,[x25, x15]
00a93af8	ldrb w15,[x25, x16]
00a93afc	lsl w8,w8,w0
00a93b00	lsr w15,w15,w1
00a93b04	orr w8,w15,w8
00a93b08	strb w8,[sp, #0x6c]
00a93b0c	ldrb w15,[x25, x16]
00a93b10	ldrb w16,[x25, x17]
00a93b14	lsl w15,w15,w0
00a93b18	lsr w16,w16,w1
00a93b1c	orr w15,w16,w15
00a93b20	strb w15,[sp, #0x6d]
00a93b24	ldrb w16,[x25, x17]
00a93b28	ldrb w17,[x25, x18]
00a93b2c	lsl w16,w16,w0
00a93b30	lsr w17,w17,w1
00a93b34	orr w16,w17,w16
00a93b38	strb w16,[sp, #0x6e]
00a93b3c	ldrb w17,[x25, x18]
00a93b40	ldr x18,[sp]
00a93b44	lsl w17,w17,w0
00a93b48	ldrb w18,[x25, x18]
00a93b4c	lsr w18,w18,w1
00a93b50	orr w17,w18,w17
00a93b54	strb w17,[sp, #0x6f]
00a93b58	b 0x00a93b90
00a93b5c	mov w28,w27
00a93b60	mov w8,w11
00a93b64	b 0x00a93ba8
00a93b68	ldr x8,[sp, #0x50]
00a93b6c	ldr x28,[x25, x8#0x0]
00a93b70	lsr x12,x28,#0x8
00a93b74	lsr x13,x28,#0x10
00a93b78	lsr x14,x28,#0x18
00a93b7c	lsr x8,x28,#0x20
00a93b80	lsr x15,x28,#0x28
00a93b84	lsr x16,x28,#0x30
00a93b88	lsr x17,x28,#0x38
00a93b8c	str x28,[sp, #0x68]
00a93b90	bfm w28,w12,#0x18,#0x7
00a93b94	bfm w8,w15,#0x18,#0x7
00a93b98	bfm w28,w13,#0x10,#0x7
00a93b9c	bfm w8,w16,#0x10,#0x7
00a93ba0	bfm w28,w14,#0x8,#0x7
00a93ba4	bfm w8,w17,#0x8,#0x7
00a93ba8	sub x21,x21,x26
00a93bac	add x24,x10,x26
00a93bb0	cmp w19,#0x7
00a93bb4	add x10,x23,x26
00a93bb8	b.hi 0x00a93c18
00a93bbc	adrp x13,0x76e000
00a93bc0	add x13,x13,#0x750
00a93bc4	ldp w12,w14,[x29, #-0x58]
00a93bc8	mov x15,x13
00a93bcc	ldrsw x13,[x13, x19, LSL #0x2]
00a93bd0	eor w11,w12,w11
00a93bd4	eor w9,w14,w9
00a93bd8	add x12,x13,x15
00a93bdc	br x12
00a93be0	lsr w12,w9,#0x18
00a93be4	strb w12,[x10, #-0x1]!
00a93be8	lsr w12,w9,#0x10
00a93bec	strb w12,[x10, #-0x1]!
00a93bf0	lsr w12,w9,#0x8
00a93bf4	strb w12,[x10, #-0x1]!
00a93bf8	strb w9,[x10, #-0x1]!
00a93bfc	lsr w9,w11,#0x18
00a93c00	strb w9,[x10, #-0x1]!
00a93c04	lsr w9,w11,#0x10
00a93c08	strb w9,[x10, #-0x1]!
00a93c0c	lsr w9,w11,#0x8
00a93c10	strb w9,[x10, #-0x1]!
00a93c14	strb w11,[x10, #-0x1]!
00a93c18	cmp x21,x26
00a93c1c	add x23,x10,x26
00a93c20	mov w27,w8
00a93c24	mov w20,w28
00a93c28	b.cs 0x00a9395c
00a93c2c	ldr x11,[sp, #0x8]
00a93c30	lsr w9,w28,#0x8
00a93c34	lsr w10,w28,#0x18
00a93c38	strb w9,[x11, #0x1]
00a93c3c	lsr w9,w28,#0x10
00a93c40	strb w8,[x11, #0x4]
00a93c44	strb w9,[x11, #0x2]
00a93c48	lsr w9,w8,#0x8
00a93c4c	strb w10,[x11, #0x3]
00a93c50	lsr w10,w8,#0x10
00a93c54	lsr w8,w8,#0x18
00a93c58	strb w28,[x11]
00a93c5c	strb w9,[x11, #0x5]
00a93c60	strb w10,[x11, #0x6]
00a93c64	strb w8,[x11, #0x7]
00a93c68	stur xzr,[x29, #-0x58]
00a93c6c	ldp x29,x30,[sp, #0xd0]
00a93c70	ldp x20,x19,[sp, #0xc0]
00a93c74	ldp x22,x21,[sp, #0xb0]
00a93c78	ldp x24,x23,[sp, #0xa0]
00a93c7c	ldp x26,x25,[sp, #0x90]
00a93c80	ldp x28,x27,[sp, #0x80]
00a93c84	add sp,sp,#0xe0
00a93c88	ret

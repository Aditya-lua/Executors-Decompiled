; AES_encrypt @ 00a89698
00a89698	str x21,[sp, #-0x20]!
00a8969c	stp x20,x19,[sp, #0x10]
00a896a0	ldp w8,w10,[x0]
00a896a4	ldp w11,w12,[x2]
00a896a8	ldp w14,w15,[x0, #0x8]
00a896ac	ldr w3,[x2, #0xf0]
00a896b0	ldp w18,w0,[x2, #0x8]
00a896b4	rev w8,w8
00a896b8	eor w16,w8,w11
00a896bc	rev w11,w14
00a896c0	asr w14,w3,#0x1
00a896c4	mov w4,#0x1
00a896c8	rev w10,w10
00a896cc	eor w18,w11,w18
00a896d0	sub w11,w14,#0x1
00a896d4	adrp x9,0x767000
00a896d8	adrp x8,0x767000
00a896dc	eor w17,w10,w12
00a896e0	adrp x10,0x767000
00a896e4	rev w12,w15
00a896e8	sub w15,w4,w14
00a896ec	lsl x14,x11,#0x3
00a896f0	adrp x11,0x767000
00a896f4	add x13,x2,#0x18
00a896f8	add x9,x9,#0xa78
00a896fc	add x8,x8,#0xe78
00a89700	add x10,x10,#0x278
00a89704	eor w0,w12,w0
00a89708	add x12,x14,#0x8
00a8970c	add x11,x11,#0x678
00a89710	b 0x00a897e0
00a89714	ubfx w4,w17,#0x10,#0x8
00a89718	ldr w3,[x9, w3, UXTW #0x2]
00a8971c	ldr w4,[x8, w4, UXTW #0x2]
00a89720	lsr w6,w17,#0x18
00a89724	ubfx w7,w16,#0x10,#0x8
00a89728	lsr w19,w16,#0x18
00a8972c	ubfx w20,w0,#0x10,#0x8
00a89730	ldr w6,[x9, w6, UXTW #0x2]
00a89734	ldr w7,[x8, w7, UXTW #0x2]
00a89738	ldr w19,[x9, w19, UXTW #0x2]
00a8973c	ldr w20,[x8, w20, UXTW #0x2]
00a89740	lsr w21,w0,#0x18
00a89744	eor w3,w4,w3
00a89748	ubfx w4,w18,#0x10,#0x8
00a8974c	ldr w21,[x9, w21, UXTW #0x2]
00a89750	ldr w4,[x8, w4, UXTW #0x2]
00a89754	ubfx w5,w16,#0x8,#0x8
00a89758	eor w6,w7,w6
00a8975c	ubfx w7,w0,#0x8,#0x8
00a89760	eor w19,w20,w19
00a89764	ubfx w20,w18,#0x8,#0x8
00a89768	ldr w5,[x10, w5, UXTW #0x2]
00a8976c	ldr w7,[x10, w7, UXTW #0x2]
00a89770	and w0,w0,#0xff
00a89774	and w18,w18,#0xff
00a89778	ldr w20,[x10, w20, UXTW #0x2]
00a8977c	ldr w0,[x11, w0, UXTW #0x2]
00a89780	ldr w18,[x11, w18, UXTW #0x2]
00a89784	eor w4,w4,w21
00a89788	ubfx w21,w17,#0x8,#0x8
00a8978c	ldr w21,[x10, w21, UXTW #0x2]
00a89790	and w17,w17,#0xff
00a89794	and w16,w16,#0xff
00a89798	eor w3,w3,w5
00a8979c	eor w5,w6,w7
00a897a0	ldr w17,[x11, w17, UXTW #0x2]
00a897a4	ldr w16,[x11, w16, UXTW #0x2]
00a897a8	eor w6,w19,w20
00a897ac	eor w0,w3,w0
00a897b0	eor w18,w5,w18
00a897b4	ldp w3,w5,[x13, #0x8]
00a897b8	ldp w7,w19,[x13, #0x10]
00a897bc	eor w4,w4,w21
00a897c0	eor w6,w6,w17
00a897c4	eor w4,w4,w16
00a897c8	add w15,w15,#0x1
00a897cc	eor w16,w0,w3
00a897d0	eor w17,w18,w5
00a897d4	eor w18,w6,w7
00a897d8	eor w0,w4,w19
00a897dc	add x13,x13,#0x20
00a897e0	lsr w3,w16,#0x18
00a897e4	ubfx w4,w17,#0x10,#0x8
00a897e8	lsr w6,w17,#0x18
00a897ec	ubfx w7,w18,#0x10,#0x8
00a897f0	ldr w3,[x9, w3, UXTW #0x2]
00a897f4	ldr w4,[x8, w4, UXTW #0x2]
00a897f8	lsr w19,w18,#0x18
00a897fc	ubfx w20,w0,#0x10,#0x8
00a89800	ldr w6,[x9, w6, UXTW #0x2]
00a89804	ldr w7,[x8, w7, UXTW #0x2]
00a89808	ldr w19,[x9, w19, UXTW #0x2]
00a8980c	ldr w20,[x8, w20, UXTW #0x2]
00a89810	lsr w21,w0,#0x18
00a89814	eor w3,w4,w3
00a89818	ubfx w4,w16,#0x10,#0x8
00a8981c	ubfx w5,w18,#0x8,#0x8
00a89820	ldr w21,[x9, w21, UXTW #0x2]
00a89824	ldr w4,[x8, w4, UXTW #0x2]
00a89828	eor w6,w7,w6
00a8982c	ubfx w7,w0,#0x8,#0x8
00a89830	eor w19,w20,w19
00a89834	ubfx w20,w16,#0x8,#0x8
00a89838	ldr w5,[x10, w5, UXTW #0x2]
00a8983c	ldr w7,[x10, w7, UXTW #0x2]
00a89840	and w0,w0,#0xff
00a89844	and w16,w16,#0xff
00a89848	ldr w0,[x11, w0, UXTW #0x2]
00a8984c	ldr w16,[x11, w16, UXTW #0x2]
00a89850	ldr w20,[x10, w20, UXTW #0x2]
00a89854	eor w4,w4,w21
00a89858	ubfx w21,w17,#0x8,#0x8
00a8985c	ldr w21,[x10, w21, UXTW #0x2]
00a89860	eor w3,w3,w5
00a89864	eor w5,w6,w7
00a89868	and w17,w17,#0xff
00a8986c	and w18,w18,#0xff
00a89870	ldr w17,[x11, w17, UXTW #0x2]
00a89874	ldr w18,[x11, w18, UXTW #0x2]
00a89878	eor w0,w3,w0
00a8987c	eor w16,w5,w16
00a89880	ldp w3,w5,[x13, #-0x8]
00a89884	eor w6,w19,w20
00a89888	ldp w7,w19,[x13]
00a8988c	eor w4,w4,w21
00a89890	eor w6,w6,w17
00a89894	eor w4,w4,w18
00a89898	eor w18,w0,w3
00a8989c	eor w17,w16,w5
00a898a0	eor w16,w6,w7
00a898a4	eor w0,w4,w19
00a898a8	lsr w3,w18,#0x18
00a898ac	cbnz w15,0x00a89714
00a898b0	add x13,x2,x14, LSL #0x2
00a898b4	ldr w14,[x10, w3, UXTW #0x2]
00a898b8	ubfx w3,w17,#0x10,#0x8
00a898bc	ubfx w15,w16,#0x8,#0x8
00a898c0	ldr w12,[x2, x12, LSL #0x2]
00a898c4	lsr w2,w17,#0x18
00a898c8	lsr w6,w16,#0x18
00a898cc	lsr w20,w0,#0x18
00a898d0	ldr w3,[x11, w3, UXTW #0x2]
00a898d4	ubfx w4,w16,#0x10,#0x8
00a898d8	ubfx w5,w0,#0x8,#0x8
00a898dc	ubfx w7,w0,#0x10,#0x8
00a898e0	ldr w2,[x10, w2, UXTW #0x2]
00a898e4	ldr w6,[x10, w6, UXTW #0x2]
00a898e8	ldr w10,[x10, w20, UXTW #0x2]
00a898ec	ubfx w20,w18,#0x10,#0x8
00a898f0	ldr w15,[x9, w15, UXTW #0x2]
00a898f4	and w0,w0,#0xff
00a898f8	ubfx w19,w18,#0x8,#0x8
00a898fc	ldr w4,[x11, w4, UXTW #0x2]
00a89900	ldr w7,[x11, w7, UXTW #0x2]
00a89904	ldr w11,[x11, w20, UXTW #0x2]
00a89908	ubfx w20,w17,#0x8,#0x8
00a8990c	and w18,w18,#0xff
00a89910	and w17,w17,#0xff
00a89914	and w16,w16,#0xff
00a89918	lsl x0,x0,#0x2
00a8991c	lsl x18,x18,#0x2
00a89920	lsl x17,x17,#0x2
00a89924	lsl x16,x16,#0x2
00a89928	ldrb w0,[x8, x0]
00a8992c	ldrb w18,[x8, x18]
00a89930	ldrb w17,[x8, x17]
00a89934	ldrb w8,[x8, x16]
00a89938	and w14,w14,#0xff000000
00a8993c	and w16,w3,#0xff0000
00a89940	orr w14,w16,w14
00a89944	and w15,w15,#0xff00
00a89948	orr w14,w14,w15
00a8994c	orr w14,w14,w0
00a89950	eor w12,w14,w12
00a89954	ldr w5,[x9, w5, UXTW #0x2]
00a89958	lsr w14,w12,#0x18
00a8995c	ldr w19,[x9, w19, UXTW #0x2]
00a89960	ldr w9,[x9, w20, UXTW #0x2]
00a89964	strb w14,[x1]
00a89968	lsr w14,w12,#0x10
00a8996c	strb w12,[x1, #0x3]
00a89970	lsr w12,w12,#0x8
00a89974	strb w14,[x1, #0x1]
00a89978	strb w12,[x1, #0x2]
00a8997c	and w16,w2,#0xff000000
00a89980	and w2,w4,#0xff0000
00a89984	ldr w12,[x13, #0x24]
00a89988	orr w16,w2,w16
00a8998c	and w14,w5,#0xff00
00a89990	orr w14,w16,w14
00a89994	orr w14,w14,w18
00a89998	eor w12,w14,w12
00a8999c	lsr w14,w12,#0x18
00a899a0	lsr w16,w12,#0x10
00a899a4	lsr w18,w12,#0x8
00a899a8	strb w12,[x1, #0x7]
00a899ac	strb w14,[x1, #0x4]
00a899b0	strb w16,[x1, #0x5]
00a899b4	strb w18,[x1, #0x6]
00a899b8	and w15,w6,#0xff000000
00a899bc	and w0,w7,#0xff0000
00a899c0	ldr w12,[x13, #0x28]
00a899c4	and w2,w19,#0xff00
00a899c8	orr w14,w0,w15
00a899cc	orr w14,w14,w2
00a899d0	orr w14,w14,w17
00a899d4	eor w12,w14,w12
00a899d8	lsr w14,w12,#0x18
00a899dc	lsr w15,w12,#0x10
00a899e0	lsr w16,w12,#0x8
00a899e4	strb w12,[x1, #0xb]
00a899e8	strb w14,[x1, #0x8]
00a899ec	strb w15,[x1, #0x9]
00a899f0	strb w16,[x1, #0xa]
00a899f4	and w10,w10,#0xff000000
00a899f8	and w11,w11,#0xff0000
00a899fc	ldr w12,[x13, #0x2c]
00a89a00	and w9,w9,#0xff00
00a89a04	orr w10,w11,w10
00a89a08	orr w9,w10,w9
00a89a0c	orr w8,w9,w8
00a89a10	eor w8,w8,w12
00a89a14	lsr w9,w8,#0x18
00a89a18	lsr w10,w8,#0x10
00a89a1c	lsr w11,w8,#0x8
00a89a20	strb w9,[x1, #0xc]
00a89a24	strb w10,[x1, #0xd]
00a89a28	strb w11,[x1, #0xe]
00a89a2c	strb w8,[x1, #0xf]
00a89a30	ldp x20,x19,[sp, #0x10]
00a89a34	ldr x21,[sp], #0x20
00a89a38	ret

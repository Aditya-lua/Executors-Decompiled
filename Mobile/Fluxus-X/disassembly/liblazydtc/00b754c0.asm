; mbedtls_des3_crypt_ecb @ 00b754c0
00b754c0	stp x26,x25,[sp, #-0x40]!
00b754c4	stp x24,x23,[sp, #0x10]
00b754c8	stp x22,x21,[sp, #0x20]
00b754cc	stp x20,x19,[sp, #0x30]
00b754d0	ldp w3,w1,[x1]
00b754d4	adrp x12,0x77e000
00b754d8	adrp x13,0x77e000
00b754dc	adrp x14,0x77e000
00b754e0	rev w3,w3
00b754e4	rev w1,w1
00b754e8	eor w4,w1,w3, LSR #0x4
00b754ec	and w4,w4,#0xf0f0f0f
00b754f0	eor w1,w4,w1
00b754f4	eor w3,w3,w4, LSL #0x4
00b754f8	and w4,w1,#0xffff
00b754fc	eor w4,w4,w3, LSR #0x10
00b75500	eor w1,w4,w1
00b75504	eor w3,w3,w4, LSL #0x10
00b75508	eor w4,w3,w1, LSR #0x2
00b7550c	and w4,w4,#0x33333333
00b75510	eor w3,w4,w3
00b75514	eor w1,w1,w4, LSL #0x2
00b75518	eor w4,w3,w1, LSR #0x8
00b7551c	and w4,w4,#0xff00ff
00b75520	eor w6,w4,w3
00b75524	eor w1,w1,w4, LSL #0x8
00b75528	eor w3,w6,w1, LSL #0x1
00b7552c	and w4,w3,#0xaaaaaaaa
00b75530	eor w3,w4,w1, ROR #0x1f
00b75534	eor w1,w4,w6
00b75538	adrp x15,0x77e000
00b7553c	adrp x16,0x77e000
00b75540	adrp x17,0x77e000
00b75544	adrp x18,0x77e000
00b75548	ror w4,w1,#0x1f
00b7554c	adrp x1,0x77f000
00b75550	mov x5,xzr
00b75554	orr w10,wzr,#0xaaaaaaaa
00b75558	orr w9,wzr,#0x33333333
00b7555c	orr w8,wzr,#0xf0f0f0f
00b75560	orr w11,wzr,#0xff00ff
00b75564	add x12,x12,#0x940
00b75568	add x13,x13,#0xa40
00b7556c	add x14,x14,#0xb40
00b75570	add x15,x15,#0xc40
00b75574	add x16,x16,#0xd40
00b75578	add x17,x17,#0xe40
00b7557c	add x18,x18,#0xf40
00b75580	add x1,x1,#0x40
00b75584	add x6,x0,x5
00b75588	ldp w7,w19,[x6]
00b7558c	ldp w20,w6,[x6, #0x8]
00b75590	add x5,x5,#0x10
00b75594	cmp w5,#0x80
00b75598	eor w7,w7,w3
00b7559c	and w21,w7,#0x3f
00b755a0	ubfx w22,w7,#0x8,#0x6
00b755a4	ldr w21,[x12, w21, UXTW #0x2]
00b755a8	ubfx w23,w7,#0x10,#0x6
00b755ac	ldr w22,[x13, w22, UXTW #0x2]
00b755b0	eor w19,w19,w3, ROR #0x4
00b755b4	ubfx w7,w7,#0x18,#0x6
00b755b8	ldr w23,[x14, w23, UXTW #0x2]
00b755bc	and w24,w19,#0x3f
00b755c0	ldr w7,[x15, w7, UXTW #0x2]
00b755c4	ubfx w25,w19,#0x8,#0x6
00b755c8	eor w4,w21,w4
00b755cc	ldr w24,[x16, w24, UXTW #0x2]
00b755d0	ubfx w21,w19,#0x10,#0x6
00b755d4	ldr w25,[x17, w25, UXTW #0x2]
00b755d8	eor w4,w4,w22
00b755dc	ubfx w19,w19,#0x18,#0x6
00b755e0	ldr w21,[x18, w21, UXTW #0x2]
00b755e4	eor w4,w4,w23
00b755e8	ldr w19,[x1, w19, UXTW #0x2]
00b755ec	eor w4,w4,w7
00b755f0	eor w4,w4,w24
00b755f4	eor w4,w4,w25
00b755f8	eor w4,w4,w21
00b755fc	eor w4,w4,w19
00b75600	eor w7,w20,w4
00b75604	and w19,w7,#0x3f
00b75608	ubfx w20,w7,#0x8,#0x6
00b7560c	ldr w19,[x12, w19, UXTW #0x2]
00b75610	ubfx w21,w7,#0x10,#0x6
00b75614	ldr w20,[x13, w20, UXTW #0x2]
00b75618	eor w6,w6,w4, ROR #0x4
00b7561c	ubfx w7,w7,#0x18,#0x6
00b75620	ldr w21,[x14, w21, UXTW #0x2]
00b75624	and w22,w6,#0x3f
00b75628	ldr w7,[x15, w7, UXTW #0x2]
00b7562c	ubfx w23,w6,#0x8,#0x6
00b75630	ldr w22,[x16, w22, UXTW #0x2]
00b75634	eor w3,w19,w3
00b75638	ubfx w24,w6,#0x10,#0x6
00b7563c	ldr w23,[x17, w23, UXTW #0x2]
00b75640	eor w3,w3,w20
00b75644	ubfx w6,w6,#0x18,#0x6
00b75648	ldr w24,[x18, w24, UXTW #0x2]
00b7564c	eor w3,w3,w21
00b75650	ldr w6,[x1, w6, UXTW #0x2]
00b75654	eor w3,w3,w7
00b75658	eor w3,w3,w22
00b7565c	eor w3,w3,w23
00b75660	eor w3,w3,w24
00b75664	eor w3,w3,w6
00b75668	b.ne 0x00b75584
00b7566c	mov x5,xzr
00b75670	add x6,x0,#0x80
00b75674	add x7,x6,x5
00b75678	ldp w19,w20,[x7]
00b7567c	ldp w21,w7,[x7, #0x8]
00b75680	add x5,x5,#0x10
00b75684	cmp w5,#0x80
00b75688	eor w19,w19,w4
00b7568c	and w22,w19,#0x3f
00b75690	ubfx w23,w19,#0x8,#0x6
00b75694	ldr w22,[x12, w22, UXTW #0x2]
00b75698	ubfx w24,w19,#0x10,#0x6
00b7569c	ldr w23,[x13, w23, UXTW #0x2]
00b756a0	eor w20,w20,w4, ROR #0x4
00b756a4	ubfx w19,w19,#0x18,#0x6
00b756a8	ldr w24,[x14, w24, UXTW #0x2]
00b756ac	and w25,w20,#0x3f
00b756b0	ldr w19,[x15, w19, UXTW #0x2]
00b756b4	ubfx w26,w20,#0x8,#0x6
00b756b8	eor w3,w22,w3
00b756bc	ldr w25,[x16, w25, UXTW #0x2]
00b756c0	ubfx w22,w20,#0x10,#0x6
00b756c4	ldr w26,[x17, w26, UXTW #0x2]
00b756c8	eor w3,w3,w23
00b756cc	ubfx w20,w20,#0x18,#0x6
00b756d0	ldr w22,[x18, w22, UXTW #0x2]
00b756d4	eor w3,w3,w24
00b756d8	ldr w20,[x1, w20, UXTW #0x2]
00b756dc	eor w3,w3,w19
00b756e0	eor w3,w3,w25
00b756e4	eor w3,w3,w26
00b756e8	eor w3,w3,w22
00b756ec	eor w3,w3,w20
00b756f0	eor w19,w21,w3
00b756f4	and w20,w19,#0x3f
00b756f8	ubfx w21,w19,#0x8,#0x6
00b756fc	ldr w20,[x12, w20, UXTW #0x2]
00b75700	ubfx w22,w19,#0x10,#0x6
00b75704	ldr w21,[x13, w21, UXTW #0x2]
00b75708	eor w7,w7,w3, ROR #0x4
00b7570c	ubfx w19,w19,#0x18,#0x6
00b75710	ldr w22,[x14, w22, UXTW #0x2]
00b75714	and w23,w7,#0x3f
00b75718	ldr w19,[x15, w19, UXTW #0x2]
00b7571c	ubfx w24,w7,#0x8,#0x6
00b75720	ldr w23,[x16, w23, UXTW #0x2]
00b75724	eor w4,w20,w4
00b75728	ubfx w25,w7,#0x10,#0x6
00b7572c	ldr w24,[x17, w24, UXTW #0x2]
00b75730	eor w4,w4,w21
00b75734	ubfx w7,w7,#0x18,#0x6
00b75738	ldr w25,[x18, w25, UXTW #0x2]
00b7573c	eor w4,w4,w22
00b75740	ldr w7,[x1, w7, UXTW #0x2]
00b75744	eor w4,w4,w19
00b75748	eor w4,w4,w23
00b7574c	eor w4,w4,w24
00b75750	eor w4,w4,w25
00b75754	eor w4,w4,w7
00b75758	b.ne 0x00b75674
00b7575c	mov x5,xzr
00b75760	add x0,x0,#0x100
00b75764	add x6,x0,x5
00b75768	ldp w7,w19,[x6]
00b7576c	ldp w20,w6,[x6, #0x8]
00b75770	add x5,x5,#0x10
00b75774	cmp w5,#0x80
00b75778	eor w7,w7,w3
00b7577c	and w21,w7,#0x3f
00b75780	ubfx w22,w7,#0x8,#0x6
00b75784	ldr w21,[x12, w21, UXTW #0x2]
00b75788	ubfx w23,w7,#0x10,#0x6
00b7578c	ldr w22,[x13, w22, UXTW #0x2]
00b75790	eor w19,w19,w3, ROR #0x4
00b75794	ubfx w7,w7,#0x18,#0x6
00b75798	ldr w23,[x14, w23, UXTW #0x2]
00b7579c	and w24,w19,#0x3f
00b757a0	ldr w7,[x15, w7, UXTW #0x2]
00b757a4	ubfx w25,w19,#0x8,#0x6
00b757a8	eor w4,w21,w4
00b757ac	ldr w24,[x16, w24, UXTW #0x2]
00b757b0	ubfx w21,w19,#0x10,#0x6
00b757b4	ldr w25,[x17, w25, UXTW #0x2]
00b757b8	eor w4,w4,w22
00b757bc	ubfx w19,w19,#0x18,#0x6
00b757c0	ldr w21,[x18, w21, UXTW #0x2]
00b757c4	eor w4,w4,w23
00b757c8	ldr w19,[x1, w19, UXTW #0x2]
00b757cc	eor w4,w4,w7
00b757d0	eor w4,w4,w24
00b757d4	eor w4,w4,w25
00b757d8	eor w4,w4,w21
00b757dc	eor w4,w4,w19
00b757e0	eor w7,w20,w4
00b757e4	and w19,w7,#0x3f
00b757e8	ubfx w20,w7,#0x8,#0x6
00b757ec	ldr w19,[x12, w19, UXTW #0x2]
00b757f0	ubfx w21,w7,#0x10,#0x6
00b757f4	ldr w20,[x13, w20, UXTW #0x2]
00b757f8	eor w6,w6,w4, ROR #0x4
00b757fc	ubfx w7,w7,#0x18,#0x6
00b75800	ldr w21,[x14, w21, UXTW #0x2]
00b75804	and w22,w6,#0x3f
00b75808	ldr w7,[x15, w7, UXTW #0x2]
00b7580c	ubfx w23,w6,#0x8,#0x6
00b75810	ldr w22,[x16, w22, UXTW #0x2]
00b75814	eor w3,w19,w3
00b75818	ubfx w24,w6,#0x10,#0x6
00b7581c	ldr w23,[x17, w23, UXTW #0x2]
00b75820	eor w3,w3,w20
00b75824	ubfx w6,w6,#0x18,#0x6
00b75828	ldr w24,[x18, w24, UXTW #0x2]
00b7582c	eor w3,w3,w21
00b75830	ldr w6,[x1, w6, UXTW #0x2]
00b75834	eor w3,w3,w7
00b75838	eor w3,w3,w22
00b7583c	eor w3,w3,w23
00b75840	eor w3,w3,w24
00b75844	eor w3,w3,w6
00b75848	b.ne 0x00b75764
00b7584c	ror w12,w3,#0x1
00b75850	eor w13,w12,w4
00b75854	and w10,w13,w10
00b75858	eor w12,w10,w12
00b7585c	eor w10,w10,w4
00b75860	extr w10,w4,w10,#0x1
00b75864	eor w13,w12,w10, LSR #0x8
00b75868	and w11,w13,w11
00b7586c	eor w12,w11,w12
00b75870	eor w10,w10,w11, LSL #0x8
00b75874	eor w11,w12,w10, LSR #0x2
00b75878	and w9,w11,w9
00b7587c	eor w11,w9,w12
00b75880	eor w9,w10,w9, LSL #0x2
00b75884	and w10,w9,#0xffff
00b75888	eor w10,w10,w11, LSR #0x10
00b7588c	eor w9,w10,w9
00b75890	eor w10,w11,w10, LSL #0x10
00b75894	eor w11,w9,w10, LSR #0x4
00b75898	and w8,w11,w8
00b7589c	eor w9,w8,w9
00b758a0	eor w8,w10,w8, LSL #0x4
00b758a4	rev w8,w8
00b758a8	rev w9,w9
00b758ac	stp w8,w9,[x2]
00b758b0	ldp x20,x19,[sp, #0x30]
00b758b4	ldp x22,x21,[sp, #0x20]
00b758b8	ldp x24,x23,[sp, #0x10]
00b758bc	mov w0,wzr
00b758c0	ldp x26,x25,[sp], #0x40
00b758c4	ret

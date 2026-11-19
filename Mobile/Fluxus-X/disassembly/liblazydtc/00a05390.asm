; bn_mul_comba8 @ 00a05390
00a05390	sub sp,sp,#0xa0
00a05394	stp x28,x27,[sp, #0x40]
00a05398	stp x26,x25,[sp, #0x50]
00a0539c	stp x24,x23,[sp, #0x60]
00a053a0	stp x22,x21,[sp, #0x70]
00a053a4	stp x20,x19,[sp, #0x80]
00a053a8	stp x29,x30,[sp, #0x90]
00a053ac	ldr x9,[x1]
00a053b0	ldr x10,[x2]
00a053b4	mov w8,#0x2
00a053b8	and x11,x9,#0xffffffff
00a053bc	lsr x9,x9,#0x20
00a053c0	and x12,x10,#0xffffffff
00a053c4	lsr x10,x10,#0x20
00a053c8	mul x13,x10,x11
00a053cc	mul x11,x12,x11
00a053d0	mul x12,x12,x9
00a053d4	mul x9,x10,x9
00a053d8	adds x10,x13,x12
00a053dc	cset w12,cs
00a053e0	adds x11,x11,x10, LSL #0x20
00a053e4	add x9,x9,x10, LSR #0x20
00a053e8	str x11,[x0]
00a053ec	add x9,x9,x12, LSL #0x20
00a053f0	ldp x10,x13,[x1]
00a053f4	ldp x11,x12,[x2]
00a053f8	cinc x9,x9,cs
00a053fc	and x14,x10,#0xffffffff
00a05400	lsr x10,x10,#0x20
00a05404	and x15,x12,#0xffffffff
00a05408	lsr x12,x12,#0x20
00a0540c	and x16,x13,#0xffffffff
00a05410	lsr x13,x13,#0x20
00a05414	and x17,x11,#0xffffffff
00a05418	lsr x11,x11,#0x20
00a0541c	mul x18,x12,x14
00a05420	mul x14,x15,x14
00a05424	mul x15,x15,x10
00a05428	mul x10,x12,x10
00a0542c	mul x12,x11,x16
00a05430	mul x16,x17,x16
00a05434	mul x17,x17,x13
00a05438	mul x11,x11,x13
00a0543c	adds x13,x18,x15
00a05440	cset w15,cs
00a05444	adds x12,x12,x17
00a05448	cset w17,cs
00a0544c	add x11,x11,x12, LSR #0x20
00a05450	add x10,x10,x13, LSR #0x20
00a05454	adds x16,x16,x12, LSL #0x20
00a05458	add x11,x11,x17, LSL #0x20
00a0545c	add x10,x10,x15, LSL #0x20
00a05460	cinc x11,x11,cs
00a05464	adds x12,x14,x13, LSL #0x20
00a05468	cinc x10,x10,cs
00a0546c	adds x9,x9,x12
00a05470	cinc x10,x10,cs
00a05474	adds x9,x9,x16
00a05478	cinc x11,x11,cs
00a0547c	str x9,[x0, #0x8]
00a05480	adds x9,x10,x11
00a05484	ldp x12,x10,[x1, #0x8]
00a05488	ldp x13,x14,[x2]
00a0548c	ldr x11,[x1]
00a05490	ldr x15,[x2, #0x10]
00a05494	and x17,x10,#0xffffffff
00a05498	lsr x10,x10,#0x20
00a0549c	and x18,x13,#0xffffffff
00a054a0	lsr x13,x13,#0x20
00a054a4	and x3,x12,#0xffffffff
00a054a8	lsr x12,x12,#0x20
00a054ac	and x4,x14,#0xffffffff
00a054b0	lsr x14,x14,#0x20
00a054b4	and x5,x11,#0xffffffff
00a054b8	lsr x11,x11,#0x20
00a054bc	and x6,x15,#0xffffffff
00a054c0	lsr x15,x15,#0x20
00a054c4	mul x7,x13,x17
00a054c8	mul x17,x18,x17
00a054cc	mul x18,x18,x10
00a054d0	cset w16,cs
00a054d4	mul x10,x13,x10
00a054d8	mul x13,x14,x3
00a054dc	mul x3,x4,x3
00a054e0	mul x4,x4,x12
00a054e4	mul x12,x14,x12
00a054e8	mul x14,x15,x5
00a054ec	mul x5,x6,x5
00a054f0	mul x6,x6,x11
00a054f4	mul x11,x15,x11
00a054f8	adds x15,x7,x18
00a054fc	cset w18,cs
00a05500	add x10,x10,x15, LSR #0x20
00a05504	adds x17,x17,x15, LSL #0x20
00a05508	add x10,x10,x18, LSL #0x20
00a0550c	cinc x10,x10,cs
00a05510	adds x9,x9,x17
00a05514	cinc x10,x10,cs
00a05518	adds x13,x13,x4
00a0551c	cset w15,cs
00a05520	add x12,x12,x13, LSR #0x20
00a05524	adds x17,x3,x13, LSL #0x20
00a05528	add x12,x12,x15, LSL #0x20
00a0552c	cinc x12,x12,cs
00a05530	adds x9,x9,x17
00a05534	cinc x12,x12,cs
00a05538	adds x10,x10,x16
00a0553c	cset w13,cs
00a05540	csinc x15,x8,xzr,cs
00a05544	adds x10,x10,x12
00a05548	csel x12,x13,x15,cc
00a0554c	adds x13,x14,x6
00a05550	cset w14,cs
00a05554	add x11,x11,x13, LSR #0x20
00a05558	adds x15,x5,x13, LSL #0x20
00a0555c	add x11,x11,x14, LSL #0x20
00a05560	cinc x11,x11,cs
00a05564	adds x9,x9,x15
00a05568	cinc x11,x11,cs
00a0556c	str x9,[x0, #0x10]
00a05570	adds x9,x10,x11
00a05574	ldp x10,x11,[x2, #0x10]
00a05578	ldp x13,x14,[x1]
00a0557c	ldp x15,x16,[x2]
00a05580	ldp x17,x18,[x1, #0x10]
00a05584	and x4,x11,#0xffffffff
00a05588	and x3,x13,#0xffffffff
00a0558c	lsr x13,x13,#0x20
00a05590	lsr x11,x11,#0x20
00a05594	and x5,x14,#0xffffffff
00a05598	lsr x14,x14,#0x20
00a0559c	and x6,x10,#0xffffffff
00a055a0	lsr x10,x10,#0x20
00a055a4	and x7,x17,#0xffffffff
00a055a8	lsr x17,x17,#0x20
00a055ac	and x19,x16,#0xffffffff
00a055b0	lsr x16,x16,#0x20
00a055b4	and x20,x18,#0xffffffff
00a055b8	lsr x18,x18,#0x20
00a055bc	and x21,x15,#0xffffffff
00a055c0	lsr x15,x15,#0x20
00a055c4	mul x22,x11,x3
00a055c8	mul x3,x4,x3
00a055cc	mul x4,x4,x13
00a055d0	cinc x12,x12,cs
00a055d4	mul x11,x11,x13
00a055d8	mul x13,x10,x5
00a055dc	mul x5,x6,x5
00a055e0	mul x6,x6,x14
00a055e4	mul x10,x10,x14
00a055e8	mul x14,x16,x7
00a055ec	mul x7,x19,x7
00a055f0	mul x19,x19,x17
00a055f4	mul x16,x16,x17
00a055f8	mul x17,x15,x20
00a055fc	mul x20,x21,x20
00a05600	mul x21,x21,x18
00a05604	mul x15,x15,x18
00a05608	adds x18,x22,x4
00a0560c	cset w4,cs
00a05610	add x11,x11,x18, LSR #0x20
00a05614	adds x3,x3,x18, LSL #0x20
00a05618	add x11,x11,x4, LSL #0x20
00a0561c	cinc x11,x11,cs
00a05620	adds x9,x9,x3
00a05624	cinc x11,x11,cs
00a05628	adds x13,x13,x6
00a0562c	cset w18,cs
00a05630	add x10,x10,x13, LSR #0x20
00a05634	adds x3,x5,x13, LSL #0x20
00a05638	add x10,x10,x18, LSL #0x20
00a0563c	cinc x10,x10,cs
00a05640	adds x9,x9,x3
00a05644	cinc x10,x10,cs
00a05648	adds x11,x12,x11
00a0564c	cset w12,cs
00a05650	csinc x13,x8,xzr,cs
00a05654	adds x10,x11,x10
00a05658	csel x11,x12,x13,cc
00a0565c	adds x12,x14,x19
00a05660	cset w13,cs
00a05664	adds x14,x7,x12, LSL #0x20
00a05668	add x12,x16,x12, LSR #0x20
00a0566c	add x12,x12,x13, LSL #0x20
00a05670	cinc x12,x12,cs
00a05674	adds x9,x9,x14
00a05678	cinc x12,x12,cs
00a0567c	adds x12,x10,x12
00a05680	cinc x10,x11,cs
00a05684	adds x11,x17,x21
00a05688	cset w13,cs
00a0568c	adds x14,x20,x11, LSL #0x20
00a05690	add x11,x15,x11, LSR #0x20
00a05694	add x11,x11,x13, LSL #0x20
00a05698	cinc x11,x11,cs
00a0569c	adds x9,x9,x14
00a056a0	cinc x11,x11,cs
00a056a4	str x9,[x0, #0x18]
00a056a8	adds x9,x11,x12
00a056ac	ldp x13,x11,[x1, #0x18]
00a056b0	ldp x14,x15,[x2]
00a056b4	ldp x17,x12,[x1, #0x8]
00a056b8	ldr x16,[x1]
00a056bc	ldp x18,x3,[x2, #0x10]
00a056c0	ldr x4,[x2, #0x20]
00a056c4	and x5,x11,#0xffffffff
00a056c8	lsr x11,x11,#0x20
00a056cc	and x6,x14,#0xffffffff
00a056d0	lsr x14,x14,#0x20
00a056d4	and x7,x13,#0xffffffff
00a056d8	lsr x13,x13,#0x20
00a056dc	and x19,x15,#0xffffffff
00a056e0	lsr x15,x15,#0x20
00a056e4	and x20,x12,#0xffffffff
00a056e8	lsr x12,x12,#0x20
00a056ec	and x21,x18,#0xffffffff
00a056f0	lsr x18,x18,#0x20
00a056f4	and x22,x17,#0xffffffff
00a056f8	lsr x17,x17,#0x20
00a056fc	and x23,x3,#0xffffffff
00a05700	lsr x3,x3,#0x20
00a05704	and x24,x16,#0xffffffff
00a05708	lsr x16,x16,#0x20
00a0570c	and x25,x4,#0xffffffff
00a05710	lsr x4,x4,#0x20
00a05714	mul x26,x14,x5
00a05718	mul x5,x6,x5
00a0571c	mul x6,x6,x11
00a05720	cinc x10,x10,cs
00a05724	mul x11,x14,x11
00a05728	mul x14,x15,x7
00a0572c	mul x7,x19,x7
00a05730	mul x19,x19,x13
00a05734	mul x13,x15,x13
00a05738	mul x15,x18,x20
00a0573c	mul x20,x21,x20
00a05740	mul x21,x21,x12
00a05744	mul x12,x18,x12
00a05748	mul x18,x3,x22
00a0574c	mul x22,x23,x22
00a05750	mul x23,x23,x17
00a05754	mul x17,x3,x17
00a05758	mul x3,x4,x24
00a0575c	mul x24,x25,x24
00a05760	mul x25,x25,x16
00a05764	mul x16,x4,x16
00a05768	adds x4,x26,x6
00a0576c	cset w6,cs
00a05770	add x11,x11,x4, LSR #0x20
00a05774	adds x5,x5,x4, LSL #0x20
00a05778	add x11,x11,x6, LSL #0x20
00a0577c	cinc x11,x11,cs
00a05780	adds x9,x9,x5
00a05784	cinc x11,x11,cs
00a05788	adds x14,x14,x19
00a0578c	cset w4,cs
00a05790	add x13,x13,x14, LSR #0x20
00a05794	adds x5,x7,x14, LSL #0x20
00a05798	add x13,x13,x4, LSL #0x20
00a0579c	cinc x13,x13,cs
00a057a0	adds x9,x9,x5
00a057a4	cinc x13,x13,cs
00a057a8	adds x10,x10,x11
00a057ac	mov w8,#0x2
00a057b0	cset w11,cs
00a057b4	csinc x14,x8,xzr,cs
00a057b8	adds x10,x10,x13
00a057bc	csel x11,x11,x14,cc
00a057c0	adds x13,x15,x21
00a057c4	cset w14,cs
00a057c8	add x12,x12,x13, LSR #0x20
00a057cc	adds x15,x20,x13, LSL #0x20
00a057d0	add x12,x12,x14, LSL #0x20
00a057d4	cinc x12,x12,cs
00a057d8	adds x9,x9,x15
00a057dc	cinc x12,x12,cs
00a057e0	adds x10,x10,x12
00a057e4	cinc x11,x11,cs
00a057e8	adds x12,x18,x23
00a057ec	cset w13,cs
00a057f0	adds x14,x22,x12, LSL #0x20
00a057f4	add x12,x17,x12, LSR #0x20
00a057f8	add x12,x12,x13, LSL #0x20
00a057fc	cinc x12,x12,cs
00a05800	adds x9,x9,x14
00a05804	cinc x12,x12,cs
00a05808	adds x12,x12,x10
00a0580c	cinc x10,x11,cs
00a05810	adds x11,x3,x25
00a05814	cset w13,cs
00a05818	adds x14,x24,x11, LSL #0x20
00a0581c	add x11,x16,x11, LSR #0x20
00a05820	add x11,x11,x13, LSL #0x20
00a05824	cinc x11,x11,cs
00a05828	adds x9,x14,x9
00a0582c	cinc x11,x11,cs
00a05830	str x9,[x0, #0x20]
00a05834	str x0,[sp, #0x38]
00a05838	adds x9,x11,x12
00a0583c	ldp x11,x12,[x2, #0x20]
00a05840	ldp x14,x13,[x1]
00a05844	ldp x15,x16,[x2, #0x10]
00a05848	ldp x17,x18,[x1, #0x10]
00a0584c	ldp x3,x4,[x2]
00a05850	ldp x5,x6,[x1, #0x20]
00a05854	and x7,x14,#0xffffffff
00a05858	lsr x14,x14,#0x20
00a0585c	and x19,x12,#0xffffffff
00a05860	lsr x12,x12,#0x20
00a05864	and x20,x13,#0xffffffff
00a05868	lsr x13,x13,#0x20
00a0586c	and x21,x11,#0xffffffff
00a05870	lsr x11,x11,#0x20
00a05874	and x22,x17,#0xffffffff
00a05878	lsr x17,x17,#0x20
00a0587c	and x23,x16,#0xffffffff
00a05880	lsr x16,x16,#0x20
00a05884	and x24,x18,#0xffffffff
00a05888	lsr x18,x18,#0x20
00a0588c	and x25,x15,#0xffffffff
00a05890	lsr x15,x15,#0x20
00a05894	and x26,x5,#0xffffffff
00a05898	lsr x5,x5,#0x20
00a0589c	and x27,x4,#0xffffffff
00a058a0	lsr x4,x4,#0x20
00a058a4	and x28,x6,#0xffffffff
00a058a8	lsr x6,x6,#0x20
00a058ac	and x29,x3,#0xffffffff
00a058b0	lsr x3,x3,#0x20
00a058b4	mul x30,x12,x7
00a058b8	mul x7,x19,x7
00a058bc	mul x19,x19,x14
00a058c0	cinc x10,x10,cs
00a058c4	mul x12,x12,x14
00a058c8	mul x14,x11,x20
00a058cc	mul x20,x21,x20
00a058d0	mul x21,x21,x13
00a058d4	mul x11,x11,x13
00a058d8	mul x13,x16,x22
00a058dc	mul x22,x23,x22
00a058e0	mul x23,x23,x17
00a058e4	mul x16,x16,x17
00a058e8	mul x17,x15,x24
00a058ec	mul x24,x25,x24
00a058f0	mul x25,x25,x18
00a058f4	mul x15,x15,x18
00a058f8	mul x18,x4,x26
00a058fc	mul x26,x27,x26
00a05900	mul x27,x27,x5
00a05904	mul x4,x4,x5
00a05908	mul x5,x3,x28
00a0590c	mul x28,x29,x28
00a05910	mul x29,x29,x6
00a05914	mul x3,x3,x6
00a05918	adds x6,x30,x19
00a0591c	cset w19,cs
00a05920	add x12,x12,x6, LSR #0x20
00a05924	adds x7,x7,x6, LSL #0x20
00a05928	add x12,x12,x19, LSL #0x20
00a0592c	cinc x12,x12,cs
00a05930	adds x9,x9,x7
00a05934	cinc x12,x12,cs
00a05938	adds x14,x14,x21
00a0593c	cset w6,cs
00a05940	add x11,x11,x14, LSR #0x20
00a05944	adds x7,x20,x14, LSL #0x20
00a05948	add x11,x11,x6, LSL #0x20
00a0594c	cinc x11,x11,cs
00a05950	adds x9,x9,x7
00a05954	cinc x11,x11,cs
00a05958	adds x10,x10,x12
00a0595c	cset w12,cs
00a05960	csinc x14,x8,xzr,cs
00a05964	adds x10,x10,x11
00a05968	csel x11,x12,x14,cc
00a0596c	adds x12,x13,x23
00a05970	cset w13,cs
00a05974	adds x14,x22,x12, LSL #0x20
00a05978	add x12,x16,x12, LSR #0x20
00a0597c	add x12,x12,x13, LSL #0x20
00a05980	cinc x12,x12,cs
00a05984	adds x9,x9,x14
00a05988	cinc x12,x12,cs
00a0598c	adds x10,x10,x12
00a05990	cinc x11,x11,cs
00a05994	adds x12,x17,x25
00a05998	cset w13,cs
00a0599c	adds x14,x24,x12, LSL #0x20
00a059a0	add x12,x15,x12, LSR #0x20
00a059a4	add x12,x12,x13, LSL #0x20
00a059a8	cinc x12,x12,cs
00a059ac	adds x9,x9,x14
00a059b0	cinc x12,x12,cs
00a059b4	adds x10,x12,x10
00a059b8	cinc x11,x11,cs
00a059bc	adds x12,x18,x27
00a059c0	cset w13,cs
00a059c4	adds x14,x26,x12, LSL #0x20
00a059c8	add x12,x4,x12, LSR #0x20
00a059cc	add x12,x12,x13, LSL #0x20
00a059d0	cinc x12,x12,cs
00a059d4	adds x13,x14,x9
00a059d8	cinc x9,x12,cs
00a059dc	adds x10,x9,x10
00a059e0	cinc x8,x11,cs
00a059e4	adds x11,x5,x29
00a059e8	cset w12,cs
00a059ec	adds x14,x28,x11, LSL #0x20
00a059f0	add x11,x3,x11, LSR #0x20
00a059f4	add x11,x11,x12, LSL #0x20
00a059f8	cinc x11,x11,cs
00a059fc	adds x12,x14,x13
00a05a00	cinc x11,x11,cs
00a05a04	str x8,[sp, #0x30]
00a05a08	adds x8,x11,x10
00a05a0c	str x12,[x0, #0x28]
00a05a10	str x8,[sp, #0x28]
00a05a14	ldp x13,x11,[x1, #0x28]
00a05a18	ldp x17,x12,[x1, #0x18]
00a05a1c	ldp x14,x15,[x2]
00a05a20	ldp x4,x16,[x1, #0x8]
00a05a24	ldp x18,x3,[x2, #0x10]
00a05a28	ldp x5,x6,[x2, #0x20]
00a05a2c	ldr x8,[x1]
00a05a30	ldr x9,[x2, #0x30]
00a05a34	and x7,x11,#0xffffffff
00a05a38	lsr x11,x11,#0x20
00a05a3c	and x19,x14,#0xffffffff
00a05a40	lsr x14,x14,#0x20
00a05a44	and x20,x13,#0xffffffff
00a05a48	lsr x13,x13,#0x20
00a05a4c	and x21,x15,#0xffffffff
00a05a50	lsr x15,x15,#0x20
00a05a54	and x22,x12,#0xffffffff
00a05a58	lsr x12,x12,#0x20
00a05a5c	and x23,x18,#0xffffffff
00a05a60	lsr x18,x18,#0x20
00a05a64	and x24,x17,#0xffffffff
00a05a68	lsr x17,x17,#0x20
00a05a6c	and x25,x3,#0xffffffff
00a05a70	lsr x3,x3,#0x20
00a05a74	and x26,x16,#0xffffffff
00a05a78	lsr x16,x16,#0x20
00a05a7c	and x27,x5,#0xffffffff
00a05a80	lsr x5,x5,#0x20
00a05a84	and x28,x4,#0xffffffff
00a05a88	lsr x4,x4,#0x20
00a05a8c	and x29,x6,#0xffffffff
00a05a90	lsr x6,x6,#0x20
00a05a94	mul x30,x14,x7
00a05a98	mul x7,x19,x7
00a05a9c	mul x19,x19,x11
00a05aa0	mul x11,x14,x11
00a05aa4	mul x14,x15,x20
00a05aa8	mul x20,x21,x20
00a05aac	mul x21,x21,x13
00a05ab0	mul x13,x15,x13
00a05ab4	mul x15,x18,x22
00a05ab8	mul x22,x23,x22
00a05abc	mul x23,x23,x12
00a05ac0	mul x12,x18,x12
00a05ac4	mul x18,x3,x24
00a05ac8	mul x24,x25,x24
00a05acc	mul x25,x25,x17
00a05ad0	mul x17,x3,x17
00a05ad4	mul x3,x5,x26
00a05ad8	mul x0,x5,x16
00a05adc	mul x5,x6,x28
00a05ae0	mul x28,x29,x28
00a05ae4	mul x29,x29,x4
00a05ae8	mul x4,x6,x4
00a05aec	and x6,x8,#0xffffffff
00a05af0	lsr x10,x8,#0x20
00a05af4	and x8,x9,#0xffffffff
00a05af8	lsr x9,x9,#0x20
00a05afc	mul x26,x27,x26
00a05b00	mul x27,x27,x16
00a05b04	mul x16,x9,x6
00a05b08	mul x6,x8,x6
00a05b0c	mul x8,x8,x10
00a05b10	mul x10,x9,x10
00a05b14	ldr x9,[sp, #0x30]
00a05b18	cinc x9,x9,cs
00a05b1c	adds x19,x30,x19
00a05b20	cset w30,cs
00a05b24	adds x7,x7,x19, LSL #0x20
00a05b28	add x11,x11,x19, LSR #0x20
00a05b2c	ldr x19,[sp, #0x28]
00a05b30	add x11,x11,x30, LSL #0x20
00a05b34	cinc x11,x11,cs
00a05b38	adds x7,x19,x7
00a05b3c	cinc x11,x11,cs
00a05b40	adds x14,x14,x21
00a05b44	cset w19,cs
00a05b48	add x13,x13,x14, LSR #0x20
00a05b4c	adds x20,x20,x14, LSL #0x20
00a05b50	add x13,x13,x19, LSL #0x20
00a05b54	cinc x13,x13,cs
00a05b58	adds x14,x7,x20
00a05b5c	cinc x13,x13,cs
00a05b60	adds x9,x9,x11
00a05b64	mov w7,#0x2
00a05b68	cset w11,cs
00a05b6c	csinc x7,x7,xzr,cs
00a05b70	adds x9,x9,x13
00a05b74	csel x11,x11,x7,cc
00a05b78	adds x13,x15,x23
00a05b7c	cset w15,cs
00a05b80	add x12,x12,x13, LSR #0x20
00a05b84	adds x7,x22,x13, LSL #0x20
00a05b88	add x12,x12,x15, LSL #0x20
00a05b8c	cinc x12,x12,cs
00a05b90	adds x13,x14,x7
00a05b94	cinc x12,x12,cs
00a05b98	adds x9,x9,x12
00a05b9c	cinc x11,x11,cs
00a05ba0	adds x12,x18,x25
00a05ba4	cset w14,cs
00a05ba8	adds x15,x24,x12, LSL #0x20
00a05bac	add x12,x17,x12, LSR #0x20
00a05bb0	add x12,x12,x14, LSL #0x20
00a05bb4	cinc x12,x12,cs
00a05bb8	adds x13,x13,x15
00a05bbc	cinc x12,x12,cs
00a05bc0	adds x9,x12,x9
00a05bc4	cinc x11,x11,cs
00a05bc8	adds x12,x3,x27
00a05bcc	cset w14,cs
00a05bd0	adds x15,x26,x12, LSL #0x20
00a05bd4	add x12,x0,x12, LSR #0x20
00a05bd8	add x12,x12,x14, LSL #0x20
00a05bdc	cinc x12,x12,cs
00a05be0	adds x13,x15,x13
00a05be4	cinc x12,x12,cs
00a05be8	adds x9,x12,x9
00a05bec	cinc x11,x11,cs
00a05bf0	adds x12,x5,x29
00a05bf4	cset w14,cs
00a05bf8	adds x15,x28,x12, LSL #0x20
00a05bfc	add x12,x4,x12, LSR #0x20
00a05c00	add x12,x12,x14, LSL #0x20
00a05c04	cinc x12,x12,cs
00a05c08	adds x13,x15,x13
00a05c0c	cinc x12,x12,cs
00a05c10	adds x12,x12,x9
00a05c14	cinc x9,x11,cs
00a05c18	adds x8,x16,x8
00a05c1c	cset w11,cs
00a05c20	adds x14,x6,x8, LSL #0x20
00a05c24	add x8,x10,x8, LSR #0x20
00a05c28	str x9,[sp, #0x30]
00a05c2c	add x8,x8,x11, LSL #0x20
00a05c30	ldr x9,[sp, #0x38]
00a05c34	cinc x8,x8,cs
00a05c38	adds x10,x14,x13
00a05c3c	cinc x8,x8,cs
00a05c40	adds x8,x8,x12
00a05c44	str x10,[x9, #0x30]
00a05c48	str x8,[sp, #0x28]
00a05c4c	ldp x11,x12,[x2, #0x30]
00a05c50	ldp x14,x13,[x1]
00a05c54	ldp x8,x15,[x2, #0x20]
00a05c58	ldp x16,x17,[x1, #0x10]
00a05c5c	ldp x18,x0,[x2, #0x10]
00a05c60	ldp x3,x4,[x1, #0x20]
00a05c64	and x7,x13,#0xffffffff
00a05c68	and x19,x11,#0xffffffff
00a05c6c	lsr x11,x11,#0x20
00a05c70	mul x9,x11,x7
00a05c74	and x20,x16,#0xffffffff
00a05c78	lsr x16,x16,#0x20
00a05c7c	and x21,x15,#0xffffffff
00a05c80	lsr x15,x15,#0x20
00a05c84	and x22,x17,#0xffffffff
00a05c88	lsr x17,x17,#0x20
00a05c8c	and x23,x8,#0xffffffff
00a05c90	lsr x8,x8,#0x20
00a05c94	and x24,x3,#0xffffffff
00a05c98	and x25,x0,#0xffffffff
00a05c9c	lsr x0,x0,#0x20
00a05ca0	str x9,[sp, #0x8]
00a05ca4	mul x9,x19,x7
00a05ca8	str x9,[sp, #0x10]
00a05cac	mul x9,x15,x20
00a05cb0	mul x20,x21,x20
00a05cb4	mul x21,x21,x16
00a05cb8	mul x15,x15,x16
00a05cbc	mul x16,x8,x22
00a05cc0	mul x22,x23,x22
00a05cc4	mul x23,x23,x17
00a05cc8	mul x17,x8,x17
00a05ccc	mul x8,x0,x24
00a05cd0	lsr x3,x3,#0x20
00a05cd4	and x26,x4,#0xffffffff
00a05cd8	lsr x4,x4,#0x20
00a05cdc	and x27,x18,#0xffffffff
00a05ce0	lsr x18,x18,#0x20
00a05ce4	stp x9,x8,[sp, #0x18]
00a05ce8	mul x24,x25,x24
00a05cec	mul x25,x25,x3
00a05cf0	mul x0,x0,x3
00a05cf4	mul x3,x18,x26
00a05cf8	mul x26,x27,x26
00a05cfc	mul x27,x27,x4
00a05d00	ldp x29,x30,[x1, #0x30]
00a05d04	mul x18,x18,x4
00a05d08	ldr x4,[x2, #0x8]
00a05d0c	and x5,x14,#0xffffffff
00a05d10	lsr x14,x14,#0x20
00a05d14	and x6,x12,#0xffffffff
00a05d18	lsr x12,x12,#0x20
00a05d1c	lsr x13,x13,#0x20
00a05d20	and x9,x29,#0xffffffff
00a05d24	and x8,x4,#0xffffffff
00a05d28	lsr x4,x4,#0x20
00a05d2c	mul x28,x12,x5
00a05d30	mul x5,x6,x5
00a05d34	mul x6,x6,x14
00a05d38	mul x14,x12,x14
00a05d3c	mul x19,x19,x13
00a05d40	mul x7,x11,x13
00a05d44	mul x12,x4,x9
00a05d48	mul x13,x8,x9
00a05d4c	ldr x9,[x2]
00a05d50	lsr x29,x29,#0x20
00a05d54	mul x10,x8,x29
00a05d58	mul x4,x4,x29
00a05d5c	and x29,x30,#0xffffffff
00a05d60	lsr x30,x30,#0x20
00a05d64	and x8,x9,#0xffffffff
00a05d68	lsr x9,x9,#0x20
00a05d6c	mul x11,x9,x29
00a05d70	mul x29,x8,x29
00a05d74	mul x8,x8,x30
00a05d78	mul x30,x9,x30
00a05d7c	ldr x9,[sp, #0x30]
00a05d80	cinc x9,x9,cs
00a05d84	adds x6,x28,x6
00a05d88	cset w28,cs
00a05d8c	adds x5,x5,x6, LSL #0x20
00a05d90	add x14,x14,x6, LSR #0x20
00a05d94	ldr x6,[sp, #0x28]
00a05d98	add x14,x14,x28, LSL #0x20
00a05d9c	cinc x14,x14,cs
00a05da0	adds x5,x6,x5
00a05da4	ldp x6,x28,[sp, #0x8]
00a05da8	cinc x14,x14,cs
00a05dac	adds x6,x6,x19
00a05db0	cset w19,cs
00a05db4	adds x28,x28,x6, LSL #0x20
00a05db8	add x6,x7,x6, LSR #0x20
00a05dbc	add x6,x6,x19, LSL #0x20
00a05dc0	cinc x6,x6,cs
00a05dc4	adds x5,x5,x28
00a05dc8	cinc x6,x6,cs
00a05dcc	adds x9,x9,x14
00a05dd0	mov w7,#0x2
00a05dd4	cset w14,cs
00a05dd8	csinc x7,x7,xzr,cs
00a05ddc	adds x9,x9,x6
00a05de0	ldr x6,[sp, #0x18]
00a05de4	csel x14,x14,x7,cc
00a05de8	adds x6,x6,x21
00a05dec	cset w7,cs
00a05df0	add x15,x15,x6, LSR #0x20
00a05df4	adds x19,x20,x6, LSL #0x20
00a05df8	add x15,x15,x7, LSL #0x20
00a05dfc	cinc x15,x15,cs
00a05e00	adds x5,x5,x19
00a05e04	cinc x15,x15,cs
00a05e08	adds x9,x9,x15
00a05e0c	cinc x14,x14,cs
00a05e10	adds x15,x16,x23
00a05e14	cset w16,cs
00a05e18	adds x6,x22,x15, LSL #0x20
00a05e1c	add x15,x17,x15, LSR #0x20
00a05e20	add x15,x15,x16, LSL #0x20
00a05e24	cinc x15,x15,cs
00a05e28	adds x16,x5,x6
00a05e2c	cinc x15,x15,cs
00a05e30	adds x9,x15,x9
00a05e34	ldr x15,[sp, #0x20]
00a05e38	cinc x14,x14,cs
00a05e3c	adds x15,x15,x25
00a05e40	cset w17,cs
00a05e44	adds x5,x24,x15, LSL #0x20
00a05e48	add x15,x0,x15, LSR #0x20
00a05e4c	add x15,x15,x17, LSL #0x20
00a05e50	cinc x15,x15,cs
00a05e54	adds x16,x5,x16
00a05e58	cinc x15,x15,cs
00a05e5c	adds x9,x15,x9
00a05e60	cinc x14,x14,cs
00a05e64	adds x15,x3,x27
00a05e68	cset w17,cs
00a05e6c	adds x0,x26,x15, LSL #0x20
00a05e70	add x15,x18,x15, LSR #0x20
00a05e74	add x15,x15,x17, LSL #0x20
00a05e78	cinc x15,x15,cs
00a05e7c	adds x16,x0,x16
00a05e80	cinc x15,x15,cs
00a05e84	adds x9,x15,x9
00a05e88	cinc x14,x14,cs
00a05e8c	adds x10,x12,x10
00a05e90	cset w12,cs
00a05e94	adds x13,x13,x10, LSL #0x20
00a05e98	add x10,x4,x10, LSR #0x20
00a05e9c	add x10,x10,x12, LSL #0x20
00a05ea0	cinc x10,x10,cs
00a05ea4	adds x12,x13,x16
00a05ea8	cinc x10,x10,cs
00a05eac	adds x10,x10,x9
00a05eb0	cinc x9,x14,cs
00a05eb4	adds x8,x11,x8
00a05eb8	cset w11,cs
00a05ebc	adds x13,x29,x8, LSL #0x20
00a05ec0	add x8,x30,x8, LSR #0x20
00a05ec4	str x9,[sp, #0x30]
00a05ec8	add x8,x8,x11, LSL #0x20
00a05ecc	ldr x9,[sp, #0x38]
00a05ed0	cinc x8,x8,cs
00a05ed4	adds x11,x13,x12
00a05ed8	cinc x8,x8,cs
00a05edc	adds x8,x8,x10
00a05ee0	str x11,[x9, #0x38]
00a05ee4	str x8,[sp, #0x28]
00a05ee8	ldp x12,x11,[x1, #0x30]
00a05eec	ldp x16,x8,[x1, #0x20]
00a05ef0	ldp x13,x14,[x2, #0x8]
00a05ef4	ldp x0,x15,[x1, #0x10]
00a05ef8	ldp x17,x18,[x2, #0x18]
00a05efc	ldp x3,x4,[x2, #0x28]
00a05f00	ldr x29,[x1, #0x8]
00a05f04	ldr x30,[x2, #0x38]
00a05f08	and x5,x11,#0xffffffff
00a05f0c	lsr x11,x11,#0x20
00a05f10	and x6,x13,#0xffffffff
00a05f14	lsr x13,x13,#0x20
00a05f18	and x7,x12,#0xffffffff
00a05f1c	lsr x12,x12,#0x20
00a05f20	and x19,x14,#0xffffffff
00a05f24	lsr x14,x14,#0x20
00a05f28	and x20,x8,#0xffffffff
00a05f2c	lsr x8,x8,#0x20
00a05f30	and x21,x17,#0xffffffff
00a05f34	lsr x17,x17,#0x20
00a05f38	and x22,x16,#0xffffffff
00a05f3c	lsr x16,x16,#0x20
00a05f40	and x23,x18,#0xffffffff
00a05f44	lsr x18,x18,#0x20
00a05f48	and x24,x15,#0xffffffff
00a05f4c	lsr x15,x15,#0x20
00a05f50	and x25,x3,#0xffffffff
00a05f54	lsr x3,x3,#0x20
00a05f58	and x26,x0,#0xffffffff
00a05f5c	lsr x0,x0,#0x20
00a05f60	and x27,x4,#0xffffffff
00a05f64	lsr x4,x4,#0x20
00a05f68	mul x28,x13,x5
00a05f6c	mul x5,x6,x5
00a05f70	mul x6,x6,x11
00a05f74	mul x11,x13,x11
00a05f78	mul x13,x14,x7
00a05f7c	mul x7,x19,x7
00a05f80	mul x19,x19,x12
00a05f84	mul x12,x14,x12
00a05f88	mul x14,x17,x20
00a05f8c	mul x20,x21,x20
00a05f90	mul x21,x21,x8
00a05f94	mul x9,x17,x8
00a05f98	mul x17,x18,x22
00a05f9c	mul x22,x23,x22
00a05fa0	mul x23,x23,x16
00a05fa4	mul x16,x18,x16
00a05fa8	mul x18,x3,x24
00a05fac	mul x24,x25,x24
00a05fb0	mul x25,x25,x15
00a05fb4	mul x15,x3,x15
00a05fb8	mul x3,x4,x26
00a05fbc	mul x26,x27,x26
00a05fc0	mul x27,x27,x0
00a05fc4	mul x0,x4,x0
00a05fc8	and x4,x29,#0xffffffff
00a05fcc	lsr x29,x29,#0x20
00a05fd0	and x8,x30,#0xffffffff
00a05fd4	lsr x30,x30,#0x20
00a05fd8	mul x10,x30,x4
00a05fdc	mul x4,x8,x4
00a05fe0	mul x8,x8,x29
00a05fe4	mul x29,x30,x29
00a05fe8	ldr x30,[sp, #0x30]
00a05fec	cinc x30,x30,cs
00a05ff0	adds x6,x28,x6
00a05ff4	cset w28,cs
00a05ff8	adds x5,x5,x6, LSL #0x20
00a05ffc	add x11,x11,x6, LSR #0x20
00a06000	ldr x6,[sp, #0x28]
00a06004	add x11,x11,x28, LSL #0x20
00a06008	cinc x11,x11,cs
00a0600c	adds x5,x6,x5
00a06010	cinc x11,x11,cs
00a06014	adds x13,x13,x19
00a06018	cset w6,cs
00a0601c	add x12,x12,x13, LSR #0x20
00a06020	adds x7,x7,x13, LSL #0x20
00a06024	add x12,x12,x6, LSL #0x20
00a06028	cinc x12,x12,cs
00a0602c	adds x13,x5,x7
00a06030	cinc x12,x12,cs
00a06034	adds x11,x30,x11
00a06038	mov w30,#0x2
00a0603c	cset w5,cs
00a06040	csinc x6,x30,xzr,cs
00a06044	adds x11,x11,x12
00a06048	csel x12,x5,x6,cc
00a0604c	adds x14,x14,x21
00a06050	cset w5,cs
00a06054	add x9,x9,x14, LSR #0x20
00a06058	adds x6,x20,x14, LSL #0x20
00a0605c	add x9,x9,x5, LSL #0x20
00a06060	cinc x9,x9,cs
00a06064	adds x13,x13,x6
00a06068	cinc x9,x9,cs
00a0606c	adds x9,x11,x9
00a06070	cinc x11,x12,cs
00a06074	adds x12,x17,x23
00a06078	cset w14,cs
00a0607c	adds x17,x22,x12, LSL #0x20
00a06080	add x12,x16,x12, LSR #0x20
00a06084	add x12,x12,x14, LSL #0x20
00a06088	cinc x12,x12,cs
00a0608c	adds x13,x13,x17
00a06090	cinc x12,x12,cs
00a06094	adds x9,x12,x9
00a06098	cinc x11,x11,cs
00a0609c	adds x12,x18,x25
00a060a0	cset w14,cs
00a060a4	adds x16,x24,x12, LSL #0x20
00a060a8	add x12,x15,x12, LSR #0x20
00a060ac	add x12,x12,x14, LSL #0x20
00a060b0	cinc x12,x12,cs
00a060b4	adds x13,x16,x13
00a060b8	cinc x12,x12,cs
00a060bc	adds x9,x12,x9
00a060c0	cinc x11,x11,cs
00a060c4	adds x12,x3,x27
00a060c8	cset w14,cs
00a060cc	adds x15,x26,x12, LSL #0x20
00a060d0	add x12,x0,x12, LSR #0x20
00a060d4	add x12,x12,x14, LSL #0x20
00a060d8	cinc x12,x12,cs
00a060dc	adds x13,x15,x13
00a060e0	cinc x12,x12,cs
00a060e4	adds x12,x12,x9
00a060e8	cinc x9,x11,cs
00a060ec	adds x8,x10,x8
00a060f0	cset w10,cs
00a060f4	adds x11,x4,x8, LSL #0x20
00a060f8	add x8,x29,x8, LSR #0x20
00a060fc	ldr x29,[sp, #0x38]
00a06100	add x8,x8,x10, LSL #0x20
00a06104	cinc x8,x8,cs
00a06108	adds x10,x11,x13
00a0610c	cinc x8,x8,cs
00a06110	str x10,[x29, #0x40]
00a06114	adds x10,x8,x12
00a06118	ldp x11,x12,[x2, #0x30]
00a0611c	ldp x14,x13,[x1, #0x10]
00a06120	ldp x8,x15,[x2, #0x20]
00a06124	ldp x16,x17,[x1, #0x20]
00a06128	ldp x18,x0,[x2, #0x10]
00a0612c	ldp x3,x4,[x1, #0x30]
00a06130	and x5,x14,#0xffffffff
00a06134	lsr x14,x14,#0x20
00a06138	and x6,x12,#0xffffffff
00a0613c	lsr x12,x12,#0x20
00a06140	and x7,x13,#0xffffffff
00a06144	lsr x13,x13,#0x20
00a06148	and x19,x11,#0xffffffff
00a0614c	lsr x11,x11,#0x20
00a06150	and x20,x16,#0xffffffff
00a06154	lsr x16,x16,#0x20
00a06158	and x21,x15,#0xffffffff
00a0615c	lsr x15,x15,#0x20
00a06160	and x22,x17,#0xffffffff
00a06164	lsr x17,x17,#0x20
00a06168	and x23,x8,#0xffffffff
00a0616c	lsr x8,x8,#0x20
00a06170	and x24,x3,#0xffffffff
00a06174	lsr x3,x3,#0x20
00a06178	and x25,x0,#0xffffffff
00a0617c	lsr x0,x0,#0x20
00a06180	and x26,x4,#0xffffffff
00a06184	lsr x4,x4,#0x20
00a06188	and x27,x18,#0xffffffff
00a0618c	lsr x18,x18,#0x20
00a06190	mul x28,x12,x5
00a06194	mul x5,x6,x5
00a06198	mul x6,x6,x14
00a0619c	mul x12,x12,x14
00a061a0	mul x14,x11,x7
00a061a4	mul x7,x19,x7
00a061a8	mul x19,x19,x13
00a061ac	mul x11,x11,x13
00a061b0	mul x13,x15,x20
00a061b4	mul x20,x21,x20
00a061b8	mul x21,x21,x16
00a061bc	mul x15,x15,x16
00a061c0	mul x16,x8,x22
00a061c4	mul x22,x23,x22
00a061c8	mul x23,x23,x17
00a061cc	mul x8,x8,x17
00a061d0	mul x17,x0,x24
00a061d4	mul x24,x25,x24
00a061d8	mul x25,x25,x3
00a061dc	mul x0,x0,x3
00a061e0	mul x3,x18,x26
00a061e4	mul x26,x27,x26
00a061e8	mul x27,x27,x4
00a061ec	mul x18,x18,x4
00a061f0	cinc x9,x9,cs
00a061f4	adds x4,x28,x6
00a061f8	cset w6,cs
00a061fc	add x12,x12,x4, LSR #0x20
00a06200	adds x5,x5,x4, LSL #0x20
00a06204	add x12,x12,x6, LSL #0x20
00a06208	cinc x12,x12,cs
00a0620c	adds x10,x10,x5
00a06210	cinc x12,x12,cs
00a06214	adds x14,x14,x19
00a06218	cset w4,cs
00a0621c	add x11,x11,x14, LSR #0x20
00a06220	adds x5,x7,x14, LSL #0x20
00a06224	add x11,x11,x4, LSL #0x20
00a06228	cinc x11,x11,cs
00a0622c	adds x10,x10,x5
00a06230	cinc x11,x11,cs
00a06234	adds x9,x9,x12
00a06238	cset w12,cs
00a0623c	csinc x14,x30,xzr,cs
00a06240	adds x9,x9,x11
00a06244	csel x11,x12,x14,cc
00a06248	adds x12,x13,x21
00a0624c	cset w13,cs
00a06250	adds x14,x20,x12, LSL #0x20
00a06254	add x12,x15,x12, LSR #0x20
00a06258	add x12,x12,x13, LSL #0x20
00a0625c	cinc x12,x12,cs
00a06260	adds x10,x10,x14
00a06264	cinc x12,x12,cs
00a06268	adds x9,x9,x12
00a0626c	cinc x11,x11,cs
00a06270	adds x12,x16,x23
00a06274	cset w13,cs
00a06278	add x8,x8,x12, LSR #0x20
00a0627c	adds x14,x22,x12, LSL #0x20
00a06280	add x8,x8,x13, LSL #0x20
00a06284	cinc x8,x8,cs
00a06288	adds x10,x10,x14
00a0628c	cinc x8,x8,cs
00a06290	adds x8,x8,x9
00a06294	cinc x9,x11,cs
00a06298	adds x11,x17,x25
00a0629c	cset w12,cs
00a062a0	adds x13,x24,x11, LSL #0x20
00a062a4	add x11,x0,x11, LSR #0x20
00a062a8	add x11,x11,x12, LSL #0x20
00a062ac	cinc x11,x11,cs
00a062b0	adds x10,x13,x10
00a062b4	cinc x11,x11,cs
00a062b8	adds x8,x11,x8
00a062bc	cinc x9,x9,cs
00a062c0	adds x11,x3,x27
00a062c4	cset w12,cs
00a062c8	adds x13,x26,x11, LSL #0x20
00a062cc	add x11,x18,x11, LSR #0x20
00a062d0	add x11,x11,x12, LSL #0x20
00a062d4	cinc x11,x11,cs
00a062d8	adds x10,x13,x10
00a062dc	cinc x11,x11,cs
00a062e0	str x10,[x29, #0x48]
00a062e4	adds x10,x11,x8
00a062e8	ldp x12,x8,[x1, #0x30]
00a062ec	ldp x13,x14,[x2, #0x18]
00a062f0	ldp x16,x11,[x1, #0x20]
00a062f4	ldr x15,[x1, #0x18]
00a062f8	ldp x17,x18,[x2, #0x28]
00a062fc	ldr x0,[x2, #0x38]
00a06300	and x3,x8,#0xffffffff
00a06304	lsr x8,x8,#0x20
00a06308	and x4,x13,#0xffffffff
00a0630c	lsr x13,x13,#0x20
00a06310	and x5,x12,#0xffffffff
00a06314	lsr x12,x12,#0x20
00a06318	and x6,x14,#0xffffffff
00a0631c	lsr x14,x14,#0x20
00a06320	and x7,x11,#0xffffffff
00a06324	lsr x11,x11,#0x20
00a06328	and x19,x17,#0xffffffff
00a0632c	lsr x17,x17,#0x20
00a06330	and x20,x16,#0xffffffff
00a06334	lsr x16,x16,#0x20
00a06338	and x21,x18,#0xffffffff
00a0633c	lsr x18,x18,#0x20
00a06340	and x22,x15,#0xffffffff
00a06344	lsr x15,x15,#0x20
00a06348	and x23,x0,#0xffffffff
00a0634c	lsr x0,x0,#0x20
00a06350	mul x24,x13,x3
00a06354	mul x3,x4,x3
00a06358	mul x4,x4,x8
00a0635c	mul x8,x13,x8
00a06360	mul x13,x14,x5
00a06364	mul x5,x6,x5
00a06368	mul x6,x6,x12
00a0636c	mul x12,x14,x12
00a06370	mul x14,x17,x7
00a06374	mul x7,x19,x7
00a06378	mul x19,x19,x11
00a0637c	mul x11,x17,x11
00a06380	mul x17,x18,x20
00a06384	mul x20,x21,x20
00a06388	mul x21,x21,x16
00a0638c	mul x16,x18,x16
00a06390	mul x18,x0,x22
00a06394	mul x22,x23,x22
00a06398	mul x23,x23,x15
00a0639c	mul x15,x0,x15
00a063a0	cinc x9,x9,cs
00a063a4	adds x0,x24,x4
00a063a8	cset w4,cs
00a063ac	add x8,x8,x0, LSR #0x20
00a063b0	adds x3,x3,x0, LSL #0x20
00a063b4	add x8,x8,x4, LSL #0x20
00a063b8	cinc x8,x8,cs
00a063bc	adds x10,x10,x3
00a063c0	cinc x8,x8,cs
00a063c4	adds x13,x13,x6
00a063c8	cset w0,cs
00a063cc	add x12,x12,x13, LSR #0x20
00a063d0	adds x3,x5,x13, LSL #0x20
00a063d4	add x12,x12,x0, LSL #0x20
00a063d8	cinc x12,x12,cs
00a063dc	adds x10,x10,x3
00a063e0	cinc x12,x12,cs
00a063e4	adds x8,x9,x8
00a063e8	mov w24,#0x2
00a063ec	cset w9,cs
00a063f0	csinc x13,x24,xzr,cs
00a063f4	adds x8,x8,x12
00a063f8	csel x9,x9,x13,cc
00a063fc	adds x12,x14,x19
00a06400	cset w13,cs
00a06404	add x11,x11,x12, LSR #0x20
00a06408	adds x14,x7,x12, LSL #0x20
00a0640c	add x11,x11,x13, LSL #0x20
00a06410	cinc x11,x11,cs
00a06414	adds x10,x10,x14
00a06418	cinc x11,x11,cs
00a0641c	adds x8,x8,x11
00a06420	cinc x9,x9,cs
00a06424	adds x11,x17,x21
00a06428	cset w12,cs
00a0642c	adds x13,x20,x11, LSL #0x20
00a06430	add x11,x16,x11, LSR #0x20
00a06434	add x11,x11,x12, LSL #0x20
00a06438	cinc x11,x11,cs
00a0643c	adds x10,x10,x13
00a06440	cinc x11,x11,cs
00a06444	adds x8,x11,x8
00a06448	cinc x9,x9,cs
00a0644c	adds x11,x18,x23
00a06450	cset w12,cs
00a06454	adds x13,x22,x11, LSL #0x20
00a06458	add x11,x15,x11, LSR #0x20
00a0645c	add x11,x11,x12, LSL #0x20
00a06460	cinc x11,x11,cs
00a06464	adds x10,x13,x10
00a06468	cinc x11,x11,cs
00a0646c	str x10,[x29, #0x50]
00a06470	adds x8,x11,x8
00a06474	ldp x10,x11,[x2, #0x30]
00a06478	ldp x12,x13,[x1, #0x20]
00a0647c	ldp x14,x15,[x2, #0x20]
00a06480	ldp x16,x17,[x1, #0x30]
00a06484	and x0,x11,#0xffffffff
00a06488	and x18,x12,#0xffffffff
00a0648c	lsr x12,x12,#0x20
00a06490	lsr x11,x11,#0x20
00a06494	and x3,x13,#0xffffffff
00a06498	lsr x13,x13,#0x20
00a0649c	and x4,x10,#0xffffffff
00a064a0	lsr x10,x10,#0x20
00a064a4	and x5,x16,#0xffffffff
00a064a8	lsr x16,x16,#0x20
00a064ac	and x6,x15,#0xffffffff
00a064b0	lsr x15,x15,#0x20
00a064b4	and x7,x17,#0xffffffff
00a064b8	lsr x17,x17,#0x20
00a064bc	and x19,x14,#0xffffffff
00a064c0	lsr x14,x14,#0x20
00a064c4	mul x20,x11,x18
00a064c8	mul x18,x0,x18
00a064cc	mul x0,x0,x12
00a064d0	mul x11,x11,x12
00a064d4	mul x12,x10,x3
00a064d8	mul x3,x4,x3
00a064dc	mul x4,x4,x13
00a064e0	mul x10,x10,x13
00a064e4	mul x13,x15,x5
00a064e8	mul x5,x6,x5
00a064ec	mul x6,x6,x16
00a064f0	mul x15,x15,x16
00a064f4	mul x16,x14,x7
00a064f8	mul x7,x19,x7
00a064fc	mul x19,x19,x17
00a06500	mul x14,x14,x17
00a06504	cinc x9,x9,cs
00a06508	adds x17,x20,x0
00a0650c	cset w0,cs
00a06510	add x11,x11,x17, LSR #0x20
00a06514	adds x18,x18,x17, LSL #0x20
00a06518	add x11,x11,x0, LSL #0x20
00a0651c	cinc x11,x11,cs
00a06520	adds x8,x8,x18
00a06524	cinc x11,x11,cs
00a06528	adds x12,x12,x4
00a0652c	cset w17,cs
00a06530	add x10,x10,x12, LSR #0x20
00a06534	adds x18,x3,x12, LSL #0x20
00a06538	add x10,x10,x17, LSL #0x20
00a0653c	cinc x10,x10,cs
00a06540	adds x8,x8,x18
00a06544	cinc x10,x10,cs
00a06548	adds x9,x9,x11
00a0654c	cset w11,cs
00a06550	csinc x12,x24,xzr,cs
00a06554	adds x9,x9,x10
00a06558	csel x10,x11,x12,cc
00a0655c	adds x11,x13,x6
00a06560	cset w12,cs
00a06564	adds x13,x5,x11, LSL #0x20
00a06568	add x11,x15,x11, LSR #0x20
00a0656c	add x11,x11,x12, LSL #0x20
00a06570	cinc x11,x11,cs
00a06574	adds x8,x8,x13
00a06578	cinc x11,x11,cs
00a0657c	adds x9,x9,x11
00a06580	cinc x10,x10,cs
00a06584	adds x11,x16,x19
00a06588	cset w12,cs
00a0658c	adds x13,x7,x11, LSL #0x20
00a06590	add x11,x14,x11, LSR #0x20
00a06594	add x11,x11,x12, LSL #0x20
00a06598	cinc x11,x11,cs
00a0659c	adds x8,x8,x13
00a065a0	cinc x11,x11,cs
00a065a4	str x8,[x29, #0x58]
00a065a8	adds x8,x11,x9
00a065ac	ldp x12,x9,[x1, #0x30]
00a065b0	ldp x13,x14,[x2, #0x28]
00a065b4	ldr x11,[x1, #0x28]
00a065b8	ldr x15,[x2, #0x38]
00a065bc	and x16,x9,#0xffffffff
00a065c0	lsr x9,x9,#0x20
00a065c4	and x17,x13,#0xffffffff
00a065c8	lsr x13,x13,#0x20
00a065cc	and x18,x12,#0xffffffff
00a065d0	lsr x12,x12,#0x20
00a065d4	and x0,x14,#0xffffffff
00a065d8	lsr x14,x14,#0x20
00a065dc	and x3,x11,#0xffffffff
00a065e0	lsr x11,x11,#0x20
00a065e4	and x4,x15,#0xffffffff
00a065e8	lsr x15,x15,#0x20
00a065ec	mul x5,x13,x16
00a065f0	mul x16,x17,x16
00a065f4	mul x17,x17,x9
00a065f8	mul x9,x13,x9
00a065fc	mul x13,x14,x18
00a06600	mul x18,x0,x18
00a06604	mul x0,x0,x12
00a06608	mul x12,x14,x12
00a0660c	mul x14,x15,x3
00a06610	mul x3,x4,x3
00a06614	mul x4,x4,x11
00a06618	mul x11,x15,x11
00a0661c	cinc x10,x10,cs
00a06620	adds x15,x5,x17
00a06624	cset w17,cs
00a06628	add x9,x9,x15, LSR #0x20
00a0662c	adds x16,x16,x15, LSL #0x20
00a06630	add x9,x9,x17, LSL #0x20
00a06634	cinc x9,x9,cs
00a06638	adds x8,x8,x16
00a0663c	cinc x9,x9,cs
00a06640	adds x13,x13,x0
00a06644	cset w15,cs
00a06648	add x12,x12,x13, LSR #0x20
00a0664c	adds x16,x18,x13, LSL #0x20
00a06650	add x12,x12,x15, LSL #0x20
00a06654	cinc x12,x12,cs
00a06658	adds x8,x8,x16
00a0665c	mov w20,#0x2
00a06660	cinc x12,x12,cs
00a06664	adds x9,x10,x9
00a06668	cset w10,cs
00a0666c	csinc x13,x20,xzr,cs
00a06670	adds x9,x9,x12
00a06674	csel x10,x10,x13,cc
00a06678	adds x12,x14,x4
00a0667c	cset w13,cs
00a06680	add x11,x11,x12, LSR #0x20
00a06684	adds x14,x3,x12, LSL #0x20
00a06688	add x11,x11,x13, LSL #0x20
00a0668c	cinc x11,x11,cs
00a06690	adds x8,x8,x14
00a06694	cinc x11,x11,cs
00a06698	str x8,[x29, #0x60]
00a0669c	adds x8,x9,x11
00a066a0	ldp x9,x13,[x1, #0x30]
00a066a4	ldp x11,x12,[x2, #0x30]
00a066a8	cinc x10,x10,cs
00a066ac	and x14,x9,#0xffffffff
00a066b0	lsr x9,x9,#0x20
00a066b4	and x15,x12,#0xffffffff
00a066b8	lsr x12,x12,#0x20
00a066bc	and x16,x13,#0xffffffff
00a066c0	lsr x13,x13,#0x20
00a066c4	and x17,x11,#0xffffffff
00a066c8	lsr x11,x11,#0x20
00a066cc	mul x18,x12,x14
00a066d0	mul x14,x15,x14
00a066d4	mul x15,x15,x9
00a066d8	mul x9,x12,x9
00a066dc	mul x12,x11,x16
00a066e0	mul x16,x17,x16
00a066e4	mul x17,x17,x13
00a066e8	mul x11,x11,x13
00a066ec	adds x13,x18,x15
00a066f0	cset w15,cs
00a066f4	add x9,x9,x13, LSR #0x20
00a066f8	adds x14,x14,x13, LSL #0x20
00a066fc	add x9,x9,x15, LSL #0x20
00a06700	cinc x9,x9,cs
00a06704	adds x8,x8,x14
00a06708	cinc x9,x9,cs
00a0670c	adds x12,x12,x17
00a06710	cset w13,cs
00a06714	add x11,x11,x12, LSR #0x20
00a06718	adds x14,x16,x12, LSL #0x20
00a0671c	add x11,x11,x13, LSL #0x20
00a06720	cinc x11,x11,cs
00a06724	adds x8,x8,x14
00a06728	str x8,[x29, #0x68]
00a0672c	ldr x8,[x1, #0x38]
00a06730	ldr x12,[x2, #0x38]
00a06734	cinc x11,x11,cs
00a06738	and x13,x8,#0xffffffff
00a0673c	lsr x8,x8,#0x20
00a06740	and x14,x12,#0xffffffff
00a06744	lsr x12,x12,#0x20
00a06748	mul x15,x12,x13
00a0674c	mul x13,x14,x13
00a06750	mul x14,x14,x8
00a06754	mul x8,x12,x8
00a06758	adds x12,x15,x14
00a0675c	cset w14,cs
00a06760	add x8,x8,x12, LSR #0x20
00a06764	adds x13,x13,x12, LSL #0x20
00a06768	add x8,x8,x14, LSL #0x20
00a0676c	cinc x8,x8,cs
00a06770	adds x9,x10,x9
00a06774	cinc x8,x8,cs
00a06778	adds x9,x9,x11
00a0677c	cinc x8,x8,cs
00a06780	adds x9,x9,x13
00a06784	cinc x8,x8,cs
00a06788	stp x9,x8,[x29, #0x70]
00a0678c	ldp x29,x30,[sp, #0x90]
00a06790	ldp x20,x19,[sp, #0x80]
00a06794	ldp x22,x21,[sp, #0x70]
00a06798	ldp x24,x23,[sp, #0x60]
00a0679c	ldp x26,x25,[sp, #0x50]
00a067a0	ldp x28,x27,[sp, #0x40]
00a067a4	add sp,sp,#0xa0
00a067a8	ret

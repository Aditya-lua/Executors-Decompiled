; CAST_decrypt @ 00a905e8
00a905e8	ldr w8,[x1, #0x80]
00a905ec	ldp w13,w12,[x0]
00a905f0	cbnz w8,0x00a90724
00a905f4	ldp w8,w9,[x1, #0x78]
00a905f8	adrp x10,0xcb5000
00a905fc	adrp x11,0xcb5000
00a90600	ldr x10,[x10, #0x468]
00a90604	ldr x11,[x11, #0x470]
00a90608	neg w9,w9
00a9060c	add w8,w8,w12
00a90610	and w9,w9,#0x1f
00a90614	ror w8,w8,w9
00a90618	adrp x14,0xcb5000
00a9061c	ubfx w9,w8,#0x8,#0x8
00a90620	and w15,w8,#0xff
00a90624	ldr x14,[x14, #0x478]
00a90628	ldr w9,[x10, w9, UXTW #0x2]
00a9062c	ldr w15,[x11, w15, UXTW #0x2]
00a90630	adrp x16,0xcb5000
00a90634	ldr x16,[x16, #0x480]
00a90638	ldp w17,w18,[x1, #0x70]
00a9063c	eor w9,w15,w9
00a90640	lsr w15,w8,#0x18
00a90644	ubfx w8,w8,#0x10,#0x8
00a90648	ldr w15,[x14, w15, UXTW #0x2]
00a9064c	ldr w8,[x16, w8, UXTW #0x2]
00a90650	neg w18,w18
00a90654	and w18,w18,#0x1f
00a90658	sub w9,w9,w15
00a9065c	add w8,w9,w8
00a90660	eor w8,w8,w13
00a90664	sub w9,w17,w8
00a90668	ror w9,w9,w18
00a9066c	ubfx w13,w9,#0x8,#0x8
00a90670	and w15,w9,#0xff
00a90674	ldr w13,[x10, w13, UXTW #0x2]
00a90678	ldr w15,[x11, w15, UXTW #0x2]
00a9067c	ldp w17,w18,[x1, #0x68]
00a90680	add w13,w15,w13
00a90684	lsr w15,w9,#0x18
00a90688	ubfx w9,w9,#0x10,#0x8
00a9068c	ldr w15,[x14, w15, UXTW #0x2]
00a90690	ldr w9,[x16, w9, UXTW #0x2]
00a90694	neg w18,w18
00a90698	and w18,w18,#0x1f
00a9069c	eor w13,w13,w15
00a906a0	sub w9,w13,w9
00a906a4	eor w9,w9,w12
00a906a8	eor w12,w9,w17
00a906ac	ror w12,w12,w18
00a906b0	ubfx w13,w12,#0x8,#0x8
00a906b4	and w15,w12,#0xff
00a906b8	ldr w13,[x10, w13, UXTW #0x2]
00a906bc	ldr w15,[x11, w15, UXTW #0x2]
00a906c0	lsr w17,w12,#0x18
00a906c4	ldr w17,[x14, w17, UXTW #0x2]
00a906c8	ubfx w12,w12,#0x10,#0x8
00a906cc	sub w13,w13,w15
00a906d0	ldp w15,w18,[x1, #0x60]
00a906d4	ldr w12,[x16, w12, UXTW #0x2]
00a906d8	add w13,w13,w17
00a906dc	eor w8,w13,w8
00a906e0	neg w17,w18
00a906e4	eor w13,w8,w12
00a906e8	and w17,w17,#0x1f
00a906ec	add w8,w13,w15
00a906f0	ror w8,w8,w17
00a906f4	ubfx w12,w8,#0x8,#0x8
00a906f8	and w15,w8,#0xff
00a906fc	lsr w17,w8,#0x18
00a90700	ldr w10,[x10, w12, UXTW #0x2]
00a90704	ldr w11,[x11, w15, UXTW #0x2]
00a90708	ldr w12,[x14, w17, UXTW #0x2]
00a9070c	ubfx w8,w8,#0x10,#0x8
00a90710	ldr w8,[x16, w8, UXTW #0x2]
00a90714	eor w10,w11,w10
00a90718	sub w10,w10,w12
00a9071c	add w8,w10,w8
00a90720	eor w12,w8,w9
00a90724	ldp w11,w14,[x1, #0x58]
00a90728	adrp x8,0xcb5000
00a9072c	ldr x8,[x8, #0x468]
00a90730	adrp x9,0xcb5000
00a90734	neg w14,w14
00a90738	ldr x9,[x9, #0x470]
00a9073c	sub w11,w11,w12
00a90740	and w14,w14,#0x1f
00a90744	ror w14,w11,w14
00a90748	adrp x10,0xcb5000
00a9074c	ubfx w11,w14,#0x8,#0x8
00a90750	ldr x10,[x10, #0x478]
00a90754	and w15,w14,#0xff
00a90758	ldr w16,[x8, w11, UXTW #0x2]
00a9075c	adrp x11,0xcb5000
00a90760	ldr w15,[x9, w15, UXTW #0x2]
00a90764	ldr x11,[x11, #0x480]
00a90768	lsr w17,w14,#0x18
00a9076c	ldr w17,[x10, w17, UXTW #0x2]
00a90770	ubfx w14,w14,#0x10,#0x8
00a90774	ldr w14,[x11, w14, UXTW #0x2]
00a90778	add w15,w15,w16
00a9077c	ldp w16,w18,[x1, #0x50]
00a90780	eor w15,w15,w17
00a90784	sub w14,w15,w14
00a90788	eor w13,w14,w13
00a9078c	neg w18,w18
00a90790	and w18,w18,#0x1f
00a90794	eor w14,w13,w16
00a90798	ror w14,w14,w18
00a9079c	ubfx w15,w14,#0x8,#0x8
00a907a0	and w16,w14,#0xff
00a907a4	ldr w15,[x8, w15, UXTW #0x2]
00a907a8	ldr w16,[x9, w16, UXTW #0x2]
00a907ac	ldp w18,w17,[x1, #0x48]
00a907b0	sub w15,w15,w16
00a907b4	lsr w16,w14,#0x18
00a907b8	ldr w16,[x10, w16, UXTW #0x2]
00a907bc	ubfx w14,w14,#0x10,#0x8
00a907c0	ldr w14,[x11, w14, UXTW #0x2]
00a907c4	neg w17,w17
00a907c8	add w15,w15,w16
00a907cc	eor w12,w15,w12
00a907d0	eor w12,w12,w14
00a907d4	and w17,w17,#0x1f
00a907d8	add w14,w12,w18
00a907dc	ror w14,w14,w17
00a907e0	ubfx w15,w14,#0x8,#0x8
00a907e4	and w16,w14,#0xff
00a907e8	ldr w15,[x8, w15, UXTW #0x2]
00a907ec	ldr w16,[x9, w16, UXTW #0x2]
00a907f0	ldp w17,w18,[x1, #0x40]
00a907f4	eor w15,w16,w15
00a907f8	lsr w16,w14,#0x18
00a907fc	ubfx w14,w14,#0x10,#0x8
00a90800	ldr w16,[x10, w16, UXTW #0x2]
00a90804	ldr w14,[x11, w14, UXTW #0x2]
00a90808	neg w18,w18
00a9080c	and w18,w18,#0x1f
00a90810	sub w15,w15,w16
00a90814	add w14,w15,w14
00a90818	eor w13,w14,w13
00a9081c	sub w14,w17,w13
00a90820	ror w14,w14,w18
00a90824	ubfx w15,w14,#0x8,#0x8
00a90828	and w16,w14,#0xff
00a9082c	ldr w15,[x8, w15, UXTW #0x2]
00a90830	ldr w16,[x9, w16, UXTW #0x2]
00a90834	lsr w17,w14,#0x18
00a90838	ldr w17,[x10, w17, UXTW #0x2]
00a9083c	ubfx w14,w14,#0x10,#0x8
00a90840	ldr w14,[x11, w14, UXTW #0x2]
00a90844	add w15,w16,w15
00a90848	ldp w16,w18,[x1, #0x38]
00a9084c	eor w15,w15,w17
00a90850	sub w14,w15,w14
00a90854	eor w12,w14,w12
00a90858	neg w18,w18
00a9085c	and w18,w18,#0x1f
00a90860	eor w14,w12,w16
00a90864	ror w14,w14,w18
00a90868	ubfx w15,w14,#0x8,#0x8
00a9086c	and w16,w14,#0xff
00a90870	ldr w15,[x8, w15, UXTW #0x2]
00a90874	ldr w16,[x9, w16, UXTW #0x2]
00a90878	ldp w18,w17,[x1, #0x30]
00a9087c	sub w15,w15,w16
00a90880	lsr w16,w14,#0x18
00a90884	ldr w16,[x10, w16, UXTW #0x2]
00a90888	ubfx w14,w14,#0x10,#0x8
00a9088c	ldr w14,[x11, w14, UXTW #0x2]
00a90890	neg w17,w17
00a90894	add w15,w15,w16
00a90898	eor w13,w15,w13
00a9089c	eor w13,w13,w14
00a908a0	and w17,w17,#0x1f
00a908a4	add w14,w13,w18
00a908a8	ror w14,w14,w17
00a908ac	ubfx w15,w14,#0x8,#0x8
00a908b0	and w16,w14,#0xff
00a908b4	ldr w15,[x8, w15, UXTW #0x2]
00a908b8	ldr w16,[x9, w16, UXTW #0x2]
00a908bc	ldp w17,w18,[x1, #0x28]
00a908c0	eor w15,w16,w15
00a908c4	lsr w16,w14,#0x18
00a908c8	ubfx w14,w14,#0x10,#0x8
00a908cc	ldr w16,[x10, w16, UXTW #0x2]
00a908d0	ldr w14,[x11, w14, UXTW #0x2]
00a908d4	neg w18,w18
00a908d8	and w18,w18,#0x1f
00a908dc	sub w15,w15,w16
00a908e0	add w14,w15,w14
00a908e4	eor w12,w14,w12
00a908e8	sub w14,w17,w12
00a908ec	ror w14,w14,w18
00a908f0	ubfx w15,w14,#0x8,#0x8
00a908f4	and w16,w14,#0xff
00a908f8	ldr w15,[x8, w15, UXTW #0x2]
00a908fc	ldr w16,[x9, w16, UXTW #0x2]
00a90900	lsr w17,w14,#0x18
00a90904	ldr w17,[x10, w17, UXTW #0x2]
00a90908	ubfx w14,w14,#0x10,#0x8
00a9090c	ldr w14,[x11, w14, UXTW #0x2]
00a90910	add w15,w16,w15
00a90914	ldp w16,w18,[x1, #0x20]
00a90918	eor w15,w15,w17
00a9091c	sub w14,w15,w14
00a90920	eor w13,w14,w13
00a90924	neg w18,w18
00a90928	and w18,w18,#0x1f
00a9092c	eor w14,w13,w16
00a90930	ror w14,w14,w18
00a90934	ubfx w15,w14,#0x8,#0x8
00a90938	and w16,w14,#0xff
00a9093c	ldr w15,[x8, w15, UXTW #0x2]
00a90940	ldr w16,[x9, w16, UXTW #0x2]
00a90944	ldp w18,w17,[x1, #0x18]
00a90948	sub w15,w15,w16
00a9094c	lsr w16,w14,#0x18
00a90950	ldr w16,[x10, w16, UXTW #0x2]
00a90954	ubfx w14,w14,#0x10,#0x8
00a90958	ldr w14,[x11, w14, UXTW #0x2]
00a9095c	neg w17,w17
00a90960	add w15,w15,w16
00a90964	eor w12,w15,w12
00a90968	eor w12,w12,w14
00a9096c	and w17,w17,#0x1f
00a90970	add w14,w12,w18
00a90974	ror w14,w14,w17
00a90978	ubfx w15,w14,#0x8,#0x8
00a9097c	and w16,w14,#0xff
00a90980	ldr w15,[x8, w15, UXTW #0x2]
00a90984	ldr w16,[x9, w16, UXTW #0x2]
00a90988	ldp w17,w18,[x1, #0x10]
00a9098c	eor w15,w16,w15
00a90990	lsr w16,w14,#0x18
00a90994	ubfx w14,w14,#0x10,#0x8
00a90998	ldr w16,[x10, w16, UXTW #0x2]
00a9099c	ldr w14,[x11, w14, UXTW #0x2]
00a909a0	neg w18,w18
00a909a4	and w18,w18,#0x1f
00a909a8	sub w15,w15,w16
00a909ac	add w14,w15,w14
00a909b0	eor w13,w14,w13
00a909b4	sub w14,w17,w13
00a909b8	ror w14,w14,w18
00a909bc	ubfx w15,w14,#0x8,#0x8
00a909c0	and w16,w14,#0xff
00a909c4	ldr w15,[x8, w15, UXTW #0x2]
00a909c8	ldr w16,[x9, w16, UXTW #0x2]
00a909cc	lsr w17,w14,#0x18
00a909d0	ubfx w14,w14,#0x10,#0x8
00a909d4	ldr w17,[x10, w17, UXTW #0x2]
00a909d8	ldr w14,[x11, w14, UXTW #0x2]
00a909dc	add w15,w16,w15
00a909e0	ldp w16,w18,[x1, #0x8]
00a909e4	eor w15,w15,w17
00a909e8	sub w14,w15,w14
00a909ec	eor w12,w14,w12
00a909f0	neg w17,w18
00a909f4	and w17,w17,#0x1f
00a909f8	eor w14,w12,w16
00a909fc	ror w14,w14,w17
00a90a00	ubfx w16,w14,#0x8,#0x8
00a90a04	and w17,w14,#0xff
00a90a08	ldr w16,[x8, w16, UXTW #0x2]
00a90a0c	ldr w17,[x9, w17, UXTW #0x2]
00a90a10	ldp w18,w15,[x1]
00a90a14	sub w16,w16,w17
00a90a18	lsr w17,w14,#0x18
00a90a1c	ldr w17,[x10, w17, UXTW #0x2]
00a90a20	ubfx w14,w14,#0x10,#0x8
00a90a24	ldr w14,[x11, w14, UXTW #0x2]
00a90a28	neg w15,w15
00a90a2c	add w16,w16,w17
00a90a30	eor w13,w16,w13
00a90a34	eor w13,w13,w14
00a90a38	and w15,w15,#0x1f
00a90a3c	add w14,w13,w18
00a90a40	ror w14,w14,w15
00a90a44	ubfx w15,w14,#0x8,#0x8
00a90a48	and w16,w14,#0xff
00a90a4c	lsr w17,w14,#0x18
00a90a50	ldr w8,[x8, w15, UXTW #0x2]
00a90a54	ldr w9,[x9, w16, UXTW #0x2]
00a90a58	ubfx w14,w14,#0x10,#0x8
00a90a5c	ldr w10,[x10, w17, UXTW #0x2]
00a90a60	ldr w11,[x11, w14, UXTW #0x2]
00a90a64	eor w8,w9,w8
00a90a68	sub w8,w8,w10
00a90a6c	add w8,w8,w11
00a90a70	eor w8,w8,w12
00a90a74	stp w8,w13,[x0]
00a90a78	ret

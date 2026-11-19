; X509_policy_check @ 00b1259c
00b1259c	sub sp,sp,#0x90
00b125a0	stp x28,x27,[sp, #0x30]
00b125a4	stp x26,x25,[sp, #0x40]
00b125a8	stp x24,x23,[sp, #0x50]
00b125ac	stp x22,x21,[sp, #0x60]
00b125b0	stp x20,x19,[sp, #0x70]
00b125b4	stp x29,x30,[sp, #0x80]
00b125b8	mov x22,x0
00b125bc	str xzr,[sp, #0x28]
00b125c0	str xzr,[x0]
00b125c4	mov x0,x2
00b125c8	add x29,sp,#0x80
00b125cc	mov w20,w4
00b125d0	mov x21,x3
00b125d4	mov x23,x2
00b125d8	mov x24,x1
00b125dc	str wzr,[x1]
00b125e0	bl 0x00c325e0
00b125e4	tst w20,#0x100
00b125e8	csel w27,w0,wzr,eq
00b125ec	tst w20,#0x200
00b125f0	csel w19,w0,wzr,eq
00b125f4	tst w20,#0x400
00b125f8	mov w26,w0
00b125fc	csel w28,w0,wzr,eq
00b12600	subs w25,w0,#0x1
00b12604	mov x0,xzr
00b12608	b.ne 0x00b12618
00b1260c	bl 0x00b124b4
00b12610	mov w25,#0x1
00b12614	b 0x00b1301c
00b12618	stp x21,x24,[sp, #0x18]
00b1261c	subs w24,w26,#0x2
00b12620	b.lt 0x00b126e0
00b12624	mov w21,w25
00b12628	sub w21,w21,#0x1
00b1262c	mov x0,x23
00b12630	mov w1,w21
00b12634	bl 0x00c32610
00b12638	mov w1,#0xffffffff
00b1263c	mov w2,wzr
00b12640	mov x20,x0
00b12644	bl 0x00c40a60
00b12648	mov x0,x20
00b1264c	bl 0x00c40550
00b12650	cbz x0,0x00b13018
00b12654	cmp w21,#0x0
00b12658	b.gt 0x00b12628
00b1265c	str x22,[sp, #0x10]
00b12660	mov w22,#0x1
00b12664	tbz w22,#0x1,0x00b12670
00b12668	cmp w27,#0x1
00b1266c	b.lt 0x00b126e8
00b12670	sub w25,w25,#0x1
00b12674	mov x0,x23
00b12678	mov w1,w25
00b1267c	bl 0x00c32610
00b12680	mov x20,x0
00b12684	bl 0x00c35090
00b12688	tbnz w0,#0xb,0x00b12cc0
00b1268c	mov w21,w0
00b12690	mov x0,x20
00b12694	bl 0x00c40550
00b12698	tbz w22,#0x0,0x00b126ac
00b1269c	ldr x8,[x0, #0x8]
00b126a0	cmp x8,#0x0
00b126a4	mov w8,#0x2
00b126a8	csel w22,w8,w22,eq
00b126ac	cmp w27,#0x1
00b126b0	b.lt 0x00b126d4
00b126b4	ldr x8,[x0, #0x18]
00b126b8	ubfx w9,w21,#0x5,#0x1
00b126bc	add w9,w27,w9
00b126c0	sub w9,w9,#0x1
00b126c4	cmp x8,w9, SXTW 
00b126c8	mov x10,#-0x1
00b126cc	ccmp x8,x10,#0x4,lt
00b126d0	csel w27,w8,w9,gt
00b126d4	cmp w25,#0x0
00b126d8	b.gt 0x00b12664
00b126dc	b 0x00b126e8
00b126e0	str x22,[sp, #0x10]
00b126e4	mov w22,#0x1
00b126e8	orr w8,w22,#0x4
00b126ec	cmp w27,#0x0
00b126f0	csel w25,w8,w22,eq
00b126f4	mov x21,xzr
00b126f8	tbnz w25,#0x0,0x00b12714
00b126fc	cmp w25,#0x1
00b12700	b.lt 0x00b1301c
00b12704	tbnz w25,#0x2,0x00b128a4
00b12708	tbnz w25,#0x1,0x00b12d10
00b1270c	mov w9,#0x1
00b12710	b 0x00b128b8
00b12714	adrp x1,0x2b2000
00b12718	add x1,x1,#0xdf4
00b1271c	mov w0,#0x40
00b12720	mov w2,#0xae
00b12724	bl 0x00c34250
00b12728	cbz x0,0x00b12888
00b1272c	mov w8,#0x3e8
00b12730	adrp x1,0x2b2000
00b12734	mov x21,x0
00b12738	str x8,[x0, #0x8]
00b1273c	sbfiz x0,x26,#0x5,#0x20
00b12740	add x1,x1,#0xdf4
00b12744	mov w2,#0xbd
00b12748	bl 0x00c34250
00b1274c	str x0,[x21, #0x10]
00b12750	cbz x0,0x00b12cc8
00b12754	mov x27,x0
00b12758	mov w0,#0x2ea
00b1275c	str w26,[x21, #0x18]
00b12760	bl 0x00c37740
00b12764	mov x1,x0
00b12768	mov x0,xzr
00b1276c	mov w2,wzr
00b12770	bl 0x00c40570
00b12774	cbz x0,0x00b13010
00b12778	mov x20,x0
00b1277c	mov w4,#0x1
00b12780	mov x0,x27
00b12784	mov x1,x20
00b12788	mov x2,xzr
00b1278c	mov x3,x21
00b12790	bl 0x00c405a0
00b12794	cbz x0,0x00b12e30
00b12798	mov x22,x21
00b1279c	cmp w26,#0x2
00b127a0	b.lt 0x00b12878
00b127a4	add x21,x27,#0x38
00b127a8	mov x0,x23
00b127ac	mov w1,w24
00b127b0	bl 0x00c32610
00b127b4	mov x20,x0
00b127b8	bl 0x00c35090
00b127bc	mov w26,w0
00b127c0	mov x0,x20
00b127c4	bl 0x00c40550
00b127c8	mov x27,x0
00b127cc	mov x0,x20
00b127d0	bl 0x00c350b0
00b127d4	stur x20,[x21, #-0x18]
00b127d8	ldr x8,[x27]
00b127dc	cbz x8,0x00b12818
00b127e0	cbz w19,0x00b12828
00b127e4	ldr x8,[x27, #0x10]
00b127e8	tst w26,#0x20
00b127ec	cset w9,eq
00b127f0	sub w9,w19,w9
00b127f4	cmp x8,w9, SXTW 
00b127f8	mov x10,#-0x1
00b127fc	ccmp x8,x10,#0x4,lt
00b12800	csel w19,w8,w9,gt
00b12804	cbnz w28,0x00b12848
00b12808	ldr w8,[x21]
00b1280c	orr w8,w8,#0x400
00b12810	str w8,[x21]
00b12814	b 0x00b12868
00b12818	ldr w8,[x21]
00b1281c	orr w8,w8,#0x200
00b12820	str w8,[x21]
00b12824	cbnz w19,0x00b127e4
00b12828	cbz w24,0x00b12834
00b1282c	mov w19,wzr
00b12830	tbnz w26,#0x5,0x00b12844
00b12834	ldr w8,[x21]
00b12838	mov w19,wzr
00b1283c	orr w8,w8,#0x200
00b12840	str w8,[x21]
00b12844	cbz w28,0x00b12808
00b12848	ldr x8,[x27, #0x20]
00b1284c	tst w26,#0x20
00b12850	cset w9,eq
00b12854	sub w9,w28,w9
00b12858	cmp x8,w9, SXTW 
00b1285c	mov x10,#-0x1
00b12860	ccmp x8,x10,#0x4,lt
00b12864	csel w28,w8,w9,gt
00b12868	cmp w24,#0x0
00b1286c	sub w24,w24,#0x1
00b12870	add x21,x21,#0x20
00b12874	b.gt 0x00b127a8
00b12878	mov x21,x22
00b1287c	cmp w25,#0x1
00b12880	b.ge 0x00b12704
00b12884	b 0x00b1301c
00b12888	bl 0x00c342a0
00b1288c	adrp x0,0x2b2000
00b12890	adrp x2,0x2ce000
00b12894	add x0,x0,#0xdf4
00b12898	add x2,x2,#0x57e
00b1289c	mov w1,#0xaf
00b128a0	b 0x00b12cf4
00b128a4	ldr x10,[sp, #0x20]
00b128a8	mov w9,wzr
00b128ac	mov w8,#0x1
00b128b0	str w8,[x10]
00b128b4	tbnz w25,#0x1,0x00b13008
00b128b8	ldr w8,[x21, #0x18]
00b128bc	ldr x24,[x21, #0x10]
00b128c0	str w9,[sp, #0x4]
00b128c4	str x21,[sp, #0x20]
00b128c8	cmp w8,#0x2
00b128cc	b.lt 0x00b12d18
00b128d0	adrp x22,0x2b2000
00b128d4	mov w9,#0x1
00b128d8	add x22,x22,#0xdf4
00b128dc	mov x23,x24
00b128e0	str w9,[sp]
00b128e4	ldr x0,[x23, #0x20]!
00b128e8	bl 0x00c40550
00b128ec	mov x19,x0
00b128f0	ldr x0,[x0, #0x8]
00b128f4	bl 0x00c325e0
00b128f8	cmp w0,#0x1
00b128fc	b.lt 0x00b129c8
00b12900	mov w26,wzr
00b12904	ldr x0,[x19, #0x8]
00b12908	mov w1,w26
00b1290c	mov x28,x19
00b12910	bl 0x00c32610
00b12914	ldr x8,[x24, #0x8]
00b12918	mov x27,x0
00b1291c	mov x0,x8
00b12920	bl 0x00c325e0
00b12924	cmp w0,#0x1
00b12928	b.lt 0x00b12990
00b1292c	mov w19,wzr
00b12930	mov w25,wzr
00b12934	ldr x0,[x24, #0x8]
00b12938	mov w1,w25
00b1293c	bl 0x00c32610
00b12940	ldr x2,[x27, #0x8]
00b12944	mov x20,x0
00b12948	mov x0,x24
00b1294c	mov x1,x20
00b12950	bl 0x00c405e0
00b12954	cbz w0,0x00b12978
00b12958	mov x0,x23
00b1295c	mov x1,x27
00b12960	mov x2,x20
00b12964	mov x3,x21
00b12968	mov w4,wzr
00b1296c	bl 0x00c405a0
00b12970	cbz x0,0x00b13010
00b12974	mov w19,#0x1
00b12978	ldr x0,[x24, #0x8]
00b1297c	add w25,w25,#0x1
00b12980	bl 0x00c325e0
00b12984	cmp w25,w0
00b12988	b.lt 0x00b12934
00b1298c	cbnz w19,0x00b129b0
00b12990	ldr x2,[x24, #0x10]
00b12994	cbz x2,0x00b129b0
00b12998	mov x0,x23
00b1299c	mov x1,x27
00b129a0	mov x3,x21
00b129a4	mov w4,wzr
00b129a8	bl 0x00c405a0
00b129ac	cbz x0,0x00b13010
00b129b0	ldr x0,[x28, #0x8]
00b129b4	mov x19,x28
00b129b8	add w26,w26,#0x1
00b129bc	bl 0x00c325e0
00b129c0	cmp w26,w0
00b129c4	b.lt 0x00b12904
00b129c8	ldrb w8,[x24, #0x39]
00b129cc	str x19,[sp, #0x8]
00b129d0	tbnz w8,#0x1,0x00b12b6c
00b129d4	ldr x0,[x24, #0x8]
00b129d8	bl 0x00c325e0
00b129dc	cmp w0,#0x1
00b129e0	b.lt 0x00b12b48
00b129e4	mov w26,wzr
00b129e8	ldr x0,[x24, #0x8]
00b129ec	mov w1,w26
00b129f0	bl 0x00c32610
00b129f4	ldrb w8,[x24, #0x19]
00b129f8	mov x27,x0
00b129fc	tbnz w8,#0x2,0x00b12a0c
00b12a00	ldr x8,[x27]
00b12a04	ldrb w9,[x8]
00b12a08	tbnz w9,#0x0,0x00b12a70
00b12a0c	ldr w8,[x27, #0x10]
00b12a10	cbnz w8,0x00b12b34
00b12a14	ldr x8,[x27]
00b12a18	mov x0,xzr
00b12a1c	ldr w9,[x8]
00b12a20	ldr x1,[x8, #0x8]
00b12a24	and w2,w9,#0x10
00b12a28	bl 0x00c40570
00b12a2c	cbz x0,0x00b13010
00b12a30	ldr x8,[sp, #0x8]
00b12a34	ldr w9,[x0]
00b12a38	mov x20,x0
00b12a3c	mov w4,#0x1
00b12a40	ldr x8,[x8]
00b12a44	orr w9,w9,#0x4
00b12a48	mov x1,x20
00b12a4c	mov x2,x27
00b12a50	ldr x8,[x8, #0x10]
00b12a54	str w9,[x0]
00b12a58	mov x3,x21
00b12a5c	str x8,[x0, #0x10]
00b12a60	mov x0,x23
00b12a64	bl 0x00c405a0
00b12a68	cbnz x0,0x00b12b34
00b12a6c	b 0x00b12e30
00b12a70	ldr x28,[x8, #0x18]
00b12a74	ldr w19,[x27, #0x10]
00b12a78	mov x0,x28
00b12a7c	bl 0x00c325e0
00b12a80	cmp w19,w0
00b12a84	b.eq 0x00b12b34
00b12a88	mov x0,x28
00b12a8c	bl 0x00c325e0
00b12a90	cmp w0,#0x1
00b12a94	b.lt 0x00b12b34
00b12a98	mov w25,wzr
00b12a9c	mov x0,x28
00b12aa0	mov w1,w25
00b12aa4	bl 0x00c32610
00b12aa8	mov x20,x0
00b12aac	mov x0,x23
00b12ab0	mov x1,x27
00b12ab4	mov x2,x20
00b12ab8	bl 0x00c405b0
00b12abc	cbnz x0,0x00b12b20
00b12ac0	ldr x8,[x27]
00b12ac4	cbnz x20,0x00b12acc
00b12ac8	ldr x20,[x8, #0x8]
00b12acc	ldr w8,[x8]
00b12ad0	mov x0,xzr
00b12ad4	mov x1,x20
00b12ad8	and w2,w8,#0x10
00b12adc	bl 0x00c40570
00b12ae0	cbz x0,0x00b13010
00b12ae4	ldr x8,[sp, #0x8]
00b12ae8	ldr w9,[x0]
00b12aec	mov x20,x0
00b12af0	mov w4,#0x1
00b12af4	ldr x8,[x8]
00b12af8	orr w9,w9,#0x4
00b12afc	mov x1,x20
00b12b00	mov x2,x27
00b12b04	ldr x8,[x8, #0x10]
00b12b08	str w9,[x0]
00b12b0c	mov x3,x21
00b12b10	str x8,[x0, #0x10]
00b12b14	mov x0,x23
00b12b18	bl 0x00c405a0
00b12b1c	cbz x0,0x00b12e30
00b12b20	mov x0,x28
00b12b24	add w25,w25,#0x1
00b12b28	bl 0x00c325e0
00b12b2c	cmp w25,w0
00b12b30	b.lt 0x00b12a9c
00b12b34	ldr x0,[x24, #0x8]
00b12b38	add w26,w26,#0x1
00b12b3c	bl 0x00c325e0
00b12b40	cmp w26,w0
00b12b44	b.lt 0x00b129e8
00b12b48	ldr x2,[x24, #0x10]
00b12b4c	cbz x2,0x00b12b6c
00b12b50	ldr x8,[sp, #0x8]
00b12b54	mov x0,x23
00b12b58	mov x3,x21
00b12b5c	mov w4,wzr
00b12b60	ldr x1,[x8]
00b12b64	bl 0x00c405a0
00b12b68	cbz x0,0x00b13010
00b12b6c	ldrb w8,[x24, #0x39]
00b12b70	tbz w8,#0x2,0x00b12be0
00b12b74	ldr x24,[x24, #0x28]
00b12b78	mov x0,x24
00b12b7c	bl 0x00c325e0
00b12b80	cmp w0,#0x1
00b12b84	b.lt 0x00b12be0
00b12b88	add w19,w0,#0x1
00b12b8c	sub w20,w19,#0x2
00b12b90	mov x0,x24
00b12b94	mov w1,w20
00b12b98	bl 0x00c32610
00b12b9c	ldr x8,[x0]
00b12ba0	ldrb w8,[x8]
00b12ba4	tst w8,#0x3
00b12ba8	b.eq 0x00b12bd4
00b12bac	ldr x8,[x0, #0x8]
00b12bb0	mov w2,#0x1a2
00b12bb4	mov x1,x22
00b12bb8	ldr w9,[x8, #0x10]
00b12bbc	sub w9,w9,#0x1
00b12bc0	str w9,[x8, #0x10]
00b12bc4	bl 0x00c32310
00b12bc8	mov x0,x24
00b12bcc	mov w1,w20
00b12bd0	bl 0x00c35320
00b12bd4	sub w19,w19,#0x1
00b12bd8	cmp w19,#0x1
00b12bdc	b.gt 0x00b12b8c
00b12be0	mov x20,x23
00b12be4	ldur x24,[x20, #-0x18]
00b12be8	mov x19,x20
00b12bec	mov x0,x24
00b12bf0	bl 0x00c325e0
00b12bf4	cmp w0,#0x1
00b12bf8	b.lt 0x00b12c4c
00b12bfc	add w21,w0,#0x1
00b12c00	sub w20,w21,#0x2
00b12c04	mov x0,x24
00b12c08	mov w1,w20
00b12c0c	bl 0x00c32610
00b12c10	ldr w8,[x0, #0x10]
00b12c14	cbnz w8,0x00b12c40
00b12c18	ldr x8,[x0, #0x8]
00b12c1c	mov w2,#0x1af
00b12c20	mov x1,x22
00b12c24	ldr w9,[x8, #0x10]
00b12c28	sub w9,w9,#0x1
00b12c2c	str w9,[x8, #0x10]
00b12c30	bl 0x00c32310
00b12c34	mov x0,x24
00b12c38	mov w1,w20
00b12c3c	bl 0x00c35320
00b12c40	sub w21,w21,#0x1
00b12c44	cmp w21,#0x1
00b12c48	b.gt 0x00b12c00
00b12c4c	ldur x0,[x19, #-0x10]
00b12c50	sub x20,x19,#0x20
00b12c54	cbz x0,0x00b12c90
00b12c58	ldr w8,[x0, #0x10]
00b12c5c	ldr x21,[sp, #0x20]
00b12c60	cbnz w8,0x00b12c94
00b12c64	ldr x8,[x0, #0x8]
00b12c68	cbz x8,0x00b12c78
00b12c6c	ldr w9,[x8, #0x10]
00b12c70	sub w9,w9,#0x1
00b12c74	str w9,[x8, #0x10]
00b12c78	mov w2,#0x1b6
00b12c7c	mov x1,x22
00b12c80	bl 0x00c32310
00b12c84	mov x0,xzr
00b12c88	stur xzr,[x19, #-0x10]
00b12c8c	b 0x00b12c94
00b12c90	ldr x21,[sp, #0x20]
00b12c94	ldr x8,[x21, #0x10]
00b12c98	cmp x20,x8
00b12c9c	b.ne 0x00b12be4
00b12ca0	cbz x0,0x00b13098
00b12ca4	ldr w9,[sp]
00b12ca8	ldr w8,[x21, #0x18]
00b12cac	mov x24,x23
00b12cb0	add w9,w9,#0x1
00b12cb4	cmp w9,w8
00b12cb8	b.lt 0x00b128e0
00b12cbc	b 0x00b12d1c
00b12cc0	mov w25,#0xffffffff
00b12cc4	b 0x00b1301c
00b12cc8	adrp x19,0x2b2000
00b12ccc	add x19,x19,#0xdf4
00b12cd0	mov w2,#0xbe
00b12cd4	mov x0,x21
00b12cd8	mov x1,x19
00b12cdc	bl 0x00c32310
00b12ce0	bl 0x00c342a0
00b12ce4	adrp x2,0x2ce000
00b12ce8	add x2,x2,#0x57e
00b12cec	mov w1,#0xbf
00b12cf0	mov x0,x19
00b12cf4	bl 0x00c342b0
00b12cf8	mov w1,#0x100
00b12cfc	mov w0,#0x22
00b12d00	movk w1,#0xc, LSL #16
00b12d04	mov x2,xzr
00b12d08	bl 0x00c342c0
00b12d0c	b 0x00b13018
00b12d10	mov x0,x21
00b12d14	b 0x00b1260c
00b12d18	mov x20,x24
00b12d1c	sxtw x8,w8
00b12d20	add x8,x20,x8, LSL #0x5
00b12d24	ldur x22,[x8, #-0x10]
00b12d28	add x19,x21,#0x28
00b12d2c	mov x20,x19
00b12d30	cbz x22,0x00b12d68
00b12d34	ldr x0,[x19]
00b12d38	cbnz x0,0x00b12d48
00b12d3c	bl 0x00c405c0
00b12d40	str x0,[x19]
00b12d44	cbz x0,0x00b13010
00b12d48	mov x1,x22
00b12d4c	bl 0x00c34760
00b12d50	tbz w0,#0x1f,0x00b12d64
00b12d54	ldr x0,[x19]
00b12d58	mov x1,x22
00b12d5c	bl 0x00c347a0
00b12d60	cbz w0,0x00b13010
00b12d64	add x20,sp,#0x28
00b12d68	ldr w8,[x21, #0x18]
00b12d6c	cmp w8,#0x2
00b12d70	b.lt 0x00b12e14
00b12d74	ldr x8,[sp, #0x20]
00b12d78	mov w24,#0x1
00b12d7c	ldr x21,[x8, #0x10]
00b12d80	ldr x25,[x21, #0x10]
00b12d84	cbz x25,0x00b12e14
00b12d88	ldr x0,[x21, #0x28]
00b12d8c	bl 0x00c325e0
00b12d90	cmp w0,#0x1
00b12d94	b.lt 0x00b12dfc
00b12d98	mov w22,wzr
00b12d9c	ldr x0,[x21, #0x28]
00b12da0	mov w1,w22
00b12da4	bl 0x00c32610
00b12da8	ldr x8,[x0, #0x8]
00b12dac	cmp x8,x25
00b12db0	b.ne 0x00b12de8
00b12db4	mov x23,x0
00b12db8	ldr x0,[x20]
00b12dbc	cbnz x0,0x00b12dcc
00b12dc0	bl 0x00c405c0
00b12dc4	str x0,[x20]
00b12dc8	cbz x0,0x00b12e3c
00b12dcc	mov x1,x23
00b12dd0	bl 0x00c34760
00b12dd4	tbz w0,#0x1f,0x00b12de8
00b12dd8	ldr x0,[x20]
00b12ddc	mov x1,x23
00b12de0	bl 0x00c347a0
00b12de4	cbz w0,0x00b12e3c
00b12de8	ldr x0,[x21, #0x28]
00b12dec	add w22,w22,#0x1
00b12df0	bl 0x00c325e0
00b12df4	cmp w22,w0
00b12df8	b.lt 0x00b12d9c
00b12dfc	ldr x8,[sp, #0x20]
00b12e00	add w24,w24,#0x1
00b12e04	add x21,x21,#0x20
00b12e08	ldr w8,[x8, #0x18]
00b12e0c	cmp w24,w8
00b12e10	b.lt 0x00b12d80
00b12e14	add x8,sp,#0x28
00b12e18	cmp x20,x8
00b12e1c	b.eq 0x00b12e5c
00b12e20	ldr x22,[x19]
00b12e24	mov w19,#0x1
00b12e28	str x22,[sp, #0x28]
00b12e2c	b 0x00b12e64
00b12e30	mov x0,x20
00b12e34	bl 0x00c40560
00b12e38	b 0x00b13010
00b12e3c	ldr x21,[sp, #0x20]
00b12e40	add x8,sp,#0x28
00b12e44	cmp x20,x8
00b12e48	b.ne 0x00b13010
00b12e4c	ldr x0,[sp, #0x28]
00b12e50	bl 0x00c34770
00b12e54	str xzr,[sp, #0x28]
00b12e58	b 0x00b13010
00b12e5c	ldr x22,[sp, #0x28]
00b12e60	mov w19,#0x2
00b12e64	ldp x20,x21,[sp, #0x18]
00b12e68	mov x0,x20
00b12e6c	bl 0x00c325e0
00b12e70	cmp w0,#0x1
00b12e74	b.lt 0x00b12fa0
00b12e78	ldr x8,[x21, #0x10]
00b12e7c	ldrsw x9,[x21, #0x18]
00b12e80	mov x0,x20
00b12e84	add x8,x8,x9, LSL #0x5
00b12e88	ldur x25,[x8, #-0x10]
00b12e8c	bl 0x00c325e0
00b12e90	cmp w0,#0x1
00b12e94	b.lt 0x00b12ec8
00b12e98	mov w23,wzr
00b12e9c	mov x0,x20
00b12ea0	mov w1,w23
00b12ea4	bl 0x00c32610
00b12ea8	bl 0x00c37750
00b12eac	cmp w0,#0x2ea
00b12eb0	b.eq 0x00b12fb0
00b12eb4	mov x0,x20
00b12eb8	add w23,w23,#0x1
00b12ebc	bl 0x00c325e0
00b12ec0	cmp w23,w0
00b12ec4	b.lt 0x00b12e9c
00b12ec8	mov x0,x20
00b12ecc	bl 0x00c325e0
00b12ed0	cmp w0,#0x1
00b12ed4	b.lt 0x00b12fcc
00b12ed8	mov w23,wzr
00b12edc	orr w21,wzr,#0xc
00b12ee0	mov x0,x20
00b12ee4	mov w1,w23
00b12ee8	bl 0x00c32610
00b12eec	mov x20,x0
00b12ef0	mov x0,x22
00b12ef4	mov x1,x20
00b12ef8	bl 0x00c405f0
00b12efc	mov x24,x0
00b12f00	cbnz x0,0x00b12f58
00b12f04	cbz x25,0x00b12f80
00b12f08	ldr x8,[x25]
00b12f0c	mov x0,xzr
00b12f10	mov x1,x20
00b12f14	ldr w8,[x8]
00b12f18	and w2,w8,#0x10
00b12f1c	bl 0x00c40570
00b12f20	mov x20,x0
00b12f24	cbz x0,0x00b130c0
00b12f28	ldr x8,[x25]
00b12f2c	ldr x3,[sp, #0x20]
00b12f30	mov w4,#0x1
00b12f34	mov x0,xzr
00b12f38	ldr x8,[x8, #0x10]
00b12f3c	str w21,[x20]
00b12f40	mov x1,x20
00b12f44	str x8,[x20, #0x10]
00b12f48	ldr x2,[x25, #0x8]
00b12f4c	bl 0x00c405a0
00b12f50	mov x24,x0
00b12f54	cbz x0,0x00b130b4
00b12f58	ldr x8,[sp, #0x20]
00b12f5c	ldr x0,[x8, #0x30]
00b12f60	cbnz x0,0x00b12f74
00b12f64	bl 0x00c34780
00b12f68	ldr x8,[sp, #0x20]
00b12f6c	str x0,[x8, #0x30]
00b12f70	cbz x0,0x00b1305c
00b12f74	mov x1,x24
00b12f78	bl 0x00c347a0
00b12f7c	cbz w0,0x00b13040
00b12f80	ldr x20,[sp, #0x18]
00b12f84	add w23,w23,#0x1
00b12f88	mov x0,x20
00b12f8c	bl 0x00c325e0
00b12f90	cmp w23,w0
00b12f94	b.lt 0x00b12ee0
00b12f98	mov w20,#0x1
00b12f9c	b 0x00b130c0
00b12fa0	mov w20,#0x1
00b12fa4	cmp w19,#0x2
00b12fa8	b.eq 0x00b12fd8
00b12fac	b 0x00b12fe0
00b12fb0	ldr w8,[x21, #0x38]
00b12fb4	mov w20,#0x1
00b12fb8	orr w8,w8,#0x2
00b12fbc	str w8,[x21, #0x38]
00b12fc0	cmp w19,#0x2
00b12fc4	b.eq 0x00b12fd8
00b12fc8	b 0x00b12fe0
00b12fcc	mov w20,#0x1
00b12fd0	cmp w19,#0x2
00b12fd4	b.ne 0x00b12fe0
00b12fd8	ldr x0,[sp, #0x28]
00b12fdc	bl 0x00c34770
00b12fe0	cbz w20,0x00b13010
00b12fe4	ldr x8,[sp, #0x10]
00b12fe8	str x21,[x8]
00b12fec	ldr w8,[sp, #0x4]
00b12ff0	tbnz w8,#0x0,0x00b12610
00b12ff4	mov x0,x21
00b12ff8	bl 0x00c40580
00b12ffc	bl 0x00c325e0
00b13000	cmp w0,#0x1
00b13004	b.ge 0x00b12610
00b13008	orr w25,wzr,#0xfffffffe
00b1300c	b 0x00b1301c
00b13010	mov x0,x21
00b13014	bl 0x00b124b4
00b13018	mov w25,wzr
00b1301c	mov w0,w25
00b13020	ldp x29,x30,[sp, #0x80]
00b13024	ldp x20,x19,[sp, #0x70]
00b13028	ldp x22,x21,[sp, #0x60]
00b1302c	ldp x24,x23,[sp, #0x50]
00b13030	ldp x26,x25,[sp, #0x40]
00b13034	ldp x28,x27,[sp, #0x30]
00b13038	add sp,sp,#0x90
00b1303c	ret
00b13040	ldr x8,[x24]
00b13044	ldr x21,[sp, #0x20]
00b13048	cbz x8,0x00b13088
00b1304c	ldrb w8,[x8]
00b13050	mov w20,wzr
00b13054	tbz w8,#0x3,0x00b12fd0
00b13058	b 0x00b13074
00b1305c	ldr x8,[x24]
00b13060	cbz x8,0x00b130bc
00b13064	ldrb w8,[x8]
00b13068	ldr x21,[sp, #0x20]
00b1306c	mov w20,wzr
00b13070	tbz w8,#0x3,0x00b12fd0
00b13074	adrp x1,0x2b2000
00b13078	add x1,x1,#0xdf4
00b1307c	mov w2,#0x272
00b13080	mov x0,x24
00b13084	bl 0x00c32310
00b13088	mov w20,wzr
00b1308c	cmp w19,#0x2
00b13090	b.eq 0x00b12fd8
00b13094	b 0x00b12fe0
00b13098	mov x0,x21
00b1309c	bl 0x00b124b4
00b130a0	ldr w8,[sp, #0x4]
00b130a4	cmp w8,#0x0
00b130a8	mov w8,#0x1
00b130ac	cinv w25,w8,eq
00b130b0	b 0x00b1301c
00b130b4	mov x0,x20
00b130b8	bl 0x00c40560
00b130bc	mov w20,wzr
00b130c0	ldr x21,[sp, #0x20]
00b130c4	cmp w19,#0x2
00b130c8	b.eq 0x00b12fd8
00b130cc	b 0x00b12fe0

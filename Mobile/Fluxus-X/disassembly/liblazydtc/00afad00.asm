; FUN_00afad00 @ 00afad00
00afad00	sub sp,sp,#0xa0
00afad04	mov x0,x2
00afad08	stp x28,x27,[sp, #0x40]
00afad0c	stp x26,x25,[sp, #0x50]
00afad10	stp x24,x23,[sp, #0x60]
00afad14	stp x22,x21,[sp, #0x70]
00afad18	stp x20,x19,[sp, #0x80]
00afad1c	stp x29,x30,[sp, #0x90]
00afad20	add x29,sp,#0x90
00afad24	mov x27,x1
00afad28	bl 0x00c39680
00afad2c	mov x19,x0
00afad30	bl 0x00c325e0
00afad34	cbz x19,0x00afb31c
00afad38	mov w24,w0
00afad3c	mov x0,xzr
00afad40	mov w1,w24
00afad44	bl 0x00c34790
00afad48	mov x28,x0
00afad4c	cbz x0,0x00afb350
00afad50	cmp w24,#0x1
00afad54	b.lt 0x00afb308
00afad58	adrp x22,0x2d4000
00afad5c	mov w26,wzr
00afad60	mov w25,wzr
00afad64	add x22,x22,#0x4d1
00afad68	mov x0,x19
00afad6c	mov w1,w25
00afad70	bl 0x00c32610
00afad74	ldr x8,[x0, #0x10]
00afad78	mov x21,x0
00afad7c	cbnz x8,0x00afb384
00afad80	ldr x20,[x21, #0x8]
00afad84	cbz x20,0x00afb384
00afad88	mov x0,x20
00afad8c	mov x1,x22
00afad90	bl 0x00c301f0
00afad94	cbz w0,0x00afb2b8
00afad98	ldrb w8,[x20]
00afad9c	cmp w8,#0x40
00afada0	b.ne 0x00afb2c0
00afada4	add x1,x20,#0x1
00afada8	mov x0,x27
00afadac	bl 0x00c396b0
00afadb0	cbz x0,0x00afb4f4
00afadb4	mov x22,x0
00afadb8	adrp x0,0xc7e000
00afadbc	add x0,x0,#0xf68
00afadc0	bl 0x00c372e0
00afadc4	mov x23,x0
00afadc8	cbz x0,0x00afb78c
00afadcc	mov x0,x22
00afadd0	str w26,[sp, #0x2c]
00afadd4	bl 0x00c325e0
00afadd8	cmp w0,#0x1
00afaddc	b.lt 0x00afb294
00afade0	ldr w8,[sp, #0x2c]
00afade4	mov w9,#0x1a
00afade8	mov w26,wzr
00afadec	str x22,[sp, #0x30]
00afadf0	cmp w8,#0x0
00afadf4	mov w8,#0x16
00afadf8	csel w8,w9,w8,eq
00afadfc	str w8,[sp, #0x4]
00afae00	mov x0,x22
00afae04	mov w1,w26
00afae08	bl 0x00c32610
00afae0c	ldr x20,[x0, #0x8]
00afae10	adrp x1,0x2d4000
00afae14	mov x21,x0
00afae18	add x1,x1,#0x4d8
00afae1c	mov x0,x20
00afae20	bl 0x00c301f0
00afae24	cbz w0,0x00afaedc
00afae28	adrp x1,0x2c2000
00afae2c	mov x0,x20
00afae30	add x1,x1,#0x4f9
00afae34	bl 0x00c408b0
00afae38	cbz w0,0x00afaef4
00afae3c	ldr x0,[x21, #0x8]
00afae40	adrp x1,0x2b0000
00afae44	add x1,x1,#0x97f
00afae48	bl 0x00c408b0
00afae4c	cbnz w0,0x00afb584
00afae50	ldr x8,[x21, #0x10]
00afae54	ldrb w9,[x8]
00afae58	cmp w9,#0x40
00afae5c	b.ne 0x00afb5ac
00afae60	add x1,x8,#0x1
00afae64	mov x0,x27
00afae68	bl 0x00c396b0
00afae6c	cbz x0,0x00afb5fc
00afae70	str x0,[sp, #0x38]
00afae74	adrp x0,0xc7e000
00afae78	add x0,x0,#0xfa0
00afae7c	bl 0x00c372e0
00afae80	mov x20,x0
00afae84	cbz x0,0x00afb6e0
00afae88	mov w0,#0xa5
00afae8c	bl 0x00c37740
00afae90	str x0,[x20]
00afae94	cbz x0,0x00afb654
00afae98	adrp x0,0xc7e000
00afae9c	add x0,x0,#0xfd8
00afaea0	str x20,[sp, #0x20]
00afaea4	bl 0x00c372e0
00afaea8	cbz x0,0x00afb6dc
00afaeac	ldr x8,[sp, #0x20]
00afaeb0	ldr x20,[sp, #0x38]
00afaeb4	mov x21,x0
00afaeb8	stp x27,x23,[sp, #0x10]
00afaebc	str x0,[x8, #0x8]
00afaec0	mov x0,x20
00afaec4	str x28,[sp, #0x8]
00afaec8	bl 0x00c325e0
00afaecc	cmp w0,#0x0
00afaed0	b.le 0x00afb234
00afaed4	mov w28,wzr
00afaed8	b 0x00afaf7c
00afaedc	ldr x0,[x21, #0x10]
00afaee0	mov w1,wzr
00afaee4	bl 0x00c39690
00afaee8	cbz x0,0x00afb5d4
00afaeec	str x0,[x23]
00afaef0	b 0x00afb280
00afaef4	ldr x8,[x23, #0x8]
00afaef8	cbnz x8,0x00afaf04
00afaefc	bl 0x00c34780
00afaf00	str x0,[x23, #0x8]
00afaf04	adrp x0,0xc7e000
00afaf08	add x0,x0,#0xfa0
00afaf0c	bl 0x00c372e0
00afaf10	cbz x0,0x00afb78c
00afaf14	mov x20,x0
00afaf18	ldr x0,[x23, #0x8]
00afaf1c	mov x1,x20
00afaf20	bl 0x00c347a0
00afaf24	cbz w0,0x00afb78c
00afaf28	mov w0,#0xa4
00afaf2c	bl 0x00c37740
00afaf30	str x0,[x20]
00afaf34	cbz x0,0x00afb730
00afaf38	bl 0x00c38150
00afaf3c	str x0,[x20, #0x8]
00afaf40	cbz x0,0x00afb788
00afaf44	ldr x20,[x21, #0x10]
00afaf48	mov x22,x0
00afaf4c	mov x0,x20
00afaf50	bl 0x00c2ff50
00afaf54	mov x2,x0
00afaf58	mov x0,x22
00afaf5c	mov x1,x20
00afaf60	bl 0x00c378a0
00afaf64	ldr x22,[sp, #0x30]
00afaf68	cbnz w0,0x00afb280
00afaf6c	b 0x00afb78c
00afaf70	mov w0,#0x1a
00afaf74	mov w22,#0xd
00afaf78	b 0x00afb1dc
00afaf7c	mov x0,x20
00afaf80	mov w1,w28
00afaf84	bl 0x00c32610
00afaf88	ldp x20,x23,[x0, #0x8]
00afaf8c	adrp x1,0x2da000
00afaf90	mov x27,x0
00afaf94	add x1,x1,#0x6ab
00afaf98	mov x0,x20
00afaf9c	bl 0x00c301f0
00afafa0	cbz w0,0x00afb080
00afafa4	adrp x1,0x2d8000
00afafa8	mov x0,x20
00afafac	add x1,x1,#0x867
00afafb0	bl 0x00c301f0
00afafb4	cbz w0,0x00afb0ec
00afafb8	adrp x1,0x2da000
00afafbc	mov x0,x20
00afafc0	add x1,x1,#0x6b8
00afafc4	bl 0x00c301f0
00afafc8	cbnz w0,0x00afb684
00afafcc	ldr x20,[x21]
00afafd0	cbnz x20,0x00afaff0
00afafd4	adrp x0,0xc7f000
00afafd8	add x0,x0,#0x10
00afafdc	bl 0x00c372e0
00afafe0	cbz x0,0x00afb480
00afafe4	str x0,[x21]
00afafe8	ldr x23,[x27, #0x10]
00afafec	mov x20,x0
00afaff0	mov x0,x23
00afaff4	bl 0x00c39680
00afaff8	mov x23,x0
00afaffc	cbz x0,0x00afb48c
00afb000	mov x0,x23
00afb004	bl 0x00c325e0
00afb008	cbz w0,0x00afb48c
00afb00c	ldr x27,[x20, #0x8]
00afb010	mov x0,x23
00afb014	bl 0x00c325e0
00afb018	cmp w0,#0x1
00afb01c	b.lt 0x00afb068
00afb020	mov w20,wzr
00afb024	mov x0,x23
00afb028	mov w1,w20
00afb02c	bl 0x00c32610
00afb030	ldr x1,[x0, #0x8]
00afb034	mov x0,xzr
00afb038	bl 0x00c396f0
00afb03c	cbz x0,0x00afb3d0
00afb040	mov x22,x0
00afb044	mov x0,x27
00afb048	mov x1,x22
00afb04c	bl 0x00c347a0
00afb050	cbz w0,0x00afb3f8
00afb054	mov x0,x23
00afb058	add w20,w20,#0x1
00afb05c	bl 0x00c325e0
00afb060	cmp w20,w0
00afb064	b.lt 0x00afb024
00afb068	adrp x1,0xcb5000
00afb06c	ldr x1,[x1, #0x4b0]
00afb070	mov x0,x23
00afb074	bl 0x00c32600
00afb078	ldr x22,[sp, #0x30]
00afb07c	b 0x00afb21c
00afb080	mov w1,#0x3a
00afb084	mov x0,x23
00afb088	bl 0x00c30890
00afb08c	mov x8,x0
00afb090	mov w0,#0x1a
00afb094	cbz x8,0x00afb138
00afb098	sub x8,x8,x23
00afb09c	cmn w8,#0x1
00afb0a0	mov w22,wzr
00afb0a4	b.eq 0x00afb1dc
00afb0a8	sub w9,w8,#0x3
00afb0ac	cmp w9,#0xa
00afb0b0	b.hi 0x00afb1d4
00afb0b4	adrp x10,0x77b000
00afb0b8	add x10,x10,#0x5bc
00afb0bc	ldrsw x9,[x10, x9, LSL #0x2]
00afb0c0	sxtw x2,w8
00afb0c4	add x9,x9,x10
00afb0c8	br x9
00afb0cc	adrp x1,0x2a9000
00afb0d0	mov x0,x23
00afb0d4	add x1,x1,#0xfff
00afb0d8	bl 0x00c31bb0
00afb0dc	cbnz w0,0x00afb1d4
00afb0e0	orr w0,wzr,#0x1e
00afb0e4	orr w22,wzr,#0x3
00afb0e8	b 0x00afb1dc
00afb0ec	ldr x0,[x21]
00afb0f0	cbnz x0,0x00afb10c
00afb0f4	adrp x0,0xc7f000
00afb0f8	add x0,x0,#0x10
00afb0fc	bl 0x00c372e0
00afb100	cbz x0,0x00afb480
00afb104	str x0,[x21]
00afb108	ldr x23,[x27, #0x10]
00afb10c	ldr x20,[x0]
00afb110	ldr w8,[sp, #0x4]
00afb114	mov x0,x23
00afb118	str w8,[x20, #0x4]
00afb11c	bl 0x00c2ff50
00afb120	mov x2,x0
00afb124	mov x0,x20
00afb128	mov x1,x23
00afb12c	bl 0x00c378a0
00afb130	cbnz w0,0x00afb21c
00afb134	b 0x00afb480
00afb138	mov w22,wzr
00afb13c	b 0x00afb1dc
00afb140	adrp x1,0x2a2000
00afb144	mov x0,x23
00afb148	add x1,x1,#0x1e5
00afb14c	bl 0x00c31bb0
00afb150	cbnz w0,0x00afb1d4
00afb154	orr w0,wzr,#0xc
00afb158	mov w22,#0x4
00afb15c	b 0x00afb1dc
00afb160	adrp x1,0x2c3000
00afb164	mov x0,x23
00afb168	add x1,x1,#0x788
00afb16c	bl 0x00c31bb0
00afb170	cbnz w0,0x00afb1d4
00afb174	mov w0,#0x1a
00afb178	orr w22,wzr,#0x7
00afb17c	b 0x00afb1dc
00afb180	adrp x1,0x2d3000
00afb184	mov x0,x23
00afb188	add x1,x1,#0x89c
00afb18c	bl 0x00c31bb0
00afb190	cbnz w0,0x00afb1d4
00afb194	orr w0,wzr,#0x1e
00afb198	mov w22,#0x9
00afb19c	b 0x00afb1dc
00afb1a0	adrp x1,0x2b2000
00afb1a4	mov x0,x23
00afb1a8	add x1,x1,#0x95
00afb1ac	bl 0x00c31bb0
00afb1b0	cbnz w0,0x00afb1d4
00afb1b4	orr w0,wzr,#0xc
00afb1b8	mov w22,#0xa
00afb1bc	b 0x00afb1dc
00afb1c0	adrp x1,0x2cf000
00afb1c4	mov x0,x23
00afb1c8	add x1,x1,#0x8d7
00afb1cc	bl 0x00c31bb0
00afb1d0	cbz w0,0x00afaf70
00afb1d4	mov w22,wzr
00afb1d8	mov w0,#0x1a
00afb1dc	bl 0x00c378b0
00afb1e0	str x0,[x21, #0x8]
00afb1e4	cbz x0,0x00afb6d0
00afb1e8	add w8,w22,#0x1
00afb1ec	add x8,x23,x8
00afb1f0	cmp w22,#0x0
00afb1f4	csel x22,x23,x8,eq
00afb1f8	mov x20,x0
00afb1fc	mov x0,x22
00afb200	bl 0x00c2ff50
00afb204	mov x2,x0
00afb208	mov x0,x20
00afb20c	mov x1,x22
00afb210	bl 0x00c378a0
00afb214	ldr x22,[sp, #0x30]
00afb218	cbz w0,0x00afb480
00afb21c	ldr x20,[sp, #0x38]
00afb220	add w28,w28,#0x1
00afb224	mov x0,x20
00afb228	bl 0x00c325e0
00afb22c	cmp w28,w0
00afb230	b.lt 0x00afaf7c
00afb234	ldr x8,[x21]
00afb238	cbz x8,0x00afb24c
00afb23c	ldr x9,[x8, #0x8]
00afb240	cbz x9,0x00afb820
00afb244	ldr x8,[x8]
00afb248	cbz x8,0x00afb820
00afb24c	ldr x27,[sp, #0x10]
00afb250	mov x1,x20
00afb254	mov x0,x27
00afb258	bl 0x00c396d0
00afb25c	ldr x23,[sp, #0x18]
00afb260	ldr x0,[x23, #0x8]
00afb264	cbnz x0,0x00afb270
00afb268	bl 0x00c34780
00afb26c	str x0,[x23, #0x8]
00afb270	ldr x1,[sp, #0x20]
00afb274	bl 0x00c347a0
00afb278	ldr x28,[sp, #0x8]
00afb27c	cbz w0,0x00afb78c
00afb280	mov x0,x22
00afb284	add w26,w26,#0x1
00afb288	bl 0x00c325e0
00afb28c	cmp w26,w0
00afb290	b.lt 0x00afae00
00afb294	ldr x8,[x23]
00afb298	cbz x8,0x00afb760
00afb29c	mov x0,x27
00afb2a0	mov x1,x22
00afb2a4	bl 0x00c396d0
00afb2a8	ldr w26,[sp, #0x2c]
00afb2ac	adrp x22,0x2d4000
00afb2b0	add x22,x22,#0x4d1
00afb2b4	b 0x00afb2ec
00afb2b8	mov w26,#0x1
00afb2bc	b 0x00afb2fc
00afb2c0	mov x0,x20
00afb2c4	mov w1,wzr
00afb2c8	bl 0x00c39690
00afb2cc	cbz x0,0x00afb528
00afb2d0	mov x20,x0
00afb2d4	adrp x0,0xc7e000
00afb2d8	add x0,x0,#0xf68
00afb2dc	bl 0x00c372e0
00afb2e0	cbz x0,0x00afb560
00afb2e4	mov x23,x0
00afb2e8	str x20,[x0]
00afb2ec	mov x0,x28
00afb2f0	mov x1,x23
00afb2f4	bl 0x00c347a0
00afb2f8	cbz w0,0x00afb454
00afb2fc	add w25,w25,#0x1
00afb300	cmp w25,w24
00afb304	b.lt 0x00afad68
00afb308	adrp x1,0xcb5000
00afb30c	ldr x1,[x1, #0x4b0]
00afb310	mov x0,x19
00afb314	bl 0x00c32600
00afb318	b 0x00afb7fc
00afb31c	bl 0x00c342a0
00afb320	adrp x0,0x2d0000
00afb324	adrp x2,0x2b4000
00afb328	add x0,x0,#0x485
00afb32c	add x2,x2,#0xa0c
00afb330	mov w1,#0x66
00afb334	bl 0x00c342b0
00afb338	mov w1,#0x22
00afb33c	mov w0,#0x22
00afb340	movk w1,#0x8, LSL #16
00afb344	mov x2,xzr
00afb348	bl 0x00c342c0
00afb34c	b 0x00afb7f8
00afb350	bl 0x00c342a0
00afb354	adrp x0,0x2d0000
00afb358	adrp x2,0x2b4000
00afb35c	add x0,x0,#0x485
00afb360	add x2,x2,#0xa0c
00afb364	mov w1,#0x6c
00afb368	bl 0x00c342b0
00afb36c	mov w1,#0x100
00afb370	mov w0,#0x22
00afb374	movk w1,#0xc, LSL #16
00afb378	mov x2,xzr
00afb37c	bl 0x00c342c0
00afb380	b 0x00afb7d8
00afb384	bl 0x00c342a0
00afb388	adrp x0,0x2d0000
00afb38c	adrp x2,0x2b4000
00afb390	add x0,x0,#0x485
00afb394	add x2,x2,#0xa0c
00afb398	mov w1,#0x74
00afb39c	bl 0x00c342b0
00afb3a0	mov w0,#0x22
00afb3a4	mov w1,#0x86
00afb3a8	mov x2,xzr
00afb3ac	bl 0x00c342c0
00afb3b0	ldp x2,x4,[x21, #0x8]
00afb3b4	adrp x1,0x2cc000
00afb3b8	adrp x3,0x2aa000
00afb3bc	add x1,x1,#0x165
00afb3c0	add x3,x3,#0xa36
00afb3c4	mov w0,#0x4
00afb3c8	bl 0x00c37fb0
00afb3cc	b 0x00afb7d8
00afb3d0	bl 0x00c342a0
00afb3d4	adrp x0,0x2d0000
00afb3d8	adrp x2,0x29e000
00afb3dc	add x0,x0,#0x485
00afb3e0	add x2,x2,#0xaf7
00afb3e4	mov w1,#0x17e
00afb3e8	bl 0x00c342b0
00afb3ec	mov w0,#0x22
00afb3f0	mov w1,#0x8c
00afb3f4	b 0x00afb428
00afb3f8	mov x0,x22
00afb3fc	bl 0x00c37c30
00afb400	bl 0x00c342a0
00afb404	adrp x0,0x2d0000
00afb408	adrp x2,0x29e000
00afb40c	add x0,x0,#0x485
00afb410	add x2,x2,#0xaf7
00afb414	mov w1,#0x188
00afb418	bl 0x00c342b0
00afb41c	mov w1,#0x100
00afb420	mov w0,#0x22
00afb424	movk w1,#0xc, LSL #16
00afb428	mov x2,xzr
00afb42c	bl 0x00c342c0
00afb430	adrp x1,0xcb5000
00afb434	ldp x28,x27,[sp, #0x8]
00afb438	ldr x22,[sp, #0x30]
00afb43c	ldr x20,[sp, #0x20]
00afb440	ldr x1,[x1, #0x4b0]
00afb444	mov x0,x23
00afb448	bl 0x00c32600
00afb44c	ldr x23,[sp, #0x18]
00afb450	b 0x00afb710
00afb454	adrp x1,0xc7e000
00afb458	add x1,x1,#0xf68
00afb45c	mov x0,x23
00afb460	bl 0x00c36160
00afb464	bl 0x00c342a0
00afb468	adrp x0,0x2d0000
00afb46c	adrp x2,0x2b4000
00afb470	add x0,x0,#0x485
00afb474	add x2,x2,#0xa0c
00afb478	mov w1,#0x9a
00afb47c	b 0x00afb368
00afb480	ldp x28,x27,[sp, #0x8]
00afb484	ldr x23,[sp, #0x18]
00afb488	b 0x00afb6dc
00afb48c	ldr x28,[sp, #0x8]
00afb490	ldr x20,[sp, #0x20]
00afb494	bl 0x00c342a0
00afb498	adrp x0,0x2d0000
00afb49c	adrp x2,0x2a4000
00afb4a0	add x0,x0,#0x485
00afb4a4	add x2,x2,#0x98b
00afb4a8	mov w1,#0x154
00afb4ac	bl 0x00c342b0
00afb4b0	mov w0,#0x22
00afb4b4	mov w1,#0x8d
00afb4b8	mov x2,xzr
00afb4bc	bl 0x00c342c0
00afb4c0	ldp x2,x4,[x27, #0x8]
00afb4c4	adrp x1,0x2cc000
00afb4c8	adrp x3,0x2aa000
00afb4cc	add x1,x1,#0x165
00afb4d0	add x3,x3,#0xa36
00afb4d4	mov w0,#0x4
00afb4d8	bl 0x00c37fb0
00afb4dc	adrp x1,0xcb5000
00afb4e0	ldr x1,[x1, #0x4b0]
00afb4e4	mov x0,x23
00afb4e8	bl 0x00c32600
00afb4ec	ldp x27,x23,[sp, #0x10]
00afb4f0	b 0x00afb710
00afb4f4	bl 0x00c342a0
00afb4f8	adrp x0,0x2d0000
00afb4fc	adrp x2,0x2b4000
00afb500	add x0,x0,#0x485
00afb504	add x2,x2,#0xa0c
00afb508	mov w1,#0x81
00afb50c	bl 0x00c342b0
00afb510	ldr x3,[x21, #0x8]
00afb514	adrp x2,0x2b6000
00afb518	add x2,x2,#0xc62
00afb51c	mov w0,#0x22
00afb520	mov w1,#0x87
00afb524	b 0x00afb558
00afb528	bl 0x00c342a0
00afb52c	adrp x0,0x2d0000
00afb530	adrp x2,0x2b4000
00afb534	add x0,x0,#0x485
00afb538	add x2,x2,#0xa0c
00afb53c	mov w1,#0x8b
00afb540	bl 0x00c342b0
00afb544	ldr x3,[x21, #0x8]
00afb548	adrp x2,0x2b6000
00afb54c	add x2,x2,#0xc62
00afb550	mov w0,#0x22
00afb554	mov w1,#0x6e
00afb558	bl 0x00c342c0
00afb55c	b 0x00afb7d8
00afb560	mov x0,x20
00afb564	bl 0x00c37660
00afb568	bl 0x00c342a0
00afb56c	adrp x0,0x2d0000
00afb570	adrp x2,0x2b4000
00afb574	add x0,x0,#0x485
00afb578	add x2,x2,#0xa0c
00afb57c	mov w1,#0x93
00afb580	b 0x00afb368
00afb584	bl 0x00c342a0
00afb588	adrp x0,0x2d0000
00afb58c	adrp x2,0x2d4000
00afb590	add x0,x0,#0x485
00afb594	add x2,x2,#0x4e9
00afb598	mov w1,#0xe3
00afb59c	bl 0x00c342b0
00afb5a0	mov w0,#0x22
00afb5a4	mov w1,#0x8a
00afb5a8	b 0x00afb620
00afb5ac	bl 0x00c342a0
00afb5b0	adrp x0,0x2d0000
00afb5b4	adrp x2,0x2d4000
00afb5b8	add x0,x0,#0x485
00afb5bc	add x2,x2,#0x4e9
00afb5c0	mov w1,#0xcf
00afb5c4	bl 0x00c342b0
00afb5c8	mov w0,#0x22
00afb5cc	mov w1,#0x89
00afb5d0	b 0x00afb620
00afb5d4	bl 0x00c342a0
00afb5d8	adrp x0,0x2d0000
00afb5dc	adrp x2,0x2d4000
00afb5e0	add x0,x0,#0x485
00afb5e4	add x2,x2,#0x4e9
00afb5e8	mov w1,#0xb6
00afb5ec	bl 0x00c342b0
00afb5f0	mov w0,#0x22
00afb5f4	mov w1,#0x6e
00afb5f8	b 0x00afb620
00afb5fc	bl 0x00c342a0
00afb600	adrp x0,0x2d0000
00afb604	adrp x2,0x2d4000
00afb608	add x0,x0,#0x485
00afb60c	add x2,x2,#0x4e9
00afb610	mov w1,#0xd5
00afb614	bl 0x00c342b0
00afb618	mov w0,#0x22
00afb61c	mov w1,#0x87
00afb620	mov x2,xzr
00afb624	bl 0x00c342c0
00afb628	ldp x2,x4,[x21]
00afb62c	ldr x6,[x21, #0x10]
00afb630	adrp x1,0x2da000
00afb634	adrp x3,0x2c0000
00afb638	adrp x5,0x2b8000
00afb63c	add x1,x1,#0x6a2
00afb640	add x3,x3,#0x62e
00afb644	add x5,x5,#0x723
00afb648	orr w0,wzr,#0x6
00afb64c	bl 0x00c37fb0
00afb650	b 0x00afb7bc
00afb654	bl 0x00c342a0
00afb658	adrp x0,0x2d0000
00afb65c	adrp x2,0x2a4000
00afb660	add x0,x0,#0x485
00afb664	add x2,x2,#0x98b
00afb668	mov w1,#0x125
00afb66c	bl 0x00c342b0
00afb670	mov w8,#0x100
00afb674	movk w8,#0xc, LSL #16
00afb678	add w1,w8,#0x3
00afb67c	mov w0,#0x22
00afb680	b 0x00afb708
00afb684	bl 0x00c342a0
00afb688	adrp x0,0x2d0000
00afb68c	adrp x2,0x2a4000
00afb690	add x0,x0,#0x485
00afb694	add x2,x2,#0x98b
00afb698	mov w1,#0x15e
00afb69c	bl 0x00c342b0
00afb6a0	mov w0,#0x22
00afb6a4	mov w1,#0x8a
00afb6a8	mov x2,xzr
00afb6ac	bl 0x00c342c0
00afb6b0	ldp x2,x4,[x27, #0x8]
00afb6b4	adrp x1,0x2cc000
00afb6b8	adrp x3,0x2aa000
00afb6bc	add x1,x1,#0x165
00afb6c0	add x3,x3,#0xa36
00afb6c4	mov w0,#0x4
00afb6c8	bl 0x00c37fb0
00afb6cc	b 0x00afb84c
00afb6d0	ldp x28,x27,[sp, #0x8]
00afb6d4	ldr x23,[sp, #0x18]
00afb6d8	ldr x22,[sp, #0x30]
00afb6dc	ldr x20,[sp, #0x20]
00afb6e0	bl 0x00c342a0
00afb6e4	adrp x0,0x2d0000
00afb6e8	adrp x2,0x2a4000
00afb6ec	add x0,x0,#0x485
00afb6f0	add x2,x2,#0x98b
00afb6f4	mov w1,#0x16d
00afb6f8	bl 0x00c342b0
00afb6fc	mov w1,#0x100
00afb700	mov w0,#0x22
00afb704	movk w1,#0xc, LSL #16
00afb708	mov x2,xzr
00afb70c	bl 0x00c342c0
00afb710	adrp x1,0xc7e000
00afb714	add x1,x1,#0xfa0
00afb718	mov x0,x20
00afb71c	bl 0x00c36160
00afb720	ldr x1,[sp, #0x38]
00afb724	mov x0,x27
00afb728	bl 0x00c396d0
00afb72c	b 0x00afb7bc
00afb730	bl 0x00c342a0
00afb734	adrp x0,0x2d0000
00afb738	adrp x2,0x2d4000
00afb73c	add x0,x0,#0x485
00afb740	add x2,x2,#0x4e9
00afb744	mov w1,#0xc4
00afb748	bl 0x00c342b0
00afb74c	mov w8,#0x100
00afb750	movk w8,#0xc, LSL #16
00afb754	add w1,w8,#0x3
00afb758	mov w0,#0x22
00afb75c	b 0x00afb7b4
00afb760	bl 0x00c342a0
00afb764	adrp x0,0x2d0000
00afb768	adrp x2,0x2d4000
00afb76c	add x0,x0,#0x485
00afb770	add x2,x2,#0x4e9
00afb774	mov w1,#0xe9
00afb778	bl 0x00c342b0
00afb77c	mov w0,#0x22
00afb780	mov w1,#0x8b
00afb784	b 0x00afb7b4
00afb788	ldr x22,[sp, #0x30]
00afb78c	bl 0x00c342a0
00afb790	adrp x0,0x2d0000
00afb794	adrp x2,0x2d4000
00afb798	add x0,x0,#0x485
00afb79c	add x2,x2,#0x4e9
00afb7a0	orr w1,wzr,#0xf0
00afb7a4	bl 0x00c342b0
00afb7a8	mov w1,#0x100
00afb7ac	mov w0,#0x22
00afb7b0	movk w1,#0xc, LSL #16
00afb7b4	mov x2,xzr
00afb7b8	bl 0x00c342c0
00afb7bc	adrp x1,0xc7e000
00afb7c0	add x1,x1,#0xf68
00afb7c4	mov x0,x23
00afb7c8	bl 0x00c36160
00afb7cc	mov x0,x27
00afb7d0	mov x1,x22
00afb7d4	bl 0x00c396d0
00afb7d8	adrp x1,0xcb5000
00afb7dc	ldr x1,[x1, #0x4b0]
00afb7e0	mov x0,x19
00afb7e4	bl 0x00c32600
00afb7e8	adrp x1,0xcb5000
00afb7ec	ldr x1,[x1, #0x828]
00afb7f0	mov x0,x28
00afb7f4	bl 0x00c32600
00afb7f8	mov x28,xzr
00afb7fc	mov x0,x28
00afb800	ldp x29,x30,[sp, #0x90]
00afb804	ldp x20,x19,[sp, #0x80]
00afb808	ldp x22,x21,[sp, #0x70]
00afb80c	ldp x24,x23,[sp, #0x60]
00afb810	ldp x26,x25,[sp, #0x50]
00afb814	ldp x28,x27,[sp, #0x40]
00afb818	add sp,sp,#0xa0
00afb81c	ret
00afb820	bl 0x00c342a0
00afb824	adrp x0,0x2d0000
00afb828	adrp x2,0x2a4000
00afb82c	add x0,x0,#0x485
00afb830	add x2,x2,#0x98b
00afb834	mov w1,#0x166
00afb838	bl 0x00c342b0
00afb83c	mov w0,#0x22
00afb840	mov w1,#0x8e
00afb844	mov x2,xzr
00afb848	bl 0x00c342c0
00afb84c	ldp x28,x27,[sp, #0x8]
00afb850	ldp x23,x20,[sp, #0x18]
00afb854	b 0x00afb710

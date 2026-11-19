; FUN_00af7034 @ 00af7034
00af7034	sub sp,sp,#0xb0
00af7038	adrp x0,0xaf6000
00af703c	add x0,x0,#0xbf8
00af7040	stp x28,x27,[sp, #0x50]
00af7044	stp x26,x25,[sp, #0x60]
00af7048	stp x24,x23,[sp, #0x70]
00af704c	stp x22,x21,[sp, #0x80]
00af7050	stp x20,x19,[sp, #0x90]
00af7054	stp x29,x30,[sp, #0xa0]
00af7058	add x29,sp,#0xa0
00af705c	mov x22,x2
00af7060	bl 0x00c35340
00af7064	mov x19,x0
00af7068	cbz x0,0x00af74ac
00af706c	mov x0,x22
00af7070	bl 0x00c325e0
00af7074	cmp w0,#0x1
00af7078	b.lt 0x00af749c
00af707c	adrp x26,0x2cc000
00af7080	adrp x28,0x2d2000
00af7084	mov w23,wzr
00af7088	add x26,x26,#0x160
00af708c	add x28,x28,#0x39d
00af7090	str x19,[sp, #0x8]
00af7094	mov x0,x22
00af7098	mov w1,w23
00af709c	bl 0x00c32610
00af70a0	mov x20,x0
00af70a4	ldr x0,[x0, #0x8]
00af70a8	mov x1,x26
00af70ac	bl 0x00c408b0
00af70b0	str x20,[sp, #0x10]
00af70b4	cbz w0,0x00af7110
00af70b8	ldr x0,[x20, #0x8]
00af70bc	adrp x1,0x2cd000
00af70c0	add x1,x1,#0x1d7
00af70c4	bl 0x00c408b0
00af70c8	cbz w0,0x00af7124
00af70cc	ldr x0,[x20, #0x8]
00af70d0	adrp x1,0x2d6000
00af70d4	add x1,x1,#0x666
00af70d8	bl 0x00c408b0
00af70dc	cbz w0,0x00af7154
00af70e0	ldr x0,[x20, #0x8]
00af70e4	adrp x1,0x2da000
00af70e8	add x1,x1,#0x669
00af70ec	bl 0x00c408b0
00af70f0	cbnz w0,0x00af7648
00af70f4	adrp x24,0x77b000
00af70f8	mov w26,#0x2
00af70fc	mov w21,#0x10
00af7100	add x24,x24,#0x5a0
00af7104	ldr x0,[x20, #0x10]
00af7108	cbnz x0,0x00af716c
00af710c	b 0x00af75f0
00af7110	adrp x24,0x77b000
00af7114	mov w25,#0x1
00af7118	mov w21,#0x4
00af711c	add x24,x24,#0x594
00af7120	b 0x00af7134
00af7124	adrp x24,0x77b000
00af7128	mov w25,#0x2
00af712c	mov w21,#0x10
00af7130	add x24,x24,#0x5a0
00af7134	ldr x0,[x20, #0x10]
00af7138	mov w2,#0x3dd
00af713c	mov x1,x28
00af7140	bl 0x00c34600
00af7144	mov x20,x0
00af7148	mov x27,xzr
00af714c	cbnz x20,0x00af71f4
00af7150	b 0x00af7530
00af7154	adrp x24,0x77b000
00af7158	mov w26,#0x1
00af715c	mov w21,#0x4
00af7160	add x24,x24,#0x594
00af7164	ldr x0,[x20, #0x10]
00af7168	cbz x0,0x00af75f0
00af716c	add x1,sp,#0x40
00af7170	mov w2,wzr
00af7174	bl 0x00c300c0
00af7178	ldr x20,[sp, #0x40]
00af717c	adrp x1,0x2b6000
00af7180	mov x25,x0
00af7184	add x1,x1,#0x2fd
00af7188	mov x0,x20
00af718c	str w25,[sp, #0x1c]
00af7190	bl 0x00c30730
00af7194	add x8,x20,x0
00af7198	cmp w25,#0xff
00af719c	str x8,[sp, #0x40]
00af71a0	b.hi 0x00af754c
00af71a4	add x20,x8,#0x1
00af71a8	str x20,[sp, #0x40]
00af71ac	ldrb w8,[x8]
00af71b0	cmp w8,#0x3a
00af71b4	b.ne 0x00af754c
00af71b8	adrp x1,0x2b6000
00af71bc	mov x0,x20
00af71c0	add x1,x1,#0x2fd
00af71c4	bl 0x00c30730
00af71c8	add x0,x20,x0
00af71cc	mov w2,#0x3db
00af71d0	mov x1,x28
00af71d4	str x0,[sp, #0x40]
00af71d8	bl 0x00c34600
00af71dc	mov w25,w26
00af71e0	adrp x26,0x2cc000
00af71e4	mov x20,x0
00af71e8	add x27,sp,#0x1c
00af71ec	add x26,x26,#0x160
00af71f0	cbz x20,0x00af7530
00af71f4	adrp x1,0x2c4000
00af71f8	mov x0,x20
00af71fc	add x1,x1,#0x2cc
00af7200	bl 0x00c301f0
00af7204	cbz w0,0x00af72fc
00af7208	mov x0,x20
00af720c	mov x1,x24
00af7210	mov w28,w25
00af7214	mov x26,x22
00af7218	bl 0x00c30730
00af721c	sxtw x19,w0
00af7220	add x25,x20,x19
00af7224	adrp x1,0x2b6000
00af7228	mov x0,x25
00af722c	add x1,x1,#0x2fd
00af7230	bl 0x00c30730
00af7234	add w8,w19,w0
00af7238	sxtw x22,w8
00af723c	ldrb w19,[x20, x22]
00af7240	add x0,sp,#0x30
00af7244	mov x1,x20
00af7248	strb wzr,[x25]
00af724c	mov x25,x21
00af7250	bl 0x00c408a0
00af7254	cmp w0,w25
00af7258	b.ne 0x00af759c
00af725c	cbz w19,0x00af7338
00af7260	cmp w19,#0x2d
00af7264	add x22,x22,#0x1
00af7268	b.eq 0x00af7384
00af726c	cmp w19,#0x2f
00af7270	b.ne 0x00af75b8
00af7274	add x24,x20,w22, SXTW 
00af7278	add x1,sp,#0x40
00af727c	mov w2,#0xa
00af7280	mov x0,x24
00af7284	bl 0x00c300c0
00af7288	ldr x8,[sp, #0x40]
00af728c	cmp x8,x24
00af7290	b.eq 0x00af75d4
00af7294	ldrb w8,[x8]
00af7298	cbnz w8,0x00af75d4
00af729c	mov x24,x0
00af72a0	lsl w8,w25,#0x3
00af72a4	cmp w8,w24
00af72a8	b.lt 0x00af75d4
00af72ac	tbnz w24,#0x1f,0x00af75d4
00af72b0	ldr x19,[sp, #0x8]
00af72b4	mov w1,w28
00af72b8	mov x2,x27
00af72bc	mov x0,x19
00af72c0	bl 0x00af615c
00af72c4	cbz x0,0x00af7714
00af72c8	mov x21,x0
00af72cc	add x0,sp,#0x48
00af72d0	add x1,sp,#0x30
00af72d4	mov w2,w24
00af72d8	mov w3,w25
00af72dc	bl 0x00af6210
00af72e0	cbz w0,0x00af7714
00af72e4	ldr x24,[sp, #0x48]
00af72e8	mov x0,x21
00af72ec	mov x1,x24
00af72f0	bl 0x00c347a0
00af72f4	cbnz w0,0x00af7430
00af72f8	b 0x00af7704
00af72fc	mov x0,x19
00af7300	mov w1,w25
00af7304	mov x2,x27
00af7308	bl 0x00af5f98
00af730c	cbz x0,0x00af74e0
00af7310	ldr x8,[x0, #0x8]
00af7314	mov x24,x0
00af7318	cbz x8,0x00af74e0
00af731c	ldr w9,[x8]
00af7320	cbz w9,0x00af744c
00af7324	cmp w9,#0x1
00af7328	b.ne 0x00af7458
00af732c	ldr x8,[x8, #0x8]
00af7330	cbz x8,0x00af7460
00af7334	b 0x00af74e0
00af7338	ldr x19,[sp, #0x8]
00af733c	mov w1,w28
00af7340	mov x2,x27
00af7344	mov x0,x19
00af7348	bl 0x00af615c
00af734c	cbz x0,0x00af7694
00af7350	mov x21,x0
00af7354	lsl w2,w25,#0x3
00af7358	add x0,sp,#0x48
00af735c	add x1,sp,#0x30
00af7360	mov w3,w25
00af7364	bl 0x00af6210
00af7368	cbz w0,0x00af7694
00af736c	ldr x24,[sp, #0x48]
00af7370	mov x0,x21
00af7374	mov x1,x24
00af7378	bl 0x00c347a0
00af737c	cbnz w0,0x00af7430
00af7380	b 0x00af7684
00af7384	adrp x1,0x2b6000
00af7388	add x0,x20,x22
00af738c	add x1,x1,#0x2fd
00af7390	bl 0x00c30730
00af7394	add w19,w22,w0
00af7398	add x25,x20,w19, SXTW 
00af739c	mov x0,x25
00af73a0	mov x1,x24
00af73a4	bl 0x00c30730
00af73a8	cbz w0,0x00af7620
00af73ac	add w8,w19,w0
00af73b0	ldrb w8,[x20, w8, SXTW ]
00af73b4	cbnz w8,0x00af7620
00af73b8	add x0,sp,#0x20
00af73bc	mov x1,x25
00af73c0	bl 0x00c408a0
00af73c4	mov x22,x21
00af73c8	cmp w0,w22
00af73cc	b.ne 0x00af76b0
00af73d0	sxtw x2,w22
00af73d4	add x0,sp,#0x30
00af73d8	add x1,sp,#0x20
00af73dc	bl 0x00c300b0
00af73e0	ldr x19,[sp, #0x8]
00af73e4	cmp w0,#0x1
00af73e8	b.ge 0x00af7730
00af73ec	mov x0,x19
00af73f0	mov w1,w28
00af73f4	mov x2,x27
00af73f8	bl 0x00af615c
00af73fc	cbz x0,0x00af7768
00af7400	mov x21,x0
00af7404	add x0,sp,#0x48
00af7408	add x1,sp,#0x30
00af740c	add x2,sp,#0x20
00af7410	mov w3,w22
00af7414	bl 0x00af63d8
00af7418	cbz w0,0x00af7768
00af741c	ldr x24,[sp, #0x48]
00af7420	mov x0,x21
00af7424	mov x1,x24
00af7428	bl 0x00c347a0
00af742c	cbz w0,0x00af7758
00af7430	mov x22,x26
00af7434	adrp x26,0x2cc000
00af7438	adrp x28,0x2d2000
00af743c	add x26,x26,#0x160
00af7440	add x28,x28,#0x39d
00af7444	mov w2,#0x431
00af7448	b 0x00af747c
00af744c	ldr x8,[x8, #0x8]
00af7450	cbnz x8,0x00af7478
00af7454	b 0x00af7460
00af7458	ldr x9,[x8, #0x8]
00af745c	cbnz x9,0x00af7474
00af7460	bl 0x00c38160
00af7464	ldr x8,[x24, #0x8]
00af7468	str x0,[x8, #0x8]
00af746c	cbz x0,0x00af74e0
00af7470	ldr x8,[x24, #0x8]
00af7474	str wzr,[x8]
00af7478	mov w2,#0x3ee
00af747c	mov x0,x20
00af7480	mov x1,x28
00af7484	bl 0x00c32310
00af7488	mov x0,x22
00af748c	add w23,w23,#0x1
00af7490	bl 0x00c325e0
00af7494	cmp w23,w0
00af7498	b.lt 0x00af7094
00af749c	mov x0,x19
00af74a0	bl 0x00af6d64
00af74a4	cbnz w0,0x00af77c0
00af74a8	b 0x00af767c
00af74ac	bl 0x00c342a0
00af74b0	adrp x0,0x2d2000
00af74b4	adrp x2,0x2b8000
00af74b8	add x0,x0,#0x39d
00af74bc	add x2,x2,#0x701
00af74c0	mov w1,#0x3a4
00af74c4	bl 0x00c342b0
00af74c8	mov w1,#0x100
00af74cc	mov w0,#0x22
00af74d0	movk w1,#0xc, LSL #16
00af74d4	mov x2,xzr
00af74d8	bl 0x00c342c0
00af74dc	b 0x00af77c0
00af74e0	bl 0x00c342a0
00af74e4	adrp x0,0x2d2000
00af74e8	adrp x2,0x2b8000
00af74ec	add x0,x0,#0x39d
00af74f0	add x2,x2,#0x701
00af74f4	mov w1,#0x3ea
00af74f8	bl 0x00c342b0
00af74fc	mov w0,#0x22
00af7500	mov w1,#0xa5
00af7504	mov x2,xzr
00af7508	bl 0x00c342c0
00af750c	ldr x8,[sp, #0x10]
00af7510	adrp x1,0x2cc000
00af7514	adrp x3,0x2aa000
00af7518	add x1,x1,#0x165
00af751c	ldp x2,x4,[x8, #0x8]
00af7520	add x3,x3,#0xa36
00af7524	mov w0,#0x4
00af7528	bl 0x00c37fb0
00af752c	b 0x00af7798
00af7530	bl 0x00c342a0
00af7534	adrp x0,0x2d2000
00af7538	adrp x2,0x2b8000
00af753c	add x0,x0,#0x39d
00af7540	add x2,x2,#0x701
00af7544	orr w1,wzr,#0x3e0
00af7548	b 0x00af7780
00af754c	bl 0x00c342a0
00af7550	adrp x0,0x2d2000
00af7554	adrp x2,0x2b8000
00af7558	add x0,x0,#0x39d
00af755c	add x2,x2,#0x701
00af7560	mov w1,#0x3d6
00af7564	bl 0x00c342b0
00af7568	mov w0,#0x22
00af756c	mov w1,#0xa4
00af7570	mov x2,xzr
00af7574	bl 0x00c342c0
00af7578	ldr x8,[sp, #0x10]
00af757c	adrp x1,0x2cc000
00af7580	adrp x3,0x2aa000
00af7584	add x1,x1,#0x165
00af7588	ldp x2,x4,[x8, #0x8]
00af758c	add x3,x3,#0xa36
00af7590	mov w0,#0x4
00af7594	bl 0x00c37fb0
00af7598	b 0x00af767c
00af759c	bl 0x00c342a0
00af75a0	adrp x0,0x2d2000
00af75a4	adrp x2,0x2b8000
00af75a8	add x0,x0,#0x39d
00af75ac	add x2,x2,#0x701
00af75b0	mov w1,#0x3f9
00af75b4	b 0x00af76c8
00af75b8	bl 0x00c342a0
00af75bc	adrp x0,0x2d2000
00af75c0	adrp x2,0x2b8000
00af75c4	add x0,x0,#0x39d
00af75c8	add x2,x2,#0x701
00af75cc	mov w1,#0x42c
00af75d0	b 0x00af7638
00af75d4	bl 0x00c342a0
00af75d8	adrp x0,0x2d2000
00af75dc	adrp x2,0x2b8000
00af75e0	add x0,x0,#0x39d
00af75e4	add x2,x2,#0x701
00af75e8	mov w1,#0x405
00af75ec	b 0x00af7638
00af75f0	bl 0x00c342a0
00af75f4	adrp x0,0x2d2000
00af75f8	adrp x2,0x2b8000
00af75fc	add x0,x0,#0x39d
00af7600	add x2,x2,#0x701
00af7604	mov w1,#0x3d0
00af7608	bl 0x00c342b0
00af760c	mov w0,#0x22
00af7610	orr w1,wzr,#0x7c
00af7614	mov x2,xzr
00af7618	bl 0x00c342c0
00af761c	b 0x00af767c
00af7620	bl 0x00c342a0
00af7624	adrp x0,0x2d2000
00af7628	adrp x2,0x2b8000
00af762c	add x0,x0,#0x39d
00af7630	add x2,x2,#0x701
00af7634	mov w1,#0x412
00af7638	bl 0x00c342b0
00af763c	mov w0,#0x22
00af7640	mov w1,#0x74
00af7644	b 0x00af76d4
00af7648	bl 0x00c342a0
00af764c	adrp x0,0x2d2000
00af7650	adrp x2,0x2b8000
00af7654	add x0,x0,#0x39d
00af7658	add x2,x2,#0x701
00af765c	mov w1,#0x3ba
00af7660	bl 0x00c342b0
00af7664	ldr x3,[x20, #0x8]
00af7668	adrp x2,0x2b6000
00af766c	add x2,x2,#0xc62
00af7670	mov w0,#0x22
00af7674	mov w1,#0x73
00af7678	bl 0x00c342c0
00af767c	mov x20,xzr
00af7680	b 0x00af7798
00af7684	adrp x1,0xc7e000
00af7688	add x1,x1,#0x788
00af768c	mov x0,x24
00af7690	bl 0x00c36160
00af7694	bl 0x00c342a0
00af7698	adrp x0,0x2d2000
00af769c	adrp x2,0x2b8000
00af76a0	add x0,x0,#0x39d
00af76a4	add x2,x2,#0x701
00af76a8	mov w1,#0x427
00af76ac	b 0x00af7780
00af76b0	bl 0x00c342a0
00af76b4	adrp x0,0x2d2000
00af76b8	adrp x2,0x2b8000
00af76bc	add x0,x0,#0x39d
00af76c0	add x2,x2,#0x701
00af76c4	mov w1,#0x417
00af76c8	bl 0x00c342b0
00af76cc	mov w0,#0x22
00af76d0	mov w1,#0xa6
00af76d4	mov x2,xzr
00af76d8	bl 0x00c342c0
00af76dc	ldr x8,[sp, #0x10]
00af76e0	adrp x1,0x2cc000
00af76e4	adrp x3,0x2aa000
00af76e8	add x1,x1,#0x165
00af76ec	ldp x2,x4,[x8, #0x8]
00af76f0	add x3,x3,#0xa36
00af76f4	mov w0,#0x4
00af76f8	bl 0x00c37fb0
00af76fc	ldr x19,[sp, #0x8]
00af7700	b 0x00af7798
00af7704	adrp x1,0xc7e000
00af7708	add x1,x1,#0x788
00af770c	mov x0,x24
00af7710	bl 0x00c36160
00af7714	bl 0x00c342a0
00af7718	adrp x0,0x2d2000
00af771c	adrp x2,0x2b8000
00af7720	add x0,x0,#0x39d
00af7724	add x2,x2,#0x701
00af7728	mov w1,#0x40a
00af772c	b 0x00af7780
00af7730	bl 0x00c342a0
00af7734	adrp x0,0x2d2000
00af7738	adrp x2,0x2b8000
00af773c	add x0,x0,#0x39d
00af7740	add x2,x2,#0x701
00af7744	mov w1,#0x41c
00af7748	bl 0x00c342b0
00af774c	mov w0,#0x22
00af7750	mov w1,#0x74
00af7754	b 0x00af7504
00af7758	adrp x1,0xc7e000
00af775c	add x1,x1,#0x788
00af7760	mov x0,x24
00af7764	bl 0x00c36160
00af7768	bl 0x00c342a0
00af776c	adrp x0,0x2d2000
00af7770	adrp x2,0x2b8000
00af7774	add x0,x0,#0x39d
00af7778	add x2,x2,#0x701
00af777c	mov w1,#0x421
00af7780	bl 0x00c342b0
00af7784	mov w1,#0x100
00af7788	mov w0,#0x22
00af778c	movk w1,#0xc, LSL #16
00af7790	mov x2,xzr
00af7794	bl 0x00c342c0
00af7798	adrp x1,0x2d2000
00af779c	add x1,x1,#0x39d
00af77a0	mov w2,#0x43d
00af77a4	mov x0,x20
00af77a8	bl 0x00c32310
00af77ac	adrp x1,0xcb5000
00af77b0	ldr x1,[x1, #0x810]
00af77b4	mov x0,x19
00af77b8	bl 0x00c32600
00af77bc	mov x19,xzr
00af77c0	mov x0,x19
00af77c4	ldp x29,x30,[sp, #0xa0]
00af77c8	ldp x20,x19,[sp, #0x90]
00af77cc	ldp x22,x21,[sp, #0x80]
00af77d0	ldp x24,x23,[sp, #0x70]
00af77d4	ldp x26,x25,[sp, #0x60]
00af77d8	ldp x28,x27,[sp, #0x50]
00af77dc	add sp,sp,#0xb0
00af77e0	ret

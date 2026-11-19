; PEM_read_bio_ex @ 00ab7038
00ab7038	sub sp,sp,#0xb0
00ab703c	mvn w8,w5
00ab7040	stp x26,x25,[sp, #0x60]
00ab7044	mov w26,w5
00ab7048	tst w8,#0x6
00ab704c	stp x28,x27,[sp, #0x50]
00ab7050	stp x24,x23,[sp, #0x70]
00ab7054	stp x22,x21,[sp, #0x80]
00ab7058	stp x20,x19,[sp, #0x90]
00ab705c	stp x29,x30,[sp, #0xa0]
00ab7060	add x29,sp,#0xa0
00ab7064	str xzr,[x4]
00ab7068	str xzr,[x2]
00ab706c	str xzr,[x1]
00ab7070	str xzr,[x3]
00ab7074	b.ne 0x00ab70c4
00ab7078	bl 0x00c342a0
00ab707c	adrp x0,0x2ce000
00ab7080	adrp x2,0x2d0000
00ab7084	add x0,x0,#0x16c
00ab7088	add x2,x2,#0x253
00ab708c	mov w1,#0x3a5
00ab7090	bl 0x00c342b0
00ab7094	mov w1,#0x106
00ab7098	mov w0,#0x9
00ab709c	movk w1,#0x8, LSL #16
00ab70a0	mov x2,xzr
00ab70a4	bl 0x00c342c0
00ab70a8	mov x24,xzr
00ab70ac	mov x25,xzr
00ab70b0	mov x21,xzr
00ab70b4	mov x27,xzr
00ab70b8	mov w20,wzr
00ab70bc	and w19,w26,#0x1
00ab70c0	b 0x00ab72f4
00ab70c4	mov x23,x4
00ab70c8	mov x21,x3
00ab70cc	mov x22,x2
00ab70d0	mov x28,x1
00ab70d4	mov x27,x0
00ab70d8	and w19,w26,#0x1
00ab70dc	tbnz w26,#0x0,0x00ab70e8
00ab70e0	bl 0x00c32280
00ab70e4	b 0x00ab70ec
00ab70e8	bl 0x00c38820
00ab70ec	mov x20,x0
00ab70f0	bl 0x00c32240
00ab70f4	mov x24,x0
00ab70f8	mov x0,x20
00ab70fc	bl 0x00c32240
00ab7100	mov x25,x0
00ab7104	cbz x24,0x00ab728c
00ab7108	cbz x25,0x00ab728c
00ab710c	adrp x1,0x2ce000
00ab7110	add x1,x1,#0x16c
00ab7114	mov w0,#0x100
00ab7118	str x28,[sp, #0x28]
00ab711c	cbnz w19,0x00ab72a8
00ab7120	mov w2,#0xe8
00ab7124	bl 0x00c32320
00ab7128	mov x28,x0
00ab712c	cbz x0,0x00ab72b8
00ab7130	orr w2,wzr,#0xff
00ab7134	mov x0,x27
00ab7138	mov x1,x28
00ab713c	stp x23,x21,[sp, #0x8]
00ab7140	str x22,[sp, #0x18]
00ab7144	stp x25,x24,[sp, #0x30]
00ab7148	bl 0x00c38470
00ab714c	cmp w0,#0x1
00ab7150	b.lt 0x00ab71d8
00ab7154	adrp x23,0x774000
00ab7158	adrp x21,0x774000
00ab715c	mov w1,w0
00ab7160	and w20,w26,#0xfffffffb
00ab7164	sub x24,x28,#0x6
00ab7168	mov w3,#0x1
00ab716c	add x23,x23,#0x44b
00ab7170	add x21,x21,#0x457
00ab7174	mov x0,x28
00ab7178	mov w2,w20
00ab717c	bl 0x00ab79a0
00ab7180	mov w22,w0
00ab7184	mov w2,#0xb
00ab7188	mov x0,x28
00ab718c	mov x1,x23
00ab7190	bl 0x00c31bb0
00ab7194	cmp w22,#0x6
00ab7198	b.lt 0x00ab71b8
00ab719c	cbnz w0,0x00ab71b8
00ab71a0	sxtw x25,w22
00ab71a4	add x0,x24,x25
00ab71a8	orr w2,wzr,#0x6
00ab71ac	mov x1,x21
00ab71b0	bl 0x00c31bb0
00ab71b4	cbz w0,0x00ab73b8
00ab71b8	orr w2,wzr,#0xff
00ab71bc	mov x0,x27
00ab71c0	mov x1,x28
00ab71c4	bl 0x00c38470
00ab71c8	mov w1,w0
00ab71cc	cmp w0,#0x1
00ab71d0	mov w3,wzr
00ab71d4	b.ge 0x00ab7174
00ab71d8	bl 0x00c342a0
00ab71dc	adrp x0,0x2ce000
00ab71e0	adrp x2,0x2da000
00ab71e4	add x0,x0,#0x16c
00ab71e8	add x2,x2,#0x51f
00ab71ec	mov w1,#0x2fb
00ab71f0	bl 0x00c342b0
00ab71f4	mov w0,#0x9
00ab71f8	mov w1,#0x6c
00ab71fc	mov x2,xzr
00ab7200	bl 0x00c342c0
00ab7204	ldr x25,[sp, #0x30]
00ab7208	mov x21,xzr
00ab720c	mov w20,wzr
00ab7210	cbnz w19,0x00ab7414
00ab7214	adrp x1,0x2ce000
00ab7218	add x1,x1,#0x16c
00ab721c	mov w2,#0xe2
00ab7220	mov x0,x28
00ab7224	bl 0x00c32310
00ab7228	ldr x24,[sp, #0x38]
00ab722c	cbz w20,0x00ab7798
00ab7230	cbnz w19,0x00ab7364
00ab7234	adrp x1,0x2ce000
00ab7238	add x1,x1,#0x16c
00ab723c	mov w0,#0x100
00ab7240	mov w2,#0xe8
00ab7244	bl 0x00c32320
00ab7248	mov x28,x0
00ab724c	cbz x0,0x00ab7380
00ab7250	orr w2,wzr,#0xff
00ab7254	mov x0,x27
00ab7258	mov x1,x28
00ab725c	str x21,[sp]
00ab7260	bl 0x00c38470
00ab7264	mov w20,w0
00ab7268	cmp w0,#0x1
00ab726c	b.lt 0x00ab75a4
00ab7270	ldr x8,[sp, #0x38]
00ab7274	mov w22,wzr
00ab7278	mov w25,wzr
00ab727c	mov w24,wzr
00ab7280	str x8,[sp, #0x20]
00ab7284	mov w21,wzr
00ab7288	b 0x00ab7478
00ab728c	bl 0x00c342a0
00ab7290	adrp x0,0x2ce000
00ab7294	adrp x2,0x2d0000
00ab7298	add x0,x0,#0x16c
00ab729c	add x2,x2,#0x253
00ab72a0	mov w1,#0x3ad
00ab72a4	b 0x00ab72d0
00ab72a8	mov w2,#0xe7
00ab72ac	bl 0x00c39220
00ab72b0	mov x28,x0
00ab72b4	cbnz x0,0x00ab7130
00ab72b8	bl 0x00c342a0
00ab72bc	adrp x0,0x2ce000
00ab72c0	adrp x2,0x2da000
00ab72c4	add x0,x0,#0x16c
00ab72c8	add x2,x2,#0x51f
00ab72cc	mov w1,#0x2f3
00ab72d0	bl 0x00c342b0
00ab72d4	mov w1,#0x100
00ab72d8	mov w0,#0x9
00ab72dc	movk w1,#0xc, LSL #16
00ab72e0	mov x2,xzr
00ab72e4	bl 0x00c342c0
00ab72e8	mov x21,xzr
00ab72ec	mov x27,xzr
00ab72f0	mov w20,wzr
00ab72f4	mov x0,x27
00ab72f8	bl 0x00c3cc00
00ab72fc	cbz w19,0x00ab731c
00ab7300	adrp x2,0x2ce000
00ab7304	add x2,x2,#0x16c
00ab7308	orr w3,wzr,#0xe0
00ab730c	mov x0,x21
00ab7310	mov x1,xzr
00ab7314	bl 0x00c38e10
00ab7318	b 0x00ab7330
00ab731c	adrp x1,0x2ce000
00ab7320	add x1,x1,#0x16c
00ab7324	mov w2,#0xe2
00ab7328	mov x0,x21
00ab732c	bl 0x00c32310
00ab7330	mov x0,x24
00ab7334	bl 0x00c31a40
00ab7338	mov x0,x25
00ab733c	bl 0x00c31a40
00ab7340	mov w0,w20
00ab7344	ldp x29,x30,[sp, #0xa0]
00ab7348	ldp x20,x19,[sp, #0x90]
00ab734c	ldp x22,x21,[sp, #0x80]
00ab7350	ldp x24,x23,[sp, #0x70]
00ab7354	ldp x26,x25,[sp, #0x60]
00ab7358	ldp x28,x27,[sp, #0x50]
00ab735c	add sp,sp,#0xb0
00ab7360	ret
00ab7364	adrp x1,0x2ce000
00ab7368	add x1,x1,#0x16c
00ab736c	mov w0,#0x100
00ab7370	mov w2,#0xe7
00ab7374	bl 0x00c39220
00ab7378	mov x28,x0
00ab737c	cbnz x0,0x00ab7250
00ab7380	bl 0x00c342a0
00ab7384	adrp x0,0x2ce000
00ab7388	adrp x2,0x2cb000
00ab738c	add x0,x0,#0x16c
00ab7390	add x2,x2,#0xf8e
00ab7394	mov w1,#0x337
00ab7398	bl 0x00c342b0
00ab739c	mov w1,#0x100
00ab73a0	mov w0,#0x9
00ab73a4	movk w1,#0xc, LSL #16
00ab73a8	mov x2,xzr
00ab73ac	bl 0x00c342c0
00ab73b0	ldr x24,[sp, #0x38]
00ab73b4	b 0x00ab72ec
00ab73b8	sub w9,w22,#0x10
00ab73bc	adrp x1,0x2ce000
00ab73c0	add x8,x28,x25
00ab73c4	sxtw x20,w9
00ab73c8	add x1,x1,#0x16c
00ab73cc	sturb wzr,[x8, #-0x6]
00ab73d0	cbnz w19,0x00ab73e4
00ab73d4	mov w2,#0xe8
00ab73d8	mov x0,x20
00ab73dc	bl 0x00c32320
00ab73e0	b 0x00ab73f0
00ab73e4	mov w2,#0xe7
00ab73e8	mov x0,x20
00ab73ec	bl 0x00c39220
00ab73f0	ldr x25,[sp, #0x30]
00ab73f4	mov x21,x0
00ab73f8	cbz x0,0x00ab7438
00ab73fc	add x1,x28,#0xb
00ab7400	mov x0,x21
00ab7404	mov x2,x20
00ab7408	bl 0x00c2ffd0
00ab740c	mov w20,#0x1
00ab7410	cbz w19,0x00ab7214
00ab7414	adrp x2,0x2ce000
00ab7418	add x2,x2,#0x16c
00ab741c	mov w1,#0x100
00ab7420	orr w3,wzr,#0xe0
00ab7424	mov x0,x28
00ab7428	bl 0x00c38e10
00ab742c	ldr x24,[sp, #0x38]
00ab7430	cbnz w20,0x00ab7230
00ab7434	b 0x00ab7798
00ab7438	bl 0x00c342a0
00ab743c	adrp x0,0x2ce000
00ab7440	adrp x2,0x2da000
00ab7444	add x0,x0,#0x16c
00ab7448	add x2,x2,#0x51f
00ab744c	mov w1,#0x30b
00ab7450	bl 0x00c342b0
00ab7454	mov w1,#0x100
00ab7458	mov w0,#0x9
00ab745c	movk w1,#0xc, LSL #16
00ab7460	mov x2,xzr
00ab7464	bl 0x00c342c0
00ab7468	mov w20,wzr
00ab746c	cbz w19,0x00ab7214
00ab7470	b 0x00ab7414
00ab7474	mov w21,w25
00ab7478	cmp w20,#0xfe
00ab747c	mov w25,wzr
00ab7480	b.ne 0x00ab7490
00ab7484	ldrb w8,[x28, #0xfd]
00ab7488	cmp w8,#0xa
00ab748c	cset w25,ne
00ab7490	mov w23,w19
00ab7494	cbnz w22,0x00ab74b0
00ab7498	sxtw x2,w20
00ab749c	mov w1,#0x3a
00ab74a0	mov x0,x28
00ab74a4	bl 0x00c300a0
00ab74a8	cmp x0,#0x0
00ab74ac	cset w22,ne
00ab74b0	adrp x19,0x774000
00ab74b4	add x19,x19,#0x45e
00ab74b8	mov w2,#0x9
00ab74bc	mov x0,x28
00ab74c0	mov x1,x19
00ab74c4	bl 0x00c31bb0
00ab74c8	cmp w0,#0x0
00ab74cc	ccmp w22,#0x1,#0x4,ne
00ab74d0	orr w8,wzr,#0xfffffffb
00ab74d4	csinv w8,w8,wzr,eq
00ab74d8	and w2,w8,w26
00ab74dc	mov x0,x28
00ab74e0	mov w1,w20
00ab74e4	mov w3,wzr
00ab74e8	bl 0x00ab79a0
00ab74ec	ldrb w8,[x28]
00ab74f0	cmp w8,#0xa
00ab74f4	b.eq 0x00ab7564
00ab74f8	mov w20,w0
00ab74fc	mov w2,#0x9
00ab7500	mov x0,x28
00ab7504	mov x1,x19
00ab7508	bl 0x00c31bb0
00ab750c	cbz w0,0x00ab75c0
00ab7510	mov w19,w23
00ab7514	cbnz w24,0x00ab7620
00ab7518	ldr x0,[sp, #0x20]
00ab751c	mov x1,x28
00ab7520	bl 0x00c32260
00ab7524	tbnz w0,#0x1f,0x00ab764c
00ab7528	cmp w22,#0x2
00ab752c	mov w24,wzr
00ab7530	b.ne 0x00ab7540
00ab7534	cmp w20,#0x41
00ab7538	b.gt 0x00ab764c
00ab753c	cset w24,ne
00ab7540	orr w2,wzr,#0xff
00ab7544	mov x0,x27
00ab7548	mov x1,x28
00ab754c	bl 0x00c38470
00ab7550	mov w20,w0
00ab7554	cmp w0,#0x1
00ab7558	mov w21,w25
00ab755c	b.ge 0x00ab7478
00ab7560	b 0x00ab75a4
00ab7564	cbz w21,0x00ab7570
00ab7568	mov w19,w23
00ab756c	b 0x00ab7588
00ab7570	cmp w22,#0x2
00ab7574	mov w19,w23
00ab7578	b.eq 0x00ab7908
00ab757c	ldr x8,[sp, #0x30]
00ab7580	mov w22,#0x2
00ab7584	str x8,[sp, #0x20]
00ab7588	orr w2,wzr,#0xff
00ab758c	mov x0,x27
00ab7590	mov x1,x28
00ab7594	bl 0x00c38470
00ab7598	mov w20,w0
00ab759c	cmp w0,#0x1
00ab75a0	b.ge 0x00ab7474
00ab75a4	bl 0x00c342a0
00ab75a8	adrp x0,0x2ce000
00ab75ac	adrp x2,0x2cb000
00ab75b0	add x0,x0,#0x16c
00ab75b4	add x2,x2,#0xf8e
00ab75b8	mov w1,#0x33f
00ab75bc	b 0x00ab7638
00ab75c0	ldr x19,[sp]
00ab75c4	add x20,x28,#0x9
00ab75c8	mov x0,x19
00ab75cc	bl 0x00c2ff50
00ab75d0	mov x21,x0
00ab75d4	mov x0,x20
00ab75d8	mov x1,x19
00ab75dc	mov x2,x21
00ab75e0	bl 0x00c31bb0
00ab75e4	mov w19,w23
00ab75e8	cbnz w0,0x00ab7604
00ab75ec	adrp x1,0x774000
00ab75f0	add x0,x20,x21
00ab75f4	add x1,x1,#0x457
00ab75f8	orr w2,wzr,#0x6
00ab75fc	bl 0x00c31bb0
00ab7600	cbz w0,0x00ab7670
00ab7604	bl 0x00c342a0
00ab7608	adrp x0,0x2ce000
00ab760c	adrp x2,0x2cb000
00ab7610	add x0,x0,#0x16c
00ab7614	add x2,x2,#0xf8e
00ab7618	mov w1,#0x36b
00ab761c	b 0x00ab7638
00ab7620	bl 0x00c342a0
00ab7624	adrp x0,0x2ce000
00ab7628	adrp x2,0x2cb000
00ab762c	add x0,x0,#0x16c
00ab7630	add x2,x2,#0xf8e
00ab7634	mov w1,#0x375
00ab7638	bl 0x00c342b0
00ab763c	mov w0,#0x9
00ab7640	mov w1,#0x66
00ab7644	mov x2,xzr
00ab7648	bl 0x00c342c0
00ab764c	ldp x25,x24,[sp, #0x30]
00ab7650	mov w20,wzr
00ab7654	cbnz w19,0x00ab768c
00ab7658	adrp x1,0x2ce000
00ab765c	add x1,x1,#0x16c
00ab7660	mov w2,#0xe2
00ab7664	mov x0,x28
00ab7668	bl 0x00c32310
00ab766c	b 0x00ab76a4
00ab7670	ldp x25,x24,[sp, #0x30]
00ab7674	ldr x8,[sp, #0x20]
00ab7678	cmp w22,#0x0
00ab767c	mov w20,#0x1
00ab7680	csel x24,x25,x24,eq
00ab7684	csel x25,x8,x25,eq
00ab7688	cbz w19,0x00ab7658
00ab768c	adrp x2,0x2ce000
00ab7690	add x2,x2,#0x16c
00ab7694	mov w1,#0x100
00ab7698	orr w3,wzr,#0xe0
00ab769c	mov x0,x28
00ab76a0	bl 0x00c38e10
00ab76a4	ldr x21,[sp]
00ab76a8	ldr x26,[sp, #0x28]
00ab76ac	cbz w20,0x00ab7798
00ab76b0	mov w1,#0x73
00ab76b4	add x3,sp,#0x40
00ab76b8	mov x0,x25
00ab76bc	mov x2,xzr
00ab76c0	bl 0x00c321a0
00ab76c4	ldr x8,[sp, #0x40]
00ab76c8	ldr w20,[x8]
00ab76cc	str w20,[sp, #0x4c]
00ab76d0	cbz w20,0x00ab7798
00ab76d4	bl 0x00c3cc10
00ab76d8	mov x27,x0
00ab76dc	cbz x0,0x00ab77c8
00ab76e0	mov x0,x27
00ab76e4	bl 0x00c3cbe0
00ab76e8	ldr x8,[sp, #0x40]
00ab76ec	add x2,sp,#0x4c
00ab76f0	mov x0,x27
00ab76f4	mov w4,w20
00ab76f8	ldr x1,[x8, #0x8]
00ab76fc	mov x3,x1
00ab7700	bl 0x00c3cbf0
00ab7704	tbnz w0,#0x1f,0x00ab77a0
00ab7708	ldr x8,[sp, #0x40]
00ab770c	ldrsw x9,[sp, #0x4c]
00ab7710	add x2,sp,#0x48
00ab7714	mov x0,x27
00ab7718	ldr x8,[x8, #0x8]
00ab771c	add x1,x8,x9
00ab7720	bl 0x00c3cbd0
00ab7724	tbnz w0,#0x1f,0x00ab77a0
00ab7728	ldpsw x9,x8,[sp, #0x48]
00ab772c	ldr x10,[sp, #0x40]
00ab7730	orr w1,wzr,#0x3
00ab7734	mov x0,x24
00ab7738	add x8,x8,x9
00ab773c	mov x2,xzr
00ab7740	mov x3,xzr
00ab7744	str w8,[sp, #0x4c]
00ab7748	str x8,[x10]
00ab774c	bl 0x00c321a0
00ab7750	lsl x22,x0,#0x20
00ab7754	orr x8,xzr,#0x100000000
00ab7758	add x8,x22,x8
00ab775c	adrp x21,0x2ce000
00ab7760	mov x20,x0
00ab7764	asr x0,x8,#0x20
00ab7768	add x21,x21,#0x16c
00ab776c	cbnz w19,0x00ab77fc
00ab7770	mov w2,#0xe8
00ab7774	mov x1,x21
00ab7778	bl 0x00c32320
00ab777c	ldr x8,[sp, #0x18]
00ab7780	mov w2,#0xe8
00ab7784	mov x1,x21
00ab7788	str x0,[x8]
00ab778c	ldrsw x0,[sp, #0x4c]
00ab7790	bl 0x00c32320
00ab7794	b 0x00ab7820
00ab7798	mov x27,xzr
00ab779c	b 0x00ab72f4
00ab77a0	bl 0x00c342a0
00ab77a4	adrp x0,0x2ce000
00ab77a8	adrp x2,0x2d0000
00ab77ac	add x0,x0,#0x16c
00ab77b0	add x2,x2,#0x253
00ab77b4	mov w1,#0x3c8
00ab77b8	bl 0x00c342b0
00ab77bc	mov w0,#0x9
00ab77c0	mov w1,#0x64
00ab77c4	b 0x00ab77f0
00ab77c8	bl 0x00c342a0
00ab77cc	adrp x0,0x2ce000
00ab77d0	adrp x2,0x2d0000
00ab77d4	add x0,x0,#0x16c
00ab77d8	add x2,x2,#0x253
00ab77dc	mov w1,#0x3bf
00ab77e0	bl 0x00c342b0
00ab77e4	mov w1,#0x100
00ab77e8	mov w0,#0x9
00ab77ec	movk w1,#0xc, LSL #16
00ab77f0	mov x2,xzr
00ab77f4	bl 0x00c342c0
00ab77f8	b 0x00ab72f0
00ab77fc	mov w2,#0xe7
00ab7800	mov x1,x21
00ab7804	bl 0x00c39220
00ab7808	ldr x8,[sp, #0x18]
00ab780c	mov w2,#0xe7
00ab7810	mov x1,x21
00ab7814	str x0,[x8]
00ab7818	ldrsw x0,[sp, #0x4c]
00ab781c	bl 0x00c39220
00ab7820	ldr x21,[sp, #0x10]
00ab7824	str x0,[x21]
00ab7828	cbz x0,0x00ab789c
00ab782c	ldr x8,[sp, #0x18]
00ab7830	ldr x1,[x8]
00ab7834	cbz x1,0x00ab789c
00ab7838	cbz w20,0x00ab7858
00ab783c	mov x0,x24
00ab7840	mov w2,w20
00ab7844	bl 0x00c34220
00ab7848	cmp w0,w20
00ab784c	b.ne 0x00ab789c
00ab7850	ldr x8,[sp, #0x18]
00ab7854	ldr x1,[x8]
00ab7858	asr x8,x22,#0x20
00ab785c	strb wzr,[x1, x8]
00ab7860	ldr x1,[x21]
00ab7864	ldr w2,[sp, #0x4c]
00ab7868	mov x0,x25
00ab786c	bl 0x00c34220
00ab7870	ldr w8,[sp, #0x4c]
00ab7874	cmp w0,w8
00ab7878	b.ne 0x00ab789c
00ab787c	ldr x9,[sp, #0x8]
00ab7880	sxtw x8,w0
00ab7884	mov w20,#0x1
00ab7888	mov x21,xzr
00ab788c	str x8,[x9]
00ab7890	ldr x8,[sp]
00ab7894	str x8,[x26]
00ab7898	b 0x00ab72f4
00ab789c	ldr x22,[sp, #0x18]
00ab78a0	adrp x20,0x2ce000
00ab78a4	add x20,x20,#0x16c
00ab78a8	ldr x0,[x22]
00ab78ac	cbnz w19,0x00ab78d4
00ab78b0	mov w2,#0xe2
00ab78b4	mov x1,x20
00ab78b8	bl 0x00c32310
00ab78bc	str xzr,[x22]
00ab78c0	ldr x0,[x21]
00ab78c4	mov w2,#0xe2
00ab78c8	mov x1,x20
00ab78cc	bl 0x00c32310
00ab78d0	b 0x00ab78fc
00ab78d4	orr w3,wzr,#0xe0
00ab78d8	mov x1,xzr
00ab78dc	mov x2,x20
00ab78e0	bl 0x00c38e10
00ab78e4	str xzr,[x22]
00ab78e8	ldr x0,[x21]
00ab78ec	orr w3,wzr,#0xe0
00ab78f0	mov x1,xzr
00ab78f4	mov x2,x20
00ab78f8	bl 0x00c38e10
00ab78fc	str xzr,[x21]
00ab7900	ldr x21,[sp]
00ab7904	b 0x00ab72f0
00ab7908	bl 0x00c342a0
00ab790c	adrp x0,0x2ce000
00ab7910	adrp x2,0x2cb000
00ab7914	add x0,x0,#0x16c
00ab7918	add x2,x2,#0xf8e
00ab791c	mov w1,#0x35c
00ab7920	b 0x00ab7638

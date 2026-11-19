; FUN_00ad6f60 @ 00ad6f60
00ad6f60	stp x22,x21,[sp, #-0x30]!
00ad6f64	stp x20,x19,[sp, #0x10]
00ad6f68	stp x29,x30,[sp, #0x20]
00ad6f6c	ldr x22,[x0, #0x98]
00ad6f70	orr w8,wzr,#0xffffefff
00ad6f74	add w8,w1,w8
00ad6f78	mov x19,x3
00ad6f7c	mov x21,x0
00ad6f80	cmp w8,#0xc
00ad6f84	mov w20,w2
00ad6f88	add x29,sp,#0x20
00ad6f8c	b.hi 0x00ad6fc4
00ad6f90	adrp x9,0x774000
00ad6f94	add x9,x9,#0x8e0
00ad6f98	ldrsw x8,[x9, x8, LSL #0x2]
00ad6f9c	add x8,x8,x9
00ad6fa0	br x8
00ad6fa4	ldr w8,[x22, #0x1c]
00ad6fa8	cmp w8,#0x6
00ad6fac	b.ne 0x00ad722c
00ad6fb0	mov w8,#0x1007
00ad6fb4	cmp w1,w8
00ad6fb8	b.ne 0x00ad72d4
00ad6fbc	ldr w8,[x22, #0x30]
00ad6fc0	b 0x00ad718c
00ad6fc4	sub w8,w1,#0x1
00ad6fc8	cmp w8,#0xc
00ad6fcc	b.hi 0x00ad7424
00ad6fd0	adrp x9,0x774000
00ad6fd4	add x9,x9,#0x8ac
00ad6fd8	ldrsw x8,[x9, x8, LSL #0x2]
00ad6fdc	mov w0,#0x1
00ad6fe0	add x8,x8,x9
00ad6fe4	br x8
00ad6fe8	ldr x8,[x21, #0x78]
00ad6fec	ldr w8,[x8]
00ad6ff0	cmp w8,#0x390
00ad6ff4	b.ne 0x00ad72cc
00ad6ff8	bl 0x00c342a0
00ad6ffc	adrp x0,0x2ae000
00ad7000	adrp x2,0x2a2000
00ad7004	add x0,x0,#0x623
00ad7008	add x2,x2,#0xc94
00ad700c	mov w1,#0x263
00ad7010	bl 0x00c342b0
00ad7014	mov w0,#0x4
00ad7018	mov w1,#0x94
00ad701c	b 0x00ad741c
00ad7020	ldr w8,[x22, #0x1c]
00ad7024	orr w8,w8,#0x2
00ad7028	cmp w8,#0x6
00ad702c	b.ne 0x00ad727c
00ad7030	mov w8,#0x1008
00ad7034	cmp w1,w8
00ad7038	b.ne 0x00ad72a4
00ad703c	ldr x8,[x22, #0x28]
00ad7040	cbnz x8,0x00ad7064
00ad7044	b 0x00ad7060
00ad7048	ldr w8,[x22, #0x1c]
00ad704c	cmp w8,#0x4
00ad7050	b.ne 0x00ad7254
00ad7054	mov w8,#0x100b
00ad7058	cmp w1,w8
00ad705c	b.ne 0x00ad7270
00ad7060	ldr x8,[x22, #0x20]
00ad7064	str x8,[x19]
00ad7068	mov w0,#0x1
00ad706c	b 0x00ad7428
00ad7070	ldr w1,[x22, #0x1c]
00ad7074	mov x0,x19
00ad7078	bl 0x00ad7924
00ad707c	cbz w0,0x00ad7428
00ad7080	ldr w8,[x22, #0x34]
00ad7084	cmn w8,#0x1
00ad7088	b.eq 0x00ad7270
00ad708c	ldr x0,[x22, #0x20]
00ad7090	bl 0x00c34c30
00ad7094	mov w20,w0
00ad7098	mov x0,x19
00ad709c	bl 0x00c34c30
00ad70a0	cmp w20,w0
00ad70a4	b.eq 0x00ad72cc
00ad70a8	bl 0x00c342a0
00ad70ac	adrp x0,0x2ae000
00ad70b0	adrp x2,0x2a2000
00ad70b4	add x0,x0,#0x623
00ad70b8	add x2,x2,#0xc94
00ad70bc	mov w1,#0x216
00ad70c0	bl 0x00c342b0
00ad70c4	mov w0,#0x4
00ad70c8	mov w1,#0x91
00ad70cc	b 0x00ad74b4
00ad70d0	sub w8,w20,#0x1
00ad70d4	cmp w8,#0x5
00ad70d8	b.hi 0x00ad73f8
00ad70dc	ldr x0,[x22, #0x20]
00ad70e0	mov w1,w20
00ad70e4	bl 0x00ad7924
00ad70e8	cbz w0,0x00ad7428
00ad70ec	cmp w20,#0x6
00ad70f0	b.ne 0x00ad73e8
00ad70f4	ldrb w8,[x21]
00ad70f8	tst w8,#0x30
00ad70fc	b.eq 0x00ad73f8
00ad7100	ldr x8,[x22, #0x20]
00ad7104	cbnz x8,0x00ad7464
00ad7108	bl 0x00c324d0
00ad710c	str x0,[x22, #0x20]
00ad7110	b 0x00ad7464
00ad7114	cmp w20,#0x1ff
00ad7118	b.gt 0x00ad7320
00ad711c	bl 0x00c342a0
00ad7120	adrp x0,0x2ae000
00ad7124	adrp x2,0x2a2000
00ad7128	add x0,x0,#0x623
00ad712c	add x2,x2,#0xc94
00ad7130	mov w1,#0x1ed
00ad7134	bl 0x00c342b0
00ad7138	mov w0,#0x4
00ad713c	orr w1,wzr,#0x78
00ad7140	b 0x00ad741c
00ad7144	cbz x19,0x00ad7160
00ad7148	mov x0,x19
00ad714c	bl 0x00c38d10
00ad7150	cbz w0,0x00ad7160
00ad7154	mov x0,x19
00ad7158	bl 0x00c38d20
00ad715c	cbz w0,0x00ad7438
00ad7160	bl 0x00c342a0
00ad7164	adrp x0,0x2ae000
00ad7168	adrp x2,0x2a2000
00ad716c	add x0,x0,#0x623
00ad7170	add x2,x2,#0xc94
00ad7174	mov w1,#0x1f5
00ad7178	bl 0x00c342b0
00ad717c	mov w0,#0x4
00ad7180	mov w1,#0x65
00ad7184	b 0x00ad741c
00ad7188	ldr w8,[x22, #0x1c]
00ad718c	str w8,[x19]
00ad7190	mov w0,#0x1
00ad7194	b 0x00ad7428
00ad7198	ldr w8,[x22, #0x1c]
00ad719c	cmp w8,#0x4
00ad71a0	b.ne 0x00ad732c
00ad71a4	mov x21,x22
00ad71a8	ldr x0,[x21, #0x40]!
00ad71ac	adrp x1,0x2ae000
00ad71b0	add x1,x1,#0x623
00ad71b4	mov w2,#0x23c
00ad71b8	bl 0x00c32310
00ad71bc	cmp w20,#0x1
00ad71c0	b.lt 0x00ad737c
00ad71c4	cbz x19,0x00ad737c
00ad71c8	sxtw x8,w20
00ad71cc	stp x19,x8,[x22, #0x40]
00ad71d0	mov w0,#0x1
00ad71d4	b 0x00ad7428
00ad71d8	ldr w8,[x22, #0x1c]
00ad71dc	cmp w8,#0x4
00ad71e0	b.ne 0x00ad7348
00ad71e4	cbz x19,0x00ad73bc
00ad71e8	ldr x8,[x22, #0x40]
00ad71ec	str x8,[x19]
00ad71f0	ldr w0,[x22, #0x48]
00ad71f4	b 0x00ad7428
00ad71f8	sub w8,w20,#0x2
00ad71fc	cmp w8,#0x4
00ad7200	b.cc 0x00ad7370
00ad7204	bl 0x00c342a0
00ad7208	adrp x0,0x2ae000
00ad720c	adrp x2,0x2a2000
00ad7210	add x0,x0,#0x623
00ad7214	add x2,x2,#0xc94
00ad7218	orr w1,wzr,#0x1fe
00ad721c	bl 0x00c342b0
00ad7220	mov w0,#0x4
00ad7224	mov w1,#0xa5
00ad7228	b 0x00ad741c
00ad722c	bl 0x00c342a0
00ad7230	adrp x0,0x2ae000
00ad7234	adrp x2,0x2a2000
00ad7238	add x0,x0,#0x623
00ad723c	add x2,x2,#0xc94
00ad7240	mov w1,#0x1d2
00ad7244	bl 0x00c342b0
00ad7248	mov w0,#0x4
00ad724c	mov w1,#0x92
00ad7250	b 0x00ad741c
00ad7254	bl 0x00c342a0
00ad7258	adrp x0,0x2ae000
00ad725c	adrp x2,0x2a2000
00ad7260	add x0,x0,#0x623
00ad7264	add x2,x2,#0xc94
00ad7268	mov w1,#0x207
00ad726c	b 0x00ad7360
00ad7270	str x19,[x22, #0x20]
00ad7274	mov w0,#0x1
00ad7278	b 0x00ad7428
00ad727c	bl 0x00c342a0
00ad7280	adrp x0,0x2ae000
00ad7284	adrp x2,0x2a2000
00ad7288	add x0,x0,#0x623
00ad728c	add x2,x2,#0xc94
00ad7290	mov w1,#0x224
00ad7294	bl 0x00c342b0
00ad7298	mov w0,#0x4
00ad729c	mov w1,#0x9c
00ad72a0	b 0x00ad741c
00ad72a4	ldr w8,[x22, #0x34]
00ad72a8	cmn w8,#0x1
00ad72ac	b.eq 0x00ad7388
00ad72b0	ldr x0,[x22, #0x28]
00ad72b4	bl 0x00c34c30
00ad72b8	mov w20,w0
00ad72bc	mov x0,x19
00ad72c0	bl 0x00c34c30
00ad72c4	cmp w20,w0
00ad72c8	b.ne 0x00ad7394
00ad72cc	mov w0,#0x1
00ad72d0	b 0x00ad7428
00ad72d4	cmn w20,#0x3
00ad72d8	b.lt 0x00ad7424
00ad72dc	ldr w19,[x22, #0x34]
00ad72e0	cmn w19,#0x1
00ad72e4	b.eq 0x00ad74c4
00ad72e8	cmn w20,#0x1
00ad72ec	b.eq 0x00ad7470
00ad72f0	cmn w20,#0x2
00ad72f4	b.ne 0x00ad7484
00ad72f8	ldr w8,[x21]
00ad72fc	cmp w8,#0x20
00ad7300	b.ne 0x00ad74c4
00ad7304	bl 0x00c342a0
00ad7308	adrp x0,0x2ae000
00ad730c	adrp x2,0x2a2000
00ad7310	add x0,x0,#0x623
00ad7314	add x2,x2,#0xc94
00ad7318	mov w1,#0x1dd
00ad731c	b 0x00ad7244
00ad7320	str w20,[x22]
00ad7324	mov w0,#0x1
00ad7328	b 0x00ad7428
00ad732c	bl 0x00c342a0
00ad7330	adrp x0,0x2ae000
00ad7334	adrp x2,0x2a2000
00ad7338	add x0,x0,#0x623
00ad733c	add x2,x2,#0xc94
00ad7340	mov w1,#0x239
00ad7344	b 0x00ad7360
00ad7348	bl 0x00c342a0
00ad734c	adrp x0,0x2ae000
00ad7350	adrp x2,0x2a2000
00ad7354	add x0,x0,#0x623
00ad7358	add x2,x2,#0xc94
00ad735c	mov w1,#0x248
00ad7360	bl 0x00c342b0
00ad7364	mov w0,#0x4
00ad7368	mov w1,#0x8d
00ad736c	b 0x00ad741c
00ad7370	str w20,[x22, #0x10]
00ad7374	mov w0,#0x1
00ad7378	b 0x00ad7428
00ad737c	stp xzr,xzr,[x21]
00ad7380	mov w0,#0x1
00ad7384	b 0x00ad7428
00ad7388	str x19,[x22, #0x28]
00ad738c	mov w0,#0x1
00ad7390	b 0x00ad7428
00ad7394	bl 0x00c342a0
00ad7398	adrp x0,0x2ae000
00ad739c	adrp x2,0x2a2000
00ad73a0	add x0,x0,#0x623
00ad73a4	add x2,x2,#0xc94
00ad73a8	mov w1,#0x230
00ad73ac	bl 0x00c342b0
00ad73b0	mov w0,#0x4
00ad73b4	mov w1,#0x98
00ad73b8	b 0x00ad74b4
00ad73bc	bl 0x00c342a0
00ad73c0	adrp x0,0x2ae000
00ad73c4	adrp x2,0x2a2000
00ad73c8	add x0,x0,#0x623
00ad73cc	add x2,x2,#0xc94
00ad73d0	mov w1,#0x24c
00ad73d4	bl 0x00c342b0
00ad73d8	mov w1,#0x102
00ad73dc	orr w0,wzr,#0x6
00ad73e0	movk w1,#0xc, LSL #16
00ad73e4	b 0x00ad74b4
00ad73e8	ldr x8,[x21, #0x78]
00ad73ec	ldr w8,[x8]
00ad73f0	cmp w8,#0x390
00ad73f4	b.ne 0x00ad744c
00ad73f8	bl 0x00c342a0
00ad73fc	adrp x0,0x2ae000
00ad7400	adrp x2,0x2a2000
00ad7404	add x0,x0,#0x623
00ad7408	add x2,x2,#0xc94
00ad740c	mov w1,#0x1c8
00ad7410	bl 0x00c342b0
00ad7414	mov w0,#0x4
00ad7418	mov w1,#0x90
00ad741c	mov x2,xzr
00ad7420	bl 0x00c342c0
00ad7424	orr w0,wzr,#0xfffffffe
00ad7428	ldp x29,x30,[sp, #0x20]
00ad742c	ldp x20,x19,[sp, #0x10]
00ad7430	ldp x22,x21,[sp], #0x30
00ad7434	ret
00ad7438	ldr x0,[x22, #0x8]
00ad743c	bl 0x00c36290
00ad7440	str x19,[x22, #0x8]
00ad7444	mov w0,#0x1
00ad7448	b 0x00ad7428
00ad744c	cmp w20,#0x4
00ad7450	b.ne 0x00ad7464
00ad7454	ldrb w8,[x21, #0x1]
00ad7458	tst w8,#0x6
00ad745c	b.ne 0x00ad7100
00ad7460	b 0x00ad73f8
00ad7464	str w20,[x22, #0x1c]
00ad7468	mov w0,#0x1
00ad746c	b 0x00ad7428
00ad7470	ldr x0,[x22, #0x20]
00ad7474	bl 0x00c34c20
00ad7478	cmp w19,w0
00ad747c	b.gt 0x00ad7490
00ad7480	b 0x00ad74c4
00ad7484	tbnz w20,#0x1f,0x00ad74c4
00ad7488	cmp w19,w20
00ad748c	b.le 0x00ad74c4
00ad7490	bl 0x00c342a0
00ad7494	adrp x0,0x2ae000
00ad7498	adrp x2,0x2a2000
00ad749c	add x0,x0,#0x623
00ad74a0	add x2,x2,#0xc94
00ad74a4	mov w1,#0x1e3
00ad74a8	bl 0x00c342b0
00ad74ac	mov w0,#0x4
00ad74b0	mov w1,#0xa4
00ad74b4	mov x2,xzr
00ad74b8	bl 0x00c342c0
00ad74bc	mov w0,wzr
00ad74c0	b 0x00ad7428
00ad74c4	str w20,[x22, #0x30]
00ad74c8	mov w0,#0x1
00ad74cc	b 0x00ad7428

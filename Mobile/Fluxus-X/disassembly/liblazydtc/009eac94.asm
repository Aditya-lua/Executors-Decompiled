; tls_post_process_client_hello @ 009eac94
009eac94	sub sp,sp,#0x70
009eac98	stp x20,x19,[sp, #0x50]
009eac9c	cmp w1,#0x3
009eaca0	mov x19,x0
009eaca4	str x25,[sp, #0x20]
009eaca8	stp x24,x23,[sp, #0x30]
009eacac	stp x22,x21,[sp, #0x40]
009eacb0	stp x29,x30,[sp, #0x60]
009eacb4	add x29,sp,#0x60
009eacb8	b.ne 0x009ead14
009eacbc	mov w8,#0x50
009eacc0	stp xzr,xzr,[sp, #0x10]
009eacc4	stp wzr,w8,[sp, #0x28]
009eacc8	ldr x9,[x19, #0x9a8]
009eaccc	ldr x20,[x19, #0xb58]
009eacd0	ldr x8,[x9, #0x208]
009eacd4	cbz x8,0x009ead60
009eacd8	ldr x2,[x9, #0x210]
009eacdc	add x1,sp,#0x2c
009eace0	mov x0,x19
009eace4	blr x8
009eace8	cmp w0,#0x1
009eacec	b.eq 0x009ead60
009eacf0	cmn w0,#0x1
009eacf4	b.ne 0x009eadd4
009eacf8	orr w8,wzr,#0x7
009eacfc	str w8,[x19, #0x28]
009ead00	mov w8,#0xffffffff
009ead04	cbz w8,0x009eb4b0
009ead08	tbnz w8,#0x1f,0x009eadcc
009ead0c	asr w8,w8,#0x1f
009ead10	add w1,w8,#0x4
009ead14	cmp w1,#0x5
009ead18	b.eq 0x009eb408
009ead1c	cmp w1,#0x4
009ead20	b.ne 0x009eb478
009ead24	ldr w8,[x19, #0x4d0]
009ead28	cbz w8,0x009eaf40
009ead2c	ldr x8,[x19, #0x8]
009ead30	ldr x9,[x8, #0xc0]
009ead34	ldrb w9,[x9, #0x60]
009ead38	tbnz w9,#0x3,0x009ead50
009ead3c	ldr w8,[x8]
009ead40	cmp w8,#0x304
009ead44	b.lt 0x009ead50
009ead48	cmp w8,#0x10, LSL #12
009ead4c	b.ne 0x009eaf68
009ead50	ldr x8,[x19, #0x918]
009ead54	ldr x8,[x8, #0x2f8]
009ead58	str x8,[x19, #0x2e0]
009ead5c	b 0x009eafb8
009ead60	ldur q0,[x20, #0x18]
009ead64	str q0,[x19, #0x170]
009ead68	ldur q0,[x20, #0x8]
009ead6c	str q0,[x19, #0x160]
009ead70	ldr w8,[x20]
009ead74	cbz w8,0x009ead94
009ead78	ldr w8,[x20, #0x4]
009ead7c	cmp w8,#0x2
009ead80	b.eq 0x009eaec8
009ead84	and w9,w8,#0xff00
009ead88	cmp w9,#0x300
009ead8c	b.ne 0x009eaec8
009ead90	str w8,[x19, #0xa0c]
009ead94	ldr x8,[x19, #0x8]
009ead98	ldr x9,[x8, #0xc0]
009ead9c	ldr w9,[x9, #0x60]
009eada0	tbnz w9,#0x3,0x009eadfc
009eada4	add x2,sp,#0x28
009eada8	mov x0,x19
009eadac	mov x1,x20
009eadb0	bl 0x00c372c0
009eadb4	mov w21,w0
009eadb8	cbnz w0,0x009eae34
009eadbc	ldr x8,[x19, #0x8]
009eadc0	ldr x9,[x8, #0xc0]
009eadc4	ldr w9,[x9, #0x60]
009eadc8	b 0x009eae7c
009eadcc	orr w0,wzr,#0x3
009eadd0	b 0x009eb4b4
009eadd4	bl 0x00c342a0
009eadd8	adrp x0,0x2bd000
009eaddc	adrp x2,0x2c3000
009eade0	add x0,x0,#0x74c
009eade4	add x2,x2,#0x66f
009eade8	mov w1,#0x64f
009eadec	bl 0x00c342b0
009eadf0	ldr w1,[sp, #0x2c]
009eadf4	mov w2,#0xea
009eadf8	b 0x009eaeec
009eadfc	ldr w10,[x8]
009eae00	orr w11,wzr,#0x1ffff
009eae04	cmp w10,w11
009eae08	b.eq 0x009eae7c
009eae0c	ldr w10,[x20, #0x4]
009eae10	ldr w11,[x19]
009eae14	orr w12,wzr,#0xff00
009eae18	cmp w10,#0x100
009eae1c	csel w10,w12,w10,eq
009eae20	cmp w11,#0x100
009eae24	csel w11,w12,w11,eq
009eae28	cmp w10,w11
009eae2c	b.le 0x009eae7c
009eae30	mov w21,#0x18c
009eae34	ldr x8,[x19, #0x240]
009eae38	cbz x8,0x009eae44
009eae3c	ldr x8,[x19, #0x2c8]
009eae40	cbnz x8,0x009eae50
009eae44	ldr w8,[x20, #0x4]
009eae48	str w8,[x19, #0xa0c]
009eae4c	str w8,[x19]
009eae50	bl 0x00c342a0
009eae54	adrp x0,0x2bd000
009eae58	adrp x2,0x2c3000
009eae5c	add x0,x0,#0x74c
009eae60	add x2,x2,#0x66f
009eae64	mov w1,#0x679
009eae68	bl 0x00c342b0
009eae6c	mov w1,#0x46
009eae70	mov x0,x19
009eae74	mov w2,w21
009eae78	b 0x009eaef0
009eae7c	tbnz w9,#0x3,0x009eb0b4
009eae80	ldr w8,[x8]
009eae84	cmp w8,#0x304
009eae88	b.lt 0x009eb13c
009eae8c	cmp w8,#0x10, LSL #12
009eae90	b.eq 0x009eb13c
009eae94	add x0,x19,#0xc58
009eae98	bl 0x00c358f0
009eae9c	cbz w0,0x009eb0a4
009eaea0	bl 0x00c342a0
009eaea4	adrp x0,0x2bd000
009eaea8	adrp x2,0x2c3000
009eaeac	add x0,x0,#0x74c
009eaeb0	add x2,x2,#0x66f
009eaeb4	mov w1,#0x67f
009eaeb8	bl 0x00c342b0
009eaebc	mov w1,#0xa
009eaec0	mov w2,#0xb6
009eaec4	b 0x009eaeec
009eaec8	bl 0x00c342a0
009eaecc	adrp x0,0x2bd000
009eaed0	adrp x2,0x2c3000
009eaed4	add x0,x0,#0x74c
009eaed8	add x2,x2,#0x66f
009eaedc	mov w1,#0x661
009eaee0	bl 0x00c342b0
009eaee4	mov w1,#0x46
009eaee8	orr w2,wzr,#0xfc
009eaeec	mov x0,x19
009eaef0	mov x3,xzr
009eaef4	bl 0x00c34410
009eaef8	ldr x0,[sp, #0x18]
009eaefc	bl 0x00c34770
009eaf00	ldr x0,[sp, #0x10]
009eaf04	bl 0x00c34770
009eaf08	ldr x0,[x20, #0x288]
009eaf0c	adrp x20,0x2bd000
009eaf10	add x20,x20,#0x74c
009eaf14	mov w2,#0x801
009eaf18	mov x1,x20
009eaf1c	bl 0x00c32310
009eaf20	ldr x0,[x19, #0xb58]
009eaf24	mov w2,#0x802
009eaf28	mov x1,x20
009eaf2c	bl 0x00c32310
009eaf30	mov w8,wzr
009eaf34	str xzr,[x19, #0xb58]
009eaf38	cbnz w8,0x009ead08
009eaf3c	b 0x009eb4b0
009eaf40	ldr x9,[x19, #0x898]
009eaf44	ldr x8,[x9, #0x1b8]
009eaf48	cbz x8,0x009eaf68
009eaf4c	ldr x1,[x9, #0x1c0]
009eaf50	mov x0,x19
009eaf54	blr x8
009eaf58	cbz w0,0x009eb070
009eaf5c	tbnz w0,#0x1f,0x009eb098
009eaf60	mov w8,#0x1
009eaf64	str w8,[x19, #0x28]
009eaf68	ldr x8,[x19, #0x8]
009eaf6c	ldr x9,[x8, #0xc0]
009eaf70	ldrb w9,[x9, #0x60]
009eaf74	tbnz w9,#0x3,0x009eaf8c
009eaf78	ldr w8,[x8]
009eaf7c	cmp w8,#0x304
009eaf80	b.lt 0x009eaf8c
009eaf84	cmp w8,#0x10, LSL #12
009eaf88	b.ne 0x009eafb0
009eaf8c	ldr x20,[x19, #0x520]
009eaf90	mov x0,x19
009eaf94	bl 0x00c35380
009eaf98	mov x2,x0
009eaf9c	mov x0,x19
009eafa0	mov x1,x20
009eafa4	bl 0x00c34840
009eafa8	cbz x0,0x009eb008
009eafac	str x0,[x19, #0x2e0]
009eafb0	ldr w8,[x19, #0x4d0]
009eafb4	cbz w8,0x009eb030
009eafb8	ldr w8,[x19, #0xa60]
009eafbc	str wzr,[x19, #0xa74]
009eafc0	cmn w8,#0x1
009eafc4	b.eq 0x009eb3d8
009eafc8	ldr x8,[x19, #0x9a8]
009eafcc	cbz x8,0x009eb3d8
009eafd0	ldr x9,[x8, #0x250]
009eafd4	cbz x9,0x009eb3d8
009eafd8	ldr x10,[x19, #0x388]
009eafdc	cbz x10,0x009eb3d8
009eafe0	ldr x11,[x19, #0x898]
009eafe4	mov x0,x19
009eafe8	str x10,[x11]
009eafec	ldr x1,[x8, #0x258]
009eaff0	blr x9
009eaff4	cbz w0,0x009eb3c8
009eaff8	cmp w0,#0x3
009eaffc	b.ne 0x009eb4e0
009eb000	str wzr,[x19, #0xa74]
009eb004	b 0x009eb3d8
009eb008	bl 0x00c342a0
009eb00c	adrp x0,0x2bd000
009eb010	adrp x2,0x2c7000
009eb014	add x0,x0,#0x74c
009eb018	add x2,x2,#0x6fd
009eb01c	mov w1,#0x8ad
009eb020	bl 0x00c342b0
009eb024	mov w1,#0x28
009eb028	mov w2,#0xc1
009eb02c	b 0x009eb4a4
009eb030	mov w1,#0x1
009eb034	mov x0,x19
009eb038	bl 0x00c367c0
009eb03c	cbz w0,0x009eb4b4
009eb040	ldr x8,[x19, #0xc50]
009eb044	cbz x8,0x009eb530
009eb048	ldr x9,[x19, #0x2e0]
009eb04c	mov x0,x19
009eb050	ldr w9,[x9, #0x1c]
009eb054	tst w9,#0x6
009eb058	cset w1,ne
009eb05c	blr x8
009eb060	ldr x8,[x19, #0x918]
009eb064	str w0,[x8, #0x2b0]
009eb068	cbnz w0,0x009eb53c
009eb06c	b 0x009eafb8
009eb070	bl 0x00c342a0
009eb074	adrp x0,0x2bd000
009eb078	adrp x2,0x2c7000
009eb07c	add x0,x0,#0x74c
009eb080	add x2,x2,#0x6fd
009eb084	mov w1,#0x89c
009eb088	bl 0x00c342b0
009eb08c	mov w1,#0x50
009eb090	mov w2,#0x179
009eb094	b 0x009eb4a4
009eb098	mov w0,#0x4
009eb09c	str w0,[x19, #0x28]
009eb0a0	b 0x009eb4b4
009eb0a4	ldr x8,[x19, #0x8]
009eb0a8	ldr x8,[x8, #0xc0]
009eb0ac	ldrb w8,[x8, #0x60]
009eb0b0	tbz w8,#0x3,0x009eb13c
009eb0b4	mov x0,x19
009eb0b8	bl 0x00c342f0
009eb0bc	tbz w0,#0xd,0x009eb0ec
009eb0c0	ldr x8,[x19, #0x9a8]
009eb0c4	ldr x8,[x8, #0xd8]
009eb0c8	cbz x8,0x009eb388
009eb0cc	ldr w2,[x20, #0x50]
009eb0d0	add x1,x20,#0x58
009eb0d4	mov x0,x19
009eb0d8	blr x8
009eb0dc	cbz w0,0x009eb508
009eb0e0	ldr x21,[x19, #0x4b8]
009eb0e4	mov w8,#0x1
009eb0e8	str w8,[x21, #0x108]
009eb0ec	ldr x8,[x19, #0x8]
009eb0f0	orr w9,wzr,#0x1ffff
009eb0f4	ldr w8,[x8]
009eb0f8	cmp w8,w9
009eb0fc	b.ne 0x009eb13c
009eb100	add x2,sp,#0x28
009eb104	mov x0,x19
009eb108	mov x1,x20
009eb10c	bl 0x00c372c0
009eb110	cbz w0,0x009eb13c
009eb114	ldr w8,[x19, #0xa0c]
009eb118	mov w21,w0
009eb11c	str w8,[x19]
009eb120	bl 0x00c342a0
009eb124	adrp x0,0x2bd000
009eb128	adrp x2,0x2c3000
009eb12c	add x0,x0,#0x74c
009eb130	add x2,x2,#0x66f
009eb134	mov w1,#0x69b
009eb138	b 0x009eae68
009eb13c	str wzr,[x19, #0x4d0]
009eb140	ldr w2,[x20]
009eb144	add x21,x20,#0x158
009eb148	mov x0,x19
009eb14c	mov x1,x21
009eb150	bl 0x00c35d20
009eb154	cbz w0,0x009eaef8
009eb158	ldr w4,[x20]
009eb15c	add x2,sp,#0x18
009eb160	add x3,sp,#0x10
009eb164	mov w5,#0x1
009eb168	mov x0,x19
009eb16c	mov x1,x21
009eb170	bl 0x00c35c70
009eb174	cbz w0,0x009eaef8
009eb178	str wzr,[x19, #0x480]
009eb17c	ldr x0,[sp, #0x10]
009eb180	cbz x0,0x009eb204
009eb184	bl 0x00c325e0
009eb188	cmp w0,#0x1
009eb18c	b.lt 0x009eb204
009eb190	mov w23,#0xff
009eb194	mov w25,#0x5600
009eb198	mov w21,wzr
009eb19c	movk w23,#0x300, LSL #16
009eb1a0	mov w24,#0x1
009eb1a4	movk w25,#0x300, LSL #16
009eb1a8	ldr x0,[sp, #0x10]
009eb1ac	mov w1,w21
009eb1b0	bl 0x00c32610
009eb1b4	mov x22,x0
009eb1b8	bl 0x00c351f0
009eb1bc	cmp w0,w23
009eb1c0	b.ne 0x009eb1d4
009eb1c4	ldr w8,[x19, #0xba0]
009eb1c8	cbnz w8,0x009eb5c8
009eb1cc	str w24,[x19, #0x480]
009eb1d0	b 0x009eb1f0
009eb1d4	mov x0,x22
009eb1d8	bl 0x00c351f0
009eb1dc	cmp w0,w25
009eb1e0	b.ne 0x009eb1f0
009eb1e4	mov x0,x19
009eb1e8	bl 0x00c372b0
009eb1ec	cbz w0,0x009eb694
009eb1f0	ldr x0,[sp, #0x10]
009eb1f4	add w21,w21,#0x1
009eb1f8	bl 0x00c325e0
009eb1fc	cmp w21,w0
009eb200	b.lt 0x009eb1a8
009eb204	ldr x8,[x19, #0x8]
009eb208	ldr x9,[x8, #0xc0]
009eb20c	ldrb w9,[x9, #0x60]
009eb210	tbnz w9,#0x3,0x009eb270
009eb214	ldr w8,[x8]
009eb218	cmp w8,#0x304
009eb21c	b.lt 0x009eb270
009eb220	cmp w8,#0x10, LSL #12
009eb224	b.eq 0x009eb270
009eb228	ldr x21,[sp, #0x18]
009eb22c	mov x0,x19
009eb230	bl 0x00c35380
009eb234	mov x2,x0
009eb238	mov x0,x19
009eb23c	mov x1,x21
009eb240	bl 0x00c34840
009eb244	cbz x0,0x009eb5f0
009eb248	ldr w8,[x19, #0x8e8]
009eb24c	cmp w8,#0x1
009eb250	b.ne 0x009eb26c
009eb254	ldr x8,[x19, #0x2e0]
009eb258	cbz x8,0x009eb6bc
009eb25c	ldr w8,[x8, #0x18]
009eb260	ldr w9,[x0, #0x18]
009eb264	cmp w8,w9
009eb268	b.ne 0x009eb6bc
009eb26c	str x0,[x19, #0x2e0]
009eb270	ldr x3,[x20, #0x288]
009eb274	mov w1,#0xd
009eb278	mov w2,#0x80
009eb27c	mov x0,x19
009eb280	mov x4,xzr
009eb284	mov x5,xzr
009eb288	bl 0x00c36140
009eb28c	cbz w0,0x009eaef8
009eb290	ldr w8,[x20]
009eb294	cbz w8,0x009eb590
009eb298	mov w1,#0x1
009eb29c	mov x0,x19
009eb2a0	bl 0x00c360f0
009eb2a4	cbz w0,0x009eaef8
009eb2a8	ldr x21,[x19, #0x8]
009eb2ac	ldr x8,[x21, #0xc0]
009eb2b0	ldr w8,[x8, #0x60]
009eb2b4	tbnz w8,#0x3,0x009eb2f4
009eb2b8	ldr w9,[x21]
009eb2bc	cmp w9,#0x304
009eb2c0	b.lt 0x009eb2f4
009eb2c4	cmp w9,#0x10, LSL #12
009eb2c8	b.eq 0x009eb2f4
009eb2cc	ldr x8,[x19, #0xb58]
009eb2d0	add x0,x19,#0x940
009eb2d4	ldr x2,[x8, #0x28]
009eb2d8	add x1,x8,#0x30
009eb2dc	bl 0x00c2ffd0
009eb2e0	ldr x8,[x19, #0xb58]
009eb2e4	ldr x8,[x8, #0x28]
009eb2e8	str x8,[x19, #0x960]
009eb2ec	ldr x8,[x21, #0xc0]
009eb2f0	ldr w8,[x8, #0x60]
009eb2f4	tbnz w8,#0x3,0x009eb30c
009eb2f8	ldr w8,[x21]
009eb2fc	cmp w8,#0x304
009eb300	b.lt 0x009eb30c
009eb304	cmp w8,#0x10, LSL #12
009eb308	b.ne 0x009eb544
009eb30c	ldr w8,[x19, #0x4d0]
009eb310	cbz w8,0x009eb544
009eb314	ldr x8,[x19, #0x918]
009eb318	ldr x0,[sp, #0x18]
009eb31c	ldr x8,[x8, #0x2f8]
009eb320	ldr w22,[x8, #0x18]
009eb324	bl 0x00c325e0
009eb328	cmp w0,#0x1
009eb32c	b.lt 0x009eb360
009eb330	mov w21,wzr
009eb334	ldr x0,[sp, #0x18]
009eb338	mov w1,w21
009eb33c	bl 0x00c32610
009eb340	ldr w8,[x0, #0x18]
009eb344	cmp w8,w22
009eb348	b.eq 0x009eb544
009eb34c	ldr x0,[sp, #0x18]
009eb350	add w21,w21,#0x1
009eb354	bl 0x00c325e0
009eb358	cmp w21,w0
009eb35c	b.lt 0x009eb334
009eb360	bl 0x00c342a0
009eb364	adrp x0,0x2bd000
009eb368	adrp x2,0x2c3000
009eb36c	add x0,x0,#0x74c
009eb370	add x2,x2,#0x66f
009eb374	mov w1,#0x730
009eb378	bl 0x00c342b0
009eb37c	mov w1,#0x2f
009eb380	mov w2,#0xd7
009eb384	b 0x009eaeec
009eb388	ldr x21,[x19, #0x4b8]
009eb38c	ldr x8,[x20, #0x50]
009eb390	ldr x2,[x21, #0x100]
009eb394	cmp x2,x8
009eb398	b.ne 0x009eb3ac
009eb39c	add x0,x20,#0x58
009eb3a0	mov x1,x21
009eb3a4	bl 0x00c300b0
009eb3a8	cbz w0,0x009eb0e4
009eb3ac	bl 0x00c342a0
009eb3b0	adrp x0,0x2bd000
009eb3b4	adrp x2,0x2c3000
009eb3b8	add x0,x0,#0x74c
009eb3bc	add x2,x2,#0x66f
009eb3c0	mov w1,#0x692
009eb3c4	b 0x009eb520
009eb3c8	ldr x8,[x19, #0xa88]
009eb3cc	cbz x8,0x009eb3d8
009eb3d0	mov w8,#0x1
009eb3d4	str w8,[x19, #0xa74]
009eb3d8	ldr x8,[x19, #0x8]
009eb3dc	ldr x9,[x8, #0xc0]
009eb3e0	ldrb w9,[x9, #0x60]
009eb3e4	tbnz w9,#0x3,0x009eb3fc
009eb3e8	ldr w8,[x8]
009eb3ec	cmp w8,#0x304
009eb3f0	b.lt 0x009eb3fc
009eb3f4	cmp w8,#0x10, LSL #12
009eb3f8	b.ne 0x009eb408
009eb3fc	mov x0,x19
009eb400	bl 0x009ebcb4
009eb404	cbz w0,0x009eb4b4
009eb408	orr w8,wzr,#0x70
009eb40c	str w8,[sp, #0x18]
009eb410	ldr x8,[x19, #0x2e0]
009eb414	ldrb w8,[x8, #0x1c]
009eb418	tbz w8,#0x5,0x009eb478
009eb41c	ldr x8,[x19, #0xbd8]
009eb420	cbz x8,0x009eb478
009eb424	ldr x8,[x19, #0xbf0]
009eb428	cbz x8,0x009eb480
009eb42c	add x1,sp,#0x18
009eb430	mov x0,x19
009eb434	bl 0x00c36ac0
009eb438	tbnz w0,#0x1f,0x009eb4d0
009eb43c	cmp w0,#0x2
009eb440	b.ne 0x009eb478
009eb444	bl 0x00c342a0
009eb448	adrp x0,0x2bd000
009eb44c	adrp x2,0x2a3000
009eb450	add x0,x0,#0x74c
009eb454	add x2,x2,#0xde6
009eb458	mov w1,#0x4f4
009eb45c	bl 0x00c342b0
009eb460	ldr w1,[sp, #0x18]
009eb464	mov w8,#0xe2
009eb468	mov w9,#0xdf
009eb46c	cmp w1,#0x73
009eb470	csel w2,w9,w8,eq
009eb474	b 0x009eb4a4
009eb478	mov w0,#0x1
009eb47c	b 0x009eb4b4
009eb480	bl 0x00c342a0
009eb484	adrp x0,0x2bd000
009eb488	adrp x2,0x2a3000
009eb48c	add x0,x0,#0x74c
009eb490	add x2,x2,#0xde6
009eb494	mov w1,#0x4ea
009eb498	bl 0x00c342b0
009eb49c	mov w1,#0x73
009eb4a0	mov w2,#0xdf
009eb4a4	mov x0,x19
009eb4a8	mov x3,xzr
009eb4ac	bl 0x00c34410
009eb4b0	mov w0,wzr
009eb4b4	ldp x29,x30,[sp, #0x60]
009eb4b8	ldp x20,x19,[sp, #0x50]
009eb4bc	ldp x22,x21,[sp, #0x40]
009eb4c0	ldp x24,x23,[sp, #0x30]
009eb4c4	ldr x25,[sp, #0x20]
009eb4c8	add sp,sp,#0x70
009eb4cc	ret
009eb4d0	mov w8,#0x4
009eb4d4	str w8,[x19, #0x28]
009eb4d8	mov w0,#0x5
009eb4dc	b 0x009eb4b4
009eb4e0	bl 0x00c342a0
009eb4e4	adrp x0,0x2bd000
009eb4e8	adrp x2,0x2d3000
009eb4ec	add x0,x0,#0x74c
009eb4f0	add x2,x2,#0x86b
009eb4f4	mov w1,#0x82f
009eb4f8	bl 0x00c342b0
009eb4fc	mov w1,#0x50
009eb500	mov w2,#0xe2
009eb504	b 0x009eb4a4
009eb508	bl 0x00c342a0
009eb50c	adrp x0,0x2bd000
009eb510	adrp x2,0x2c3000
009eb514	add x0,x0,#0x74c
009eb518	add x2,x2,#0x66f
009eb51c	mov w1,#0x68a
009eb520	bl 0x00c342b0
009eb524	mov w1,#0x28
009eb528	mov w2,#0x134
009eb52c	b 0x009eaeec
009eb530	ldr x8,[x19, #0x918]
009eb534	ldr w0,[x8, #0x2b0]
009eb538	cbz w0,0x009eafb8
009eb53c	str wzr,[x19, #0xa98]
009eb540	b 0x009eafb8
009eb544	ldr x8,[x20, #0x168]
009eb548	cbz x8,0x009eb568
009eb54c	mov x9,xzr
009eb550	add x10,x20,#0x170
009eb554	ldrb w11,[x10, x9]
009eb558	cbz w11,0x009eb618
009eb55c	add x9,x9,#0x1
009eb560	cmp x9,x8
009eb564	b.cc 0x009eb554
009eb568	bl 0x00c342a0
009eb56c	adrp x0,0x2bd000
009eb570	adrp x2,0x2c3000
009eb574	add x0,x0,#0x74c
009eb578	add x2,x2,#0x66f
009eb57c	mov w1,#0x73e
009eb580	bl 0x00c342b0
009eb584	mov w1,#0x32
009eb588	mov w2,#0xbb
009eb58c	b 0x009eaeec
009eb590	ldr w8,[x19, #0x3c]
009eb594	cbz w8,0x009eb5a0
009eb598	ldrb w8,[x19, #0x9ea]
009eb59c	tbnz w8,#0x0,0x009eb298
009eb5a0	mov x0,x19
009eb5a4	mov x1,x20
009eb5a8	bl 0x00c36100
009eb5ac	cmn w0,#0x1
009eb5b0	b.eq 0x009eaef8
009eb5b4	cmp w0,#0x1
009eb5b8	b.ne 0x009eb298
009eb5bc	mov w8,#0x1
009eb5c0	str w8,[x19, #0x4d0]
009eb5c4	b 0x009eb2a8
009eb5c8	bl 0x00c342a0
009eb5cc	adrp x0,0x2bd000
009eb5d0	adrp x2,0x2c3000
009eb5d4	add x0,x0,#0x74c
009eb5d8	add x2,x2,#0x66f
009eb5dc	mov w1,#0x6b4
009eb5e0	bl 0x00c342b0
009eb5e4	mov w1,#0x28
009eb5e8	mov w2,#0x159
009eb5ec	b 0x009eaeec
009eb5f0	bl 0x00c342a0
009eb5f4	adrp x0,0x2bd000
009eb5f8	adrp x2,0x2c3000
009eb5fc	add x0,x0,#0x74c
009eb600	add x2,x2,#0x66f
009eb604	mov w1,#0x6ce
009eb608	bl 0x00c342b0
009eb60c	mov w1,#0x28
009eb610	mov w2,#0xc1
009eb614	b 0x009eaeec
009eb618	ldrb w8,[x19, #0x9e8]
009eb61c	tbz w8,#0x6,0x009eb718
009eb620	ldr x8,[x20, #0x278]
009eb624	cmp x8,#0x4
009eb628	b.cc 0x009eb718
009eb62c	and x9,x8,#-0x2
009eb630	cmp x9,#0x4
009eb634	b.eq 0x009eb718
009eb638	ldr x22,[x20, #0x270]
009eb63c	sub x8,x8,#0x6
009eb640	ldrb w9,[x22, #0x4]
009eb644	ldrb w23,[x22, #0x5]
009eb648	bfm x23,x9,#0x38,#0x7
009eb64c	subs x21,x8,x23
009eb650	b.cc 0x009eb718
009eb654	ldrb w8,[x22, #0x2]
009eb658	ldrb w9,[x22, #0x3]
009eb65c	bfm w9,w8,#0x18,#0x7
009eb660	cbnz w9,0x009eb718
009eb664	mov x0,x19
009eb668	bl 0x00c35a10
009eb66c	and w8,w0,#0xffffff00
009eb670	cmp w8,#0x300
009eb674	b.ne 0x009eb6e4
009eb678	mov x0,x19
009eb67c	bl 0x00c35a10
009eb680	cmp w0,#0x302
009eb684	mov w8,#0x12
009eb688	mov w9,#0x22
009eb68c	csel x8,x9,x8,gt
009eb690	b 0x009eb6e8
009eb694	bl 0x00c342a0
009eb698	adrp x0,0x2bd000
009eb69c	adrp x2,0x2c3000
009eb6a0	add x0,x0,#0x74c
009eb6a4	add x2,x2,#0x66f
009eb6a8	mov w1,#0x6c2
009eb6ac	bl 0x00c342b0
009eb6b0	mov w1,#0x56
009eb6b4	mov w2,#0x175
009eb6b8	b 0x009eaeec
009eb6bc	bl 0x00c342a0
009eb6c0	adrp x0,0x2bd000
009eb6c4	adrp x2,0x2c3000
009eb6c8	add x0,x0,#0x74c
009eb6cc	add x2,x2,#0x66f
009eb6d0	mov w1,#0x6d8
009eb6d4	bl 0x00c342b0
009eb6d8	mov w1,#0x2f
009eb6dc	mov w2,#0xba
009eb6e0	b 0x009eaeec
009eb6e4	mov w8,#0x12
009eb6e8	cmp x21,x8
009eb6ec	mov w8,wzr
009eb6f0	b.ne 0x009eb714
009eb6f4	add x8,x22,x23
009eb6f8	adrp x1,0x74d000
009eb6fc	add x0,x8,#0x6
009eb700	add x1,x1,#0xd2c
009eb704	mov x2,x21
009eb708	bl 0x00c362f0
009eb70c	cmp w0,#0x0
009eb710	cset w8,eq
009eb714	strb w8,[x19, #0x4ac]
009eb718	ldr x2,[x20, #0x288]
009eb71c	mov w1,#0x80
009eb720	mov w5,#0x1
009eb724	mov x0,x19
009eb728	mov x3,xzr
009eb72c	mov x4,xzr
009eb730	bl 0x00c36e70
009eb734	cbz w0,0x009eaef8
009eb738	ldr w4,[sp, #0x28]
009eb73c	add x2,x19,#0x140
009eb740	mov w1,#0x1
009eb744	mov w3,#0x20
009eb748	mov x0,x19
009eb74c	bl 0x00c34990
009eb750	cmp w0,#0x0
009eb754	b.le 0x009eb928
009eb758	ldr w8,[x19, #0x4d0]
009eb75c	cbnz w8,0x009eb854
009eb760	ldr w8,[x19]
009eb764	cmp w8,#0x301
009eb768	b.lt 0x009eb854
009eb76c	ldr x8,[x19, #0x8]
009eb770	ldr x9,[x8, #0xc0]
009eb774	ldrb w9,[x9, #0x60]
009eb778	tbnz w9,#0x3,0x009eb854
009eb77c	ldr w8,[x8]
009eb780	cmp w8,#0x304
009eb784	b.lt 0x009eb790
009eb788	cmp w8,#0x10, LSL #12
009eb78c	b.ne 0x009eb854
009eb790	ldr x8,[x19, #0xaf8]
009eb794	cbz x8,0x009eb854
009eb798	mov w9,#0x200
009eb79c	str xzr,[sp, #0x8]
009eb7a0	str w9,[sp, #0x4]
009eb7a4	ldr x9,[x19, #0x918]
009eb7a8	ldr x3,[sp, #0x18]
009eb7ac	ldr x5,[x19, #0xb00]
009eb7b0	add x2,sp,#0x4
009eb7b4	add x1,x9,#0x50
009eb7b8	add x4,sp,#0x8
009eb7bc	mov x0,x19
009eb7c0	blr x8
009eb7c4	cbz w0,0x009eb854
009eb7c8	ldr w9,[sp, #0x4]
009eb7cc	cmp w9,#0x1
009eb7d0	b.lt 0x009eb854
009eb7d4	ldr x8,[x19, #0x918]
009eb7d8	sxtw x9,w9
009eb7dc	mov w10,#0x1
009eb7e0	str x9,[x8, #0x8]
009eb7e4	str w10,[x19, #0x4d0]
009eb7e8	ldr x21,[sp, #0x18]
009eb7ec	str x21,[x19, #0x520]
009eb7f0	str xzr,[x8, #0x2c8]
009eb7f4	ldr x0,[sp, #0x8]
009eb7f8	str xzr,[sp, #0x18]
009eb7fc	cbnz x0,0x009eb824
009eb800	mov x0,x19
009eb804	bl 0x00c35380
009eb808	mov x2,x0
009eb80c	mov x0,x19
009eb810	mov x1,x21
009eb814	bl 0x00c34840
009eb818	str x0,[sp, #0x8]
009eb81c	cbz x0,0x009ebba8
009eb820	ldr x8,[x19, #0x918]
009eb824	str x0,[x8, #0x2f8]
009eb828	ldr x0,[x19, #0x528]
009eb82c	bl 0x00c34770
009eb830	ldr x0,[x19, #0x520]
009eb834	bl 0x00c35330
009eb838	ldr x8,[x19, #0x530]
009eb83c	str x0,[x19, #0x528]
009eb840	mov x0,x8
009eb844	bl 0x00c34770
009eb848	ldr x0,[x19, #0x520]
009eb84c	bl 0x00c35330
009eb850	str x0,[x19, #0x530]
009eb854	ldr x8,[x19, #0x8]
009eb858	str xzr,[x19, #0x340]
009eb85c	ldr x9,[x8, #0xc0]
009eb860	ldr w9,[x9, #0x60]
009eb864	tbnz w9,#0x3,0x009eb8b0
009eb868	ldr w10,[x8]
009eb86c	cmp w10,#0x304
009eb870	b.lt 0x009eb8b0
009eb874	cmp w10,#0x10, LSL #12
009eb878	b.eq 0x009eb8b0
009eb87c	ldr x8,[x20, #0x168]
009eb880	mov x21,xzr
009eb884	cmp x8,#0x1
009eb888	b.eq 0x009ebad4
009eb88c	bl 0x00c342a0
009eb890	adrp x0,0x2bd000
009eb894	adrp x2,0x2c3000
009eb898	add x0,x0,#0x74c
009eb89c	add x2,x2,#0x66f
009eb8a0	mov w1,#0x793
009eb8a4	bl 0x00c342b0
009eb8a8	mov w1,#0x2f
009eb8ac	b 0x009ebaa8
009eb8b0	ldr x10,[x19, #0x918]
009eb8b4	ldr w23,[x10, #0x2f4]
009eb8b8	cbz w23,0x009eb954
009eb8bc	mov x0,x19
009eb8c0	bl 0x00c36d10
009eb8c4	cbz w0,0x009eb968
009eb8c8	ldr x8,[x19, #0x9a8]
009eb8cc	ldr x0,[x8, #0x118]
009eb8d0	bl 0x00c325e0
009eb8d4	cmp w0,#0x1
009eb8d8	b.lt 0x009eb990
009eb8dc	mov w21,wzr
009eb8e0	ldr x8,[x19, #0x9a8]
009eb8e4	mov w1,w21
009eb8e8	ldr x0,[x8, #0x118]
009eb8ec	bl 0x00c32610
009eb8f0	ldr w8,[x0]
009eb8f4	mov x22,x0
009eb8f8	cmp w23,w8
009eb8fc	b.eq 0x009eba7c
009eb900	ldr x8,[x19, #0x9a8]
009eb904	add w21,w21,#0x1
009eb908	ldr x0,[x8, #0x118]
009eb90c	bl 0x00c325e0
009eb910	cmp w21,w0
009eb914	b.lt 0x009eb8e0
009eb918	mov x21,x22
009eb91c	ldr x22,[x19, #0x340]
009eb920	cbnz x22,0x009eb99c
009eb924	b 0x009eba88
009eb928	bl 0x00c342a0
009eb92c	adrp x0,0x2bd000
009eb930	adrp x2,0x2c3000
009eb934	add x0,x0,#0x74c
009eb938	add x2,x2,#0x66f
009eb93c	mov w1,#0x756
009eb940	bl 0x00c342b0
009eb944	mov w2,#0x103
009eb948	mov w1,#0x50
009eb94c	movk w2,#0xc, LSL #16
009eb950	b 0x009eaeec
009eb954	ldr w10,[x19, #0x4d0]
009eb958	cbz w10,0x009eb9f4
009eb95c	mov x21,xzr
009eb960	tbz w9,#0x3,0x009ebaec
009eb964	b 0x009ebb60
009eb968	bl 0x00c342a0
009eb96c	adrp x0,0x2bd000
009eb970	adrp x2,0x2c3000
009eb974	add x0,x0,#0x74c
009eb978	add x2,x2,#0x66f
009eb97c	mov w1,#0x7a0
009eb980	bl 0x00c342b0
009eb984	mov w1,#0x28
009eb988	mov w2,#0x154
009eb98c	b 0x009eaeec
009eb990	mov x21,xzr
009eb994	ldr x22,[x19, #0x340]
009eb998	cbz x22,0x009eba88
009eb99c	ldr x8,[x20, #0x168]
009eb9a0	cbz x8,0x009eb9cc
009eb9a4	mov x10,xzr
009eb9a8	mov w9,#0x1
009eb9ac	add x10,x20,x10
009eb9b0	ldrb w10,[x10, #0x170]
009eb9b4	cmp w23,w10
009eb9b8	b.eq 0x009ebad4
009eb9bc	mov w10,w9
009eb9c0	cmp x8,x10
009eb9c4	add w9,w9,#0x1
009eb9c8	b.hi 0x009eb9ac
009eb9cc	bl 0x00c342a0
009eb9d0	adrp x0,0x2bd000
009eb9d4	adrp x2,0x2c3000
009eb9d8	add x0,x0,#0x74c
009eb9dc	add x2,x2,#0x66f
009eb9e0	mov w1,#0x7b7
009eb9e4	bl 0x00c342b0
009eb9e8	mov w1,#0x2f
009eb9ec	mov w2,#0x156
009eb9f0	b 0x009eaeec
009eb9f4	mov x0,x19
009eb9f8	bl 0x00c36d10
009eb9fc	cbz w0,0x009ebab0
009eba00	ldr x8,[x19, #0x9a8]
009eba04	ldr x0,[x8, #0x118]
009eba08	cbz x0,0x009ebab0
009eba0c	bl 0x00c325e0
009eba10	cmp w0,#0x1
009eba14	b.lt 0x009ebad0
009eba18	mov w22,w0
009eba1c	mov w23,wzr
009eba20	ldr x8,[x19, #0x9a8]
009eba24	mov w1,w23
009eba28	ldr x0,[x8, #0x118]
009eba2c	bl 0x00c32610
009eba30	ldr x8,[x20, #0x168]
009eba34	cbz x8,0x009eba68
009eba38	ldr w9,[x0]
009eba3c	mov x21,x0
009eba40	mov x11,xzr
009eba44	mov w10,#0x1
009eba48	add x11,x20,x11
009eba4c	ldrb w11,[x11, #0x170]
009eba50	cmp w9,w11
009eba54	b.eq 0x009ebac0
009eba58	mov w11,w10
009eba5c	cmp x8,x11
009eba60	add w10,w10,#0x1
009eba64	b.hi 0x009eba48
009eba68	add w23,w23,#0x1
009eba6c	cmp w23,w22
009eba70	mov x21,xzr
009eba74	b.lt 0x009eba20
009eba78	b 0x009ebad4
009eba7c	str x22,[x19, #0x340]
009eba80	mov x21,x22
009eba84	cbnz x22,0x009eb99c
009eba88	bl 0x00c342a0
009eba8c	adrp x0,0x2bd000
009eba90	adrp x2,0x2c3000
009eba94	add x0,x0,#0x74c
009eba98	add x2,x2,#0x66f
009eba9c	mov w1,#0x7ad
009ebaa0	bl 0x00c342b0
009ebaa4	mov w1,#0x28
009ebaa8	mov w2,#0x155
009ebaac	b 0x009eaeec
009ebab0	mov x21,xzr
009ebab4	ldr w8,[x19, #0x4d0]
009ebab8	cbnz w8,0x009ebadc
009ebabc	b 0x009ebb00
009ebac0	str x21,[x19, #0x340]
009ebac4	ldr w8,[x19, #0x4d0]
009ebac8	cbnz w8,0x009ebadc
009ebacc	b 0x009ebb00
009ebad0	mov x21,xzr
009ebad4	ldr w8,[x19, #0x4d0]
009ebad8	cbz w8,0x009ebb00
009ebadc	ldr x8,[x19, #0x8]
009ebae0	ldr x9,[x8, #0xc0]
009ebae4	ldr w9,[x9, #0x60]
009ebae8	tbnz w9,#0x3,0x009ebb60
009ebaec	ldr w8,[x8]
009ebaf0	cmp w8,#0x304
009ebaf4	b.lt 0x009ebb60
009ebaf8	cmp w8,#0x10, LSL #12
009ebafc	b.eq 0x009ebb60
009ebb00	ldr x0,[x19, #0x520]
009ebb04	bl 0x00c34770
009ebb08	ldr x8,[sp, #0x18]
009ebb0c	str x8,[x19, #0x520]
009ebb10	cbz x8,0x009ebb2c
009ebb14	str xzr,[sp, #0x18]
009ebb18	ldr w8,[x19, #0x4d0]
009ebb1c	cbnz w8,0x009ebb60
009ebb20	cbz x21,0x009ebb48
009ebb24	ldr w8,[x21]
009ebb28	b 0x009ebb4c
009ebb2c	bl 0x00c342a0
009ebb30	adrp x0,0x2bd000
009ebb34	adrp x2,0x2c3000
009ebb38	add x0,x0,#0x74c
009ebb3c	add x2,x2,#0x66f
009ebb40	mov w1,#0x7e6
009ebb44	b 0x009eb940
009ebb48	mov w8,wzr
009ebb4c	ldr x9,[x19, #0x918]
009ebb50	mov x0,x19
009ebb54	str w8,[x9, #0x2f4]
009ebb58	bl 0x00c367a0
009ebb5c	cbz w0,0x009eaef8
009ebb60	ldr x0,[sp, #0x18]
009ebb64	bl 0x00c34770
009ebb68	ldr x0,[sp, #0x10]
009ebb6c	bl 0x00c34770
009ebb70	ldr x0,[x20, #0x288]
009ebb74	adrp x20,0x2bd000
009ebb78	add x20,x20,#0x74c
009ebb7c	mov w2,#0x7fa
009ebb80	mov x1,x20
009ebb84	bl 0x00c32310
009ebb88	ldr x0,[x19, #0xb58]
009ebb8c	mov w2,#0x7fb
009ebb90	mov x1,x20
009ebb94	bl 0x00c32310
009ebb98	mov w8,#0x1
009ebb9c	str xzr,[x19, #0xb58]
009ebba0	cbnz w8,0x009ead08
009ebba4	b 0x009eb4b0
009ebba8	bl 0x00c342a0
009ebbac	adrp x0,0x2bd000
009ebbb0	adrp x2,0x2c3000
009ebbb4	add x0,x0,#0x74c
009ebbb8	add x2,x2,#0x66f
009ebbbc	mov w1,#0x779
009ebbc0	b 0x009eb608

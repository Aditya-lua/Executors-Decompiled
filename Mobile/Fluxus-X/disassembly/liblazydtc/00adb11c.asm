; ossl_rsa_fips186_4_gen_prob_primes @ 00adb11c
00adb11c	sub sp,sp,#0x80
00adb120	cmp w2,#0x7ff
00adb124	str x27,[sp, #0x20]
00adb128	stp x26,x25,[sp, #0x30]
00adb12c	stp x24,x23,[sp, #0x40]
00adb130	stp x22,x21,[sp, #0x50]
00adb134	stp x20,x19,[sp, #0x60]
00adb138	stp x29,x30,[sp, #0x70]
00adb13c	add x29,sp,#0x70
00adb140	b.gt 0x00adb16c
00adb144	bl 0x00c342a0
00adb148	adrp x0,0x2aa000
00adb14c	adrp x2,0x2ac000
00adb150	add x0,x0,#0x974
00adb154	add x2,x2,#0x7bf
00adb158	mov w1,#0x5c
00adb15c	bl 0x00c342b0
00adb160	mov w0,#0x4
00adb164	orr w1,wzr,#0x78
00adb168	b 0x00adb300
00adb16c	mov x25,x0
00adb170	mov x0,x3
00adb174	mov x23,x5
00adb178	mov x19,x4
00adb17c	mov x24,x3
00adb180	mov w26,w2
00adb184	bl 0x00c40040
00adb188	cbz w0,0x00adb2dc
00adb18c	mov x0,x19
00adb190	bl 0x00c38a90
00adb194	mov x0,x19
00adb198	bl 0x00c38a40
00adb19c	mov x20,x0
00adb1a0	mov x0,x19
00adb1a4	bl 0x00c38a40
00adb1a8	mov x22,x0
00adb1ac	mov x0,x19
00adb1b0	bl 0x00c38a40
00adb1b4	mov x21,x0
00adb1b8	cbz x20,0x00adb334
00adb1bc	cbz x22,0x00adb340
00adb1c0	mov w27,wzr
00adb1c4	cbz x21,0x00adb344
00adb1c8	mov w1,#0x4
00adb1cc	mov x0,x22
00adb1d0	bl 0x00c38dc0
00adb1d4	mov w1,#0x4
00adb1d8	mov x0,x21
00adb1dc	bl 0x00c38dc0
00adb1e0	ldr x8,[x25, #0x40]
00adb1e4	cbz x8,0x00adb310
00adb1e8	ldr x0,[x25, #0x48]
00adb1ec	cbz x0,0x00adb324
00adb1f0	cbz x8,0x00adb334
00adb1f4	mov w27,wzr
00adb1f8	cbz x0,0x00adb344
00adb1fc	mov w1,#0x4
00adb200	mov x0,x8
00adb204	bl 0x00c38dc0
00adb208	ldr x0,[x25, #0x48]
00adb20c	mov w1,#0x4
00adb210	bl 0x00c38dc0
00adb214	ldr x0,[x25, #0x40]
00adb218	mov x1,x22
00adb21c	mov x2,xzr
00adb220	mov x3,xzr
00adb224	mov x4,xzr
00adb228	mov x5,xzr
00adb22c	mov x6,xzr
00adb230	mov w7,w26
00adb234	stp x19,x23,[sp, #0x8]
00adb238	str x24,[sp]
00adb23c	bl 0x00c391e0
00adb240	cbz w0,0x00adb334
00adb244	ldr x0,[x25, #0x48]
00adb248	mov x1,x21
00adb24c	mov x2,xzr
00adb250	mov x3,xzr
00adb254	mov x4,xzr
00adb258	mov x5,xzr
00adb25c	mov x6,xzr
00adb260	mov w7,w26
00adb264	stp x19,x23,[sp, #0x8]
00adb268	str x24,[sp]
00adb26c	bl 0x00c391e0
00adb270	cbz w0,0x00adb334
00adb274	mov x0,x20
00adb278	mov x1,x22
00adb27c	mov x2,x21
00adb280	mov w3,w26
00adb284	bl 0x00c40070
00adb288	tbnz w0,#0x1f,0x00adb334
00adb28c	cbz w0,0x00adb2a8
00adb290	ldp x1,x2,[x25, #0x40]
00adb294	mov x0,x20
00adb298	mov w3,w26
00adb29c	bl 0x00c40070
00adb2a0	tbnz w0,#0x1f,0x00adb334
00adb2a4	cbnz w0,0x00adb390
00adb2a8	ldr x0,[x25, #0x48]
00adb2ac	mov x1,x21
00adb2b0	mov x2,xzr
00adb2b4	mov x3,xzr
00adb2b8	mov x4,xzr
00adb2bc	mov x5,xzr
00adb2c0	mov x6,xzr
00adb2c4	mov w7,w26
00adb2c8	stp x19,x23,[sp, #0x8]
00adb2cc	str x24,[sp]
00adb2d0	bl 0x00c391e0
00adb2d4	cbnz w0,0x00adb274
00adb2d8	b 0x00adb334
00adb2dc	bl 0x00c342a0
00adb2e0	adrp x0,0x2aa000
00adb2e4	adrp x2,0x2ac000
00adb2e8	add x0,x0,#0x974
00adb2ec	add x2,x2,#0x7bf
00adb2f0	mov w1,#0x61
00adb2f4	bl 0x00c342b0
00adb2f8	mov w0,#0x4
00adb2fc	mov w1,#0xb2
00adb300	mov x2,xzr
00adb304	bl 0x00c342c0
00adb308	mov w27,wzr
00adb30c	b 0x00adb36c
00adb310	bl 0x00c38d90
00adb314	mov x8,x0
00adb318	str x0,[x25, #0x40]
00adb31c	ldr x0,[x25, #0x48]
00adb320	cbnz x0,0x00adb1f0
00adb324	bl 0x00c38d90
00adb328	ldr x8,[x25, #0x40]
00adb32c	str x0,[x25, #0x48]
00adb330	cbnz x8,0x00adb1f4
00adb334	mov w27,wzr
00adb338	cbnz x22,0x00adb348
00adb33c	b 0x00adb350
00adb340	mov w27,wzr
00adb344	cbz x22,0x00adb350
00adb348	mov x0,x22
00adb34c	bl 0x00c38ca0
00adb350	cbz x21,0x00adb35c
00adb354	mov x0,x21
00adb358	bl 0x00c38ca0
00adb35c	mov x0,x20
00adb360	bl 0x00c38ca0
00adb364	mov x0,x19
00adb368	bl 0x00c38a20
00adb36c	mov w0,w27
00adb370	ldp x29,x30,[sp, #0x70]
00adb374	ldp x20,x19,[sp, #0x60]
00adb378	ldp x22,x21,[sp, #0x50]
00adb37c	ldp x24,x23,[sp, #0x40]
00adb380	ldp x26,x25,[sp, #0x30]
00adb384	ldr x27,[sp, #0x20]
00adb388	add sp,sp,#0x80
00adb38c	ret
00adb390	ldr w8,[x25, #0xd8]
00adb394	mov w27,#0x1
00adb398	add w8,w8,#0x1
00adb39c	str w8,[x25, #0xd8]
00adb3a0	cbnz x22,0x00adb348
00adb3a4	b 0x00adb350

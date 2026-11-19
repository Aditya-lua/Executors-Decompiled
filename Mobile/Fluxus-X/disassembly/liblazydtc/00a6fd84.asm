; FUN_00a6fd84 @ 00a6fd84
00a6fd84	sub sp,sp,#0x80
00a6fd88	stp x26,x25,[sp, #0x30]
00a6fd8c	stp x24,x23,[sp, #0x40]
00a6fd90	stp x22,x21,[sp, #0x50]
00a6fd94	stp x20,x19,[sp, #0x60]
00a6fd98	stp x29,x30,[sp, #0x70]
00a6fd9c	add x29,sp,#0x70
00a6fda0	mov x20,x2
00a6fda4	mov x21,x1
00a6fda8	mov w22,w0
00a6fdac	bl 0x00a70a34
00a6fdb0	mov w19,w0
00a6fdb4	cmp w0,#0x1
00a6fdb8	b.lt 0x00a70098
00a6fdbc	cmp w22,#0x8
00a6fdc0	b.hi 0x00a6feb4
00a6fdc4	adrp x9,0x766000
00a6fdc8	mov w8,w22
00a6fdcc	add x9,x9,#0x4c0
00a6fdd0	ldrsw x8,[x9, x8, LSL #0x2]
00a6fdd4	add x8,x8,x9
00a6fdd8	br x8
00a6fddc	ldr w19,[x20, #0x1c]
00a6fde0	cmp w22,#0x7
00a6fde4	b.ne 0x00a6ff88
00a6fde8	ldr w8,[x20, #0x8]
00a6fdec	cmp w8,#0x1
00a6fdf0	b.eq 0x00a6ffb4
00a6fdf4	cmp w8,#0x2
00a6fdf8	b.ne 0x00a70098
00a6fdfc	ldr w8,[x21, #0x30]
00a6fe00	sub w8,w8,#0x1
00a6fe04	cmp w8,#0x6
00a6fe08	b.hi 0x00a70150
00a6fe0c	adrp x9,0x766000
00a6fe10	add x9,x9,#0x500
00a6fe14	ldrsw x8,[x9, x8, LSL #0x2]
00a6fe18	add x8,x8,x9
00a6fe1c	br x8
00a6fe20	ldr x0,[x20, #0x30]
00a6fe24	add x1,x20,#0x1c
00a6fe28	ldp x29,x30,[sp, #0x70]
00a6fe2c	ldp x20,x19,[sp, #0x60]
00a6fe30	ldp x22,x21,[sp, #0x50]
00a6fe34	ldp x24,x23,[sp, #0x40]
00a6fe38	ldp x26,x25,[sp, #0x30]
00a6fe3c	add sp,sp,#0x80
00a6fe40	b 0x00c36510
00a6fe44	ldr w8,[x20, #0x8]
00a6fe48	cbz w8,0x00a70058
00a6fe4c	ldr w9,[x21, #0xc]
00a6fe50	cbz w9,0x00a703c0
00a6fe54	ldr x9,[x20]
00a6fe58	ldr w10,[x9]
00a6fe5c	cmp w10,#0x7f
00a6fe60	b.le 0x00a700b8
00a6fe64	cmp w10,#0x3ff
00a6fe68	b.le 0x00a70250
00a6fe6c	cmp w10,#0xfff
00a6fe70	b.gt 0x00a70294
00a6fe74	cmp w10,#0x400
00a6fe78	b.eq 0x00a70268
00a6fe7c	cmp w10,#0x800
00a6fe80	b.eq 0x00a703b8
00a6fe84	b 0x00a703c0
00a6fe88	ldr w8,[x20, #0x8]
00a6fe8c	cmp w8,#0x1
00a6fe90	b.ne 0x00a70098
00a6fe94	ldr w8,[x21, #0x30]
00a6fe98	and w8,w8,#0xfffffffc
00a6fe9c	cmp w8,#0x4
00a6fea0	b.ne 0x00a70098
00a6fea4	ldr x8,[x20, #0x30]
00a6fea8	ldr x8,[x8, #0x20]
00a6feac	str w8,[x20, #0x1c]
00a6feb0	b 0x00a70098
00a6feb4	bl 0x00c342a0
00a6feb8	adrp x0,0x2b9000
00a6febc	adrp x2,0x2c1000
00a6fec0	add x0,x0,#0xe99
00a6fec4	add x2,x2,#0xd0c
00a6fec8	mov w1,#0x18c
00a6fecc	bl 0x00c342b0
00a6fed0	ldr w3,[x20, #0x8]
00a6fed4	mov w8,#0x103
00a6fed8	movk w8,#0xc, LSL #16
00a6fedc	adrp x2,0x29e000
00a6fee0	sub w1,w8,#0x2
00a6fee4	add x2,x2,#0x1ec
00a6fee8	orr w0,wzr,#0x6
00a6feec	mov w4,w22
00a6fef0	b 0x00a70090
00a6fef4	ldr x22,[x20, #0x10]
00a6fef8	ldr x23,[x20, #0x20]
00a6fefc	str wzr,[sp, #0x8]
00a6ff00	ldr w8,[x20, #0x8]
00a6ff04	cmp w8,#0x2
00a6ff08	b.ne 0x00a6ffcc
00a6ff0c	mov x24,x22
00a6ff10	cbz x21,0x00a70004
00a6ff14	ldr x24,[x21, #0x28]
00a6ff18	ldr w8,[x20, #0x18]
00a6ff1c	str x24,[x20, #0x10]
00a6ff20	cbz w8,0x00a70004
00a6ff24	mov w8,#0x6568
00a6ff28	movk w8,#0x78, LSL #16
00a6ff2c	mov x21,x20
00a6ff30	str w8,[x21, #0x40]!
00a6ff34	mov w2,#0x32
00a6ff38	mov x0,x21
00a6ff3c	mov x1,x24
00a6ff40	bl 0x00c395d0
00a6ff44	cmp x0,#0x3
00a6ff48	mov x24,x21
00a6ff4c	b.hi 0x00a70004
00a6ff50	bl 0x00c342a0
00a6ff54	adrp x0,0x2b9000
00a6ff58	adrp x2,0x2c1000
00a6ff5c	add x0,x0,#0xe99
00a6ff60	add x2,x2,#0xd0c
00a6ff64	mov w1,#0x237
00a6ff68	bl 0x00c342b0
00a6ff6c	mov w1,#0x103
00a6ff70	orr w0,wzr,#0x6
00a6ff74	movk w1,#0xc, LSL #16
00a6ff78	mov x2,xzr
00a6ff7c	bl 0x00c342c0
00a6ff80	mov w19,#0xffffffff
00a6ff84	b 0x00a70098
00a6ff88	orr w8,w22,#0x8
00a6ff8c	cmp w8,#0x8
00a6ff90	b.ne 0x00a70098
00a6ff94	ldr w8,[x20, #0x8]
00a6ff98	cmp w8,#0x1
00a6ff9c	b.ne 0x00a70098
00a6ffa0	ldr w8,[x21, #0x30]
00a6ffa4	cbz w22,0x00a701f4
00a6ffa8	sxtw x2,w19
00a6ffac	cbnz w8,0x00a7020c
00a6ffb0	b 0x00a701fc
00a6ffb4	ldr w8,[x21, #0x30]
00a6ffb8	cmp w8,#0x7
00a6ffbc	b.ne 0x00a70098
00a6ffc0	add x8,x20,#0x80
00a6ffc4	str x8,[x20, #0x20]
00a6ffc8	b 0x00a70098
00a6ffcc	bl 0x00c342a0
00a6ffd0	adrp x0,0x2b9000
00a6ffd4	adrp x2,0x2c1000
00a6ffd8	add x0,x0,#0xe99
00a6ffdc	add x2,x2,#0xd0c
00a6ffe0	mov w1,#0x226
00a6ffe4	bl 0x00c342b0
00a6ffe8	ldr w3,[x20, #0x8]
00a6ffec	adrp x2,0x2bf000
00a6fff0	add x2,x2,#0xd51
00a6fff4	orr w0,wzr,#0x6
00a6fff8	mov w1,#0x93
00a6fffc	mov w4,#0x4
00a70000	b 0x00a70090
00a70004	ldr x0,[x20]
00a70008	bl 0x00c3da40
00a7000c	ldr x25,[x20, #0x20]
00a70010	ldr x21,[x20, #0x30]
00a70014	mov x26,x0
00a70018	mov x0,x25
00a7001c	bl 0x00c2ff50
00a70020	mov x4,x0
00a70024	add x5,sp,#0x8
00a70028	mov x0,x21
00a7002c	mov x1,x26
00a70030	mov x2,x24
00a70034	mov x3,x25
00a70038	bl 0x00c3da50
00a7003c	cbz w0,0x00a700e4
00a70040	ldr x8,[x20, #0x30]
00a70044	ldr x9,[x8, #0x10]
00a70048	str x9,[x20, #0x78]
00a7004c	ldr x8,[x8, #0x18]
00a70050	str x8,[x20, #0x88]
00a70054	b 0x00a70098
00a70058	bl 0x00c342a0
00a7005c	adrp x0,0x2b9000
00a70060	adrp x2,0x2c1000
00a70064	add x0,x0,#0xe99
00a70068	add x2,x2,#0xd0c
00a7006c	mov w1,#0x19d
00a70070	bl 0x00c342b0
00a70074	ldr w3,[x20, #0x8]
00a70078	adrp x2,0x29e000
00a7007c	add x2,x2,#0x1ec
00a70080	mov w1,#0x10c
00a70084	orr w0,wzr,#0x6
00a70088	movk w1,#0x8, LSL #16
00a7008c	mov w4,#0x1
00a70090	bl 0x00c342c0
00a70094	mov w19,wzr
00a70098	mov w0,w19
00a7009c	ldp x29,x30,[sp, #0x70]
00a700a0	ldp x20,x19,[sp, #0x60]
00a700a4	ldp x22,x21,[sp, #0x50]
00a700a8	ldp x24,x23,[sp, #0x40]
00a700ac	ldp x26,x25,[sp, #0x30]
00a700b0	add sp,sp,#0x80
00a700b4	ret
00a700b8	sub w11,w10,#0x2
00a700bc	cmp w11,#0x1e
00a700c0	b.hi 0x00a703b0
00a700c4	adrp x10,0x766000
00a700c8	add x10,x10,#0x51c
00a700cc	ldrsw x11,[x10, x11, LSL #0x2]
00a700d0	add x10,x11,x10
00a700d4	br x10
00a700d8	ldr x9,[x9, #0x28]
00a700dc	cbnz x9,0x00a703c0
00a700e0	b 0x00a703fc
00a700e4	ldr w8,[sp, #0x8]
00a700e8	mov w19,wzr
00a700ec	cbnz w8,0x00a70098
00a700f0	bl 0x00c342a0
00a700f4	adrp x0,0x2b9000
00a700f8	adrp x2,0x2c1000
00a700fc	add x0,x0,#0xe99
00a70100	add x2,x2,#0xd0c
00a70104	mov w1,#0x244
00a70108	bl 0x00c342b0
00a7010c	ldr w3,[x20, #0x8]
00a70110	adrp x2,0x2bd000
00a70114	add x2,x2,#0xb73
00a70118	orr w0,wzr,#0x6
00a7011c	mov w1,#0x93
00a70120	mov w4,#0x4
00a70124	mov x5,x22
00a70128	mov x6,x23
00a7012c	bl 0x00c342c0
00a70130	orr w19,wzr,#0xfffffffe
00a70134	b 0x00a70098
00a70138	ldr x1,[x20, #0x20]
00a7013c	ldr x0,[x20, #0x30]
00a70140	cbz x1,0x00a702c0
00a70144	bl 0x00c39d50
00a70148	cbnz w0,0x00a702cc
00a7014c	b 0x00a70094
00a70150	bl 0x00c342a0
00a70154	adrp x0,0x2b9000
00a70158	adrp x2,0x2c1000
00a7015c	add x0,x0,#0xe99
00a70160	add x2,x2,#0xd0c
00a70164	mov w1,#0x285
00a70168	bl 0x00c342b0
00a7016c	ldr w3,[x20, #0x8]
00a70170	ldr w5,[x21, #0x30]
00a70174	adrp x2,0x2c9000
00a70178	add x2,x2,#0xa09
00a7017c	b 0x00a70328
00a70180	ldp x2,x0,[x20, #0x28]
00a70184	ldr x1,[x20, #0x20]
00a70188	ldp x29,x30,[sp, #0x70]
00a7018c	ldp x20,x19,[sp, #0x60]
00a70190	ldp x22,x21,[sp, #0x50]
00a70194	ldp x24,x23,[sp, #0x40]
00a70198	ldp x26,x25,[sp, #0x30]
00a7019c	add sp,sp,#0x80
00a701a0	b 0x00c3b720
00a701a4	ldp x2,x0,[x20, #0x28]
00a701a8	add x1,x20,#0x20
00a701ac	add x3,x20,#0x1c
00a701b0	ldp x29,x30,[sp, #0x70]
00a701b4	ldp x20,x19,[sp, #0x60]
00a701b8	ldp x22,x21,[sp, #0x50]
00a701bc	ldp x24,x23,[sp, #0x40]
00a701c0	ldp x26,x25,[sp, #0x30]
00a701c4	add sp,sp,#0x80
00a701c8	b 0x00c3ace0
00a701cc	ldr x0,[x20, #0x30]
00a701d0	ldr x1,[x20, #0x20]
00a701d4	add x2,x20,#0x28
00a701d8	ldp x29,x30,[sp, #0x70]
00a701dc	ldp x20,x19,[sp, #0x60]
00a701e0	ldp x22,x21,[sp, #0x50]
00a701e4	ldp x24,x23,[sp, #0x40]
00a701e8	ldp x26,x25,[sp, #0x30]
00a701ec	add sp,sp,#0x80
00a701f0	b 0x00c3da70
00a701f4	ldr x2,[x20, #0x28]
00a701f8	cbnz w8,0x00a7020c
00a701fc	ldr x8,[x21, #0x38]
00a70200	cbz x8,0x00a70514
00a70204	ldr x8,[x20, #0x30]
00a70208	ldr w8,[x8, #0x8]
00a7020c	sub w8,w8,#0x1
00a70210	cmp w8,#0x6
00a70214	b.hi 0x00a702fc
00a70218	adrp x9,0x766000
00a7021c	add x9,x9,#0x4e4
00a70220	ldrsw x8,[x9, x8, LSL #0x2]
00a70224	add x8,x8,x9
00a70228	br x8
00a7022c	ldr x0,[x20, #0x30]
00a70230	mov w1,w19
00a70234	ldp x29,x30,[sp, #0x70]
00a70238	ldp x20,x19,[sp, #0x60]
00a7023c	ldp x22,x21,[sp, #0x50]
00a70240	ldp x24,x23,[sp, #0x40]
00a70244	ldp x26,x25,[sp, #0x30]
00a70248	add sp,sp,#0x80
00a7024c	b 0x00c3da90
00a70250	cmp w10,#0x80
00a70254	b.eq 0x00a703b8
00a70258	cmp w10,#0x100
00a7025c	b.eq 0x00a703b8
00a70260	cmp w10,#0x200
00a70264	b.ne 0x00a703c0
00a70268	ldr x11,[x9, #0x30]
00a7026c	cbz x11,0x00a703fc
00a70270	cmp w10,#0x7
00a70274	b.le 0x00a705a4
00a70278	cmp w10,#0x8
00a7027c	b.eq 0x00a700d8
00a70280	cmp w10,#0x2, LSL #12
00a70284	b.eq 0x00a702a4
00a70288	cmp w10,#0x1, LSL #12
00a7028c	b.eq 0x00a702a4
00a70290	b 0x00a703c0
00a70294	cmp w10,#0x1, LSL #12
00a70298	b.eq 0x00a702a4
00a7029c	cmp w10,#0x2, LSL #12
00a702a0	b.ne 0x00a703c0
00a702a4	ldr x11,[x9, #0x30]
00a702a8	cbz x11,0x00a703fc
00a702ac	cmp w10,#0x2
00a702b0	b.eq 0x00a700d8
00a702b4	cmp w10,#0x8
00a702b8	b.ne 0x00a705ac
00a702bc	b 0x00a700d8
00a702c0	add x1,x20,#0x1c
00a702c4	bl 0x00c36520
00a702c8	cbz w0,0x00a70094
00a702cc	mov w19,#0x1
00a702d0	b 0x00a70098
00a702d4	ldr x1,[x20, #0x20]
00a702d8	ldr x0,[x20, #0x30]
00a702dc	cbz x1,0x00a705b8
00a702e0	ldp x29,x30,[sp, #0x70]
00a702e4	ldp x20,x19,[sp, #0x60]
00a702e8	ldp x22,x21,[sp, #0x50]
00a702ec	ldp x24,x23,[sp, #0x40]
00a702f0	ldp x26,x25,[sp, #0x30]
00a702f4	add sp,sp,#0x80
00a702f8	b 0x00c3da80
00a702fc	bl 0x00c342a0
00a70300	adrp x0,0x2b9000
00a70304	adrp x2,0x2c1000
00a70308	add x0,x0,#0xe99
00a7030c	add x2,x2,#0xd0c
00a70310	mov w1,#0x2b3
00a70314	bl 0x00c342b0
00a70318	ldr w3,[x20, #0x8]
00a7031c	ldr w5,[x21, #0x30]
00a70320	adrp x2,0x2d1000
00a70324	add x2,x2,#0xa68
00a70328	mov w1,#0x10c
00a7032c	orr w0,wzr,#0x6
00a70330	movk w1,#0x8, LSL #16
00a70334	mov w4,w22
00a70338	bl 0x00c342c0
00a7033c	b 0x00a70094
00a70340	ldr x0,[x20, #0x30]
00a70344	ldr x1,[x20, #0x20]
00a70348	ldp x29,x30,[sp, #0x70]
00a7034c	ldp x20,x19,[sp, #0x60]
00a70350	ldp x22,x21,[sp, #0x50]
00a70354	ldp x24,x23,[sp, #0x40]
00a70358	ldp x26,x25,[sp, #0x30]
00a7035c	add sp,sp,#0x80
00a70360	b 0x00c3dad0
00a70364	ldr x0,[x20, #0x30]
00a70368	ldr x1,[x20, #0x20]
00a7036c	ldp x29,x30,[sp, #0x70]
00a70370	ldp x20,x19,[sp, #0x60]
00a70374	ldp x22,x21,[sp, #0x50]
00a70378	ldp x24,x23,[sp, #0x40]
00a7037c	ldp x26,x25,[sp, #0x30]
00a70380	add sp,sp,#0x80
00a70384	b 0x00c3dab0
00a70388	ldr x8,[x20, #0x20]
00a7038c	ldr x0,[x20, #0x30]
00a70390	ldp x29,x30,[sp, #0x70]
00a70394	ldp x20,x19,[sp, #0x60]
00a70398	ldr x1,[x8]
00a7039c	ldp x22,x21,[sp, #0x50]
00a703a0	ldp x24,x23,[sp, #0x40]
00a703a4	ldp x26,x25,[sp, #0x30]
00a703a8	add sp,sp,#0x80
00a703ac	b 0x00c3daa0
00a703b0	cmp w10,#0x40
00a703b4	b.ne 0x00a703c0
00a703b8	ldr x9,[x9, #0x30]
00a703bc	cbz x9,0x00a703fc
00a703c0	ldr w9,[x21, #0x30]
00a703c4	sub w9,w9,#0x1
00a703c8	cmp w9,#0x6
00a703cc	b.hi 0x00a70098
00a703d0	adrp x10,0x766000
00a703d4	add x10,x10,#0x598
00a703d8	ldrsw x9,[x10, x9, LSL #0x2]
00a703dc	add x9,x9,x10
00a703e0	br x9
00a703e4	ldr x0,[x21, #0x28]
00a703e8	ldr x22,[x20, #0x30]
00a703ec	add x1,x20,#0x1c
00a703f0	add x8,sp,#0x8
00a703f4	bl 0x00c36260
00a703f8	b 0x00a7055c
00a703fc	bl 0x00c342a0
00a70400	adrp x0,0x2b9000
00a70404	adrp x2,0x2c1000
00a70408	add x0,x0,#0xe99
00a7040c	add x2,x2,#0xd0c
00a70410	mov w1,#0x1b3
00a70414	bl 0x00c342b0
00a70418	orr w0,wzr,#0x6
00a7041c	mov w1,#0x93
00a70420	mov x2,xzr
00a70424	bl 0x00c342c0
00a70428	orr w19,wzr,#0xfffffffe
00a7042c	b 0x00a70098
00a70430	ldr x0,[x20, #0x20]
00a70434	cbz x0,0x00a70548
00a70438	cmp w8,#0x2
00a7043c	b.ne 0x00a70578
00a70440	bl 0x00c322f0
00a70444	add w8,w0,#0x7
00a70448	add w9,w0,#0xe
00a7044c	cmp w8,#0x0
00a70450	csel w8,w9,w8,lt
00a70454	adrp x1,0x2b9000
00a70458	sbfx x0,x8,#0x3,#0x1d
00a7045c	add x1,x1,#0xe99
00a70460	mov w2,#0x1ce
00a70464	str x0,[x20, #0x88]
00a70468	bl 0x00c32320
00a7046c	str x0,[x20, #0x78]
00a70470	cbz x0,0x00a705d8
00a70474	mov x1,x0
00a70478	ldr x0,[x20, #0x20]
00a7047c	ldr w2,[x20, #0x88]
00a70480	bl 0x00c38c90
00a70484	tbnz w0,#0x1f,0x00a70608
00a70488	ldr x0,[x21, #0x28]
00a7048c	ldr x1,[x20, #0x78]
00a70490	ldr x2,[x20, #0x88]
00a70494	ldr x22,[x20, #0x30]
00a70498	add x8,sp,#0x8
00a7049c	bl 0x00c3d990
00a704a0	b 0x00a7055c
00a704a4	ldr x0,[x21, #0x28]
00a704a8	ldr x1,[x20, #0x20]
00a704ac	ldrsw x2,[x20, #0x1c]
00a704b0	ldr x22,[x20, #0x30]
00a704b4	add x8,sp,#0x8
00a704b8	bl 0x00c36280
00a704bc	b 0x00a7055c
00a704c0	ldr x0,[x21, #0x28]
00a704c4	ldr x1,[x20, #0x20]
00a704c8	ldrsw x2,[x20, #0x1c]
00a704cc	ldr x22,[x20, #0x30]
00a704d0	add x8,sp,#0x8
00a704d4	bl 0x00c34c50
00a704d8	b 0x00a7055c
00a704dc	ldr x0,[x21, #0x28]
00a704e0	ldr x1,[x20, #0x20]
00a704e4	ldrsw x2,[x20, #0x1c]
00a704e8	ldr x22,[x20, #0x30]
00a704ec	add x8,sp,#0x8
00a704f0	bl 0x00c3da60
00a704f4	b 0x00a7055c
00a704f8	ldr x0,[x21, #0x28]
00a704fc	ldr x1,[x20, #0x20]
00a70500	ldrsw x2,[x20, #0x1c]
00a70504	ldr x22,[x20, #0x30]
00a70508	add x8,sp,#0x8
00a7050c	bl 0x00c36de0
00a70510	b 0x00a7055c
00a70514	bl 0x00c342a0
00a70518	adrp x0,0x2b9000
00a7051c	adrp x2,0x2c1000
00a70520	add x0,x0,#0xe99
00a70524	add x2,x2,#0xd0c
00a70528	mov w1,#0x297
00a7052c	bl 0x00c342b0
00a70530	mov w1,#0x103
00a70534	orr w0,wzr,#0x6
00a70538	movk w1,#0xc, LSL #16
00a7053c	mov x2,xzr
00a70540	bl 0x00c342c0
00a70544	b 0x00a70094
00a70548	ldr x0,[x21, #0x28]
00a7054c	ldr x22,[x20, #0x30]
00a70550	add x1,x20,#0x1c
00a70554	add x8,sp,#0x8
00a70558	bl 0x00c37340
00a7055c	ldr x8,[sp, #0x28]
00a70560	str x8,[x22, #0x20]
00a70564	ldur q0,[sp, #0x18]
00a70568	str q0,[x22, #0x10]
00a7056c	ldur q0,[sp, #0x8]
00a70570	str q0,[x22]
00a70574	b 0x00a70098
00a70578	bl 0x00c342a0
00a7057c	adrp x0,0x2b9000
00a70580	adrp x2,0x2c1000
00a70584	add x0,x0,#0xe99
00a70588	add x2,x2,#0xd0c
00a7058c	mov w1,#0x1e1
00a70590	bl 0x00c342b0
00a70594	ldr w3,[x20, #0x8]
00a70598	adrp x2,0x2b9000
00a7059c	add x2,x2,#0xed7
00a705a0	b 0x00a70080
00a705a4	cmp w10,#0x2
00a705a8	b.eq 0x00a700d8
00a705ac	cmp w10,#0x4
00a705b0	b.eq 0x00a700d8
00a705b4	b 0x00a703c0
00a705b8	mov w1,w19
00a705bc	ldp x29,x30,[sp, #0x70]
00a705c0	ldp x20,x19,[sp, #0x60]
00a705c4	ldp x22,x21,[sp, #0x50]
00a705c8	ldp x24,x23,[sp, #0x40]
00a705cc	ldp x26,x25,[sp, #0x30]
00a705d0	add sp,sp,#0x80
00a705d4	b 0x00c3dac0
00a705d8	bl 0x00c342a0
00a705dc	adrp x0,0x2b9000
00a705e0	adrp x2,0x2c1000
00a705e4	add x0,x0,#0xe99
00a705e8	add x2,x2,#0xd0c
00a705ec	mov w1,#0x1cf
00a705f0	bl 0x00c342b0
00a705f4	mov w8,#0x103
00a705f8	movk w8,#0xc, LSL #16
00a705fc	sub w1,w8,#0x3
00a70600	orr w0,wzr,#0x6
00a70604	b 0x00a7053c
00a70608	ldr x0,[x20, #0x78]
00a7060c	adrp x1,0x2b9000
00a70610	add x1,x1,#0xe99
00a70614	mov w2,#0x1d4
00a70618	bl 0x00c32310
00a7061c	mov w19,wzr
00a70620	str xzr,[x20, #0x78]
00a70624	b 0x00a70098

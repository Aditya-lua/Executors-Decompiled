; ZSTD_getFrameHeader_advanced @ 00bafe30
00bafe30	sub sp,sp,#0x50
00bafe34	stp x29,x30,[sp, #0x10]
00bafe38	str x23,[sp, #0x20]
00bafe3c	stp x22,x21,[sp, #0x30]
00bafe40	stp x20,x19,[sp, #0x40]
00bafe44	add x29,sp,#0x10
00bafe48	mrs x21,tpidr_el0
00bafe4c	mov w10,#0x5
00bafe50	mov x8,x0
00bafe54	ldr x9,[x21, #0x28]
00bafe58	cmp w3,#0x0
00bafe5c	csinc x0,x10,xzr,eq
00bafe60	str x9,[sp, #0x8]
00bafe64	cbnz x1,0x00bafe98
00bafe68	cbz x2,0x00bafe98
00bafe6c	mov x0,#-0x1
00bafe70	ldr x8,[x21, #0x28]
00bafe74	ldr x9,[sp, #0x8]
00bafe78	cmp x8,x9
00bafe7c	b.ne 0x00bb00dc
00bafe80	ldp x20,x19,[sp, #0x40]
00bafe84	ldr x23,[sp, #0x20]
00bafe88	ldp x22,x21,[sp, #0x30]
00bafe8c	ldp x29,x30,[sp, #0x10]
00bafe90	add sp,sp,#0x50
00bafe94	ret
00bafe98	cmp x2,x0
00bafe9c	b.cs 0x00baff10
00bafea0	cbz x2,0x00bafe70
00bafea4	cmp w3,#0x1
00bafea8	b.eq 0x00bafe70
00bafeac	mov w23,#0xb528
00bafeb0	mov x22,x0
00bafeb4	add x0,sp,#0x4
00bafeb8	movk w23,#0xfd2f, LSL #16
00bafebc	mov x19,x1
00bafec0	mov x20,x2
00bafec4	str w23,[sp, #0x4]
00bafec8	bl 0x00c2ffd0
00bafecc	ldr w8,[sp, #0x4]
00bafed0	cmp w8,w23
00bafed4	b.eq 0x00baff08
00bafed8	mov w8,#0x2a50
00bafedc	add x0,sp,#0x4
00bafee0	mov x1,x19
00bafee4	movk w8,#0x184d, LSL #16
00bafee8	mov x2,x20
00bafeec	str w8,[sp, #0x4]
00bafef0	bl 0x00c2ffd0
00bafef4	ldr w8,[sp, #0x4]
00bafef8	mov w9,#0xd2a5
00bafefc	movk w9,#0x184, LSL #16
00baff00	cmp w9,w8, LSR #0x4
00baff04	b.ne 0x00bb0018
00baff08	mov x0,x22
00baff0c	b 0x00bafe70
00baff10	movi v0.2D,#0x0
00baff14	cmp w3,#0x1
00baff18	stp q0,q0,[x8, #0x10]
00baff1c	str q0,[x8]
00baff20	b.eq 0x00baff38
00baff24	ldr w9,[x1]
00baff28	mov w10,#0xb528
00baff2c	movk w10,#0xfd2f, LSL #16
00baff30	cmp w9,w10
00baff34	b.ne 0x00baffd0
00baff38	add x10,x1,x0
00baff3c	adrp x13,0x364000
00baff40	add x13,x13,#0xd50
00baff44	ldurb w9,[x10, #-0x1]
00baff48	and x11,x9,#0x3
00baff4c	lsr x12,x9,#0x6
00baff50	cmp w9,#0x40
00baff54	ldr x11,[x13, x11, LSL #0x3]
00baff58	adrp x13,0x364000
00baff5c	add x13,x13,#0xe90
00baff60	ldr x12,[x13, x12, LSL #0x3]
00baff64	cset w13,cc
00baff68	ands w9,w9,#0x20
00baff6c	add x11,x11,x0
00baff70	and w9,w13,w9, LSR #0x5
00baff74	add x11,x11,x12
00baff78	cinc x11,x11,eq
00baff7c	add x9,x11,x9
00baff80	cmp x2,x9
00baff84	b.cs 0x00baff90
00baff88	mov x0,x9
00baff8c	b 0x00bafe70
00baff90	str w9,[x8, #0x18]
00baff94	ldurb w9,[x10, #-0x1]
00baff98	tbnz w9,#0x3,0x00bb0020
00baff9c	tbnz w9,#0x5,0x00bb0028
00baffa0	ldrb w10,[x10]
00baffa4	cmp x10,#0xaf
00baffa8	b.hi 0x00bb0060
00baffac	lsr x11,x10,#0x3
00baffb0	mov w12,#0x1
00baffb4	and x10,x10,#0x7
00baffb8	add x0,x0,#0x1
00baffbc	add x11,x11,#0xa
00baffc0	lsl x11,x12,x11
00baffc4	lsr x12,x11,#0x3
00baffc8	madd x10,x12,x10,x11
00baffcc	b 0x00bb002c
00baffd0	mov w10,#0xd2a5
00baffd4	movk w10,#0x184, LSL #16
00baffd8	cmp w10,w9, LSR #0x4
00baffdc	b.ne 0x00bb0018
00baffe0	cmp x2,#0x8
00baffe4	mov w0,#0x8
00baffe8	b.cc 0x00bafe70
00baffec	mov w9,#0x1
00bafff0	mov w10,#0xd5b0
00bafff4	str w9,[x8, #0x14]
00bafff8	movk w10,#0xe7b2, LSL #16
00bafffc	ldr w9,[x1]
00bb0000	add w9,w9,w10
00bb0004	stp w0,w9,[x8, #0x18]
00bb0008	mov x0,xzr
00bb000c	ldr w9,[x1, #0x4]
00bb0010	str x9,[x8]
00bb0014	b 0x00bafe70
00bb0018	mov x0,#-0xa
00bb001c	b 0x00bafe70
00bb0020	mov x0,#-0xe
00bb0024	b 0x00bafe70
00bb0028	mov x10,xzr
00bb002c	and w11,w9,#0x3
00bb0030	lsr w13,w9,#0x6
00bb0034	cmp w11,#0x1
00bb0038	b.gt 0x00bb004c
00bb003c	cbz w11,0x00bb0070
00bb0040	ldrb w11,[x1, x0]
00bb0044	add x0,x0,#0x1
00bb0048	b 0x00bb0070
00bb004c	cmp w11,#0x2
00bb0050	b.ne 0x00bb0068
00bb0054	ldrh w11,[x1, x0#0x0]
00bb0058	add x0,x0,#0x2
00bb005c	b 0x00bb0070
00bb0060	mov x0,#-0x10
00bb0064	b 0x00bafe70
00bb0068	ldr w11,[x1, x0#0x0]
00bb006c	add x0,x0,#0x4
00bb0070	ubfx w12,w9,#0x2,#0x1
00bb0074	cmp w13,#0x1
00bb0078	b.gt 0x00bb008c
00bb007c	cbnz w13,0x00bb009c
00bb0080	tbnz w9,#0x5,0x00bb00b0
00bb0084	mov x13,#-0x1
00bb0088	b 0x00bb00b4
00bb008c	cmp w13,#0x2
00bb0090	b.ne 0x00bb00a8
00bb0094	ldr w13,[x1, x0#0x0]
00bb0098	b 0x00bb00b4
00bb009c	ldrh w13,[x1, x0#0x0]
00bb00a0	add x13,x13,#0x100
00bb00a4	b 0x00bb00b4
00bb00a8	ldr x13,[x1, x0#0x0]
00bb00ac	b 0x00bb00b4
00bb00b0	ldrb w13,[x1, x0]
00bb00b4	tst w9,#0x20
00bb00b8	mov x0,xzr
00bb00bc	stp w11,w12,[x8, #0x1c]
00bb00c0	csel x9,x10,x13,eq
00bb00c4	mov w10,#0x20000
00bb00c8	cmp x9,#0x20, LSL #12
00bb00cc	stp x13,x9,[x8]
00bb00d0	csel x9,x9,x10,cc
00bb00d4	stp w9,wzr,[x8, #0x10]
00bb00d8	b 0x00bafe70
00bb00dc	bl 0x00c2fec0

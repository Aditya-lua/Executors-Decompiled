; std::__ndk1::to_wstring @ 00bc9fcc
00bc9fcc	paciasp
00bc9fd0	sub sp,sp,#0x50
00bc9fd4	stp x29,x30,[sp, #0x20]
00bc9fd8	stp x22,x21,[sp, #0x30]
00bc9fdc	stp x20,x19,[sp, #0x40]
00bc9fe0	add x29,sp,#0x20
00bc9fe4	lsr x9,x0,#0x20
00bc9fe8	mov x20,x0
00bc9fec	mov x19,x8
00bc9ff0	cbnz x9,0x00bca008
00bc9ff4	add x0,sp,#0xb
00bc9ff8	mov w1,w20
00bc9ffc	bl 0x00bcac54
00bca000	mov x20,x0
00bca004	b 0x00bca0fc
00bca008	mov x22,#0xe3ff
00bca00c	movk x22,#0x540b, LSL #16
00bca010	movk x22,#0x2, LSL #32
00bca014	cmp x20,x22
00bca018	b.ls 0x00bca04c
00bca01c	mov x8,#0xd5bf
00bca020	add x0,sp,#0xb
00bca024	movk x8,#0xbded, LSL #16
00bca028	movk x8,#0xfece, LSL #32
00bca02c	movk x8,#0xdbe6, LSL #48
00bca030	umulh x8,x20,x8
00bca034	lsr x21,x8,#0x21
00bca038	mov w1,w21
00bca03c	bl 0x00bcac54
00bca040	madd x8,x21,x22,x21
00bca044	sub x20,x20,x8
00bca048	b 0x00bca050
00bca04c	add x0,sp,#0xb
00bca050	mov x8,#0xcefd
00bca054	mov w9,#0xe100
00bca058	mov w11,#0xde83
00bca05c	movk x8,#0x8461, LSL #16
00bca060	movk w9,#0x5f5, LSL #16
00bca064	movk w11,#0x431b, LSL #16
00bca068	movk x8,#0x7711, LSL #32
00bca06c	mov w12,#0x2710
00bca070	movk x8,#0xabcc, LSL #48
00bca074	umulh x8,x20,x8
00bca078	lsr x8,x8,#0x1a
00bca07c	msub x9,x8,x9,x20
00bca080	add x20,x0,#0xa
00bca084	mov w10,w9
00bca088	umull x10,w10,w11
00bca08c	mov w11,#0x4240
00bca090	movk w11,#0xf, LSL #16
00bca094	lsr x10,x10,#0x32
00bca098	msub w9,w10,w11,w9
00bca09c	mov w11,#0x1759
00bca0a0	movk w11,#0xd1b7, LSL #16
00bca0a4	umull x11,w9,w11
00bca0a8	lsr x11,x11,#0x2d
00bca0ac	msub w9,w11,w12,w9
00bca0b0	adrp x12,0x78a000
00bca0b4	add x12,x12,#0x180
00bca0b8	ldrh w8,[x12, x8, LSL #0x1]
00bca0bc	ubfx w13,w9,#0x2,#0xe
00bca0c0	strh w8,[x0]
00bca0c4	mov w8,#0x147b
00bca0c8	ldrh w10,[x12, x10, LSL #0x1]
00bca0cc	mul w8,w13,w8
00bca0d0	strh w10,[x0, #0x2]
00bca0d4	ldrh w10,[x12, x11, LSL #0x1]
00bca0d8	mov w11,#0x64
00bca0dc	lsr w8,w8,#0x11
00bca0e0	strh w10,[x0, #0x4]
00bca0e4	msub w9,w8,w11,w9
00bca0e8	ldrh w8,[x12, w8, UXTW #0x1]
00bca0ec	strh w8,[x0, #0x6]
00bca0f0	and x8,x9,#0xffff
00bca0f4	ldrh w8,[x12, x8, LSL #0x1]
00bca0f8	strh w8,[x0, #0x8]
00bca0fc	add x8,sp,#0xb
00bca100	sub x21,x20,x8
00bca104	orr x8,xzr,#0x3ffffffffffffff8
00bca108	cmp x21,x8
00bca10c	b.cs 0x00bca224
00bca110	cmp x21,#0x4
00bca114	b.hi 0x00bca124
00bca118	lsl w8,w21,#0x1
00bca11c	strb w8,[x19], #0x4
00bca120	b 0x00bca14c
00bca124	orr x8,x21,#0x1
00bca128	mov w9,#0x8
00bca12c	cmp x8,#0x5
00bca130	csinc x22,x9,x8,eq
00bca134	lsl x0,x22,#0x2
00bca138	bl 0x00c2fed0
00bca13c	orr x8,x22,#0x1
00bca140	stp x21,x0,[x19, #0x8]
00bca144	str x8,[x19]
00bca148	mov x19,x0
00bca14c	add x8,sp,#0xb
00bca150	cmp x8,x20
00bca154	b.eq 0x00bca170
00bca158	cmp x21,#0x20
00bca15c	add x11,sp,#0xb
00bca160	b.cs 0x00bca178
00bca164	mov x8,x19
00bca168	add x9,sp,#0xb
00bca16c	b 0x00bca1f8
00bca170	mov x8,x19
00bca174	b 0x00bca208
00bca178	adrp x12,0x29c000
00bca17c	and x10,x21,#0x3fffffffffffffe0
00bca180	adrp x13,0x29d000
00bca184	ldr q0,[x12, #0x890]
00bca188	adrp x12,0x29c000
00bca18c	adrp x14,0x29c000
00bca190	add x8,x19,x10, LSL #0x2
00bca194	ldr q1,[x13, #0xa0]
00bca198	ldr q2,[x12, #0xcc0]
00bca19c	ldr q3,[x14, #0x20]
00bca1a0	add x9,x11,x10
00bca1a4	add x11,x11,#0x10
00bca1a8	add x12,x19,#0x40
00bca1ac	mov x13,x10
00bca1b0	ldp q4,q5,[x11, #-0x10]
00bca1b4	subs x13,x13,#0x20
00bca1b8	add x11,x11,#0x20
00bca1bc	tbl v6.16B,{v4.16B},v3.16B
00bca1c0	tbl v7.16B,{v4.16B},v2.16B
00bca1c4	tbl v16.16B,{v4.16B},v1.16B
00bca1c8	tbl v4.16B,{v4.16B},v0.16B
00bca1cc	tbl v17.16B,{v5.16B},v3.16B
00bca1d0	stp q7,q6,[x12, #-0x20]
00bca1d4	tbl v6.16B,{v5.16B},v2.16B
00bca1d8	tbl v7.16B,{v5.16B},v1.16B
00bca1dc	tbl v5.16B,{v5.16B},v0.16B
00bca1e0	stp q4,q16,[x12, #-0x40]
00bca1e4	stp q6,q17,[x12, #0x20]
00bca1e8	stp q5,q7,[x12], #0x80
00bca1ec	b.ne 0x00bca1b0
00bca1f0	cmp x21,x10
00bca1f4	b.eq 0x00bca208
00bca1f8	ldrb w10,[x9], #0x1
00bca1fc	cmp x9,x20
00bca200	str w10,[x8], #0x4
00bca204	b.ne 0x00bca1f8
00bca208	str wzr,[x8]
00bca20c	ldp x20,x19,[sp, #0x40]
00bca210	ldp x22,x21,[sp, #0x30]
00bca214	ldp x29,x30,[sp, #0x20]
00bca218	add sp,sp,#0x50
00bca21c	autiasp
00bca220	ret
00bca224	bl 0x00bc5610

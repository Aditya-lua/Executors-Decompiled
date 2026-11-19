; FUN_00b37068 @ 00b37068
00b37068	sub sp,sp,#0x140
00b3706c	stp x26,x25,[sp, #0xf0]
00b37070	stp x24,x23,[sp, #0x100]
00b37074	stp x22,x21,[sp, #0x110]
00b37078	stp x20,x19,[sp, #0x120]
00b3707c	stp x29,x30,[sp, #0x130]
00b37080	mov x19,x0
00b37084	ldr x0,[x0]
00b37088	str x28,[sp, #0xe0]
00b3708c	add x29,sp,#0x130
00b37090	mov x24,x6
00b37094	mov x25,x5
00b37098	mov x21,x4
00b3709c	mov x20,x3
00b370a0	mov w23,w2
00b370a4	bl 0x00c41050
00b370a8	stur xzr,[x29, #-0x58]
00b370ac	cbz x0,0x00b3715c
00b370b0	mov x22,x0
00b370b4	str w23,[x19, #0x10]
00b370b8	cbz w23,0x00b370c0
00b370bc	tbz w23,#0x0,0x00b371ac
00b370c0	mov x26,x19
00b370c4	ldr x8,[x26, #0x8]!
00b370c8	ldr x8,[x8, #0x18]
00b370cc	cbz x8,0x00b371ac
00b370d0	movi v0.2D,#0x0
00b370d4	add x0,sp,#0x30
00b370d8	mov x1,x25
00b370dc	mov x2,x24
00b370e0	stp q0,q0,[sp, #0x40]
00b370e4	str q0,[sp, #0x30]
00b370e8	bl 0x00c3b770
00b370ec	cbz w0,0x00b37154
00b370f0	ldp x0,x8,[x19]
00b370f4	ldr x24,[x8, #0x18]
00b370f8	bl 0x00c41210
00b370fc	adrp x1,0xcb5000
00b37100	ldr x1,[x1, #0x6a0]
00b37104	mov x3,x0
00b37108	add x2,sp,#0x30
00b3710c	mov x0,x22
00b37110	mov x4,xzr
00b37114	blr x24
00b37118	stur x0,[x29, #-0x58]
00b3711c	bl 0x00c32420
00b37120	and x8,x0,#0xff800000
00b37124	mov w9,#0x4800000
00b37128	cmp x8,x9
00b3712c	b.ne 0x00b37164
00b37130	asr w8,w0,#0x1f
00b37134	orr w8,w8,#0x7fffff
00b37138	and w8,w8,w0
00b3713c	and w8,w8,#0x7fffffff
00b37140	cmp w8,#0x68
00b37144	b.eq 0x00b37150
00b37148	cmp w8,#0x65
00b3714c	b.ne 0x00b37164
00b37150	bl 0x00c35ed0
00b37154	mov w20,wzr
00b37158	b 0x00b371c0
00b3715c	mov w20,wzr
00b37160	b 0x00b371d8
00b37164	ldur x0,[x29, #-0x58]
00b37168	cmp w23,#0x0
00b3716c	cset w8,ne
00b37170	cmp x0,#0x0
00b37174	cset w9,eq
00b37178	and w8,w8,w9
00b3717c	tbnz w8,#0x0,0x00b371ac
00b37180	cbz x0,0x00b371ac
00b37184	ldr x8,[x19, #0x8]
00b37188	ldr x8,[x8, #0x20]
00b3718c	cbz x8,0x00b371fc
00b37190	mov x1,x19
00b37194	blr x8
00b37198	ldur x23,[x29, #-0x58]
00b3719c	mov x0,x22
00b371a0	bl 0x00c31a40
00b371a4	cbnz x23,0x00b37204
00b371a8	b 0x00b371b4
00b371ac	mov x0,x22
00b371b0	bl 0x00c31a40
00b371b4	mov x22,xzr
00b371b8	add x26,x19,#0x8
00b371bc	mov w20,#0x1
00b371c0	mov x0,x22
00b371c4	bl 0x00c31a40
00b371c8	ldr x8,[x26]
00b371cc	ldur x0,[x29, #-0x58]
00b371d0	ldr x8,[x8, #0x28]
00b371d4	blr x8
00b371d8	mov w0,w20
00b371dc	ldp x29,x30,[sp, #0x130]
00b371e0	ldp x20,x19,[sp, #0x120]
00b371e4	ldp x22,x21,[sp, #0x110]
00b371e8	ldp x24,x23,[sp, #0x100]
00b371ec	ldp x26,x25,[sp, #0xf0]
00b371f0	ldr x28,[sp, #0xe0]
00b371f4	add sp,sp,#0x140
00b371f8	ret
00b371fc	mov x0,x22
00b37200	bl 0x00c31a40
00b37204	mov w8,#0x2
00b37208	adrp x0,0x2ce000
00b3720c	str w8,[sp, #0x2c]
00b37210	add x0,x0,#0xcd9
00b37214	mov x8,sp
00b37218	add x1,sp,#0x2c
00b3721c	add x22,sp,#0x30
00b37220	bl 0x00c36260
00b37224	ldr x8,[sp, #0x20]
00b37228	ldp q1,q0,[sp]
00b3722c	adrp x0,0x2a4000
00b37230	add x0,x0,#0x18
00b37234	str x8,[sp, #0x50]
00b37238	stp q1,q0,[sp, #0x30]
00b3723c	ldr x8,[x19, #0x8]!
00b37240	mov x2,xzr
00b37244	ldr x1,[x8, #0x8]
00b37248	mov x8,sp
00b3724c	bl 0x00c36280
00b37250	ldr x8,[sp, #0x20]
00b37254	ldp q1,q0,[sp]
00b37258	adrp x0,0x2d5000
00b3725c	add x0,x0,#0xc93
00b37260	str x8,[sp, #0x78]
00b37264	mov x8,sp
00b37268	sub x1,x29,#0x58
00b3726c	mov w2,#0x8
00b37270	stur q0,[sp, #0x68]
00b37274	stur q1,[sp, #0x58]
00b37278	bl 0x00c34c50
00b3727c	ldr x8,[sp, #0x20]
00b37280	ldp q1,q0,[sp]
00b37284	str x8,[sp, #0xa0]
00b37288	mov x8,sp
00b3728c	stp q1,q0,[sp, #0x80]
00b37290	bl 0x00c34c40
00b37294	ldr x8,[sp, #0x20]
00b37298	ldp q1,q0,[sp]
00b3729c	add x0,sp,#0x30
00b372a0	mov x1,x21
00b372a4	str x8,[sp, #0xc8]
00b372a8	stur q0,[x22, #0x88]
00b372ac	stur q1,[x22, #0x78]
00b372b0	blr x20
00b372b4	mov w20,w0
00b372b8	mov x22,xzr
00b372bc	mov x26,x19
00b372c0	b 0x00b371c0

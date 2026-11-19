; FUN_00b32f34 @ 00b32f34
00b32f34	sub sp,sp,#0x130
00b32f38	stp x29,x30,[sp, #0x120]
00b32f3c	add x29,sp,#0x120
00b32f40	stp x22,x21,[sp, #0x100]
00b32f44	stp x20,x19,[sp, #0x110]
00b32f48	stur xzr,[x29, #-0x38]
00b32f4c	stp xzr,xzr,[x29, #-0x50]
00b32f50	ldr x8,[x0, #0x8]
00b32f54	str w2,[x0, #0x10]
00b32f58	cmp w2,#0x0
00b32f5c	str x28,[sp, #0xf0]
00b32f60	ldr w8,[x8, #0x1c]
00b32f64	csel w22,w8,w2,eq
00b32f68	tst w8,w22
00b32f6c	b.eq 0x00b32fe8
00b32f70	mov x19,x0
00b32f74	ldr x0,[x0]
00b32f78	mov x20,x3
00b32f7c	sub x2,x29,#0x38
00b32f80	sub x3,x29,#0x48
00b32f84	mov x21,x4
00b32f88	bl 0x00c41720
00b32f8c	cbz w0,0x00b33150
00b32f90	bl 0x00c35250
00b32f94	tbnz w22,#0x0,0x00b33020
00b32f98	ldur x8,[x29, #-0x50]
00b32f9c	tbz w22,#0x1,0x00b33090
00b32fa0	cbnz x8,0x00b33090
00b32fa4	ldur x8,[x29, #-0x38]
00b32fa8	stur x8,[x29, #-0x40]
00b32fac	ldr x9,[x19, #0x8]
00b32fb0	ldr x8,[x9, #0x40]
00b32fb4	cbnz x8,0x00b32fc0
00b32fb8	ldr x8,[x9, #0x28]
00b32fbc	cbz x8,0x00b32fd8
00b32fc0	ldur x2,[x29, #-0x48]
00b32fc4	sub x1,x29,#0x40
00b32fc8	mov x0,xzr
00b32fcc	blr x8
00b32fd0	stur x0,[x29, #-0x50]
00b32fd4	cbnz x0,0x00b330f8
00b32fd8	ldr w8,[x19, #0x10]
00b32fdc	cbnz w8,0x00b330d4
00b32fe0	mov x8,xzr
00b32fe4	b 0x00b33090
00b32fe8	bl 0x00c342a0
00b32fec	adrp x0,0x2ba000
00b32ff0	adrp x2,0x2ae000
00b32ff4	add x0,x0,#0xa76
00b32ff8	add x2,x2,#0xa70
00b32ffc	mov w1,#0xc7
00b33000	bl 0x00c342b0
00b33004	mov w1,#0x106
00b33008	mov w0,#0x39
00b3300c	movk w1,#0x8, LSL #16
00b33010	mov x2,xzr
00b33014	bl 0x00c342c0
00b33018	mov w20,wzr
00b3301c	b 0x00b33250
00b33020	ldur x8,[x29, #-0x38]
00b33024	stur x8,[x29, #-0x40]
00b33028	ldr x9,[x19, #0x8]
00b3302c	ldr x8,[x9, #0x38]
00b33030	cbz x8,0x00b33060
00b33034	ldur x2,[x29, #-0x48]
00b33038	sub x1,x29,#0x40
00b3303c	mov x0,xzr
00b33040	mov x3,x19
00b33044	blr x8
00b33048	stur x0,[x29, #-0x50]
00b3304c	ldrb w8,[x19, #0x14]
00b33050	tbz w8,#0x0,0x00b3307c
00b33054	bl 0x00c35ed0
00b33058	mov w20,wzr
00b3305c	b 0x00b3322c
00b33060	ldr x8,[x9, #0x20]
00b33064	cbz x8,0x00b330f0
00b33068	ldur x2,[x29, #-0x48]
00b3306c	sub x1,x29,#0x40
00b33070	mov x0,xzr
00b33074	blr x8
00b33078	stur x0,[x29, #-0x50]
00b3307c	cbnz x0,0x00b330f8
00b33080	ldr w8,[x19, #0x10]
00b33084	cbnz w8,0x00b330d4
00b33088	mov x8,xzr
00b3308c	tbnz w22,#0x1,0x00b32fa0
00b33090	mov w9,#0x84
00b33094	tst w22,w9
00b33098	b.eq 0x00b330dc
00b3309c	cbnz x8,0x00b330dc
00b330a0	ldur x8,[x29, #-0x38]
00b330a4	stur x8,[x29, #-0x40]
00b330a8	ldr x8,[x19, #0x8]
00b330ac	ldr x8,[x8, #0x30]
00b330b0	cbz x8,0x00b330cc
00b330b4	ldur x2,[x29, #-0x48]
00b330b8	sub x1,x29,#0x40
00b330bc	mov x0,xzr
00b330c0	blr x8
00b330c4	stur x0,[x29, #-0x50]
00b330c8	cbnz x0,0x00b330f8
00b330cc	ldr w8,[x19, #0x10]
00b330d0	cbz w8,0x00b330e0
00b330d4	bl 0x00c35ed0
00b330d8	b 0x00b33150
00b330dc	cbnz x8,0x00b330f8
00b330e0	bl 0x00c35ed0
00b330e4	ldur x0,[x29, #-0x50]
00b330e8	cbnz x0,0x00b33104
00b330ec	b 0x00b33150
00b330f0	ldur x0,[x29, #-0x50]
00b330f4	cbz x0,0x00b33080
00b330f8	bl 0x00c35240
00b330fc	ldur x0,[x29, #-0x50]
00b33100	cbz x0,0x00b33150
00b33104	ldr x8,[x19, #0x8]
00b33108	ldr x8,[x8, #0x48]
00b3310c	cbz x8,0x00b33124
00b33110	mov x1,x19
00b33114	blr x8
00b33118	cbz w0,0x00b3313c
00b3311c	ldur x0,[x29, #-0x50]
00b33120	cbz x0,0x00b33150
00b33124	ldr x8,[x19, #0x8]
00b33128	ldr x8,[x8, #0x50]
00b3312c	cbz x8,0x00b33150
00b33130	mov x1,x19
00b33134	blr x8
00b33138	b 0x00b33150
00b3313c	ldr x8,[x19, #0x8]
00b33140	ldur x0,[x29, #-0x50]
00b33144	ldr x8,[x8, #0x58]
00b33148	blr x8
00b3314c	stur xzr,[x29, #-0x50]
00b33150	ldur x0,[x29, #-0x38]
00b33154	adrp x1,0x2ba000
00b33158	add x1,x1,#0xa76
00b3315c	mov w2,#0x118
00b33160	bl 0x00c32310
00b33164	ldur x8,[x29, #-0x50]
00b33168	stur xzr,[x29, #-0x38]
00b3316c	cbz x8,0x00b33228
00b33170	mov w8,#0x2
00b33174	adrp x0,0x2ce000
00b33178	str w8,[sp, #0x2c]
00b3317c	add x0,x0,#0xcd9
00b33180	mov x8,sp
00b33184	add x1,sp,#0x2c
00b33188	add x22,sp,#0x30
00b3318c	bl 0x00c36260
00b33190	ldr x8,[sp, #0x20]
00b33194	ldp q1,q0,[sp]
00b33198	adrp x0,0x2a4000
00b3319c	add x0,x0,#0x18
00b331a0	str x8,[sp, #0x50]
00b331a4	stp q1,q0,[sp, #0x30]
00b331a8	ldr x8,[x19, #0x8]
00b331ac	mov x2,xzr
00b331b0	ldr x1,[x8]
00b331b4	mov x8,sp
00b331b8	bl 0x00c36280
00b331bc	ldr x8,[sp, #0x20]
00b331c0	ldp q1,q0,[sp]
00b331c4	adrp x0,0x2d5000
00b331c8	add x0,x0,#0xc93
00b331cc	str x8,[sp, #0x78]
00b331d0	mov x8,sp
00b331d4	sub x1,x29,#0x50
00b331d8	mov w2,#0x8
00b331dc	stur q0,[sp, #0x68]
00b331e0	stur q1,[sp, #0x58]
00b331e4	bl 0x00c34c50
00b331e8	ldr x8,[sp, #0x20]
00b331ec	ldp q1,q0,[sp]
00b331f0	str x8,[sp, #0xa0]
00b331f4	mov x8,sp
00b331f8	stp q1,q0,[sp, #0x80]
00b331fc	bl 0x00c34c40
00b33200	ldr x8,[sp, #0x20]
00b33204	ldp q1,q0,[sp]
00b33208	add x0,sp,#0x30
00b3320c	mov x1,x21
00b33210	str x8,[sp, #0xc8]
00b33214	stur q0,[x22, #0x88]
00b33218	stur q1,[x22, #0x78]
00b3321c	blr x20
00b33220	mov w20,w0
00b33224	b 0x00b3322c
00b33228	mov w20,#0x1
00b3322c	ldr x8,[x19, #0x8]
00b33230	ldur x0,[x29, #-0x50]
00b33234	ldr x8,[x8, #0x58]
00b33238	blr x8
00b3323c	ldur x0,[x29, #-0x38]
00b33240	adrp x1,0x2ba000
00b33244	add x1,x1,#0xa76
00b33248	mov w2,#0x130
00b3324c	bl 0x00c32310
00b33250	mov w0,w20
00b33254	ldp x29,x30,[sp, #0x120]
00b33258	ldp x20,x19,[sp, #0x110]
00b3325c	ldp x22,x21,[sp, #0x100]
00b33260	ldr x28,[sp, #0xf0]
00b33264	add sp,sp,#0x130
00b33268	ret

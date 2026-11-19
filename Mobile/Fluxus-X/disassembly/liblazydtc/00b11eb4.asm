; FUN_00b11eb4 @ 00b11eb4
00b11eb4	sub sp,sp,#0xd0
00b11eb8	stp x28,x27,[sp, #0x70]
00b11ebc	stp x26,x25,[sp, #0x80]
00b11ec0	stp x24,x23,[sp, #0x90]
00b11ec4	stp x22,x21,[sp, #0xa0]
00b11ec8	stp x20,x19,[sp, #0xb0]
00b11ecc	stp x29,x30,[sp, #0xc0]
00b11ed0	ldr x28,[x0, #0xf0]
00b11ed4	ldr w10,[x0, #0x94]
00b11ed8	cmp w2,#0x0
00b11edc	mov w8,#0x5
00b11ee0	mov w9,#0xa
00b11ee4	csel w8,w9,w8,eq
00b11ee8	ldp w9,w11,[x28, #0x28]
00b11eec	cmp w10,w2
00b11ef0	and w10,w8,#0x3
00b11ef4	csel w8,w8,w10,gt
00b11ef8	cmp w11,#0x0
00b11efc	and w10,w8,#0xc
00b11f00	csel w8,w10,w8,ge
00b11f04	tst w8,w9
00b11f08	add x29,sp,#0xc0
00b11f0c	stp w8,wzr,[sp, #0x20]
00b11f10	str x1,[sp, #0x8]
00b11f14	b.eq 0x00b120d4
00b11f18	ldr x0,[x28, #0x8]
00b11f1c	mov w19,w2
00b11f20	bl 0x00c325e0
00b11f24	cmp w0,#0x1
00b11f28	str w0,[sp, #0x1c]
00b11f2c	b.lt 0x00b120d4
00b11f30	mov w8,#0x100
00b11f34	mov w23,wzr
00b11f38	mov x27,xzr
00b11f3c	mov x21,xzr
00b11f40	mov w25,wzr
00b11f44	str w8,[sp, #0x18]
00b11f48	mov w20,#0x100
00b11f4c	mov w8,#0x100
00b11f50	mov w22,#0x100
00b11f54	str w19,[sp, #0x4]
00b11f58	str w8,[sp, #0x14]
00b11f5c	ldr x0,[x28, #0x8]
00b11f60	mov w1,w23
00b11f64	bl 0x00c32610
00b11f68	ldrb w8,[x0]
00b11f6c	ldr w10,[sp, #0x20]
00b11f70	mov w9,#0x1
00b11f74	lsl w9,w9,w8
00b11f78	tst w9,w10
00b11f7c	b.eq 0x00b120c0
00b11f80	ldr w9,[sp, #0x18]
00b11f84	mov x26,x0
00b11f88	cmp w9,w8
00b11f8c	b.eq 0x00b11fa8
00b11f90	ldr x9,[x28]
00b11f94	ldrb w10,[x26, #0x2]
00b11f98	mov w20,#0x100
00b11f9c	ldr x9,[x9, #0x8]
00b11fa0	ldrb w9,[x9, x10]
00b11fa4	stp w9,w8,[sp, #0x14]
00b11fa8	ldrb w19,[x26, #0x1]
00b11fac	cmp w22,w19
00b11fb0	b.ne 0x00b11fe8
00b11fb4	ldrb w24,[x26, #0x2]
00b11fb8	cbz x24,0x00b11fd4
00b11fbc	ldr x8,[x28]
00b11fc0	ldr w9,[sp, #0x14]
00b11fc4	ldr x8,[x8, #0x8]
00b11fc8	ldrb w8,[x8, x24]
00b11fcc	cmp w9,w8
00b11fd0	b.hi 0x00b120c0
00b11fd4	cmp w20,w24
00b11fd8	b.eq 0x00b120a0
00b11fdc	ldr x8,[x28]
00b11fe0	mov w19,w22
00b11fe4	b 0x00b12058
00b11fe8	adrp x1,0x2a0000
00b11fec	mov w2,#0xac9
00b11ff0	mov x0,x21
00b11ff4	add x1,x1,#0xe02
00b11ff8	bl 0x00c32310
00b11ffc	cmp w19,#0x1
00b12000	stur xzr,[x29, #-0x58]
00b12004	b.eq 0x00b12024
00b12008	cbnz w19,0x00b12114
00b1200c	ldr x0,[sp, #0x8]
00b12010	sub x1,x29,#0x58
00b12014	bl 0x00c372a0
00b12018	mov w25,w0
00b1201c	tbz w0,#0x1f,0x00b1203c
00b12020	b 0x00b1213c
00b12024	ldr x0,[sp, #0x8]
00b12028	bl 0x00c32cd0
00b1202c	sub x1,x29,#0x58
00b12030	bl 0x00c32db0
00b12034	mov w25,w0
00b12038	tbnz w0,#0x1f,0x00b1213c
00b1203c	ldur x21,[x29, #-0x58]
00b12040	cbz x21,0x00b1213c
00b12044	ldr x8,[x28]
00b12048	ldrb w24,[x26, #0x2]
00b1204c	ldr x9,[x8, #0x8]
00b12050	ldrb w9,[x9, x24]
00b12054	str w9,[sp, #0x14]
00b12058	ldr x8,[x8]
00b1205c	ldr x4,[x8, x24, LSL #0x3]
00b12060	str w25,[sp, #0x24]
00b12064	cbz x4,0x00b12094
00b12068	mov w1,w25
00b1206c	add x2,sp,#0x28
00b12070	add x3,sp,#0x24
00b12074	mov x0,x21
00b12078	mov x5,xzr
00b1207c	add x27,sp,#0x28
00b12080	bl 0x00c370c0
00b12084	cbz w0,0x00b12174
00b12088	mov w22,w19
00b1208c	mov w20,w24
00b12090	b 0x00b120a0
00b12094	mov w22,w19
00b12098	mov w20,w24
00b1209c	mov x27,x21
00b120a0	ldr w2,[sp, #0x24]
00b120a4	ldr x8,[x26, #0x10]
00b120a8	cmp x8,x2
00b120ac	b.ne 0x00b120c0
00b120b0	ldr x1,[x26, #0x8]
00b120b4	mov x0,x27
00b120b8	bl 0x00c300b0
00b120bc	cbz w0,0x00b1217c
00b120c0	ldr w8,[sp, #0x1c]
00b120c4	add w23,w23,#0x1
00b120c8	cmp w23,w8
00b120cc	b.lt 0x00b11f5c
00b120d0	b 0x00b120d8
00b120d4	mov x21,xzr
00b120d8	mov w22,wzr
00b120dc	adrp x1,0x2a0000
00b120e0	add x1,x1,#0xe02
00b120e4	mov w2,#0xb07
00b120e8	mov x0,x21
00b120ec	bl 0x00c32310
00b120f0	mov w0,w22
00b120f4	ldp x29,x30,[sp, #0xc0]
00b120f8	ldp x20,x19,[sp, #0xb0]
00b120fc	ldp x22,x21,[sp, #0xa0]
00b12100	ldp x24,x23,[sp, #0x90]
00b12104	ldp x26,x25,[sp, #0x80]
00b12108	ldp x28,x27,[sp, #0x70]
00b1210c	add sp,sp,#0xd0
00b12110	ret
00b12114	bl 0x00c342a0
00b12118	adrp x0,0x2a0000
00b1211c	adrp x2,0x2a2000
00b12120	add x0,x0,#0xe02
00b12124	add x2,x2,#0xec0
00b12128	mov w1,#0xa6d
00b1212c	bl 0x00c342b0
00b12130	mov w0,#0xb
00b12134	mov w1,#0x85
00b12138	b 0x00b12164
00b1213c	bl 0x00c342a0
00b12140	adrp x0,0x2a0000
00b12144	adrp x2,0x2a2000
00b12148	add x0,x0,#0xe02
00b1214c	add x2,x2,#0xec0
00b12150	mov w1,#0xa72
00b12154	bl 0x00c342b0
00b12158	mov w1,#0x100
00b1215c	mov w0,#0xb
00b12160	movk w1,#0xc, LSL #16
00b12164	mov x2,xzr
00b12168	bl 0x00c342c0
00b1216c	mov w22,#0xffffffff
00b12170	b 0x00b120f0
00b12174	mov w22,#0xffffffff
00b12178	b 0x00b120dc
00b1217c	ldr w9,[sp, #0x18]
00b12180	mov w8,#0x1
00b12184	lsl w8,w8,w9
00b12188	tst w8,#0xc
00b1218c	and w9,w8,#0xc
00b12190	cset w22,ne
00b12194	cbnz w9,0x00b121a0
00b12198	ldr w8,[x28, #0x2c]
00b1219c	tbz w8,#0x1f,0x00b120d8
00b121a0	ldr x0,[x28, #0x20]
00b121a4	ldr w8,[sp, #0x4]
00b121a8	adrp x1,0x2a0000
00b121ac	add x1,x1,#0xe02
00b121b0	mov w2,#0xafe
00b121b4	str w8,[x28, #0x2c]
00b121b8	str x26,[x28, #0x18]
00b121bc	bl 0x00c32310
00b121c0	ldr x0,[sp, #0x8]
00b121c4	str x0,[x28, #0x20]
00b121c8	bl 0x00c350b0
00b121cc	b 0x00b120dc

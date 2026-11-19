; FUN_00beeb40 @ 00beeb40
00beeb40	paciasp
00beeb44	sub sp,sp,#0x80
00beeb48	stp x29,x30,[sp, #0x20]
00beeb4c	stp x28,x27,[sp, #0x30]
00beeb50	stp x26,x25,[sp, #0x40]
00beeb54	stp x24,x23,[sp, #0x50]
00beeb58	stp x22,x21,[sp, #0x60]
00beeb5c	stp x20,x19,[sp, #0x70]
00beeb60	add x29,sp,#0x20
00beeb64	ldp x23,x24,[x0]
00beeb68	mov x19,x0
00beeb6c	ldrb w8,[x0]
00beeb70	lsr x9,x8,#0x1
00beeb74	and x10,x23,#-0x2
00beeb78	tst w8,#0x1
00beeb7c	sub x26,x10,#0x1
00beeb80	mov w8,#0x16
00beeb84	csel x21,x9,x24,eq
00beeb88	csel x28,x8,x26,eq
00beeb8c	subs x20,x2,x1
00beeb90	b.eq 0x00beeddc
00beeb94	ldr x25,[x19, #0x10]
00beeb98	tst w23,#0x1
00beeb9c	ubfx x27,x23,#0x1,#0x7
00beeba0	and w10,w23,#0xff
00beeba4	add x9,x19,#0x1
00beeba8	csinc x22,x25,x19,ne
00beebac	csel x8,x27,x24,eq
00beebb0	cmp x1,x22
00beebb4	b.cc 0x00beebf4
00beebb8	add x8,x22,x8
00beebbc	add x8,x8,#0x1
00beebc0	cmp x1,x8
00beebc4	b.cs 0x00beebf4
00beebc8	cmn x20,#0x8
00beebcc	b.cs 0x00beee04
00beebd0	mov w28,w10
00beebd4	cmp x20,#0x16
00beebd8	str x9,[sp]
00beebdc	b.hi 0x00beec64
00beebe0	lsl w8,w20,#0x1
00beebe4	add x9,sp,#0x8
00beebe8	orr x21,x9,#0x1
00beebec	strb w8,[sp, #0x8]
00beebf0	b 0x00beec94
00beebf4	sub x8,x28,x21
00beebf8	cmp x8,x20
00beebfc	b.cs 0x00beec58
00beec00	add x8,x21,x20
00beec04	mov x9,#-0x9
00beec08	sub x10,x8,x28
00beec0c	sub x9,x9,x28
00beec10	cmp x10,x9
00beec14	b.hi 0x00beee04
00beec18	mov x9,#-0xe
00beec1c	mov x25,x1
00beec20	movk x9,#0x7fff, LSL #48
00beec24	cmp x28,x9
00beec28	b.hi 0x00beed44
00beec2c	lsl x9,x28,#0x1
00beec30	mov w10,#0x1a
00beec34	cmp x8,x9
00beec38	csel x8,x8,x9,hi
00beec3c	orr x9,x8,#0x7
00beec40	cmp x9,#0x17
00beec44	csinc x9,x10,x9,eq
00beec48	cmp x8,#0x17
00beec4c	mov w8,#0x17
00beec50	csel x23,x8,x9,cc
00beec54	b 0x00beed48
00beec58	tst w10,#0x1
00beec5c	csel x24,x9,x25,eq
00beec60	b 0x00beed8c
00beec64	orr x8,x20,#0x7
00beec68	mov w9,#0x1a
00beec6c	mov x21,x1
00beec70	cmp x8,#0x17
00beec74	csinc x22,x9,x8,eq
00beec78	mov x0,x22
00beec7c	bl 0x00c2fed0
00beec80	mov x1,x21
00beec84	mov x21,x0
00beec88	orr x8,x22,#0x1
00beec8c	stp x20,x0,[sp, #0x10]
00beec90	str x8,[sp, #0x8]
00beec94	mov x0,x21
00beec98	mov x2,x20
00beec9c	bl 0x00c2ffd0
00beeca0	strb wzr,[x21, x20]
00beeca4	add x10,sp,#0x8
00beeca8	ldrb w8,[sp, #0x8]
00beecac	ldp x11,x9,[sp, #0x10]
00beecb0	ands w21,w8,#0x1
00beecb4	lsr x8,x8,#0x1
00beecb8	csinc x7,x9,x10,ne
00beecbc	csel x6,x8,x11,eq
00beecc0	tst w28,#0x1
00beecc4	mov w8,#0x16
00beecc8	csel x1,x8,x26,eq
00beeccc	tst x23,#0x1
00beecd0	csel x20,x27,x24,eq
00beecd4	sub x8,x1,x20
00beecd8	cmp x8,x6
00beecdc	b.cs 0x00beed08
00beece0	sub x8,x6,x1
00beece4	add x2,x8,x20
00beece8	mov x0,x19
00beecec	mov x3,x20
00beecf0	mov x4,x20
00beecf4	mov x5,xzr
00beecf8	bl 0x00c30200
00beecfc	ldrb w8,[sp, #0x8]
00beed00	and w21,w8,#0x1
00beed04	b 0x00beedc8
00beed08	cbz x6,0x00beedc8
00beed0c	ldr x8,[sp]
00beed10	tst x23,#0x1
00beed14	mov x1,x7
00beed18	mov x2,x6
00beed1c	mov x23,x6
00beed20	csel x22,x8,x25,eq
00beed24	add x0,x22,x20
00beed28	bl 0x00c2ff60
00beed2c	ldrb w9,[x19]
00beed30	add x8,x20,x23
00beed34	tbnz w9,#0x0,0x00beedc0
00beed38	lsl w9,w8,#0x1
00beed3c	strb w9,[x19]
00beed40	b 0x00beedc4
00beed44	mov x23,#-0x9
00beed48	mov x0,x23
00beed4c	bl 0x00c2fed0
00beed50	mov x24,x0
00beed54	cbz x21,0x00beed68
00beed58	mov x0,x24
00beed5c	mov x1,x22
00beed60	mov x2,x21
00beed64	bl 0x00c2ff60
00beed68	add x1,x28,#0x1
00beed6c	cmp x1,#0x17
00beed70	b.eq 0x00beed7c
00beed74	mov x0,x22
00beed78	bl 0x00c2fe80
00beed7c	orr x8,x23,#0x1
00beed80	stp x21,x24,[x19, #0x8]
00beed84	mov x1,x25
00beed88	str x8,[x19]
00beed8c	add x22,x24,x21
00beed90	mov x2,x20
00beed94	mov x0,x22
00beed98	bl 0x00c2ff60
00beed9c	strb wzr,[x22, x20]
00beeda0	add x8,x21,x20
00beeda4	ldrb w9,[x19]
00beeda8	tbnz w9,#0x0,0x00beedb8
00beedac	lsl w8,w8,#0x1
00beedb0	strb w8,[x19]
00beedb4	b 0x00beeddc
00beedb8	str x8,[x19, #0x8]
00beedbc	b 0x00beeddc
00beedc0	str x8,[x19, #0x8]
00beedc4	strb wzr,[x22, x8]
00beedc8	cbz w21,0x00beeddc
00beedcc	ldr x8,[sp, #0x8]
00beedd0	ldr x0,[sp, #0x18]
00beedd4	and x1,x8,#-0x2
00beedd8	bl 0x00c2fe80
00beeddc	mov x0,x19
00beede0	ldp x20,x19,[sp, #0x70]
00beede4	ldp x22,x21,[sp, #0x60]
00beede8	ldp x24,x23,[sp, #0x50]
00beedec	ldp x26,x25,[sp, #0x40]
00beedf0	ldp x28,x27,[sp, #0x30]
00beedf4	ldp x29,x30,[sp, #0x20]
00beedf8	add sp,sp,#0x80
00beedfc	autiasp
00beee00	ret
00beee04	bl 0x007fe124

; std::__ndk1::num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get @ 00bdeb58
00bdeb58	paciasp
00bdeb5c	sub sp,sp,#0x90
00bdeb60	stp x29,x30,[sp, #0x50]
00bdeb64	stp x24,x23,[sp, #0x60]
00bdeb68	stp x22,x21,[sp, #0x70]
00bdeb6c	stp x20,x19,[sp, #0x80]
00bdeb70	add x29,sp,#0x50
00bdeb74	ldrb w8,[x3, #0x8]
00bdeb78	mov x19,x5
00bdeb7c	mov x20,x4
00bdeb80	stur x1,[x29, #-0x18]
00bdeb84	tbnz w8,#0x0,0x00bdebbc
00bdeb88	ldr x8,[x0]
00bdeb8c	mov x9,#-0x1
00bdeb90	mov x5,sp
00bdeb94	mov x4,x20
00bdeb98	str x9,[sp]
00bdeb9c	ldr x8,[x8, #0x20]
00bdeba0	blr x8
00bdeba4	ldr x8,[sp]
00bdeba8	cmp x8,#0x1
00bdebac	b.eq 0x00bded68
00bdebb0	cbnz x8,0x00bded70
00bdebb4	strb wzr,[x19]
00bdebb8	b 0x00bded80
00bdebbc	sub x8,x29,#0x20
00bdebc0	mov x0,x3
00bdebc4	mov x21,x2
00bdebc8	mov x23,x3
00bdebcc	bl 0x00c30070
00bdebd0	adrp x24,0xcb5000
00bdebd4	ldr x24,[x24, #0xb98]
00bdebd8	ldur x22,[x29, #-0x20]
00bdebdc	stur x24,[x29, #-0x10]
00bdebe0	ldar x8,[x24]
00bdebe4	cmn x8,#0x1
00bdebe8	b.eq 0x00bdec14
00bdebec	sub x8,x29,#0x10
00bdebf0	mov x9,sp
00bdebf4	str x8,[sp]
00bdebf8	stur x9,[x29, #-0x8]
00bdebfc	adrp x0,0xcb5000
00bdec00	nop
00bdec04	adr x2,0xc0bab0
00bdec08	ldr x0,[x0, #0xb98]
00bdec0c	sub x1,x29,#0x8
00bdec10	bl 0x00c305d0
00bdec14	ldp x8,x10,[x22, #0x10]
00bdec18	ldrsw x9,[x24, #0x8]
00bdec1c	sub x9,x9,#0x1
00bdec20	sub x10,x10,x8
00bdec24	cmp x9,x10, ASR #0x3
00bdec28	b.cs 0x00bded9c
00bdec2c	ldr x22,[x8, x9, LSL #0x3]
00bdec30	cbz x22,0x00bded9c
00bdec34	sub x0,x29,#0x20
00bdec38	bl 0x00c30090
00bdec3c	sub x8,x29,#0x20
00bdec40	mov x0,x23
00bdec44	bl 0x00c30070
00bdec48	adrp x24,0xcb5000
00bdec4c	ldr x24,[x24, #0xc10]
00bdec50	ldur x23,[x29, #-0x20]
00bdec54	stur x24,[x29, #-0x10]
00bdec58	ldar x8,[x24]
00bdec5c	cmn x8,#0x1
00bdec60	b.eq 0x00bdec8c
00bdec64	sub x8,x29,#0x10
00bdec68	mov x9,sp
00bdec6c	str x8,[sp]
00bdec70	stur x9,[x29, #-0x8]
00bdec74	adrp x0,0xcb5000
00bdec78	nop
00bdec7c	adr x2,0xc0bab0
00bdec80	ldr x0,[x0, #0xc10]
00bdec84	sub x1,x29,#0x8
00bdec88	bl 0x00c305d0
00bdec8c	ldp x8,x10,[x23, #0x10]
00bdec90	ldrsw x9,[x24, #0x8]
00bdec94	sub x9,x9,#0x1
00bdec98	sub x10,x10,x8
00bdec9c	cmp x9,x10, ASR #0x3
00bdeca0	b.cs 0x00bdeda0
00bdeca4	ldr x23,[x8, x9, LSL #0x3]
00bdeca8	cbz x23,0x00bdeda0
00bdecac	sub x0,x29,#0x20
00bdecb0	bl 0x00c30090
00bdecb4	ldr x8,[x23]
00bdecb8	ldr x9,[x8, #0x30]
00bdecbc	mov x8,sp
00bdecc0	mov x0,x23
00bdecc4	mov x24,sp
00bdecc8	blr x9
00bdeccc	ldr x8,[x23]
00bdecd0	ldr x9,[x8, #0x38]
00bdecd4	add x8,x24,#0x18
00bdecd8	mov x0,x23
00bdecdc	blr x9
00bdece0	mov x23,sp
00bdece4	sub x0,x29,#0x18
00bdece8	mov x2,sp
00bdecec	add x3,x23,#0x30
00bdecf0	mov x1,x21
00bdecf4	mov x4,x22
00bdecf8	mov x5,x20
00bdecfc	mov w6,#0x1
00bded00	bl 0x00bdede4
00bded04	cmp x0,x23
00bded08	ldrb w8,[sp, #0x18]
00bded0c	ldur x0,[x29, #-0x18]
00bded10	cset w9,eq
00bded14	strb w9,[x19]
00bded18	tbz w8,#0x0,0x00bded3c
00bded1c	ldr x9,[sp, #0x18]
00bded20	ldr x8,[sp, #0x28]
00bded24	mov x19,x0
00bded28	lsl x9,x9,#0x2
00bded2c	mov x0,x8
00bded30	and x1,x9,#-0x8
00bded34	bl 0x00c2fe80
00bded38	mov x0,x19
00bded3c	ldrb w8,[sp]
00bded40	tbz w8,#0x0,0x00bded80
00bded44	ldr x9,[sp]
00bded48	ldr x8,[sp, #0x10]
00bded4c	mov x19,x0
00bded50	lsl x9,x9,#0x2
00bded54	mov x0,x8
00bded58	and x1,x9,#-0x8
00bded5c	bl 0x00c2fe80
00bded60	mov x0,x19
00bded64	b 0x00bded80
00bded68	strb w8,[x19]
00bded6c	b 0x00bded80
00bded70	mov w8,#0x1
00bded74	mov w9,#0x4
00bded78	strb w8,[x19]
00bded7c	str w9,[x20]
00bded80	ldp x20,x19,[sp, #0x80]
00bded84	ldp x22,x21,[sp, #0x70]
00bded88	ldp x24,x23,[sp, #0x60]
00bded8c	ldp x29,x30,[sp, #0x50]
00bded90	add sp,sp,#0x90
00bded94	autiasp
00bded98	ret
00bded9c	bl 0x00bd8968
00bdeda0	bl 0x00bd8968

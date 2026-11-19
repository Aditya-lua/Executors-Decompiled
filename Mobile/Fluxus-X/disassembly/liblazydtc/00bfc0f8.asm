; std::__ndk1::collate_byname<wchar_t>::do_compare @ 00bfc0f8
00bfc0f8	paciasp
00bfc0fc	sub sp,sp,#0x90
00bfc100	stp x29,x30,[sp, #0x30]
00bfc104	str x27,[sp, #0x40]
00bfc108	stp x26,x25,[sp, #0x50]
00bfc10c	stp x24,x23,[sp, #0x60]
00bfc110	stp x22,x21,[sp, #0x70]
00bfc114	stp x20,x19,[sp, #0x80]
00bfc118	add x29,sp,#0x30
00bfc11c	sub x22,x2,x1
00bfc120	mov x25,#-0x9
00bfc124	asr x26,x22,#0x2
00bfc128	movk x25,#0x3fff, LSL #48
00bfc12c	cmp x26,x25
00bfc130	b.hi 0x00bfc2cc
00bfc134	mov x21,x4
00bfc138	mov x20,x3
00bfc13c	mov x23,x2
00bfc140	mov x19,x0
00bfc144	cmp x26,#0x4
00bfc148	b.hi 0x00bfc16c
00bfc14c	lsr w8,w22,#0x1
00bfc150	add x9,sp,#0x18
00bfc154	orr x24,x9,#0x4
00bfc158	and w8,w8,#0xfe
00bfc15c	strb w8,[sp, #0x18]
00bfc160	cmp x23,x1
00bfc164	b.ne 0x00bfc1a4
00bfc168	b 0x00bfc1b0
00bfc16c	orr x8,x26,#0x1
00bfc170	mov w9,#0x8
00bfc174	mov x24,x1
00bfc178	cmp x8,#0x5
00bfc17c	csinc x27,x9,x8,eq
00bfc180	lsl x0,x27,#0x2
00bfc184	bl 0x00c2fed0
00bfc188	mov x1,x24
00bfc18c	mov x24,x0
00bfc190	orr x8,x27,#0x1
00bfc194	stp x26,x0,[sp, #0x20]
00bfc198	str x8,[sp, #0x18]
00bfc19c	cmp x23,x1
00bfc1a0	b.eq 0x00bfc1b0
00bfc1a4	mov x0,x24
00bfc1a8	mov x2,x22
00bfc1ac	bl 0x00c2ffd0
00bfc1b0	sub x23,x21,x20
00bfc1b4	str wzr,[x24, x22#0x0]
00bfc1b8	asr x26,x23,#0x2
00bfc1bc	cmp x26,x25
00bfc1c0	b.hi 0x00bfc2d0
00bfc1c4	cmp x26,#0x4
00bfc1c8	b.hi 0x00bfc298
00bfc1cc	lsr w8,w23,#0x1
00bfc1d0	mov x9,sp
00bfc1d4	orr x22,x9,#0x4
00bfc1d8	and w8,w8,#0xfe
00bfc1dc	strb w8,[sp]
00bfc1e0	cmp x21,x20
00bfc1e4	b.eq 0x00bfc1f8
00bfc1e8	mov x0,x22
00bfc1ec	mov x1,x20
00bfc1f0	mov x2,x23
00bfc1f4	bl 0x00c2ffd0
00bfc1f8	ldrb w24,[sp, #0x18]
00bfc1fc	str wzr,[x22, x23#0x0]
00bfc200	add x8,sp,#0x18
00bfc204	ldr x20,[sp, #0x28]
00bfc208	ldrb w22,[sp]
00bfc20c	orr x8,x8,#0x4
00bfc210	tst w24,#0x1
00bfc214	mov x9,sp
00bfc218	ldr x21,[sp, #0x10]
00bfc21c	csel x0,x8,x20,eq
00bfc220	orr x8,x9,#0x4
00bfc224	tst w22,#0x1
00bfc228	ldr x2,[x19, #0x10]
00bfc22c	csel x1,x8,x21,eq
00bfc230	bl 0x00c439e0
00bfc234	mov w19,w0
00bfc238	tbz w22,#0x0,0x00bfc250
00bfc23c	ldr x8,[sp]
00bfc240	mov x0,x21
00bfc244	lsl x8,x8,#0x2
00bfc248	and x1,x8,#-0x8
00bfc24c	bl 0x00c2fe80
00bfc250	tbz w24,#0x0,0x00bfc268
00bfc254	ldr x8,[sp, #0x18]
00bfc258	mov x0,x20
00bfc25c	lsl x8,x8,#0x2
00bfc260	and x1,x8,#-0x8
00bfc264	bl 0x00c2fe80
00bfc268	cmp w19,#0x0
00bfc26c	cset w8,ne
00bfc270	csinv w0,w8,wzr,ge
00bfc274	ldp x20,x19,[sp, #0x80]
00bfc278	ldr x27,[sp, #0x40]
00bfc27c	ldp x22,x21,[sp, #0x70]
00bfc280	ldp x24,x23,[sp, #0x60]
00bfc284	ldp x26,x25,[sp, #0x50]
00bfc288	ldp x29,x30,[sp, #0x30]
00bfc28c	add sp,sp,#0x90
00bfc290	autiasp
00bfc294	ret
00bfc298	orr x8,x26,#0x1
00bfc29c	mov w9,#0x8
00bfc2a0	cmp x8,#0x5
00bfc2a4	csinc x24,x9,x8,eq
00bfc2a8	lsl x0,x24,#0x2
00bfc2ac	bl 0x00c2fed0
00bfc2b0	mov x22,x0
00bfc2b4	orr x8,x24,#0x1
00bfc2b8	stp x26,x0,[sp, #0x8]
00bfc2bc	str x8,[sp]
00bfc2c0	cmp x21,x20
00bfc2c4	b.ne 0x00bfc1e8
00bfc2c8	b 0x00bfc1f8
00bfc2cc	bl 0x00bc5610
00bfc2d0	bl 0x00bc5610

; std::__ndk1::recursive_timed_mutex::lock @ 00bcd02c
00bcd02c	paciasp
00bcd030	sub sp,sp,#0x30
00bcd034	stp x29,x30,[sp, #0x10]
00bcd038	stp x20,x19,[sp, #0x20]
00bcd03c	add x29,sp,#0x10
00bcd040	mov x19,x0
00bcd044	bl 0x00c31940
00bcd048	mov x20,x0
00bcd04c	mov w8,#0x1
00bcd050	mov x0,x19
00bcd054	str x19,[sp]
00bcd058	strb w8,[sp, #0x8]
00bcd05c	bl 0x00c31ca0
00bcd060	cbnz w0,0x00bcd0d4
00bcd064	ldp x8,x9,[x19, #0x58]
00bcd068	cmp x9,x20
00bcd06c	b.ne 0x00bcd084
00bcd070	cmn x8,#0x1
00bcd074	b.eq 0x00bcd0e0
00bcd078	add x8,x8,#0x1
00bcd07c	str x8,[x19, #0x58]
00bcd080	b 0x00bcd0b8
00bcd084	cbz x8,0x00bcd0b0
00bcd088	add x0,x19,#0x28
00bcd08c	mov x1,sp
00bcd090	bl 0x00c33250
00bcd094	ldr x8,[x19, #0x58]
00bcd098	cbnz x8,0x00bcd088
00bcd09c	ldrb w8,[sp, #0x8]
00bcd0a0	mov w9,#0x1
00bcd0a4	stp x9,x20,[x19, #0x58]
00bcd0a8	tbnz w8,#0x0,0x00bcd0b8
00bcd0ac	b 0x00bcd0c0
00bcd0b0	mov w8,#0x1
00bcd0b4	stp x8,x20,[x19, #0x58]
00bcd0b8	ldr x0,[sp]
00bcd0bc	bl 0x00c31cb0
00bcd0c0	ldp x20,x19,[sp, #0x20]
00bcd0c4	ldp x29,x30,[sp, #0x10]
00bcd0c8	add sp,sp,#0x30
00bcd0cc	autiasp
00bcd0d0	ret
00bcd0d4	adrp x1,0x2be000
00bcd0d8	add x1,x1,#0xc42
00bcd0dc	bl 0x00c2ffc0
00bcd0e0	adrp x1,0x2a6000
00bcd0e4	add x1,x1,#0xee2
00bcd0e8	mov w0,#0xb
00bcd0ec	bl 0x00c2ffc0

; std::__ndk1::collate<char>::do_transform @ 00bda0f8
00bda0f8	paciasp
00bda0fc	stp x29,x30,[sp, #-0x40]!
00bda100	str x23,[sp, #0x10]
00bda104	stp x22,x21,[sp, #0x20]
00bda108	stp x20,x19,[sp, #0x30]
00bda10c	mov x29,sp
00bda110	sub x19,x2,x1
00bda114	cmn x19,#0x8
00bda118	b.cs 0x00bda1a0
00bda11c	mov x21,x2
00bda120	mov x20,x8
00bda124	cmp x19,#0x16
00bda128	b.hi 0x00bda140
00bda12c	lsl w8,w19,#0x1
00bda130	strb w8,[x20], #0x1
00bda134	cmp x21,x1
00bda138	b.ne 0x00bda178
00bda13c	b 0x00bda184
00bda140	orr x8,x19,#0x7
00bda144	mov w9,#0x1a
00bda148	mov x23,x1
00bda14c	cmp x8,#0x17
00bda150	csinc x22,x9,x8,eq
00bda154	mov x0,x22
00bda158	bl 0x00c2fed0
00bda15c	orr x8,x22,#0x1
00bda160	mov x1,x23
00bda164	stp x19,x0,[x20, #0x8]
00bda168	str x8,[x20]
00bda16c	mov x20,x0
00bda170	cmp x21,x1
00bda174	b.eq 0x00bda184
00bda178	mov x0,x20
00bda17c	mov x2,x19
00bda180	bl 0x00c2ffd0
00bda184	strb wzr,[x20, x19]
00bda188	ldp x20,x19,[sp, #0x30]
00bda18c	ldr x23,[sp, #0x10]
00bda190	ldp x22,x21,[sp, #0x20]
00bda194	ldp x29,x30,[sp], #0x40
00bda198	autiasp
00bda19c	ret
00bda1a0	bl 0x007fe124

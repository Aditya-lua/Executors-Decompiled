; std::__ndk1::timed_mutex::lock @ 00bcce50
00bcce50	paciasp
00bcce54	sub sp,sp,#0x30
00bcce58	stp x29,x30,[sp, #0x10]
00bcce5c	str x19,[sp, #0x20]
00bcce60	add x29,sp,#0x10
00bcce64	mov w8,#0x1
00bcce68	mov x19,x0
00bcce6c	str x0,[sp]
00bcce70	strb w8,[sp, #0x8]
00bcce74	bl 0x00c31ca0
00bcce78	cbnz w0,0x00bcced0
00bcce7c	ldrb w8,[x19, #0x58]
00bcce80	tbz w8,#0x0,0x00bcceac
00bcce84	add x0,x19,#0x28
00bcce88	mov x1,sp
00bcce8c	bl 0x00c33250
00bcce90	ldrb w8,[x19, #0x58]
00bcce94	tbnz w8,#0x0,0x00bcce84
00bcce98	ldrb w8,[sp, #0x8]
00bcce9c	mov w9,#0x1
00bccea0	strb w9,[x19, #0x58]
00bccea4	tbnz w8,#0x0,0x00bcceb4
00bccea8	b 0x00bccebc
00bcceac	mov w8,#0x1
00bcceb0	strb w8,[x19, #0x58]
00bcceb4	ldr x0,[sp]
00bcceb8	bl 0x00c31cb0
00bccebc	ldp x29,x30,[sp, #0x10]
00bccec0	ldr x19,[sp, #0x20]
00bccec4	add sp,sp,#0x30
00bccec8	autiasp
00bccecc	ret
00bcced0	adrp x1,0x2be000
00bcced4	add x1,x1,#0xc42
00bcced8	bl 0x00c2ffc0

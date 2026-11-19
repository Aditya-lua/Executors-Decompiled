; std::__ndk1::recursive_timed_mutex::try_lock @ 00bcd108
00bcd108	paciasp
00bcd10c	stp x29,x30,[sp, #-0x30]!
00bcd110	str x21,[sp, #0x10]
00bcd114	stp x20,x19,[sp, #0x20]
00bcd118	mov x29,sp
00bcd11c	mov x19,x0
00bcd120	bl 0x00c31940
00bcd124	mov x20,x0
00bcd128	mov x0,x19
00bcd12c	bl 0x00c43b40
00bcd130	cbz w0,0x00bcd13c
00bcd134	mov w21,wzr
00bcd138	b 0x00bcd170
00bcd13c	ldr x8,[x19, #0x58]
00bcd140	cbz x8,0x00bcd15c
00bcd144	cmn x8,#0x1
00bcd148	mov w21,wzr
00bcd14c	b.eq 0x00bcd168
00bcd150	ldr x9,[x19, #0x60]
00bcd154	cmp x9,x20
00bcd158	b.ne 0x00bcd168
00bcd15c	add x8,x8,#0x1
00bcd160	mov w21,#0x1
00bcd164	stp x8,x20,[x19, #0x58]
00bcd168	mov x0,x19
00bcd16c	bl 0x00c31cb0
00bcd170	mov w0,w21
00bcd174	ldp x20,x19,[sp, #0x20]
00bcd178	ldr x21,[sp, #0x10]
00bcd17c	ldp x29,x30,[sp], #0x30
00bcd180	autiasp
00bcd184	ret

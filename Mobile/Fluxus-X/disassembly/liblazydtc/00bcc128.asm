; std::__ndk1::__assoc_sub_state::set_value @ 00bcc128
00bcc128	paciasp
00bcc12c	sub sp,sp,#0x30
00bcc130	stp x29,x30,[sp, #0x10]
00bcc134	stp x20,x19,[sp, #0x20]
00bcc138	add x29,sp,#0x10
00bcc13c	mov x19,x0
00bcc140	add x0,x0,#0x18
00bcc144	bl 0x00c2ff10
00bcc148	ldrb w8,[x19, #0x70]
00bcc14c	tbnz w8,#0x0,0x00bcc198
00bcc150	ldr x20,[x19, #0x10]
00bcc154	add x0,sp,#0x8
00bcc158	str xzr,[sp, #0x8]
00bcc15c	bl 0x00c31450
00bcc160	cbnz x20,0x00bcc198
00bcc164	ldr w8,[x19, #0x70]
00bcc168	mov w9,#0x5
00bcc16c	add x0,x19,#0x40
00bcc170	orr w8,w8,w9
00bcc174	str w8,[x19, #0x70]
00bcc178	bl 0x00c315e0
00bcc17c	add x0,x19,#0x18
00bcc180	bl 0x00c2ff20
00bcc184	ldp x20,x19,[sp, #0x20]
00bcc188	ldp x29,x30,[sp, #0x10]
00bcc18c	add sp,sp,#0x30
00bcc190	autiasp
00bcc194	ret
00bcc198	mov w0,#0x2
00bcc19c	bl 0x00bcc1b4

; std::__ndk1::locale::~locale @ 00bfae2c
00bfae2c	paciasp
00bfae30	stp x29,x30,[sp, #-0x20]!
00bfae34	str x19,[sp, #0x10]
00bfae38	mov x29,sp
00bfae3c	ldr x19,[x0]
00bfae40	adrp x8,0xd27000
00bfae44	add x8,x8,#0x100
00bfae48	cmp x19,x8
00bfae4c	b.eq 0x00bfae60
00bfae50	add x1,x19,#0x8
00bfae54	mov x0,#-0x1
00bfae58	bl 0x00c2bd10
00bfae5c	cbz x0,0x00bfae70
00bfae60	ldr x19,[sp, #0x10]
00bfae64	ldp x29,x30,[sp], #0x20
00bfae68	autiasp
00bfae6c	ret
00bfae70	ldr x8,[x19]
00bfae74	ldr x16,[x8, #0x10]
00bfae78	mov x0,x19
00bfae7c	ldr x19,[sp, #0x10]
00bfae80	ldp x29,x30,[sp], #0x20
00bfae84	autiasp
00bfae88	br x16

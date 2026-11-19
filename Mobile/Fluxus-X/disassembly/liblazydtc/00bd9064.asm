; std::__ndk1::ios_base::Init::Init @ 00bd9064
00bd9064	paciasp
00bd9068	stp x29,x30,[sp, #-0x20]!
00bd906c	str x19,[sp, #0x10]
00bd9070	mov x29,sp
00bd9074	adrp x8,0xd26000
00bd9078	add x8,x8,#0xfa8
00bd907c	ldarb w8,[x8]
00bd9080	tbz w8,#0x0,0x00bd9094
00bd9084	ldr x19,[sp, #0x10]
00bd9088	ldp x29,x30,[sp], #0x20
00bd908c	autiasp
00bd9090	ret
00bd9094	adrp x0,0xd26000
00bd9098	add x0,x0,#0xfa8
00bd909c	bl 0x00c2fe90
00bd90a0	cbz w0,0x00bd9084
00bd90a4	bl 0x00bd8b14
00bd90a8	nop
00bd90ac	adr x0,0xbd9018
00bd90b0	adrp x1,0xd26000
00bd90b4	add x1,x1,#0xfa1
00bd90b8	nop
00bd90bc	adr x2,0xc48880
00bd90c0	bl 0x00c2fe70
00bd90c4	adrp x0,0xd26000
00bd90c8	add x0,x0,#0xfa8
00bd90cc	ldr x19,[sp, #0x10]
00bd90d0	ldp x29,x30,[sp], #0x20
00bd90d4	autiasp
00bd90d8	b 0x00c2fea0

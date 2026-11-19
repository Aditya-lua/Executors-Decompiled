; std::__ndk1::collate_byname<wchar_t>::~collate_byname @ 00bfc084
00bfc084	paciasp
00bfc088	stp x29,x30,[sp, #-0x20]!
00bfc08c	str x19,[sp, #0x10]
00bfc090	mov x29,sp
00bfc094	adrp x8,0xcb5000
00bfc098	mov x19,x0
00bfc09c	ldr x8,[x8, #0xe10]
00bfc0a0	ldr x0,[x0, #0x10]
00bfc0a4	add x8,x8,#0x10
00bfc0a8	str x8,[x19]
00bfc0ac	bl 0x00c43980
00bfc0b0	mov x0,x19
00bfc0b4	ldr x19,[sp, #0x10]
00bfc0b8	ldp x29,x30,[sp], #0x20
00bfc0bc	autiasp
00bfc0c0	b 0x00c31530

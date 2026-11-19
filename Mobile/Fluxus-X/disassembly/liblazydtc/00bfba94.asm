; std::__ndk1::collate_byname<char>::~collate_byname @ 00bfba94
00bfba94	paciasp
00bfba98	stp x29,x30,[sp, #-0x20]!
00bfba9c	str x19,[sp, #0x10]
00bfbaa0	mov x29,sp
00bfbaa4	adrp x8,0xcb5000
00bfbaa8	mov x19,x0
00bfbaac	ldr x8,[x8, #0xe08]
00bfbab0	ldr x0,[x0, #0x10]
00bfbab4	add x8,x8,#0x10
00bfbab8	str x8,[x19]
00bfbabc	bl 0x00c43980
00bfbac0	mov x0,x19
00bfbac4	ldr x19,[sp, #0x10]
00bfbac8	ldp x29,x30,[sp], #0x20
00bfbacc	autiasp
00bfbad0	b 0x00c31530

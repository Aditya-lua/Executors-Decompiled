; std::__ndk1::collate_byname<wchar_t>::collate_byname @ 00bfbed0
00bfbed0	paciasp
00bfbed4	sub sp,sp,#0x50
00bfbed8	stp x29,x30,[sp, #0x30]
00bfbedc	stp x20,x19,[sp, #0x40]
00bfbee0	add x29,sp,#0x30
00bfbee4	adrp x8,0xcb5000
00bfbee8	mov x20,x1
00bfbeec	mov x19,x0
00bfbef0	ldr x8,[x8, #0xe10]
00bfbef4	sub x9,x2,#0x1
00bfbef8	add x8,x8,#0x10
00bfbefc	stp x8,x9,[x0]
00bfbf00	mov w0,#0x1fbf
00bfbf04	mov x2,xzr
00bfbf08	bl 0x00c43890
00bfbf0c	str x0,[x19, #0x10]
00bfbf10	cbz x0,0x00bfbf28
00bfbf14	ldp x20,x19,[sp, #0x40]
00bfbf18	ldp x29,x30,[sp, #0x30]
00bfbf1c	add sp,sp,#0x50
00bfbf20	autiasp
00bfbf24	ret
00bfbf28	mov x0,sp
00bfbf2c	mov x1,x20
00bfbf30	bl 0x00852d7c
00bfbf34	adrp x0,0x29f000
00bfbf38	add x0,x0,#0xbb
00bfbf3c	add x8,sp,#0x18
00bfbf40	mov x1,sp
00bfbf44	add x20,sp,#0x18
00bfbf48	bl 0x00bfb964
00bfbf4c	ldrb w8,[sp, #0x18]
00bfbf50	ldr x9,[sp, #0x28]
00bfbf54	tst w8,#0x1
00bfbf58	csinc x0,x9,x20,ne
00bfbf5c	bl 0x00c43d00
00bfbf60	ldrb w8,[sp, #0x18]
00bfbf64	mov x20,x0
00bfbf68	tbz w8,#0x0,0x00bfbf84
00bfbf6c	ldr x8,[sp, #0x18]
00bfbf70	ldr x0,[sp, #0x28]
00bfbf74	and x1,x8,#-0x2
00bfbf78	bl 0x00c2fe80
00bfbf7c	b 0x00bfbf84
00bfbf84	ldrb w8,[sp]
00bfbf88	tbz w8,#0x0,0x00bfbfa8
00bfbf8c	ldr x8,[sp]
00bfbf90	ldr x0,[sp, #0x10]
00bfbf94	and x1,x8,#-0x2
00bfbf98	bl 0x00c2fe80
00bfbf9c	b 0x00bfbfa8
00bfbfa8	mov x0,x19
00bfbfac	bl 0x00c31530
00bfbfb0	mov x0,x20
00bfbfb4	bl 0x00c2c090

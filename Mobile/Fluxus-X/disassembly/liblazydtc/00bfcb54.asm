; std::__ndk1::ctype<char>::~ctype @ 00bfcb54
00bfcb54	bti c
00bfcb58	adrp x9,0xcb5000
00bfcb5c	ldr x9,[x9, #0xe18]
00bfcb60	ldr x8,[x0, #0x10]
00bfcb64	add x9,x9,#0x10
00bfcb68	str x9,[x0]
00bfcb6c	cbz x8,0x00bfcba8
00bfcb70	ldrb w9,[x0, #0x18]
00bfcb74	cmp w9,#0x1
00bfcb78	b.ne 0x00bfcba8
00bfcb7c	paciasp
00bfcb80	stp x29,x30,[sp, #-0x20]!
00bfcb84	str x19,[sp, #0x10]
00bfcb88	mov x29,sp
00bfcb8c	mov x19,x0
00bfcb90	mov x0,x8
00bfcb94	bl 0x00c333e0
00bfcb98	mov x0,x19
00bfcb9c	ldr x19,[sp, #0x10]
00bfcba0	ldp x29,x30,[sp], #0x20
00bfcba4	autiasp
00bfcba8	b 0x00c31530

; std::__ndk1::__codecvt_utf8_utf16<char32_t>::do_in @ 00c01b50
00c01b50	paciasp
00c01b54	sub sp,sp,#0x30
00c01b58	stp x29,x30,[sp, #0x10]
00c01b5c	stp x20,x19,[sp, #0x20]
00c01b60	add x29,sp,#0x10
00c01b64	mov x19,x7
00c01b68	mov x9,x6
00c01b6c	mov x8,x5
00c01b70	ldr x6,[x0, #0x10]
00c01b74	ldr w7,[x0, #0x18]
00c01b78	mov x20,x4
00c01b7c	mov x1,x3
00c01b80	mov x0,x2
00c01b84	add x2,sp,#0x8
00c01b88	mov x5,sp
00c01b8c	mov x3,x8
00c01b90	mov x4,x9
00c01b94	bl 0x00c016ec
00c01b98	ldp x9,x8,[sp]
00c01b9c	str x8,[x20]
00c01ba0	str x9,[x19]
00c01ba4	ldp x20,x19,[sp, #0x20]
00c01ba8	ldp x29,x30,[sp, #0x10]
00c01bac	add sp,sp,#0x30
00c01bb0	autiasp
00c01bb4	ret

; std::__ndk1::__codecvt_utf8_utf16<char16_t>::do_in @ 00c01a1c
00c01a1c	paciasp
00c01a20	sub sp,sp,#0x30
00c01a24	stp x29,x30,[sp, #0x10]
00c01a28	stp x20,x19,[sp, #0x20]
00c01a2c	add x29,sp,#0x10
00c01a30	mov x19,x7
00c01a34	mov x9,x6
00c01a38	mov x8,x5
00c01a3c	ldr x6,[x0, #0x10]
00c01a40	ldr w7,[x0, #0x18]
00c01a44	mov x20,x4
00c01a48	mov x1,x3
00c01a4c	mov x0,x2
00c01a50	add x2,sp,#0x8
00c01a54	mov x5,sp
00c01a58	mov x3,x8
00c01a5c	mov x4,x9
00c01a60	bl 0x00bfed18
00c01a64	ldp x9,x8,[sp]
00c01a68	str x8,[x20]
00c01a6c	str x9,[x19]
00c01a70	ldp x20,x19,[sp, #0x20]
00c01a74	ldp x29,x30,[sp, #0x10]
00c01a78	add sp,sp,#0x30
00c01a7c	autiasp
00c01a80	ret

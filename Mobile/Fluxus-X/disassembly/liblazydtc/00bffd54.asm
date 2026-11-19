; std::__ndk1::__codecvt_utf8<wchar_t>::do_in @ 00bffd54
00bffd54	paciasp
00bffd58	sub sp,sp,#0x30
00bffd5c	stp x29,x30,[sp, #0x10]
00bffd60	stp x20,x19,[sp, #0x20]
00bffd64	add x29,sp,#0x10
00bffd68	mov x19,x7
00bffd6c	mov x9,x6
00bffd70	mov x8,x5
00bffd74	ldr x6,[x0, #0x18]
00bffd78	ldr w7,[x0, #0x20]
00bffd7c	mov x20,x4
00bffd80	mov x1,x3
00bffd84	mov x0,x2
00bffd88	add x2,sp,#0x8
00bffd8c	mov x5,sp
00bffd90	mov x3,x8
00bffd94	mov x4,x9
00bffd98	bl 0x00bff66c
00bffd9c	ldp x9,x8,[sp]
00bffda0	str x8,[x20]
00bffda4	str x9,[x19]
00bffda8	ldp x20,x19,[sp, #0x20]
00bffdac	ldp x29,x30,[sp, #0x10]
00bffdb0	add sp,sp,#0x30
00bffdb4	autiasp
00bffdb8	ret

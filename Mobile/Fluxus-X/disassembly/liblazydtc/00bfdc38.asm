; std::__ndk1::ctype_byname<wchar_t>::do_tolower @ 00bfdc38
00bfdc38	paciasp
00bfdc3c	stp x29,x30,[sp, #-0x30]!
00bfdc40	str x21,[sp, #0x10]
00bfdc44	stp x20,x19,[sp, #0x20]
00bfdc48	mov x29,sp
00bfdc4c	mov x19,x1
00bfdc50	cmp x1,x2
00bfdc54	b.eq 0x00bfdc78
00bfdc58	mov x20,x2
00bfdc5c	mov x21,x0
00bfdc60	ldr w0,[x19]
00bfdc64	ldr x1,[x21, #0x10]
00bfdc68	bl 0x00c43b30
00bfdc6c	str w0,[x19], #0x4
00bfdc70	cmp x19,x20
00bfdc74	b.ne 0x00bfdc60
00bfdc78	mov x0,x19
00bfdc7c	ldp x20,x19,[sp, #0x20]
00bfdc80	ldr x21,[sp, #0x10]
00bfdc84	ldp x29,x30,[sp], #0x30
00bfdc88	autiasp
00bfdc8c	ret

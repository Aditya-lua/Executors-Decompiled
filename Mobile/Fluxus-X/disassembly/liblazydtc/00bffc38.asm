; std::__ndk1::codecvt<char32_t,char8_t,mbstate_t>::do_in @ 00bffc38
00bffc38	paciasp
00bffc3c	sub sp,sp,#0x30
00bffc40	stp x29,x30,[sp, #0x10]
00bffc44	stp x20,x19,[sp, #0x20]
00bffc48	add x29,sp,#0x10
00bffc4c	mov x8,x5
00bffc50	mov x19,x7
00bffc54	mov x20,x4
00bffc58	mov x1,x3
00bffc5c	mov x0,x2
00bffc60	add x2,sp,#0x8
00bffc64	mov x5,sp
00bffc68	mov x3,x8
00bffc6c	mov x4,x6
00bffc70	mov w6,#0x10ffff
00bffc74	mov w7,wzr
00bffc78	bl 0x00bff66c
00bffc7c	ldp x9,x8,[sp]
00bffc80	str x8,[x20]
00bffc84	str x9,[x19]
00bffc88	ldp x20,x19,[sp, #0x20]
00bffc8c	ldp x29,x30,[sp, #0x10]
00bffc90	add sp,sp,#0x30
00bffc94	autiasp
00bffc98	ret

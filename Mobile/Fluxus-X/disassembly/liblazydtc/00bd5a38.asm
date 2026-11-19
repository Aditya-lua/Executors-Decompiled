; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::sentry @ 00bd5a38
00bd5a38	bti c
00bd5a3c	ldr x8,[x1]
00bd5a40	strb wzr,[x0]
00bd5a44	str x1,[x0, #0x8]
00bd5a48	ldur x8,[x8, #-0x18]
00bd5a4c	add x8,x1,x8
00bd5a50	ldr w9,[x8, #0x20]
00bd5a54	cbz w9,0x00bd5a5c
00bd5a58	ret
00bd5a5c	ldr x8,[x8, #0x88]
00bd5a60	cbz x8,0x00bd5a90
00bd5a64	paciasp
00bd5a68	stp x29,x30,[sp, #-0x20]!
00bd5a6c	str x19,[sp, #0x10]
00bd5a70	mov x29,sp
00bd5a74	mov x19,x0
00bd5a78	mov x0,x8
00bd5a7c	bl 0x00c44030
00bd5a80	mov x0,x19
00bd5a84	ldr x19,[sp, #0x10]
00bd5a88	ldp x29,x30,[sp], #0x20
00bd5a8c	autiasp
00bd5a90	mov w8,#0x1
00bd5a94	strb w8,[x0]
00bd5a98	ret

; std::__ndk1::__codecvt_utf8_utf16<wchar_t>::do_out @ 00c013f8
00c013f8	paciasp
00c013fc	sub sp,sp,#0x30
00c01400	stp x29,x30,[sp, #0x10]
00c01404	stp x20,x19,[sp, #0x20]
00c01408	add x29,sp,#0x10
00c0140c	mov x19,x7
00c01410	mov x9,x6
00c01414	mov x8,x5
00c01418	ldr x6,[x0, #0x18]
00c0141c	ldr w7,[x0, #0x20]
00c01420	mov x20,x4
00c01424	mov x1,x3
00c01428	mov x0,x2
00c0142c	add x2,sp,#0x8
00c01430	mov x5,sp
00c01434	mov x3,x8
00c01438	mov x4,x9
00c0143c	bl 0x00c01460
00c01440	ldp x9,x8,[sp]
00c01444	str x8,[x20]
00c01448	str x9,[x19]
00c0144c	ldp x20,x19,[sp, #0x20]
00c01450	ldp x29,x30,[sp, #0x10]
00c01454	add sp,sp,#0x30
00c01458	autiasp
00c0145c	ret

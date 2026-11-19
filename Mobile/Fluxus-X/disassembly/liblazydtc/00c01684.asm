; std::__ndk1::__codecvt_utf8_utf16<wchar_t>::do_in @ 00c01684
00c01684	paciasp
00c01688	sub sp,sp,#0x30
00c0168c	stp x29,x30,[sp, #0x10]
00c01690	stp x20,x19,[sp, #0x20]
00c01694	add x29,sp,#0x10
00c01698	mov x19,x7
00c0169c	mov x9,x6
00c016a0	mov x8,x5
00c016a4	ldr x6,[x0, #0x18]
00c016a8	ldr w7,[x0, #0x20]
00c016ac	mov x20,x4
00c016b0	mov x1,x3
00c016b4	mov x0,x2
00c016b8	add x2,sp,#0x8
00c016bc	mov x5,sp
00c016c0	mov x3,x8
00c016c4	mov x4,x9
00c016c8	bl 0x00c016ec
00c016cc	ldp x9,x8,[sp]
00c016d0	str x8,[x20]
00c016d4	str x9,[x19]
00c016d8	ldp x20,x19,[sp, #0x20]
00c016dc	ldp x29,x30,[sp, #0x10]
00c016e0	add sp,sp,#0x30
00c016e4	autiasp
00c016e8	ret

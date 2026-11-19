; std::__ndk1::time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00beca0c
00beca0c	paciasp
00beca10	sub sp,sp,#0x1d0
00beca14	stp x29,x30,[sp, #0x1a0]
00beca18	stp x28,x21,[sp, #0x1b0]
00beca1c	stp x20,x19,[sp, #0x1c0]
00beca20	add x29,sp,#0x1a0
00beca24	add x21,sp,#0x10
00beca28	mov x3,x4
00beca2c	mov x19,x1
00beca30	add x8,x21,#0x190
00beca34	add x0,x0,#0x10
00beca38	add x1,sp,#0x10
00beca3c	add x2,sp,#0x8
00beca40	mov w4,w5
00beca44	mov w5,w6
00beca48	str x8,[sp, #0x8]
00beca4c	bl 0x00c441f0
00beca50	ldr x20,[sp, #0x8]
00beca54	cmp x21,x20
00beca58	b.eq 0x00becaac
00beca5c	add x21,sp,#0x10
00beca60	b 0x00beca80
00beca64	str w1,[x8], #0x4
00beca68	str x8,[x19, #0x30]
00beca6c	cmn w1,#0x1
00beca70	csel x19,xzr,x19,eq
00beca74	add x21,x21,#0x4
00beca78	cmp x21,x20
00beca7c	b.eq 0x00becaac
00beca80	cbz x19,0x00beca74
00beca84	ldp x8,x9,[x19, #0x30]
00beca88	ldr w1,[x21]
00beca8c	cmp x8,x9
00beca90	b.ne 0x00beca64
00beca94	ldr x8,[x19]
00beca98	mov x0,x19
00beca9c	ldr x8,[x8, #0x68]
00becaa0	blr x8
00becaa4	mov w1,w0
00becaa8	b 0x00beca6c
00becaac	mov x0,x19
00becab0	ldp x20,x19,[sp, #0x1c0]
00becab4	ldp x28,x21,[sp, #0x1b0]
00becab8	ldp x29,x30,[sp, #0x1a0]
00becabc	add sp,sp,#0x1d0
00becac0	autiasp
00becac4	ret

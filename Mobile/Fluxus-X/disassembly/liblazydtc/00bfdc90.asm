; std::__ndk1::ctype_byname<wchar_t>::do_widen @ 00bfdc90
00bfdc90	paciasp
00bfdc94	sub sp,sp,#0x30
00bfdc98	stp x29,x30,[sp, #0x10]
00bfdc9c	stp x20,x19,[sp, #0x20]
00bfdca0	add x29,sp,#0x10
00bfdca4	ldr x0,[x0, #0x10]
00bfdca8	mov w20,w1
00bfdcac	bl 0x00c43880
00bfdcb0	mov x19,x0
00bfdcb4	str x0,[sp, #0x8]
00bfdcb8	and w0,w20,#0xff
00bfdcbc	bl 0x00c43b70
00bfdcc0	mov w20,w0
00bfdcc4	cbz x19,0x00bfdcd0
00bfdcc8	mov x0,x19
00bfdccc	bl 0x00c43880
00bfdcd0	mov w0,w20
00bfdcd4	ldp x20,x19,[sp, #0x20]
00bfdcd8	ldp x29,x30,[sp, #0x10]
00bfdcdc	add sp,sp,#0x30
00bfdce0	autiasp
00bfdce4	ret

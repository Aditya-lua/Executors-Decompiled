; std::__ndk1::ctype_byname<wchar_t>::do_widen @ 00bfdd00
00bfdd00	paciasp
00bfdd04	sub sp,sp,#0x50
00bfdd08	stp x29,x30,[sp, #0x10]
00bfdd0c	stp x24,x23,[sp, #0x20]
00bfdd10	stp x22,x21,[sp, #0x30]
00bfdd14	stp x20,x19,[sp, #0x40]
00bfdd18	add x29,sp,#0x10
00bfdd1c	mov x19,x1
00bfdd20	cmp x1,x2
00bfdd24	b.eq 0x00bfdd78
00bfdd28	mov x20,x3
00bfdd2c	mov x21,x2
00bfdd30	mov x22,x0
00bfdd34	b 0x00bfdd48
00bfdd38	add x19,x19,#0x1
00bfdd3c	str w23,[x20], #0x4
00bfdd40	cmp x19,x21
00bfdd44	b.eq 0x00bfdd78
00bfdd48	ldr x0,[x22, #0x10]
00bfdd4c	ldrb w23,[x19]
00bfdd50	bl 0x00c43880
00bfdd54	mov x24,x0
00bfdd58	str x0,[sp, #0x8]
00bfdd5c	mov w0,w23
00bfdd60	bl 0x00c43b70
00bfdd64	mov w23,w0
00bfdd68	cbz x24,0x00bfdd38
00bfdd6c	mov x0,x24
00bfdd70	bl 0x00c43880
00bfdd74	b 0x00bfdd38
00bfdd78	mov x0,x19
00bfdd7c	ldp x20,x19,[sp, #0x40]
00bfdd80	ldp x22,x21,[sp, #0x30]
00bfdd84	ldp x24,x23,[sp, #0x20]
00bfdd88	ldp x29,x30,[sp, #0x10]
00bfdd8c	add sp,sp,#0x50
00bfdd90	autiasp
00bfdd94	ret

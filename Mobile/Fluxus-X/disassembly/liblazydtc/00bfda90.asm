; std::__ndk1::ctype_byname<wchar_t>::do_scan_not @ 00bfda90
00bfda90	paciasp
00bfda94	stp x29,x30,[sp, #-0x40]!
00bfda98	str x23,[sp, #0x10]
00bfda9c	stp x22,x21,[sp, #0x20]
00bfdaa0	stp x20,x19,[sp, #0x30]
00bfdaa4	mov x29,sp
00bfdaa8	mov x19,x2
00bfdaac	cmp x2,x3
00bfdab0	b.eq 0x00bfdb9c
00bfdab4	mov x20,x3
00bfdab8	mov x21,x1
00bfdabc	mov x22,x0
00bfdac0	b 0x00bfdae0
00bfdac4	ldr x1,[x22, #0x10]
00bfdac8	mov w0,w23
00bfdacc	bl 0x00c43a90
00bfdad0	cbz w0,0x00bfdae8
00bfdad4	add x19,x19,#0x4
00bfdad8	cmp x19,x20
00bfdadc	b.eq 0x00bfdb9c
00bfdae0	ldr w23,[x19]
00bfdae4	tbnz w21,#0x0,0x00bfdac4
00bfdae8	tbz w21,#0x1,0x00bfdafc
00bfdaec	ldr x1,[x22, #0x10]
00bfdaf0	mov w0,w23
00bfdaf4	bl 0x00c43ab0
00bfdaf8	cbnz w0,0x00bfdad4
00bfdafc	tbz w21,#0x2,0x00bfdb10
00bfdb00	ldr x1,[x22, #0x10]
00bfdb04	mov w0,w23
00bfdb08	bl 0x00c43860
00bfdb0c	cbnz w0,0x00bfdad4
00bfdb10	tbz w21,#0x3,0x00bfdb24
00bfdb14	ldr x1,[x22, #0x10]
00bfdb18	mov w0,w23
00bfdb1c	bl 0x00c43a00
00bfdb20	cbnz w0,0x00bfdad4
00bfdb24	tbz w21,#0x4,0x00bfdb38
00bfdb28	ldr x1,[x22, #0x10]
00bfdb2c	mov w0,w23
00bfdb30	bl 0x00c437d0
00bfdb34	cbnz w0,0x00bfdad4
00bfdb38	tbz w21,#0x5,0x00bfdb4c
00bfdb3c	ldr x1,[x22, #0x10]
00bfdb40	mov w0,w23
00bfdb44	bl 0x00c43ac0
00bfdb48	cbnz w0,0x00bfdad4
00bfdb4c	tbz w21,#0x6,0x00bfdb60
00bfdb50	ldr x1,[x22, #0x10]
00bfdb54	mov w0,w23
00bfdb58	bl 0x00c439b0
00bfdb5c	cbnz w0,0x00bfdad4
00bfdb60	tbz w21,#0x7,0x00bfdb74
00bfdb64	ldr x1,[x22, #0x10]
00bfdb68	mov w0,w23
00bfdb6c	bl 0x00c43870
00bfdb70	cbnz w0,0x00bfdad4
00bfdb74	tbz w21,#0x8,0x00bfdb88
00bfdb78	ldr x1,[x22, #0x10]
00bfdb7c	mov w0,w23
00bfdb80	bl 0x00c43ba0
00bfdb84	cbnz w0,0x00bfdad4
00bfdb88	tbz w21,#0x9,0x00bfdb9c
00bfdb8c	ldr x1,[x22, #0x10]
00bfdb90	mov w0,w23
00bfdb94	bl 0x00c43a10
00bfdb98	cbnz w0,0x00bfdad4
00bfdb9c	mov x0,x19
00bfdba0	ldp x20,x19,[sp, #0x30]
00bfdba4	ldr x23,[sp, #0x10]
00bfdba8	ldp x22,x21,[sp, #0x20]
00bfdbac	ldp x29,x30,[sp], #0x40
00bfdbb0	autiasp
00bfdbb4	ret

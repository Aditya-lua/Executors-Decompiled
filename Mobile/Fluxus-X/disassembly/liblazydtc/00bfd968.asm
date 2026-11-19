; std::__ndk1::ctype_byname<wchar_t>::do_scan_is @ 00bfd968
00bfd968	paciasp
00bfd96c	stp x29,x30,[sp, #-0x40]!
00bfd970	str x23,[sp, #0x10]
00bfd974	stp x22,x21,[sp, #0x20]
00bfd978	stp x20,x19,[sp, #0x30]
00bfd97c	mov x29,sp
00bfd980	mov x19,x2
00bfd984	cmp x2,x3
00bfd988	b.eq 0x00bfda74
00bfd98c	mov x20,x3
00bfd990	mov x21,x1
00bfd994	mov x22,x0
00bfd998	b 0x00bfd9a8
00bfd99c	add x19,x19,#0x4
00bfd9a0	cmp x19,x20
00bfd9a4	b.eq 0x00bfda74
00bfd9a8	ldr w23,[x19]
00bfd9ac	tbz w21,#0x0,0x00bfd9c0
00bfd9b0	ldr x1,[x22, #0x10]
00bfd9b4	mov w0,w23
00bfd9b8	bl 0x00c43a90
00bfd9bc	cbnz w0,0x00bfda74
00bfd9c0	tbz w21,#0x1,0x00bfd9d4
00bfd9c4	ldr x1,[x22, #0x10]
00bfd9c8	mov w0,w23
00bfd9cc	bl 0x00c43ab0
00bfd9d0	cbnz w0,0x00bfda74
00bfd9d4	tbz w21,#0x2,0x00bfd9e8
00bfd9d8	ldr x1,[x22, #0x10]
00bfd9dc	mov w0,w23
00bfd9e0	bl 0x00c43860
00bfd9e4	cbnz w0,0x00bfda74
00bfd9e8	tbz w21,#0x3,0x00bfd9fc
00bfd9ec	ldr x1,[x22, #0x10]
00bfd9f0	mov w0,w23
00bfd9f4	bl 0x00c43a00
00bfd9f8	cbnz w0,0x00bfda74
00bfd9fc	tbz w21,#0x4,0x00bfda10
00bfda00	ldr x1,[x22, #0x10]
00bfda04	mov w0,w23
00bfda08	bl 0x00c437d0
00bfda0c	cbnz w0,0x00bfda74
00bfda10	tbz w21,#0x5,0x00bfda24
00bfda14	ldr x1,[x22, #0x10]
00bfda18	mov w0,w23
00bfda1c	bl 0x00c43ac0
00bfda20	cbnz w0,0x00bfda74
00bfda24	tbz w21,#0x6,0x00bfda38
00bfda28	ldr x1,[x22, #0x10]
00bfda2c	mov w0,w23
00bfda30	bl 0x00c439b0
00bfda34	cbnz w0,0x00bfda74
00bfda38	tbz w21,#0x7,0x00bfda4c
00bfda3c	ldr x1,[x22, #0x10]
00bfda40	mov w0,w23
00bfda44	bl 0x00c43870
00bfda48	cbnz w0,0x00bfda74
00bfda4c	tbz w21,#0x8,0x00bfda60
00bfda50	ldr x1,[x22, #0x10]
00bfda54	mov w0,w23
00bfda58	bl 0x00c43ba0
00bfda5c	cbnz w0,0x00bfda74
00bfda60	tbz w21,#0x9,0x00bfd99c
00bfda64	ldr x1,[x22, #0x10]
00bfda68	mov w0,w23
00bfda6c	bl 0x00c43a10
00bfda70	cbz w0,0x00bfd99c
00bfda74	mov x0,x19
00bfda78	ldp x20,x19,[sp, #0x30]
00bfda7c	ldr x23,[sp, #0x10]
00bfda80	ldp x22,x21,[sp, #0x20]
00bfda84	ldp x29,x30,[sp], #0x40
00bfda88	autiasp
00bfda8c	ret

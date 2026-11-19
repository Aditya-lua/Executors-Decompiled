; std::__ndk1::ctype_byname<wchar_t>::ctype_byname @ 00bfd580
00bfd580	paciasp
00bfd584	sub sp,sp,#0x40
00bfd588	stp x29,x30,[sp, #0x20]
00bfd58c	stp x20,x19,[sp, #0x30]
00bfd590	add x29,sp,#0x20
00bfd594	adrp x8,0xcb5000
00bfd598	sub x9,x2,#0x1
00bfd59c	mov x20,x1
00bfd5a0	ldr x8,[x8, #0xe28]
00bfd5a4	mov x19,x0
00bfd5a8	add x8,x8,#0x10
00bfd5ac	stp x8,x9,[x0]
00bfd5b0	ldrb w8,[x1]
00bfd5b4	ldr x9,[x1, #0x10]
00bfd5b8	tst w8,#0x1
00bfd5bc	csinc x1,x9,x1,ne
00bfd5c0	mov w0,#0x1fbf
00bfd5c4	mov x2,xzr
00bfd5c8	bl 0x00c43890
00bfd5cc	str x0,[x19, #0x10]
00bfd5d0	cbz x0,0x00bfd5e8
00bfd5d4	ldp x20,x19,[sp, #0x30]
00bfd5d8	ldp x29,x30,[sp, #0x20]
00bfd5dc	add sp,sp,#0x40
00bfd5e0	autiasp
00bfd5e4	ret
00bfd5e8	adrp x0,0x2d8000
00bfd5ec	add x0,x0,#0xe00
00bfd5f0	add x8,sp,#0x8
00bfd5f4	mov x1,x20
00bfd5f8	add x20,sp,#0x8
00bfd5fc	bl 0x00c304a0
00bfd600	ldrb w8,[sp, #0x8]
00bfd604	ldr x9,[sp, #0x18]
00bfd608	tst w8,#0x1
00bfd60c	csinc x0,x9,x20,ne
00bfd610	bl 0x00c43d00
00bfd614	ldrb w8,[sp, #0x8]
00bfd618	mov x20,x0
00bfd61c	tbz w8,#0x0,0x00bfd63c
00bfd620	ldr x8,[sp, #0x8]
00bfd624	ldr x0,[sp, #0x18]
00bfd628	and x1,x8,#-0x2
00bfd62c	bl 0x00c2fe80
00bfd630	b 0x00bfd63c
00bfd63c	mov x0,x19
00bfd640	bl 0x00c44510
00bfd644	mov x0,x20
00bfd648	bl 0x00c2c090

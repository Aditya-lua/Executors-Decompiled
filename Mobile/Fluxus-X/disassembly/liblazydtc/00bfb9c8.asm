; std::__ndk1::collate_byname<char>::collate_byname @ 00bfb9c8
00bfb9c8	paciasp
00bfb9cc	sub sp,sp,#0x40
00bfb9d0	stp x29,x30,[sp, #0x20]
00bfb9d4	stp x20,x19,[sp, #0x30]
00bfb9d8	add x29,sp,#0x20
00bfb9dc	adrp x8,0xcb5000
00bfb9e0	sub x9,x2,#0x1
00bfb9e4	mov x20,x1
00bfb9e8	ldr x8,[x8, #0xe08]
00bfb9ec	mov x19,x0
00bfb9f0	add x8,x8,#0x10
00bfb9f4	stp x8,x9,[x0]
00bfb9f8	ldrb w8,[x1]
00bfb9fc	ldr x9,[x1, #0x10]
00bfba00	tst w8,#0x1
00bfba04	csinc x1,x9,x1,ne
00bfba08	mov w0,#0x1fbf
00bfba0c	mov x2,xzr
00bfba10	bl 0x00c43890
00bfba14	str x0,[x19, #0x10]
00bfba18	cbz x0,0x00bfba30
00bfba1c	ldp x20,x19,[sp, #0x30]
00bfba20	ldp x29,x30,[sp, #0x20]
00bfba24	add sp,sp,#0x40
00bfba28	autiasp
00bfba2c	ret
00bfba30	adrp x0,0x2b3000
00bfba34	add x0,x0,#0x21c
00bfba38	add x8,sp,#0x8
00bfba3c	mov x1,x20
00bfba40	add x20,sp,#0x8
00bfba44	bl 0x00c304a0
00bfba48	ldrb w8,[sp, #0x8]
00bfba4c	ldr x9,[sp, #0x18]
00bfba50	tst w8,#0x1
00bfba54	csinc x0,x9,x20,ne
00bfba58	bl 0x00c43d00
00bfba5c	ldrb w8,[sp, #0x8]
00bfba60	mov x20,x0
00bfba64	tbz w8,#0x0,0x00bfba84
00bfba68	ldr x8,[sp, #0x8]
00bfba6c	ldr x0,[sp, #0x18]
00bfba70	and x1,x8,#-0x2
00bfba74	bl 0x00c2fe80
00bfba78	b 0x00bfba84
00bfba84	mov x0,x19
00bfba88	bl 0x00c31530
00bfba8c	mov x0,x20
00bfba90	bl 0x00c2c090

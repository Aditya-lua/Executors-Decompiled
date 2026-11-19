; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get @ 00bcfeec
00bcfeec	paciasp
00bcfef0	sub sp,sp,#0x40
00bcfef4	stp x29,x30,[sp, #0x10]
00bcfef8	stp x22,x21,[sp, #0x20]
00bcfefc	stp x20,x19,[sp, #0x30]
00bcff00	add x29,sp,#0x10
00bcff04	ldr x8,[x0]
00bcff08	mov x20,x0
00bcff0c	mov x19,x2
00bcff10	mov x21,x1
00bcff14	ldur x9,[x8, #-0x18]
00bcff18	add x8,sp,#0x8
00bcff1c	add x0,x0,x9
00bcff20	bl 0x00c30070
00bcff24	adrp x1,0xcb4000
00bcff28	add x0,sp,#0x8
00bcff2c	ldr x1,[x1, #0x998]
00bcff30	bl 0x00c30080
00bcff34	ldr x8,[x0]
00bcff38	ldr x8,[x8, #0x38]
00bcff3c	mov w1,#0xa
00bcff40	blr x8
00bcff44	mov w22,w0
00bcff48	add x0,sp,#0x8
00bcff4c	bl 0x00c30090
00bcff50	mov x0,x20
00bcff54	mov x1,x21
00bcff58	mov x2,x19
00bcff5c	mov w3,w22
00bcff60	bl 0x00c43fd0
00bcff64	ldp x20,x19,[sp, #0x30]
00bcff68	ldp x22,x21,[sp, #0x20]
00bcff6c	ldp x29,x30,[sp, #0x10]
00bcff70	add sp,sp,#0x40
00bcff74	autiasp
00bcff78	ret

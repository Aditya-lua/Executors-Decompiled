; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get @ 00bd017c
00bd017c	paciasp
00bd0180	stp x29,x30,[sp, #-0x30]!
00bd0184	str x21,[sp, #0x10]
00bd0188	stp x20,x19,[sp, #0x20]
00bd018c	mov x29,sp
00bd0190	ldr x8,[x0]
00bd0194	mov x19,x0
00bd0198	mov x20,x1
00bd019c	ldur x9,[x8, #-0x18]
00bd01a0	add x8,x29,#0x18
00bd01a4	add x0,x0,x9
00bd01a8	bl 0x00c30070
00bd01ac	adrp x1,0xcb4000
00bd01b0	add x0,x29,#0x18
00bd01b4	ldr x1,[x1, #0x998]
00bd01b8	bl 0x00c30080
00bd01bc	ldr x8,[x0]
00bd01c0	ldr x8,[x8, #0x38]
00bd01c4	mov w1,#0xa
00bd01c8	blr x8
00bd01cc	mov w21,w0
00bd01d0	add x0,x29,#0x18
00bd01d4	bl 0x00c30090
00bd01d8	mov x0,x19
00bd01dc	mov x1,x20
00bd01e0	mov w2,w21
00bd01e4	bl 0x00c43fe0
00bd01e8	ldp x20,x19,[sp, #0x20]
00bd01ec	ldr x21,[sp, #0x10]
00bd01f0	ldp x29,x30,[sp], #0x30
00bd01f4	autiasp
00bd01f8	ret

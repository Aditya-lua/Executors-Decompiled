; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::getline @ 00bd0384
00bd0384	paciasp
00bd0388	sub sp,sp,#0x40
00bd038c	stp x29,x30,[sp, #0x10]
00bd0390	stp x22,x21,[sp, #0x20]
00bd0394	stp x20,x19,[sp, #0x30]
00bd0398	add x29,sp,#0x10
00bd039c	ldr x8,[x0]
00bd03a0	mov x20,x0
00bd03a4	mov x19,x2
00bd03a8	mov x21,x1
00bd03ac	ldur x9,[x8, #-0x18]
00bd03b0	add x8,sp,#0x8
00bd03b4	add x0,x0,x9
00bd03b8	bl 0x00c30070
00bd03bc	adrp x1,0xcb4000
00bd03c0	add x0,sp,#0x8
00bd03c4	ldr x1,[x1, #0x998]
00bd03c8	bl 0x00c30080
00bd03cc	ldr x8,[x0]
00bd03d0	ldr x8,[x8, #0x38]
00bd03d4	mov w1,#0xa
00bd03d8	blr x8
00bd03dc	mov w22,w0
00bd03e0	add x0,sp,#0x8
00bd03e4	bl 0x00c30090
00bd03e8	mov x0,x20
00bd03ec	mov x1,x21
00bd03f0	mov x2,x19
00bd03f4	mov w3,w22
00bd03f8	bl 0x00c43ff0
00bd03fc	ldp x20,x19,[sp, #0x30]
00bd0400	ldp x22,x21,[sp, #0x20]
00bd0404	ldp x29,x30,[sp, #0x10]
00bd0408	add sp,sp,#0x40
00bd040c	autiasp
00bd0410	ret

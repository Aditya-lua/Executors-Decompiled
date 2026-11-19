; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get @ 00bd4560
00bd4560	paciasp
00bd4564	sub sp,sp,#0x40
00bd4568	stp x29,x30,[sp, #0x10]
00bd456c	stp x22,x21,[sp, #0x20]
00bd4570	stp x20,x19,[sp, #0x30]
00bd4574	add x29,sp,#0x10
00bd4578	ldr x8,[x0]
00bd457c	mov x20,x0
00bd4580	mov x19,x2
00bd4584	mov x21,x1
00bd4588	ldur x9,[x8, #-0x18]
00bd458c	add x8,sp,#0x8
00bd4590	add x0,x0,x9
00bd4594	bl 0x00c30070
00bd4598	adrp x1,0xcb5000
00bd459c	add x0,sp,#0x8
00bd45a0	ldr x1,[x1, #0xb98]
00bd45a4	bl 0x00c30080
00bd45a8	ldr x8,[x0]
00bd45ac	ldr x8,[x8, #0x58]
00bd45b0	mov w1,#0xa
00bd45b4	blr x8
00bd45b8	mov w22,w0
00bd45bc	add x0,sp,#0x8
00bd45c0	bl 0x00c30090
00bd45c4	mov x0,x20
00bd45c8	mov x1,x21
00bd45cc	mov x2,x19
00bd45d0	mov w3,w22
00bd45d4	bl 0x00c44080
00bd45d8	ldp x20,x19,[sp, #0x30]
00bd45dc	ldp x22,x21,[sp, #0x20]
00bd45e0	ldp x29,x30,[sp, #0x10]
00bd45e4	add sp,sp,#0x40
00bd45e8	autiasp
00bd45ec	ret

; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sync @ 00bd5458
00bd5458	paciasp
00bd545c	sub sp,sp,#0x30
00bd5460	stp x29,x30,[sp, #0x10]
00bd5464	stp x20,x19,[sp, #0x20]
00bd5468	add x29,sp,#0x10
00bd546c	mov x19,x0
00bd5470	sub x0,x29,#0x4
00bd5474	mov w2,#0x1
00bd5478	mov x1,x19
00bd547c	bl 0x00c44060
00bd5480	ldr x8,[x19]
00bd5484	ldur x8,[x8, #-0x18]
00bd5488	add x8,x19,x8
00bd548c	ldr x0,[x8, #0x28]
00bd5490	cbz x0,0x00bd54d8
00bd5494	ldurb w8,[x29, #-0x4]
00bd5498	cmp w8,#0x1
00bd549c	b.ne 0x00bd54e0
00bd54a0	ldr x8,[x0]
00bd54a4	ldr x8,[x8, #0x30]
00bd54a8	blr x8
00bd54ac	cmn w0,#0x1
00bd54b0	cset w8,eq
00bd54b4	csetm w20,eq
00bd54b8	ldr x9,[x19]
00bd54bc	ldur x9,[x9, #-0x18]
00bd54c0	add x0,x19,x9
00bd54c4	ldr w9,[x0, #0x20]
00bd54c8	orr w1,w9,w8
00bd54cc	bl 0x00c30130
00bd54d0	mov w0,w20
00bd54d4	b 0x00bd54e4
00bd54d8	mov w0,#0xffffffff
00bd54dc	b 0x00bd54e4
00bd54e0	mov w0,wzr
00bd54e4	ldp x20,x19,[sp, #0x20]
00bd54e8	ldp x29,x30,[sp, #0x10]
00bd54ec	add sp,sp,#0x30
00bd54f0	autiasp
00bd54f4	ret

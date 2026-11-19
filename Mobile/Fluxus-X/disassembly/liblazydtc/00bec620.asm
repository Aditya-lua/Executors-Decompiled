; std::__ndk1::time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00bec620
00bec620	paciasp
00bec624	sub sp,sp,#0xa0
00bec628	stp x29,x30,[sp, #0x70]
00bec62c	str x21,[sp, #0x80]
00bec630	stp x20,x19,[sp, #0x90]
00bec634	add x29,sp,#0x70
00bec638	mov x3,x4
00bec63c	mov x19,x1
00bec640	mov w8,#0x25
00bec644	tst w6,#0xff
00bec648	strb w8,[x29, #0x1c]
00bec64c	strb w5,[x29, #0x1d]
00bec650	strb w6,[x29, #0x1e]
00bec654	strb wzr,[x29, #0x1f]
00bec658	b.eq 0x00bec664
00bec65c	strb w6,[x29, #0x1d]
00bec660	strb w5,[x29, #0x1e]
00bec664	ldr x4,[x0, #0x10]
00bec668	add x0,sp,#0xc
00bec66c	add x2,x29,#0x1c
00bec670	mov w1,#0x64
00bec674	bl 0x00c43b60
00bec678	cbz x0,0x00bec6d0
00bec67c	mov x20,x0
00bec680	add x21,sp,#0xc
00bec684	b 0x00bec6ac
00bec688	ldr x8,[x19]
00bec68c	mov x0,x19
00bec690	ldr x8,[x8, #0x68]
00bec694	blr x8
00bec698	cmn w0,#0x1
00bec69c	csel x19,xzr,x19,eq
00bec6a0	subs x20,x20,#0x1
00bec6a4	add x21,x21,#0x1
00bec6a8	b.eq 0x00bec6d0
00bec6ac	cbz x19,0x00bec6a0
00bec6b0	ldp x8,x9,[x19, #0x30]
00bec6b4	ldrb w1,[x21]
00bec6b8	cmp x8,x9
00bec6bc	b.eq 0x00bec688
00bec6c0	add x9,x8,#0x1
00bec6c4	str x9,[x19, #0x30]
00bec6c8	strb w1,[x8]
00bec6cc	b 0x00bec6a0
00bec6d0	mov x0,x19
00bec6d4	ldp x20,x19,[sp, #0x90]
00bec6d8	ldr x21,[sp, #0x80]
00bec6dc	ldp x29,x30,[sp, #0x70]
00bec6e0	add sp,sp,#0xa0
00bec6e4	autiasp
00bec6e8	ret

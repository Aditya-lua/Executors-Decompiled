; std::__ndk1::locale::has_facet @ 00bfb600
00bfb600	paciasp
00bfb604	sub sp,sp,#0x40
00bfb608	stp x29,x30,[sp, #0x20]
00bfb60c	stp x20,x19,[sp, #0x30]
00bfb610	add x29,sp,#0x20
00bfb614	str x1,[sp, #0x8]
00bfb618	ldr x20,[x0]
00bfb61c	mov x19,x1
00bfb620	ldar x8,[x1]
00bfb624	cmn x8,#0x1
00bfb628	b.eq 0x00bfb650
00bfb62c	add x8,sp,#0x8
00bfb630	sub x9,x29,#0x8
00bfb634	nop
00bfb638	adr x2,0xc0bab0
00bfb63c	add x1,sp,#0x10
00bfb640	mov x0,x19
00bfb644	stur x8,[x29, #-0x8]
00bfb648	str x9,[sp, #0x10]
00bfb64c	bl 0x00c305d0
00bfb650	ldp x8,x10,[x20, #0x10]
00bfb654	ldrsw x9,[x19, #0x8]
00bfb658	sub x9,x9,#0x1
00bfb65c	sub x10,x10,x8
00bfb660	cmp x9,x10, ASR #0x3
00bfb664	b.cs 0x00bfb678
00bfb668	ldr x8,[x8, x9, LSL #0x3]
00bfb66c	cmp x8,#0x0
00bfb670	cset w0,ne
00bfb674	b 0x00bfb67c
00bfb678	mov w0,wzr
00bfb67c	ldp x20,x19,[sp, #0x30]
00bfb680	ldp x29,x30,[sp, #0x20]
00bfb684	add sp,sp,#0x40
00bfb688	autiasp
00bfb68c	ret

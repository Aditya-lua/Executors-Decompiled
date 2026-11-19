; std::__ndk1::locale::use_facet @ 00bfb6f8
00bfb6f8	paciasp
00bfb6fc	sub sp,sp,#0x40
00bfb700	stp x29,x30,[sp, #0x20]
00bfb704	stp x20,x19,[sp, #0x30]
00bfb708	add x29,sp,#0x20
00bfb70c	str x1,[sp, #0x8]
00bfb710	ldr x20,[x0]
00bfb714	mov x19,x1
00bfb718	ldar x8,[x1]
00bfb71c	cmn x8,#0x1
00bfb720	b.eq 0x00bfb748
00bfb724	add x8,sp,#0x8
00bfb728	sub x9,x29,#0x8
00bfb72c	nop
00bfb730	adr x2,0xc0bab0
00bfb734	add x1,sp,#0x10
00bfb738	mov x0,x19
00bfb73c	stur x8,[x29, #-0x8]
00bfb740	str x9,[sp, #0x10]
00bfb744	bl 0x00c305d0
00bfb748	ldp x8,x10,[x20, #0x10]
00bfb74c	ldrsw x9,[x19, #0x8]
00bfb750	sub x9,x9,#0x1
00bfb754	sub x10,x10,x8
00bfb758	cmp x9,x10, ASR #0x3
00bfb75c	b.cs 0x00bfb77c
00bfb760	ldr x0,[x8, x9, LSL #0x3]
00bfb764	cbz x0,0x00bfb77c
00bfb768	ldp x20,x19,[sp, #0x30]
00bfb76c	ldp x29,x30,[sp, #0x20]
00bfb770	add sp,sp,#0x40
00bfb774	autiasp
00bfb778	ret
00bfb77c	bl 0x00bd8968

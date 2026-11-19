; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::snextc @ 00bce834
00bce834	paciasp
00bce838	stp x29,x30,[sp, #-0x20]!
00bce83c	str x19,[sp, #0x10]
00bce840	mov x29,sp
00bce844	ldp x9,x8,[x0, #0x18]
00bce848	cmp x9,x8
00bce84c	b.eq 0x00bce868
00bce850	add x9,x9,#0x1
00bce854	str x9,[x0, #0x18]
00bce858	cmp x9,x8
00bce85c	b.eq 0x00bce890
00bce860	ldrb w0,[x9]
00bce864	b 0x00bce8a8
00bce868	ldr x8,[x0]
00bce86c	mov x19,x0
00bce870	ldr x8,[x8, #0x50]
00bce874	blr x8
00bce878	cmn w0,#0x1
00bce87c	b.eq 0x00bce8a8
00bce880	ldp x9,x8,[x19, #0x18]
00bce884	mov x0,x19
00bce888	cmp x9,x8
00bce88c	b.ne 0x00bce860
00bce890	ldr x8,[x0]
00bce894	ldr x16,[x8, #0x48]
00bce898	ldr x19,[sp, #0x10]
00bce89c	ldp x29,x30,[sp], #0x20
00bce8a0	autiasp
00bce8a4	br x16
00bce8a8	ldr x19,[sp, #0x10]
00bce8ac	ldp x29,x30,[sp], #0x20
00bce8b0	autiasp
00bce8b4	ret

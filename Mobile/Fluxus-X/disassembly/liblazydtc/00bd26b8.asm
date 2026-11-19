; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::snextc @ 00bd26b8
00bd26b8	paciasp
00bd26bc	stp x29,x30,[sp, #-0x20]!
00bd26c0	str x19,[sp, #0x10]
00bd26c4	mov x29,sp
00bd26c8	ldp x9,x8,[x0, #0x18]
00bd26cc	cmp x9,x8
00bd26d0	b.eq 0x00bd26f8
00bd26d4	ldr w8,[x9], #0x4
00bd26d8	str x9,[x0, #0x18]
00bd26dc	cmn w8,#0x1
00bd26e0	b.eq 0x00bd2718
00bd26e4	ldp x8,x9,[x0, #0x18]
00bd26e8	cmp x8,x9
00bd26ec	b.eq 0x00bd272c
00bd26f0	ldr w0,[x8]
00bd26f4	b 0x00bd271c
00bd26f8	ldr x8,[x0]
00bd26fc	mov x19,x0
00bd2700	ldr x8,[x8, #0x50]
00bd2704	blr x8
00bd2708	mov w8,w0
00bd270c	mov x0,x19
00bd2710	cmn w8,#0x1
00bd2714	b.ne 0x00bd26e4
00bd2718	mov w0,#0xffffffff
00bd271c	ldr x19,[sp, #0x10]
00bd2720	ldp x29,x30,[sp], #0x20
00bd2724	autiasp
00bd2728	ret
00bd272c	ldr x8,[x0]
00bd2730	ldr x16,[x8, #0x48]
00bd2734	ldr x19,[sp, #0x10]
00bd2738	ldp x29,x30,[sp], #0x20
00bd273c	autiasp
00bd2740	br x16

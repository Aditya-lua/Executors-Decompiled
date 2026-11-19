; std::__ndk1::basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>>::copyfmt @ 00bd2528
00bd2528	paciasp
00bd252c	stp x29,x30,[sp, #-0x20]!
00bd2530	stp x20,x19,[sp, #0x10]
00bd2534	mov x29,sp
00bd2538	mov x19,x0
00bd253c	cmp x0,x1
00bd2540	b.eq 0x00bd2590
00bd2544	mov x20,x1
00bd2548	mov x0,x19
00bd254c	mov w1,wzr
00bd2550	bl 0x00c43ef0
00bd2554	mov x0,x19
00bd2558	mov x1,x20
00bd255c	bl 0x00c43f30
00bd2560	ldr x8,[x20, #0x88]
00bd2564	ldr w9,[x20, #0x90]
00bd2568	mov x0,x19
00bd256c	mov w1,#0x2
00bd2570	str x8,[x19, #0x88]
00bd2574	str w9,[x19, #0x90]
00bd2578	bl 0x00c43ef0
00bd257c	ldr w8,[x20, #0x24]
00bd2580	ldr w1,[x19, #0x20]
00bd2584	mov x0,x19
00bd2588	str w8,[x19, #0x24]
00bd258c	bl 0x00c30130
00bd2590	mov x0,x19
00bd2594	ldp x20,x19,[sp, #0x10]
00bd2598	ldp x29,x30,[sp], #0x20
00bd259c	autiasp
00bd25a0	ret

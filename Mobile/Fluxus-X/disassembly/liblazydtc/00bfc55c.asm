; std::__ndk1::ctype<wchar_t>::do_is @ 00bfc55c
00bfc55c	bti c
00bfc560	mov x0,x1
00bfc564	cmp x1,x2
00bfc568	b.eq 0x00bfc5a0
00bfc56c	adrp x8,0x78a000
00bfc570	add x8,x8,#0x8e8
00bfc574	b 0x00bfc58c
00bfc578	ldr x9,[x8, x9, LSL #0x3]
00bfc57c	add x0,x0,#0x4
00bfc580	str x9,[x3], #0x8
00bfc584	cmp x0,x2
00bfc588	b.eq 0x00bfc5a0
00bfc58c	ldr w9,[x0]
00bfc590	cmp w9,#0x7f
00bfc594	b.ls 0x00bfc578
00bfc598	mov x9,xzr
00bfc59c	b 0x00bfc57c
00bfc5a0	ret

; std::__ndk1::locale::__install_ctor @ 00bfb344
00bfb344	paciasp
00bfb348	stp x29,x30,[sp, #-0x30]!
00bfb34c	stp x22,x21,[sp, #0x10]
00bfb350	stp x20,x19,[sp, #0x20]
00bfb354	mov x29,sp
00bfb358	mov x19,x1
00bfb35c	mov x20,x0
00bfb360	cbz x2,0x00bfb390
00bfb364	mov w0,#0x138
00bfb368	mov x21,x3
00bfb36c	mov x22,x2
00bfb370	bl 0x00c2fed0
00bfb374	ldr x1,[x19]
00bfb378	mov x19,x0
00bfb37c	mov x2,x22
00bfb380	mov x3,x21
00bfb384	bl 0x00bfa8f8
00bfb388	str x19,[x20]
00bfb38c	b 0x00bfb3a8
00bfb390	ldr x19,[x19]
00bfb394	adrp x8,0xd27000
00bfb398	add x8,x8,#0x100
00bfb39c	cmp x19,x8
00bfb3a0	str x19,[x20]
00bfb3a4	b.eq 0x00bfb3b4
00bfb3a8	add x1,x19,#0x8
00bfb3ac	mov w0,#0x1
00bfb3b0	bl 0x00c2bce0
00bfb3b4	ldp x20,x19,[sp, #0x20]
00bfb3b8	ldp x22,x21,[sp, #0x10]
00bfb3bc	ldp x29,x30,[sp], #0x30
00bfb3c0	autiasp
00bfb3c4	ret

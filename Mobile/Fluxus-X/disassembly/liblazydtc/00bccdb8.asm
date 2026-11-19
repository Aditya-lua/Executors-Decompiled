; std::__ndk1::recursive_mutex::try_lock @ 00bccdb8
00bccdb8	paciasp
00bccdbc	stp x29,x30,[sp, #-0x10]!
00bccdc0	mov x29,sp
00bccdc4	bl 0x00c43b40
00bccdc8	cmp w0,#0x0
00bccdcc	cset w0,eq
00bccdd0	ldp x29,x30,[sp], #0x10
00bccdd4	autiasp
00bccdd8	ret

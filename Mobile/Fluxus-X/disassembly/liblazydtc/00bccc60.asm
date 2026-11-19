; std::__ndk1::mutex::try_lock @ 00bccc60
00bccc60	paciasp
00bccc64	stp x29,x30,[sp, #-0x10]!
00bccc68	mov x29,sp
00bccc6c	bl 0x00c43b40
00bccc70	cmp w0,#0x0
00bccc74	cset w0,eq
00bccc78	ldp x29,x30,[sp], #0x10
00bccc7c	autiasp
00bccc80	ret

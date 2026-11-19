; std::__ndk1::mutex::lock @ 00bccc34
00bccc34	paciasp
00bccc38	stp x29,x30,[sp, #-0x10]!
00bccc3c	mov x29,sp
00bccc40	bl 0x00c31ca0
00bccc44	cbnz w0,0x00bccc54
00bccc48	ldp x29,x30,[sp], #0x10
00bccc4c	autiasp
00bccc50	ret
00bccc54	adrp x1,0x2be000
00bccc58	add x1,x1,#0xc42
00bccc5c	bl 0x00c2ffc0

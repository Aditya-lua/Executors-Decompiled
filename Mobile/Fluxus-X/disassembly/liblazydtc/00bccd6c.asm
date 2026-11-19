; std::__ndk1::recursive_mutex::lock @ 00bccd6c
00bccd6c	paciasp
00bccd70	stp x29,x30,[sp, #-0x10]!
00bccd74	mov x29,sp
00bccd78	bl 0x00c31ca0
00bccd7c	cbnz w0,0x00bccd8c
00bccd80	ldp x29,x30,[sp], #0x10
00bccd84	autiasp
00bccd88	ret
00bccd8c	adrp x1,0x2ac000
00bccd90	add x1,x1,#0xd26
00bccd94	bl 0x00c2ffc0

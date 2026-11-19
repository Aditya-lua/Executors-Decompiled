; __cxa_increment_exception_refcount @ 00c29874
00c29874	bti c
00c29878	cbz x0,0x00c2989c
00c2987c	paciasp
00c29880	stp x29,x30,[sp, #-0x10]!
00c29884	mov x29,sp
00c29888	sub x1,x0,#0x78
00c2988c	mov w0,#0x1
00c29890	bl 0x00c2bd10
00c29894	ldp x29,x30,[sp], #0x10
00c29898	autiasp
00c2989c	ret

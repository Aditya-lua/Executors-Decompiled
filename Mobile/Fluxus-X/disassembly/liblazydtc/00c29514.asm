; __cxa_allocate_dependent_exception @ 00c29514
00c29514	paciasp
00c29518	stp x29,x30,[sp, #-0x10]!
00c2951c	mov x29,sp
00c29520	mov w0,#0x80
00c29524	bl 0x00c29b0c
00c29528	cbz x0,0x00c2954c
00c2952c	movi v0.2D,#0x0
00c29530	stp q0,q0,[x0, #0x20]
00c29534	stp q0,q0,[x0, #0x40]
00c29538	stp q0,q0,[x0, #0x60]
00c2953c	stp q0,q0,[x0]
00c29540	ldp x29,x30,[sp], #0x10
00c29544	autiasp
00c29548	ret
00c2954c	bl 0x00c2fff0

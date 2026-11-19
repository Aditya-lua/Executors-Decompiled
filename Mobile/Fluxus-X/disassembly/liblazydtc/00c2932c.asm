; __cxa_allocate_exception @ 00c2932c
00c2932c	paciasp
00c29330	stp x29,x30,[sp, #-0x20]!
00c29334	stp x20,x19,[sp, #0x10]
00c29338	mov x29,sp
00c2933c	add x20,x0,#0x8f
00c29340	and x0,x20,#-0x10
00c29344	bl 0x00c29b0c
00c29348	mov x19,x0
00c2934c	cbz x0,0x00c29374
00c29350	and x2,x20,#-0x10
00c29354	mov x0,x19
00c29358	mov w1,wzr
00c2935c	bl 0x00c301c0
00c29360	add x0,x19,#0x80
00c29364	ldp x20,x19,[sp, #0x10]
00c29368	ldp x29,x30,[sp], #0x20
00c2936c	autiasp
00c29370	ret
00c29374	bl 0x00c2fff0

; __cxa_uncaught_exception @ 00c29ab4
00c29ab4	paciasp
00c29ab8	stp x29,x30,[sp, #-0x10]!
00c29abc	mov x29,sp
00c29ac0	bl 0x00c44730
00c29ac4	cbz x0,0x00c29ad4
00c29ac8	ldr w8,[x0, #0x8]
00c29acc	cmp w8,#0x0
00c29ad0	cset w0,ne
00c29ad4	ldp x29,x30,[sp], #0x10
00c29ad8	autiasp
00c29adc	ret

; _INIT_13 @ 007fc83c
007fc83c	stp x29,x30,[sp, #-0x10]!
007fc840	mov x29,sp
007fc844	adrp x8,0xcca000
007fc848	add x8,x8,#0x930
007fc84c	ldarb w8,[x8]
007fc850	tbnz w8,#0x0,0x007fc8a0
007fc854	adrp x0,0xcca000
007fc858	add x0,x0,#0x930
007fc85c	bl 0x00c2fe90
007fc860	cbz w0,0x007fc8a0
007fc864	movi v0.2D,#0x0
007fc868	adrp x1,0xcca000
007fc86c	add x1,x1,#0x908
007fc870	mov w8,#0x3f800000
007fc874	nop
007fc878	adr x0,0x7fc8a8
007fc87c	adrp x2,0xc48000
007fc880	add x2,x2,#0x880
007fc884	str w8,[x1, #0x20]
007fc888	stp q0,q0,[x1]
007fc88c	bl 0x00c2fe70
007fc890	adrp x0,0xcca000
007fc894	add x0,x0,#0x930
007fc898	ldp x29,x30,[sp], #0x10
007fc89c	b 0x00c2fea0
007fc8a0	ldp x29,x30,[sp], #0x10
007fc8a4	ret

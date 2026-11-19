; _INIT_14 @ 007fc900
007fc900	stp x29,x30,[sp, #-0x20]!
007fc904	str x19,[sp, #0x10]
007fc908	mov x29,sp
007fc90c	adrp x8,0xcca000
007fc910	add x8,x8,#0x940
007fc914	ldarb w8,[x8]
007fc918	tbnz w8,#0x0,0x007fc980
007fc91c	adrp x0,0xcca000
007fc920	add x0,x0,#0x940
007fc924	bl 0x00c2fe90
007fc928	cbz w0,0x007fc980
007fc92c	mov w0,#0x88
007fc930	bl 0x00c2fed0
007fc934	movi v0.2D,#0x0
007fc938	adrp x1,0xcca000
007fc93c	add x1,x1,#0x938
007fc940	str xzr,[x0, #0x80]
007fc944	adrp x2,0xc48000
007fc948	add x2,x2,#0x880
007fc94c	str x0,[x1]
007fc950	stp q0,q0,[x0]
007fc954	stp q0,q0,[x0, #0x20]
007fc958	stp q0,q0,[x0, #0x40]
007fc95c	stp q0,q0,[x0, #0x60]
007fc960	nop
007fc964	adr x0,0x7fc9a4
007fc968	bl 0x00c2fe70
007fc96c	adrp x0,0xcca000
007fc970	add x0,x0,#0x940
007fc974	ldr x19,[sp, #0x10]
007fc978	ldp x29,x30,[sp], #0x20
007fc97c	b 0x00c2fea0
007fc980	ldr x19,[sp, #0x10]
007fc984	ldp x29,x30,[sp], #0x20
007fc988	ret

; _INIT_4 @ 007fbd8c
007fbd8c	stp x29,x30,[sp, #-0x10]!
007fbd90	mov x29,sp
007fbd94	adrp x8,0xcca000
007fbd98	add x8,x8,#0x880
007fbd9c	ldarb w8,[x8]
007fbda0	tbnz w8,#0x0,0x007fbe1c
007fbda4	adrp x0,0xcca000
007fbda8	add x0,x0,#0x880
007fbdac	bl 0x00c2fe90
007fbdb0	cbz w0,0x007fbe1c
007fbdb4	adrp x8,0xcca000
007fbdb8	add x8,x8,#0x990
007fbdbc	ldarb w9,[x8]
007fbdc0	adrp x8,0xcca000
007fbdc4	add x8,x8,#0x980
007fbdc8	tbz w9,#0x0,0x007fbe24
007fbdcc	adrp x9,0xcca000
007fbdd0	ldrb w9,[x9, #0x989]
007fbdd4	cmp w9,#0x1
007fbdd8	b.ne 0x007fbe04
007fbddc	adrp x9,0x29a000
007fbde0	ldr d0,[x8]
007fbde4	mov w10,#0x45
007fbde8	ldr d1,[x9, #0xf80]
007fbdec	ldrb w9,[x8, #0x8]
007fbdf0	strb wzr,[x8, #0x9]
007fbdf4	eor v0.8B,v0.8B,v1.8B
007fbdf8	eor w9,w9,w10
007fbdfc	strb w9,[x8, #0x8]
007fbe00	str d0,[x8]
007fbe04	adrp x9,0xcca000
007fbe08	adrp x0,0xcca000
007fbe0c	add x0,x0,#0x880
007fbe10	str x8,[x9, #0x878]
007fbe14	ldp x29,x30,[sp], #0x10
007fbe18	b 0x00c2fea0
007fbe1c	ldp x29,x30,[sp], #0x10
007fbe20	ret
007fbe24	adrp x0,0xcca000
007fbe28	add x0,x0,#0x990
007fbe2c	bl 0x00c2fe90
007fbe30	adrp x8,0xcca000
007fbe34	add x8,x8,#0x980
007fbe38	cbz w0,0x007fbdcc
007fbe3c	adrp x9,0x29a000
007fbe40	nop
007fbe44	adr x0,0x7fdd3c
007fbe48	ldr d0,[x9, #0x548]
007fbe4c	mov w9,#0x145
007fbe50	adrp x2,0xc48000
007fbe54	add x2,x2,#0x880
007fbe58	adrp x1,0xcca000
007fbe5c	add x1,x1,#0x980
007fbe60	str d0,[x8]
007fbe64	strh w9,[x8, #0x8]
007fbe68	bl 0x00c2fe70
007fbe6c	adrp x0,0xcca000
007fbe70	add x0,x0,#0x990
007fbe74	bl 0x00c2fea0
007fbe78	adrp x8,0xcca000
007fbe7c	add x8,x8,#0x980
007fbe80	b 0x007fbdcc

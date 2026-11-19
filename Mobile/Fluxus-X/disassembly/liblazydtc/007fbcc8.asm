; _INIT_3 @ 007fbcc8
007fbcc8	stp x29,x30,[sp, #-0x10]!
007fbccc	mov x29,sp
007fbcd0	adrp x8,0xcca000
007fbcd4	add x8,x8,#0x870
007fbcd8	ldarb w8,[x8]
007fbcdc	tbnz w8,#0x0,0x007fbd2c
007fbce0	adrp x0,0xcca000
007fbce4	add x0,x0,#0x870
007fbce8	bl 0x00c2fe90
007fbcec	cbz w0,0x007fbd2c
007fbcf0	movi v0.2D,#0x0
007fbcf4	adrp x1,0xcca000
007fbcf8	add x1,x1,#0x848
007fbcfc	mov w8,#0x3f800000
007fbd00	nop
007fbd04	adr x0,0x7fbd34
007fbd08	adrp x2,0xc48000
007fbd0c	add x2,x2,#0x880
007fbd10	str w8,[x1, #0x20]
007fbd14	stp q0,q0,[x1]
007fbd18	bl 0x00c2fe70
007fbd1c	adrp x0,0xcca000
007fbd20	add x0,x0,#0x870
007fbd24	ldp x29,x30,[sp], #0x10
007fbd28	b 0x00c2fea0
007fbd2c	ldp x29,x30,[sp], #0x10
007fbd30	ret

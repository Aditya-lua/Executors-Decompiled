; _INIT_16 @ 007fcad0
007fcad0	stp x29,x30,[sp, #-0x20]!
007fcad4	str x19,[sp, #0x10]
007fcad8	mov x29,sp
007fcadc	adrp x8,0xcca000
007fcae0	add x8,x8,#0x960
007fcae4	ldarb w8,[x8]
007fcae8	tbnz w8,#0x0,0x007fcb44
007fcaec	adrp x0,0xcca000
007fcaf0	add x0,x0,#0x960
007fcaf4	bl 0x00c2fe90
007fcaf8	cbz w0,0x007fcb44
007fcafc	mov w0,#0x8
007fcb00	bl 0x00c2fed0
007fcb04	adrp x8,0xc48000
007fcb08	add x8,x8,#0x898
007fcb0c	adrp x1,0xcca000
007fcb10	add x1,x1,#0x958
007fcb14	str x8,[x0]
007fcb18	adrp x2,0xc48000
007fcb1c	add x2,x2,#0x880
007fcb20	str x0,[x1]
007fcb24	nop
007fcb28	adr x0,0x7fcb68
007fcb2c	bl 0x00c2fe70
007fcb30	adrp x0,0xcca000
007fcb34	add x0,x0,#0x960
007fcb38	ldr x19,[sp, #0x10]
007fcb3c	ldp x29,x30,[sp], #0x20
007fcb40	b 0x00c2fea0
007fcb44	ldr x19,[sp, #0x10]
007fcb48	ldp x29,x30,[sp], #0x20
007fcb4c	ret

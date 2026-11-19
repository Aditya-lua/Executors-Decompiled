; _INIT_15 @ 007fc9ec
007fc9ec	stp x29,x30,[sp, #-0x20]!
007fc9f0	str x19,[sp, #0x10]
007fc9f4	mov x29,sp
007fc9f8	adrp x8,0xcca000
007fc9fc	add x8,x8,#0x950
007fca00	ldarb w8,[x8]
007fca04	tbnz w8,#0x0,0x007fca64
007fca08	adrp x0,0xcca000
007fca0c	add x0,x0,#0x950
007fca10	bl 0x00c2fe90
007fca14	cbz w0,0x007fca64
007fca18	mov w0,#0x60
007fca1c	bl 0x00c2fed0
007fca20	movi v0.2D,#0x0
007fca24	adrp x1,0xcca000
007fca28	add x1,x1,#0x948
007fca2c	str x0,[x1]
007fca30	adrp x2,0xc48000
007fca34	add x2,x2,#0x880
007fca38	stp q0,q0,[x0]
007fca3c	stp q0,q0,[x0, #0x20]
007fca40	stp q0,q0,[x0, #0x40]
007fca44	nop
007fca48	adr x0,0x7fca88
007fca4c	bl 0x00c2fe70
007fca50	adrp x0,0xcca000
007fca54	add x0,x0,#0x950
007fca58	ldr x19,[sp, #0x10]
007fca5c	ldp x29,x30,[sp], #0x20
007fca60	b 0x00c2fea0
007fca64	ldr x19,[sp, #0x10]
007fca68	ldp x29,x30,[sp], #0x20
007fca6c	ret

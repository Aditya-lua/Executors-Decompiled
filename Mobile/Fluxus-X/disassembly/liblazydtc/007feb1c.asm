; FUN_007feb1c @ 007feb1c
007feb1c	sub w8,w0,#0x7
007feb20	cmp w8,#0x57
007feb24	b.hi 0x007feb48
007feb28	adrp x9,0x29d000
007feb2c	add x9,x9,#0x290
007feb30	mov w0,#0x2
007feb34	adr x10,0x7feb44
007feb38	ldrb w11,[x9, x8]
007feb3c	add x10,x10,x11, LSL #0x2
007feb40	br x10
007feb44	ret
007feb48	mov w0,#0x1
007feb4c	ret

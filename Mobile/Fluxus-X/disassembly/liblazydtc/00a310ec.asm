; EC_GROUP_set_curve_GF2m @ 00a310ec
00a310ec	ldr x8,[x0]
00a310f0	ldr x5,[x8, #0x28]
00a310f4	cbz x5,0x00a310fc
00a310f8	br x5
00a310fc	stp x29,x30,[sp, #-0x10]!
00a31100	mov x29,sp
00a31104	bl 0x00c342a0
00a31108	adrp x0,0x29e000
00a3110c	adrp x2,0x2aa000
00a31110	add x0,x0,#0xa7
00a31114	add x2,x2,#0x91
00a31118	mov w1,#0x22f
00a3111c	bl 0x00c342b0
00a31120	mov w1,#0x101
00a31124	mov w0,#0x10
00a31128	movk w1,#0xc, LSL #16
00a3112c	mov x2,xzr
00a31130	bl 0x00c342c0
00a31134	mov w0,wzr
00a31138	ldp x29,x30,[sp], #0x10
00a3113c	ret

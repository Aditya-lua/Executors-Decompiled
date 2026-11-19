; ssl_undefined_void_function @ 009b6e30
009b6e30	stp x29,x30,[sp, #-0x10]!
009b6e34	mov x29,sp
009b6e38	bl 0x00c342a0
009b6e3c	adrp x0,0x2c5000
009b6e40	adrp x2,0x2b1000
009b6e44	add x0,x0,#0x652
009b6e48	add x2,x2,#0xefd
009b6e4c	mov w1,#0xf95
009b6e50	bl 0x00c342b0
009b6e54	mov w1,#0x101
009b6e58	mov w0,#0x14
009b6e5c	movk w1,#0xc, LSL #16
009b6e60	mov x2,xzr
009b6e64	bl 0x00c342c0
009b6e68	mov w0,wzr
009b6e6c	ldp x29,x30,[sp], #0x10
009b6e70	ret

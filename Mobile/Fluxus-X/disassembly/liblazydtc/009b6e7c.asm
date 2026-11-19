; ssl_bad_method @ 009b6e7c
009b6e7c	stp x29,x30,[sp, #-0x10]!
009b6e80	mov x29,sp
009b6e84	bl 0x00c342a0
009b6e88	adrp x0,0x2c5000
009b6e8c	adrp x2,0x2c1000
009b6e90	add x0,x0,#0x652
009b6e94	add x2,x2,#0x69d
009b6e98	mov w1,#0xfa0
009b6e9c	bl 0x00c342b0
009b6ea0	mov w1,#0x101
009b6ea4	mov w0,#0x14
009b6ea8	movk w1,#0xc, LSL #16
009b6eac	mov x2,xzr
009b6eb0	bl 0x00c342c0
009b6eb4	mov x0,xzr
009b6eb8	ldp x29,x30,[sp], #0x10
009b6ebc	ret

; FUN_009b18cc @ 009b18cc
009b18cc	stp x29,x30,[sp, #-0x10]!
009b18d0	mov x29,sp
009b18d4	bl 0x00c342a0
009b18d8	adrp x0,0x2c5000
009b18dc	adrp x2,0x2bd000
009b18e0	add x0,x0,#0x652
009b18e4	add x2,x2,#0x599
009b18e8	mov w1,#0xf8f
009b18ec	bl 0x00c342b0
009b18f0	mov w1,#0x101
009b18f4	mov w0,#0x14
009b18f8	movk w1,#0xc, LSL #16
009b18fc	mov x2,xzr
009b1900	bl 0x00c342c0
009b1904	mov x0,xzr
009b1908	ldp x29,x30,[sp], #0x10
009b190c	ret

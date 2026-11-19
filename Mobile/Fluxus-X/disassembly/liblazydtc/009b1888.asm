; FUN_009b1888 @ 009b1888
009b1888	stp x29,x30,[sp, #-0x10]!
009b188c	mov x29,sp
009b1890	bl 0x00c342a0
009b1894	adrp x0,0x2c5000
009b1898	adrp x2,0x2bd000
009b189c	add x0,x0,#0x652
009b18a0	add x2,x2,#0x599
009b18a4	mov w1,#0xf8f
009b18a8	bl 0x00c342b0
009b18ac	mov w1,#0x101
009b18b0	mov w0,#0x14
009b18b4	movk w1,#0xc, LSL #16
009b18b8	mov x2,xzr
009b18bc	bl 0x00c342c0
009b18c0	mov w0,wzr
009b18c4	ldp x29,x30,[sp], #0x10
009b18c8	ret

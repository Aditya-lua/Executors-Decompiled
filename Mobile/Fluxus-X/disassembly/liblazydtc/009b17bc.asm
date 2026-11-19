; FUN_009b17bc @ 009b17bc
009b17bc	stp x29,x30,[sp, #-0x10]!
009b17c0	mov x29,sp
009b17c4	bl 0x00c342a0
009b17c8	adrp x0,0x2c5000
009b17cc	adrp x2,0x2bd000
009b17d0	add x0,x0,#0x652
009b17d4	add x2,x2,#0x599
009b17d8	mov w1,#0xf8f
009b17dc	bl 0x00c342b0
009b17e0	mov w1,#0x101
009b17e4	mov w0,#0x14
009b17e8	movk w1,#0xc, LSL #16
009b17ec	mov x2,xzr
009b17f0	bl 0x00c342c0
009b17f4	mov w0,wzr
009b17f8	ldp x29,x30,[sp], #0x10
009b17fc	ret

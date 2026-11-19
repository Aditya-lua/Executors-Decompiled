; BIO_ADDR_new @ 009fab88
009fab88	stp x29,x30,[sp, #-0x10]!
009fab8c	adrp x1,0x2cd000
009fab90	add x1,x1,#0x866
009fab94	orr w0,wzr,#0x70
009fab98	mov w2,#0x36
009fab9c	mov x29,sp
009faba0	bl 0x00c34250
009faba4	cbz x0,0x009fabb4
009faba8	strh wzr,[x0]
009fabac	ldp x29,x30,[sp], #0x10
009fabb0	ret
009fabb4	bl 0x00c342a0
009fabb8	adrp x0,0x2cd000
009fabbc	adrp x2,0x2d3000
009fabc0	add x0,x0,#0x866
009fabc4	add x2,x2,#0x8f2
009fabc8	mov w1,#0x39
009fabcc	bl 0x00c342b0
009fabd0	mov w1,#0x100
009fabd4	mov w0,#0x20
009fabd8	movk w1,#0xc, LSL #16
009fabdc	mov x2,xzr
009fabe0	bl 0x00c342c0
009fabe4	mov x0,xzr
009fabe8	ldp x29,x30,[sp], #0x10
009fabec	ret

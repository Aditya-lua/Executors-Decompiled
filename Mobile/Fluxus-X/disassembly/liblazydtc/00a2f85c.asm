; EC_KEY_priv2oct @ 00a2f85c
00a2f85c	ldr x8,[x0, #0x18]
00a2f860	cbz x8,0x00a2f8b4
00a2f864	ldr x8,[x8]
00a2f868	cbz x8,0x00a2f8b4
00a2f86c	ldr x3,[x8, #0x130]
00a2f870	cbz x3,0x00a2f878
00a2f874	br x3
00a2f878	stp x29,x30,[sp, #-0x10]!
00a2f87c	mov x29,sp
00a2f880	bl 0x00c342a0
00a2f884	adrp x0,0x2b4000
00a2f888	adrp x2,0x2c7000
00a2f88c	add x0,x0,#0x15e
00a2f890	add x2,x2,#0x870
00a2f894	mov w1,#0x389
00a2f898	bl 0x00c342b0
00a2f89c	mov w1,#0x101
00a2f8a0	mov w0,#0x10
00a2f8a4	movk w1,#0xc, LSL #16
00a2f8a8	mov x2,xzr
00a2f8ac	bl 0x00c342c0
00a2f8b0	ldp x29,x30,[sp], #0x10
00a2f8b4	mov x0,xzr
00a2f8b8	ret

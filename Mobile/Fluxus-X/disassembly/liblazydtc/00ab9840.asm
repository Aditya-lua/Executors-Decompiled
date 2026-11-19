; i2d_KeyParams @ 00ab9840
00ab9840	ldr x8,[x0, #0x60]
00ab9844	mov x3,x1
00ab9848	cbz x8,0x00ab985c
00ab984c	adrp x2,0xc7b000
00ab9850	add x2,x2,#0x8
00ab9854	mov w1,#0x84
00ab9858	b 0x00ab98b4
00ab985c	ldr x8,[x0, #0x8]
00ab9860	cbz x8,0x00ab9874
00ab9864	ldr x2,[x8, #0x78]
00ab9868	cbz x2,0x00ab9874
00ab986c	mov x1,x3
00ab9870	br x2
00ab9874	stp x29,x30,[sp, #-0x10]!
00ab9878	mov x29,sp
00ab987c	bl 0x00c342a0
00ab9880	adrp x0,0x2dc000
00ab9884	adrp x2,0x2d8000
00ab9888	add x0,x0,#0x823
00ab988c	add x2,x2,#0x5c6
00ab9890	mov w1,#0x56
00ab9894	bl 0x00c342b0
00ab9898	mov w0,#0xd
00ab989c	mov w1,#0xc4
00ab98a0	mov x2,xzr
00ab98a4	bl 0x00c342c0
00ab98a8	mov w0,#0xffffffff
00ab98ac	ldp x29,x30,[sp], #0x10
00ab98b0	ret

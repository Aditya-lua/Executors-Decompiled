; ossl_decoder_get_number @ 00a4ee94
00a4ee94	cbz x0,0x00a4eea0
00a4ee98	ldr w0,[x0, #0x8]
00a4ee9c	ret
00a4eea0	stp x29,x30,[sp, #-0x10]!
00a4eea4	mov x29,sp
00a4eea8	bl 0x00c342a0
00a4eeac	adrp x0,0x2db000
00a4eeb0	adrp x2,0x2c7000
00a4eeb4	add x0,x0,#0xf32
00a4eeb8	add x2,x2,#0x8e4
00a4eebc	mov w1,#0x215
00a4eec0	bl 0x00c342b0
00a4eec4	mov w1,#0x102
00a4eec8	orr w0,wzr,#0x3c
00a4eecc	movk w1,#0xc, LSL #16
00a4eed0	mov x2,xzr
00a4eed4	bl 0x00c342c0
00a4eed8	mov w0,wzr
00a4eedc	ldp x29,x30,[sp], #0x10
00a4eee0	ret

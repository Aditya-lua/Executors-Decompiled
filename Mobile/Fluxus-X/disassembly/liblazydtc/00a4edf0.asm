; OSSL_DECODER_get0_properties @ 00a4edf0
00a4edf0	cbz x0,0x00a4ee00
00a4edf4	ldr x8,[x0, #0x18]
00a4edf8	ldr x0,[x8, #0x8]
00a4edfc	ret
00a4ee00	stp x29,x30,[sp, #-0x10]!
00a4ee04	mov x29,sp
00a4ee08	bl 0x00c342a0
00a4ee0c	adrp x0,0x2db000
00a4ee10	adrp x2,0x2c1000
00a4ee14	add x0,x0,#0xf32
00a4ee18	add x2,x2,#0xbaf
00a4ee1c	mov w1,#0x200
00a4ee20	bl 0x00c342b0
00a4ee24	mov w1,#0x102
00a4ee28	orr w0,wzr,#0x3c
00a4ee2c	movk w1,#0xc, LSL #16
00a4ee30	mov x2,xzr
00a4ee34	bl 0x00c342c0
00a4ee38	mov x0,xzr
00a4ee3c	ldp x29,x30,[sp], #0x10
00a4ee40	ret

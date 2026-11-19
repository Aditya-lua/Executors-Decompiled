; ossl_global_properties_stop_mirroring @ 00ac3fec
00ac3fec	stp x29,x30,[sp, #-0x10]!
00ac3ff0	adrp x2,0xc7c000
00ac3ff4	add x2,x2,#0x670
00ac3ff8	orr w1,wzr,#0xe
00ac3ffc	mov x29,sp
00ac4000	bl 0x00c3b520
00ac4004	cbz x0,0x00ac4014
00ac4008	ldrb w8,[x0, #0x8]
00ac400c	orr w8,w8,#0x1
00ac4010	strb w8,[x0, #0x8]
00ac4014	ldp x29,x30,[sp], #0x10
00ac4018	ret

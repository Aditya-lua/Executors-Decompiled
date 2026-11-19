; ossl_err_load_TS_strings @ 00aecd88
00aecd88	stp x29,x30,[sp, #-0x10]!
00aecd8c	mov w0,#0x84
00aecd90	movk w0,#0x1780, LSL #16
00aecd94	mov x29,sp
00aecd98	bl 0x00c35520
00aecd9c	cbnz x0,0x00aecdac
00aecda0	adrp x0,0xc7d000
00aecda4	add x0,x0,#0xed0
00aecda8	bl 0x00c35510
00aecdac	mov w0,#0x1
00aecdb0	ldp x29,x30,[sp], #0x10
00aecdb4	ret

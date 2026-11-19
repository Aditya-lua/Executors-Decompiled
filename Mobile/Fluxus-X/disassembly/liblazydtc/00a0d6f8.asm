; NCONF_dump_bio @ 00a0d6f8
00a0d6f8	cbz x0,0x00a0d708
00a0d6fc	ldr x8,[x0]
00a0d700	ldr x2,[x8, #0x30]
00a0d704	br x2
00a0d708	stp x29,x30,[sp, #-0x10]!
00a0d70c	mov x29,sp
00a0d710	bl 0x00c342a0
00a0d714	adrp x0,0x2af000
00a0d718	adrp x2,0x2bd000
00a0d71c	add x0,x0,#0xd73
00a0d720	add x2,x2,#0x83a
00a0d724	mov w1,#0x18e
00a0d728	bl 0x00c342b0
00a0d72c	orr w0,wzr,#0xe
00a0d730	mov w1,#0x69
00a0d734	mov x2,xzr
00a0d738	bl 0x00c342c0
00a0d73c	mov w0,wzr
00a0d740	ldp x29,x30,[sp], #0x10
00a0d744	ret

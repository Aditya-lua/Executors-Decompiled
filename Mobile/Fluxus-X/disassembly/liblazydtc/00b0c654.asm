; i2d_re_X509_REQ_tbs @ 00b0c654
00b0c654	cbz x0,0x00b0c664
00b0c658	mov w8,#0x1
00b0c65c	str w8,[x0, #0x10]
00b0c660	b 0x00c40cd0
00b0c664	stp x29,x30,[sp, #-0x10]!
00b0c668	mov x29,sp
00b0c66c	bl 0x00c342a0
00b0c670	adrp x0,0x2a4000
00b0c674	adrp x2,0x2a0000
00b0c678	add x0,x0,#0xaf5
00b0c67c	add x2,x2,#0xdd6
00b0c680	mov w1,#0x146
00b0c684	bl 0x00c342b0
00b0c688	mov w1,#0x102
00b0c68c	mov w0,#0xb
00b0c690	movk w1,#0xc, LSL #16
00b0c694	mov x2,xzr
00b0c698	bl 0x00c342c0
00b0c69c	mov w0,wzr
00b0c6a0	ldp x29,x30,[sp], #0x10
00b0c6a4	ret

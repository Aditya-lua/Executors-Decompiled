; FUN_00a0ccd0 @ 00a0ccd0
00a0ccd0	stp x29,x30,[sp, #-0x10]!
00a0ccd4	mov x29,sp
00a0ccd8	bl 0x00c34d50
00a0ccdc	adrp x8,0xd21000
00a0cce0	str x0,[x8, #0x928]
00a0cce4	cbz x0,0x00a0ccf0
00a0cce8	mov w8,#0x1
00a0ccec	b 0x00a0cd24
00a0ccf0	bl 0x00c342a0
00a0ccf4	adrp x0,0x2c9000
00a0ccf8	adrp x2,0x2d9000
00a0ccfc	add x0,x0,#0x604
00a0cd00	add x2,x2,#0x9fa
00a0cd04	mov w1,#0x67
00a0cd08	bl 0x00c342b0
00a0cd0c	mov w1,#0x100
00a0cd10	orr w0,wzr,#0xe
00a0cd14	movk w1,#0xc, LSL #16
00a0cd18	mov x2,xzr
00a0cd1c	bl 0x00c342c0
00a0cd20	mov w8,wzr
00a0cd24	adrp x9,0xd21000
00a0cd28	str w8,[x9, #0x944]
00a0cd2c	ldp x29,x30,[sp], #0x10
00a0cd30	ret

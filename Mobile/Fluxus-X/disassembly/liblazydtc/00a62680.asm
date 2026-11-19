; OSSL_ENCODER_CTX_set_cleanup @ 00a62680
00a62680	cbz x0,0x00a62690
00a62684	str x1,[x0, #0x28]
00a62688	mov w0,#0x1
00a6268c	ret
00a62690	stp x29,x30,[sp, #-0x10]!
00a62694	mov x29,sp
00a62698	bl 0x00c342a0
00a6269c	adrp x0,0x2a0000
00a626a0	adrp x2,0x2c3000
00a626a4	add x0,x0,#0x26d
00a626a8	add x2,x2,#0x9d7
00a626ac	mov w1,#0x165
00a626b0	bl 0x00c342b0
00a626b4	mov w1,#0x102
00a626b8	mov w0,#0x3b
00a626bc	movk w1,#0xc, LSL #16
00a626c0	mov x2,xzr
00a626c4	bl 0x00c342c0
00a626c8	mov w0,wzr
00a626cc	ldp x29,x30,[sp], #0x10
00a626d0	ret

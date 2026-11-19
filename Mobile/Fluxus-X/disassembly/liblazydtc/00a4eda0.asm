; OSSL_DECODER_get0_provider @ 00a4eda0
00a4eda0	cbz x0,0x00a4edac
00a4eda4	ldr x0,[x0]
00a4eda8	ret
00a4edac	stp x29,x30,[sp, #-0x10]!
00a4edb0	mov x29,sp
00a4edb4	bl 0x00c342a0
00a4edb8	adrp x0,0x2db000
00a4edbc	adrp x2,0x2a2000
00a4edc0	add x0,x0,#0xf32
00a4edc4	add x2,x2,#0x2d3
00a4edc8	mov w1,#0x1f6
00a4edcc	bl 0x00c342b0
00a4edd0	mov w1,#0x102
00a4edd4	orr w0,wzr,#0x3c
00a4edd8	movk w1,#0xc, LSL #16
00a4eddc	mov x2,xzr
00a4ede0	bl 0x00c342c0
00a4ede4	mov x0,xzr
00a4ede8	ldp x29,x30,[sp], #0x10
00a4edec	ret

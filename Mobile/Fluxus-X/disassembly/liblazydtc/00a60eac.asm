; ossl_encoder_get_number @ 00a60eac
00a60eac	cbz x0,0x00a60eb8
00a60eb0	ldr w0,[x0, #0x8]
00a60eb4	ret
00a60eb8	stp x29,x30,[sp, #-0x10]!
00a60ebc	mov x29,sp
00a60ec0	bl 0x00c342a0
00a60ec4	adrp x0,0x2d3000
00a60ec8	adrp x2,0x2aa000
00a60ecc	add x0,x0,#0xb3c
00a60ed0	add x2,x2,#0x195
00a60ed4	mov w1,#0x21e
00a60ed8	bl 0x00c342b0
00a60edc	mov w1,#0x102
00a60ee0	mov w0,#0x3b
00a60ee4	movk w1,#0xc, LSL #16
00a60ee8	mov x2,xzr
00a60eec	bl 0x00c342c0
00a60ef0	mov w0,wzr
00a60ef4	ldp x29,x30,[sp], #0x10
00a60ef8	ret

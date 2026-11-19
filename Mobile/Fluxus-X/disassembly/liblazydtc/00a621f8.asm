; OSSL_ENCODER_CTX_set_output_structure @ 00a621f8
00a621f8	cbz x0,0x00a6220c
00a621fc	cbz x1,0x00a6220c
00a62200	str x1,[x0, #0x10]
00a62204	mov w0,#0x1
00a62208	ret
00a6220c	stp x29,x30,[sp, #-0x10]!
00a62210	mov x29,sp
00a62214	bl 0x00c342a0
00a62218	adrp x0,0x2a0000
00a6221c	adrp x2,0x2cf000
00a62220	add x0,x0,#0x26d
00a62224	add x2,x2,#0xbb0
00a62228	mov w1,#0xb3
00a6222c	bl 0x00c342b0
00a62230	mov w1,#0x102
00a62234	mov w0,#0x3b
00a62238	movk w1,#0xc, LSL #16
00a6223c	mov x2,xzr
00a62240	bl 0x00c342c0
00a62244	mov w0,wzr
00a62248	ldp x29,x30,[sp], #0x10
00a6224c	ret

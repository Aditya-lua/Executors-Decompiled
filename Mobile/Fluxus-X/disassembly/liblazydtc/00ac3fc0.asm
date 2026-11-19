; ossl_global_properties_no_mirrored @ 00ac3fc0
00ac3fc0	stp x29,x30,[sp, #-0x10]!
00ac3fc4	adrp x2,0xc7c000
00ac3fc8	add x2,x2,#0x670
00ac3fcc	orr w1,wzr,#0xe
00ac3fd0	mov x29,sp
00ac3fd4	bl 0x00c3b520
00ac3fd8	cbz x0,0x00ac3fe4
00ac3fdc	ldrb w8,[x0, #0x8]
00ac3fe0	and w0,w8,#0x1
00ac3fe4	ldp x29,x30,[sp], #0x10
00ac3fe8	ret

; ossl_bn_is_word_fixed_top @ 00a02d98
00a02d98	sub sp,sp,#0x10
00a02d9c	ldr w9,[x0, #0x10]
00a02da0	mov x8,x0
00a02da4	mov w0,wzr
00a02da8	cbz w9,0x00a02db4
00a02dac	add sp,sp,#0x10
00a02db0	ret
00a02db4	ldr w9,[x8, #0x8]
00a02db8	cbz w9,0x00a02e30
00a02dbc	ldr x8,[x8]
00a02dc0	cmp w9,#0x2
00a02dc4	ldr x10,[x8]
00a02dc8	eor x10,x10,x1
00a02dcc	sub x11,x10,#0x1
00a02dd0	bic x10,x11,x10
00a02dd4	asr x10,x10,#0x3f
00a02dd8	str w10,[sp, #0xc]
00a02ddc	mvn w10,w10
00a02de0	ldr w11,[sp, #0xc]
00a02de4	str w10,[sp, #0xc]
00a02de8	ldr w10,[sp, #0xc]
00a02dec	and w0,w11,#0x1
00a02df0	b.lt 0x00a02dac
00a02df4	add x8,x8,#0x8
00a02df8	sub x9,x9,#0x1
00a02dfc	ldr x10,[x8], #0x8
00a02e00	subs x9,x9,#0x1
00a02e04	sub x11,x10,#0x1
00a02e08	bic x10,x11,x10
00a02e0c	asr x10,x10,#0x3f
00a02e10	str w10,[sp, #0xc]
00a02e14	mvn w10,w10
00a02e18	ldr w11,[sp, #0xc]
00a02e1c	str w10,[sp, #0xc]
00a02e20	ldr w10,[sp, #0xc]
00a02e24	and w0,w11,w0
00a02e28	b.ne 0x00a02dfc
00a02e2c	b 0x00a02dac
00a02e30	mov w0,wzr
00a02e34	add sp,sp,#0x10
00a02e38	ret

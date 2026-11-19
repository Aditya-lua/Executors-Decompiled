; SCT_set_signature_nid @ 00a13ed4
00a13ed4	cmp w1,#0x31a
00a13ed8	b.eq 0x00a13eec
00a13edc	cmp w1,#0x29c
00a13ee0	b.ne 0x00a13f00
00a13ee4	mov w8,#0x104
00a13ee8	b 0x00a13ef0
00a13eec	mov w8,#0x304
00a13ef0	str wzr,[x0, #0x60]
00a13ef4	strh w8,[x0, #0x40]
00a13ef8	mov w0,#0x1
00a13efc	ret
00a13f00	stp x29,x30,[sp, #-0x10]!
00a13f04	mov x29,sp
00a13f08	bl 0x00c342a0
00a13f0c	adrp x0,0x2a7000
00a13f10	adrp x2,0x2d3000
00a13f14	add x0,x0,#0xdc3
00a13f18	add x2,x2,#0x963
00a13f1c	mov w1,#0x8a
00a13f20	bl 0x00c342b0
00a13f24	mov w0,#0x32
00a13f28	mov w1,#0x65
00a13f2c	mov x2,xzr
00a13f30	bl 0x00c342c0
00a13f34	mov w0,wzr
00a13f38	ldp x29,x30,[sp], #0x10
00a13f3c	ret

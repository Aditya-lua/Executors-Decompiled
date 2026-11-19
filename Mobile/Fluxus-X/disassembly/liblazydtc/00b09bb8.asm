; X509_chain_up_ref @ 00b09bb8
00b09bb8	stp x20,x19,[sp, #-0x20]!
00b09bbc	stp x29,x30,[sp, #0x10]
00b09bc0	add x29,sp,#0x10
00b09bc4	bl 0x00c35330
00b09bc8	mov x19,x0
00b09bcc	cbz x0,0x00b09c40
00b09bd0	mov x0,x19
00b09bd4	bl 0x00c325e0
00b09bd8	cmp w0,#0x1
00b09bdc	b.lt 0x00b09c40
00b09be0	mov w20,wzr
00b09be4	mov x0,x19
00b09be8	mov w1,w20
00b09bec	bl 0x00c32610
00b09bf0	bl 0x00c350b0
00b09bf4	cbz w0,0x00b09c10
00b09bf8	mov x0,x19
00b09bfc	add w20,w20,#0x1
00b09c00	bl 0x00c325e0
00b09c04	cmp w20,w0
00b09c08	b.lt 0x00b09be4
00b09c0c	b 0x00b09c40
00b09c10	cbz w20,0x00b09c34
00b09c14	add w20,w20,#0x1
00b09c18	sub w1,w20,#0x2
00b09c1c	mov x0,x19
00b09c20	bl 0x00c32610
00b09c24	bl 0x00c31a90
00b09c28	sub w20,w20,#0x1
00b09c2c	cmp w20,#0x1
00b09c30	b.gt 0x00b09c18
00b09c34	mov x0,x19
00b09c38	bl 0x00c34770
00b09c3c	mov x19,xzr
00b09c40	ldp x29,x30,[sp, #0x10]
00b09c44	mov x0,x19
00b09c48	ldp x20,x19,[sp], #0x20
00b09c4c	ret

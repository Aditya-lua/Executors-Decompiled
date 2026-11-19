; X509v3_get_ext_by_critical @ 00b0d37c
00b0d37c	str x23,[sp, #-0x40]!
00b0d380	stp x22,x21,[sp, #0x10]
00b0d384	stp x20,x19,[sp, #0x20]
00b0d388	stp x29,x30,[sp, #0x30]
00b0d38c	add x29,sp,#0x30
00b0d390	cbz x0,0x00b0d3e8
00b0d394	add w8,w2,#0x1
00b0d398	mov w20,w1
00b0d39c	mov x21,x0
00b0d3a0	bic w19,w8,w8, ASR #0x1f
00b0d3a4	bl 0x00c325e0
00b0d3a8	cmp w19,w0
00b0d3ac	b.ge 0x00b0d3e8
00b0d3b0	mov w22,w0
00b0d3b4	cmp w20,#0x0
00b0d3b8	mov x0,x21
00b0d3bc	mov w1,w19
00b0d3c0	cset w23,ne
00b0d3c4	bl 0x00c32610
00b0d3c8	ldr w8,[x0, #0x8]
00b0d3cc	cmp w8,#0x0
00b0d3d0	cset w8,gt
00b0d3d4	cmp w23,w8
00b0d3d8	b.eq 0x00b0d3ec
00b0d3dc	add w19,w19,#0x1
00b0d3e0	cmp w19,w22
00b0d3e4	b.lt 0x00b0d3b4
00b0d3e8	mov w19,#0xffffffff
00b0d3ec	mov w0,w19
00b0d3f0	ldp x29,x30,[sp, #0x30]
00b0d3f4	ldp x20,x19,[sp, #0x20]
00b0d3f8	ldp x22,x21,[sp, #0x10]
00b0d3fc	ldr x23,[sp], #0x40
00b0d400	ret

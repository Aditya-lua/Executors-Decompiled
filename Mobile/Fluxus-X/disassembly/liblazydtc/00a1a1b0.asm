; DH_check_pub_key @ 00a1a1b0
00a1a1b0	stp x22,x21,[sp, #-0x30]!
00a1a1b4	stp x20,x19,[sp, #0x10]
00a1a1b8	stp x29,x30,[sp, #0x20]
00a1a1bc	mov x20,x0
00a1a1c0	mov x22,x0
00a1a1c4	ldr x0,[x20, #0x8]!
00a1a1c8	add x29,sp,#0x20
00a1a1cc	mov x19,x2
00a1a1d0	mov x21,x1
00a1a1d4	bl 0x00c322f0
00a1a1d8	cmp w0,#0x8, LSL #12
00a1a1dc	b.le 0x00a1a218
00a1a1e0	bl 0x00c342a0
00a1a1e4	adrp x0,0x2d9000
00a1a1e8	adrp x2,0x2af000
00a1a1ec	add x0,x0,#0xa63
00a1a1f0	add x2,x2,#0xdce
00a1a1f4	orr w1,wzr,#0xfe
00a1a1f8	bl 0x00c342b0
00a1a1fc	mov w0,#0x5
00a1a200	mov w1,#0x67
00a1a204	mov x2,xzr
00a1a208	bl 0x00c342c0
00a1a20c	mov w8,#0x104
00a1a210	mov w0,wzr
00a1a214	b 0x00a1a258
00a1a218	ldr x1,[x22, #0x10]
00a1a21c	cbz x1,0x00a1a22c
00a1a220	ldr x0,[x20]
00a1a224	bl 0x00c369c0
00a1a228	tbnz w0,#0x1f,0x00a1a248
00a1a22c	mov x0,x20
00a1a230	mov x2,x19
00a1a234	ldp x29,x30,[sp, #0x20]
00a1a238	ldp x20,x19,[sp, #0x10]
00a1a23c	mov x1,x21
00a1a240	ldp x22,x21,[sp], #0x30
00a1a244	b 0x00c39e70
00a1a248	ldr w8,[x19]
00a1a24c	mov w9,#0x24
00a1a250	mov w0,#0x1
00a1a254	orr w8,w8,w9
00a1a258	str w8,[x19]
00a1a25c	ldp x29,x30,[sp, #0x20]
00a1a260	ldp x20,x19,[sp, #0x10]
00a1a264	ldp x22,x21,[sp], #0x30
00a1a268	ret

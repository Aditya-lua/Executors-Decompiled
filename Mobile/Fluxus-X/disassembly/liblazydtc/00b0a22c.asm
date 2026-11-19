; X509_LOOKUP_free @ 00b0a22c
00b0a22c	cbz x0,0x00b0a274
00b0a230	str x19,[sp, #-0x20]!
00b0a234	stp x29,x30,[sp, #0x10]
00b0a238	ldr x8,[x0, #0x8]
00b0a23c	mov x19,x0
00b0a240	add x29,sp,#0x10
00b0a244	cbz x8,0x00b0a258
00b0a248	ldr x8,[x8, #0x10]
00b0a24c	cbz x8,0x00b0a258
00b0a250	mov x0,x19
00b0a254	blr x8
00b0a258	ldp x29,x30,[sp, #0x10]
00b0a25c	adrp x1,0x2aa000
00b0a260	add x1,x1,#0xba3
00b0a264	mov w2,#0x29
00b0a268	mov x0,x19
00b0a26c	ldr x19,[sp], #0x20
00b0a270	b 0x00c32310
00b0a274	ret

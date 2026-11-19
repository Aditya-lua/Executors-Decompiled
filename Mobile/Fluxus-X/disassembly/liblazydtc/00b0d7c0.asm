; X509_EXTENSION_set_data @ 00b0d7c0
00b0d7c0	cbz x0,0x00b0d7ec
00b0d7c4	stp x29,x30,[sp, #-0x10]!
00b0d7c8	ldr x8,[x1, #0x8]
00b0d7cc	ldr w2,[x1]
00b0d7d0	add x0,x0,#0x10
00b0d7d4	mov x29,sp
00b0d7d8	mov x1,x8
00b0d7dc	bl 0x00c377a0
00b0d7e0	cmp w0,#0x0
00b0d7e4	cset w0,ne
00b0d7e8	ldp x29,x30,[sp], #0x10
00b0d7ec	ret

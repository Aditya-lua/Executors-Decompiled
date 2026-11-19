; EVP_CIPHER_meth_new @ 00a864b8
00a864b8	str x21,[sp, #-0x30]!
00a864bc	stp x20,x19,[sp, #0x10]
00a864c0	stp x29,x30,[sp, #0x20]
00a864c4	add x29,sp,#0x20
00a864c8	mov w19,w2
00a864cc	mov w20,w1
00a864d0	mov w21,w0
00a864d4	bl 0x00c3cd50
00a864d8	cbz x0,0x00a864ec
00a864dc	mov w8,#0x2
00a864e0	stp w21,w20,[x0]
00a864e4	str w19,[x0, #0x8]
00a864e8	str w8,[x0, #0x18]
00a864ec	ldp x29,x30,[sp, #0x20]
00a864f0	ldp x20,x19,[sp, #0x10]
00a864f4	ldr x21,[sp], #0x30
00a864f8	ret

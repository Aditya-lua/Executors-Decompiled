; X509_set_version @ 00b0c6a8
00b0c6a8	stp x20,x19,[sp, #-0x20]!
00b0c6ac	stp x29,x30,[sp, #0x10]
00b0c6b0	add x29,sp,#0x10
00b0c6b4	cbz x0,0x00b0c6f4
00b0c6b8	mov x20,x0
00b0c6bc	ldr x0,[x0]
00b0c6c0	mov x19,x1
00b0c6c4	cbz x1,0x00b0c6e8
00b0c6c8	cbnz x0,0x00b0c6d8
00b0c6cc	bl 0x00c37f30
00b0c6d0	str x0,[x20]
00b0c6d4	cbz x0,0x00b0c6f4
00b0c6d8	ldp x29,x30,[sp, #0x10]
00b0c6dc	mov x1,x19
00b0c6e0	ldp x20,x19,[sp], #0x20
00b0c6e4	b 0x00c375b0
00b0c6e8	bl 0x00c37c30
00b0c6ec	str xzr,[x20]
00b0c6f0	mov w0,#0x1
00b0c6f4	ldp x29,x30,[sp, #0x10]
00b0c6f8	ldp x20,x19,[sp], #0x20
00b0c6fc	ret

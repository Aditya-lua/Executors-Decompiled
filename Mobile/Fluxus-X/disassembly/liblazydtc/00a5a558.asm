; EVP_CIPHER_free @ 00a5a558
00a5a558	stp x20,x19,[sp, #-0x20]!
00a5a55c	stp x29,x30,[sp, #0x10]
00a5a560	add x29,sp,#0x10
00a5a564	cbz x0,0x00a5a574
00a5a568	ldr w8,[x0, #0x18]
00a5a56c	mov x19,x0
00a5a570	cbz w8,0x00a5a580
00a5a574	ldp x29,x30,[sp, #0x10]
00a5a578	ldp x20,x19,[sp], #0x20
00a5a57c	ret
00a5a580	add x9,x19,#0x80
00a5a584	ldxr w8,[x9]
00a5a588	subs w10,w8,#0x1
00a5a58c	stxr w11,w10,[x9]
00a5a590	cbnz w11,0x00a5a584
00a5a594	b.ne 0x00a5a5a0
00a5a598	dmb ISHLD
00a5a59c	b 0x00a5a5a8
00a5a5a0	cmp w8,#0x1
00a5a5a4	b.gt 0x00a5a574
00a5a5a8	ldr x0,[x19, #0x68]
00a5a5ac	adrp x20,0x2a5000
00a5a5b0	add x20,x20,#0xf9d
00a5a5b4	mov w2,#0x69b
00a5a5b8	mov x1,x20
00a5a5bc	bl 0x00c32310
00a5a5c0	ldr x0,[x19, #0x78]
00a5a5c4	bl 0x00c3b690
00a5a5c8	ldr x0,[x19, #0x88]
00a5a5cc	bl 0x00c34d40
00a5a5d0	ldp x29,x30,[sp, #0x10]
00a5a5d4	mov w2,#0x69e
00a5a5d8	mov x0,x19
00a5a5dc	mov x1,x20
00a5a5e0	ldp x20,x19,[sp], #0x20
00a5a5e4	b 0x00c32310

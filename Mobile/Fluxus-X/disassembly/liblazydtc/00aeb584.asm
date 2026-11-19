; OSSL_STORE_LOADER_is_a @ 00aeb584
00aeb584	stp x20,x19,[sp, #-0x20]!
00aeb588	stp x29,x30,[sp, #0x10]
00aeb58c	mov x19,x0
00aeb590	ldr x0,[x0, #0x60]
00aeb594	add x29,sp,#0x10
00aeb598	cbz x0,0x00aeb5bc
00aeb59c	mov x20,x1
00aeb5a0	bl 0x00c3b2f0
00aeb5a4	bl 0x00c3b650
00aeb5a8	mov x1,x20
00aeb5ac	bl 0x00c3b620
00aeb5b0	ldr w8,[x19, #0x68]
00aeb5b4	cmp w0,w8
00aeb5b8	cset w0,eq
00aeb5bc	ldp x29,x30,[sp, #0x10]
00aeb5c0	ldp x20,x19,[sp], #0x20
00aeb5c4	ret

; CRYPTO_alloc_ex_data @ 00a84194
00a84194	stp x22,x21,[sp, #-0x30]!
00a84198	stp x20,x19,[sp, #0x10]
00a8419c	stp x29,x30,[sp, #0x20]
00a841a0	ldr x8,[x2, #0x8]
00a841a4	mov w19,w3
00a841a8	mov x20,x2
00a841ac	mov x21,x1
00a841b0	mov w22,w0
00a841b4	add x29,sp,#0x20
00a841b8	cbz x8,0x00a841f0
00a841bc	mov x0,x8
00a841c0	bl 0x00c325e0
00a841c4	cmp w0,w19
00a841c8	b.le 0x00a841f0
00a841cc	ldr x0,[x20, #0x8]
00a841d0	mov w1,w19
00a841d4	bl 0x00c32610
00a841d8	cbz x0,0x00a841f0
00a841dc	ldp x29,x30,[sp, #0x20]
00a841e0	ldp x20,x19,[sp, #0x10]
00a841e4	mov w0,#0x1
00a841e8	ldp x22,x21,[sp], #0x30
00a841ec	ret
00a841f0	mov x2,x20
00a841f4	mov w3,w19
00a841f8	ldp x29,x30,[sp, #0x20]
00a841fc	ldp x20,x19,[sp, #0x10]
00a84200	mov w0,w22
00a84204	mov x1,x21
00a84208	ldp x22,x21,[sp], #0x30
00a8420c	b 0x00a84210

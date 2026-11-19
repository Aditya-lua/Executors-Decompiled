; EVP_PKEY_CTX_hex2ctrl @ 00a77a84
00a77a84	str x21,[sp, #-0x30]!
00a77a88	stp x20,x19,[sp, #0x10]
00a77a8c	mov w20,w1
00a77a90	mov x21,x0
00a77a94	add x1,sp,#0x8
00a77a98	mov x0,x2
00a77a9c	stp x29,x30,[sp, #0x20]
00a77aa0	add x29,sp,#0x20
00a77aa4	bl 0x00c396a0
00a77aa8	cbz x0,0x00a77ae0
00a77aac	ldr x2,[sp, #0x8]
00a77ab0	orr w8,wzr,#0x7fffffff
00a77ab4	mov x19,x0
00a77ab8	cmp x2,x8
00a77abc	b.gt 0x00a77ae8
00a77ac0	ldr x8,[x21, #0x78]
00a77ac4	mov x0,x21
00a77ac8	mov w1,w20
00a77acc	mov x3,x19
00a77ad0	ldr x8,[x8, #0xc0]
00a77ad4	blr x8
00a77ad8	mov w20,w0
00a77adc	b 0x00a77aec
00a77ae0	mov w20,wzr
00a77ae4	b 0x00a77b00
00a77ae8	mov w20,#0xffffffff
00a77aec	adrp x1,0x2c3000
00a77af0	add x1,x1,#0xa9f
00a77af4	mov w2,#0x68f
00a77af8	mov x0,x19
00a77afc	bl 0x00c32310
00a77b00	mov w0,w20
00a77b04	ldp x29,x30,[sp, #0x20]
00a77b08	ldp x20,x19,[sp, #0x10]
00a77b0c	ldr x21,[sp], #0x30
00a77b10	ret

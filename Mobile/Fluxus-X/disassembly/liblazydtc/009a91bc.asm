; ssl3_put_cipher_by_char @ 009a91bc
009a91bc	stp x20,x19,[sp, #-0x20]!
009a91c0	stp x29,x30,[sp, #0x10]
009a91c4	ldr w8,[x0, #0x18]
009a91c8	mov x19,x2
009a91cc	mov x20,xzr
009a91d0	add x29,sp,#0x10
009a91d4	lsr w9,w8,#0x18
009a91d8	cmp w9,#0x3
009a91dc	b.ne 0x009a91fc
009a91e0	and w8,w8,#0xffff
009a91e4	mov w2,#0x2
009a91e8	mov x0,x1
009a91ec	mov x1,x8
009a91f0	mov w20,#0x2
009a91f4	bl 0x00c343a0
009a91f8	cbz w0,0x009a9204
009a91fc	mov w0,#0x1
009a9200	str x20,[x19]
009a9204	ldp x29,x30,[sp, #0x10]
009a9208	ldp x20,x19,[sp], #0x20
009a920c	ret

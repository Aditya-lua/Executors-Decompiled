; SSL_CIPHER_get_handshake_digest @ 009b11a8
009b11a8	ldrb w8,[x0, #0x40]
009b11ac	cmp w8,#0xd
009b11b0	b.ls 0x009b11bc
009b11b4	mov x0,xzr
009b11b8	ret
009b11bc	stp x29,x30,[sp, #-0x10]!
009b11c0	adrp x9,0x74b000
009b11c4	add x9,x9,#0xf1c
009b11c8	add x8,x9,w8, UXTW  #0x3
009b11cc	ldr w0,[x8, #0x4]
009b11d0	mov x29,sp
009b11d4	bl 0x00c324f0
009b11d8	ldp x29,x30,[sp], #0x10
009b11dc	b 0x00c35310

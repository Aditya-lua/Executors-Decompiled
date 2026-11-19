; SSL_COMP_get_compression_methods @ 009b0bbc
009b0bbc	stp x29,x30,[sp, #-0x10]!
009b0bc0	adrp x0,0xd21000
009b0bc4	adrp x1,0x9b1000
009b0bc8	add x0,x0,#0x8c0
009b0bcc	add x1,x1,#0x418
009b0bd0	mov x29,sp
009b0bd4	bl 0x00c34d60
009b0bd8	adrp x8,0xd21000
009b0bdc	ldr x0,[x8, #0x8b8]
009b0be0	ldp x29,x30,[sp], #0x10
009b0be4	ret

; OPENSSL_cipher_name @ 009b0ae8
009b0ae8	cbz x0,0x009b0b08
009b0aec	stp x29,x30,[sp, #-0x10]!
009b0af0	mov x29,sp
009b0af4	bl 0x00c34870
009b0af8	ldp x29,x30,[sp], #0x10
009b0afc	cbz x0,0x009b0b14
009b0b00	ldr x0,[x0, #0x8]
009b0b04	ret
009b0b08	adrp x0,0x2a1000
009b0b0c	add x0,x0,#0xdbf
009b0b10	ret
009b0b14	adrp x0,0x2a1000
009b0b18	add x0,x0,#0xdbf
009b0b1c	ret

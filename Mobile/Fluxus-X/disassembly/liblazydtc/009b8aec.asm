; SSL_free_buffers @ 009b8aec
009b8aec	str x19,[sp, #-0x20]!
009b8af0	add x19,x0,#0xc58
009b8af4	mov x0,x19
009b8af8	stp x29,x30,[sp, #0x10]
009b8afc	add x29,sp,#0x10
009b8b00	bl 0x00c347c0
009b8b04	mov w8,w0
009b8b08	mov w0,wzr
009b8b0c	cbnz w8,0x009b8b44
009b8b10	mov x0,x19
009b8b14	bl 0x00c347d0
009b8b18	mov w8,w0
009b8b1c	mov w0,wzr
009b8b20	cbnz w8,0x009b8b44
009b8b24	mov x0,x19
009b8b28	bl 0x00c358d0
009b8b2c	mov w8,w0
009b8b30	mov w0,wzr
009b8b34	cbnz w8,0x009b8b44
009b8b38	mov x0,x19
009b8b3c	bl 0x00c35900
009b8b40	mov w0,#0x1
009b8b44	ldp x29,x30,[sp, #0x10]
009b8b48	ldr x19,[sp], #0x20
009b8b4c	ret

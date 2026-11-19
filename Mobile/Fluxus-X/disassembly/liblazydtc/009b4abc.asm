; SSL_peek @ 009b4abc
009b4abc	sub sp,sp,#0x20
009b4ac0	stp x29,x30,[sp, #0x10]
009b4ac4	add x29,sp,#0x10
009b4ac8	tbnz w2,#0x1f,0x009b4ae8
009b4acc	sxtw x2,w2
009b4ad0	add x3,sp,#0x8
009b4ad4	bl 0x009b4b24
009b4ad8	ldr w8,[sp, #0x8]
009b4adc	cmp w0,#0x0
009b4ae0	csel w0,w8,w0,gt
009b4ae4	b 0x009b4b18
009b4ae8	bl 0x00c342a0
009b4aec	adrp x0,0x2c5000
009b4af0	adrp x2,0x2b5000
009b4af4	add x0,x0,#0x652
009b4af8	add x2,x2,#0x8b0
009b4afc	mov w1,#0x7e2
009b4b00	bl 0x00c342b0
009b4b04	mov w0,#0x14
009b4b08	mov w1,#0x10f
009b4b0c	mov x2,xzr
009b4b10	bl 0x00c342c0
009b4b14	mov w0,#0xffffffff
009b4b18	ldp x29,x30,[sp, #0x10]
009b4b1c	add sp,sp,#0x20
009b4b20	ret

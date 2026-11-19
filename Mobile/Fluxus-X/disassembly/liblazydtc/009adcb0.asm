; ssl_get_security_level_bits @ 009adcb0
009adcb0	str x19,[sp, #-0x20]!
009adcb4	mov x19,x2
009adcb8	stp x29,x30,[sp, #0x10]
009adcbc	add x29,sp,#0x10
009adcc0	cbz x1,0x009adcd0
009adcc4	mov x0,x1
009adcc8	bl 0x00c34eb0
009adccc	b 0x009adcd4
009adcd0	bl 0x00c34f30
009adcd4	bic w8,w0,w0, ASR #0x1f
009adcd8	cmp w8,#0x5
009adcdc	mov w9,#0x5
009adce0	csel w8,w8,w9,lt
009adce4	cbz x19,0x009adcec
009adce8	str w8,[x19]
009adcec	adrp x9,0x74b000
009adcf0	add x9,x9,#0x344
009adcf4	ldr w0,[x9, w8, UXTW #0x2]
009adcf8	ldp x29,x30,[sp, #0x10]
009adcfc	ldr x19,[sp], #0x20
009add00	ret

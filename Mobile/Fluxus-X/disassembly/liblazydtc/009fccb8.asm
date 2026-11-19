; BIO_indent @ 009fccb8
009fccb8	str x21,[sp, #-0x30]!
009fccbc	bic w8,w1,w1, ASR #0x1f
009fccc0	mvn w9,w2
009fccc4	mvn w10,w8
009fccc8	stp x20,x19,[sp, #0x10]
009fcccc	cmp w10,w9
009fccd0	adrp x20,0x2a1000
009fccd4	mov x19,x0
009fccd8	csinv w21,w9,w8,le
009fccdc	add x20,x20,#0x9a2
009fcce0	stp x29,x30,[sp, #0x20]
009fcce4	add x29,sp,#0x20
009fcce8	adds w21,w21,#0x1
009fccec	b.eq 0x009fcd0c
009fccf0	mov x0,x19
009fccf4	mov x1,x20
009fccf8	bl 0x009fc56c
009fccfc	cmp w0,#0x1
009fcd00	b.eq 0x009fcce8
009fcd04	mov w0,wzr
009fcd08	b 0x009fcd10
009fcd0c	mov w0,#0x1
009fcd10	ldp x29,x30,[sp, #0x20]
009fcd14	ldp x20,x19,[sp, #0x10]
009fcd18	ldr x21,[sp], #0x30
009fcd1c	ret

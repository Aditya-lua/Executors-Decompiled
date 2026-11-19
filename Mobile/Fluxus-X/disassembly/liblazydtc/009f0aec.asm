; ASN1_check_infinite_end @ 009f0aec
009f0aec	cmp x1,#0x1
009f0af0	b.lt 0x009f0b28
009f0af4	mov w8,wzr
009f0af8	b.eq 0x009f0b18
009f0afc	ldr x9,[x0]
009f0b00	mov w8,wzr
009f0b04	ldrb w10,[x9]
009f0b08	cbnz w10,0x009f0b18
009f0b0c	ldrb w10,[x9, #0x1]
009f0b10	mov w8,wzr
009f0b14	cbz w10,0x009f0b20
009f0b18	mov w0,w8
009f0b1c	ret
009f0b20	add x8,x9,#0x2
009f0b24	str x8,[x0]
009f0b28	mov w8,#0x1
009f0b2c	mov w0,w8
009f0b30	ret

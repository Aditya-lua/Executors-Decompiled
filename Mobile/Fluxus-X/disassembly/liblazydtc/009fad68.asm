; BIO_ADDR_rawaddress @ 009fad68
009fad68	stp x22,x21,[sp, #-0x30]!
009fad6c	stp x20,x19,[sp, #0x10]
009fad70	stp x29,x30,[sp, #0x20]
009fad74	ldrh w8,[x0]
009fad78	mov x19,x2
009fad7c	mov x20,x1
009fad80	add x29,sp,#0x20
009fad84	cmp w8,#0x1
009fad88	b.eq 0x009fadb0
009fad8c	cmp w8,#0xa
009fad90	b.eq 0x009fadf4
009fad94	cmp w8,#0x2
009fad98	mov w8,wzr
009fad9c	b.ne 0x009fade0
009fada0	add x21,x0,#0x4
009fada4	mov w22,#0x4
009fada8	cbnz x20,0x009fadc4
009fadac	b 0x009fadd4
009fadb0	add x21,x0,#0x2
009fadb4	mov x0,x21
009fadb8	bl 0x00c2ff50
009fadbc	mov x22,x0
009fadc0	cbz x20,0x009fadd4
009fadc4	mov x0,x20
009fadc8	mov x1,x21
009fadcc	mov x2,x22
009fadd0	bl 0x00c2ffd0
009fadd4	cbz x19,0x009faddc
009fadd8	str x22,[x19]
009faddc	mov w8,#0x1
009fade0	ldp x29,x30,[sp, #0x20]
009fade4	ldp x20,x19,[sp, #0x10]
009fade8	mov w0,w8
009fadec	ldp x22,x21,[sp], #0x30
009fadf0	ret
009fadf4	add x21,x0,#0x8
009fadf8	mov w22,#0x10
009fadfc	cbnz x20,0x009fadc4
009fae00	b 0x009fadd4

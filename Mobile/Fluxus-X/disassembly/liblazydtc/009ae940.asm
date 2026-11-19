; SSL_CTX_set_ciphersuites @ 009ae940
009ae940	str x19,[sp, #-0x20]!
009ae944	mov x19,x0
009ae948	add x0,x0,#0x20
009ae94c	stp x29,x30,[sp, #0x10]
009ae950	add x29,sp,#0x10
009ae954	bl 0x009ae98c
009ae958	cbz w0,0x009ae980
009ae95c	mov x1,x19
009ae960	ldr x8,[x1, #0x10]!
009ae964	cbz x8,0x009ae980
009ae968	ldr x3,[x19, #0x20]
009ae96c	ldp x29,x30,[sp, #0x10]
009ae970	add x2,x19,#0x18
009ae974	mov x0,x19
009ae978	ldr x19,[sp], #0x20
009ae97c	b 0x009aea44
009ae980	ldp x29,x30,[sp, #0x10]
009ae984	ldr x19,[sp], #0x20
009ae988	ret

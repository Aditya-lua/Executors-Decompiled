; BIO_pop @ 009fcf58
009fcf58	str x21,[sp, #-0x30]!
009fcf5c	stp x20,x19,[sp, #0x10]
009fcf60	stp x29,x30,[sp, #0x20]
009fcf64	add x29,sp,#0x20
009fcf68	cbz x0,0x009fcfac
009fcf6c	mov x21,x0
009fcf70	ldr x19,[x21, #0x48]!
009fcf74	orr w1,wzr,#0x7
009fcf78	mov x2,xzr
009fcf7c	mov x3,x0
009fcf80	mov x20,x0
009fcf84	bl 0x009fcb54
009fcf88	ldr x8,[x20, #0x50]
009fcf8c	cbz x8,0x009fcf98
009fcf90	ldr x9,[x21]
009fcf94	str x9,[x8, #0x48]
009fcf98	ldr x9,[x21]
009fcf9c	cbz x9,0x009fcfa4
009fcfa0	str x8,[x9, #0x50]
009fcfa4	stp xzr,xzr,[x21]
009fcfa8	b 0x009fcfb0
009fcfac	mov x19,xzr
009fcfb0	mov x0,x19
009fcfb4	ldp x29,x30,[sp, #0x20]
009fcfb8	ldp x20,x19,[sp, #0x10]
009fcfbc	ldr x21,[sp], #0x30
009fcfc0	ret

; BIO_push @ 009fcf00
009fcf00	str x19,[sp, #-0x20]!
009fcf04	stp x29,x30,[sp, #0x10]
009fcf08	add x29,sp,#0x10
009fcf0c	cbz x0,0x009fcf44
009fcf10	mov x19,x0
009fcf14	mov x8,x0
009fcf18	mov x3,x8
009fcf1c	ldr x8,[x8, #0x48]
009fcf20	cbnz x8,0x009fcf18
009fcf24	str x1,[x3, #0x48]
009fcf28	cbz x1,0x009fcf30
009fcf2c	str x3,[x1, #0x50]
009fcf30	orr w1,wzr,#0x6
009fcf34	mov x0,x19
009fcf38	mov x2,xzr
009fcf3c	bl 0x009fcb54
009fcf40	b 0x009fcf48
009fcf44	mov x19,x1
009fcf48	ldp x29,x30,[sp, #0x10]
009fcf4c	mov x0,x19
009fcf50	ldr x19,[sp], #0x20
009fcf54	ret

; tls_get_ticket_from_client @ 009c336c
009c336c	str x21,[sp, #-0x30]!
009c3370	stp x20,x19,[sp, #0x10]
009c3374	stp x29,x30,[sp, #0x20]
009c3378	str xzr,[x2]
009c337c	ldr w8,[x0]
009c3380	add x29,sp,#0x20
009c3384	str wzr,[x0, #0xa98]
009c3388	cmp w8,#0x301
009c338c	b.lt 0x009c33f0
009c3390	ldrb w8,[x0, #0x9e9]
009c3394	mov x21,x0
009c3398	tbnz w8,#0x6,0x009c33f0
009c339c	mov x19,x2
009c33a0	mov x20,x1
009c33a4	mov w1,#0xa
009c33a8	mov x0,x21
009c33ac	mov w2,wzr
009c33b0	mov w3,wzr
009c33b4	mov x4,xzr
009c33b8	bl 0x00c34a30
009c33bc	cbz w0,0x009c33f0
009c33c0	ldr x8,[x20, #0x288]
009c33c4	ldr w9,[x8, #0x100]
009c33c8	cbz w9,0x009c33f0
009c33cc	ldp x1,x2,[x8, #0xf0]
009c33d0	ldr x4,[x20, #0x28]
009c33d4	add x3,x20,#0x30
009c33d8	mov x5,x19
009c33dc	ldp x29,x30,[sp, #0x20]
009c33e0	ldp x20,x19,[sp, #0x10]
009c33e4	mov x0,x21
009c33e8	ldr x21,[sp], #0x30
009c33ec	b 0x009c3404
009c33f0	ldp x29,x30,[sp, #0x20]
009c33f4	ldp x20,x19,[sp, #0x10]
009c33f8	mov w0,#0x2
009c33fc	ldr x21,[sp], #0x30
009c3400	ret

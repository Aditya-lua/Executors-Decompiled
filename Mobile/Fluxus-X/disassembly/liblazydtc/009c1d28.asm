; tls1_lookup_md @ 009c1d28
009c1d28	str x19,[sp, #-0x20]!
009c1d2c	stp x29,x30,[sp, #0x10]
009c1d30	add x29,sp,#0x10
009c1d34	cbz x1,0x009c1d60
009c1d38	ldr w8,[x1, #0xc]
009c1d3c	mov x19,x2
009c1d40	cbz w8,0x009c1d70
009c1d44	ldr w1,[x1, #0x10]
009c1d48	bl 0x00c34a20
009c1d4c	cbz x0,0x009c1d64
009c1d50	cbz x19,0x009c1d58
009c1d54	str x0,[x19]
009c1d58	mov w0,#0x1
009c1d5c	b 0x009c1d64
009c1d60	mov w0,wzr
009c1d64	ldp x29,x30,[sp, #0x10]
009c1d68	ldr x19,[sp], #0x20
009c1d6c	ret
009c1d70	mov x0,xzr
009c1d74	cbnz x19,0x009c1d54
009c1d78	b 0x009c1d58

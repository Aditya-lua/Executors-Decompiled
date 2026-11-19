; tls1_group_id_lookup @ 009c0e54
009c0e54	ldr x8,[x0, #0x630]
009c0e58	cbz x8,0x009c0e80
009c0e5c	ldr x0,[x0, #0x628]
009c0e60	mov x9,xzr
009c0e64	ldrh w10,[x0, #0x1c]
009c0e68	cmp w10,w1, UXTH 
009c0e6c	b.eq 0x009c0e84
009c0e70	add x9,x9,#0x1
009c0e74	cmp x9,x8
009c0e78	add x0,x0,#0x38
009c0e7c	b.cc 0x009c0e64
009c0e80	mov x0,xzr
009c0e84	ret

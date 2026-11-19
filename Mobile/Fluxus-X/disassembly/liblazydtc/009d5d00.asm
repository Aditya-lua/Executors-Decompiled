; custom_ext_init @ 009d5d00
009d5d00	ldr x8,[x0, #0x8]
009d5d04	cbz x8,0x009d5d60
009d5d08	ldr x11,[x0]
009d5d0c	cmp x8,#0x1
009d5d10	b.ne 0x009d5d20
009d5d14	mov x9,xzr
009d5d18	mov x10,x11
009d5d1c	b 0x009d5d4c
009d5d20	and x9,x8,#-0x2
009d5d24	orr w10,wzr,#0x38
009d5d28	madd x10,x9,x10,x11
009d5d2c	add x11,x11,#0x44
009d5d30	mov x12,x9
009d5d34	stur wzr,[x11, #-0x38]
009d5d38	str wzr,[x11], #0x70
009d5d3c	subs x12,x12,#0x2
009d5d40	b.ne 0x009d5d34
009d5d44	cmp x8,x9
009d5d48	b.eq 0x009d5d60
009d5d4c	add x10,x10,#0xc
009d5d50	add x9,x9,#0x1
009d5d54	cmp x9,x8
009d5d58	str wzr,[x10], #0x38
009d5d5c	b.cc 0x009d5d50
009d5d60	ret

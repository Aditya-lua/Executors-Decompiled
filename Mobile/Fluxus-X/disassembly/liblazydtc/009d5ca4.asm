; custom_ext_find @ 009d5ca4
009d5ca4	ldr x8,[x0, #0x8]
009d5ca8	cbz x8,0x009d5cec
009d5cac	ldr x0,[x0]
009d5cb0	mov x9,xzr
009d5cb4	ldrh w10,[x0]
009d5cb8	cmp w10,w2
009d5cbc	b.ne 0x009d5cdc
009d5cc0	cmp w1,#0x2
009d5cc4	b.eq 0x009d5cf4
009d5cc8	ldr w10,[x0, #0x4]
009d5ccc	cmp w10,w1
009d5cd0	b.eq 0x009d5cf4
009d5cd4	cmp w10,#0x2
009d5cd8	b.eq 0x009d5cf4
009d5cdc	add x9,x9,#0x1
009d5ce0	cmp x9,x8
009d5ce4	add x0,x0,#0x38
009d5ce8	b.cc 0x009d5cb4
009d5cec	mov x0,xzr
009d5cf0	ret
009d5cf4	cbz x3,0x009d5cf0
009d5cf8	str x9,[x3]
009d5cfc	ret

; BIO_ADDR_path_string @ 009fb0d8
009fb0d8	ldrh w8,[x0]
009fb0dc	cmp w8,#0x1
009fb0e0	b.ne 0x009fb0f8
009fb0e4	adrp x1,0x2cd000
009fb0e8	add x0,x0,#0x2
009fb0ec	add x1,x1,#0x866
009fb0f0	mov w2,#0x12d
009fb0f4	b 0x00c34600
009fb0f8	mov x0,xzr
009fb0fc	ret

; tls1_nid2group_id @ 009c0edc
009c0edc	adrp x9,0x74c000
009c0ee0	add x9,x9,#0xc34
009c0ee4	mov x8,xzr
009c0ee8	add x9,x9,#0x4
009c0eec	ldur w10,[x9, #-0x4]
009c0ef0	cmp w10,w0
009c0ef4	b.eq 0x009c0f10
009c0ef8	add x8,x8,#0x1
009c0efc	cmp x8,#0x2a
009c0f00	add x9,x9,#0x8
009c0f04	b.cc 0x009c0eec
009c0f08	mov w0,wzr
009c0f0c	ret
009c0f10	ldrh w0,[x9]
009c0f14	ret

; SipHash_set_hash_size @ 00b55ee0
00b55ee0	cmp x1,#0x0
00b55ee4	mov w8,#0x10
00b55ee8	csel x9,x8,x1,eq
00b55eec	cmp x9,#0x10
00b55ef0	b.eq 0x00b55f00
00b55ef4	cmp x9,#0x8
00b55ef8	mov w8,wzr
00b55efc	b.ne 0x00b55f34
00b55f00	ldr w8,[x0, #0x2c]
00b55f04	mov w10,#0x10
00b55f08	cmp w8,#0x0
00b55f0c	csel x8,x10,x8,eq
00b55f10	cmp x8,x9
00b55f14	str w8,[x0, #0x2c]
00b55f18	b.eq 0x00b55f30
00b55f1c	ldr x8,[x0, #0x10]
00b55f20	mov w10,#0xee
00b55f24	str w9,[x0, #0x2c]
00b55f28	eor x8,x8,x10
00b55f2c	str x8,[x0, #0x10]
00b55f30	mov w8,#0x1
00b55f34	mov w0,w8
00b55f38	ret

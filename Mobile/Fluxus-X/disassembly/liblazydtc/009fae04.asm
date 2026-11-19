; BIO_ADDR_rawport @ 009fae04
009fae04	ldrh w8,[x0]
009fae08	orr w8,w8,#0x8
009fae0c	cmp w8,#0xa
009fae10	b.ne 0x009fae1c
009fae14	ldrh w0,[x0, #0x2]
009fae18	ret
009fae1c	mov w0,wzr
009fae20	ret

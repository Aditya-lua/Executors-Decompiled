; BIO_ADDR_sockaddr_size @ 009fb108
009fb108	ldrh w8,[x0]
009fb10c	cmp w8,#0x1
009fb110	b.eq 0x009fb12c
009fb114	cmp w8,#0x2
009fb118	b.eq 0x009fb134
009fb11c	cmp w8,#0xa
009fb120	b.ne 0x009fb13c
009fb124	orr w0,wzr,#0x1c
009fb128	ret
009fb12c	mov w0,#0x6e
009fb130	ret
009fb134	mov w0,#0x10
009fb138	ret
009fb13c	orr w0,wzr,#0x70
009fb140	ret

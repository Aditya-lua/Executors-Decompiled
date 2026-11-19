; BIO_ADDRINFO_protocol @ 009fb168
009fb168	cbz x0,0x009fb1a8
009fb16c	ldr w8,[x0, #0xc]
009fb170	cbnz w8,0x009fb1a0
009fb174	ldr w8,[x0, #0x4]
009fb178	cmp w8,#0x1
009fb17c	mov w8,wzr
009fb180	b.eq 0x009fb1a0
009fb184	ldr w8,[x0, #0x8]
009fb188	mov w9,#0x11
009fb18c	cmp w8,#0x2
009fb190	csel w9,w9,wzr,eq
009fb194	cmp w8,#0x1
009fb198	orr w8,wzr,#0x6
009fb19c	csel w8,w8,w9,eq
009fb1a0	mov w0,w8
009fb1a4	ret
009fb1a8	mov w0,wzr
009fb1ac	ret

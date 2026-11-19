; SSL_get_signature_type_nid @ 009c2b08
009c2b08	ldr x8,[x0, #0x380]
009c2b0c	cbz x8,0x009c2b20
009c2b10	ldr w8,[x8, #0x14]
009c2b14	mov w0,#0x1
009c2b18	str w8,[x1]
009c2b1c	ret
009c2b20	mov w0,wzr
009c2b24	ret

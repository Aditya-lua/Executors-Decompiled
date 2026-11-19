; SSL_get_peer_signature_type_nid @ 009c2ae8
009c2ae8	ldr x8,[x0, #0x3b0]
009c2aec	cbz x8,0x009c2b00
009c2af0	ldr w8,[x8, #0x14]
009c2af4	mov w0,#0x1
009c2af8	str w8,[x1]
009c2afc	ret
009c2b00	mov w0,wzr
009c2b04	ret

; SSL_export_keying_material_early @ 009b61f4
009b61f4	ldr w8,[x0]
009b61f8	cmp w8,#0x304
009b61fc	b.ne 0x009b6204
009b6200	b 0x00c35e70
009b6204	mov w0,wzr
009b6208	ret

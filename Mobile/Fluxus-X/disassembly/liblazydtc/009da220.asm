; SSL_is_init_finished @ 009da220
009da220	ldr w9,[x0, #0x64]
009da224	mov x8,x0
009da228	mov w0,wzr
009da22c	cbz w9,0x009da234
009da230	ret
009da234	ldr w8,[x8, #0x5c]
009da238	cmp w8,#0x1
009da23c	cset w0,eq
009da240	ret

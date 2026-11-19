; SSL_in_before @ 009da244
009da244	ldr w9,[x0, #0x5c]
009da248	mov x8,x0
009da24c	mov w0,wzr
009da250	cbz w9,0x009da258
009da254	ret
009da258	ldr w8,[x8, #0x48]
009da25c	cmp w8,#0x0
009da260	cset w0,eq
009da264	ret

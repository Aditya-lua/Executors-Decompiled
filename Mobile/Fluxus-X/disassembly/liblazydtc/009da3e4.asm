; ossl_statem_skip_early_data @ 009da3e4
009da3e4	ldr w8,[x0, #0xb30]
009da3e8	cmp w8,#0x1
009da3ec	b.ne 0x009da414
009da3f0	ldr w8,[x0, #0x38]
009da3f4	cbz w8,0x009da414
009da3f8	ldr w8,[x0, #0x5c]
009da3fc	cmp w8,#0x2e
009da400	b.ne 0x009da414
009da404	ldr w8,[x0, #0x8e8]
009da408	cmp w8,#0x2
009da40c	cset w0,ne
009da410	ret
009da414	mov w0,wzr
009da418	ret

; ossl_statem_export_early_allowed @ 009db214
009db214	ldr w8,[x0, #0xb30]
009db218	cmp w8,#0x2
009db21c	b.ne 0x009db228
009db220	mov w0,#0x1
009db224	ret
009db228	ldr w9,[x0, #0x38]
009db22c	mov w0,wzr
009db230	cbz w9,0x009db238
009db234	ret
009db238	cmp w8,#0x0
009db23c	cset w0,ne
009db240	ret

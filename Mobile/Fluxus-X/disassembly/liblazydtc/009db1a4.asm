; ossl_statem_app_data_allowed @ 009db1a4
009db1a4	ldr w8,[x0, #0x48]
009db1a8	cbz w8,0x009db1ec
009db1ac	ldr w8,[x0, #0x1b8]
009db1b0	cbz w8,0x009db1ec
009db1b4	ldr w8,[x0, #0x1b0]
009db1b8	cbz w8,0x009db1ec
009db1bc	ldr w9,[x0, #0x38]
009db1c0	ldr w8,[x0, #0x5c]
009db1c4	cbz w9,0x009db1dc
009db1c8	mov w0,#0x1
009db1cc	cbz w8,0x009db1d8
009db1d0	cmp w8,#0x14
009db1d4	b.ne 0x009db1ec
009db1d8	ret
009db1dc	cmp w8,#0xc
009db1e0	b.ne 0x009db1ec
009db1e4	mov w0,#0x1
009db1e8	ret
009db1ec	mov w0,wzr
009db1f0	ret

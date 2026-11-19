; ossl_statem_export_allowed @ 009db1f4
009db1f4	ldr x8,[x0, #0x478]
009db1f8	cbz x8,0x009db20c
009db1fc	ldr w8,[x0, #0x5c]
009db200	cmp w8,#0x24
009db204	cset w0,ne
009db208	ret
009db20c	mov w0,wzr
009db210	ret

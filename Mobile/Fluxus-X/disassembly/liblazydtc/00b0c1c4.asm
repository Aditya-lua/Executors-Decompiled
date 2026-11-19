; X509_REQ_extension_nid @ 00b0c1c4
00b0c1c4	adrp x8,0xcc9000
00b0c1c8	ldr x8,[x8, #0xbd8]
00b0c1cc	ldr w9,[x8]
00b0c1d0	cbz w9,0x00b0c1f0
00b0c1d4	add x8,x8,#0x4
00b0c1d8	cmp w9,w0
00b0c1dc	b.eq 0x00b0c1f8
00b0c1e0	ldr w9,[x8], #0x4
00b0c1e4	cbnz w9,0x00b0c1d8
00b0c1e8	mov w0,wzr
00b0c1ec	ret
00b0c1f0	mov w0,wzr
00b0c1f4	ret
00b0c1f8	mov w0,#0x1
00b0c1fc	ret

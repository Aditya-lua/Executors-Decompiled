; mbedtls_oid_get_certificate_policies @ 00ba951c
00ba951c	cbz x0,0x00ba954c
00ba9520	ldr x8,[x0, #0x8]
00ba9524	cmp x8,#0x4
00ba9528	b.ne 0x00ba9554
00ba952c	ldr x8,[x0, #0x10]
00ba9530	mov w9,#0x1d55
00ba9534	movk w9,#0x20, LSL #16
00ba9538	ldr w8,[x8]
00ba953c	cmp w8,w9
00ba9540	b.eq 0x00ba955c
00ba9544	mov w0,#0xffffffd2
00ba9548	ret
00ba954c	mov w0,#0xffffffd2
00ba9550	ret
00ba9554	mov w0,#0xffffffd2
00ba9558	ret
00ba955c	adrp x8,0x2d6000
00ba9560	mov w0,wzr
00ba9564	add x8,x8,#0xd6e
00ba9568	str x8,[x1]
00ba956c	ret

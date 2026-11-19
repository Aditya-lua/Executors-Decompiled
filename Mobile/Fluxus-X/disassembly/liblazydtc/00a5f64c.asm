; EVP_MD_get0_name @ 00a5f64c
00a5f64c	cbz x0,0x00a5f660
00a5f650	ldr x8,[x0, #0x60]
00a5f654	cbz x8,0x00a5f668
00a5f658	mov x0,x8
00a5f65c	ret
00a5f660	mov x0,xzr
00a5f664	ret
00a5f668	ldr w0,[x0]
00a5f66c	b 0x00c324f0

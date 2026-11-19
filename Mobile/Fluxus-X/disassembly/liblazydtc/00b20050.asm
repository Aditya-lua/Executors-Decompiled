; ossl_prov_get_capabilities @ 00b20050
00b20050	stp x22,x21,[sp, #-0x30]!
00b20054	mov x0,x1
00b20058	adrp x1,0x2d7000
00b2005c	add x1,x1,#0xa59
00b20060	stp x20,x19,[sp, #0x10]
00b20064	stp x29,x30,[sp, #0x20]
00b20068	add x29,sp,#0x20
00b2006c	mov x19,x3
00b20070	mov x20,x2
00b20074	bl 0x00c35ee0
00b20078	mov w8,w0
00b2007c	mov w0,wzr
00b20080	cbnz w8,0x00b200b4
00b20084	adrp x21,0xc87000
00b20088	mov x22,xzr
00b2008c	add x21,x21,#0x868
00b20090	mov x0,x21
00b20094	mov x1,x19
00b20098	blr x20
00b2009c	cbz w0,0x00b200b4
00b200a0	add x22,x22,#0x1
00b200a4	cmp x22,#0x31
00b200a8	add x21,x21,#0x190
00b200ac	b.ls 0x00b20090
00b200b0	mov w0,#0x1
00b200b4	ldp x29,x30,[sp, #0x20]
00b200b8	ldp x20,x19,[sp, #0x10]
00b200bc	ldp x22,x21,[sp], #0x30
00b200c0	ret

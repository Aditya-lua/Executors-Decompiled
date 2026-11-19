; PKCS7_add_attrib_content_type @ 00ac25b0
00ac25b0	stp x20,x19,[sp, #-0x20]!
00ac25b4	mov x20,x1
00ac25b8	mov w1,#0x32
00ac25bc	stp x29,x30,[sp, #0x10]
00ac25c0	add x29,sp,#0x10
00ac25c4	mov x19,x0
00ac25c8	bl 0x00c3f780
00ac25cc	cbz x0,0x00ac25e0
00ac25d0	ldp x29,x30,[sp, #0x10]
00ac25d4	mov w0,wzr
00ac25d8	ldp x20,x19,[sp], #0x20
00ac25dc	ret
00ac25e0	cbnz x20,0x00ac25f0
00ac25e4	mov w0,#0x15
00ac25e8	bl 0x00c37740
00ac25ec	mov x20,x0
00ac25f0	ldp x29,x30,[sp, #0x10]
00ac25f4	mov w1,#0x32
00ac25f8	orr w2,wzr,#0x6
00ac25fc	mov x0,x19
00ac2600	mov x3,x20
00ac2604	ldp x20,x19,[sp], #0x20
00ac2608	b 0x00c3f760

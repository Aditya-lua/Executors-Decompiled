; OCSP_REQUEST_add_ext @ 00ab0ec4
00ab0ec4	stp x29,x30,[sp, #-0x10]!
00ab0ec8	add x0,x0,#0x18
00ab0ecc	mov x29,sp
00ab0ed0	bl 0x00c3efc0
00ab0ed4	cmp x0,#0x0
00ab0ed8	cset w0,ne
00ab0edc	ldp x29,x30,[sp], #0x10
00ab0ee0	ret

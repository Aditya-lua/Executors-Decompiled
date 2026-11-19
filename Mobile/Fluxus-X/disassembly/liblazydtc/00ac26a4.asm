; PKCS7_add1_attrib_digest @ 00ac26a4
00ac26a4	stp x22,x21,[sp, #-0x30]!
00ac26a8	stp x20,x19,[sp, #0x10]
00ac26ac	stp x29,x30,[sp, #0x20]
00ac26b0	add x29,sp,#0x20
00ac26b4	mov w21,w2
00ac26b8	mov x22,x1
00ac26bc	mov x20,x0
00ac26c0	bl 0x00c38170
00ac26c4	cbz x0,0x00ac2708
00ac26c8	mov x1,x22
00ac26cc	mov w2,w21
00ac26d0	mov x19,x0
00ac26d4	bl 0x00c378a0
00ac26d8	cbz w0,0x00ac26fc
00ac26dc	mov w1,#0x33
00ac26e0	mov w2,#0x4
00ac26e4	mov x0,x20
00ac26e8	mov x3,x19
00ac26ec	bl 0x00c3f760
00ac26f0	cbz w0,0x00ac26fc
00ac26f4	mov w0,#0x1
00ac26f8	b 0x00ac2708
00ac26fc	mov x0,x19
00ac2700	bl 0x00c35530
00ac2704	mov w0,wzr
00ac2708	ldp x29,x30,[sp, #0x20]
00ac270c	ldp x20,x19,[sp, #0x10]
00ac2710	ldp x22,x21,[sp], #0x30
00ac2714	ret

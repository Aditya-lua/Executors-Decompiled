; OCSP_resp_find @ 00aafe90
00aafe90	str x21,[sp, #-0x30]!
00aafe94	stp x20,x19,[sp, #0x10]
00aafe98	stp x29,x30,[sp, #0x20]
00aafe9c	add x29,sp,#0x20
00aafea0	cbz x0,0x00aafeec
00aafea4	ldr x21,[x0, #0x20]
00aafea8	cmp w2,#0x0
00aafeac	mov x20,x1
00aafeb0	csinc w19,wzr,w2,lt
00aafeb4	b 0x00aafebc
00aafeb8	add w19,w19,#0x1
00aafebc	mov x0,x21
00aafec0	bl 0x00c325e0
00aafec4	cmp w19,w0
00aafec8	b.ge 0x00aafeec
00aafecc	mov x0,x21
00aafed0	mov w1,w19
00aafed4	bl 0x00c32610
00aafed8	ldr x1,[x0]
00aafedc	mov x0,x20
00aafee0	bl 0x00c3ef20
00aafee4	cbnz w0,0x00aafeb8
00aafee8	b 0x00aafef0
00aafeec	mov w19,#0xffffffff
00aafef0	mov w0,w19
00aafef4	ldp x29,x30,[sp, #0x20]
00aafef8	ldp x20,x19,[sp, #0x10]
00aafefc	ldr x21,[sp], #0x30
00aaff00	ret

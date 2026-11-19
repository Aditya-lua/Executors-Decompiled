; ossl_dsa_check_params @ 00b4de64
00b4de64	str x21,[sp, #-0x30]!
00b4de68	stp x20,x19,[sp, #0x10]
00b4de6c	mov w20,w1
00b4de70	mov x1,x2
00b4de74	stp x29,x30,[sp, #0x20]
00b4de78	add x29,sp,#0x20
00b4de7c	mov x19,x2
00b4de80	mov x21,x0
00b4de84	bl 0x00b4ded4
00b4de88	cbz w0,0x00b4deb4
00b4de8c	ldr x0,[x21, #0xb8]
00b4de90	cmp w20,#0x1
00b4de94	add x1,x21,#0x8
00b4de98	mov w2,wzr
00b4de9c	mov x3,x19
00b4dea0	b.ne 0x00b4dec4
00b4dea4	ldp x29,x30,[sp, #0x20]
00b4dea8	ldp x20,x19,[sp, #0x10]
00b4deac	ldr x21,[sp], #0x30
00b4deb0	b 0x00c39fd0
00b4deb4	ldp x29,x30,[sp, #0x20]
00b4deb8	ldp x20,x19,[sp, #0x10]
00b4debc	ldr x21,[sp], #0x30
00b4dec0	ret
00b4dec4	ldp x29,x30,[sp, #0x20]
00b4dec8	ldp x20,x19,[sp, #0x10]
00b4decc	ldr x21,[sp], #0x30
00b4ded0	b 0x00c3dd30

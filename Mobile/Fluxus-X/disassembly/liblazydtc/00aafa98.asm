; OCSP_request_set1_name @ 00aafa98
00aafa98	str x21,[sp, #-0x30]!
00aafa9c	stp x20,x19,[sp, #0x10]
00aafaa0	stp x29,x30,[sp, #0x20]
00aafaa4	add x29,sp,#0x20
00aafaa8	mov x21,x1
00aafaac	mov x19,x0
00aafab0	bl 0x00c3ef10
00aafab4	cbz x0,0x00aafaf4
00aafab8	mov x20,x0
00aafabc	add x0,x0,#0x8
00aafac0	mov x1,x21
00aafac4	bl 0x00c3ef30
00aafac8	cbz w0,0x00aafae8
00aafacc	mov w8,#0x4
00aafad0	str w8,[x20]
00aafad4	ldr x0,[x19, #0x8]
00aafad8	bl 0x00c3ef00
00aafadc	mov w0,#0x1
00aafae0	str x20,[x19, #0x8]
00aafae4	b 0x00aafaf4
00aafae8	mov x0,x20
00aafaec	bl 0x00c3ef00
00aafaf0	mov w0,wzr
00aafaf4	ldp x29,x30,[sp, #0x20]
00aafaf8	ldp x20,x19,[sp, #0x10]
00aafafc	ldr x21,[sp], #0x30
00aafb00	ret

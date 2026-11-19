; d2i_X509_REQ_bio @ 00b15fc0
00b15fc0	stp x22,x21,[sp, #-0x30]!
00b15fc4	stp x20,x19,[sp, #0x10]
00b15fc8	mov x19,x1
00b15fcc	mov x20,x0
00b15fd0	stp x29,x30,[sp, #0x20]
00b15fd4	add x29,sp,#0x20
00b15fd8	cbz x1,0x00b15fec
00b15fdc	ldr x8,[x19]
00b15fe0	cbz x8,0x00b15fec
00b15fe4	ldp x21,x22,[x8, #0x68]
00b15fe8	b 0x00b15ff4
00b15fec	mov x21,xzr
00b15ff0	mov x22,xzr
00b15ff4	bl 0x00c40f00
00b15ff8	mov x1,x20
00b15ffc	mov x2,x19
00b16000	ldp x29,x30,[sp, #0x20]
00b16004	ldp x20,x19,[sp, #0x10]
00b16008	mov x3,x21
00b1600c	mov x4,x22
00b16010	ldp x22,x21,[sp], #0x30
00b16014	b 0x00c37430

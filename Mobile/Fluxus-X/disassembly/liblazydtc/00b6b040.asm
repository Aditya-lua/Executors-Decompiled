; mbedtls_ccm_setkey @ 00b6b040
00b6b040	stp x22,x21,[sp, #-0x30]!
00b6b044	stp x20,x19,[sp, #0x10]
00b6b048	stp x29,x30,[sp, #0x20]
00b6b04c	add x29,sp,#0x20
00b6b050	mov x20,x2
00b6b054	mov x21,x0
00b6b058	mov w2,#0x1
00b6b05c	mov w0,w1
00b6b060	mov w1,w3
00b6b064	mov w19,w3
00b6b068	bl 0x00c42160
00b6b06c	mov x22,x0
00b6b070	cbz x0,0x00b6b0c0
00b6b074	ldr w8,[x22, #0x8]
00b6b078	and w8,w8,#0x1f
00b6b07c	cmp w8,#0x10
00b6b080	b.ne 0x00b6b0c0
00b6b084	add x21,x21,#0x48
00b6b088	mov x0,x21
00b6b08c	bl 0x00c30290
00b6b090	mov x0,x21
00b6b094	mov x1,x22
00b6b098	bl 0x00c30280
00b6b09c	cbnz w0,0x00b6b0c4
00b6b0a0	mov x1,x20
00b6b0a4	mov w2,w19
00b6b0a8	ldp x29,x30,[sp, #0x20]
00b6b0ac	ldp x20,x19,[sp, #0x10]
00b6b0b0	mov w3,#0x1
00b6b0b4	mov x0,x21
00b6b0b8	ldp x22,x21,[sp], #0x30
00b6b0bc	b 0x00c302a0
00b6b0c0	orr w0,wzr,#0xfffffff3
00b6b0c4	ldp x29,x30,[sp, #0x20]
00b6b0c8	ldp x20,x19,[sp, #0x10]
00b6b0cc	ldp x22,x21,[sp], #0x30
00b6b0d0	ret

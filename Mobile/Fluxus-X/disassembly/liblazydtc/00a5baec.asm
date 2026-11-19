; EVP_EncryptInit @ 00a5baec
00a5baec	stp x22,x21,[sp, #-0x30]!
00a5baf0	stp x20,x19,[sp, #0x10]
00a5baf4	mov x19,x3
00a5baf8	mov x20,x2
00a5bafc	mov x21,x1
00a5bb00	mov x22,x0
00a5bb04	stp x29,x30,[sp, #0x20]
00a5bb08	add x29,sp,#0x20
00a5bb0c	cbz x1,0x00a5bb18
00a5bb10	mov x0,x22
00a5bb14	bl 0x00a5a430
00a5bb18	mov x3,x20
00a5bb1c	mov x4,x19
00a5bb20	ldp x29,x30,[sp, #0x20]
00a5bb24	ldp x20,x19,[sp, #0x10]
00a5bb28	mov w5,#0x1
00a5bb2c	mov x0,x22
00a5bb30	mov x1,x21
00a5bb34	mov x2,xzr
00a5bb38	mov x6,xzr
00a5bb3c	ldp x22,x21,[sp], #0x30
00a5bb40	b 0x00a5a64c

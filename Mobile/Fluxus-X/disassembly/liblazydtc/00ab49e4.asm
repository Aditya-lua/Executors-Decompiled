; PEM_read_bio_RSAPrivateKey @ 00ab49e4
00ab49e4	str x21,[sp, #-0x30]!
00ab49e8	stp x20,x19,[sp, #0x10]
00ab49ec	mov x19,x1
00ab49f0	mov x1,xzr
00ab49f4	stp x29,x30,[sp, #0x20]
00ab49f8	add x29,sp,#0x20
00ab49fc	bl 0x00c32640
00ab4a00	cbz x0,0x00ab4a30
00ab4a04	mov x21,x0
00ab4a08	bl 0x00c32470
00ab4a0c	mov x20,x0
00ab4a10	mov x0,x21
00ab4a14	bl 0x00c32450
00ab4a18	cbz x20,0x00ab4a34
00ab4a1c	cbz x19,0x00ab4a34
00ab4a20	ldr x0,[x19]
00ab4a24	bl 0x00c326d0
00ab4a28	str x20,[x19]
00ab4a2c	b 0x00ab4a34
00ab4a30	mov x20,xzr
00ab4a34	mov x0,x20
00ab4a38	ldp x29,x30,[sp, #0x20]
00ab4a3c	ldp x20,x19,[sp, #0x10]
00ab4a40	ldr x21,[sp], #0x30
00ab4a44	ret

; ZSTD_freeDDict @ 00bb3bd4
00bb3bd4	cbz x0,0x00bb3c3c
00bb3bd8	stp x29,x30,[sp, #-0x30]!
00bb3bdc	str x21,[sp, #0x10]
00bb3be0	stp x20,x19,[sp, #0x20]
00bb3be4	mov x29,sp
00bb3be8	ldr x1,[x0]
00bb3bec	ldr x21,[x0, #0x6ac8]
00bb3bf0	mov x19,x0
00bb3bf4	ldr x20,[x0, #0x6ad0]
00bb3bf8	cbz x1,0x00bb3c0c
00bb3bfc	cbz x21,0x00bb3c20
00bb3c00	mov x0,x20
00bb3c04	blr x21
00bb3c08	b 0x00bb3c10
00bb3c0c	cbz x21,0x00bb3c28
00bb3c10	mov x0,x20
00bb3c14	mov x1,x19
00bb3c18	blr x21
00bb3c1c	b 0x00bb3c30
00bb3c20	mov x0,x1
00bb3c24	bl 0x00c30960
00bb3c28	mov x0,x19
00bb3c2c	bl 0x00c30960
00bb3c30	ldp x20,x19,[sp, #0x20]
00bb3c34	ldr x21,[sp, #0x10]
00bb3c38	ldp x29,x30,[sp], #0x30
00bb3c3c	mov x0,xzr
00bb3c40	ret

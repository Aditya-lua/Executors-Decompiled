; ossl_md5_sha1_init @ 00aa6cf8
00aa6cf8	str x19,[sp, #-0x20]!
00aa6cfc	stp x29,x30,[sp, #0x10]
00aa6d00	add x29,sp,#0x10
00aa6d04	mov x19,x0
00aa6d08	bl 0x00c32010
00aa6d0c	cbz w0,0x00aa6d20
00aa6d10	ldp x29,x30,[sp, #0x10]
00aa6d14	add x0,x19,#0x5c
00aa6d18	ldr x19,[sp], #0x20
00aa6d1c	b 0x00c3d580
00aa6d20	ldp x29,x30,[sp, #0x10]
00aa6d24	ldr x19,[sp], #0x20
00aa6d28	ret

; ossl_ec_GF2m_simple_group_get_curve @ 00a29e9c
00a29e9c	str x21,[sp, #-0x30]!
00a29ea0	stp x20,x19,[sp, #0x10]
00a29ea4	mov x19,x3
00a29ea8	mov x21,x2
00a29eac	mov x20,x0
00a29eb0	stp x29,x30,[sp, #0x20]
00a29eb4	add x29,sp,#0x20
00a29eb8	cbz x1,0x00a29ed0
00a29ebc	ldr x8,[x20, #0x40]
00a29ec0	mov x0,x1
00a29ec4	mov x1,x8
00a29ec8	bl 0x00c36990
00a29ecc	cbz x0,0x00a29efc
00a29ed0	cbz x21,0x00a29ee4
00a29ed4	ldr x1,[x20, #0x60]
00a29ed8	mov x0,x21
00a29edc	bl 0x00c36990
00a29ee0	cbz x0,0x00a29efc
00a29ee4	cbz x19,0x00a29ef8
00a29ee8	ldr x1,[x20, #0x68]
00a29eec	mov x0,x19
00a29ef0	bl 0x00c36990
00a29ef4	cbz x0,0x00a29efc
00a29ef8	mov w0,#0x1
00a29efc	ldp x29,x30,[sp, #0x20]
00a29f00	ldp x20,x19,[sp, #0x10]
00a29f04	ldr x21,[sp], #0x30
00a29f08	ret

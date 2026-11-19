; ossl_ec_GF2m_simple_group_init @ 00a29bd8
00a29bd8	str x19,[sp, #-0x20]!
00a29bdc	stp x29,x30,[sp, #0x10]
00a29be0	add x29,sp,#0x10
00a29be4	mov x19,x0
00a29be8	bl 0x00c37710
00a29bec	str x0,[x19, #0x40]
00a29bf0	bl 0x00c37710
00a29bf4	str x0,[x19, #0x60]
00a29bf8	bl 0x00c37710
00a29bfc	ldr x8,[x19, #0x40]
00a29c00	str x0,[x19, #0x68]
00a29c04	cbz x8,0x00a29c1c
00a29c08	cbz x0,0x00a29c1c
00a29c0c	ldr x9,[x19, #0x60]
00a29c10	cbz x9,0x00a29c1c
00a29c14	mov w0,#0x1
00a29c18	b 0x00a29c38
00a29c1c	mov x0,x8
00a29c20	bl 0x00c36290
00a29c24	ldr x0,[x19, #0x60]
00a29c28	bl 0x00c36290
00a29c2c	ldr x0,[x19, #0x68]
00a29c30	bl 0x00c36290
00a29c34	mov w0,wzr
00a29c38	ldp x29,x30,[sp, #0x10]
00a29c3c	ldr x19,[sp], #0x20
00a29c40	ret

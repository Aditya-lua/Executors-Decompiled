; EVP_PKEY_CTX_is_a @ 00a75bcc
00a75bcc	mov x8,x0
00a75bd0	ldr x0,[x0, #0x20]
00a75bd4	cbz x0,0x00a75bdc
00a75bd8	b 0x00c3b6d0
00a75bdc	str x19,[sp, #-0x20]!
00a75be0	stp x29,x30,[sp, #0x10]
00a75be4	ldr x8,[x8, #0x78]
00a75be8	mov x0,x1
00a75bec	add x29,sp,#0x10
00a75bf0	ldr w19,[x8]
00a75bf4	bl 0x00c3d9d0
00a75bf8	ldp x29,x30,[sp, #0x10]
00a75bfc	cmp w19,w0
00a75c00	cset w0,eq
00a75c04	ldr x19,[sp], #0x20
00a75c08	ret

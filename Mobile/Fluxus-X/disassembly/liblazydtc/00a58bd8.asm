; EVP_MD_settable_ctx_params @ 00a58bd8
00a58bd8	str x19,[sp, #-0x20]!
00a58bdc	stp x29,x30,[sp, #0x10]
00a58be0	add x29,sp,#0x10
00a58be4	cbz x0,0x00a58c18
00a58be8	ldr x8,[x0, #0xe0]
00a58bec	mov x19,x0
00a58bf0	cbz x8,0x00a58c18
00a58bf4	mov x0,x19
00a58bf8	bl 0x00c35810
00a58bfc	bl 0x00c3b680
00a58c00	ldr x2,[x19, #0xe0]
00a58c04	ldp x29,x30,[sp, #0x10]
00a58c08	mov x1,x0
00a58c0c	mov x0,xzr
00a58c10	ldr x19,[sp], #0x20
00a58c14	br x2
00a58c18	ldp x29,x30,[sp, #0x10]
00a58c1c	mov x0,xzr
00a58c20	ldr x19,[sp], #0x20
00a58c24	ret

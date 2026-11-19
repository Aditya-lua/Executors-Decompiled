; OSSL_PARAM_get_utf8_ptr @ 00a9f77c
00a9f77c	mov x8,x0
00a9f780	mov w0,wzr
00a9f784	cbz x8,0x00a9f7ac
00a9f788	cbz x1,0x00a9f7ac
00a9f78c	ldr w9,[x8, #0x8]
00a9f790	mov w0,wzr
00a9f794	cmp w9,#0x6
00a9f798	b.ne 0x00a9f7ac
00a9f79c	ldr x8,[x8, #0x10]
00a9f7a0	mov w0,#0x1
00a9f7a4	ldr x8,[x8]
00a9f7a8	str x8,[x1]
00a9f7ac	ret

; OSSL_PARAM_get_octet_string_ptr @ 00a9f910
00a9f910	mov w8,wzr
00a9f914	cbz x0,0x00a9f964
00a9f918	cbz x1,0x00a9f964
00a9f91c	ldr w8,[x0, #0x8]
00a9f920	cmp w8,#0x5
00a9f924	b.eq 0x00a9f94c
00a9f928	cmp w8,#0x7
00a9f92c	mov w8,wzr
00a9f930	b.ne 0x00a9f964
00a9f934	cbz x2,0x00a9f940
00a9f938	ldr x8,[x0, #0x18]
00a9f93c	str x8,[x2]
00a9f940	ldr x8,[x0, #0x10]
00a9f944	ldr x8,[x8]
00a9f948	b 0x00a9f95c
00a9f94c	cbz x2,0x00a9f958
00a9f950	ldr x8,[x0, #0x18]
00a9f954	str x8,[x2]
00a9f958	ldr x8,[x0, #0x10]
00a9f95c	str x8,[x1]
00a9f960	mov w8,#0x1
00a9f964	mov w0,w8
00a9f968	ret

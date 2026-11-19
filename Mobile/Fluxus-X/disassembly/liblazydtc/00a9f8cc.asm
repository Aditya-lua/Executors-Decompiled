; OSSL_PARAM_get_utf8_string_ptr @ 00a9f8cc
00a9f8cc	mov x8,x0
00a9f8d0	mov w0,wzr
00a9f8d4	cbz x8,0x00a9f90c
00a9f8d8	cbz x1,0x00a9f90c
00a9f8dc	ldr w9,[x8, #0x8]
00a9f8e0	cmp w9,#0x4
00a9f8e4	b.eq 0x00a9f900
00a9f8e8	cmp w9,#0x6
00a9f8ec	mov w0,wzr
00a9f8f0	b.ne 0x00a9f90c
00a9f8f4	ldr x8,[x8, #0x10]
00a9f8f8	ldr x8,[x8]
00a9f8fc	b 0x00a9f904
00a9f900	ldr x8,[x8, #0x10]
00a9f904	mov w0,#0x1
00a9f908	str x8,[x1]
00a9f90c	ret

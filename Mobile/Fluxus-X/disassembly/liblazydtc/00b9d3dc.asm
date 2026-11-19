; mbedtls_psa_ffdh_import_key @ 00b9d3dc
00b9d3dc	str x21,[sp, #-0x30]!
00b9d3e0	stp x20,x19,[sp, #0x10]
00b9d3e4	stp x29,x30,[sp, #0x20]
00b9d3e8	add x29,sp,#0x20
00b9d3ec	mov x19,x6
00b9d3f0	mov x20,x5
00b9d3f4	mov x21,x2
00b9d3f8	cmp x4,x2
00b9d3fc	b.cs 0x00b9d408
00b9d400	mov w0,#0xffffff76
00b9d404	b 0x00b9d424
00b9d408	mov x0,x3
00b9d40c	mov x2,x21
00b9d410	bl 0x00c2ffd0
00b9d414	mov w0,wzr
00b9d418	lsl x8,x21,#0x3
00b9d41c	str x21,[x20]
00b9d420	str x8,[x19]
00b9d424	ldp x29,x30,[sp, #0x20]
00b9d428	ldp x20,x19,[sp, #0x10]
00b9d42c	ldr x21,[sp], #0x30
00b9d430	ret

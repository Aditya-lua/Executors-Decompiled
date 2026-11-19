; OSSL_PARAM_set_utf8_string @ 00a9f5f8
00a9f5f8	str x21,[sp, #-0x30]!
00a9f5fc	stp x20,x19,[sp, #0x10]
00a9f600	stp x29,x30,[sp, #0x20]
00a9f604	add x29,sp,#0x20
00a9f608	cbz x0,0x00a9f684
00a9f60c	mov x20,x1
00a9f610	mov x19,x0
00a9f614	str xzr,[x0, #0x20]
00a9f618	cbz x1,0x00a9f680
00a9f61c	mov x0,x20
00a9f620	bl 0x00c2ff50
00a9f624	ldr x8,[x19, #0x10]
00a9f628	str x0,[x19, #0x20]
00a9f62c	cbz x8,0x00a9f678
00a9f630	ldr w9,[x19, #0x8]
00a9f634	mov x21,x0
00a9f638	mov w0,wzr
00a9f63c	cmp w9,#0x4
00a9f640	b.ne 0x00a9f684
00a9f644	ldr x9,[x19, #0x18]
00a9f648	mov w0,wzr
00a9f64c	cmp x9,x21
00a9f650	b.cc 0x00a9f684
00a9f654	mov x0,x8
00a9f658	mov x1,x20
00a9f65c	mov x2,x21
00a9f660	bl 0x00c2ffd0
00a9f664	ldr x8,[x19, #0x18]
00a9f668	cmp x8,x21
00a9f66c	b.ls 0x00a9f678
00a9f670	ldr x8,[x19, #0x10]
00a9f674	strb wzr,[x8, x21]
00a9f678	mov w0,#0x1
00a9f67c	b 0x00a9f684
00a9f680	mov w0,wzr
00a9f684	ldp x29,x30,[sp, #0x20]
00a9f688	ldp x20,x19,[sp, #0x10]
00a9f68c	ldr x21,[sp], #0x30
00a9f690	ret

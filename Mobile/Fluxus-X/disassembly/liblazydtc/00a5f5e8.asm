; EVP_MD_is_a @ 00a5f5e8
00a5f5e8	str x19,[sp, #-0x20]!
00a5f5ec	stp x29,x30,[sp, #0x10]
00a5f5f0	add x29,sp,#0x10
00a5f5f4	cbz x0,0x00a5f614
00a5f5f8	ldr x8,[x0, #0x70]
00a5f5fc	mov x19,x1
00a5f600	cbz x8,0x00a5f620
00a5f604	ldr w1,[x0, #0x58]
00a5f608	mov x0,x8
00a5f60c	mov x2,xzr
00a5f610	b 0x00a5f63c
00a5f614	ldp x29,x30,[sp, #0x10]
00a5f618	ldr x19,[sp], #0x20
00a5f61c	ret
00a5f620	ldr x2,[x0, #0x60]
00a5f624	cbnz x2,0x00a5f634
00a5f628	ldr w0,[x0]
00a5f62c	bl 0x00c324f0
00a5f630	mov x2,x0
00a5f634	mov x0,xzr
00a5f638	mov w1,wzr
00a5f63c	ldp x29,x30,[sp, #0x10]
00a5f640	mov x3,x19
00a5f644	ldr x19,[sp], #0x20
00a5f648	b 0x00c3bf70

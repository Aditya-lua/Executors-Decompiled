; ENGINE_set_default_pkey_asn1_meths @ 00a527c8
00a527c8	str x19,[sp, #-0x20]!
00a527cc	stp x29,x30,[sp, #0x10]
00a527d0	ldr x8,[x0, #0x50]
00a527d4	add x29,sp,#0x10
00a527d8	cbz x8,0x00a52820
00a527dc	add x2,sp,#0x8
00a527e0	mov x1,xzr
00a527e4	mov w3,wzr
00a527e8	mov x19,x0
00a527ec	blr x8
00a527f0	cmp w0,#0x0
00a527f4	b.le 0x00a52820
00a527f8	ldr x3,[sp, #0x8]
00a527fc	mov w4,w0
00a52800	adrp x0,0xd21000
00a52804	adrp x1,0xa52000
00a52808	add x0,x0,#0x9c8
00a5280c	add x1,x1,#0x730
00a52810	mov w5,#0x1
00a52814	mov x2,x19
00a52818	bl 0x00c3bce0
00a5281c	b 0x00a52824
00a52820	mov w0,#0x1
00a52824	ldp x29,x30,[sp, #0x10]
00a52828	ldr x19,[sp], #0x20
00a5282c	ret

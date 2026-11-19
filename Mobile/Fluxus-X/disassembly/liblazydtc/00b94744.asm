; mbedtls_ecp_write_key @ 00b94744
00b94744	str x21,[sp, #-0x30]!
00b94748	stp x20,x19,[sp, #0x10]
00b9474c	stp x29,x30,[sp, #0x20]
00b94750	add x29,sp,#0x20
00b94754	ldr x8,[x0, #0x38]
00b94758	mov x19,x2
00b9475c	mov x21,x0
00b94760	mov x20,x1
00b94764	cbz x8,0x00b9478c
00b94768	ldr x8,[x21, #0x48]
00b9476c	cbz x8,0x00b94794
00b94770	mov x1,x20
00b94774	mov x2,x19
00b94778	ldp x29,x30,[sp, #0x20]
00b9477c	ldp x20,x19,[sp, #0x10]
00b94780	add x0,x21,#0xc0
00b94784	ldr x21,[sp], #0x30
00b94788	b 0x00c41d80
00b9478c	mov w0,#0xffffff92
00b94790	b 0x00b947ec
00b94794	ldr w8,[x21]
00b94798	cmp w8,#0x9
00b9479c	b.ne 0x00b947ac
00b947a0	cmp x19,#0x20
00b947a4	b.cs 0x00b947c4
00b947a8	b 0x00b947bc
00b947ac	cmp x19,#0x37
00b947b0	b.hi 0x00b947c4
00b947b4	cmp w8,#0xd
00b947b8	b.ne 0x00b947c4
00b947bc	mov w0,#0xffffb100
00b947c0	b 0x00b947ec
00b947c4	add x0,x21,#0xc0
00b947c8	mov x1,x20
00b947cc	mov x2,x19
00b947d0	bl 0x00c41d90
00b947d4	cbnz w0,0x00b947ec
00b947d8	ldr x8,[x21, #0x38]
00b947dc	cbz x8,0x00b947e8
00b947e0	ldr x8,[x21, #0x48]
00b947e4	cbnz x8,0x00b94770
00b947e8	mov w0,wzr
00b947ec	ldp x29,x30,[sp, #0x20]
00b947f0	ldp x20,x19,[sp, #0x10]
00b947f4	ldr x21,[sp], #0x30
00b947f8	ret

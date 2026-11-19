; EVP_PKEY_set_params @ 00a6f5d0
00a6f5d0	cbz x0,0x00a6f5f4
00a6f5d4	ldr x8,[x0, #0x60]
00a6f5d8	cbz x8,0x00a6f5f4
00a6f5dc	mov x2,x1
00a6f5e0	ldp x1,x9,[x0, #0x68]
00a6f5e4	add x9,x9,#0x1
00a6f5e8	str x9,[x0, #0x70]
00a6f5ec	mov x0,x8
00a6f5f0	b 0x00c3d440
00a6f5f4	stp x29,x30,[sp, #-0x10]!
00a6f5f8	mov x29,sp
00a6f5fc	bl 0x00c342a0
00a6f600	adrp x0,0x2c1000
00a6f604	adrp x2,0x2dc000
00a6f608	add x0,x0,#0xcf9
00a6f60c	add x2,x2,#0x96
00a6f610	mov w1,#0x94c
00a6f614	bl 0x00c342b0
00a6f618	orr w0,wzr,#0x6
00a6f61c	mov w1,#0xa3
00a6f620	mov x2,xzr
00a6f624	bl 0x00c342c0
00a6f628	mov w0,wzr
00a6f62c	ldp x29,x30,[sp], #0x10
00a6f630	ret

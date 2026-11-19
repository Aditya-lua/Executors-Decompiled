; EVP_MD_meth_new @ 00a5f76c
00a5f76c	stp x20,x19,[sp, #-0x20]!
00a5f770	stp x29,x30,[sp, #0x10]
00a5f774	add x29,sp,#0x10
00a5f778	mov w19,w1
00a5f77c	mov w20,w0
00a5f780	bl 0x00c3c290
00a5f784	cbz x0,0x00a5f794
00a5f788	mov w8,#0x2
00a5f78c	stp w20,w19,[x0]
00a5f790	str w8,[x0, #0x18]
00a5f794	ldp x29,x30,[sp, #0x10]
00a5f798	ldp x20,x19,[sp], #0x20
00a5f79c	ret

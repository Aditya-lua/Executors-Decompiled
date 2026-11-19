; EVP_CIPHER_CTX_set_padding @ 00a5c744
00a5c744	sub sp,sp,#0xa0
00a5c748	stp x20,x19,[sp, #0x80]
00a5c74c	mov w20,w1
00a5c750	mov x19,x0
00a5c754	add x0,sp,#0x30
00a5c758	mov w2,#0x50
00a5c75c	mov w1,wzr
00a5c760	stp x29,x30,[sp, #0x90]
00a5c764	add x29,sp,#0x90
00a5c768	bl 0x00c301c0
00a5c76c	str w20,[sp, #0x2c]
00a5c770	ldr x9,[x19, #0x70]
00a5c774	ldr x8,[x19]
00a5c778	cmp w20,#0x0
00a5c77c	orr x10,x9,#0x100
00a5c780	and x9,x9,#-0x101
00a5c784	csel x9,x10,x9,eq
00a5c788	str x9,[x19, #0x70]
00a5c78c	cbz x8,0x00a5c798
00a5c790	ldr x8,[x8, #0x78]
00a5c794	cbz x8,0x00a5c7d8
00a5c798	adrp x0,0x2bd000
00a5c79c	add x0,x0,#0xa9e
00a5c7a0	mov x8,sp
00a5c7a4	add x1,sp,#0x2c
00a5c7a8	bl 0x00c37340
00a5c7ac	ldr x8,[sp, #0x20]
00a5c7b0	ldp q1,q0,[sp]
00a5c7b4	add x2,sp,#0x30
00a5c7b8	str x8,[sp, #0x50]
00a5c7bc	stp q1,q0,[sp, #0x30]
00a5c7c0	ldr x0,[x19]
00a5c7c4	ldr x1,[x19, #0xa8]
00a5c7c8	bl 0x00c3cd70
00a5c7cc	cmp w0,#0x0
00a5c7d0	cset w0,ne
00a5c7d4	b 0x00a5c7dc
00a5c7d8	mov w0,#0x1
00a5c7dc	ldp x29,x30,[sp, #0x90]
00a5c7e0	ldp x20,x19,[sp, #0x80]
00a5c7e4	add sp,sp,#0xa0
00a5c7e8	ret

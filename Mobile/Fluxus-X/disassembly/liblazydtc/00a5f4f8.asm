; EVP_CIPHER_CTX_get_key_length @ 00a5f4f8
00a5f4f8	sub sp,sp,#0xa0
00a5f4fc	stp x29,x30,[sp, #0x90]
00a5f500	ldrsw x8,[x0, #0x68]
00a5f504	str x19,[sp, #0x80]
00a5f508	add x29,sp,#0x90
00a5f50c	mov x19,x0
00a5f510	add x0,sp,#0x30
00a5f514	mov w2,#0x50
00a5f518	mov w1,wzr
00a5f51c	stur x8,[x29, #-0x8]
00a5f520	bl 0x00c301c0
00a5f524	adrp x0,0x2bd000
00a5f528	add x0,x0,#0xa97
00a5f52c	add x8,sp,#0x8
00a5f530	sub x1,x29,#0x8
00a5f534	bl 0x00c36270
00a5f538	ldr x8,[sp, #0x28]
00a5f53c	ldur q0,[sp, #0x18]
00a5f540	ldur q1,[sp, #0x8]
00a5f544	add x2,sp,#0x30
00a5f548	str x8,[sp, #0x50]
00a5f54c	stp q1,q0,[sp, #0x30]
00a5f550	ldr x0,[x19]
00a5f554	ldr x1,[x19, #0xa8]
00a5f558	bl 0x00c3cd60
00a5f55c	ldur w8,[x29, #-0x8]
00a5f560	ldp x29,x30,[sp, #0x90]
00a5f564	ldr x19,[sp, #0x80]
00a5f568	cmp w0,#0x0
00a5f56c	csinv w0,w8,wzr,ne
00a5f570	add sp,sp,#0xa0
00a5f574	ret

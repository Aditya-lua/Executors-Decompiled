; EVP_CIPHER_CTX_get_num @ 00a5f3ec
00a5f3ec	sub sp,sp,#0xa0
00a5f3f0	stp x29,x30,[sp, #0x90]
00a5f3f4	ldr w8,[x0, #0x58]
00a5f3f8	str x19,[sp, #0x80]
00a5f3fc	add x29,sp,#0x90
00a5f400	mov x19,x0
00a5f404	add x0,sp,#0x30
00a5f408	mov w2,#0x50
00a5f40c	mov w1,wzr
00a5f410	stur w8,[x29, #-0x4]
00a5f414	bl 0x00c301c0
00a5f418	adrp x0,0x2aa000
00a5f41c	add x0,x0,#0x191
00a5f420	add x8,sp,#0x8
00a5f424	sub x1,x29,#0x4
00a5f428	bl 0x00c37340
00a5f42c	ldr x8,[sp, #0x28]
00a5f430	ldur q0,[sp, #0x18]
00a5f434	ldur q1,[sp, #0x8]
00a5f438	add x2,sp,#0x30
00a5f43c	str x8,[sp, #0x50]
00a5f440	stp q1,q0,[sp, #0x30]
00a5f444	ldr x0,[x19]
00a5f448	ldr x1,[x19, #0xa8]
00a5f44c	bl 0x00c3cd60
00a5f450	ldur w8,[x29, #-0x4]
00a5f454	ldp x29,x30,[sp, #0x90]
00a5f458	ldr x19,[sp, #0x80]
00a5f45c	cmp w0,#0x0
00a5f460	csinv w0,w8,wzr,ne
00a5f464	add sp,sp,#0xa0
00a5f468	ret

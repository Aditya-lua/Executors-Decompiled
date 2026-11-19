; EVP_PKEY_get_int_param @ 00a6f3e0
00a6f3e0	sub sp,sp,#0xa0
00a6f3e4	str x19,[sp, #0x80]
00a6f3e8	stp x29,x30,[sp, #0x90]
00a6f3ec	add x29,sp,#0x90
00a6f3f0	cbz x1,0x00a6f460
00a6f3f4	mov x19,x0
00a6f3f8	add x8,sp,#0x8
00a6f3fc	mov x0,x1
00a6f400	mov x1,x2
00a6f404	bl 0x00c36260
00a6f408	ldr x8,[sp, #0x28]
00a6f40c	ldur q0,[sp, #0x18]
00a6f410	ldur q1,[sp, #0x8]
00a6f414	str x8,[sp, #0x50]
00a6f418	add x8,sp,#0x8
00a6f41c	stp q1,q0,[sp, #0x30]
00a6f420	bl 0x00c34c40
00a6f424	ldr x8,[sp, #0x28]
00a6f428	ldur q0,[sp, #0x18]
00a6f42c	ldur q1,[sp, #0x8]
00a6f430	add x1,sp,#0x30
00a6f434	mov x0,x19
00a6f438	str x8,[sp, #0x78]
00a6f43c	stur q0,[sp, #0x68]
00a6f440	stur q1,[sp, #0x58]
00a6f444	bl 0x00a6f360
00a6f448	cbz w0,0x00a6f464
00a6f44c	add x0,sp,#0x30
00a6f450	bl 0x00c3d030
00a6f454	cmp w0,#0x0
00a6f458	cset w0,ne
00a6f45c	b 0x00a6f464
00a6f460	mov w0,wzr
00a6f464	ldp x29,x30,[sp, #0x90]
00a6f468	ldr x19,[sp, #0x80]
00a6f46c	add sp,sp,#0xa0
00a6f470	ret

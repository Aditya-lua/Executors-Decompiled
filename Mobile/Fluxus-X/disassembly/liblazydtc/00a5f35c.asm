; EVP_CIPHER_CTX_get_original_iv @ 00a5f35c
00a5f35c	sub sp,sp,#0xb0
00a5f360	str x21,[sp, #0x80]
00a5f364	stp x20,x19,[sp, #0x90]
00a5f368	mov x19,x2
00a5f36c	mov x20,x1
00a5f370	mov x21,x0
00a5f374	add x0,sp,#0x30
00a5f378	mov w2,#0x50
00a5f37c	mov w1,wzr
00a5f380	stp x29,x30,[sp, #0xa0]
00a5f384	add x29,sp,#0xa0
00a5f388	bl 0x00c301c0
00a5f38c	adrp x0,0x2bd000
00a5f390	add x0,x0,#0xad8
00a5f394	add x8,sp,#0x8
00a5f398	mov x1,x20
00a5f39c	mov x2,x19
00a5f3a0	bl 0x00c34c50
00a5f3a4	ldr x8,[sp, #0x28]
00a5f3a8	ldur q0,[sp, #0x18]
00a5f3ac	ldur q1,[sp, #0x8]
00a5f3b0	add x2,sp,#0x30
00a5f3b4	str x8,[sp, #0x50]
00a5f3b8	stp q1,q0,[sp, #0x30]
00a5f3bc	ldr x0,[x21]
00a5f3c0	ldr x1,[x21, #0xa8]
00a5f3c4	bl 0x00c3cd60
00a5f3c8	ldp x29,x30,[sp, #0xa0]
00a5f3cc	ldp x20,x19,[sp, #0x90]
00a5f3d0	ldr x21,[sp, #0x80]
00a5f3d4	cmp w0,#0x0
00a5f3d8	cset w0,gt
00a5f3dc	add sp,sp,#0xb0
00a5f3e0	ret

; EVP_CIPHER_CTX_get_updated_iv @ 00a5f2d4
00a5f2d4	sub sp,sp,#0xb0
00a5f2d8	str x21,[sp, #0x80]
00a5f2dc	stp x20,x19,[sp, #0x90]
00a5f2e0	mov x19,x2
00a5f2e4	mov x20,x1
00a5f2e8	mov x21,x0
00a5f2ec	add x0,sp,#0x30
00a5f2f0	mov w2,#0x50
00a5f2f4	mov w1,wzr
00a5f2f8	stp x29,x30,[sp, #0xa0]
00a5f2fc	add x29,sp,#0xa0
00a5f300	bl 0x00c301c0
00a5f304	adrp x0,0x2af000
00a5f308	add x0,x0,#0xfc0
00a5f30c	add x8,sp,#0x8
00a5f310	mov x1,x20
00a5f314	mov x2,x19
00a5f318	bl 0x00c34c50
00a5f31c	ldr x8,[sp, #0x28]
00a5f320	ldur q0,[sp, #0x18]
00a5f324	ldur q1,[sp, #0x8]
00a5f328	add x2,sp,#0x30
00a5f32c	str x8,[sp, #0x50]
00a5f330	stp q1,q0,[sp, #0x30]
00a5f334	ldr x0,[x21]
00a5f338	ldr x1,[x21, #0xa8]
00a5f33c	bl 0x00c3cd60
00a5f340	ldp x29,x30,[sp, #0xa0]
00a5f344	ldp x20,x19,[sp, #0x90]
00a5f348	ldr x21,[sp, #0x80]
00a5f34c	cmp w0,#0x0
00a5f350	cset w0,gt
00a5f354	add sp,sp,#0xb0
00a5f358	ret

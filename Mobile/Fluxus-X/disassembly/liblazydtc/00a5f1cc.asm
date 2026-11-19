; EVP_CIPHER_CTX_iv @ 00a5f1cc
00a5f1cc	sub sp,sp,#0xa0
00a5f1d0	str x19,[sp, #0x80]
00a5f1d4	stp x29,x30,[sp, #0x90]
00a5f1d8	add x29,sp,#0x90
00a5f1dc	mov x19,x0
00a5f1e0	add x8,x0,#0x28
00a5f1e4	add x0,sp,#0x30
00a5f1e8	mov w2,#0x50
00a5f1ec	mov w1,wzr
00a5f1f0	stur x8,[x29, #-0x8]
00a5f1f4	bl 0x00c301c0
00a5f1f8	adrp x0,0x2af000
00a5f1fc	add x0,x0,#0xfc0
00a5f200	add x8,sp,#0x8
00a5f204	sub x1,x29,#0x8
00a5f208	mov w2,#0x10
00a5f20c	bl 0x00c36de0
00a5f210	ldr x8,[sp, #0x28]
00a5f214	ldur q0,[sp, #0x18]
00a5f218	ldur q1,[sp, #0x8]
00a5f21c	add x2,sp,#0x30
00a5f220	str x8,[sp, #0x50]
00a5f224	stp q1,q0,[sp, #0x30]
00a5f228	ldr x0,[x19]
00a5f22c	ldr x1,[x19, #0xa8]
00a5f230	bl 0x00c3cd60
00a5f234	ldur x8,[x29, #-0x8]
00a5f238	ldp x29,x30,[sp, #0x90]
00a5f23c	ldr x19,[sp, #0x80]
00a5f240	cmp w0,#0x0
00a5f244	csel x0,xzr,x8,eq
00a5f248	add sp,sp,#0xa0
00a5f24c	ret

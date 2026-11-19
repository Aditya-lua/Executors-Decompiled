; EVP_CIPHER_CTX_original_iv @ 00a5ea84
00a5ea84	sub sp,sp,#0xa0
00a5ea88	str x19,[sp, #0x80]
00a5ea8c	stp x29,x30,[sp, #0x90]
00a5ea90	add x29,sp,#0x90
00a5ea94	mov x19,x0
00a5ea98	add x8,x0,#0x18
00a5ea9c	add x0,sp,#0x30
00a5eaa0	mov w2,#0x50
00a5eaa4	mov w1,wzr
00a5eaa8	stur x8,[x29, #-0x8]
00a5eaac	bl 0x00c301c0
00a5eab0	adrp x0,0x2bd000
00a5eab4	add x0,x0,#0xad8
00a5eab8	add x8,sp,#0x8
00a5eabc	sub x1,x29,#0x8
00a5eac0	mov w2,#0x10
00a5eac4	bl 0x00c36de0
00a5eac8	ldr x8,[sp, #0x28]
00a5eacc	ldur q0,[sp, #0x18]
00a5ead0	ldur q1,[sp, #0x8]
00a5ead4	add x2,sp,#0x30
00a5ead8	str x8,[sp, #0x50]
00a5eadc	stp q1,q0,[sp, #0x30]
00a5eae0	ldr x0,[x19]
00a5eae4	ldr x1,[x19, #0xa8]
00a5eae8	bl 0x00c3cd60
00a5eaec	ldur x8,[x29, #-0x8]
00a5eaf0	ldp x29,x30,[sp, #0x90]
00a5eaf4	ldr x19,[sp, #0x80]
00a5eaf8	cmp w0,#0x0
00a5eafc	csel x0,xzr,x8,eq
00a5eb00	add sp,sp,#0xa0
00a5eb04	ret

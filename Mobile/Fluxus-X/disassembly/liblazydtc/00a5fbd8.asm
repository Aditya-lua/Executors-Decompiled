; EVP_CIPHER_CTX_clear_flags @ 00a5fbd8
00a5fbd8	ldr x8,[x0, #0x70]
00a5fbdc	mvn w9,w1
00a5fbe0	sxtw x9,w9
00a5fbe4	and x9,x8,x9
00a5fbe8	eor w8,w9,w8
00a5fbec	str x9,[x0, #0x70]
00a5fbf0	tbz w8,#0xd,0x00a5fc5c
00a5fbf4	sub sp,sp,#0xa0
00a5fbf8	str x19,[sp, #0x80]
00a5fbfc	stp x29,x30,[sp, #0x90]
00a5fc00	add x29,sp,#0x90
00a5fc04	mov x19,x0
00a5fc08	add x0,sp,#0x30
00a5fc0c	mov w2,#0x50
00a5fc10	mov w1,wzr
00a5fc14	stur wzr,[x29, #-0x4]
00a5fc18	bl 0x00c301c0
00a5fc1c	adrp x0,0x2d5000
00a5fc20	add x0,x0,#0xce0
00a5fc24	add x8,sp,#0x8
00a5fc28	sub x1,x29,#0x4
00a5fc2c	bl 0x00c37340
00a5fc30	ldr x8,[sp, #0x28]
00a5fc34	ldur q0,[sp, #0x18]
00a5fc38	ldur q1,[sp, #0x8]
00a5fc3c	add x1,sp,#0x30
00a5fc40	mov x0,x19
00a5fc44	str x8,[sp, #0x50]
00a5fc48	stp q1,q0,[sp, #0x30]
00a5fc4c	bl 0x00c361c0
00a5fc50	ldp x29,x30,[sp, #0x90]
00a5fc54	ldr x19,[sp, #0x80]
00a5fc58	add sp,sp,#0xa0
00a5fc5c	ret

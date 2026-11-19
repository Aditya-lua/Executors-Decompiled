; EVP_RAND_get_state @ 00aca268
00aca268	sub sp,sp,#0xa0
00aca26c	stp x20,x19,[sp, #0x80]
00aca270	mov x19,x0
00aca274	add x0,sp,#0x30
00aca278	mov w2,#0x50
00aca27c	mov w1,wzr
00aca280	stp x29,x30,[sp, #0x90]
00aca284	add x29,sp,#0x90
00aca288	bl 0x00c301c0
00aca28c	adrp x0,0x2ae000
00aca290	add x0,x0,#0x5d4
00aca294	mov x8,sp
00aca298	add x1,sp,#0x2c
00aca29c	bl 0x00c36260
00aca2a0	ldr x8,[sp, #0x20]
00aca2a4	ldp q1,q0,[sp]
00aca2a8	str x8,[sp, #0x50]
00aca2ac	stp q1,q0,[sp, #0x30]
00aca2b0	ldr x8,[x19]
00aca2b4	ldr x9,[x8, #0x78]
00aca2b8	cbz x9,0x00aca2cc
00aca2bc	ldr x0,[x19, #0x8]
00aca2c0	blr x9
00aca2c4	cbz w0,0x00aca300
00aca2c8	ldr x8,[x19]
00aca2cc	ldr x8,[x8, #0xa8]
00aca2d0	ldr x0,[x19, #0x8]
00aca2d4	add x1,sp,#0x30
00aca2d8	blr x8
00aca2dc	ldr x8,[x19]
00aca2e0	mov w20,w0
00aca2e4	ldr x8,[x8, #0x80]
00aca2e8	cbz x8,0x00aca2f4
00aca2ec	ldr x0,[x19, #0x8]
00aca2f0	blr x8
00aca2f4	cbz w20,0x00aca300
00aca2f8	ldr w0,[sp, #0x2c]
00aca2fc	b 0x00aca308
00aca300	mov w0,#0x2
00aca304	str w0,[sp, #0x2c]
00aca308	ldp x29,x30,[sp, #0x90]
00aca30c	ldp x20,x19,[sp, #0x80]
00aca310	add sp,sp,#0xa0
00aca314	ret

; EVP_CIPHER_CTX_set_flags @ 00a5fb50
00a5fb50	ldr x8,[x0, #0x70]
00a5fb54	sxtw x9,w1
00a5fb58	orr x9,x8,x9
00a5fb5c	eor w8,w9,w8
00a5fb60	str x9,[x0, #0x70]
00a5fb64	tbz w8,#0xd,0x00a5fbd4
00a5fb68	sub sp,sp,#0xa0
00a5fb6c	str x19,[sp, #0x80]
00a5fb70	stp x29,x30,[sp, #0x90]
00a5fb74	add x29,sp,#0x90
00a5fb78	mov x19,x0
00a5fb7c	mov w8,#0x1
00a5fb80	add x0,sp,#0x30
00a5fb84	mov w2,#0x50
00a5fb88	mov w1,wzr
00a5fb8c	stur w8,[x29, #-0x4]
00a5fb90	bl 0x00c301c0
00a5fb94	adrp x0,0x2d5000
00a5fb98	add x0,x0,#0xce0
00a5fb9c	add x8,sp,#0x8
00a5fba0	sub x1,x29,#0x4
00a5fba4	bl 0x00c37340
00a5fba8	ldr x8,[sp, #0x28]
00a5fbac	ldur q0,[sp, #0x18]
00a5fbb0	ldur q1,[sp, #0x8]
00a5fbb4	add x1,sp,#0x30
00a5fbb8	mov x0,x19
00a5fbbc	str x8,[sp, #0x50]
00a5fbc0	stp q1,q0,[sp, #0x30]
00a5fbc4	bl 0x00c361c0
00a5fbc8	ldp x29,x30,[sp, #0x90]
00a5fbcc	ldr x19,[sp, #0x80]
00a5fbd0	add sp,sp,#0xa0
00a5fbd4	ret

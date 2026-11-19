; EVP_RAND_CTX_settable_params @ 00ac9c24
00ac9c24	ldr x8,[x0]
00ac9c28	ldr x9,[x8, #0x98]
00ac9c2c	cbz x9,0x00ac9c64
00ac9c30	str x19,[sp, #-0x20]!
00ac9c34	stp x29,x30,[sp, #0x10]
00ac9c38	mov x19,x0
00ac9c3c	ldr x0,[x8]
00ac9c40	add x29,sp,#0x10
00ac9c44	bl 0x00c3b680
00ac9c48	ldp x9,x8,[x19]
00ac9c4c	ldp x29,x30,[sp, #0x10]
00ac9c50	mov x1,x0
00ac9c54	ldr x2,[x9, #0x98]
00ac9c58	mov x0,x8
00ac9c5c	ldr x19,[sp], #0x20
00ac9c60	br x2
00ac9c64	mov x0,xzr
00ac9c68	ret

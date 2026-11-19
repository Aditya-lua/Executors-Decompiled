; CT_POLICY_EVAL_CTX_set1_issuer @ 00a13b44
00a13b44	stp x20,x19,[sp, #-0x20]!
00a13b48	mov x20,x0
00a13b4c	mov x0,x1
00a13b50	stp x29,x30,[sp, #0x10]
00a13b54	add x29,sp,#0x10
00a13b58	mov x19,x1
00a13b5c	bl 0x00c350b0
00a13b60	cbz w0,0x00a13b6c
00a13b64	mov w0,#0x1
00a13b68	str x19,[x20, #0x8]
00a13b6c	ldp x29,x30,[sp, #0x10]
00a13b70	ldp x20,x19,[sp], #0x20
00a13b74	ret

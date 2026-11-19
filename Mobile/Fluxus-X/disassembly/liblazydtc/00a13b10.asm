; CT_POLICY_EVAL_CTX_set1_cert @ 00a13b10
00a13b10	stp x20,x19,[sp, #-0x20]!
00a13b14	mov x20,x0
00a13b18	mov x0,x1
00a13b1c	stp x29,x30,[sp, #0x10]
00a13b20	add x29,sp,#0x10
00a13b24	mov x19,x1
00a13b28	bl 0x00c350b0
00a13b2c	cbz w0,0x00a13b38
00a13b30	mov w0,#0x1
00a13b34	str x19,[x20]
00a13b38	ldp x29,x30,[sp, #0x10]
00a13b3c	ldp x20,x19,[sp], #0x20
00a13b40	ret

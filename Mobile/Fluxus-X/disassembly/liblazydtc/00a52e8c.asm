; FUN_00a52e8c @ 00a52e8c
00a52e8c	stp x20,x19,[sp, #-0x20]!
00a52e90	stp x29,x30,[sp, #0x10]
00a52e94	mov x19,x0
00a52e98	ldr x0,[x0, #0x8]
00a52e9c	add x29,sp,#0x10
00a52ea0	mov x20,x1
00a52ea4	bl 0x00c34760
00a52ea8	tbnz w0,#0x1f,0x00a52ed0
00a52eac	mov w1,w0
00a52eb0	ldr x0,[x19, #0x8]
00a52eb4	bl 0x00c35320
00a52eb8	ldr x0,[x19, #0x8]
00a52ebc	mov x1,x20
00a52ec0	str wzr,[x19, #0x18]
00a52ec4	bl 0x00c34760
00a52ec8	mov w1,w0
00a52ecc	tbz w0,#0x1f,0x00a52eb0
00a52ed0	ldr x8,[x19, #0x10]
00a52ed4	cmp x8,x20
00a52ed8	b.ne 0x00a52eec
00a52edc	mov x0,x20
00a52ee0	mov w1,wzr
00a52ee4	bl 0x00c3bb20
00a52ee8	str xzr,[x19, #0x10]
00a52eec	ldp x29,x30,[sp, #0x10]
00a52ef0	ldp x20,x19,[sp], #0x20
00a52ef4	ret

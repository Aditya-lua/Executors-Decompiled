; ECDSA_SIG_set0 @ 00a2679c
00a2679c	str x21,[sp, #-0x30]!
00a267a0	stp x20,x19,[sp, #0x10]
00a267a4	mov x20,x0
00a267a8	mov w0,wzr
00a267ac	stp x29,x30,[sp, #0x20]
00a267b0	add x29,sp,#0x20
00a267b4	cbz x1,0x00a267dc
00a267b8	mov x19,x2
00a267bc	cbz x2,0x00a267dc
00a267c0	ldr x0,[x20]
00a267c4	mov x21,x1
00a267c8	bl 0x00c322e0
00a267cc	ldr x0,[x20, #0x8]
00a267d0	bl 0x00c322e0
00a267d4	mov w0,#0x1
00a267d8	stp x21,x19,[x20]
00a267dc	ldp x29,x30,[sp, #0x20]
00a267e0	ldp x20,x19,[sp, #0x10]
00a267e4	ldr x21,[sp], #0x30
00a267e8	ret

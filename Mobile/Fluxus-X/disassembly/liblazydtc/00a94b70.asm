; DES_ecb3_encrypt @ 00a94b70
00a94b70	str x19,[sp, #-0x20]!
00a94b74	stp x29,x30,[sp, #0x10]
00a94b78	ldp w8,w9,[x0]
00a94b7c	mov x19,x1
00a94b80	add x0,sp,#0x8
00a94b84	mov x1,x2
00a94b88	mov x2,x3
00a94b8c	mov x3,x4
00a94b90	add x29,sp,#0x10
00a94b94	stp w8,w9,[sp, #0x8]
00a94b98	cbz w5,0x00a94ba4
00a94b9c	bl 0x00c39a10
00a94ba0	b 0x00a94ba8
00a94ba4	bl 0x00c399e0
00a94ba8	ldp w8,w9,[sp, #0x8]
00a94bac	lsr w10,w8,#0x8
00a94bb0	strb w8,[x19]
00a94bb4	strb w10,[x19, #0x1]
00a94bb8	lsr w10,w8,#0x10
00a94bbc	lsr w8,w8,#0x18
00a94bc0	strb w9,[x19, #0x4]
00a94bc4	strb w10,[x19, #0x2]
00a94bc8	lsr w10,w9,#0x8
00a94bcc	strb w8,[x19, #0x3]
00a94bd0	lsr w8,w9,#0x10
00a94bd4	lsr w9,w9,#0x18
00a94bd8	strb w10,[x19, #0x5]
00a94bdc	strb w8,[x19, #0x6]
00a94be0	strb w9,[x19, #0x7]
00a94be4	ldp x29,x30,[sp, #0x10]
00a94be8	ldr x19,[sp], #0x20
00a94bec	ret

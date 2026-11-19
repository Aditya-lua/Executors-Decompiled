; BF_ecb_encrypt @ 00a8e198
00a8e198	str x19,[sp, #-0x20]!
00a8e19c	stp x29,x30,[sp, #0x10]
00a8e1a0	ldr w8,[x0]
00a8e1a4	mov x19,x1
00a8e1a8	mov x1,x2
00a8e1ac	add x29,sp,#0x10
00a8e1b0	rev w8,w8
00a8e1b4	str w8,[sp, #0x8]
00a8e1b8	ldr w8,[x0, #0x4]
00a8e1bc	add x0,sp,#0x8
00a8e1c0	rev w8,w8
00a8e1c4	str w8,[sp, #0xc]
00a8e1c8	cbz w3,0x00a8e1d4
00a8e1cc	bl 0x00c38420
00a8e1d0	b 0x00a8e1d8
00a8e1d4	bl 0x00c38410
00a8e1d8	ldr w8,[sp, #0x8]
00a8e1dc	lsr w9,w8,#0x18
00a8e1e0	strb w9,[x19]
00a8e1e4	lsr w9,w8,#0x10
00a8e1e8	strb w8,[x19, #0x3]
00a8e1ec	lsr w8,w8,#0x8
00a8e1f0	strb w9,[x19, #0x1]
00a8e1f4	strb w8,[x19, #0x2]
00a8e1f8	ldr w8,[sp, #0xc]
00a8e1fc	lsr w9,w8,#0x18
00a8e200	strb w9,[x19, #0x4]
00a8e204	lsr w9,w8,#0x10
00a8e208	strb w9,[x19, #0x5]
00a8e20c	lsr w9,w8,#0x8
00a8e210	strb w9,[x19, #0x6]
00a8e214	strb w8,[x19, #0x7]
00a8e218	ldp x29,x30,[sp, #0x10]
00a8e21c	ldr x19,[sp], #0x20
00a8e220	ret

; ossl_gcm_initctx @ 00b672bc
00b672bc	str x19,[sp, #-0x20]!
00b672c0	orr w9,wzr,#0x6
00b672c4	stp x29,x30,[sp, #0x10]
00b672c8	str w9,[x1]
00b672cc	mov x9,#-0x1
00b672d0	ldrb w8,[x1, #0x54]
00b672d4	str x9,[x1, #0x28]
00b672d8	adrp x9,0x29c000
00b672dc	ldr q0,[x9, #0x3b0]
00b672e0	lsr x9,x2,#0x3
00b672e4	orr w8,w8,#0x2
00b672e8	add x29,sp,#0x10
00b672ec	mov x19,x1
00b672f0	str x9,[x1, #0x8]
00b672f4	strb w8,[x1, #0x54]
00b672f8	str q0,[x1, #0x10]
00b672fc	str x3,[x1, #0xf0]
00b67300	bl 0x00c41210
00b67304	str x0,[x19, #0xe8]
00b67308	ldp x29,x30,[sp, #0x10]
00b6730c	ldr x19,[sp], #0x20
00b67310	ret

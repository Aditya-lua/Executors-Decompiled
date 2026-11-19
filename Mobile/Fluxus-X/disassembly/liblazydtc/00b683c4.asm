; ossl_cipher_hw_generic_cfb8 @ 00b683c4
00b683c4	str x19,[sp, #-0x20]!
00b683c8	stp x29,x30,[sp, #0x10]
00b683cc	ldr w9,[x0, #0xa0]
00b683d0	add x29,sp,#0x10
00b683d4	mov x8,x3
00b683d8	mov x19,x0
00b683dc	stur w9,[x29, #-0x4]
00b683e0	ldrb w9,[x0, #0x6c]
00b683e4	ldr x3,[x0, #0xb0]
00b683e8	ldr x7,[x0, #0x30]
00b683ec	add x4,x0,#0x20
00b683f0	ubfx w6,w9,#0x1,#0x1
00b683f4	sub x5,x29,#0x4
00b683f8	mov x0,x2
00b683fc	mov x2,x8
00b68400	bl 0x00c3e2f0
00b68404	ldur w8,[x29, #-0x4]
00b68408	mov w0,#0x1
00b6840c	str w8,[x19, #0xa0]
00b68410	ldp x29,x30,[sp, #0x10]
00b68414	ldr x19,[sp], #0x20
00b68418	ret

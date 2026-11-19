; ossl_cipher_hw_generic_ofb128 @ 00b6831c
00b6831c	str x19,[sp, #-0x20]!
00b68320	stp x29,x30,[sp, #0x10]
00b68324	ldr w9,[x0, #0xa0]
00b68328	add x29,sp,#0x10
00b6832c	mov x8,x3
00b68330	mov x19,x0
00b68334	stur w9,[x29, #-0x4]
00b68338	ldr x3,[x0, #0xb0]
00b6833c	ldr x6,[x0, #0x30]
00b68340	add x4,x0,#0x20
00b68344	sub x5,x29,#0x4
00b68348	mov x0,x2
00b6834c	mov x2,x8
00b68350	bl 0x00c3e450
00b68354	ldur w8,[x29, #-0x4]
00b68358	mov w0,#0x1
00b6835c	str w8,[x19, #0xa0]
00b68360	ldp x29,x30,[sp, #0x10]
00b68364	ldr x19,[sp], #0x20
00b68368	ret

; ossl_cipher_generic_initkey @ 00b66248
00b66248	str x19,[sp, #-0x20]!
00b6624c	mov x19,x0
00b66250	stp x29,x30,[sp, #0x10]
00b66254	add x29,sp,#0x10
00b66258	tbz w5,#0x9,0x00b66268
00b6625c	ldrb w8,[x19, #0x6c]
00b66260	orr w8,w8,#0x40
00b66264	strb w8,[x19, #0x6c]
00b66268	ldrb w8,[x19, #0x6c]
00b6626c	tbz w5,#0x8,0x00b66278
00b66270	orr w8,w8,#0x20
00b66274	strb w8,[x19, #0x6c]
00b66278	orr w8,w8,#0x1
00b6627c	lsr x9,x1,#0x3
00b66280	lsr x10,x3,#0x3
00b66284	lsr x11,x2,#0x3
00b66288	str x6,[x19, #0xa8]
00b6628c	str w4,[x19, #0x40]
00b66290	strb w8,[x19, #0x6c]
00b66294	stp x9,x10,[x19, #0x48]
00b66298	str x11,[x19, #0x58]
00b6629c	cbz x7,0x00b662ac
00b662a0	mov x0,x7
00b662a4	bl 0x00c41210
00b662a8	str x0,[x19, #0xb8]
00b662ac	ldp x29,x30,[sp, #0x10]
00b662b0	ldr x19,[sp], #0x20
00b662b4	ret

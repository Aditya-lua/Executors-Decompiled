; ssl3_dispatch_alert @ 009abb94
009abb94	sub sp,sp,#0x40
009abb98	stp x22,x21,[sp, #0x10]
009abb9c	add x21,x0,#0x1a8
009abba0	mov w8,#0x2
009abba4	mov w1,#0x15
009abba8	add x3,sp,#0x8
009abbac	mov w4,#0x1
009abbb0	mov x6,sp
009abbb4	mov x2,x21
009abbb8	mov w5,wzr
009abbbc	stp x20,x19,[sp, #0x20]
009abbc0	stp x29,x30,[sp, #0x30]
009abbc4	add x29,sp,#0x30
009abbc8	mov x19,x0
009abbcc	str wzr,[x0, #0x1a4]
009abbd0	str x8,[sp, #0x8]
009abbd4	mov w22,#0x1
009abbd8	bl 0x00c34ce0
009abbdc	mov w20,w0
009abbe0	cmp w0,#0x0
009abbe4	b.le 0x009abc54
009abbe8	ldr x0,[x19, #0x18]
009abbec	mov w1,#0xb
009abbf0	mov x2,xzr
009abbf4	mov x3,xzr
009abbf8	bl 0x00c321a0
009abbfc	ldr x8,[x19, #0x4c0]
009abc00	cbz x8,0x009abc24
009abc04	ldr w1,[x19]
009abc08	ldr x6,[x19, #0x4c8]
009abc0c	mov w0,#0x1
009abc10	mov w2,#0x15
009abc14	mov w4,#0x2
009abc18	mov x3,x21
009abc1c	mov x5,x19
009abc20	blr x8
009abc24	ldr x8,[x19, #0x978]
009abc28	cbnz x8,0x009abc38
009abc2c	ldr x8,[x19, #0x9a8]
009abc30	ldr x8,[x8, #0x120]
009abc34	cbz x8,0x009abc58
009abc38	ldrb w9,[x19, #0x1a8]
009abc3c	ldrb w2,[x19, #0x1a9]
009abc40	mov w1,#0x4008
009abc44	mov x0,x19
009abc48	bfm w2,w9,#0x18,#0x7
009abc4c	blr x8
009abc50	b 0x009abc58
009abc54	str w22,[x19, #0x1a4]
009abc58	mov w0,w20
009abc5c	ldp x29,x30,[sp, #0x30]
009abc60	ldp x20,x19,[sp, #0x20]
009abc64	ldp x22,x21,[sp, #0x10]
009abc68	add sp,sp,#0x40
009abc6c	ret

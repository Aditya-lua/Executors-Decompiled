; FUN_00873e90 @ 00873e90
00873e90	stp x29,x30,[sp, #-0x20]!
00873e94	str x19,[sp, #0x10]
00873e98	mov x29,sp
00873e9c	ldrb w8,[x0, #0x70]
00873ea0	mov x19,x0
00873ea4	tbz w8,#0x0,0x00873eb8
00873ea8	ldr x8,[x19, #0x70]
00873eac	ldr x0,[x19, #0x80]
00873eb0	and x1,x8,#-0x2
00873eb4	bl 0x00c2fe80
00873eb8	ldr x0,[x19, #0x58]
00873ebc	cbz x0,0x00873ed0
00873ec0	ldr x8,[x19, #0x68]
00873ec4	str x0,[x19, #0x60]
00873ec8	sub x1,x8,x0
00873ecc	bl 0x00c2fe80
00873ed0	ldrb w8,[x19, #0x40]
00873ed4	tbnz w8,#0x0,0x00873ef4
00873ed8	ldrb w8,[x19, #0x28]
00873edc	tbnz w8,#0x0,0x00873f0c
00873ee0	ldrb w8,[x19]
00873ee4	tbnz w8,#0x0,0x00873f24
00873ee8	ldr x19,[sp, #0x10]
00873eec	ldp x29,x30,[sp], #0x20
00873ef0	ret
00873ef4	ldr x8,[x19, #0x40]
00873ef8	ldr x0,[x19, #0x50]
00873efc	and x1,x8,#-0x2
00873f00	bl 0x00c2fe80
00873f04	ldrb w8,[x19, #0x28]
00873f08	tbz w8,#0x0,0x00873ee0
00873f0c	ldr x8,[x19, #0x28]
00873f10	ldr x0,[x19, #0x38]
00873f14	and x1,x8,#-0x2
00873f18	bl 0x00c2fe80
00873f1c	ldrb w8,[x19]
00873f20	tbz w8,#0x0,0x00873ee8
00873f24	ldr x8,[x19]
00873f28	ldr x0,[x19, #0x10]
00873f2c	and x1,x8,#-0x2
00873f30	ldr x19,[sp, #0x10]
00873f34	ldp x29,x30,[sp], #0x20
00873f38	b 0x00c2fe80

; FUN_00925eb8 @ 00925eb8
00925eb8	stp x20,x19,[sp, #-0x20]!
00925ebc	stp x29,x30,[sp, #0x10]
00925ec0	add x29,sp,#0x10
00925ec4	mov x19,x0
00925ec8	cbz x0,0x00925f78
00925ecc	ldr x8,[x19, #0x30]
00925ed0	cbz x8,0x00925edc
00925ed4	ldr x0,[x19, #0x38]
00925ed8	blr x8
00925edc	mov w8,#0x1
00925ee0	str x8,[x19, #0x1b0]
00925ee4	ldr w8,[x19, #0x14]
00925ee8	ldr x0,[x19, #0x48]
00925eec	stp xzr,xzr,[x19, #0x18]
00925ef0	stp xzr,xzr,[x19, #0x28]
00925ef4	and w8,w8,#0xfffffffb
00925ef8	stp x19,xzr,[x19, #0x38]
00925efc	str xzr,[x19, #0x70]
00925f00	stp xzr,xzr,[x19, #0xa0]
00925f04	stp wzr,w8,[x19, #0x10]
00925f08	str xzr,[x19, #0x98]
00925f0c	str wzr,[x19, #0x78]
00925f10	bl 0x00c31040
00925f14	ldrb w8,[x19, #0x14]
00925f18	tbz w8,#0x0,0x00925f24
00925f1c	ldr x0,[x19, #0x50]
00925f20	bl 0x00c31040
00925f24	adrp x20,0xcc4000
00925f28	add x20,x20,#0x678
00925f2c	ldr x0,[x19, #0x58]
00925f30	ldr x8,[x20]
00925f34	blr x8
00925f38	str xzr,[x19, #0x58]
00925f3c	ldr x8,[x20]
00925f40	ldr x0,[x19, #0x68]
00925f44	blr x8
00925f48	str xzr,[x19, #0x68]
00925f4c	ldr x8,[x20]
00925f50	ldr x0,[x19, #0x60]
00925f54	blr x8
00925f58	mov w2,#0x1b0
00925f5c	mov x0,x19
00925f60	mov w1,wzr
00925f64	bl 0x00c301c0
00925f68	mov w8,#0x1
00925f6c	str wzr,[x19, #0x78]
00925f70	str x8,[x19, #0x1b0]
00925f74	stp xzr,xzr,[x19, #0x80]
00925f78	ldp x29,x30,[sp, #0x10]
00925f7c	ldp x20,x19,[sp], #0x20
00925f80	ret

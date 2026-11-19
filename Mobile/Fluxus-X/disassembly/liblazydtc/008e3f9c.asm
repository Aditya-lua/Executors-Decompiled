; FUN_008e3f9c @ 008e3f9c
008e3f9c	sub sp,sp,#0x30
008e3fa0	str x30,[sp, #0x20]
008e3fa4	ldrsw x8,[x1, #0xc]
008e3fa8	cmp w8,#0x9
008e3fac	b.cs 0x008e3ffc
008e3fb0	mov w9,#0x1c3
008e3fb4	lsr w9,w9,w8
008e3fb8	tbz w9,#0x0,0x008e3ffc
008e3fbc	ldr w9,[x1, #0x8]
008e3fc0	adrp x11,0xc4e000
008e3fc4	adrp x10,0x744000
008e3fc8	add x11,x11,#0x320
008e3fcc	add x10,x10,#0xef8
008e3fd0	str w9,[sp, #0x10]
008e3fd4	str x11,[sp, #0x8]
008e3fd8	ldur x9,[x1, #0xc]
008e3fdc	ldr x1,[x10, x8, LSL #0x3]
008e3fe0	mov x3,x2
008e3fe4	add x2,sp,#0x8
008e3fe8	stur x9,[sp, #0x14]
008e3fec	bl 0x008e4070
008e3ff0	ldr x30,[sp, #0x20]
008e3ff4	add sp,sp,#0x30
008e3ff8	ret
008e3ffc	adrp x1,0x2bc000
008e4000	adrp x2,0x29d000
008e4004	adrp x4,0x2ad000
008e4008	add x1,x1,#0xd80
008e400c	add x2,x2,#0x636
008e4010	add x4,x4,#0x4d
008e4014	mov w0,#0xffffffff
008e4018	mov w3,#0x1d2
008e401c	bl 0x00c30b30
008e4020	adrp x1,0x2ce000
008e4024	adrp x2,0x2ce000
008e4028	add x1,x1,#0xe75
008e402c	add x2,x2,#0xe7e
008e4030	mov w0,#0xffffffff
008e4034	bl 0x00c30b30
008e4038	bl 0x00c30b40

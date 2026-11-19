; FUN_008e3e78 @ 008e3e78
008e3e78	sub sp,sp,#0x30
008e3e7c	str x30,[sp, #0x20]
008e3e80	ldr w8,[x1, #0x8]
008e3e84	adrp x9,0xc4e000
008e3e88	add x9,x9,#0x320
008e3e8c	str x9,[sp, #0x8]
008e3e90	str w8,[sp, #0x10]
008e3e94	ldur x8,[x1, #0xc]
008e3e98	add x1,sp,#0x8
008e3e9c	mov w4,#0x60000000
008e3ea0	stur x8,[sp, #0x14]
008e3ea4	bl 0x008e3eb4
008e3ea8	ldr x30,[sp, #0x20]
008e3eac	add sp,sp,#0x30
008e3eb0	ret

; FUN_008e3e3c @ 008e3e3c
008e3e3c	sub sp,sp,#0x30
008e3e40	str x30,[sp, #0x20]
008e3e44	ldr w8,[x1, #0x8]
008e3e48	adrp x9,0xc4e000
008e3e4c	add x9,x9,#0x320
008e3e50	str x9,[sp, #0x8]
008e3e54	str w8,[sp, #0x10]
008e3e58	ldur x8,[x1, #0xc]
008e3e5c	add x1,sp,#0x8
008e3e60	mov w4,#0x40000000
008e3e64	stur x8,[sp, #0x14]
008e3e68	bl 0x008e3eb4
008e3e6c	ldr x30,[sp, #0x20]
008e3e70	add sp,sp,#0x30
008e3e74	ret

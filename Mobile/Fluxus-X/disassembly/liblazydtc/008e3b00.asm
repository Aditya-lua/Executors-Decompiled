; FUN_008e3b00 @ 008e3b00
008e3b00	sub sp,sp,#0x30
008e3b04	str x30,[sp, #0x20]
008e3b08	ldr w8,[x1, #0x8]
008e3b0c	adrp x9,0xc4e000
008e3b10	add x9,x9,#0x320
008e3b14	str x9,[sp, #0x8]
008e3b18	str w8,[sp, #0x10]
008e3b1c	ldur x8,[x1, #0xc]
008e3b20	mov x3,x2
008e3b24	add x2,sp,#0x8
008e3b28	mov w1,#0xc0400000
008e3b2c	stur x8,[sp, #0x14]
008e3b30	bl 0x008e3f08
008e3b34	ldr x30,[sp, #0x20]
008e3b38	add sp,sp,#0x30
008e3b3c	ret

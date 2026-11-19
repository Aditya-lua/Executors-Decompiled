; FUN_008e4d10 @ 008e4d10
008e4d10	mov x8,x0
008e4d14	ldr x0,[x0]
008e4d18	cmp x0,x8
008e4d1c	b.eq 0x008e4d34
008e4d20	ldr x9,[x0, #0x10]
008e4d24	ldr x9,[x9, #0x8]
008e4d28	cmp x9,x1
008e4d2c	b.ne 0x008e4d14
008e4d30	ret
008e4d34	mov x0,xzr
008e4d38	ret

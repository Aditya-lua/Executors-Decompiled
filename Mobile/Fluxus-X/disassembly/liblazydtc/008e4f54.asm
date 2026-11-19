; FUN_008e4f54 @ 008e4f54
008e4f54	stp x30,x19,[sp, #-0x10]!
008e4f58	adrp x19,0xd1f000
008e4f5c	ldr x8,[x19, #0xef0]
008e4f60	cbz x8,0x008e4f6c
008e4f64	mov w0,#0x1
008e4f68	b 0x008e4f90
008e4f6c	adrp x8,0xd1f000
008e4f70	ldr x0,[x8, #0xee8]
008e4f74	cbz x0,0x008e4f90
008e4f78	adrp x1,0x2c2000
008e4f7c	add x1,x1,#0xec2
008e4f80	bl 0x00c30c10
008e4f84	cmp x0,#0x0
008e4f88	str x0,[x19, #0xef0]
008e4f8c	cset w0,ne
008e4f90	ldp x30,x19,[sp], #0x10
008e4f94	ret

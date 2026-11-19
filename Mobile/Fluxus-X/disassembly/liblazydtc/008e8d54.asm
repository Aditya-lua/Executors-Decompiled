; cpr::Cookies::emplace_back @ 008e8d54
008e8d54	str x19,[sp, #-0x20]!
008e8d58	stp x29,x30,[sp, #0x10]
008e8d5c	add x29,sp,#0x10
008e8d60	mov x19,x0
008e8d64	ldr x0,[x0, #0x10]
008e8d68	ldr x8,[x19, #0x18]
008e8d6c	cmp x0,x8
008e8d70	b.cs 0x008e8d90
008e8d74	bl 0x00c30df0
008e8d78	ldr x8,[x19, #0x10]
008e8d7c	add x8,x8,#0x78
008e8d80	str x8,[x19, #0x10]
008e8d84	ldp x29,x30,[sp, #0x10]
008e8d88	ldr x19,[sp], #0x20
008e8d8c	ret
008e8d90	ldp x29,x30,[sp, #0x10]
008e8d94	add x0,x19,#0x8
008e8d98	ldr x19,[sp], #0x20
008e8d9c	b 0x00c30ec0

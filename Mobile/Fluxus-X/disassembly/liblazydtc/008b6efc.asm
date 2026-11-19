; FUN_008b6efc @ 008b6efc
008b6efc	stp x29,x30,[sp, #-0x30]!
008b6f00	str x21,[sp, #0x10]
008b6f04	stp x20,x19,[sp, #0x20]
008b6f08	mov x29,sp
008b6f0c	mov x20,x1
008b6f10	ldr x1,[x1, #0x78]
008b6f14	mov x19,x0
008b6f18	ldrb w8,[x1, #0x2]
008b6f1c	tst w8,#0x3
008b6f20	b.eq 0x008b6f2c
008b6f24	mov x0,x19
008b6f28	bl 0x008b61bc
008b6f2c	ldr x8,[x20, #0x8]
008b6f30	cbz x8,0x008b6f44
008b6f34	ldrb w9,[x8, #0x2]
008b6f38	and w9,w9,#0xf8
008b6f3c	orr w9,w9,#0x4
008b6f40	strb w9,[x8, #0x2]
008b6f44	adrp x8,0xd1f000
008b6f48	add x8,x8,#0x1b8
008b6f4c	ldrb w8,[x8]
008b6f50	cmp w8,#0x1
008b6f54	b.ne 0x008b6f74
008b6f58	ldr x1,[x20, #0x80]
008b6f5c	cbz x1,0x008b6f74
008b6f60	ldrb w8,[x1, #0x2]
008b6f64	tst w8,#0x3
008b6f68	b.eq 0x008b6f74
008b6f6c	mov x0,x19
008b6f70	bl 0x008b61bc
008b6f74	ldr x21,[x20, #0x58]
008b6f78	ldr x8,[x20, #0x68]
008b6f7c	b 0x008b6f84
008b6f80	add x21,x21,#0x10
008b6f84	cmp x21,x8
008b6f88	b.cs 0x008b6fb8
008b6f8c	ldr w9,[x21, #0xc]
008b6f90	cmp w9,#0x5
008b6f94	b.lt 0x008b6f80
008b6f98	ldr x1,[x21]
008b6f9c	ldrb w9,[x1, #0x2]
008b6fa0	tst w9,#0x3
008b6fa4	b.eq 0x008b6f80
008b6fa8	mov x0,x19
008b6fac	bl 0x008b61bc
008b6fb0	ldr x8,[x20, #0x68]
008b6fb4	b 0x008b6f80
008b6fb8	ldr x20,[x20, #0x30]
008b6fbc	cbz x20,0x008b6ff0
008b6fc0	mov w21,#0x1
008b6fc4	b 0x008b6fd0
008b6fc8	ldr x20,[x20, #0x20]
008b6fcc	cbz x20,0x008b6ff0
008b6fd0	ldrb w8,[x20, #0x2]
008b6fd4	strb w21,[x20, #0x3]
008b6fd8	tst w8,#0x3
008b6fdc	b.eq 0x008b6fc8
008b6fe0	mov x0,x19
008b6fe4	mov x1,x20
008b6fe8	bl 0x008b61bc
008b6fec	b 0x008b6fc8
008b6ff0	ldp x20,x19,[sp, #0x20]
008b6ff4	ldr x21,[sp, #0x10]
008b6ff8	ldp x29,x30,[sp], #0x30
008b6ffc	ret

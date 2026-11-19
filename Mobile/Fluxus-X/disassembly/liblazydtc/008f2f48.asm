; cpr::Session::SetOption @ 008f2f48
008f2f48	str x21,[sp, #-0x30]!
008f2f4c	stp x20,x19,[sp, #0x10]
008f2f50	stp x29,x30,[sp, #0x20]
008f2f54	add x29,sp,#0x20
008f2f58	mov x19,x0
008f2f5c	mov x20,x1
008f2f60	ldr x1,[x19, #0x70]!
008f2f64	sub x21,x19,#0x8
008f2f68	mov x0,x21
008f2f6c	bl 0x008267e4
008f2f70	ldr x8,[x20]
008f2f74	stur x8,[x19, #-0x8]
008f2f78	mov x8,x20
008f2f7c	ldr x9,[x8, #0x8]!
008f2f80	str x9,[x19]
008f2f84	ldr x10,[x8, #0x8]
008f2f88	str x10,[x19, #0x8]
008f2f8c	cbz x10,0x008f2fa0
008f2f90	str x19,[x9, #0x10]
008f2f94	str x8,[x20]
008f2f98	stp xzr,xzr,[x8]
008f2f9c	b 0x008f2fa4
008f2fa0	str x19,[x21]
008f2fa4	ldp x29,x30,[sp, #0x20]
008f2fa8	ldp x20,x19,[sp, #0x10]
008f2fac	ldr x21,[sp], #0x30
008f2fb0	ret

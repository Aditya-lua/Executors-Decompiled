; ssl_generate_pkey @ 009a9f04
009a9f04	str x19,[sp, #-0x20]!
009a9f08	stp x29,x30,[sp, #0x10]
009a9f0c	add x29,sp,#0x10
009a9f10	str xzr,[sp, #0x8]
009a9f14	cbz x1,0x009a9f70
009a9f18	ldr x8,[x0, #0x9a8]
009a9f1c	ldr x0,[x8]
009a9f20	ldr x2,[x8, #0x440]
009a9f24	bl 0x00c34640
009a9f28	mov x19,x0
009a9f2c	cbz x0,0x009a9f60
009a9f30	mov x0,x19
009a9f34	bl 0x00c34700
009a9f38	cmp w0,#0x1
009a9f3c	b.lt 0x009a9f60
009a9f40	add x1,sp,#0x8
009a9f44	mov x0,x19
009a9f48	bl 0x00c346f0
009a9f4c	cmp w0,#0x0
009a9f50	b.gt 0x009a9f60
009a9f54	ldr x0,[sp, #0x8]
009a9f58	bl 0x00c32450
009a9f5c	str xzr,[sp, #0x8]
009a9f60	mov x0,x19
009a9f64	bl 0x00c34620
009a9f68	ldr x0,[sp, #0x8]
009a9f6c	b 0x009a9f74
009a9f70	mov x0,xzr
009a9f74	ldp x29,x30,[sp, #0x10]
009a9f78	ldr x19,[sp], #0x20
009a9f7c	ret

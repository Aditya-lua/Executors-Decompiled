; FUN_009b9ec0 @ 009b9ec0
009b9ec0	stp x24,x23,[sp, #-0x40]!
009b9ec4	stp x22,x21,[sp, #0x10]
009b9ec8	stp x20,x19,[sp, #0x20]
009b9ecc	stp x29,x30,[sp, #0x30]
009b9ed0	add x29,sp,#0x30
009b9ed4	cbz x1,0x009b9f8c
009b9ed8	ldr x20,[x1]
009b9edc	mov x19,x1
009b9ee0	cbz x20,0x009b9f8c
009b9ee4	ldr x23,[x0, #0x8]
009b9ee8	mov x21,x0
009b9eec	cbz x23,0x009b9f60
009b9ef0	mov x0,x20
009b9ef4	bl 0x00c2ff50
009b9ef8	ldr x22,[x21, #0x10]
009b9efc	cmp x0,x22
009b9f00	mov w0,wzr
009b9f04	b.ls 0x009b9f90
009b9f08	ldr w24,[x21]
009b9f0c	tbz w24,#0x0,0x009b9f2c
009b9f10	mov x0,x20
009b9f14	mov x1,x23
009b9f18	mov x2,x22
009b9f1c	bl 0x00c31bb0
009b9f20	mov w8,w0
009b9f24	mov w0,wzr
009b9f28	cbnz w8,0x009b9f90
009b9f2c	tbz w24,#0x1,0x009b9f54
009b9f30	mov x0,x20
009b9f34	mov x1,x23
009b9f38	mov x2,x22
009b9f3c	bl 0x00c35ef0
009b9f40	mov w8,w0
009b9f44	mov w0,wzr
009b9f48	cbnz w8,0x009b9f90
009b9f4c	ldr x22,[x21, #0x10]
009b9f50	ldr x20,[x19]
009b9f54	add x8,x20,x22
009b9f58	str x8,[x19]
009b9f5c	b 0x009b9f84
009b9f60	ldrb w8,[x21]
009b9f64	tbz w8,#0x0,0x009b9f84
009b9f68	ldrb w8,[x20]
009b9f6c	mov w0,wzr
009b9f70	cmp w8,#0x2d
009b9f74	b.ne 0x009b9f90
009b9f78	ldrb w8,[x20, #0x1]!
009b9f7c	cbz w8,0x009b9f8c
009b9f80	str x20,[x19]
009b9f84	mov w0,#0x1
009b9f88	b 0x009b9f90
009b9f8c	mov w0,wzr
009b9f90	ldp x29,x30,[sp, #0x30]
009b9f94	ldp x20,x19,[sp, #0x20]
009b9f98	ldp x22,x21,[sp, #0x10]
009b9f9c	ldp x24,x23,[sp], #0x40
009b9fa0	ret

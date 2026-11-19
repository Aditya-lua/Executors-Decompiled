; FUN_00a70ee8 @ 00a70ee8
00a70ee8	stp x22,x21,[sp, #-0x30]!
00a70eec	stp x20,x19,[sp, #0x10]
00a70ef0	stp x29,x30,[sp, #0x20]
00a70ef4	add x29,sp,#0x20
00a70ef8	mov x19,x2
00a70efc	mov x22,x1
00a70f00	mov w20,w0
00a70f04	bl 0x00a70a34
00a70f08	cmp w0,#0x1
00a70f0c	b.lt 0x00a70f30
00a70f10	cmp w20,#0x8
00a70f14	b.eq 0x00a70f38
00a70f18	cmp w20,#0x1
00a70f1c	b.ne 0x00a70f64
00a70f20	ldr w8,[x19, #0x8]
00a70f24	cmp w8,#0x2
00a70f28	b.eq 0x00a70f44
00a70f2c	b 0x00a70f64
00a70f30	mov w21,w0
00a70f34	b 0x00a70fbc
00a70f38	ldr w8,[x19, #0x8]
00a70f3c	cmp w8,#0x1
00a70f40	b.ne 0x00a70f64
00a70f44	ldr x2,[x19, #0x20]
00a70f48	add x21,x19,#0x40
00a70f4c	mov w1,#0x32
00a70f50	mov x0,x21
00a70f54	mov w3,wzr
00a70f58	bl 0x00c32500
00a70f5c	str x21,[x19, #0x20]
00a70f60	str wzr,[x19, #0x1c]
00a70f64	mov w0,w20
00a70f68	mov x1,x22
00a70f6c	mov x2,x19
00a70f70	bl 0x00a6fd84
00a70f74	mov w21,w0
00a70f78	cmp w0,#0x1
00a70f7c	b.lt 0x00a70fbc
00a70f80	cmp w20,#0x2
00a70f84	b.eq 0x00a70fa0
00a70f88	cmp w20,#0x7
00a70f8c	b.ne 0x00a70fbc
00a70f90	ldr w8,[x19, #0x8]
00a70f94	cmp w8,#0x2
00a70f98	b.eq 0x00a70fac
00a70f9c	b 0x00a70fbc
00a70fa0	ldr w8,[x19, #0x8]
00a70fa4	cmp w8,#0x1
00a70fa8	b.ne 0x00a70fbc
00a70fac	ldr x0,[x19, #0x20]
00a70fb0	mov w1,wzr
00a70fb4	bl 0x00c39690
00a70fb8	str x0,[x19, #0x20]
00a70fbc	ldp x29,x30,[sp, #0x20]
00a70fc0	ldp x20,x19,[sp, #0x10]
00a70fc4	mov w0,w21
00a70fc8	ldp x22,x21,[sp], #0x30
00a70fcc	ret

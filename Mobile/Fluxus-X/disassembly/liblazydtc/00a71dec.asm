; FUN_00a71dec @ 00a71dec
00a71dec	stp x22,x21,[sp, #-0x30]!
00a71df0	stp x20,x19,[sp, #0x10]
00a71df4	stp x29,x30,[sp, #0x20]
00a71df8	add x29,sp,#0x20
00a71dfc	mov x20,x3
00a71e00	mov x19,x2
00a71e04	mov x22,x1
00a71e08	mov w21,w0
00a71e0c	bl 0x00a70a34
00a71e10	cmp w0,#0x1
00a71e14	b.lt 0x00a71f68
00a71e18	cmp w21,#0x1
00a71e1c	b.ne 0x00a71e58
00a71e20	ldr w8,[x19, #0x8]
00a71e24	mov w0,wzr
00a71e28	cbnz w8,0x00a71f68
00a71e2c	ldr w8,[x19, #0x1c]
00a71e30	cmn w8,#0x2
00a71e34	b.ne 0x00a71e50
00a71e38	add x8,x19,#0x40
00a71e3c	mov w9,#0x32
00a71e40	str x8,[x19, #0x20]
00a71e44	mov w8,#0x1
00a71e48	str w9,[x19, #0x1c]
00a71e4c	b 0x00a71e54
00a71e50	mov w8,#0x2
00a71e54	str w8,[x19, #0x8]
00a71e58	mov w0,w21
00a71e5c	mov x1,x22
00a71e60	bl 0x00a70a34
00a71e64	cmp w0,#0x1
00a71e68	b.lt 0x00a71f68
00a71e6c	cmp w21,#0x1
00a71e70	b.ne 0x00a71eac
00a71e74	ldr w8,[x19, #0x8]
00a71e78	cmp w8,#0x2
00a71e7c	b.ne 0x00a71ed0
00a71e80	ldr x0,[x20, #0x8]
00a71e84	cbz x0,0x00a71ea4
00a71e88	ldr w8,[x19, #0x1c]
00a71e8c	ldr w9,[x20]
00a71e90	cmp w8,w9
00a71e94	b.eq 0x00a71ec4
00a71e98	ldr x0,[x20, #0x18]
00a71e9c	add x20,x20,#0x10
00a71ea0	cbnz x0,0x00a71e8c
00a71ea4	orr w0,wzr,#0xfffffffe
00a71ea8	b 0x00a71f68
00a71eac	cmp w21,#0x8
00a71eb0	b.ne 0x00a71ed0
00a71eb4	ldr w8,[x19, #0x8]
00a71eb8	cmp w8,#0x1
00a71ebc	b.eq 0x00a71e80
00a71ec0	b 0x00a71ed0
00a71ec4	str x0,[x19, #0x20]
00a71ec8	bl 0x00c2ff50
00a71ecc	str w0,[x19, #0x1c]
00a71ed0	mov w0,w21
00a71ed4	mov x1,x22
00a71ed8	mov x2,x19
00a71edc	bl 0x00a6fd84
00a71ee0	cmp w0,#0x1
00a71ee4	b.lt 0x00a71f68
00a71ee8	cmp w21,#0x7
00a71eec	b.eq 0x00a71f08
00a71ef0	cmp w21,#0x2
00a71ef4	b.ne 0x00a71f68
00a71ef8	ldr w8,[x19, #0x8]
00a71efc	cmp w8,#0x1
00a71f00	b.eq 0x00a71f1c
00a71f04	b 0x00a71f68
00a71f08	ldr w8,[x19, #0x8]
00a71f0c	cmp w8,#0x1
00a71f10	b.eq 0x00a71f50
00a71f14	cmp w8,#0x2
00a71f18	b.ne 0x00a71f68
00a71f1c	mov w0,#0xffffffff
00a71f20	str w0,[x19, #0x1c]
00a71f24	ldr x1,[x20, #0x8]
00a71f28	cbz x1,0x00a71f48
00a71f2c	ldr x0,[x19, #0x20]
00a71f30	bl 0x00c35ee0
00a71f34	cbz w0,0x00a71f58
00a71f38	ldr x1,[x20, #0x18]
00a71f3c	add x20,x20,#0x10
00a71f40	cbnz x1,0x00a71f2c
00a71f44	mov w0,#0xffffffff
00a71f48	str xzr,[x19, #0x20]
00a71f4c	b 0x00a71f68
00a71f50	orr w8,wzr,#0xfffffffe
00a71f54	b 0x00a71f64
00a71f58	ldr w8,[x20]
00a71f5c	mov w0,#0x1
00a71f60	str xzr,[x19, #0x20]
00a71f64	str w8,[x19, #0x1c]
00a71f68	ldp x29,x30,[sp, #0x20]
00a71f6c	ldp x20,x19,[sp, #0x10]
00a71f70	ldp x22,x21,[sp], #0x30
00a71f74	ret

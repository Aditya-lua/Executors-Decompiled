; FUN_009f9d0c @ 009f9d0c
009f9d0c	str x25,[sp, #-0x50]!
009f9d10	stp x20,x19,[sp, #0x30]
009f9d14	mov w20,w2
009f9d18	mov w19,wzr
009f9d1c	stp x24,x23,[sp, #0x10]
009f9d20	stp x22,x21,[sp, #0x20]
009f9d24	stp x29,x30,[sp, #0x40]
009f9d28	add x29,sp,#0x40
009f9d2c	cbz x1,0x009f9e84
009f9d30	cmp w20,#0x1
009f9d34	b.lt 0x009f9e84
009f9d38	ldr x24,[x0, #0x40]
009f9d3c	mov x22,x0
009f9d40	cbz x24,0x009f9e3c
009f9d44	ldr x8,[x22, #0x48]
009f9d48	cbz x8,0x009f9e3c
009f9d4c	mov x21,x1
009f9d50	orr w1,wzr,#0xf
009f9d54	mov x0,x22
009f9d58	bl 0x00c32190
009f9d5c	ldp w2,w8,[x24, #0x20]
009f9d60	ldr w10,[x24, #0x4]
009f9d64	add w9,w8,w2
009f9d68	sub w25,w10,w9
009f9d6c	cmp w25,w20
009f9d70	b.ge 0x009f9e44
009f9d74	mov w19,wzr
009f9d78	cbz w2,0x009f9de4
009f9d7c	cmp w25,#0x1
009f9d80	b.lt 0x009f9db4
009f9d84	ldr x8,[x24, #0x18]
009f9d88	sxtw x23,w25
009f9d8c	mov x1,x21
009f9d90	mov x2,x23
009f9d94	add x0,x8,w9, SXTW 
009f9d98	bl 0x00c2ffd0
009f9d9c	ldp w9,w8,[x24, #0x20]
009f9da0	add x21,x21,x23
009f9da4	sub w20,w20,w25
009f9da8	add w19,w25,w19
009f9dac	add w2,w9,w25
009f9db0	str w2,[x24, #0x20]
009f9db4	ldr x9,[x24, #0x18]
009f9db8	ldr x0,[x22, #0x48]
009f9dbc	add x1,x9,w8, SXTW 
009f9dc0	bl 0x00c34240
009f9dc4	mov w23,w0
009f9dc8	cmp w0,#0x0
009f9dcc	b.le 0x009f9e70
009f9dd0	ldp w9,w8,[x24, #0x20]
009f9dd4	add w8,w8,w23
009f9dd8	subs w2,w9,w23
009f9ddc	stp w2,w8,[x24, #0x20]
009f9de0	b.ne 0x009f9db4
009f9de4	str wzr,[x24, #0x24]
009f9de8	ldr w10,[x24, #0x4]
009f9dec	cmp w20,w10
009f9df0	b.lt 0x009f9e24
009f9df4	ldr x0,[x22, #0x48]
009f9df8	mov x1,x21
009f9dfc	mov w2,w20
009f9e00	bl 0x00c34240
009f9e04	mov w23,w0
009f9e08	cmp w0,#0x0
009f9e0c	b.le 0x009f9e70
009f9e10	add w19,w23,w19
009f9e14	subs w20,w20,w23
009f9e18	add x21,x21,w23, SXTW 
009f9e1c	b.ne 0x009f9de8
009f9e20	b 0x009f9e84
009f9e24	ldp w2,w8,[x24, #0x20]
009f9e28	add w9,w8,w2
009f9e2c	sub w25,w10,w9
009f9e30	cmp w20,w25
009f9e34	b.gt 0x009f9d78
009f9e38	b 0x009f9e48
009f9e3c	mov w19,wzr
009f9e40	b 0x009f9e84
009f9e44	mov w19,wzr
009f9e48	ldr x8,[x24, #0x18]
009f9e4c	sxtw x2,w20
009f9e50	mov x1,x21
009f9e54	add x0,x8,w9, SXTW 
009f9e58	bl 0x00c2ffd0
009f9e5c	ldr w8,[x24, #0x20]
009f9e60	add w19,w19,w20
009f9e64	add w8,w8,w20
009f9e68	str w8,[x24, #0x20]
009f9e6c	b 0x009f9e84
009f9e70	mov x0,x22
009f9e74	bl 0x00c38460
009f9e78	tbz w23,#0x1f,0x009f9e84
009f9e7c	cmp w19,#0x0
009f9e80	csel w19,w19,w23,gt
009f9e84	mov w0,w19
009f9e88	ldp x29,x30,[sp, #0x40]
009f9e8c	ldp x20,x19,[sp, #0x30]
009f9e90	ldp x22,x21,[sp, #0x20]
009f9e94	ldp x24,x23,[sp, #0x10]
009f9e98	ldr x25,[sp], #0x50
009f9e9c	ret

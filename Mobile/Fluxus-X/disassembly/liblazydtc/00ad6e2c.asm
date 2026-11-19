; FUN_00ad6e2c @ 00ad6e2c
00ad6e2c	sub sp,sp,#0x60
00ad6e30	stp x24,x23,[sp, #0x20]
00ad6e34	stp x22,x21,[sp, #0x30]
00ad6e38	stp x20,x19,[sp, #0x40]
00ad6e3c	stp x29,x30,[sp, #0x50]
00ad6e40	str x25,[sp, #0x10]
00ad6e44	mov x25,x0
00ad6e48	ldr x21,[x0, #0x98]
00ad6e4c	ldr x0,[x0, #0x88]
00ad6e50	add x29,sp,#0x50
00ad6e54	mov x23,x4
00ad6e58	mov x22,x3
00ad6e5c	mov x19,x2
00ad6e60	mov x20,x1
00ad6e64	bl 0x00c3d8d0
00ad6e68	ldr w4,[x21, #0x1c]
00ad6e6c	mov x24,x0
00ad6e70	cmp w4,#0x4
00ad6e74	b.ne 0x00ad6ed0
00ad6e78	mov x0,x21
00ad6e7c	mov x1,x25
00ad6e80	bl 0x00ad789c
00ad6e84	cbz w0,0x00ad6f3c
00ad6e88	ldr x2,[x21, #0x38]
00ad6e8c	orr w4,wzr,#0x3
00ad6e90	mov w0,w23
00ad6e94	mov x1,x22
00ad6e98	mov x3,x24
00ad6e9c	bl 0x00c3fdd0
00ad6ea0	mov w1,w0
00ad6ea4	cmp w0,#0x1
00ad6ea8	b.lt 0x00ad6f40
00ad6eac	ldp x2,x5,[x21, #0x38]
00ad6eb0	ldr w6,[x21, #0x48]
00ad6eb4	ldp x7,x8,[x21, #0x20]
00ad6eb8	mov x0,x20
00ad6ebc	mov w3,w1
00ad6ec0	mov w4,w1
00ad6ec4	str x8,[sp]
00ad6ec8	bl 0x00c3ff40
00ad6ecc	b 0x00ad6ee4
00ad6ed0	mov w0,w23
00ad6ed4	mov x1,x22
00ad6ed8	mov x2,x20
00ad6edc	mov x3,x24
00ad6ee0	bl 0x00c3fdd0
00ad6ee4	sxtw x8,w0
00ad6ee8	asr x10,x8,#0x3f
00ad6eec	ldr x9,[x19]
00ad6ef0	str x10,[sp, #0x18]
00ad6ef4	mvn x10,x10
00ad6ef8	ldr x11,[sp, #0x18]
00ad6efc	str x10,[sp, #0x18]
00ad6f00	ldr x10,[sp, #0x18]
00ad6f04	and x9,x11,x9
00ad6f08	asr w11,w0,#0x1f
00ad6f0c	and x8,x10,x8
00ad6f10	orr x8,x8,x9
00ad6f14	mvn w10,w11
00ad6f18	str x8,[x19]
00ad6f1c	str w11,[sp, #0x18]
00ad6f20	ldr w8,[sp, #0x18]
00ad6f24	str w10,[sp, #0x18]
00ad6f28	ldr w9,[sp, #0x18]
00ad6f2c	and w8,w8,w0
00ad6f30	and w9,w9,#0x1
00ad6f34	orr w1,w9,w8
00ad6f38	b 0x00ad6f40
00ad6f3c	mov w1,#0xffffffff
00ad6f40	ldp x29,x30,[sp, #0x50]
00ad6f44	ldp x20,x19,[sp, #0x40]
00ad6f48	ldp x22,x21,[sp, #0x30]
00ad6f4c	ldp x24,x23,[sp, #0x20]
00ad6f50	ldr x25,[sp, #0x10]
00ad6f54	mov w0,w1
00ad6f58	add sp,sp,#0x60
00ad6f5c	ret

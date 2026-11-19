; FUN_00b59e5c @ 00b59e5c
00b59e5c	stp x22,x21,[sp, #-0x30]!
00b59e60	stp x20,x19,[sp, #0x10]
00b59e64	stp x29,x30,[sp, #0x20]
00b59e68	mov x19,x0
00b59e6c	ldr x21,[x0, #0xf8]
00b59e70	ldr x0,[x0, #0x8]
00b59e74	add x29,sp,#0x20
00b59e78	mov x20,x1
00b59e7c	bl 0x00c41210
00b59e80	mov x2,x0
00b59e84	mov x0,x21
00b59e88	mov x1,x20
00b59e8c	bl 0x00c41150
00b59e90	cbz w0,0x00b59f3c
00b59e94	mov x0,x21
00b59e98	bl 0x00c41160
00b59e9c	cbz x0,0x00b59ef8
00b59ea0	mov x22,x0
00b59ea4	bl 0x00c3cf50
00b59ea8	tbnz w0,#0x1,0x00b59f10
00b59eac	mov x0,x22
00b59eb0	bl 0x00c34c20
00b59eb4	sxtw x8,w0
00b59eb8	str x8,[x21, #0x20]
00b59ebc	lsl w8,w0,#0x3
00b59ec0	and w8,w8,#0xffffffc0
00b59ec4	mov w9,#0x100
00b59ec8	cmp w8,#0x100
00b59ecc	csel w8,w8,w9,cc
00b59ed0	mov w9,#0x37
00b59ed4	cmp w0,#0x20
00b59ed8	mov w10,#0x6f
00b59edc	str w8,[x19, #0x80]
00b59ee0	lsr w8,w8,#0x3
00b59ee4	csel x9,x10,x9,hi
00b59ee8	str x8,[x19, #0x90]
00b59eec	lsr x8,x8,#0x1
00b59ef0	str x9,[x19, #0xe8]
00b59ef4	str x8,[x19, #0xa0]
00b59ef8	mov x0,x19
00b59efc	mov x1,x20
00b59f00	ldp x29,x30,[sp, #0x20]
00b59f04	ldp x20,x19,[sp, #0x10]
00b59f08	ldp x22,x21,[sp], #0x30
00b59f0c	b 0x00c417b0
00b59f10	bl 0x00c342a0
00b59f14	adrp x0,0x2a8000
00b59f18	adrp x2,0x2be000
00b59f1c	add x0,x0,#0xd32
00b59f20	add x2,x2,#0xaee
00b59f24	mov w1,#0x1d9
00b59f28	bl 0x00c342b0
00b59f2c	mov w0,#0x39
00b59f30	mov w1,#0xb7
00b59f34	mov x2,xzr
00b59f38	bl 0x00c342c0
00b59f3c	ldp x29,x30,[sp, #0x20]
00b59f40	ldp x20,x19,[sp, #0x10]
00b59f44	mov w0,wzr
00b59f48	ldp x22,x21,[sp], #0x30
00b59f4c	ret

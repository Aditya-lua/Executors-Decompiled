; FUN_00a72d10 @ 00a72d10
00a72d10	sub sp,sp,#0x80
00a72d14	stp x22,x21,[sp, #0x50]
00a72d18	stp x20,x19,[sp, #0x60]
00a72d1c	stp x29,x30,[sp, #0x70]
00a72d20	ldr x8,[x2, #0x20]
00a72d24	mov w21,w0
00a72d28	add x29,sp,#0x70
00a72d2c	mov x19,x2
00a72d30	mov x0,x8
00a72d34	mov x20,x1
00a72d38	bl 0x00c37cd0
00a72d3c	cmp w0,#0x6
00a72d40	b.eq 0x00a72d58
00a72d44	ldr x0,[x19, #0x20]
00a72d48	bl 0x00c37cd0
00a72d4c	cmp w0,#0x390
00a72d50	mov w0,wzr
00a72d54	b.ne 0x00a72db8
00a72d58	ldr x0,[x19, #0x20]
00a72d5c	bl 0x00c3d8d0
00a72d60	mov x22,x0
00a72d64	bl 0x00c3db80
00a72d68	cmp w0,#0x8
00a72d6c	b.cc 0x00a72db4
00a72d70	mov x1,sp
00a72d74	mov x0,x22
00a72d78	bl 0x00c3db40
00a72d7c	cbz w0,0x00a72db4
00a72d80	ldr x8,[sp, #0x38]
00a72d84	cbz x8,0x00a72db4
00a72d88	ldr x9,[x19, #0x30]
00a72d8c	mov w0,wzr
00a72d90	ldr w9,[x9, #0x8]
00a72d94	cmp w9,#0x2
00a72d98	b.ne 0x00a72db8
00a72d9c	mov w0,w21
00a72da0	mov x1,x20
00a72da4	mov x2,x19
00a72da8	str x8,[x19, #0x20]
00a72dac	bl 0x00a6fd84
00a72db0	b 0x00a72db8
00a72db4	mov w0,wzr
00a72db8	ldp x29,x30,[sp, #0x70]
00a72dbc	ldp x20,x19,[sp, #0x60]
00a72dc0	ldp x22,x21,[sp, #0x50]
00a72dc4	add sp,sp,#0x80
00a72dc8	ret

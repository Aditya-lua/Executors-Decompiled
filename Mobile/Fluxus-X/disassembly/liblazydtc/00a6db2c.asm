; FUN_00a6db2c @ 00a6db2c
00a6db2c	str x21,[sp, #-0x30]!
00a6db30	stp x20,x19,[sp, #0x10]
00a6db34	stp x29,x30,[sp, #0x20]
00a6db38	ldr w8,[x0]
00a6db3c	mov x19,x0
00a6db40	mov w20,w1
00a6db44	add x0,sp,#0x8
00a6db48	mov w1,w8
00a6db4c	add x29,sp,#0x20
00a6db50	bl 0x00c37b20
00a6db54	cbz x0,0x00a6db60
00a6db58	ldr w21,[x0]
00a6db5c	b 0x00a6db64
00a6db60	mov w21,wzr
00a6db64	ldr x0,[sp, #0x8]
00a6db68	bl 0x00c32360
00a6db6c	cmp w21,w20
00a6db70	b.ne 0x00a6db94
00a6db74	mov x0,x19
00a6db78	bl 0x00a6d87c
00a6db7c	cbz x0,0x00a6dbc0
00a6db80	mov x19,x0
00a6db84	bl 0x00c3b2a0
00a6db88	cmp w0,#0x0
00a6db8c	csel x0,xzr,x19,eq
00a6db90	b 0x00a6dbc4
00a6db94	bl 0x00c342a0
00a6db98	adrp x0,0x2c1000
00a6db9c	adrp x2,0x2b5000
00a6dba0	add x0,x0,#0xcf9
00a6dba4	add x2,x2,#0xcdc
00a6dba8	mov w1,#0x371
00a6dbac	bl 0x00c342b0
00a6dbb0	orr w0,wzr,#0x6
00a6dbb4	mov w1,#0xdb
00a6dbb8	mov x2,xzr
00a6dbbc	bl 0x00c342c0
00a6dbc0	mov x0,xzr
00a6dbc4	ldp x29,x30,[sp, #0x20]
00a6dbc8	ldp x20,x19,[sp, #0x10]
00a6dbcc	ldr x21,[sp], #0x30
00a6dbd0	ret

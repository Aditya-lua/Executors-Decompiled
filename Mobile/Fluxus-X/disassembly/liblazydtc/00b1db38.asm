; d2i_EC_PUBKEY @ 00b1db38
00b1db38	sub sp,sp,#0x40
00b1db3c	stp x22,x21,[sp, #0x10]
00b1db40	stp x20,x19,[sp, #0x20]
00b1db44	stp x29,x30,[sp, #0x30]
00b1db48	ldr x8,[x1]
00b1db4c	mov x20,x1
00b1db50	mov x19,x0
00b1db54	add x1,sp,#0x8
00b1db58	mov w5,#0x1
00b1db5c	mov x0,xzr
00b1db60	mov x3,xzr
00b1db64	mov x4,xzr
00b1db68	add x29,sp,#0x30
00b1db6c	str x8,[sp, #0x8]
00b1db70	bl 0x00b1d214
00b1db74	cbz x0,0x00b1dbcc
00b1db78	mov x22,x0
00b1db7c	bl 0x00c324b0
00b1db80	cmp w0,#0x198
00b1db84	b.eq 0x00b1db90
00b1db88	cmp w0,#0x494
00b1db8c	b.ne 0x00b1dbc4
00b1db90	mov x0,x22
00b1db94	bl 0x00c3d8e0
00b1db98	mov x21,x0
00b1db9c	mov x0,x22
00b1dba0	bl 0x00c32450
00b1dba4	cbz x21,0x00b1dbd0
00b1dba8	ldr x8,[sp, #0x8]
00b1dbac	str x8,[x20]
00b1dbb0	cbz x19,0x00b1dbd0
00b1dbb4	ldr x0,[x19]
00b1dbb8	bl 0x00c3a7c0
00b1dbbc	str x21,[x19]
00b1dbc0	b 0x00b1dbd0
00b1dbc4	mov x0,x22
00b1dbc8	bl 0x00c32450
00b1dbcc	mov x21,xzr
00b1dbd0	mov x0,x21
00b1dbd4	ldp x29,x30,[sp, #0x30]
00b1dbd8	ldp x20,x19,[sp, #0x20]
00b1dbdc	ldp x22,x21,[sp, #0x10]
00b1dbe0	add sp,sp,#0x40
00b1dbe4	ret

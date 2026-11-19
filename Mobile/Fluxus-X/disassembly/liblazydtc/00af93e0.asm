; FUN_00af93e0 @ 00af93e0
00af93e0	stp x20,x19,[sp, #-0x20]!
00af93e4	stp x29,x30,[sp, #0x10]
00af93e8	ldr x20,[x0]
00af93ec	ldr x19,[x1]
00af93f0	add x29,sp,#0x10
00af93f4	ldr w8,[x20]
00af93f8	cmp w8,#0x1
00af93fc	b.eq 0x00af9418
00af9400	cbnz w8,0x00af9448
00af9404	ldr w8,[x19]
00af9408	ldr x0,[x20, #0x8]
00af940c	cbz w8,0x00af9450
00af9410	ldr x8,[x19, #0x8]
00af9414	b 0x00af9454
00af9418	ldr w8,[x19]
00af941c	cmp w8,#0x1
00af9420	b.ne 0x00af9448
00af9424	ldr x8,[x20, #0x8]
00af9428	ldr x9,[x19, #0x8]
00af942c	ldr x0,[x8]
00af9430	ldr x1,[x9]
00af9434	bl 0x00c37560
00af9438	cbz w0,0x00af9464
00af943c	ldp x29,x30,[sp, #0x10]
00af9440	ldp x20,x19,[sp], #0x20
00af9444	ret
00af9448	ldr x8,[x20, #0x8]
00af944c	ldr x0,[x8]
00af9450	add x8,x19,#0x8
00af9454	ldr x1,[x8]
00af9458	ldp x29,x30,[sp, #0x10]
00af945c	ldp x20,x19,[sp], #0x20
00af9460	b 0x00c37560
00af9464	ldr x8,[x20, #0x8]
00af9468	ldr x9,[x19, #0x8]
00af946c	ldr x0,[x8, #0x8]
00af9470	add x8,x9,#0x8
00af9474	b 0x00af9454

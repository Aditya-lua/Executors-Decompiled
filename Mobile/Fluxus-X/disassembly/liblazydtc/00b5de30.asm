; FUN_00b5de30 @ 00b5de30
00b5de30	stp x24,x23,[sp, #-0x40]!
00b5de34	stp x22,x21,[sp, #0x10]
00b5de38	stp x20,x19,[sp, #0x20]
00b5de3c	stp x29,x30,[sp, #0x30]
00b5de40	ldr x24,[x0, #0x8]
00b5de44	add x29,sp,#0x30
00b5de48	mov x19,x4
00b5de4c	mov x20,x3
00b5de50	mov x23,x2
00b5de54	mov x22,x0
00b5de58	mov x21,x1
00b5de5c	bl 0x00c41000
00b5de60	cmp x23,#0x72
00b5de64	b.ne 0x00b5dea0
00b5de68	cbz w0,0x00b5dea0
00b5de6c	ldr x0,[x22]
00b5de70	ldr x7,[x24, #0x8]
00b5de74	mov x1,x20
00b5de78	mov x2,x19
00b5de7c	mov x3,x21
00b5de80	ldp x29,x30,[sp, #0x30]
00b5de84	ldp x20,x19,[sp, #0x20]
00b5de88	ldp x22,x21,[sp, #0x10]
00b5de8c	add x4,x24,#0x11
00b5de90	mov x5,xzr
00b5de94	mov x6,xzr
00b5de98	ldp x24,x23,[sp], #0x40
00b5de9c	b 0x00c3a580
00b5dea0	ldp x29,x30,[sp, #0x30]
00b5dea4	ldp x20,x19,[sp, #0x20]
00b5dea8	ldp x22,x21,[sp, #0x10]
00b5deac	mov w0,wzr
00b5deb0	ldp x24,x23,[sp], #0x40
00b5deb4	ret

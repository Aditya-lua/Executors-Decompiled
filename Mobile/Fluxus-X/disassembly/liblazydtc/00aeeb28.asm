; FUN_00aeeb28 @ 00aeeb28
00aeeb28	sub sp,sp,#0x70
00aeeb2c	stp x20,x19,[sp, #0x50]
00aeeb30	mov x19,x2
00aeeb34	mov x20,x0
00aeeb38	add x0,sp,#0x8
00aeeb3c	mov w2,#0x48
00aeeb40	mov w1,wzr
00aeeb44	stp x29,x30,[sp, #0x60]
00aeeb48	add x29,sp,#0x60
00aeeb4c	bl 0x00c301c0
00aeeb50	mov w8,#0x5
00aeeb54	str w8,[sp, #0x8]
00aeeb58	str x20,[sp, #0x10]
00aeeb5c	ldr x8,[x19]
00aeeb60	ldr x8,[x8, #0x10]
00aeeb64	cbz x8,0x00aeeb7c
00aeeb68	add x1,sp,#0x8
00aeeb6c	mov x0,x19
00aeeb70	blr x8
00aeeb74	cmp w0,#0x1
00aeeb78	b.lt 0x00aeeb84
00aeeb7c	mov w0,wzr
00aeeb80	b 0x00aeeb88
00aeeb84	mov w0,#0xffffffff
00aeeb88	ldp x29,x30,[sp, #0x60]
00aeeb8c	ldp x20,x19,[sp, #0x50]
00aeeb90	add sp,sp,#0x70
00aeeb94	ret

; FUN_00842b80 @ 00842b80
00842b80	adrp x9,0xcb4000
00842b84	ldr x9,[x9, #0xaa0]
00842b88	ldr x8,[x0, #0x8]
00842b8c	add x9,x9,#0x10
00842b90	str x9,[x0]
00842b94	cbz x8,0x00842bc4
00842b98	stp x29,x30,[sp, #-0x20]!
00842b9c	str x19,[sp, #0x10]
00842ba0	mov x29,sp
00842ba4	ldr x9,[x8]
00842ba8	mov x19,x0
00842bac	mov x0,x8
00842bb0	ldr x9,[x9, #0x8]
00842bb4	blr x9
00842bb8	mov x0,x19
00842bbc	ldr x19,[sp, #0x10]
00842bc0	ldp x29,x30,[sp], #0x20
00842bc4	mov w1,#0x10
00842bc8	b 0x00c2fe80

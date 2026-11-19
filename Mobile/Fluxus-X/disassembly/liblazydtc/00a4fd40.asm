; FUN_00a4fd40 @ 00a4fd40
00a4fd40	cbz x0,0x00a4fda4
00a4fd44	stp x20,x19,[sp, #-0x20]!
00a4fd48	stp x29,x30,[sp, #0x10]
00a4fd4c	adrp x1,0xcb5000
00a4fd50	mov x19,x0
00a4fd54	ldr x0,[x0, #0x18]
00a4fd58	ldr x1,[x1, #0x1d0]
00a4fd5c	add x29,sp,#0x10
00a4fd60	bl 0x00c32600
00a4fd64	ldr x0,[x19, #0x8]
00a4fd68	adrp x20,0x2c5000
00a4fd6c	add x20,x20,#0x9ce
00a4fd70	mov w2,#0xc4
00a4fd74	mov x1,x20
00a4fd78	bl 0x00c32310
00a4fd7c	ldr x0,[x19, #0x20]
00a4fd80	mov w2,#0xc5
00a4fd84	mov x1,x20
00a4fd88	bl 0x00c32310
00a4fd8c	ldp x29,x30,[sp, #0x10]
00a4fd90	mov w2,#0xc6
00a4fd94	mov x0,x19
00a4fd98	mov x1,x20
00a4fd9c	ldp x20,x19,[sp], #0x20
00a4fda0	b 0x00c32310
00a4fda4	ret

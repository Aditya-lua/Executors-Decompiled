; curl_getenv @ 00960b7c
00960b7c	stp x29,x30,[sp, #-0x10]!
00960b80	mov x29,sp
00960b84	bl 0x00c32100
00960b88	cbz x0,0x00960ba8
00960b8c	ldrb w8,[x0]
00960b90	cbz w8,0x00960ba8
00960b94	adrp x8,0xcc4000
00960b98	add x8,x8,#0x688
00960b9c	ldr x1,[x8]
00960ba0	ldp x29,x30,[sp], #0x10
00960ba4	br x1
00960ba8	mov x0,xzr
00960bac	ldp x29,x30,[sp], #0x10
00960bb0	ret

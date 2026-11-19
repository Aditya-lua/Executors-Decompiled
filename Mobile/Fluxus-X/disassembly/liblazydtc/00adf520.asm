; SHA1_Init @ 00adf520
00adf520	str x19,[sp, #-0x20]!
00adf524	mov x19,x0
00adf528	add x0,x0,#0x14
00adf52c	mov w2,#0x4c
00adf530	mov w1,wzr
00adf534	stp x29,x30,[sp, #0x10]
00adf538	add x29,sp,#0x10
00adf53c	bl 0x00c301c0
00adf540	adrp x8,0x29c000
00adf544	ldr q0,[x8, #0x2e0]
00adf548	mov w8,#0xe1f0
00adf54c	movk w8,#0xc3d2, LSL #16
00adf550	str w8,[x19, #0x10]
00adf554	str q0,[x19]
00adf558	ldp x29,x30,[sp, #0x10]
00adf55c	mov w0,#0x1
00adf560	ldr x19,[sp], #0x20
00adf564	ret

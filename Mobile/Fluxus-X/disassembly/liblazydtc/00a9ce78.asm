; WPACKET_memset @ 00a9ce78
00a9ce78	str x21,[sp, #-0x30]!
00a9ce7c	stp x20,x19,[sp, #0x10]
00a9ce80	stp x29,x30,[sp, #0x20]
00a9ce84	add x29,sp,#0x20
00a9ce88	cbz x2,0x00a9cecc
00a9ce8c	mov x19,x2
00a9ce90	mov w20,w1
00a9ce94	add x2,sp,#0x8
00a9ce98	mov x1,x19
00a9ce9c	mov x21,x0
00a9cea0	bl 0x00a9c32c
00a9cea4	cbz w0,0x00a9ced0
00a9cea8	ldr q0,[x21, #0x10]
00a9ceac	dup v1.2D,x19
00a9ceb0	add v0.2D,v1.2D,v0.2D
00a9ceb4	str q0,[x21, #0x10]
00a9ceb8	ldr x0,[sp, #0x8]
00a9cebc	cbz x0,0x00a9cecc
00a9cec0	mov w1,w20
00a9cec4	mov x2,x19
00a9cec8	bl 0x00c301c0
00a9cecc	mov w0,#0x1
00a9ced0	ldp x29,x30,[sp, #0x20]
00a9ced4	ldp x20,x19,[sp, #0x10]
00a9ced8	ldr x21,[sp], #0x30
00a9cedc	ret

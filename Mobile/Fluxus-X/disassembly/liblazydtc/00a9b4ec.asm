; CRYPTO_strndup @ 00a9b4ec
00a9b4ec	str x21,[sp, #-0x30]!
00a9b4f0	stp x20,x19,[sp, #0x10]
00a9b4f4	stp x29,x30,[sp, #0x20]
00a9b4f8	add x29,sp,#0x20
00a9b4fc	cbz x0,0x00a9b558
00a9b500	mov x19,x0
00a9b504	mov x8,x0
00a9b508	cbz x1,0x00a9b524
00a9b50c	mov x8,x19
00a9b510	ldrb w9,[x8]
00a9b514	cbz w9,0x00a9b524
00a9b518	sub x1,x1,#0x1
00a9b51c	add x8,x8,#0x1
00a9b520	cbnz x1,0x00a9b510
00a9b524	sub x20,x8,x19
00a9b528	add x0,x20,#0x1
00a9b52c	mov x1,x2
00a9b530	mov w2,w3
00a9b534	bl 0x00c32320
00a9b538	mov x21,x0
00a9b53c	cbz x0,0x00a9b55c
00a9b540	mov x0,x21
00a9b544	mov x1,x19
00a9b548	mov x2,x20
00a9b54c	bl 0x00c2ffd0
00a9b550	strb wzr,[x21, x20]
00a9b554	b 0x00a9b55c
00a9b558	mov x21,xzr
00a9b55c	ldp x29,x30,[sp, #0x20]
00a9b560	ldp x20,x19,[sp, #0x10]
00a9b564	mov x0,x21
00a9b568	ldr x21,[sp], #0x30
00a9b56c	ret

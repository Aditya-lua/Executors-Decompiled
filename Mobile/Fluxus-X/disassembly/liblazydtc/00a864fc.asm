; EVP_CIPHER_meth_dup @ 00a864fc
00a864fc	stp x22,x21,[sp, #-0x30]!
00a86500	stp x20,x19,[sp, #0x10]
00a86504	stp x29,x30,[sp, #0x20]
00a86508	ldr x8,[x0, #0x78]
00a8650c	mov x19,xzr
00a86510	add x29,sp,#0x20
00a86514	cbnz x8,0x00a8655c
00a86518	ldr x22,[x0]
00a8651c	ldr w21,[x0, #0x8]
00a86520	mov x20,x0
00a86524	bl 0x00c3cd50
00a86528	mov x19,x0
00a8652c	cbz x0,0x00a8655c
00a86530	str x22,[x19]
00a86534	ldr x22,[x19, #0x88]
00a86538	str w21,[x19, #0x8]
00a8653c	mov w21,#0x2
00a86540	mov w2,#0x100
00a86544	mov x0,x19
00a86548	mov x1,x20
00a8654c	str w21,[x19, #0x18]
00a86550	bl 0x00c2ffd0
00a86554	str x22,[x19, #0x88]
00a86558	str w21,[x19, #0x18]
00a8655c	mov x0,x19
00a86560	ldp x29,x30,[sp, #0x20]
00a86564	ldp x20,x19,[sp, #0x10]
00a86568	ldp x22,x21,[sp], #0x30
00a8656c	ret

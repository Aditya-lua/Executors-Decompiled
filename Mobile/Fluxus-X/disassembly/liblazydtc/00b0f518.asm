; X509_STORE_CTX_new_ex @ 00b0f518
00b0f518	str x21,[sp, #-0x30]!
00b0f51c	stp x20,x19,[sp, #0x10]
00b0f520	mov x20,x1
00b0f524	adrp x1,0x2a0000
00b0f528	mov x21,x0
00b0f52c	add x1,x1,#0xe02
00b0f530	mov w0,#0x110
00b0f534	mov w2,#0x8ec
00b0f538	stp x29,x30,[sp, #0x20]
00b0f53c	add x29,sp,#0x20
00b0f540	bl 0x00c34250
00b0f544	mov x19,x0
00b0f548	cbz x0,0x00b0f5bc
00b0f54c	str x21,[x19, #0x100]
00b0f550	cbz x20,0x00b0f5ec
00b0f554	adrp x1,0x2a0000
00b0f558	add x1,x1,#0xe02
00b0f55c	mov w2,#0x8f5
00b0f560	mov x0,x20
00b0f564	bl 0x00c34600
00b0f568	str x0,[x19, #0x108]
00b0f56c	cbnz x0,0x00b0f5ec
00b0f570	adrp x20,0x2a0000
00b0f574	add x20,x20,#0xe02
00b0f578	mov w2,#0x8f7
00b0f57c	mov x0,x19
00b0f580	mov x1,x20
00b0f584	bl 0x00c32310
00b0f588	bl 0x00c342a0
00b0f58c	adrp x2,0x2d0000
00b0f590	add x2,x2,#0x5ba
00b0f594	mov w1,#0x8f8
00b0f598	mov x0,x20
00b0f59c	bl 0x00c342b0
00b0f5a0	mov w1,#0x100
00b0f5a4	mov w0,#0xb
00b0f5a8	movk w1,#0xc, LSL #16
00b0f5ac	mov x2,xzr
00b0f5b0	bl 0x00c342c0
00b0f5b4	mov x19,xzr
00b0f5b8	b 0x00b0f5ec
00b0f5bc	bl 0x00c342a0
00b0f5c0	adrp x0,0x2a0000
00b0f5c4	adrp x2,0x2d0000
00b0f5c8	add x0,x0,#0xe02
00b0f5cc	add x2,x2,#0x5ba
00b0f5d0	mov w1,#0x8ef
00b0f5d4	bl 0x00c342b0
00b0f5d8	mov w1,#0x100
00b0f5dc	mov w0,#0xb
00b0f5e0	movk w1,#0xc, LSL #16
00b0f5e4	mov x2,xzr
00b0f5e8	bl 0x00c342c0
00b0f5ec	mov x0,x19
00b0f5f0	ldp x29,x30,[sp, #0x20]
00b0f5f4	ldp x20,x19,[sp, #0x10]
00b0f5f8	ldr x21,[sp], #0x30
00b0f5fc	ret

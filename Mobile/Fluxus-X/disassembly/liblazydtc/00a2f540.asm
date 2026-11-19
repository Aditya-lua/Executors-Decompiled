; EC_KEY_set_group @ 00a2f540
00a2f540	stp x20,x19,[sp, #-0x20]!
00a2f544	stp x29,x30,[sp, #0x10]
00a2f548	ldr x8,[x0]
00a2f54c	mov x19,x0
00a2f550	mov x20,x1
00a2f554	add x29,sp,#0x10
00a2f558	ldr x8,[x8, #0x28]
00a2f55c	cbz x8,0x00a2f570
00a2f560	mov x0,x19
00a2f564	mov x1,x20
00a2f568	blr x8
00a2f56c	cbz w0,0x00a2f5c4
00a2f570	ldr x0,[x19, #0x18]
00a2f574	bl 0x00c3a770
00a2f578	mov x0,x20
00a2f57c	bl 0x00c3a760
00a2f580	str x0,[x19, #0x18]
00a2f584	cbz x0,0x00a2f5ac
00a2f588	bl 0x00c36870
00a2f58c	cmp w0,#0x494
00a2f590	b.ne 0x00a2f5ac
00a2f594	ldr w8,[x19, #0x3c]
00a2f598	ldr x9,[x19, #0x68]
00a2f59c	orr w8,w8,#0x4
00a2f5a0	add x9,x9,#0x1
00a2f5a4	str w8,[x19, #0x3c]
00a2f5a8	str x9,[x19, #0x68]
00a2f5ac	ldr x9,[x19, #0x18]
00a2f5b0	ldr x8,[x19, #0x68]
00a2f5b4	cmp x9,#0x0
00a2f5b8	add x8,x8,#0x1
00a2f5bc	cset w0,ne
00a2f5c0	str x8,[x19, #0x68]
00a2f5c4	ldp x29,x30,[sp, #0x10]
00a2f5c8	ldp x20,x19,[sp], #0x20
00a2f5cc	ret

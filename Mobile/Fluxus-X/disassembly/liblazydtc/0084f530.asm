; FUN_0084f530 @ 0084f530
0084f530	stp x29,x30,[sp, #-0x20]!
0084f534	stp x20,x19,[sp, #0x10]
0084f538	mov x29,sp
0084f53c	ldr x8,[x1]
0084f540	mov x20,x0
0084f544	mov x19,x1
0084f548	mov x0,x1
0084f54c	mov x1,x20
0084f550	ldr x8,[x8, #0xb8]
0084f554	blr x8
0084f558	tbz w0,#0x0,0x0084f5d4
0084f55c	adrp x8,0xd1e000
0084f560	add x8,x8,#0xce0
0084f564	ldrb w8,[x8]
0084f568	cmp w8,#0x1
0084f56c	b.ne 0x0084f590
0084f570	ldr x8,[x20, #0x48]
0084f574	cbz x8,0x0084f590
0084f578	ldr x0,[x8, #0x38]
0084f57c	cbz x0,0x0084f590
0084f580	ldr x8,[x0]
0084f584	mov x1,x19
0084f588	ldr x8,[x8]
0084f58c	blr x8
0084f590	ldr x0,[x20, #0x20]
0084f594	mov x1,x19
0084f598	ldr x8,[x0]
0084f59c	ldr x8,[x8]
0084f5a0	blr x8
0084f5a4	ldr x0,[x20, #0x30]
0084f5a8	mov x1,x19
0084f5ac	ldr x8,[x0]
0084f5b0	ldr x8,[x8]
0084f5b4	blr x8
0084f5b8	ldr x0,[x20, #0x40]
0084f5bc	ldr x8,[x0]
0084f5c0	ldr x2,[x8]
0084f5c4	mov x1,x19
0084f5c8	ldp x20,x19,[sp, #0x10]
0084f5cc	ldp x29,x30,[sp], #0x20
0084f5d0	br x2
0084f5d4	ldp x20,x19,[sp, #0x10]
0084f5d8	ldp x29,x30,[sp], #0x20
0084f5dc	ret

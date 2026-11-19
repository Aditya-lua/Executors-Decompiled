; FUN_0084e548 @ 0084e548
0084e548	sub sp,sp,#0x50
0084e54c	stp x29,x30,[sp, #0x20]
0084e550	str x21,[sp, #0x30]
0084e554	stp x20,x19,[sp, #0x40]
0084e558	add x29,sp,#0x20
0084e55c	mrs x21,tpidr_el0
0084e560	mov w1,#0x1
0084e564	mov x19,x0
0084e568	ldr x8,[x21, #0x28]
0084e56c	mov w20,#0x1
0084e570	stur x8,[x29, #-0x8]
0084e574	bl 0x008abd78
0084e578	add x8,sp,#0x8
0084e57c	bl 0x0084dce8
0084e580	ldr x8,[sp, #0x8]
0084e584	cbz x8,0x0084e594
0084e588	add x8,x8,#0x590
0084e58c	ldarb w8,[x8]
0084e590	and w20,w8,#0x1
0084e594	mov x0,x19
0084e598	mov w1,w20
0084e59c	bl 0x008ac964
0084e5a0	ldr x19,[sp, #0x10]
0084e5a4	cbz x19,0x0084e5d0
0084e5a8	add x1,x19,#0x8
0084e5ac	mov x0,#-0x1
0084e5b0	bl 0x00c2bd10
0084e5b4	cbnz x0,0x0084e5d0
0084e5b8	ldr x8,[x19]
0084e5bc	mov x0,x19
0084e5c0	ldr x8,[x8, #0x10]
0084e5c4	blr x8
0084e5c8	mov x0,x19
0084e5cc	bl 0x00c2ff00
0084e5d0	ldr x8,[x21, #0x28]
0084e5d4	ldur x9,[x29, #-0x8]
0084e5d8	cmp x8,x9
0084e5dc	b.ne 0x0084e61c
0084e5e0	mov w0,#0x1
0084e5e4	ldp x20,x19,[sp, #0x40]
0084e5e8	ldr x21,[sp, #0x30]
0084e5ec	ldp x29,x30,[sp, #0x20]
0084e5f0	add sp,sp,#0x50
0084e5f4	ret
0084e61c	bl 0x00c2fec0

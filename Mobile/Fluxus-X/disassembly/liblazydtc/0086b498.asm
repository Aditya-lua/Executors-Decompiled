; FUN_0086b498 @ 0086b498
0086b498	sub sp,sp,#0x70
0086b49c	stp x29,x30,[sp, #0x30]
0086b4a0	stp x24,x23,[sp, #0x40]
0086b4a4	stp x22,x21,[sp, #0x50]
0086b4a8	stp x20,x19,[sp, #0x60]
0086b4ac	add x29,sp,#0x30
0086b4b0	mrs x23,tpidr_el0
0086b4b4	mov x19,x0
0086b4b8	ldr x8,[x23, #0x28]
0086b4bc	stur x8,[x29, #-0x8]
0086b4c0	ldr w8,[x0, #0x90]
0086b4c4	cmp w8,#0x28
0086b4c8	b.ne 0x0086b50c
0086b4cc	ldur x21,[x19, #0x94]
0086b4d0	mov x0,x19
0086b4d4	stur w8,[x29, #-0x14]
0086b4d8	stur x21,[x29, #-0x10]
0086b4dc	bl 0x00858f2c
0086b4e0	mov x0,x19
0086b4e4	mov w1,wzr
0086b4e8	bl 0x0086060c
0086b4ec	ldr w22,[x19, #0x90]
0086b4f0	mov x20,x0
0086b4f4	cmp w22,#0x29
0086b4f8	b.ne 0x0086b540
0086b4fc	ldur x24,[x19, #0x9c]
0086b500	mov x0,x19
0086b504	bl 0x00858f2c
0086b508	b 0x0086b564
0086b50c	ldr x8,[x23, #0x28]
0086b510	ldur x9,[x29, #-0x8]
0086b514	cmp x8,x9
0086b518	b.ne 0x0086b5f4
0086b51c	adrp x1,0x2d4000
0086b520	add x1,x1,#0xdc3
0086b524	mov x0,x19
0086b528	ldp x20,x19,[sp, #0x60]
0086b52c	ldp x22,x21,[sp, #0x50]
0086b530	ldp x24,x23,[sp, #0x40]
0086b534	ldp x29,x30,[sp, #0x30]
0086b538	add sp,sp,#0x70
0086b53c	b 0x00861de4
0086b540	cmp w22,#0x3d
0086b544	adrp x8,0x2ba000
0086b548	add x8,x8,#0xe6a
0086b54c	csel x3,x8,xzr,eq
0086b550	sub x2,x29,#0x14
0086b554	mov x0,x19
0086b558	mov w1,#0x29
0086b55c	bl 0x0086b5f8
0086b560	ldr x24,[x19, #0xb8]
0086b564	ldr x0,[x19, #0xe8]
0086b568	mov w1,#0x28
0086b56c	stp x21,x24,[sp, #0x8]
0086b570	bl 0x0084e938
0086b574	add x1,sp,#0x8
0086b578	mov x2,x20
0086b57c	mov x21,x0
0086b580	bl 0x0084eb28
0086b584	ldrb w8,[x19, #0x68]
0086b588	cmp w8,#0x1
0086b58c	b.ne 0x0086b5c8
0086b590	ldr x8,[x19, #0xb0]
0086b594	ldr x0,[x19, #0xe8]
0086b598	cmp w22,#0x29
0086b59c	mov w1,#0xc
0086b5a0	csinv x20,x8,xzr,eq
0086b5a4	bl 0x0084e938
0086b5a8	mov x1,x20
0086b5ac	mov x22,x0
0086b5b0	bl 0x00851dac
0086b5b4	add x0,x19,#0x4b0
0086b5b8	add x1,sp,#0x8
0086b5bc	str x21,[sp, #0x8]
0086b5c0	bl 0x00860fa0
0086b5c4	str x22,[x0]
0086b5c8	ldr x8,[x23, #0x28]
0086b5cc	ldur x9,[x29, #-0x8]
0086b5d0	cmp x8,x9
0086b5d4	b.ne 0x0086b5f4
0086b5d8	mov x0,x21
0086b5dc	ldp x20,x19,[sp, #0x60]
0086b5e0	ldp x22,x21,[sp, #0x50]
0086b5e4	ldp x24,x23,[sp, #0x40]
0086b5e8	ldp x29,x30,[sp, #0x30]
0086b5ec	add sp,sp,#0x70
0086b5f0	ret
0086b5f4	bl 0x00c2fec0

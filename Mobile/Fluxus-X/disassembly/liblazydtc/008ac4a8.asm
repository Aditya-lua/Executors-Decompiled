; FUN_008ac4a8 @ 008ac4a8
008ac4a8	sub sp,sp,#0x40
008ac4ac	stp x29,x30,[sp, #0x10]
008ac4b0	str x21,[sp, #0x20]
008ac4b4	stp x20,x19,[sp, #0x30]
008ac4b8	add x29,sp,#0x10
008ac4bc	mrs x21,tpidr_el0
008ac4c0	mov x19,x0
008ac4c4	ldr x8,[x21, #0x28]
008ac4c8	str x8,[sp, #0x8]
008ac4cc	cbz x1,0x008ac50c
008ac4d0	mov x0,x1
008ac4d4	mov x20,x1
008ac4d8	bl 0x00c2ff50
008ac4dc	ldr x8,[x21, #0x28]
008ac4e0	ldr x9,[sp, #0x8]
008ac4e4	cmp x8,x9
008ac4e8	b.ne 0x008ac5e0
008ac4ec	mov x2,x0
008ac4f0	mov x0,x19
008ac4f4	mov x1,x20
008ac4f8	ldp x20,x19,[sp, #0x30]
008ac4fc	ldr x21,[sp, #0x20]
008ac500	ldp x29,x30,[sp, #0x10]
008ac504	add sp,sp,#0x40
008ac508	b 0x008ac34c
008ac50c	ldr x9,[x19, #0x50]
008ac510	ldr x8,[x19, #0x68]
008ac514	ldr x10,[x9, #0x18]
008ac518	add x11,x8,#0x10
008ac51c	cmp x11,x10
008ac520	b.ls 0x008ac588
008ac524	ldr x11,[x19, #0x70]
008ac528	mov w12,#0xf3f0
008ac52c	movk w12,#0x1, LSL #16
008ac530	sub x11,x8,x11
008ac534	cmp x11,x12
008ac538	b.gt 0x008ac5b8
008ac53c	ldr x11,[x19, #0x48]
008ac540	sub x11,x11,x8
008ac544	cmp x11,#0x10
008ac548	b.gt 0x008ac578
008ac54c	mov w8,#0x1
008ac550	nop
008ac554	adr x1,0x8aa604
008ac558	add x2,sp,#0x4
008ac55c	mov x0,x19
008ac560	str w8,[sp, #0x4]
008ac564	bl 0x008b3edc
008ac568	cbnz w0,0x008ac5b8
008ac56c	ldr x9,[x19, #0x50]
008ac570	ldr x8,[x19, #0x68]
008ac574	ldr x10,[x9, #0x18]
008ac578	add x11,x8,#0x10
008ac57c	cmp x10,x11
008ac580	b.cs 0x008ac588
008ac584	str x11,[x9, #0x18]
008ac588	str wzr,[x8, #0xc]
008ac58c	add x8,x8,#0x10
008ac590	str x8,[x19, #0x68]
008ac594	ldr x8,[x21, #0x28]
008ac598	ldr x9,[sp, #0x8]
008ac59c	cmp x8,x9
008ac5a0	b.ne 0x008ac5e0
008ac5a4	ldp x20,x19,[sp, #0x30]
008ac5a8	ldr x21,[sp, #0x20]
008ac5ac	ldp x29,x30,[sp, #0x10]
008ac5b0	add sp,sp,#0x40
008ac5b4	ret
008ac5b8	adrp x1,0x2b6000
008ac5bc	add x1,x1,#0xc71
008ac5c0	mov x0,x19
008ac5c4	bl 0x008b9568
008ac5c8	ldr x8,[x21, #0x28]
008ac5cc	ldr x9,[sp, #0x8]
008ac5d0	cmp x8,x9
008ac5d4	b.ne 0x008ac5e0
008ac5d8	mov x0,x19
008ac5dc	bl 0x008aa5f4
008ac5e0	bl 0x00c2fec0

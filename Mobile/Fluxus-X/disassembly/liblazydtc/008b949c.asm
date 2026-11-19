; FUN_008b949c @ 008b949c
008b949c	stp x29,x30,[sp, #-0x30]!
008b94a0	stp x28,x21,[sp, #0x10]
008b94a4	stp x20,x19,[sp, #0x20]
008b94a8	mov x29,sp
008b94ac	sub sp,sp,#0x230
008b94b0	mrs x20,tpidr_el0
008b94b4	mov x8,x1
008b94b8	mov x19,x0
008b94bc	ldr x9,[x20, #0x28]
008b94c0	add x0,sp,#0x28
008b94c4	mov x3,sp
008b94c8	mov w1,#0x200
008b94cc	stur x9,[x29, #-0x8]
008b94d0	ldp q0,q1,[x2]
008b94d4	mov x2,x8
008b94d8	stp q0,q1,[sp]
008b94dc	bl 0x00c30740
008b94e0	ldr x21,[x19, #0x68]
008b94e4	add x0,sp,#0x28
008b94e8	mov w1,#0x200
008b94ec	bl 0x00c30370
008b94f0	mov x2,x0
008b94f4	add x1,sp,#0x28
008b94f8	mov x0,x19
008b94fc	bl 0x008b9ff8
008b9500	str x0,[x21]
008b9504	mov w9,#0x5
008b9508	ldr x10,[x19, #0x48]
008b950c	ldr x8,[x19, #0x68]
008b9510	str w9,[x21, #0xc]
008b9514	sub x10,x10,x8
008b9518	cmp x10,#0x10
008b951c	b.gt 0x008b9530
008b9520	mov x0,x19
008b9524	mov w1,#0x1
008b9528	bl 0x008b41e4
008b952c	ldr x8,[x19, #0x68]
008b9530	add x9,x8,#0x10
008b9534	str x9,[x19, #0x68]
008b9538	ldr x8,[x8]
008b953c	ldr x9,[x20, #0x28]
008b9540	ldur x10,[x29, #-0x8]
008b9544	cmp x9,x10
008b9548	b.ne 0x008b9564
008b954c	add x0,x8,#0x18
008b9550	add sp,sp,#0x230
008b9554	ldp x20,x19,[sp, #0x20]
008b9558	ldp x28,x21,[sp, #0x10]
008b955c	ldp x29,x30,[sp], #0x30
008b9560	ret
008b9564	bl 0x00c2fec0

; FUN_008aa40c @ 008aa40c
008aa40c	sub sp,sp,#0x50
008aa410	stp x29,x30,[sp, #0x20]
008aa414	str x21,[sp, #0x30]
008aa418	stp x20,x19,[sp, #0x40]
008aa41c	add x29,sp,#0x20
008aa420	mrs x20,tpidr_el0
008aa424	ldr x8,[x20, #0x28]
008aa428	stur x8,[x29, #-0x8]
008aa42c	ldr x9,[x0, #0x50]
008aa430	ldr x8,[x0, #0x68]
008aa434	ldr x10,[x9, #0x18]
008aa438	add x11,x8,#0x10
008aa43c	cmp x11,x10
008aa440	b.ls 0x008aa4bc
008aa444	ldr x11,[x0, #0x70]
008aa448	mov w12,#0xf3f0
008aa44c	movk w12,#0x1, LSL #16
008aa450	sub x11,x8,x11
008aa454	cmp x11,x12
008aa458	b.gt 0x008aa4f4
008aa45c	ldr x11,[x0, #0x48]
008aa460	sub x11,x11,x8
008aa464	cmp x11,#0x10
008aa468	b.gt 0x008aa4ac
008aa46c	mov w8,#0x1
008aa470	sub x2,x29,#0xc
008aa474	mov x21,x1
008aa478	stur w8,[x29, #-0xc]
008aa47c	nop
008aa480	adr x8,0x8aa604
008aa484	mov x1,x8
008aa488	mov x19,x0
008aa48c	bl 0x008b3edc
008aa490	mov w8,w0
008aa494	mov x0,x19
008aa498	cbnz w8,0x008aa4f4
008aa49c	ldr x9,[x0, #0x50]
008aa4a0	ldr x8,[x0, #0x68]
008aa4a4	mov x1,x21
008aa4a8	ldr x10,[x9, #0x18]
008aa4ac	add x11,x8,#0x10
008aa4b0	cmp x10,x11
008aa4b4	b.cs 0x008aa4bc
008aa4b8	str x11,[x9, #0x18]
008aa4bc	ldr q0,[x1]
008aa4c0	str q0,[x8]
008aa4c4	ldr x8,[x0, #0x68]
008aa4c8	add x8,x8,#0x10
008aa4cc	str x8,[x0, #0x68]
008aa4d0	ldr x8,[x20, #0x28]
008aa4d4	ldur x9,[x29, #-0x8]
008aa4d8	cmp x8,x9
008aa4dc	b.ne 0x008aa51c
008aa4e0	ldp x20,x19,[sp, #0x40]
008aa4e4	ldr x21,[sp, #0x30]
008aa4e8	ldp x29,x30,[sp, #0x20]
008aa4ec	add sp,sp,#0x50
008aa4f0	ret
008aa4f4	adrp x1,0x2b6000
008aa4f8	add x1,x1,#0xc71
008aa4fc	str x0,[sp, #0x8]
008aa500	bl 0x008b9568
008aa504	ldr x8,[x20, #0x28]
008aa508	ldur x9,[x29, #-0x8]
008aa50c	cmp x8,x9
008aa510	b.ne 0x008aa51c
008aa514	ldr x0,[sp, #0x8]
008aa518	bl 0x008aa5f4
008aa51c	bl 0x00c2fec0

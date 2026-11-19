; FUN_008ac964 @ 008ac964
008ac964	sub sp,sp,#0x50
008ac968	stp x29,x30,[sp, #0x20]
008ac96c	str x21,[sp, #0x30]
008ac970	stp x20,x19,[sp, #0x40]
008ac974	add x29,sp,#0x20
008ac978	mrs x20,tpidr_el0
008ac97c	ldr x8,[x20, #0x28]
008ac980	stur x8,[x29, #-0x8]
008ac984	ldr x9,[x0, #0x50]
008ac988	ldr x8,[x0, #0x68]
008ac98c	ldr x10,[x9, #0x18]
008ac990	add x11,x8,#0x10
008ac994	cmp x11,x10
008ac998	b.ls 0x008aca14
008ac99c	ldr x11,[x0, #0x70]
008ac9a0	mov w12,#0xf3f0
008ac9a4	movk w12,#0x1, LSL #16
008ac9a8	sub x11,x8,x11
008ac9ac	cmp x11,x12
008ac9b0	b.gt 0x008aca58
008ac9b4	ldr x11,[x0, #0x48]
008ac9b8	sub x11,x11,x8
008ac9bc	cmp x11,#0x10
008ac9c0	b.gt 0x008aca04
008ac9c4	mov w8,#0x1
008ac9c8	sub x2,x29,#0xc
008ac9cc	mov w21,w1
008ac9d0	stur w8,[x29, #-0xc]
008ac9d4	nop
008ac9d8	adr x8,0x8aa604
008ac9dc	mov x1,x8
008ac9e0	mov x19,x0
008ac9e4	bl 0x008b3edc
008ac9e8	mov w8,w0
008ac9ec	mov x0,x19
008ac9f0	cbnz w8,0x008aca58
008ac9f4	ldr x9,[x0, #0x50]
008ac9f8	ldr x8,[x0, #0x68]
008ac9fc	mov w1,w21
008aca00	ldr x10,[x9, #0x18]
008aca04	add x11,x8,#0x10
008aca08	cmp x10,x11
008aca0c	b.cs 0x008aca14
008aca10	str x11,[x9, #0x18]
008aca14	cmp w1,#0x0
008aca18	mov w10,#0x1
008aca1c	cset w9,ne
008aca20	str w10,[x8, #0xc]
008aca24	str w9,[x8]
008aca28	ldr x9,[x0, #0x68]
008aca2c	add x8,x9,#0x10
008aca30	str x8,[x0, #0x68]
008aca34	ldr x8,[x20, #0x28]
008aca38	ldur x9,[x29, #-0x8]
008aca3c	cmp x8,x9
008aca40	b.ne 0x008aca80
008aca44	ldp x20,x19,[sp, #0x40]
008aca48	ldr x21,[sp, #0x30]
008aca4c	ldp x29,x30,[sp, #0x20]
008aca50	add sp,sp,#0x50
008aca54	ret
008aca58	adrp x1,0x2b6000
008aca5c	add x1,x1,#0xc71
008aca60	str x0,[sp, #0x8]
008aca64	bl 0x008b9568
008aca68	ldr x8,[x20, #0x28]
008aca6c	ldur x9,[x29, #-0x8]
008aca70	cmp x8,x9
008aca74	b.ne 0x008aca80
008aca78	ldr x0,[sp, #0x8]
008aca7c	bl 0x008aa5f4
008aca80	bl 0x00c2fec0

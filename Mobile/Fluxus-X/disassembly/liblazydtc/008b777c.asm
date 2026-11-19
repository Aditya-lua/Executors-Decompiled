; FUN_008b777c @ 008b777c
008b777c	stp x29,x30,[sp, #-0x40]!
008b7780	stp x24,x23,[sp, #0x10]
008b7784	stp x22,x21,[sp, #0x20]
008b7788	stp x20,x19,[sp, #0x30]
008b778c	mov x29,sp
008b7790	sub x8,x1,#0x1
008b7794	ldr x24,[x0, #0x60]
008b7798	mov x19,x1
008b779c	mov x20,x0
008b77a0	cmp x8,#0x3ff
008b77a4	mov w21,w2
008b77a8	b.hi 0x008b7814
008b77ac	adrp x8,0xd1f000
008b77b0	add x8,x8,#0x638
008b77b4	add x8,x8,x19
008b77b8	ldrsb x22,[x8, #0xa0]
008b77bc	tbnz x22,#0x3f,0x008b7814
008b77c0	add x23,x24,#0x70
008b77c4	ldr x0,[x23, x22, LSL #0x3]
008b77c8	cbnz x0,0x008b77e0
008b77cc	mov x0,x20
008b77d0	mov x1,x23
008b77d4	mov w2,w22
008b77d8	bl 0x008b8b7c
008b77dc	cbz x0,0x008b7890
008b77e0	ldr w9,[x0, #0x30]
008b77e4	tbnz w9,#0x1f,0x008b7830
008b77e8	ldr w10,[x0, #0x24]
008b77ec	ldr w11,[x0, #0x34]
008b77f0	add x8,x0,x9
008b77f4	ldr x12,[x0, #0x28]
008b77f8	str x0,[x8, #0x40]!
008b77fc	sub w9,w9,w10
008b7800	add w10,w11,#0x1
008b7804	stp w9,w10,[x0, #0x30]
008b7808	cbnz x12,0x008b7868
008b780c	tbnz w9,#0x1f,0x008b7854
008b7810	b 0x008b7868
008b7814	ldp x8,x0,[x24, #0x48]
008b7818	mov x1,xzr
008b781c	mov x2,xzr
008b7820	mov x3,x19
008b7824	blr x8
008b7828	cbnz x0,0x008b786c
008b782c	b 0x008b7890
008b7830	ldr x8,[x0, #0x28]
008b7834	ldr x9,[x8]
008b7838	str x9,[x0, #0x28]
008b783c	ldr w9,[x0, #0x34]
008b7840	str x0,[x8]
008b7844	ldr x10,[x0, #0x28]
008b7848	add w9,w9,#0x1
008b784c	str w9,[x0, #0x34]
008b7850	cbnz x10,0x008b7868
008b7854	ldr x9,[x0, #0x18]
008b7858	str x9,[x23, x22, LSL #0x3]
008b785c	cbz x9,0x008b7864
008b7860	str xzr,[x9, #0x10]
008b7864	str xzr,[x0, #0x18]
008b7868	add x0,x8,#0x8
008b786c	add x9,x24,w21, UXTB  #0x3
008b7870	ldr x8,[x24, #0x10]
008b7874	ldr x10,[x9, #0x3848]
008b7878	add x11,x8,x19
008b787c	ldr x8,[x24, #0x658]
008b7880	str x11,[x24, #0x10]
008b7884	add x10,x10,x19
008b7888	str x10,[x9, #0x3848]
008b788c	cbnz x8,0x008b78a4
008b7890	ldp x20,x19,[sp, #0x30]
008b7894	ldp x22,x21,[sp, #0x20]
008b7898	ldp x24,x23,[sp, #0x10]
008b789c	ldp x29,x30,[sp], #0x40
008b78a0	ret
008b78a4	mov x22,x0
008b78a8	mov x0,x20
008b78ac	mov x2,xzr
008b78b0	mov x1,x22
008b78b4	mov x3,x19
008b78b8	mov w4,w21
008b78bc	mov w5,#0x10
008b78c0	mov w6,wzr
008b78c4	blr x8
008b78c8	mov x0,x22
008b78cc	b 0x008b7890

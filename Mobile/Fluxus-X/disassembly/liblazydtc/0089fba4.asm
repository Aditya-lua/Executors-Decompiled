; FUN_0089fba4 @ 0089fba4
0089fba4	stp x29,x30,[sp, #-0x30]!
0089fba8	stp x22,x21,[sp, #0x10]
0089fbac	stp x20,x19,[sp, #0x20]
0089fbb0	mov x29,sp
0089fbb4	ldp x20,x21,[x0, #0x8]
0089fbb8	mov x19,x0
0089fbbc	cmp x20,x21
0089fbc0	b.eq 0x0089fc1c
0089fbc4	mov w22,#0x40
0089fbc8	b 0x0089fbe0
0089fbcc	ldur x0,[x21, #-0x20]
0089fbd0	bl 0x00c301d0
0089fbd4	ldr x21,[x19, #0x10]
0089fbd8	cmp x20,x21
0089fbdc	b.eq 0x0089fc1c
0089fbe0	mov x8,x21
0089fbe4	ldr x0,[x8, #-0x38]!
0089fbe8	str x8,[x19, #0x10]
0089fbec	cbz x0,0x0089fbcc
0089fbf0	bl 0x00c301d0
0089fbf4	ldur x0,[x21, #-0x20]
0089fbf8	stur xzr,[x21, #-0x38]
0089fbfc	bl 0x00c301d0
0089fc00	mov x0,xzr
0089fc04	stp xzr,xzr,[x21, #-0x30]
0089fc08	stur xzr,[x21, #-0x20]
0089fc0c	bl 0x00c301d0
0089fc10	stur xzr,[x21, #-0x18]
0089fc14	sturb w22,[x21, #-0x8]
0089fc18	b 0x0089fbcc
0089fc1c	ldr x0,[x19]
0089fc20	cbz x0,0x0089fc3c
0089fc24	ldr x8,[x19, #0x18]
0089fc28	sub x1,x8,x0
0089fc2c	ldp x20,x19,[sp, #0x20]
0089fc30	ldp x22,x21,[sp, #0x10]
0089fc34	ldp x29,x30,[sp], #0x30
0089fc38	b 0x00c2fe80
0089fc3c	ldp x20,x19,[sp, #0x20]
0089fc40	ldp x22,x21,[sp, #0x10]
0089fc44	ldp x29,x30,[sp], #0x30
0089fc48	ret

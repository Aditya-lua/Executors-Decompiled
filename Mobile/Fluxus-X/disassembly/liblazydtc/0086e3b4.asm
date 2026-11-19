; FUN_0086e3b4 @ 0086e3b4
0086e3b4	sub sp,sp,#0x60
0086e3b8	stp x29,x30,[sp, #0x30]
0086e3bc	str x21,[sp, #0x40]
0086e3c0	stp x20,x19,[sp, #0x50]
0086e3c4	add x29,sp,#0x30
0086e3c8	mrs x21,tpidr_el0
0086e3cc	mov w20,w1
0086e3d0	mov x19,x0
0086e3d4	ldr x8,[x21, #0x28]
0086e3d8	stur x8,[x29, #-0x8]
0086e3dc	bl 0x00859330
0086e3e0	add x8,sp,#0x8
0086e3e4	add x0,x19,#0x70
0086e3e8	bl 0x00853d20
0086e3ec	ldr w8,[sp, #0x8]
0086e3f0	cmp w8,w20
0086e3f4	b.ne 0x0086e408
0086e3f8	mov x0,x19
0086e3fc	bl 0x00858f2c
0086e400	mov x0,x19
0086e404	bl 0x00858f2c
0086e408	ldr x8,[x21, #0x28]
0086e40c	ldur x9,[x29, #-0x8]
0086e410	cmp x8,x9
0086e414	b.ne 0x0086e430
0086e418	mov w0,wzr
0086e41c	ldp x20,x19,[sp, #0x50]
0086e420	ldr x21,[sp, #0x40]
0086e424	ldp x29,x30,[sp, #0x30]
0086e428	add sp,sp,#0x60
0086e42c	ret
0086e430	bl 0x00c2fec0

; FUN_008a8da8 @ 008a8da8
008a8da8	sub sp,sp,#0x90
008a8dac	stp x29,x30,[sp, #0x60]
008a8db0	str x21,[sp, #0x70]
008a8db4	stp x20,x19,[sp, #0x80]
008a8db8	add x29,sp,#0x60
008a8dbc	mrs x20,tpidr_el0
008a8dc0	adrp x19,0xc4c000
008a8dc4	add x19,x19,#0x6f0
008a8dc8	ldr x8,[x20, #0x28]
008a8dcc	stur x8,[x29, #-0x8]
008a8dd0	adrp x8,0x29a000
008a8dd4	ldr d0,[x8, #0x678]
008a8dd8	mov x8,sp
008a8ddc	stp x19,x0,[sp]
008a8de0	add x21,x8,#0x38
008a8de4	ldr x8,[x2]
008a8de8	stp x1,xzr,[sp, #0x10]
008a8dec	str d0,[sp, #0x30]
008a8df0	stp xzr,x21,[sp, #0x20]
008a8df4	ldr x8,[x8]
008a8df8	mov x1,sp
008a8dfc	mov x0,x2
008a8e00	blr x8
008a8e04	ldr w8,[sp, #0x30]
008a8e08	str x19,[sp]
008a8e0c	cbz w8,0x008a8e14
008a8e10	str wzr,[sp, #0x30]
008a8e14	ldr x0,[sp, #0x28]
008a8e18	cmp x0,x21
008a8e1c	b.eq 0x008a8e24
008a8e20	bl 0x00c301d0
008a8e24	ldr x8,[x20, #0x28]
008a8e28	ldur x9,[x29, #-0x8]
008a8e2c	cmp x8,x9
008a8e30	b.ne 0x008a8e88
008a8e34	ldp x20,x19,[sp, #0x80]
008a8e38	ldr x21,[sp, #0x70]
008a8e3c	ldp x29,x30,[sp, #0x60]
008a8e40	add sp,sp,#0x90
008a8e44	ret
008a8e88	bl 0x00c2fec0

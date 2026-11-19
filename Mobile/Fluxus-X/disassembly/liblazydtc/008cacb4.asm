; FUN_008cacb4 @ 008cacb4
008cacb4	sub sp,sp,#0x30
008cacb8	stp x29,x30,[sp, #0x10]
008cacbc	stp x20,x19,[sp, #0x20]
008cacc0	add x29,sp,#0x10
008cacc4	mrs x19,tpidr_el0
008cacc8	ldr x8,[x19, #0x28]
008caccc	str x8,[sp, #0x8]
008cacd0	ldr w8,[x0, #0xc]
008cacd4	cmp w8,#0x3
008cacd8	b.eq 0x008cad1c
008cacdc	cmp w8,#0x5
008cace0	b.ne 0x008cad18
008cace4	ldr x8,[x0]
008cace8	mov x20,x1
008cacec	mov x1,sp
008cacf0	add x0,x8,#0x18
008cacf4	bl 0x008b93c8
008cacf8	cbz w0,0x008cad18
008cacfc	ldr d0,[sp]
008cad00	mov x8,x20
008cad04	mov w9,#0x3
008cad08	mov x0,x20
008cad0c	str w9,[x8, #0xc]
008cad10	str d0,[x8]
008cad14	b 0x008cad1c
008cad18	mov x0,xzr
008cad1c	ldr x8,[x19, #0x28]
008cad20	ldr x9,[sp, #0x8]
008cad24	cmp x8,x9
008cad28	b.ne 0x008cad3c
008cad2c	ldp x20,x19,[sp, #0x20]
008cad30	ldp x29,x30,[sp, #0x10]
008cad34	add sp,sp,#0x30
008cad38	ret
008cad3c	bl 0x00c2fec0

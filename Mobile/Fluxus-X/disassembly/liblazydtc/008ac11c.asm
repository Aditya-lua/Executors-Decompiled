; FUN_008ac11c @ 008ac11c
008ac11c	sub sp,sp,#0x50
008ac120	str d8,[sp, #0x20]
008ac124	stp x29,x30,[sp, #0x30]
008ac128	stp x20,x19,[sp, #0x40]
008ac12c	add x29,sp,#0x30
008ac130	mrs x20,tpidr_el0
008ac134	ldr x8,[x20, #0x28]
008ac138	str x8,[sp, #0x18]
008ac13c	ldr x9,[x0, #0x50]
008ac140	ldr x8,[x0, #0x68]
008ac144	ldr x10,[x9, #0x18]
008ac148	add x11,x8,#0x10
008ac14c	cmp x11,x10
008ac150	b.ls 0x008ac1c8
008ac154	ldr x11,[x0, #0x70]
008ac158	mov w12,#0xf3f0
008ac15c	movk w12,#0x1, LSL #16
008ac160	sub x11,x8,x11
008ac164	cmp x11,x12
008ac168	b.gt 0x008ac204
008ac16c	ldr x11,[x0, #0x48]
008ac170	sub x11,x11,x8
008ac174	cmp x11,#0x10
008ac178	b.gt 0x008ac1b8
008ac17c	mov w8,#0x1
008ac180	nop
008ac184	adr x1,0x8aa604
008ac188	add x2,sp,#0x14
008ac18c	str w8,[sp, #0x14]
008ac190	mov x19,x0
008ac194	fmov d8,d0
008ac198	bl 0x008b3edc
008ac19c	mov w8,w0
008ac1a0	mov x0,x19
008ac1a4	cbnz w8,0x008ac204
008ac1a8	fmov d0,d8
008ac1ac	ldr x9,[x0, #0x50]
008ac1b0	ldr x8,[x0, #0x68]
008ac1b4	ldr x10,[x9, #0x18]
008ac1b8	add x11,x8,#0x10
008ac1bc	cmp x10,x11
008ac1c0	b.cs 0x008ac1c8
008ac1c4	str x11,[x9, #0x18]
008ac1c8	str d0,[x8]
008ac1cc	mov w10,#0x3
008ac1d0	ldr x9,[x0, #0x68]
008ac1d4	str w10,[x8, #0xc]
008ac1d8	add x8,x9,#0x10
008ac1dc	str x8,[x0, #0x68]
008ac1e0	ldr x8,[x20, #0x28]
008ac1e4	ldr x9,[sp, #0x18]
008ac1e8	cmp x8,x9
008ac1ec	b.ne 0x008ac22c
008ac1f0	ldp x20,x19,[sp, #0x40]
008ac1f4	ldr d8,[sp, #0x20]
008ac1f8	ldp x29,x30,[sp, #0x30]
008ac1fc	add sp,sp,#0x50
008ac200	ret
008ac204	adrp x1,0x2b6000
008ac208	add x1,x1,#0xc71
008ac20c	str x0,[sp, #0x8]
008ac210	bl 0x008b9568
008ac214	ldr x8,[x20, #0x28]
008ac218	ldr x9,[sp, #0x18]
008ac21c	cmp x8,x9
008ac220	b.ne 0x008ac22c
008ac224	ldr x0,[sp, #0x8]
008ac228	bl 0x008aa5f4
008ac22c	bl 0x00c2fec0

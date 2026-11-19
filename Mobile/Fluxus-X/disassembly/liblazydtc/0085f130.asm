; FUN_0085f130 @ 0085f130
0085f130	sub sp,sp,#0x60
0085f134	stp x29,x30,[sp, #0x30]
0085f138	stp x22,x21,[sp, #0x40]
0085f13c	stp x20,x19,[sp, #0x50]
0085f140	add x29,sp,#0x30
0085f144	mrs x22,tpidr_el0
0085f148	mov x19,x1
0085f14c	ldr x8,[x22, #0x28]
0085f150	stur x8,[x29, #-0x8]
0085f154	ldr x8,[x0, #0x160]
0085f158	ldur w8,[x8, #-0x4]
0085f15c	cbz w8,0x0085f17c
0085f160	ldr x0,[x0, #0xe8]
0085f164	mov w1,#0x20
0085f168	bl 0x0084e938
0085f16c	mov x1,x19
0085f170	mov x20,x0
0085f174	bl 0x0084fcc4
0085f178	b 0x0085f1d8
0085f17c	ldr x8,[x0, #0xe8]
0085f180	mov x20,x0
0085f184	mov w1,#0x20
0085f188	stp xzr,xzr,[sp, #0x18]
0085f18c	mov x0,x8
0085f190	bl 0x0084e938
0085f194	mov x1,x19
0085f198	mov x21,x0
0085f19c	bl 0x0084fcc4
0085f1a0	ldr x0,[x20, #0xe8]
0085f1a4	mov w1,#0x8
0085f1a8	bl 0x0084e938
0085f1ac	mov w8,#0x1
0085f1b0	str x21,[x0]
0085f1b4	adrp x4,0x2d6000
0085f1b8	add x4,x4,#0xfab
0085f1bc	stp x0,x8,[sp, #0x8]
0085f1c0	add x2,sp,#0x18
0085f1c4	add x3,sp,#0x8
0085f1c8	mov x0,x20
0085f1cc	mov x1,x19
0085f1d0	bl 0x0085e984
0085f1d4	mov x20,x0
0085f1d8	ldr x8,[x22, #0x28]
0085f1dc	ldur x9,[x29, #-0x8]
0085f1e0	cmp x8,x9
0085f1e4	b.ne 0x0085f200
0085f1e8	mov x0,x20
0085f1ec	ldp x20,x19,[sp, #0x50]
0085f1f0	ldp x22,x21,[sp, #0x40]
0085f1f4	ldp x29,x30,[sp, #0x30]
0085f1f8	add sp,sp,#0x60
0085f1fc	ret
0085f200	bl 0x00c2fec0

; std::__ndk1::function<bool(long,long,long,long,long)>::swap @ 008f394c
008f394c	sub sp,sp,#0x60
008f3950	str x21,[sp, #0x30]
008f3954	stp x20,x19,[sp, #0x40]
008f3958	stp x29,x30,[sp, #0x50]
008f395c	add x29,sp,#0x50
008f3960	mrs x21,tpidr_el0
008f3964	ldr x8,[x21, #0x28]
008f3968	mov x19,x1
008f396c	mov x20,x0
008f3970	cmp x1,x0
008f3974	str x8,[sp, #0x28]
008f3978	b.eq 0x008f3a84
008f397c	ldr x0,[x20, #0x20]
008f3980	cmp x0,x20
008f3984	b.eq 0x008f39a0
008f3988	ldr x8,[x19, #0x20]
008f398c	cmp x19,x8
008f3990	b.eq 0x008f39d8
008f3994	str x8,[x20, #0x20]
008f3998	str x0,[x19, #0x20]
008f399c	b 0x008f3a84
008f39a0	ldr x8,[x19, #0x20]
008f39a4	cmp x8,x19
008f39a8	b.eq 0x008f3a0c
008f39ac	ldr x8,[x0]
008f39b0	ldr x8,[x8, #0x18]
008f39b4	mov x1,x19
008f39b8	blr x8
008f39bc	ldr x0,[x20, #0x20]
008f39c0	ldr x8,[x0]
008f39c4	ldr x8,[x8, #0x20]
008f39c8	blr x8
008f39cc	ldr x8,[x19, #0x20]
008f39d0	str x8,[x20, #0x20]
008f39d4	b 0x008f3a80
008f39d8	ldr x9,[x8]
008f39dc	ldr x9,[x9, #0x18]
008f39e0	mov x0,x8
008f39e4	mov x1,x20
008f39e8	blr x9
008f39ec	ldr x0,[x19, #0x20]
008f39f0	ldr x8,[x0]
008f39f4	ldr x8,[x8, #0x20]
008f39f8	blr x8
008f39fc	ldr x8,[x20, #0x20]
008f3a00	str x8,[x19, #0x20]
008f3a04	str x20,[x20, #0x20]
008f3a08	b 0x008f3a84
008f3a0c	ldr x8,[x0]
008f3a10	ldr x8,[x8, #0x18]
008f3a14	mov x1,sp
008f3a18	blr x8
008f3a1c	ldr x0,[x20, #0x20]
008f3a20	ldr x8,[x0]
008f3a24	ldr x8,[x8, #0x20]
008f3a28	blr x8
008f3a2c	str xzr,[x20, #0x20]
008f3a30	ldr x0,[x19, #0x20]
008f3a34	ldr x8,[x0]
008f3a38	ldr x8,[x8, #0x18]
008f3a3c	mov x1,x20
008f3a40	blr x8
008f3a44	ldr x0,[x19, #0x20]
008f3a48	ldr x8,[x0]
008f3a4c	ldr x8,[x8, #0x20]
008f3a50	blr x8
008f3a54	str xzr,[x19, #0x20]
008f3a58	str x20,[x20, #0x20]
008f3a5c	ldr x8,[sp]
008f3a60	ldr x8,[x8, #0x18]
008f3a64	mov x0,sp
008f3a68	mov x1,x19
008f3a6c	blr x8
008f3a70	ldr x8,[sp]
008f3a74	mov x0,sp
008f3a78	ldr x8,[x8, #0x20]
008f3a7c	blr x8
008f3a80	str x19,[x19, #0x20]
008f3a84	ldr x8,[x21, #0x28]
008f3a88	ldr x9,[sp, #0x28]
008f3a8c	cmp x8,x9
008f3a90	b.ne 0x008f3aa8
008f3a94	ldp x29,x30,[sp, #0x50]
008f3a98	ldp x20,x19,[sp, #0x40]
008f3a9c	ldr x21,[sp, #0x30]
008f3aa0	add sp,sp,#0x60
008f3aa4	ret
008f3aa8	bl 0x00c2fec0

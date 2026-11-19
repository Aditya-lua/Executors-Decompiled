; FUN_00844994 @ 00844994
00844994	stp x29,x30,[sp, #-0x40]!
00844998	str x23,[sp, #0x10]
0084499c	stp x22,x21,[sp, #0x20]
008449a0	stp x20,x19,[sp, #0x30]
008449a4	mov x29,sp
008449a8	ldp x21,x23,[x0]
008449ac	mov x19,x1
008449b0	ldr x8,[x1, #0x8]
008449b4	mov x20,x0
008449b8	sub x9,x21,x23
008449bc	cmp x23,x21
008449c0	add x22,x8,x9
008449c4	b.eq 0x00844a80
008449c8	mov x8,x21
008449cc	mov x9,x22
008449d0	ldp q1,q0,[x8]
008449d4	stp xzr,xzr,[x9, #0x28]
008449d8	str xzr,[x9, #0x20]
008449dc	stp q1,q0,[x9]
008449e0	ldr q0,[x8, #0x20]
008449e4	str q0,[x9, #0x20]
008449e8	ldr x10,[x8, #0x30]
008449ec	str x10,[x9, #0x30]
008449f0	stp xzr,xzr,[x8, #0x20]
008449f4	str xzr,[x8, #0x30]
008449f8	stp xzr,xzr,[x9, #0x38]
008449fc	str xzr,[x9, #0x48]
00844a00	ldur q0,[x8, #0x38]
00844a04	stur q0,[x9, #0x38]
00844a08	ldr x10,[x8, #0x48]
00844a0c	str x10,[x9, #0x48]
00844a10	ldur x10,[x8, #0x55]
00844a14	ldr x11,[x8, #0x50]
00844a18	stp xzr,xzr,[x8, #0x38]
00844a1c	str xzr,[x8, #0x48]
00844a20	add x8,x8,#0x60
00844a24	stur x10,[x9, #0x55]
00844a28	cmp x8,x23
00844a2c	str x11,[x9, #0x50]
00844a30	add x9,x9,#0x60
00844a34	b.ne 0x008449d0
00844a38	b 0x00844a48
00844a3c	add x21,x21,#0x60
00844a40	cmp x21,x23
00844a44	b.eq 0x00844a7c
00844a48	ldr x0,[x21, #0x38]
00844a4c	cbz x0,0x00844a60
00844a50	ldr x8,[x21, #0x48]
00844a54	str x0,[x21, #0x40]
00844a58	sub x1,x8,x0
00844a5c	bl 0x00c2fe80
00844a60	ldr x0,[x21, #0x20]
00844a64	cbz x0,0x00844a3c
00844a68	ldr x8,[x21, #0x30]
00844a6c	str x0,[x21, #0x28]
00844a70	sub x1,x8,x0
00844a74	bl 0x00c2fe80
00844a78	b 0x00844a3c
00844a7c	ldr x21,[x20]
00844a80	str x22,[x19, #0x8]
00844a84	stp x22,x21,[x20]
00844a88	ldr x8,[x19, #0x10]
00844a8c	str x21,[x19, #0x8]
00844a90	ldr x9,[x20, #0x8]
00844a94	str x8,[x20, #0x8]
00844a98	ldr x8,[x19, #0x18]
00844a9c	str x9,[x19, #0x10]
00844aa0	ldr x9,[x20, #0x10]
00844aa4	str x8,[x20, #0x10]
00844aa8	ldr x8,[x19, #0x8]
00844aac	str x9,[x19, #0x18]
00844ab0	str x8,[x19]
00844ab4	ldp x20,x19,[sp, #0x30]
00844ab8	ldr x23,[sp, #0x10]
00844abc	ldp x22,x21,[sp, #0x20]
00844ac0	ldp x29,x30,[sp], #0x40
00844ac4	ret

; FUN_00a4fb3c @ 00a4fb3c
00a4fb3c	sub sp,sp,#0x80
00a4fb40	str x27,[sp, #0x20]
00a4fb44	stp x26,x25,[sp, #0x30]
00a4fb48	stp x24,x23,[sp, #0x40]
00a4fb4c	stp x22,x21,[sp, #0x50]
00a4fb50	stp x20,x19,[sp, #0x60]
00a4fb54	stp x29,x30,[sp, #0x70]
00a4fb58	add x29,sp,#0x70
00a4fb5c	mov x19,x2
00a4fb60	mov x23,x1
00a4fb64	mov x20,x0
00a4fb68	bl 0x00c3b390
00a4fb6c	mov x21,x0
00a4fb70	mov x0,x20
00a4fb74	bl 0x00c3b3a0
00a4fb78	mov x20,x0
00a4fb7c	mov x0,x21
00a4fb80	bl 0x00c3b3f0
00a4fb84	adrp x1,0x2a4000
00a4fb88	mov x22,x0
00a4fb8c	add x1,x1,#0x18
00a4fb90	mov x0,x23
00a4fb94	bl 0x00c36530
00a4fb98	cbz x0,0x00a4fbcc
00a4fb9c	add x1,sp,#0x8
00a4fba0	mov x2,xzr
00a4fba4	str xzr,[sp, #0x8]
00a4fba8	bl 0x00c3b720
00a4fbac	cbz w0,0x00a4fd20
00a4fbb0	ldr x0,[x19, #0x20]
00a4fbb4	adrp x1,0x2c5000
00a4fbb8	add x1,x1,#0x9ce
00a4fbbc	mov w2,#0x5f
00a4fbc0	bl 0x00c32310
00a4fbc4	ldr x8,[sp, #0x8]
00a4fbc8	str x8,[x19, #0x20]
00a4fbcc	adrp x1,0x2d5000
00a4fbd0	add x1,x1,#0xc93
00a4fbd4	mov x0,x23
00a4fbd8	bl 0x00c36530
00a4fbdc	cbz x0,0x00a4fd20
00a4fbe0	ldr w9,[x0, #0x8]
00a4fbe4	mov x8,x0
00a4fbe8	mov w0,wzr
00a4fbec	cmp w9,#0x5
00a4fbf0	b.ne 0x00a4fd20
00a4fbf4	ldr x0,[x19, #0x18]
00a4fbf8	ldp x24,x25,[x8, #0x10]
00a4fbfc	bl 0x00c325e0
00a4fc00	cmp w0,#0x1
00a4fc04	b.lt 0x00a4fc54
00a4fc08	mov w26,w0
00a4fc0c	mov w27,wzr
00a4fc10	ldr x0,[x19, #0x18]
00a4fc14	mov w1,w27
00a4fc18	bl 0x00c32610
00a4fc1c	mov x23,x0
00a4fc20	bl 0x00c36360
00a4fc24	cmp x0,x22
00a4fc28	b.ne 0x00a4fc48
00a4fc2c	mov x0,x23
00a4fc30	bl 0x00c3b740
00a4fc34	cbz w0,0x00a4fc48
00a4fc38	ldr x1,[x19, #0x20]
00a4fc3c	mov x0,x23
00a4fc40	bl 0x00c3b6d0
00a4fc44	cbnz w0,0x00a4fcb8
00a4fc48	add w27,w27,#0x1
00a4fc4c	cmp w27,w26
00a4fc50	b.lt 0x00a4fc10
00a4fc54	ldr x1,[x19, #0x20]
00a4fc58	ldp x0,x2,[x19]
00a4fc5c	bl 0x00c36340
00a4fc60	cbz x0,0x00a4fd10
00a4fc64	mov x23,x0
00a4fc68	bl 0x00c36360
00a4fc6c	cmp x0,x22
00a4fc70	b.eq 0x00a4fcc8
00a4fc74	stp x23,xzr,[sp, #0x8]
00a4fc78	ldr w8,[x19, #0x10]
00a4fc7c	mov w9,#0x87
00a4fc80	adrp x3,0xcb5000
00a4fc84	add x4,sp,#0x8
00a4fc88	cmp w8,#0x0
00a4fc8c	csel w8,w9,w8,eq
00a4fc90	str w8,[sp, #0x18]
00a4fc94	ldr x8,[x21, #0x78]
00a4fc98	ldr x3,[x3, #0x5b8]
00a4fc9c	mov x0,x20
00a4fca0	mov x1,x24
00a4fca4	mov x2,x25
00a4fca8	blr x8
00a4fcac	ldr x20,[sp, #0x10]
00a4fcb0	cbnz x20,0x00a4fce0
00a4fcb4	b 0x00a4fcfc
00a4fcb8	mov x0,x23
00a4fcbc	bl 0x00c3b6f0
00a4fcc0	cbz w0,0x00a4fd20
00a4fcc4	cbz x23,0x00a4fd10
00a4fcc8	mov x0,x23
00a4fccc	mov x1,x24
00a4fcd0	mov x2,x25
00a4fcd4	bl 0x00c3b750
00a4fcd8	mov x20,x0
00a4fcdc	cbz x20,0x00a4fcfc
00a4fce0	mov x0,x23
00a4fce4	mov x1,x20
00a4fce8	bl 0x00c3b760
00a4fcec	cbnz x0,0x00a4fd00
00a4fcf0	mov x0,x23
00a4fcf4	mov x1,x20
00a4fcf8	bl 0x00c3b730
00a4fcfc	mov x0,xzr
00a4fd00	ldr x8,[x19, #0x28]
00a4fd04	str x0,[x8]
00a4fd08	mov x0,x23
00a4fd0c	bl 0x00c36350
00a4fd10	ldr x8,[x19, #0x28]
00a4fd14	ldr x8,[x8]
00a4fd18	cmp x8,#0x0
00a4fd1c	cset w0,ne
00a4fd20	ldp x29,x30,[sp, #0x70]
00a4fd24	ldp x20,x19,[sp, #0x60]
00a4fd28	ldp x22,x21,[sp, #0x50]
00a4fd2c	ldp x24,x23,[sp, #0x40]
00a4fd30	ldp x26,x25,[sp, #0x30]
00a4fd34	ldr x27,[sp, #0x20]
00a4fd38	add sp,sp,#0x80
00a4fd3c	ret

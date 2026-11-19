; FUN_0090fc08 @ 0090fc08
0090fc08	sub sp,sp,#0xc0
0090fc0c	str x21,[sp, #0x90]
0090fc10	stp x20,x19,[sp, #0xa0]
0090fc14	stp x29,x30,[sp, #0xb0]
0090fc18	add x29,sp,#0xb0
0090fc1c	mrs x21,tpidr_el0
0090fc20	ldr x8,[x21, #0x28]
0090fc24	mov x19,x2
0090fc28	mov x20,x1
0090fc2c	stur x8,[x29, #-0x28]
0090fc30	ldr x8,[x0, #0xd0]
0090fc34	cbz x8,0x0090fc44
0090fc38	mov w1,#0x5
0090fc3c	mov w2,#0x2
0090fc40	bl 0x0093f628
0090fc44	cbz x19,0x0090fc68
0090fc48	ldr x8,[x20, #0x3a0]
0090fc4c	mov w9,#0x9
0090fc50	and x9,x8,x9
0090fc54	cmp x9,#0x1
0090fc58	b.ne 0x0090fc70
0090fc5c	ldrsw x4,[x20, #0x15c]
0090fc60	add x8,x20,#0xd8
0090fc64	b 0x0090fc84
0090fc68	mov x0,xzr
0090fc6c	b 0x0090fcc8
0090fc70	ldrsw x4,[x20, #0x560]
0090fc74	tbnz w8,#0x9,0x0090fc80
0090fc78	add x8,x20,#0x50
0090fc7c	b 0x0090fc84
0090fc80	add x8,x20,#0x80
0090fc84	ldr x5,[x8]
0090fc88	ldr w3,[x20, #0x568]
0090fc8c	adrp x2,0x2a3000
0090fc90	add x2,x2,#0x642
0090fc94	add x0,sp,#0x8
0090fc98	mov w1,#0x80
0090fc9c	bl 0x00c31b70
0090fca0	add x0,sp,#0x8
0090fca4	add x1,sp,#0x8
0090fca8	mov w2,#0x80
0090fcac	bl 0x00941848
0090fcb0	add x0,sp,#0x8
0090fcb4	bl 0x00c2ff50
0090fcb8	mov x2,x0
0090fcbc	add x1,sp,#0x8
0090fcc0	mov x0,x19
0090fcc4	bl 0x009167a8
0090fcc8	ldr x8,[x21, #0x28]
0090fccc	ldur x9,[x29, #-0x28]
0090fcd0	cmp x8,x9
0090fcd4	b.ne 0x0090fcec
0090fcd8	ldp x29,x30,[sp, #0xb0]
0090fcdc	ldp x20,x19,[sp, #0xa0]
0090fce0	ldr x21,[sp, #0x90]
0090fce4	add sp,sp,#0xc0
0090fce8	ret
0090fcec	bl 0x00c2fec0

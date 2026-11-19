; FUN_0090ff1c @ 0090ff1c
0090ff1c	sub sp,sp,#0x50
0090ff20	stp x22,x21,[sp, #0x20]
0090ff24	stp x20,x19,[sp, #0x30]
0090ff28	stp x29,x30,[sp, #0x40]
0090ff2c	add x29,sp,#0x40
0090ff30	mrs x21,tpidr_el0
0090ff34	ldr x8,[x21, #0x28]
0090ff38	mov x19,x1
0090ff3c	mov x20,x0
0090ff40	str x8,[sp, #0x18]
0090ff44	ldr x22,[x1, #0x540]
0090ff48	cbz x22,0x0090ffe0
0090ff4c	mov x0,x22
0090ff50	ldr x1,[x0, #0x10]!
0090ff54	cbz x1,0x0090ff6c
0090ff58	ldr x8,[x1]
0090ff5c	cmp x8,x19
0090ff60	b.eq 0x0090ffc0
0090ff64	ldr x1,[x1, #0x10]
0090ff68	cbnz x1,0x0090ff58
0090ff6c	cbz x20,0x0090ffdc
0090ff70	ldr x8,[x22, #0x8]
0090ff74	cbnz x8,0x0090ffac
0090ff78	mov x1,sp
0090ff7c	mov x0,x20
0090ff80	bl 0x00916a74
0090ff84	mov x0,sp
0090ff88	bl 0x00916a80
0090ff8c	cbz x0,0x0090ffac
0090ff90	ldr x8,[x0, #0x18]
0090ff94	cmp x8,x22
0090ff98	b.ne 0x0090ff84
0090ff9c	ldr x2,[x0, #0x28]
0090ffa0	add x1,x0,#0x30
0090ffa4	mov x0,x20
0090ffa8	bl 0x009166fc
0090ffac	str xzr,[x19, #0x540]
0090ffb0	ldr x8,[x20, #0x30]
0090ffb4	sub x8,x8,#0x1
0090ffb8	str x8,[x20, #0x30]
0090ffbc	b 0x0090ffe0
0090ffc0	mov x2,xzr
0090ffc4	bl 0x00925d80
0090ffc8	ldr x8,[x22, #0x8]
0090ffcc	sub x8,x8,#0x1
0090ffd0	str x8,[x22, #0x8]
0090ffd4	str xzr,[x19, #0x540]
0090ffd8	cbnz x20,0x0090ff70
0090ffdc	str xzr,[x19, #0x540]
0090ffe0	ldr x8,[x21, #0x28]
0090ffe4	ldr x9,[sp, #0x18]
0090ffe8	cmp x8,x9
0090ffec	b.ne 0x00910004
0090fff0	ldp x29,x30,[sp, #0x40]
0090fff4	ldp x20,x19,[sp, #0x30]
0090fff8	ldp x22,x21,[sp, #0x20]
0090fffc	add sp,sp,#0x50
00910000	ret
00910004	bl 0x00c2fec0

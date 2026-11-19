; ix::WebSocket::run @ 0098d988
0098d988	sub sp,sp,#0x70
0098d98c	stp x22,x21,[sp, #0x40]
0098d990	stp x20,x19,[sp, #0x50]
0098d994	stp x29,x30,[sp, #0x60]
0098d998	add x29,sp,#0x60
0098d99c	mrs x20,tpidr_el0
0098d9a0	ldr x8,[x20, #0x28]
0098d9a4	mov x19,x0
0098d9a8	stur x8,[x29, #-0x28]
0098d9ac	ldrb w8,[x0, #0x4e8]
0098d9b0	cbz w8,0x0098d9d8
0098d9b4	mov x8,sp
0098d9b8	mov x0,x19
0098d9bc	bl 0x00c339d0
0098d9c0	mov x0,sp
0098d9c4	bl 0x00c334c0
0098d9c8	ldrb w8,[sp]
0098d9cc	tbz w8,#0x0,0x0098d9d8
0098d9d0	ldr x0,[sp, #0x10]
0098d9d4	bl 0x00c301d0
0098d9d8	adrp x9,0xc52000
0098d9dc	add x9,x9,#0x238
0098d9e0	mov w8,#0x1
0098d9e4	add x21,x9,#0x10
0098d9e8	mov x22,sp
0098d9ec	b 0x0098d9f4
0098d9f0	mov w8,wzr
0098d9f4	and w1,w8,#0x1
0098d9f8	mov x0,x19
0098d9fc	bl 0x00c33910
0098da00	mov x0,x19
0098da04	bl 0x00c33990
0098da08	cmp w0,#0x3
0098da0c	b.hi 0x0098da7c
0098da10	cmp w0,#0x1
0098da14	b.eq 0x0098da7c
0098da18	add x8,x19,#0x400
0098da1c	ldarb w8,[x8]
0098da20	tbz w8,#0x0,0x0098da30
0098da24	mov x0,x19
0098da28	bl 0x00c33990
0098da2c	cbnz w0,0x0098da7c
0098da30	mov x0,x19
0098da34	bl 0x00c33880
0098da38	mov w1,w0
0098da3c	stp x21,x19,[sp]
0098da40	str x22,[sp, #0x20]
0098da44	mov x2,sp
0098da48	mov x0,x19
0098da4c	bl 0x00c338a0
0098da50	ldr x0,[sp, #0x20]
0098da54	cmp x22,x0
0098da58	b.eq 0x0098da6c
0098da5c	cbz x0,0x0098d9f0
0098da60	ldr x8,[x0]
0098da64	ldr x8,[x8, #0x28]
0098da68	b 0x0098da74
0098da6c	ldr x8,[x0]
0098da70	ldr x8,[x8, #0x20]
0098da74	blr x8
0098da78	b 0x0098d9f0
0098da7c	ldr x8,[x20, #0x28]
0098da80	ldur x9,[x29, #-0x28]
0098da84	cmp x8,x9
0098da88	b.ne 0x0098daa0
0098da8c	ldp x29,x30,[sp, #0x60]
0098da90	ldp x20,x19,[sp, #0x50]
0098da94	ldp x22,x21,[sp, #0x40]
0098da98	add sp,sp,#0x70
0098da9c	ret
0098daa0	bl 0x00c2fec0

; FUN_0086ec24 @ 0086ec24
0086ec24	stp x29,x30,[sp, #-0x30]!
0086ec28	stp x22,x21,[sp, #0x10]
0086ec2c	stp x20,x19,[sp, #0x20]
0086ec30	mov x29,sp
0086ec34	ldrb w8,[x0, #0x8]
0086ec38	tbnz w8,#0x0,0x0086ec8c
0086ec3c	ldr x20,[x0]
0086ec40	mov x19,x0
0086ec44	ldr x21,[x20]
0086ec48	cbz x21,0x0086ec8c
0086ec4c	ldr x22,[x20, #0x8]
0086ec50	mov x0,x21
0086ec54	mov x8,x20
0086ec58	cmp x21,x22
0086ec5c	b.ne 0x0086ec70
0086ec60	b 0x0086eca4
0086ec64	sub x22,x22,#0x28
0086ec68	cmp x22,x21
0086ec6c	b.eq 0x0086ec9c
0086ec70	ldurb w8,[x22, #-0x18]
0086ec74	tbz w8,#0x0,0x0086ec64
0086ec78	ldur x8,[x22, #-0x18]
0086ec7c	ldur x0,[x22, #-0x8]
0086ec80	and x1,x8,#-0x2
0086ec84	bl 0x00c2fe80
0086ec88	b 0x0086ec64
0086ec8c	ldp x20,x19,[sp, #0x20]
0086ec90	ldp x22,x21,[sp, #0x10]
0086ec94	ldp x29,x30,[sp], #0x30
0086ec98	ret
0086ec9c	ldr x8,[x19]
0086eca0	ldr x0,[x8]
0086eca4	ldr x8,[x8, #0x10]
0086eca8	str x21,[x20, #0x8]
0086ecac	sub x1,x8,x0
0086ecb0	ldp x20,x19,[sp, #0x20]
0086ecb4	ldp x22,x21,[sp, #0x10]
0086ecb8	ldp x29,x30,[sp], #0x30
0086ecbc	b 0x00c2fe80

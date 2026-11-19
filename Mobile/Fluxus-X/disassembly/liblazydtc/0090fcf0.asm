; FUN_0090fcf0 @ 0090fcf0
0090fcf0	sub sp,sp,#0xd0
0090fcf4	stp x24,x23,[sp, #0x90]
0090fcf8	stp x22,x21,[sp, #0xa0]
0090fcfc	stp x20,x19,[sp, #0xb0]
0090fd00	stp x29,x30,[sp, #0xc0]
0090fd04	add x29,sp,#0xc0
0090fd08	mrs x24,tpidr_el0
0090fd0c	ldr x8,[x24, #0x28]
0090fd10	mov x19,x0
0090fd14	stur x8,[x29, #-0x38]
0090fd18	ldr x21,[x0, #0x20]
0090fd1c	ldr x20,[x0, #0xc38]
0090fd20	mov x1,x21
0090fd24	mov x2,x20
0090fd28	bl 0x0090fc08
0090fd2c	mov x22,x0
0090fd30	cbz x0,0x0090fdb4
0090fd34	add x0,x22,#0x10
0090fd38	mov x1,x21
0090fd3c	mov x2,x21
0090fd40	bl 0x00925d10
0090fd44	str x22,[x21, #0x540]
0090fd48	ldr x8,[x22, #0x8]
0090fd4c	mov w23,wzr
0090fd50	add x8,x8,#0x1
0090fd54	str x8,[x22, #0x8]
0090fd58	ldr x8,[x20, #0x38]
0090fd5c	add x9,x8,#0x1
0090fd60	str x9,[x20, #0x38]
0090fd64	str x8,[x21, #0x28]
0090fd68	ldr x8,[x20, #0x30]
0090fd6c	add x8,x8,#0x1
0090fd70	str x8,[x20, #0x30]
0090fd74	ldr x8,[x19, #0xd0]
0090fd78	cbz x8,0x0090fd88
0090fd7c	mov w1,#0x5
0090fd80	mov x0,x19
0090fd84	bl 0x0093f680
0090fd88	ldr x8,[x24, #0x28]
0090fd8c	ldur x9,[x29, #-0x38]
0090fd90	cmp x8,x9
0090fd94	b.ne 0x0090fe8c
0090fd98	mov w0,w23
0090fd9c	ldp x29,x30,[sp, #0xc0]
0090fda0	ldp x20,x19,[sp, #0xb0]
0090fda4	ldp x22,x21,[sp, #0xa0]
0090fda8	ldp x24,x23,[sp, #0x90]
0090fdac	add sp,sp,#0xd0
0090fdb0	ret
0090fdb4	adrp x8,0xcc4000
0090fdb8	add x8,x8,#0x670
0090fdbc	orr w0,wzr,#0x30
0090fdc0	ldr x8,[x8]
0090fdc4	blr x8
0090fdc8	mov x22,x0
0090fdcc	cbz x0,0x0090fe7c
0090fdd0	add x0,x22,#0x10
0090fdd4	mov x1,xzr
0090fdd8	str xzr,[x22, #0x8]
0090fddc	str wzr,[x22]
0090fde0	bl 0x00925c98
0090fde4	ldr x8,[x21, #0x3a0]
0090fde8	mov w9,#0x9
0090fdec	and x9,x8,x9
0090fdf0	cmp x9,#0x1
0090fdf4	b.ne 0x0090fe04
0090fdf8	ldrsw x4,[x21, #0x15c]
0090fdfc	add x8,x21,#0xd8
0090fe00	b 0x0090fe18
0090fe04	ldrsw x4,[x21, #0x560]
0090fe08	tbnz w8,#0x9,0x0090fe14
0090fe0c	add x8,x21,#0x50
0090fe10	b 0x0090fe18
0090fe14	add x8,x21,#0x80
0090fe18	ldr x5,[x8]
0090fe1c	ldr w3,[x21, #0x568]
0090fe20	adrp x2,0x2a3000
0090fe24	add x2,x2,#0x642
0090fe28	add x0,sp,#0x8
0090fe2c	mov w1,#0x80
0090fe30	bl 0x00c31b70
0090fe34	add x0,sp,#0x8
0090fe38	add x1,sp,#0x8
0090fe3c	mov w2,#0x80
0090fe40	bl 0x00941848
0090fe44	ldr x23,[x19, #0xc38]
0090fe48	add x0,sp,#0x8
0090fe4c	bl 0x00c2ff50
0090fe50	mov x2,x0
0090fe54	add x1,sp,#0x8
0090fe58	mov x0,x23
0090fe5c	mov x3,x22
0090fe60	bl 0x009166f4
0090fe64	cbnz x0,0x0090fd34
0090fe68	adrp x8,0xcc4000
0090fe6c	add x8,x8,#0x678
0090fe70	mov x0,x22
0090fe74	ldr x8,[x8]
0090fe78	blr x8
0090fe7c	mov w23,#0x1b
0090fe80	ldr x8,[x19, #0xd0]
0090fe84	cbnz x8,0x0090fd7c
0090fe88	b 0x0090fd88
0090fe8c	bl 0x00c2fec0

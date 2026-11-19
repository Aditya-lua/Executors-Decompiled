; FUN_0084a9b4 @ 0084a9b4
0084a9b4	stp x29,x30,[sp, #-0x20]!
0084a9b8	str x19,[sp, #0x10]
0084a9bc	mov x29,sp
0084a9c0	cmp x1,x2
0084a9c4	b.eq 0x0084aa28
0084a9c8	add x8,x1,#0x1
0084a9cc	cmp x8,x2
0084a9d0	b.eq 0x0084aa28
0084a9d4	ldrb w9,[x1]
0084a9d8	cmp w9,#0x5c
0084a9dc	b.ne 0x0084aa28
0084a9e0	ldrb w9,[x8]
0084a9e4	sub w10,w9,#0x24
0084a9e8	cmp w10,#0x3a
0084a9ec	b.hi 0x0084aa0c
0084a9f0	mov w11,#0x1
0084a9f4	lsl x10,x11,x10
0084a9f8	mov x11,#0x4f1
0084a9fc	movk x11,#0x800, LSL #16
0084aa00	movk x11,#0x580, LSL #48
0084aa04	tst x10,x11
0084aa08	b.ne 0x0084aa18
0084aa0c	sub w10,w9,#0x7b
0084aa10	cmp w10,#0x3
0084aa14	b.cs 0x0084aa38
0084aa18	mov x19,x1
0084aa1c	mov w1,w9
0084aa20	bl 0x00845824
0084aa24	add x1,x19,#0x2
0084aa28	mov x0,x1
0084aa2c	ldr x19,[sp, #0x10]
0084aa30	ldp x29,x30,[sp], #0x20
0084aa34	ret
0084aa38	ldr w10,[x0, #0x18]
0084aa3c	and w10,w10,#0x1f0
0084aa40	cmp w10,#0x40
0084aa44	b.ne 0x0084aa5c
0084aa48	mov x1,x8
0084aa4c	mov x3,xzr
0084aa50	ldr x19,[sp, #0x10]
0084aa54	ldp x29,x30,[sp], #0x20
0084aa58	b 0x008481f4
0084aa5c	mov x19,x1
0084aa60	mov w1,w9
0084aa64	bl 0x0084a664
0084aa68	mov w8,#0x2
0084aa6c	tst w0,#0x1
0084aa70	csel x8,x8,xzr,ne
0084aa74	add x1,x19,x8
0084aa78	b 0x0084aa28

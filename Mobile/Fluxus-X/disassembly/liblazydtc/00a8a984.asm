; FUN_00a8a984 @ 00a8a984
00a8a984	sub sp,sp,#0x60
00a8a988	stp x26,x25,[sp, #0x10]
00a8a98c	stp x24,x23,[sp, #0x20]
00a8a990	stp x22,x21,[sp, #0x30]
00a8a994	stp x20,x19,[sp, #0x40]
00a8a998	stp x29,x30,[sp, #0x50]
00a8a99c	add x29,sp,#0x50
00a8a9a0	cbz x3,0x00a8aa38
00a8a9a4	adrp x25,0xcb5000
00a8a9a8	ldr x25,[x25, #0x318]
00a8a9ac	lsr x8,x3,#0x1e
00a8a9b0	mov w9,#0x40000000
00a8a9b4	cmp x8,#0x0
00a8a9b8	mov x19,x3
00a8a9bc	mov x20,x2
00a8a9c0	mov x21,x1
00a8a9c4	mov x22,x0
00a8a9c8	add x23,x0,#0x28
00a8a9cc	csel x24,x3,x9,eq
00a8a9d0	mov x0,x22
00a8a9d4	bl 0x00c3ceb0
00a8a9d8	str w0,[sp, #0xc]
00a8a9dc	mov x0,x22
00a8a9e0	bl 0x00c3cea0
00a8a9e4	mov x26,x0
00a8a9e8	mov x0,x22
00a8a9ec	bl 0x00c3cec0
00a8a9f0	mov w6,w0
00a8a9f4	add x5,sp,#0xc
00a8a9f8	mov x0,x20
00a8a9fc	mov x1,x21
00a8aa00	mov x2,x24
00a8aa04	mov x3,x26
00a8aa08	mov x4,x23
00a8aa0c	mov x7,x25
00a8aa10	bl 0x00c3e300
00a8aa14	ldr w1,[sp, #0xc]
00a8aa18	mov x0,x22
00a8aa1c	bl 0x00c3ced0
00a8aa20	sub x19,x19,x24
00a8aa24	cmp x19,x24
00a8aa28	add x20,x20,x24
00a8aa2c	add x21,x21,x24
00a8aa30	csel x24,x19,x24,cc
00a8aa34	cbnz x19,0x00a8a9d0
00a8aa38	ldp x29,x30,[sp, #0x50]
00a8aa3c	ldp x20,x19,[sp, #0x40]
00a8aa40	ldp x22,x21,[sp, #0x30]
00a8aa44	ldp x24,x23,[sp, #0x20]
00a8aa48	ldp x26,x25,[sp, #0x10]
00a8aa4c	mov w0,#0x1
00a8aa50	add sp,sp,#0x60
00a8aa54	ret

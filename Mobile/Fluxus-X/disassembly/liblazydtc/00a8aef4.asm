; FUN_00a8aef4 @ 00a8aef4
00a8aef4	sub sp,sp,#0x60
00a8aef8	stp x26,x25,[sp, #0x10]
00a8aefc	stp x24,x23,[sp, #0x20]
00a8af00	stp x22,x21,[sp, #0x30]
00a8af04	stp x20,x19,[sp, #0x40]
00a8af08	stp x29,x30,[sp, #0x50]
00a8af0c	add x29,sp,#0x50
00a8af10	cbz x3,0x00a8afa8
00a8af14	adrp x25,0xcb5000
00a8af18	ldr x25,[x25, #0x318]
00a8af1c	lsr x8,x3,#0x1e
00a8af20	mov w9,#0x40000000
00a8af24	cmp x8,#0x0
00a8af28	mov x19,x3
00a8af2c	mov x20,x2
00a8af30	mov x21,x1
00a8af34	mov x22,x0
00a8af38	add x23,x0,#0x28
00a8af3c	csel x24,x3,x9,eq
00a8af40	mov x0,x22
00a8af44	bl 0x00c3ceb0
00a8af48	str w0,[sp, #0xc]
00a8af4c	mov x0,x22
00a8af50	bl 0x00c3cea0
00a8af54	mov x26,x0
00a8af58	mov x0,x22
00a8af5c	bl 0x00c3cec0
00a8af60	mov w6,w0
00a8af64	add x5,sp,#0xc
00a8af68	mov x0,x20
00a8af6c	mov x1,x21
00a8af70	mov x2,x24
00a8af74	mov x3,x26
00a8af78	mov x4,x23
00a8af7c	mov x7,x25
00a8af80	bl 0x00c3e2f0
00a8af84	ldr w1,[sp, #0xc]
00a8af88	mov x0,x22
00a8af8c	bl 0x00c3ced0
00a8af90	sub x19,x19,x24
00a8af94	cmp x19,x24
00a8af98	add x20,x20,x24
00a8af9c	add x21,x21,x24
00a8afa0	csel x24,x19,x24,cc
00a8afa4	cbnz x19,0x00a8af40
00a8afa8	ldp x29,x30,[sp, #0x50]
00a8afac	ldp x20,x19,[sp, #0x40]
00a8afb0	ldp x22,x21,[sp, #0x30]
00a8afb4	ldp x24,x23,[sp, #0x20]
00a8afb8	ldp x26,x25,[sp, #0x10]
00a8afbc	mov w0,#0x1
00a8afc0	add sp,sp,#0x60
00a8afc4	ret

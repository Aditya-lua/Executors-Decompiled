; FUN_00804e40 @ 00804e40
00804e40	sub sp,sp,#0x40
00804e44	stp x29,x30,[sp, #0x20]
00804e48	stp x20,x19,[sp, #0x30]
00804e4c	add x29,sp,#0x20
00804e50	mrs x20,tpidr_el0
00804e54	mov w0,#0x8
00804e58	ldr x8,[x20, #0x28]
00804e5c	stur x8,[x29, #-0x8]
00804e60	bl 0x00c2fed0
00804e64	mov x19,x0
00804e68	bl 0x00c2ffa0
00804e6c	str x19,[sp, #0x10]
00804e70	mov w0,#0x8
00804e74	bl 0x00c2fed0
00804e78	mov x3,x0
00804e7c	stp x0,xzr,[sp, #0x8]
00804e80	str x19,[x0]
00804e84	nop
00804e88	adr x2,0x804f7c
00804e8c	mov x0,sp
00804e90	mov x1,xzr
00804e94	bl 0x00c2ffb0
00804e98	cbnz w0,0x00804ecc
00804e9c	mov x0,sp
00804ea0	bl 0x00c2ff70
00804ea4	mov x0,sp
00804ea8	bl 0x00c2ff80
00804eac	ldr x8,[x20, #0x28]
00804eb0	ldur x9,[x29, #-0x8]
00804eb4	cmp x8,x9
00804eb8	b.ne 0x00804f44
00804ebc	ldp x20,x19,[sp, #0x30]
00804ec0	ldp x29,x30,[sp, #0x20]
00804ec4	add sp,sp,#0x40
00804ec8	ret
00804ecc	ldr x8,[x20, #0x28]
00804ed0	ldur x9,[x29, #-0x8]
00804ed4	cmp x8,x9
00804ed8	b.ne 0x00804f44
00804edc	adrp x1,0x2a7000
00804ee0	add x1,x1,#0x22
00804ee4	bl 0x00c2ffc0
00804f44	bl 0x00c2fec0

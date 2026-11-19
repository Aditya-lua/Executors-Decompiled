; FUN_0086c914 @ 0086c914
0086c914	sub sp,sp,#0xa0
0086c918	stp x29,x30,[sp, #0x60]
0086c91c	str x23,[sp, #0x70]
0086c920	stp x22,x21,[sp, #0x80]
0086c924	stp x20,x19,[sp, #0x90]
0086c928	add x29,sp,#0x60
0086c92c	mrs x21,tpidr_el0
0086c930	mov x20,x1
0086c934	mov x19,x0
0086c938	ldr x8,[x21, #0x28]
0086c93c	stur x8,[x29, #-0x8]
0086c940	ldr x8,[x0, #0x488]
0086c944	ldr x9,[x0, #0x480]
0086c948	stp xzr,xzr,[x29, #-0x18]
0086c94c	str xzr,[sp, #0x40]
0086c950	sub x8,x8,x9
0086c954	add x9,x0,#0x480
0086c958	asr x8,x8,#0x3
0086c95c	stp x9,x8,[sp, #0x30]
0086c960	add x1,sp,#0x30
0086c964	bl 0x00862f80
0086c968	mov x8,x0
0086c96c	mov x0,x19
0086c970	ldr w9,[x0, #0x90]!
0086c974	stp x8,x1,[x29, #-0x18]
0086c978	cmp w9,#0x12b
0086c97c	b.ne 0x0086c9bc
0086c980	ldp q0,q1,[x0]
0086c984	stp q0,q1,[sp]
0086c988	mov x0,x19
0086c98c	bl 0x00858f2c
0086c990	str xzr,[sp, #0x20]
0086c994	mov x2,sp
0086c998	add x3,sp,#0x20
0086c99c	sub x5,x29,#0x18
0086c9a0	add x7,sp,#0x30
0086c9a4	mov x0,x19
0086c9a8	mov w1,wzr
0086c9ac	mov x4,xzr
0086c9b0	mov w6,wzr
0086c9b4	bl 0x00863248
0086c9b8	b 0x0086ca18
0086c9bc	stp xzr,xzr,[sp, #0x20]
0086c9c0	mov x8,sp
0086c9c4	mov x22,sp
0086c9c8	bl 0x008521fc
0086c9cc	ldrb w8,[sp]
0086c9d0	ldr x9,[sp, #0x10]
0086c9d4	tst w8,#0x1
0086c9d8	csinc x4,x9,x22,ne
0086c9dc	adrp x3,0x2c8000
0086c9e0	add x3,x3,#0xbbd
0086c9e4	add x2,sp,#0x20
0086c9e8	mov x0,x19
0086c9ec	mov x1,x20
0086c9f0	bl 0x008659e8
0086c9f4	ldrb w8,[sp]
0086c9f8	tbz w8,#0x0,0x0086ca18
0086c9fc	ldr x8,[sp, #0x10]
0086ca00	ldr x9,[sp]
0086ca04	mov x19,x0
0086ca08	and x1,x9,#-0x2
0086ca0c	mov x0,x8
0086ca10	bl 0x00c2fe80
0086ca14	mov x0,x19
0086ca18	ldp x22,x9,[sp, #0x30]
0086ca1c	ldp x10,x8,[x22]
0086ca20	add x19,x10,x9, LSL #0x3
0086ca24	cmp x19,x8
0086ca28	b.eq 0x0086ca58
0086ca2c	sub x9,x8,x19
0086ca30	add x1,x19,x9
0086ca34	subs x20,x8,x1
0086ca38	b.eq 0x0086ca50
0086ca3c	mov x23,x0
0086ca40	mov x0,x19
0086ca44	mov x2,x20
0086ca48	bl 0x00c2ff60
0086ca4c	mov x0,x23
0086ca50	add x8,x19,x20
0086ca54	str x8,[x22, #0x8]
0086ca58	ldr x8,[x21, #0x28]
0086ca5c	ldur x9,[x29, #-0x8]
0086ca60	cmp x8,x9
0086ca64	b.ne 0x0086cb08
0086ca68	ldp x20,x19,[sp, #0x90]
0086ca6c	ldr x23,[sp, #0x70]
0086ca70	ldp x22,x21,[sp, #0x80]
0086ca74	ldp x29,x30,[sp, #0x60]
0086ca78	add sp,sp,#0xa0
0086ca7c	ret
0086cb08	bl 0x00c2fec0

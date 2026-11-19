; FUN_0098a948 @ 0098a948
0098a948	str x25,[sp, #-0x50]!
0098a94c	stp x24,x23,[sp, #0x10]
0098a950	stp x22,x21,[sp, #0x20]
0098a954	stp x20,x19,[sp, #0x30]
0098a958	stp x29,x30,[sp, #0x40]
0098a95c	add x29,sp,#0x40
0098a960	mov x20,x0
0098a964	mov w0,#0x8
0098a968	mov x22,x4
0098a96c	mov x23,x3
0098a970	mov x24,x2
0098a974	mov x25,x1
0098a978	bl 0x00c2fed0
0098a97c	mov x21,x0
0098a980	bl 0x00c2ffa0
0098a984	orr w0,wzr,#0x38
0098a988	bl 0x00c2fed0
0098a98c	ldp x8,x9,[x25]
0098a990	ldr x10,[x24]
0098a994	ldr x11,[x23]
0098a998	str xzr,[x23]
0098a99c	ldp x13,x12,[x22]
0098a9a0	mov x19,x0
0098a9a4	cbz x12,0x0098a9bc
0098a9a8	add x14,x12,#0x8
0098a9ac	ldxr x15,[x14]
0098a9b0	add x15,x15,#0x1
0098a9b4	stxr w16,x15,[x14]
0098a9b8	cbnz w16,0x0098a9ac
0098a9bc	stp x21,x8,[x19]
0098a9c0	stp x9,x10,[x19, #0x10]
0098a9c4	stp x11,x13,[x19, #0x20]
0098a9c8	str x12,[x19, #0x30]
0098a9cc	adrp x2,0xcb4000
0098a9d0	ldr x2,[x2, #0xfd0]
0098a9d4	mov x0,x20
0098a9d8	mov x1,xzr
0098a9dc	mov x3,x19
0098a9e0	bl 0x00c2ffb0
0098a9e4	cbnz w0,0x0098aa00
0098a9e8	ldp x29,x30,[sp, #0x40]
0098a9ec	ldp x20,x19,[sp, #0x30]
0098a9f0	ldp x22,x21,[sp, #0x20]
0098a9f4	ldp x24,x23,[sp, #0x10]
0098a9f8	ldr x25,[sp], #0x50
0098a9fc	ret
0098aa00	adrp x1,0x2a7000
0098aa04	add x1,x1,#0x22
0098aa08	bl 0x00c2ffc0

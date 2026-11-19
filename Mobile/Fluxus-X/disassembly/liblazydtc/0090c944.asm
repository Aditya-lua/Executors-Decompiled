; FUN_0090c944 @ 0090c944
0090c944	stp x28,x21,[sp, #-0x30]!
0090c948	stp x20,x19,[sp, #0x10]
0090c94c	stp x29,x30,[sp, #0x20]
0090c950	add x29,sp,#0x20
0090c954	sub sp,sp,#0x410
0090c958	mrs x20,tpidr_el0
0090c95c	ldr x9,[x20, #0x28]
0090c960	mov x19,x2
0090c964	mov x8,x0
0090c968	stur x9,[x29, #-0x28]
0090c96c	ldrb w9,[x0, #0x24]
0090c970	tbz w9,#0x0,0x0090c9f8
0090c974	ldr x21,[x8, #0x10]
0090c978	cbz x1,0x0090c9c0
0090c97c	ldrb w9,[x1, #0xa85]
0090c980	tbz w9,#0x4,0x0090c9c0
0090c984	ldr x9,[x1, #0x12a0]
0090c988	cbz x9,0x0090c998
0090c98c	ldr w9,[x9, #0x8]
0090c990	cmp w9,#0x1
0090c994	b.lt 0x0090c9c0
0090c998	ldr x9,[x8]
0090c99c	ldr w9,[x9, #0xc]
0090c9a0	cmp w9,#0x1
0090c9a4	b.lt 0x0090c9c0
0090c9a8	ldr w3,[x21, #0x98]
0090c9ac	adrp x2,0x2b1000
0090c9b0	add x2,x2,#0x4c7
0090c9b4	mov x0,x1
0090c9b8	mov x1,x8
0090c9bc	bl 0x00904ddc
0090c9c0	ldr w0,[x21, #0x98]
0090c9c4	cmn w0,#0x1
0090c9c8	b.eq 0x0090c9f8
0090c9cc	ldr w8,[x21]
0090c9d0	cmp w8,#0x3
0090c9d4	b.ne 0x0090c9f8
0090c9d8	mov w1,#0x1
0090c9dc	bl 0x009308ec
0090c9e0	tbnz w0,#0x1f,0x0090c9f8
0090c9e4	ldr w0,[x21, #0x98]
0090c9e8	add x1,sp,#0x8
0090c9ec	mov w2,#0x400
0090c9f0	mov w3,wzr
0090c9f4	bl 0x00c31c40
0090c9f8	mov w8,#0x1
0090c9fc	strb w8,[x19]
0090ca00	ldr x8,[x20, #0x28]
0090ca04	ldur x9,[x29, #-0x28]
0090ca08	cmp x8,x9
0090ca0c	b.ne 0x0090ca28
0090ca10	mov w0,wzr
0090ca14	add sp,sp,#0x410
0090ca18	ldp x29,x30,[sp, #0x20]
0090ca1c	ldp x20,x19,[sp, #0x10]
0090ca20	ldp x28,x21,[sp], #0x30
0090ca24	ret
0090ca28	bl 0x00c2fec0

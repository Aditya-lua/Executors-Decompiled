; ix::gzipDecompress @ 0097b920
0097b920	str x28,[sp, #-0x50]!
0097b924	stp x24,x23,[sp, #0x10]
0097b928	stp x22,x21,[sp, #0x20]
0097b92c	stp x20,x19,[sp, #0x30]
0097b930	stp x29,x30,[sp, #0x40]
0097b934	add x29,sp,#0x40
0097b938	sub sp,sp,#0x4, LSL #12
0097b93c	sub sp,sp,#0x80
0097b940	mrs x21,tpidr_el0
0097b944	ldr x8,[x21, #0x28]
0097b948	mov x19,x1
0097b94c	mov x20,x0
0097b950	add x0,sp,#0x8
0097b954	orr w2,wzr,#0x70
0097b958	mov w1,wzr
0097b95c	stur x8,[x29, #-0x48]
0097b960	bl 0x00c301c0
0097b964	adrp x2,0x2a3000
0097b968	add x2,x2,#0x6b5
0097b96c	add x0,sp,#0x8
0097b970	orr w1,wzr,#0x1f
0097b974	orr w3,wzr,#0x70
0097b978	bl 0x00c31e10
0097b97c	mov w8,w0
0097b980	mov w0,wzr
0097b984	cbnz w8,0x0097ba24
0097b988	ldrb w8,[x20]
0097b98c	tbnz w8,#0x0,0x0097b9a0
0097b990	lsr w8,w8,#0x1
0097b994	str w8,[sp, #0x10]
0097b998	add x8,x20,#0x1
0097b99c	b 0x0097b9ac
0097b9a0	ldr x8,[x20, #0x8]
0097b9a4	str w8,[sp, #0x10]
0097b9a8	ldr x8,[x20, #0x10]
0097b9ac	mov w20,#0x4000
0097b9b0	add x22,sp,#0x78
0097b9b4	mov w23,#0x1
0097b9b8	mov w24,#0x43
0097b9bc	str x8,[sp, #0x8]
0097b9c0	add x0,sp,#0x8
0097b9c4	mov w1,#0x2
0097b9c8	str w20,[sp, #0x28]
0097b9cc	str x22,[sp, #0x20]
0097b9d0	bl 0x00c31df0
0097b9d4	add w8,w0,#0x4
0097b9d8	cmp w8,#0x6
0097b9dc	b.hi 0x0097b9ec
0097b9e0	lsl w8,w23,w8
0097b9e4	tst w8,w24
0097b9e8	b.ne 0x0097ba18
0097b9ec	ldr w8,[sp, #0x28]
0097b9f0	add x1,sp,#0x78
0097b9f4	mov x0,x19
0097b9f8	sub w2,w20,w8
0097b9fc	bl 0x00c308c0
0097ba00	ldr w8,[sp, #0x28]
0097ba04	cbz w8,0x0097b9c0
0097ba08	add x0,sp,#0x8
0097ba0c	bl 0x00c31e00
0097ba10	mov w0,#0x1
0097ba14	b 0x0097ba24
0097ba18	add x0,sp,#0x8
0097ba1c	bl 0x00c31e00
0097ba20	mov w0,wzr
0097ba24	ldr x8,[x21, #0x28]
0097ba28	ldur x9,[x29, #-0x48]
0097ba2c	cmp x8,x9
0097ba30	b.ne 0x0097ba54
0097ba34	add sp,sp,#0x4, LSL #12
0097ba38	add sp,sp,#0x80
0097ba3c	ldp x29,x30,[sp, #0x40]
0097ba40	ldp x20,x19,[sp, #0x30]
0097ba44	ldp x22,x21,[sp, #0x20]
0097ba48	ldp x24,x23,[sp, #0x10]
0097ba4c	ldr x28,[sp], #0x50
0097ba50	ret
0097ba54	bl 0x00c2fec0

; mbedtls_hmac_drbg_write_seed_file @ 00b9c940
00b9c940	sub sp,sp,#0x140
00b9c944	stp x28,x21,[sp, #0x110]
00b9c948	stp x20,x19,[sp, #0x120]
00b9c94c	stp x29,x30,[sp, #0x130]
00b9c950	add x29,sp,#0x130
00b9c954	mrs x21,tpidr_el0
00b9c958	ldr x9,[x21, #0x28]
00b9c95c	mov x8,x1
00b9c960	adrp x1,0x2a6000
00b9c964	mov x20,x0
00b9c968	add x1,x1,#0xd85
00b9c96c	mov x0,x8
00b9c970	stur x9,[x29, #-0x28]
00b9c974	bl 0x00c30c10
00b9c978	mov x19,x0
00b9c97c	cbz x0,0x00b9c9e4
00b9c980	mov x0,x19
00b9c984	mov x1,xzr
00b9c988	bl 0x00c42490
00b9c98c	add x1,sp,#0x8
00b9c990	mov w2,#0x100
00b9c994	mov x0,x20
00b9c998	mov x3,xzr
00b9c99c	mov x4,xzr
00b9c9a0	bl 0x00c428a0
00b9c9a4	mov w20,w0
00b9c9a8	cbnz w0,0x00b9c9cc
00b9c9ac	add x0,sp,#0x8
00b9c9b0	mov w1,#0x1
00b9c9b4	mov w2,#0x100
00b9c9b8	mov x3,x19
00b9c9bc	bl 0x00c308f0
00b9c9c0	cmp x0,#0x100
00b9c9c4	orr w8,wzr,#0xfffffff9
00b9c9c8	csel w20,wzr,w8,eq
00b9c9cc	mov x0,x19
00b9c9d0	bl 0x00c30be0
00b9c9d4	add x0,sp,#0x8
00b9c9d8	mov w1,#0x100
00b9c9dc	bl 0x00c42220
00b9c9e0	b 0x00b9c9e8
00b9c9e4	orr w20,wzr,#0xfffffff9
00b9c9e8	ldr x8,[x21, #0x28]
00b9c9ec	ldur x9,[x29, #-0x28]
00b9c9f0	cmp x8,x9
00b9c9f4	b.ne 0x00b9ca10
00b9c9f8	mov w0,w20
00b9c9fc	ldp x29,x30,[sp, #0x130]
00b9ca00	ldp x20,x19,[sp, #0x120]
00b9ca04	ldp x28,x21,[sp, #0x110]
00b9ca08	add sp,sp,#0x140
00b9ca0c	ret
00b9ca10	bl 0x00c2fec0

; FUN_0086b888 @ 0086b888
0086b888	sub sp,sp,#0x80
0086b88c	stp x29,x30,[sp, #0x30]
0086b890	stp x26,x25,[sp, #0x40]
0086b894	stp x24,x23,[sp, #0x50]
0086b898	stp x22,x21,[sp, #0x60]
0086b89c	stp x20,x19,[sp, #0x70]
0086b8a0	add x29,sp,#0x30
0086b8a4	mrs x25,tpidr_el0
0086b8a8	mov x21,x2
0086b8ac	mov x23,x1
0086b8b0	ldr x8,[x25, #0x28]
0086b8b4	mov x19,x0
0086b8b8	stur x8,[x29, #-0x8]
0086b8bc	ldr w8,[x0, #0x90]
0086b8c0	ldur x20,[x0, #0x94]
0086b8c4	stur w8,[x29, #-0x14]
0086b8c8	stur x20,[x29, #-0x10]
0086b8cc	bl 0x00858f2c
0086b8d0	mov x0,x19
0086b8d4	mov w1,wzr
0086b8d8	bl 0x0086060c
0086b8dc	ldr w8,[x19, #0x90]
0086b8e0	ldur x22,[x19, #0x94]
0086b8e4	mov x24,x0
0086b8e8	ldur x26,[x19, #0x9c]
0086b8ec	cmp w8,#0x5d
0086b8f0	b.ne 0x0086b900
0086b8f4	mov x0,x19
0086b8f8	bl 0x00858f2c
0086b8fc	b 0x0086b92c
0086b900	sub x2,x29,#0x14
0086b904	mov x0,x19
0086b908	mov w1,#0x5d
0086b90c	mov x3,xzr
0086b910	bl 0x0086b5f8
0086b914	mov x0,x19
0086b918	mov w1,#0x5d
0086b91c	mov w3,wzr
0086b920	bl 0x0086e434
0086b924	tst w0,#0x1
0086b928	csinv x22,x22,xzr,ne
0086b92c	ldr x0,[x19, #0xe8]
0086b930	mov w1,#0x30
0086b934	stp x23,x26,[sp, #0x8]
0086b938	bl 0x0084e938
0086b93c	add x1,sp,#0x8
0086b940	mov x2,x21
0086b944	mov x3,x24
0086b948	mov x23,x0
0086b94c	bl 0x0084ef48
0086b950	ldrb w8,[x19, #0x68]
0086b954	cmp w8,#0x1
0086b958	b.ne 0x0086b98c
0086b95c	ldr x0,[x19, #0xe8]
0086b960	mov w1,#0x14
0086b964	bl 0x0084e938
0086b968	mov x1,x20
0086b96c	mov x2,x22
0086b970	mov x21,x0
0086b974	bl 0x00851e10
0086b978	add x0,x19,#0x4b0
0086b97c	add x1,sp,#0x8
0086b980	str x23,[sp, #0x8]
0086b984	bl 0x00860fa0
0086b988	str x21,[x0]
0086b98c	ldr x8,[x25, #0x28]
0086b990	ldur x9,[x29, #-0x8]
0086b994	cmp x8,x9
0086b998	b.ne 0x0086b9bc
0086b99c	mov x0,x23
0086b9a0	ldp x20,x19,[sp, #0x70]
0086b9a4	ldp x22,x21,[sp, #0x60]
0086b9a8	ldp x24,x23,[sp, #0x50]
0086b9ac	ldp x26,x25,[sp, #0x40]
0086b9b0	ldp x29,x30,[sp, #0x30]
0086b9b4	add sp,sp,#0x80
0086b9b8	ret
0086b9bc	bl 0x00c2fec0

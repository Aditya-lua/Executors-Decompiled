; ssl_setup_sig_algs @ 009c1c14
009c1c14	str x23,[sp, #-0x40]!
009c1c18	adrp x1,0x2c3000
009c1c1c	stp x22,x21,[sp, #0x10]
009c1c20	mov x21,x0
009c1c24	add x1,x1,#0x5d8
009c1c28	mov w0,#0x460
009c1c2c	mov w2,#0x495
009c1c30	stp x20,x19,[sp, #0x20]
009c1c34	stp x29,x30,[sp, #0x30]
009c1c38	add x29,sp,#0x30
009c1c3c	bl 0x00c32320
009c1c40	mov x20,x0
009c1c44	bl 0x00c36450
009c1c48	mov x19,x0
009c1c4c	cbz x20,0x009c1cf0
009c1c50	cbz x19,0x009c1cf0
009c1c54	bl 0x00c35250
009c1c58	adrp x23,0xc57000
009c1c5c	mov x22,xzr
009c1c60	add x23,x23,#0xd20
009c1c64	add x8,x23,x22
009c1c68	ldr x9,[x8, #0x20]
009c1c6c	ldp q1,q0,[x8]
009c1c70	ldr w10,[x8, #0xc]
009c1c74	add x11,x20,x22
009c1c78	str x9,[x11, #0x20]
009c1c7c	stp q1,q0,[x11]
009c1c80	cbz w10,0x009c1c94
009c1c84	ldrsw x9,[x8, #0x10]
009c1c88	add x9,x21,x9, LSL #0x3
009c1c8c	ldr x9,[x9, #0x540]
009c1c90	cbz x9,0x009c1cc8
009c1c94	ldr w1,[x8, #0x14]
009c1c98	mov x0,x19
009c1c9c	bl 0x00c36470
009c1ca0	cbz w0,0x009c1cc8
009c1ca4	ldr x0,[x21]
009c1ca8	ldr x2,[x21, #0x440]
009c1cac	mov x1,x19
009c1cb0	bl 0x00c34640
009c1cb4	cbnz x0,0x009c1cc0
009c1cb8	add x8,x20,x22
009c1cbc	str wzr,[x8, #0x24]
009c1cc0	bl 0x00c34620
009c1cc4	b 0x009c1cd0
009c1cc8	add x8,x20,x22
009c1ccc	str wzr,[x8, #0x24]
009c1cd0	add x22,x22,#0x28
009c1cd4	cmp x22,#0x460
009c1cd8	b.ne 0x009c1c64
009c1cdc	bl 0x00c35240
009c1ce0	str x20,[x21, #0x620]
009c1ce4	mov w21,#0x1
009c1ce8	mov x20,xzr
009c1cec	b 0x009c1cf4
009c1cf0	mov w21,wzr
009c1cf4	adrp x1,0x2c3000
009c1cf8	add x1,x1,#0x5d8
009c1cfc	mov w2,#0x4c1
009c1d00	mov x0,x20
009c1d04	bl 0x00c32310
009c1d08	mov x0,x19
009c1d0c	bl 0x00c32450
009c1d10	mov w0,w21
009c1d14	ldp x29,x30,[sp, #0x30]
009c1d18	ldp x20,x19,[sp, #0x20]
009c1d1c	ldp x22,x21,[sp, #0x10]
009c1d20	ldr x23,[sp], #0x40
009c1d24	ret

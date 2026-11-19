; ossl_parse_property @ 00ac5908
00ac5908	str x25,[sp, #-0x50]!
00ac590c	stp x20,x19,[sp, #0x30]
00ac5910	mov x20,x1
00ac5914	stp x24,x23,[sp, #0x10]
00ac5918	stp x22,x21,[sp, #0x20]
00ac591c	stp x29,x30,[sp, #0x40]
00ac5920	add x29,sp,#0x40
00ac5924	str x1,[sp, #0x8]
00ac5928	cbz x1,0x00ac5b44
00ac592c	mov x21,x0
00ac5930	adrp x0,0xac5000
00ac5934	add x0,x0,#0xb60
00ac5938	bl 0x00c35340
00ac593c	cbz x0,0x00ac5a54
00ac5940	mov x19,x0
00ac5944	sub x20,x20,#0x1
00ac5948	ldrb w0,[x20, #0x1]!
00ac594c	mov w1,#0x8
00ac5950	bl 0x00c377c0
00ac5954	cbnz w0,0x00ac5948
00ac5958	str x20,[sp, #0x8]
00ac595c	ldrb w8,[x20]
00ac5960	cbz w8,0x00ac5ad0
00ac5964	adrp x1,0x2d8000
00ac5968	add x1,x1,#0x6ba
00ac596c	orr w0,wzr,#0x18
00ac5970	mov w2,#0x169
00ac5974	bl 0x00c32320
00ac5978	mov x22,x0
00ac597c	cbz x0,0x00ac5b1c
00ac5980	adrp x23,0x2d8000
00ac5984	mov w24,#0x1
00ac5988	add x23,x23,#0x6ba
00ac598c	ldrb w8,[x22, #0xc]
00ac5990	add x1,sp,#0x8
00ac5994	mov x0,x21
00ac5998	mov x2,x22
00ac599c	and w8,w8,#0xfe
00ac59a0	str xzr,[x22, #0x10]
00ac59a4	strb w8,[x22, #0xc]
00ac59a8	bl 0x00ac5b80
00ac59ac	cbz w0,0x00ac5b1c
00ac59b0	ldr w8,[x22]
00ac59b4	str wzr,[x22, #0x8]
00ac59b8	cbz w8,0x00ac5a5c
00ac59bc	ldr x25,[sp, #0x8]
00ac59c0	ldrb w8,[x25]
00ac59c4	cmp w8,#0x3d
00ac59c8	b.ne 0x00ac59fc
00ac59cc	ldrb w0,[x25, #0x1]!
00ac59d0	mov w1,#0x8
00ac59d4	bl 0x00c377c0
00ac59d8	cbnz w0,0x00ac59cc
00ac59dc	add x1,sp,#0x8
00ac59e0	mov w3,#0x1
00ac59e4	mov x0,x21
00ac59e8	mov x2,x22
00ac59ec	str x25,[sp, #0x8]
00ac59f0	bl 0x00ac5d30
00ac59f4	cbnz w0,0x00ac5a04
00ac59f8	b 0x00ac5ae8
00ac59fc	str wzr,[x22, #0x4]
00ac5a00	str w24,[x22, #0x10]
00ac5a04	mov x0,x19
00ac5a08	mov x1,x22
00ac5a0c	bl 0x00c347a0
00ac5a10	cbz w0,0x00ac5b1c
00ac5a14	ldr x20,[sp, #0x8]
00ac5a18	ldrb w8,[x20]
00ac5a1c	cmp w8,#0x2c
00ac5a20	b.ne 0x00ac5a8c
00ac5a24	ldrb w0,[x20, #0x1]!
00ac5a28	mov w1,#0x8
00ac5a2c	bl 0x00c377c0
00ac5a30	cbnz w0,0x00ac5a24
00ac5a34	orr w0,wzr,#0x18
00ac5a38	mov w2,#0x169
00ac5a3c	mov x1,x23
00ac5a40	str x20,[sp, #0x8]
00ac5a44	bl 0x00c32320
00ac5a48	mov x22,x0
00ac5a4c	cbnz x0,0x00ac598c
00ac5a50	b 0x00ac5b1c
00ac5a54	mov x20,xzr
00ac5a58	b 0x00ac5b44
00ac5a5c	bl 0x00c342a0
00ac5a60	adrp x0,0x2d8000
00ac5a64	adrp x2,0x2b4000
00ac5a68	add x0,x0,#0x6ba
00ac5a6c	add x2,x2,#0x8bd
00ac5a70	mov w1,#0x172
00ac5a74	bl 0x00c342b0
00ac5a78	adrp x2,0x2dc000
00ac5a7c	add x2,x2,#0x8b5
00ac5a80	mov w0,#0x37
00ac5a84	mov w1,#0x6c
00ac5a88	b 0x00ac5b14
00ac5a8c	ldrb w8,[x20]
00ac5a90	cbz w8,0x00ac5ad0
00ac5a94	bl 0x00c342a0
00ac5a98	adrp x0,0x2d8000
00ac5a9c	adrp x2,0x2b4000
00ac5aa0	add x0,x0,#0x6ba
00ac5aa4	add x2,x2,#0x8bd
00ac5aa8	mov w1,#0x188
00ac5aac	bl 0x00c342b0
00ac5ab0	adrp x2,0x2b7000
00ac5ab4	add x2,x2,#0x91b
00ac5ab8	mov w0,#0x37
00ac5abc	mov w1,#0x6e
00ac5ac0	mov x3,x20
00ac5ac4	bl 0x00c342c0
00ac5ac8	mov x20,xzr
00ac5acc	b 0x00ac5ae0
00ac5ad0	mov x0,x21
00ac5ad4	mov x1,x19
00ac5ad8	bl 0x00ac6380
00ac5adc	mov x20,x0
00ac5ae0	mov x22,xzr
00ac5ae4	b 0x00ac5b20
00ac5ae8	bl 0x00c342a0
00ac5aec	adrp x0,0x2d8000
00ac5af0	adrp x2,0x2b4000
00ac5af4	add x0,x0,#0x6ba
00ac5af8	add x2,x2,#0x8bd
00ac5afc	mov w1,#0x178
00ac5b00	bl 0x00c342b0
00ac5b04	adrp x2,0x2b7000
00ac5b08	add x2,x2,#0x91b
00ac5b0c	mov w0,#0x37
00ac5b10	mov w1,#0x6b
00ac5b14	mov x3,x20
00ac5b18	bl 0x00c342c0
00ac5b1c	mov x20,xzr
00ac5b20	adrp x1,0x2d8000
00ac5b24	add x1,x1,#0x6ba
00ac5b28	mov w2,#0x18f
00ac5b2c	mov x0,x22
00ac5b30	bl 0x00c32310
00ac5b34	adrp x1,0xac6000
00ac5b38	add x1,x1,#0x4d8
00ac5b3c	mov x0,x19
00ac5b40	bl 0x00c32600
00ac5b44	mov x0,x20
00ac5b48	ldp x29,x30,[sp, #0x40]
00ac5b4c	ldp x20,x19,[sp, #0x30]
00ac5b50	ldp x22,x21,[sp, #0x20]
00ac5b54	ldp x24,x23,[sp, #0x10]
00ac5b58	ldr x25,[sp], #0x50
00ac5b5c	ret

; ossl_ccm_get_ctx_params @ 00b668a0
00b668a0	stp x22,x21,[sp, #-0x30]!
00b668a4	stp x20,x19,[sp, #0x10]
00b668a8	mov x20,x1
00b668ac	adrp x1,0x2c3000
00b668b0	mov x19,x0
00b668b4	add x1,x1,#0x9bc
00b668b8	mov x0,x20
00b668bc	stp x29,x30,[sp, #0x20]
00b668c0	add x29,sp,#0x20
00b668c4	bl 0x00c3e8c0
00b668c8	cbz x0,0x00b668e0
00b668cc	ldr x8,[x19, #0x8]
00b668d0	orr w9,wzr,#0xf
00b668d4	sub x1,x9,x8
00b668d8	bl 0x00c3e950
00b668dc	cbz w0,0x00b6694c
00b668e0	adrp x1,0x2ac000
00b668e4	add x1,x1,#0x107
00b668e8	mov x0,x20
00b668ec	bl 0x00c3e8c0
00b668f0	cbz x0,0x00b66900
00b668f4	ldr x1,[x19, #0x10]
00b668f8	bl 0x00c3e950
00b668fc	cbz w0,0x00b669e8
00b66900	adrp x1,0x2bd000
00b66904	add x1,x1,#0xad8
00b66908	mov x0,x20
00b6690c	bl 0x00c3e8c0
00b66910	cbz x0,0x00b66990
00b66914	ldr x8,[x19, #0x8]
00b66918	ldr x2,[x0, #0x18]
00b6691c	orr w9,wzr,#0xf
00b66920	mov x21,x0
00b66924	sub x8,x9,x8
00b66928	cmp x8,x2
00b6692c	b.ls 0x00b66968
00b66930	bl 0x00c342a0
00b66934	adrp x0,0x2d8000
00b66938	adrp x2,0x2ca000
00b6693c	add x0,x0,#0xcd7
00b66940	add x2,x2,#0x8c3
00b66944	mov w1,#0xab
00b66948	b 0x00b669d8
00b6694c	bl 0x00c342a0
00b66950	adrp x0,0x2d8000
00b66954	adrp x2,0x2ca000
00b66958	add x0,x0,#0xcd7
00b6695c	add x2,x2,#0x8c3
00b66960	mov w1,#0x9a
00b66964	b 0x00b66b78
00b66968	add x22,x19,#0x30
00b6696c	mov x0,x21
00b66970	mov x1,x22
00b66974	bl 0x00c3dab0
00b66978	cbnz w0,0x00b66990
00b6697c	ldr x2,[x21, #0x18]
00b66980	mov x0,x21
00b66984	mov x1,x22
00b66988	bl 0x00c3daa0
00b6698c	cbz w0,0x00b66b28
00b66990	adrp x1,0x2af000
00b66994	add x1,x1,#0xfc0
00b66998	mov x0,x20
00b6699c	bl 0x00c3e8c0
00b669a0	cbz x0,0x00b66a2c
00b669a4	ldr x8,[x19, #0x8]
00b669a8	ldr x2,[x0, #0x18]
00b669ac	orr w9,wzr,#0xf
00b669b0	mov x21,x0
00b669b4	sub x8,x9,x8
00b669b8	cmp x8,x2
00b669bc	b.ls 0x00b66a04
00b669c0	bl 0x00c342a0
00b669c4	adrp x0,0x2d8000
00b669c8	adrp x2,0x2ca000
00b669cc	add x0,x0,#0xcd7
00b669d0	add x2,x2,#0x8c3
00b669d4	mov w1,#0xb8
00b669d8	bl 0x00c342b0
00b669dc	mov w0,#0x39
00b669e0	mov w1,#0x6d
00b669e4	b 0x00b66b84
00b669e8	bl 0x00c342a0
00b669ec	adrp x0,0x2d8000
00b669f0	adrp x2,0x2ca000
00b669f4	add x0,x0,#0xcd7
00b669f8	add x2,x2,#0x8c3
00b669fc	mov w1,#0xa3
00b66a00	b 0x00b66b78
00b66a04	add x22,x19,#0x30
00b66a08	mov x0,x21
00b66a0c	mov x1,x22
00b66a10	bl 0x00c3dab0
00b66a14	cbnz w0,0x00b66a2c
00b66a18	ldr x2,[x21, #0x18]
00b66a1c	mov x0,x21
00b66a20	mov x1,x22
00b66a24	bl 0x00c3daa0
00b66a28	cbz w0,0x00b66b60
00b66a2c	adrp x1,0x2bd000
00b66a30	add x1,x1,#0xa97
00b66a34	mov x0,x20
00b66a38	bl 0x00c3e8c0
00b66a3c	cbz x0,0x00b66a4c
00b66a40	ldr x1,[x19, #0x18]
00b66a44	bl 0x00c3e950
00b66a48	cbz w0,0x00b66ac8
00b66a4c	adrp x1,0x2d1000
00b66a50	add x1,x1,#0xa00
00b66a54	mov x0,x20
00b66a58	bl 0x00c3e8c0
00b66a5c	cbz x0,0x00b66a6c
00b66a60	ldr x1,[x19, #0x28]
00b66a64	bl 0x00c3e950
00b66a68	cbz w0,0x00b66ae4
00b66a6c	adrp x1,0x2c5000
00b66a70	add x1,x1,#0xa75
00b66a74	mov x0,x20
00b66a78	bl 0x00c3e8c0
00b66a7c	cbz x0,0x00b66ac0
00b66a80	ldrb w8,[x19]
00b66a84	mov w9,#0x9
00b66a88	bics wzr,w9,w8
00b66a8c	b.ne 0x00b66b00
00b66a90	ldr w8,[x0, #0x8]
00b66a94	cmp w8,#0x5
00b66a98	b.ne 0x00b66b44
00b66a9c	ldr x8,[x19, #0x90]
00b66aa0	ldp x1,x2,[x0, #0x10]
00b66aa4	mov x0,x19
00b66aa8	ldr x8,[x8, #0x28]
00b66aac	blr x8
00b66ab0	cbz w0,0x00b66b90
00b66ab4	ldrb w8,[x19]
00b66ab8	and w8,w8,#0xffffffe3
00b66abc	strb w8,[x19]
00b66ac0	mov w0,#0x1
00b66ac4	b 0x00b66b90
00b66ac8	bl 0x00c342a0
00b66acc	adrp x0,0x2d8000
00b66ad0	adrp x2,0x2ca000
00b66ad4	add x0,x0,#0xcd7
00b66ad8	add x2,x2,#0x8c3
00b66adc	mov w1,#0xc4
00b66ae0	b 0x00b66b78
00b66ae4	bl 0x00c342a0
00b66ae8	adrp x0,0x2d8000
00b66aec	adrp x2,0x2ca000
00b66af0	add x0,x0,#0xcd7
00b66af4	add x2,x2,#0x8c3
00b66af8	mov w1,#0xca
00b66afc	b 0x00b66b78
00b66b00	bl 0x00c342a0
00b66b04	adrp x0,0x2d8000
00b66b08	adrp x2,0x2ca000
00b66b0c	add x0,x0,#0xcd7
00b66b10	add x2,x2,#0x8c3
00b66b14	mov w1,#0xd1
00b66b18	bl 0x00c342b0
00b66b1c	mov w0,#0x39
00b66b20	mov w1,#0x77
00b66b24	b 0x00b66b84
00b66b28	bl 0x00c342a0
00b66b2c	adrp x0,0x2d8000
00b66b30	adrp x2,0x2ca000
00b66b34	add x0,x0,#0xcd7
00b66b38	add x2,x2,#0x8c3
00b66b3c	mov w1,#0xb0
00b66b40	b 0x00b66b78
00b66b44	bl 0x00c342a0
00b66b48	adrp x0,0x2d8000
00b66b4c	adrp x2,0x2ca000
00b66b50	add x0,x0,#0xcd7
00b66b54	add x2,x2,#0x8c3
00b66b58	mov w1,#0xd5
00b66b5c	b 0x00b66b78
00b66b60	bl 0x00c342a0
00b66b64	adrp x0,0x2d8000
00b66b68	adrp x2,0x2ca000
00b66b6c	add x0,x0,#0xcd7
00b66b70	add x2,x2,#0x8c3
00b66b74	mov w1,#0xbd
00b66b78	bl 0x00c342b0
00b66b7c	mov w0,#0x39
00b66b80	mov w1,#0x68
00b66b84	mov x2,xzr
00b66b88	bl 0x00c342c0
00b66b8c	mov w0,wzr
00b66b90	ldp x29,x30,[sp, #0x20]
00b66b94	ldp x20,x19,[sp, #0x10]
00b66b98	ldp x22,x21,[sp], #0x30
00b66b9c	ret

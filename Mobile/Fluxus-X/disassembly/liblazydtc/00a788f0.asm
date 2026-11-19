; ossl_dh_kdf_X9_42_asn1 @ 00a788f0
00a788f0	sub sp,sp,#0x160
00a788f4	stp x29,x30,[sp, #0x150]
00a788f8	add x29,sp,#0x150
00a788fc	stp x22,x21,[sp, #0x130]
00a78900	stp x20,x19,[sp, #0x140]
00a78904	ldp x19,x22,[x29, #0x10]
00a78908	mov x21,x0
00a7890c	mov x0,x7
00a78910	stp x28,x27,[sp, #0x100]
00a78914	stp x26,x25,[sp, #0x110]
00a78918	stp x24,x23,[sp, #0x120]
00a7891c	mov x24,x6
00a78920	mov x25,x5
00a78924	mov x23,x4
00a78928	mov x26,x3
00a7892c	mov x27,x2
00a78930	mov x20,x1
00a78934	bl 0x00c36230
00a78938	adrp x1,0x2c7000
00a7893c	mov x28,x0
00a78940	add x1,x1,#0xa2f
00a78944	mov x0,x19
00a78948	mov x2,x22
00a7894c	bl 0x00c36210
00a78950	cbz x0,0x00a78a70
00a78954	mov x19,x0
00a78958	bl 0x00c361f0
00a7895c	mov x22,x0
00a78960	cbz x0,0x00a78a78
00a78964	adrp x0,0x29d000
00a78968	add x0,x0,#0xe2e
00a7896c	add x8,sp,#0x8
00a78970	mov x1,x28
00a78974	mov x2,xzr
00a78978	str x20,[sp]
00a7897c	bl 0x00c36280
00a78980	ldr x8,[sp, #0x28]
00a78984	ldur q0,[sp, #0x18]
00a78988	ldur q1,[sp, #0x8]
00a7898c	adrp x0,0x2c5000
00a78990	add x20,sp,#0x30
00a78994	str x8,[sp, #0x50]
00a78998	add x0,x0,#0x67e
00a7899c	add x8,sp,#0x8
00a789a0	mov x1,x27
00a789a4	mov x2,x26
00a789a8	stp q1,q0,[sp, #0x30]
00a789ac	add x28,x20,#0x50
00a789b0	bl 0x00c34c50
00a789b4	ldr x8,[sp, #0x28]
00a789b8	ldur q0,[sp, #0x18]
00a789bc	ldur q1,[sp, #0x8]
00a789c0	str x8,[sp, #0x78]
00a789c4	stur q0,[sp, #0x68]
00a789c8	stur q1,[sp, #0x58]
00a789cc	cbz x25,0x00a78a04
00a789d0	adrp x0,0x2bb000
00a789d4	add x0,x0,#0xce2
00a789d8	add x8,sp,#0x8
00a789dc	mov x1,x25
00a789e0	mov x2,x24
00a789e4	add x20,x20,#0x78
00a789e8	bl 0x00c34c50
00a789ec	ldr x8,[sp, #0x28]
00a789f0	ldur q0,[sp, #0x8]
00a789f4	ldur q1,[sp, #0x18]
00a789f8	str x8,[x28, #0x20]
00a789fc	stp q0,q1,[x28]
00a78a00	mov x28,x20
00a78a04	adrp x0,0x2b5000
00a78a08	add x0,x0,#0xd11
00a78a0c	add x8,sp,#0x8
00a78a10	mov x1,x23
00a78a14	mov x2,xzr
00a78a18	bl 0x00c36280
00a78a1c	ldr x8,[sp, #0x28]
00a78a20	ldur q0,[sp, #0x8]
00a78a24	ldur q1,[sp, #0x18]
00a78a28	str x8,[x28, #0x20]
00a78a2c	add x8,sp,#0x8
00a78a30	stp q0,q1,[x28]
00a78a34	bl 0x00c34c40
00a78a38	ldr x8,[sp, #0x28]
00a78a3c	ldur q0,[sp, #0x18]
00a78a40	ldur q1,[sp, #0x8]
00a78a44	ldr x2,[sp]
00a78a48	add x3,sp,#0x30
00a78a4c	mov x0,x22
00a78a50	mov x1,x21
00a78a54	str x8,[x28, #0x48]
00a78a58	stur q0,[x28, #0x38]
00a78a5c	stur q1,[x28, #0x28]
00a78a60	bl 0x00c36200
00a78a64	cmp w0,#0x0
00a78a68	cset w20,gt
00a78a6c	b 0x00a78a7c
00a78a70	mov w20,wzr
00a78a74	b 0x00a78a8c
00a78a78	mov w20,wzr
00a78a7c	mov x0,x22
00a78a80	bl 0x00c361e0
00a78a84	mov x0,x19
00a78a88	bl 0x00c36220
00a78a8c	mov w0,w20
00a78a90	ldp x29,x30,[sp, #0x150]
00a78a94	ldp x20,x19,[sp, #0x140]
00a78a98	ldp x22,x21,[sp, #0x130]
00a78a9c	ldp x24,x23,[sp, #0x120]
00a78aa0	ldp x26,x25,[sp, #0x110]
00a78aa4	ldp x28,x27,[sp, #0x100]
00a78aa8	add sp,sp,#0x160
00a78aac	ret

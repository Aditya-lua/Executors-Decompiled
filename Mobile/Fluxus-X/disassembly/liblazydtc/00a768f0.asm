; EVP_PKEY_CTX_add1_hkdf_info @ 00a768f0
00a768f0	sub sp,sp,#0xc0
00a768f4	stp x22,x21,[sp, #0x90]
00a768f8	mov w21,w2
00a768fc	stp x24,x23,[sp, #0x80]
00a76900	stp x20,x19,[sp, #0xa0]
00a76904	stp x29,x30,[sp, #0xb0]
00a76908	add x29,sp,#0xb0
00a7690c	cbz x0,0x00a7691c
00a76910	ldrb w8,[x0, #0x1]
00a76914	mov x19,x0
00a76918	tbnz w8,#0x3,0x00a76968
00a7691c	bl 0x00c342a0
00a76920	adrp x0,0x2c3000
00a76924	adrp x2,0x2c7000
00a76928	add x0,x0,#0xa9f
00a7692c	add x2,x2,#0xa64
00a76930	mov w1,#0x413
00a76934	bl 0x00c342b0
00a76938	orr w0,wzr,#0x6
00a7693c	mov w1,#0x93
00a76940	mov x2,xzr
00a76944	bl 0x00c342c0
00a76948	orr w19,wzr,#0xfffffffe
00a7694c	mov w0,w19
00a76950	ldp x29,x30,[sp, #0xb0]
00a76954	ldp x20,x19,[sp, #0xa0]
00a76958	ldp x22,x21,[sp, #0x90]
00a7695c	ldp x24,x23,[sp, #0x80]
00a76960	add sp,sp,#0xc0
00a76964	ret
00a76968	ldr x8,[x19, #0x30]
00a7696c	mov x20,x1
00a76970	cbz x8,0x00a76a74
00a76974	tbnz w21,#0x1f,0x00a76acc
00a76978	cbz w21,0x00a76b08
00a7697c	adrp x0,0x29e000
00a76980	add x0,x0,#0x225
00a76984	add x8,sp,#0x8
00a76988	mov x1,xzr
00a7698c	mov x2,xzr
00a76990	bl 0x00c34c50
00a76994	ldr x8,[sp, #0x28]
00a76998	ldur q0,[sp, #0x18]
00a7699c	ldur q1,[sp, #0x8]
00a769a0	str x8,[sp, #0x50]
00a769a4	add x8,sp,#0x8
00a769a8	stp q1,q0,[sp, #0x30]
00a769ac	bl 0x00c34c40
00a769b0	ldr x8,[sp, #0x28]
00a769b4	ldur q0,[sp, #0x18]
00a769b8	ldur q1,[sp, #0x8]
00a769bc	add x1,sp,#0x30
00a769c0	mov x0,x19
00a769c4	str x8,[sp, #0x78]
00a769c8	stur q0,[sp, #0x68]
00a769cc	stur q1,[sp, #0x58]
00a769d0	bl 0x00a75d88
00a769d4	cbz w0,0x00a76b00
00a769d8	ldr x8,[sp, #0x50]
00a769dc	cmn x8,#0x1
00a769e0	b.eq 0x00a76b10
00a769e4	sxtw x23,w21
00a769e8	adds x21,x8,x23
00a769ec	b.eq 0x00a76b00
00a769f0	adrp x1,0x2c3000
00a769f4	add x1,x1,#0xa9f
00a769f8	mov w2,#0x432
00a769fc	mov x0,x21
00a76a00	bl 0x00c34250
00a76a04	cbz x0,0x00a76b00
00a76a08	ldr x24,[sp, #0x50]
00a76a0c	mov x22,x0
00a76a10	adrp x0,0x29e000
00a76a14	add x0,x0,#0x225
00a76a18	add x8,sp,#0x8
00a76a1c	mov x1,x22
00a76a20	mov x2,x21
00a76a24	bl 0x00c34c50
00a76a28	ldr x8,[sp, #0x28]
00a76a2c	ldur q0,[sp, #0x18]
00a76a30	ldur q1,[sp, #0x8]
00a76a34	str x8,[sp, #0x50]
00a76a38	stp q1,q0,[sp, #0x30]
00a76a3c	cbz x24,0x00a76a50
00a76a40	add x1,sp,#0x30
00a76a44	mov x0,x19
00a76a48	bl 0x00a75d88
00a76a4c	cbz w0,0x00a76b3c
00a76a50	add x0,x22,x24
00a76a54	mov x1,x20
00a76a58	mov x2,x23
00a76a5c	bl 0x00c2ffd0
00a76a60	add x1,sp,#0x30
00a76a64	mov x0,x19
00a76a68	bl 0x00a75c0c
00a76a6c	mov w19,w0
00a76a70	b 0x00a76b40
00a76a74	bl 0x00c35250
00a76a78	bl 0x00c342a0
00a76a7c	adrp x0,0x2c3000
00a76a80	adrp x2,0x2b0000
00a76a84	add x0,x0,#0xa9f
00a76a88	add x2,x2,#0xb2
00a76a8c	mov w1,#0x5f6
00a76a90	bl 0x00c342b0
00a76a94	orr w0,wzr,#0x6
00a76a98	mov w1,#0x93
00a76a9c	mov x2,xzr
00a76aa0	bl 0x00c342c0
00a76aa4	bl 0x00c35240
00a76aa8	mov w1,#0xffffffff
00a76aac	mov w2,#0x800
00a76ab0	mov w3,#0x1006
00a76ab4	mov x0,x19
00a76ab8	mov w4,w21
00a76abc	mov x5,x20
00a76ac0	bl 0x00a77554
00a76ac4	mov w19,w0
00a76ac8	b 0x00a7694c
00a76acc	bl 0x00c342a0
00a76ad0	adrp x0,0x2c3000
00a76ad4	adrp x2,0x2c7000
00a76ad8	add x0,x0,#0xa9f
00a76adc	add x2,x2,#0xa64
00a76ae0	mov w1,#0x41e
00a76ae4	bl 0x00c342b0
00a76ae8	orr w0,wzr,#0x6
00a76aec	mov w1,#0xdd
00a76af0	mov x2,xzr
00a76af4	bl 0x00c342c0
00a76af8	mov w19,wzr
00a76afc	b 0x00a7694c
00a76b00	mov w19,wzr
00a76b04	b 0x00a7694c
00a76b08	mov w19,#0x1
00a76b0c	b 0x00a7694c
00a76b10	adrp x2,0x29e000
00a76b14	add x2,x2,#0x225
00a76b18	mov w3,#0x800
00a76b1c	mov w4,#0x1006
00a76b20	mov x0,x19
00a76b24	mov w1,wzr
00a76b28	mov x5,x20
00a76b2c	mov w6,w21
00a76b30	bl 0x00a766c4
00a76b34	mov w19,w0
00a76b38	b 0x00a7694c
00a76b3c	mov w19,wzr
00a76b40	adrp x2,0x2c3000
00a76b44	add x2,x2,#0xa9f
00a76b48	mov w3,#0x444
00a76b4c	mov x0,x22
00a76b50	mov x1,x21
00a76b54	bl 0x00c345e0
00a76b58	b 0x00a7694c

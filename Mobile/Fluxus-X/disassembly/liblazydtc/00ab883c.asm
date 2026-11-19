; PEM_write_bio_PrivateKey_traditional @ 00ab883c
00ab883c	sub sp,sp,#0xb0
00ab8840	stp x29,x30,[sp, #0xa0]
00ab8844	add x29,sp,#0xa0
00ab8848	str x25,[sp, #0x60]
00ab884c	stp x24,x23,[sp, #0x70]
00ab8850	stp x22,x21,[sp, #0x80]
00ab8854	stp x20,x19,[sp, #0x90]
00ab8858	stur xzr,[x29, #-0x38]
00ab885c	cbz x1,0x00ab8948
00ab8860	ldr x8,[x1, #0x20]
00ab8864	mov x22,x6
00ab8868	mov x19,x5
00ab886c	mov w20,w4
00ab8870	mov x21,x3
00ab8874	mov x23,x2
00ab8878	mov x24,x1
00ab887c	mov x25,x0
00ab8880	cbnz x8,0x00ab888c
00ab8884	ldr x8,[x24, #0x68]
00ab8888	cbz x8,0x00ab88ac
00ab888c	ldr x8,[x24, #0x60]
00ab8890	cbz x8,0x00ab88ac
00ab8894	sub x0,x29,#0x38
00ab8898	mov x1,x24
00ab889c	bl 0x00c3d9b0
00ab88a0	ldur x8,[x29, #-0x38]
00ab88a4	cmp w0,#0x0
00ab88a8	csel x24,x24,x8,eq
00ab88ac	ldr x8,[x24, #0x8]
00ab88b0	cbz x8,0x00ab8914
00ab88b4	ldr x9,[x8, #0xc0]
00ab88b8	cbz x9,0x00ab8914
00ab88bc	ldr x3,[x8, #0x10]
00ab88c0	adrp x2,0x2d6000
00ab88c4	add x2,x2,#0x45a
00ab88c8	add x0,sp,#0x10
00ab88cc	mov w1,#0x50
00ab88d0	bl 0x00c34d30
00ab88d4	adrp x0,0xcb5000
00ab88d8	ldr x0,[x0, #0x360]
00ab88dc	add x1,sp,#0x10
00ab88e0	mov x2,x25
00ab88e4	mov x3,x24
00ab88e8	mov x4,x23
00ab88ec	mov x5,x21
00ab88f0	mov w6,w20
00ab88f4	mov x7,x19
00ab88f8	str x22,[sp]
00ab88fc	bl 0x00c36070
00ab8900	ldur x8,[x29, #-0x38]
00ab8904	mov w19,w0
00ab8908	mov x0,x8
00ab890c	bl 0x00c32450
00ab8910	b 0x00ab894c
00ab8914	bl 0x00c342a0
00ab8918	adrp x0,0x2d6000
00ab891c	adrp x2,0x2c6000
00ab8920	add x0,x0,#0x444
00ab8924	add x2,x2,#0x13b
00ab8928	mov w1,#0x165
00ab892c	bl 0x00c342b0
00ab8930	mov w0,#0x9
00ab8934	mov w1,#0x6e
00ab8938	mov x2,xzr
00ab893c	bl 0x00c342c0
00ab8940	ldur x0,[x29, #-0x38]
00ab8944	bl 0x00c32450
00ab8948	mov w19,wzr
00ab894c	mov w0,w19
00ab8950	ldp x29,x30,[sp, #0xa0]
00ab8954	ldp x20,x19,[sp, #0x90]
00ab8958	ldp x22,x21,[sp, #0x80]
00ab895c	ldp x24,x23,[sp, #0x70]
00ab8960	ldr x25,[sp, #0x60]
00ab8964	add sp,sp,#0xb0
00ab8968	ret

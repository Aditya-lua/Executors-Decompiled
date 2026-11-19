; OPENSSL_sk_deep_copy @ 00ae8850
00ae8850	str x23,[sp, #-0x40]!
00ae8854	stp x22,x21,[sp, #0x10]
00ae8858	mov x21,x1
00ae885c	adrp x1,0x2c6000
00ae8860	stp x20,x19,[sp, #0x20]
00ae8864	mov x20,x2
00ae8868	mov x22,x0
00ae886c	add x1,x1,#0x275
00ae8870	mov w0,#0x20
00ae8874	mov w2,#0x57
00ae8878	stp x29,x30,[sp, #0x30]
00ae887c	add x29,sp,#0x30
00ae8880	bl 0x00c32320
00ae8884	mov x19,x0
00ae8888	cbz x0,0x00ae8914
00ae888c	cbz x22,0x00ae8948
00ae8890	ldr q0,[x22, #0x10]
00ae8894	str q0,[x19, #0x10]
00ae8898	ldr q0,[x22]
00ae889c	str q0,[x19]
00ae88a0	ldr w8,[x22]
00ae88a4	cbz w8,0x00ae8954
00ae88a8	cmp w8,#0x4
00ae88ac	mov w9,#0x4
00ae88b0	csel w8,w8,w9,gt
00ae88b4	adrp x1,0x2c6000
00ae88b8	lsl x0,x8,#0x3
00ae88bc	add x1,x1,#0x275
00ae88c0	mov w2,#0x6b
00ae88c4	str w8,[x19, #0x14]
00ae88c8	bl 0x00c34250
00ae88cc	str x0,[x19, #0x8]
00ae88d0	cbz x0,0x00ae899c
00ae88d4	ldr w8,[x19]
00ae88d8	cmp w8,#0x1
00ae88dc	b.lt 0x00ae895c
00ae88e0	mov x23,xzr
00ae88e4	ldr x9,[x22, #0x8]
00ae88e8	ldr x0,[x9, x23, LSL #0x3]
00ae88ec	cbz x0,0x00ae8904
00ae88f0	blr x21
00ae88f4	ldr x8,[x19, #0x8]
00ae88f8	str x0,[x8, x23, LSL #0x3]
00ae88fc	cbz x0,0x00ae8974
00ae8900	ldr w8,[x19]
00ae8904	add x23,x23,#0x1
00ae8908	cmp x23,w8, SXTW 
00ae890c	b.lt 0x00ae88e4
00ae8910	b 0x00ae895c
00ae8914	bl 0x00c342a0
00ae8918	adrp x0,0x2c6000
00ae891c	adrp x2,0x2bc000
00ae8920	add x0,x0,#0x275
00ae8924	add x2,x2,#0x43d
00ae8928	orr w1,wzr,#0x7c
00ae892c	bl 0x00c342b0
00ae8930	mov w1,#0x100
00ae8934	orr w0,wzr,#0xf
00ae8938	movk w1,#0xc, LSL #16
00ae893c	mov x2,xzr
00ae8940	bl 0x00c342c0
00ae8944	b 0x00ae895c
00ae8948	str wzr,[x19]
00ae894c	str wzr,[x19, #0x10]
00ae8950	str xzr,[x19, #0x18]
00ae8954	str xzr,[x19, #0x8]
00ae8958	str wzr,[x19, #0x14]
00ae895c	mov x0,x19
00ae8960	ldp x29,x30,[sp, #0x30]
00ae8964	ldp x20,x19,[sp, #0x20]
00ae8968	ldp x22,x21,[sp, #0x10]
00ae896c	ldr x23,[sp], #0x40
00ae8970	ret
00ae8974	cbz w23,0x00ae899c
00ae8978	sub x21,x23,#0x1
00ae897c	ldr x8,[x19, #0x8]
00ae8980	ldr x0,[x8, x21, LSL #0x3]
00ae8984	cbz x0,0x00ae898c
00ae8988	blr x20
00ae898c	add x8,x21,#0x1
00ae8990	sub x21,x21,#0x1
00ae8994	cmp x8,#0x1
00ae8998	b.gt 0x00ae897c
00ae899c	bl 0x00c342a0
00ae89a0	adrp x0,0x2c6000
00ae89a4	adrp x2,0x2bc000
00ae89a8	add x0,x0,#0x275
00ae89ac	add x2,x2,#0x43d
00ae89b0	orr w1,wzr,#0x7c
00ae89b4	bl 0x00c342b0
00ae89b8	mov w1,#0x100
00ae89bc	orr w0,wzr,#0xf
00ae89c0	movk w1,#0xc, LSL #16
00ae89c4	mov x2,xzr
00ae89c8	bl 0x00c342c0
00ae89cc	cbz x19,0x00ae895c
00ae89d0	ldr x0,[x19, #0x8]
00ae89d4	adrp x20,0x2c6000
00ae89d8	add x20,x20,#0x275
00ae89dc	mov w2,#0x1b2
00ae89e0	mov x1,x20
00ae89e4	bl 0x00c32310
00ae89e8	mov w2,#0x1b3
00ae89ec	mov x0,x19
00ae89f0	mov x1,x20
00ae89f4	bl 0x00c32310
00ae89f8	mov x19,xzr
00ae89fc	b 0x00ae895c

; mbedtls_rsa_rsassa_pss_verify_ext @ 00ba8674
00ba8674	stp x28,x27,[sp, #-0x60]!
00ba8678	stp x26,x25,[sp, #0x10]
00ba867c	stp x24,x23,[sp, #0x20]
00ba8680	stp x22,x21,[sp, #0x30]
00ba8684	stp x20,x19,[sp, #0x40]
00ba8688	stp x29,x30,[sp, #0x50]
00ba868c	add x29,sp,#0x50
00ba8690	sub sp,sp,#0x450
00ba8694	mrs x26,tpidr_el0
00ba8698	ldr x8,[x26, #0x28]
00ba869c	mov w21,w2
00ba86a0	mov w24,w1
00ba86a4	mov x23,x0
00ba86a8	mov x0,sp
00ba86ac	mov w2,#0x400
00ba86b0	mov w1,wzr
00ba86b4	mov x25,x6
00ba86b8	mov w22,w5
00ba86bc	mov w19,w4
00ba86c0	mov x20,x3
00ba86c4	stur x8,[x29, #-0x60]
00ba86c8	bl 0x00c301c0
00ba86cc	orr w8,w21,w24
00ba86d0	cbz w8,0x00ba86d8
00ba86d4	cbz x20,0x00ba86e8
00ba86d8	ldr x27,[x23, #0x8]
00ba86dc	sub x8,x27,#0x10
00ba86e0	cmp x8,#0x3f0
00ba86e4	b.ls 0x00ba871c
00ba86e8	mov w0,#0xffffbf80
00ba86ec	ldr x8,[x26, #0x28]
00ba86f0	ldur x9,[x29, #-0x60]
00ba86f4	cmp x8,x9
00ba86f8	b.ne 0x00ba8894
00ba86fc	add sp,sp,#0x450
00ba8700	ldp x29,x30,[sp, #0x50]
00ba8704	ldp x20,x19,[sp, #0x40]
00ba8708	ldp x22,x21,[sp, #0x30]
00ba870c	ldp x24,x23,[sp, #0x20]
00ba8710	ldp x26,x25,[sp, #0x10]
00ba8714	ldp x28,x27,[sp], #0x60
00ba8718	ret
00ba871c	mov x2,sp
00ba8720	mov x0,x23
00ba8724	mov x1,x25
00ba8728	mov x28,sp
00ba872c	bl 0x00c43470
00ba8730	cbnz w0,0x00ba86ec
00ba8734	sub x25,x27,#0x1
00ba8738	ldrb w8,[x28, x25]
00ba873c	cmp w8,#0xbc
00ba8740	b.ne 0x00ba8850
00ba8744	cbz w24,0x00ba8768
00ba8748	mov w0,w24
00ba874c	bl 0x00c30210
00ba8750	bl 0x00c302d0
00ba8754	tst w0,#0xff
00ba8758	b.eq 0x00ba86e8
00ba875c	mov w8,w21
00ba8760	cmp x8,w0, UXTB 
00ba8764	b.ne 0x00ba86e8
00ba8768	mov w0,w19
00ba876c	bl 0x00c30210
00ba8770	bl 0x00c302d0
00ba8774	mov w24,w0
00ba8778	and w8,w0,#0xff
00ba877c	cbz w8,0x00ba86e8
00ba8780	add x0,x23,#0x10
00ba8784	bl 0x00c41b30
00ba8788	ldrb w8,[sp]
00ba878c	mov w9,#0x8
00ba8790	sub x28,x0,#0x1
00ba8794	sub w9,w9,w27, LSL #0x3
00ba8798	add w9,w9,w28
00ba879c	lsr w8,w8,w9
00ba87a0	cbnz w8,0x00ba86e8
00ba87a4	and x23,x24,#0xff
00ba87a8	mov x8,sp
00ba87ac	tst x28,#0x7
00ba87b0	orr x9,x8,#0x1
00ba87b4	csel x27,x25,x27,eq
00ba87b8	add x10,x23,#0x2
00ba87bc	csel x25,x9,x8,eq
00ba87c0	cmp x27,x10
00ba87c4	b.cc 0x00ba86e8
00ba87c8	neg x8,x23
00ba87cc	add x9,x25,x27
00ba87d0	add x8,x9,x8
00ba87d4	mvn x10,x23
00ba87d8	sub x24,x8,#0x1
00ba87dc	add x1,x27,x10
00ba87e0	mov x0,x25
00ba87e4	mov x2,x24
00ba87e8	mov x3,x23
00ba87ec	mov w4,w19
00ba87f0	bl 0x00ba76c0
00ba87f4	cbnz w0,0x00ba86ec
00ba87f8	ldrb w9,[sp]
00ba87fc	lsl w8,w27,#0x3
00ba8800	orr w10,wzr,#0xff
00ba8804	sub w8,w8,w28
00ba8808	lsr w8,w10,w8
00ba880c	and w8,w9,w8
00ba8810	sub x9,x24,#0x1
00ba8814	strb w8,[sp]
00ba8818	cmp x25,x9
00ba881c	b.cs 0x00ba882c
00ba8820	ldrb w8,[x25], #0x1
00ba8824	cbz w8,0x00ba8818
00ba8828	b 0x00ba8830
00ba882c	ldrb w8,[x25], #0x1
00ba8830	cmp w8,#0x1
00ba8834	b.ne 0x00ba8850
00ba8838	cmn w22,#0x1
00ba883c	sub x3,x24,x25
00ba8840	b.eq 0x00ba8858
00ba8844	sxtw x8,w22
00ba8848	cmp x3,x8
00ba884c	b.eq 0x00ba8858
00ba8850	mov w0,#0xffffbf00
00ba8854	b 0x00ba86ec
00ba8858	mov w1,w21
00ba885c	sub x4,x29,#0xa0
00ba8860	mov x0,x20
00ba8864	mov x2,x25
00ba8868	mov w5,w19
00ba886c	bl 0x00ba8898
00ba8870	cbnz w0,0x00ba86ec
00ba8874	sub x1,x29,#0xa0
00ba8878	mov x0,x24
00ba887c	mov x2,x23
00ba8880	bl 0x00c300b0
00ba8884	cmp w0,#0x0
00ba8888	mov w8,#0xffffbc80
00ba888c	csel w0,wzr,w8,eq
00ba8890	b 0x00ba86ec
00ba8894	bl 0x00c2fec0

; FUN_00af86d8 @ 00af86d8
00af86d8	sub sp,sp,#0x60
00af86dc	stp x26,x25,[sp, #0x10]
00af86e0	stp x24,x23,[sp, #0x20]
00af86e4	stp x22,x21,[sp, #0x30]
00af86e8	stp x20,x19,[sp, #0x40]
00af86ec	stp x29,x30,[sp, #0x50]
00af86f0	ldrsw x21,[x3]
00af86f4	add x29,sp,#0x50
00af86f8	tbnz w21,#0x1f,0x00af8774
00af86fc	mov x22,x3
00af8700	mov w20,w2
00af8704	mov x19,x0
00af8708	cmp w1,#0x1
00af870c	b.eq 0x00af877c
00af8710	cmp w1,#0x2
00af8714	b.ne 0x00af87d8
00af8718	cmp w21,#0x10
00af871c	mov w0,wzr
00af8720	b.gt 0x00af89a0
00af8724	cmp w21,#0x1
00af8728	b.lt 0x00af8844
00af872c	ldr x1,[x22, #0x8]
00af8730	mov x0,sp
00af8734	mov x2,x21
00af8738	bl 0x00c2ffd0
00af873c	ldr x8,[x22, #0x10]
00af8740	ands x8,x8,#0x7
00af8744	b.eq 0x00af8868
00af8748	mov w9,#0x8
00af874c	sub w8,w9,w8
00af8750	mov x9,sp
00af8754	tst w20,#0xff
00af8758	add x9,x9,x21
00af875c	b.eq 0x00af8854
00af8760	ldurb w10,[x9, #-0x1]
00af8764	orr w11,wzr,#0xff
00af8768	lsr w8,w11,w8
00af876c	orr w8,w10,w8
00af8770	b 0x00af8864
00af8774	mov w0,wzr
00af8778	b 0x00af89a0
00af877c	cmp w21,#0x4
00af8780	mov w0,wzr
00af8784	b.gt 0x00af89a0
00af8788	cmp w21,#0x1
00af878c	b.lt 0x00af884c
00af8790	ldr x1,[x22, #0x8]
00af8794	mov x0,sp
00af8798	mov x2,x21
00af879c	bl 0x00c2ffd0
00af87a0	ldr x8,[x22, #0x10]
00af87a4	ands x8,x8,#0x7
00af87a8	b.eq 0x00af8960
00af87ac	mov w9,#0x8
00af87b0	sub w8,w9,w8
00af87b4	mov x9,sp
00af87b8	tst w20,#0xff
00af87bc	add x9,x9,x21
00af87c0	b.eq 0x00af894c
00af87c4	ldurb w10,[x9, #-0x1]
00af87c8	orr w11,wzr,#0xff
00af87cc	lsr w8,w11,w8
00af87d0	orr w8,w10,w8
00af87d4	b 0x00af895c
00af87d8	cmp w21,#0x1
00af87dc	b.lt 0x00af8828
00af87e0	adrp x23,0x2bc000
00af87e4	adrp x24,0x2ab000
00af87e8	adrp x20,0x2aa000
00af87ec	mov x21,xzr
00af87f0	add x23,x23,#0xda4
00af87f4	add x24,x24,#0x32c
00af87f8	add x20,x20,#0xa3f
00af87fc	ldr x8,[x22, #0x8]
00af8800	cmp x21,#0x0
00af8804	csel x2,x24,x23,eq
00af8808	mov x0,x19
00af880c	ldrb w3,[x8, x21]
00af8810	mov x1,x20
00af8814	bl 0x00c32250
00af8818	ldrsw x8,[x22]
00af881c	add x21,x21,#0x1
00af8820	cmp x21,x8
00af8824	b.lt 0x00af87fc
00af8828	ldr w8,[x22, #0x10]
00af882c	adrp x1,0x2d4000
00af8830	add x1,x1,#0x4cc
00af8834	mov x0,x19
00af8838	and w2,w8,#0x7
00af883c	bl 0x00c32250
00af8840	b 0x00af899c
00af8844	mov x8,xzr
00af8848	b 0x00af886c
00af884c	mov x8,xzr
00af8850	b 0x00af8964
00af8854	ldurb w10,[x9, #-0x1]
00af8858	orr w11,wzr,#0xffffff00
00af885c	asr w8,w11,w8
00af8860	and w8,w10,w8
00af8864	sturb w8,[x9, #-0x1]
00af8868	mov x8,x21
00af886c	mov x23,sp
00af8870	mov w22,#0x10
00af8874	add x0,x23,x8
00af8878	sub w8,w22,w21
00af887c	sxtw x2,w8
00af8880	mov w1,w20
00af8884	bl 0x00c301c0
00af8888	add x8,x23,#0xf
00af888c	cbz x22,0x00af8928
00af8890	add x9,x8,x22
00af8894	ldurb w10,[x9, #-0x10]
00af8898	mov x21,x22
00af889c	cbnz w10,0x00af88ac
00af88a0	ldurb w9,[x9, #-0x11]
00af88a4	sub x22,x21,#0x2
00af88a8	cbz w9,0x00af888c
00af88ac	cmp w21,#0x1
00af88b0	b.lt 0x00af8928
00af88b4	adrp x25,0x2ab000
00af88b8	adrp x26,0x2bc000
00af88bc	adrp x20,0x2c8000
00af88c0	mov x22,xzr
00af88c4	and x23,x21,#0xfffffffe
00af88c8	mov x24,sp
00af88cc	add x25,x25,#0x32c
00af88d0	add x26,x26,#0xda4
00af88d4	add x20,x20,#0x39f
00af88d8	add x8,x24,x22
00af88dc	ldrb w9,[x8]
00af88e0	ldrb w2,[x8, #0x1]
00af88e4	cmp x22,#0xe
00af88e8	csel x3,x26,x25,cc
00af88ec	mov x0,x19
00af88f0	bfm w2,w9,#0x18,#0x7
00af88f4	mov x1,x20
00af88f8	bl 0x00c32250
00af88fc	add x22,x22,#0x2
00af8900	cmp x22,x23
00af8904	b.cc 0x00af88d8
00af8908	cmp w21,#0xf
00af890c	b.hi 0x00af899c
00af8910	adrp x1,0x2bc000
00af8914	add x1,x1,#0xda4
00af8918	mov x0,x19
00af891c	bl 0x00c32260
00af8920	cbnz w21,0x00af899c
00af8924	b 0x00af8938
00af8928	adrp x1,0x2bc000
00af892c	add x1,x1,#0xda4
00af8930	mov x0,x19
00af8934	bl 0x00c32260
00af8938	adrp x1,0x2bc000
00af893c	add x1,x1,#0xda4
00af8940	mov x0,x19
00af8944	bl 0x00c32260
00af8948	b 0x00af899c
00af894c	ldurb w10,[x9, #-0x1]
00af8950	orr w11,wzr,#0xffffff00
00af8954	asr w8,w11,w8
00af8958	and w8,w10,w8
00af895c	sturb w8,[x9, #-0x1]
00af8960	mov x8,x21
00af8964	mov x9,sp
00af8968	mov w10,#0x4
00af896c	add x0,x9,x8
00af8970	sub x2,x10,x21
00af8974	mov w1,w20
00af8978	bl 0x00c301c0
00af897c	ldrb w2,[sp]
00af8980	ldrb w3,[sp, #0x1]
00af8984	ldrb w4,[sp, #0x2]
00af8988	ldrb w5,[sp, #0x3]
00af898c	adrp x1,0x2c4000
00af8990	add x1,x1,#0x2d4
00af8994	mov x0,x19
00af8998	bl 0x00c32250
00af899c	mov w0,#0x1
00af89a0	ldp x29,x30,[sp, #0x50]
00af89a4	ldp x20,x19,[sp, #0x40]
00af89a8	ldp x22,x21,[sp, #0x30]
00af89ac	ldp x24,x23,[sp, #0x20]
00af89b0	ldp x26,x25,[sp, #0x10]
00af89b4	add sp,sp,#0x60
00af89b8	ret

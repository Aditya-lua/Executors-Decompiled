; RSA_verify_PKCS1_PSS_mgf1 @ 00ad8558
00ad8558	sub sp,sp,#0xd0
00ad855c	stp x28,x27,[sp, #0x70]
00ad8560	stp x26,x25,[sp, #0x80]
00ad8564	stp x24,x23,[sp, #0x90]
00ad8568	stp x22,x21,[sp, #0xa0]
00ad856c	stp x20,x19,[sp, #0xb0]
00ad8570	stp x29,x30,[sp, #0xc0]
00ad8574	add x29,sp,#0xc0
00ad8578	mov w20,w5
00ad857c	mov x26,x4
00ad8580	mov x22,x3
00ad8584	mov x23,x2
00ad8588	mov x21,x1
00ad858c	mov x24,x0
00ad8590	bl 0x00c31fa0
00ad8594	mov x19,x0
00ad8598	cbz x0,0x00ad8934
00ad859c	cmp x22,#0x0
00ad85a0	mov x0,x23
00ad85a4	csel x25,x23,x22,eq
00ad85a8	bl 0x00c34c20
00ad85ac	mov w22,w0
00ad85b0	tbnz w0,#0x1f,0x00ad8934
00ad85b4	cmn w20,#0x1
00ad85b8	b.eq 0x00ad85ec
00ad85bc	cmn w20,#0x4
00ad85c0	b.gt 0x00ad85f0
00ad85c4	bl 0x00c342a0
00ad85c8	adrp x0,0x2ca000
00ad85cc	adrp x2,0x2a4000
00ad85d0	add x0,x0,#0x383
00ad85d4	add x2,x2,#0x8c4
00ad85d8	mov w1,#0x45
00ad85dc	bl 0x00c342b0
00ad85e0	mov w0,#0x4
00ad85e4	mov w1,#0x88
00ad85e8	b 0x00ad892c
00ad85ec	mov w20,w22
00ad85f0	ldr x0,[x24, #0x28]
00ad85f4	bl 0x00c322f0
00ad85f8	sub w8,w0,#0x1
00ad85fc	mov x0,x24
00ad8600	and w27,w8,#0x7
00ad8604	bl 0x00c3fab0
00ad8608	ldrb w8,[x26]
00ad860c	orr w9,wzr,#0xff
00ad8610	lsl w9,w9,w27
00ad8614	tst w9,w8
00ad8618	b.eq 0x00ad8644
00ad861c	bl 0x00c342a0
00ad8620	adrp x0,0x2ca000
00ad8624	adrp x2,0x2a4000
00ad8628	add x0,x0,#0x383
00ad862c	add x2,x2,#0x8c4
00ad8630	mov w1,#0x4c
00ad8634	bl 0x00c342b0
00ad8638	mov w0,#0x4
00ad863c	mov w1,#0x85
00ad8640	b 0x00ad892c
00ad8644	cmp w27,#0x0
00ad8648	cset w8,eq
00ad864c	sub w8,w0,w8
00ad8650	add w9,w22,#0x2
00ad8654	csetm w10,eq
00ad8658	cinc x26,x26,eq
00ad865c	cmp w8,w9
00ad8660	b.ge 0x00ad8680
00ad8664	bl 0x00c342a0
00ad8668	adrp x0,0x2ca000
00ad866c	adrp x2,0x2a4000
00ad8670	add x0,x0,#0x383
00ad8674	add x2,x2,#0x8c4
00ad8678	mov w1,#0x54
00ad867c	b 0x00ad86b8
00ad8680	sub w28,w8,w22
00ad8684	sub w11,w28,#0x2
00ad8688	cmn w20,#0x3
00ad868c	mov w9,w11
00ad8690	b.eq 0x00ad86c8
00ad8694	cmp w20,w11
00ad8698	mov w9,w20
00ad869c	b.le 0x00ad86c8
00ad86a0	bl 0x00c342a0
00ad86a4	adrp x0,0x2ca000
00ad86a8	adrp x2,0x2a4000
00ad86ac	add x0,x0,#0x383
00ad86b0	add x2,x2,#0x8c4
00ad86b4	mov w1,#0x5a
00ad86b8	bl 0x00c342b0
00ad86bc	mov w0,#0x4
00ad86c0	mov w1,#0x6d
00ad86c4	b 0x00ad892c
00ad86c8	add x8,x26,w8, SXTW 
00ad86cc	ldurb w8,[x8, #-0x1]
00ad86d0	cmp w8,#0xbc
00ad86d4	b.ne 0x00ad8908
00ad86d8	sub w8,w28,#0x1
00ad86dc	sxtw x24,w8
00ad86e0	adrp x1,0x2ca000
00ad86e4	stp w9,w0,[sp, #0x18]
00ad86e8	add x1,x1,#0x383
00ad86ec	mov w2,#0x63
00ad86f0	mov x0,x24
00ad86f4	str x11,[sp, #0x20]
00ad86f8	str w10,[sp, #0x2c]
00ad86fc	bl 0x00c32320
00ad8700	mov x20,x0
00ad8704	cbz x0,0x00ad897c
00ad8708	add x2,x26,x24
00ad870c	sxtw x3,w22
00ad8710	mov x0,x20
00ad8714	mov x1,x24
00ad8718	mov x4,x25
00ad871c	stp x3,x24,[sp, #0x8]
00ad8720	str x2,[sp]
00ad8724	bl 0x00c3ff10
00ad8728	tbnz w0,#0x1f,0x00ad89d4
00ad872c	ldr x13,[sp, #0x10]
00ad8730	ldr w24,[sp, #0x1c]
00ad8734	cmp w28,#0x2
00ad8738	b.lt 0x00ad87cc
00ad873c	cmp x13,#0x1
00ad8740	csinc x9,x13,xzr,gt
00ad8744	cmp x9,#0x20
00ad8748	mov x8,xzr
00ad874c	b.cc 0x00ad87b0
00ad8750	cmp x13,#0x1
00ad8754	csinc x8,x13,xzr,gt
00ad8758	add x10,x26,x8
00ad875c	cmp x20,x10
00ad8760	b.cs 0x00ad8774
00ad8764	add x8,x20,x8
00ad8768	cmp x26,x8
00ad876c	mov x8,xzr
00ad8770	b.cc 0x00ad87b0
00ad8774	and x8,x9,#0x7fffffffffffffe0
00ad8778	add x10,x26,#0x10
00ad877c	add x11,x20,#0x10
00ad8780	mov x12,x8
00ad8784	ldp q0,q1,[x10, #-0x10]
00ad8788	ldp q2,q3,[x11, #-0x10]
00ad878c	add x10,x10,#0x20
00ad8790	subs x12,x12,#0x20
00ad8794	eor v0.16B,v2.16B,v0.16B
00ad8798	eor v1.16B,v3.16B,v1.16B
00ad879c	stp q0,q1,[x11, #-0x10]
00ad87a0	add x11,x11,#0x20
00ad87a4	b.ne 0x00ad8784
00ad87a8	cmp x9,x8
00ad87ac	b.eq 0x00ad87cc
00ad87b0	ldrb w9,[x26, x8]
00ad87b4	ldrb w10,[x20, x8]
00ad87b8	eor w9,w10,w9
00ad87bc	strb w9,[x20, x8]
00ad87c0	add x8,x8,#0x1
00ad87c4	cmp x8,x13
00ad87c8	b.lt 0x00ad87b0
00ad87cc	cbz w27,0x00ad87ec
00ad87d0	ldrb w9,[x20]
00ad87d4	mov w8,#0x8
00ad87d8	sub w8,w8,w27
00ad87dc	orr w10,wzr,#0xff
00ad87e0	lsr w8,w10,w8
00ad87e4	and w8,w9,w8
00ad87e8	strb w8,[x20]
00ad87ec	ldr x8,[sp, #0x20]
00ad87f0	mov x25,xzr
00ad87f4	sxtw x8,w8
00ad87f8	ldrb w9,[x20, x25]
00ad87fc	cmp x25,x8
00ad8800	add x25,x25,#0x1
00ad8804	b.ge 0x00ad880c
00ad8808	cbz w9,0x00ad87f8
00ad880c	ldr w8,[sp, #0x2c]
00ad8810	cmp w9,#0x1
00ad8814	b.ne 0x00ad89a8
00ad8818	ldr w9,[sp, #0x18]
00ad881c	cmn w9,#0x2
00ad8820	b.eq 0x00ad8844
00ad8824	ldr w9,[sp, #0x18]
00ad8828	add w8,w24,w8
00ad882c	sub w8,w8,#0x1
00ad8830	sub w8,w8,w22
00ad8834	sub w9,w8,w9
00ad8838	cmp w9,w25
00ad883c	ldr w9,[sp, #0x18]
00ad8840	b.ne 0x00ad89dc
00ad8844	mov x0,x19
00ad8848	mov x1,x23
00ad884c	mov x2,xzr
00ad8850	bl 0x00c31f70
00ad8854	cbz w0,0x00ad89d4
00ad8858	adrp x1,0x774000
00ad885c	add x1,x1,#0x914
00ad8860	mov w2,#0x8
00ad8864	mov x0,x19
00ad8868	bl 0x00c31f80
00ad886c	cbz w0,0x00ad89d4
00ad8870	mov x1,x21
00ad8874	ldr x21,[sp, #0x8]
00ad8878	mov x0,x19
00ad887c	mov x2,x21
00ad8880	bl 0x00c31f80
00ad8884	cbz w0,0x00ad89d4
00ad8888	ldr w8,[sp, #0x2c]
00ad888c	add w8,w24,w8
00ad8890	sub w8,w8,#0x1
00ad8894	sub w8,w8,w22
00ad8898	cmp w8,w25
00ad889c	b.eq 0x00ad88b8
00ad88a0	sub x8,x8,x25
00ad88a4	add x1,x20,x25
00ad88a8	sxtw x2,w8
00ad88ac	mov x0,x19
00ad88b0	bl 0x00c31f80
00ad88b4	cbz w0,0x00ad89d4
00ad88b8	add x1,sp,#0x30
00ad88bc	mov x0,x19
00ad88c0	mov x2,xzr
00ad88c4	bl 0x00c31f60
00ad88c8	cbz w0,0x00ad89d4
00ad88cc	ldr x1,[sp]
00ad88d0	add x0,sp,#0x30
00ad88d4	mov x2,x21
00ad88d8	bl 0x00c300b0
00ad88dc	cbz w0,0x00ad8a20
00ad88e0	bl 0x00c342a0
00ad88e4	adrp x0,0x2ca000
00ad88e8	adrp x2,0x2a4000
00ad88ec	add x0,x0,#0x383
00ad88f0	add x2,x2,#0x8c4
00ad88f4	mov w1,#0x84
00ad88f8	bl 0x00c342b0
00ad88fc	mov w0,#0x4
00ad8900	mov w1,#0x68
00ad8904	b 0x00ad89cc
00ad8908	bl 0x00c342a0
00ad890c	adrp x0,0x2ca000
00ad8910	adrp x2,0x2a4000
00ad8914	add x0,x0,#0x383
00ad8918	add x2,x2,#0x8c4
00ad891c	mov w1,#0x5e
00ad8920	bl 0x00c342b0
00ad8924	mov w0,#0x4
00ad8928	mov w1,#0x86
00ad892c	mov x2,xzr
00ad8930	bl 0x00c342c0
00ad8934	mov w21,wzr
00ad8938	mov x20,xzr
00ad893c	adrp x1,0x2ca000
00ad8940	add x1,x1,#0x383
00ad8944	mov w2,#0x8b
00ad8948	mov x0,x20
00ad894c	bl 0x00c32310
00ad8950	mov x0,x19
00ad8954	bl 0x00c31f90
00ad8958	mov w0,w21
00ad895c	ldp x29,x30,[sp, #0xc0]
00ad8960	ldp x20,x19,[sp, #0xb0]
00ad8964	ldp x22,x21,[sp, #0xa0]
00ad8968	ldp x24,x23,[sp, #0x90]
00ad896c	ldp x26,x25,[sp, #0x80]
00ad8970	ldp x28,x27,[sp, #0x70]
00ad8974	add sp,sp,#0xd0
00ad8978	ret
00ad897c	bl 0x00c342a0
00ad8980	adrp x0,0x2ca000
00ad8984	adrp x2,0x2a4000
00ad8988	add x0,x0,#0x383
00ad898c	add x2,x2,#0x8c4
00ad8990	mov w1,#0x65
00ad8994	bl 0x00c342b0
00ad8998	mov w1,#0x100
00ad899c	mov w0,#0x4
00ad89a0	movk w1,#0xc, LSL #16
00ad89a4	b 0x00ad89cc
00ad89a8	bl 0x00c342a0
00ad89ac	adrp x0,0x2ca000
00ad89b0	adrp x2,0x2a4000
00ad89b4	add x0,x0,#0x383
00ad89b8	add x2,x2,#0x8c4
00ad89bc	orr w1,wzr,#0x70
00ad89c0	bl 0x00c342b0
00ad89c4	mov w0,#0x4
00ad89c8	mov w1,#0x87
00ad89cc	mov x2,xzr
00ad89d0	bl 0x00c342c0
00ad89d4	mov w21,wzr
00ad89d8	b 0x00ad893c
00ad89dc	sub x21,x8,x25
00ad89e0	mov w22,w9
00ad89e4	bl 0x00c342a0
00ad89e8	adrp x0,0x2ca000
00ad89ec	adrp x2,0x2a4000
00ad89f0	add x0,x0,#0x383
00ad89f4	add x2,x2,#0x8c4
00ad89f8	mov w1,#0x74
00ad89fc	bl 0x00c342b0
00ad8a00	adrp x2,0x2d8000
00ad8a04	add x2,x2,#0x7a9
00ad8a08	mov w0,#0x4
00ad8a0c	mov w1,#0x88
00ad8a10	mov w3,w22
00ad8a14	mov w4,w21
00ad8a18	bl 0x00c342c0
00ad8a1c	b 0x00ad89d4
00ad8a20	mov w21,#0x1
00ad8a24	b 0x00ad893c

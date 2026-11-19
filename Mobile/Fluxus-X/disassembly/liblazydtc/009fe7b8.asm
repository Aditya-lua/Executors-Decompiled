; FUN_009fe7b8 @ 009fe7b8
009fe7b8	sub sp,sp,#0x90
009fe7bc	stp x29,x30,[sp, #0x80]
009fe7c0	add x29,sp,#0x80
009fe7c4	stp x28,x27,[sp, #0x30]
009fe7c8	ldr w27,[x29, #0x10]
009fe7cc	stp x22,x21,[sp, #0x60]
009fe7d0	stp x20,x19,[sp, #0x70]
009fe7d4	mov x19,x3
009fe7d8	mov x20,x2
009fe7dc	mov x21,x1
009fe7e0	mov x22,x0
009fe7e4	stp x26,x25,[sp, #0x40]
009fe7e8	stp x24,x23,[sp, #0x50]
009fe7ec	str w6,[sp, #0x10]
009fe7f0	tbnz w27,#0x6,0x009fe808
009fe7f4	tbnz x4,#0x3f,0x009fe810
009fe7f8	tbnz w27,#0x1,0x009fe81c
009fe7fc	lsl w8,w27,#0x3
009fe800	and w15,w8,#0x20
009fe804	b 0x009fe820
009fe808	mov w15,wzr
009fe80c	b 0x009fe820
009fe810	neg x4,x4
009fe814	mov w15,#0x2d
009fe818	b 0x009fe820
009fe81c	mov w15,#0x2b
009fe820	adrp x24,0x2ab000
009fe824	add x24,x24,#0x32c
009fe828	tbz w27,#0x3,0x009fe84c
009fe82c	adrp x8,0x2cb000
009fe830	add x8,x8,#0x723
009fe834	cmp w5,#0x8
009fe838	adrp x9,0x2b9000
009fe83c	add x9,x9,#0xb6c
009fe840	csel x8,x8,x24,eq
009fe844	cmp w5,#0x10
009fe848	csel x24,x9,x8,eq
009fe84c	adrp x11,0x2a3000
009fe850	adrp x12,0x2d2000
009fe854	add x11,x11,#0x64c
009fe858	add x12,x12,#0xebb
009fe85c	tst w27,#0x20
009fe860	mov x9,xzr
009fe864	bic w8,w7,w7, ASR #0x1f
009fe868	mov w10,w5
009fe86c	csel x11,x12,x11,eq
009fe870	add x12,sp,#0x14
009fe874	udiv x13,x4,x10
009fe878	msub x14,x13,x10,x4
009fe87c	ldrb w14,[x11, x14]
009fe880	cmp x4,x10
009fe884	strb w14,[x12, x9]
009fe888	add x9,x9,#0x1
009fe88c	b.cc 0x009fe89c
009fe890	cmp x9,#0x1a
009fe894	mov x4,x13
009fe898	b.cc 0x009fe874
009fe89c	sub w10,w9,#0x1
009fe8a0	cmp w9,#0x1a
009fe8a4	csel w26,w10,w9,eq
009fe8a8	subs w28,w8,w26
009fe8ac	add x11,sp,#0x14
009fe8b0	csel w25,w26,w8,lt
009fe8b4	cmp w15,#0x0
009fe8b8	mov x0,x24
009fe8bc	strb wzr,[x11, w26, UXTW ]
009fe8c0	str w15,[sp, #0xc]
009fe8c4	cset w23,ne
009fe8c8	bl 0x00c2ff50
009fe8cc	ldr w8,[sp, #0x10]
009fe8d0	bic w9,w28,w28, ASR #0x1f
009fe8d4	sub w8,w8,w23
009fe8d8	sub w8,w8,w25
009fe8dc	sub w8,w8,w0
009fe8e0	bic w8,w8,w8, ASR #0x1f
009fe8e4	cmp w9,w8
009fe8e8	csel w10,w8,w9,lt
009fe8ec	tst w27,#0x10
009fe8f0	csel w8,w8,wzr,eq
009fe8f4	csel w28,w9,w10,eq
009fe8f8	tst w27,#0x1
009fe8fc	cneg w25,w8,ne
009fe900	cmp w25,#0x1
009fe904	b.lt 0x009fe92c
009fe908	mov w4,#0x20
009fe90c	mov x0,x22
009fe910	mov x1,x21
009fe914	mov x2,x20
009fe918	mov x3,x19
009fe91c	bl 0x009fe654
009fe920	cbz w0,0x009fea28
009fe924	subs w25,w25,#0x1
009fe928	b.gt 0x009fe908
009fe92c	ldr w4,[sp, #0xc]
009fe930	cbz w4,0x009fe94c
009fe934	mov x0,x22
009fe938	mov x1,x21
009fe93c	mov x2,x20
009fe940	mov x3,x19
009fe944	bl 0x009fe654
009fe948	cbz w0,0x009fea28
009fe94c	ldrb w8,[x24]
009fe950	cbz w8,0x009fe97c
009fe954	add x23,x24,#0x1
009fe958	and w4,w8,#0xff
009fe95c	mov x0,x22
009fe960	mov x1,x21
009fe964	mov x2,x20
009fe968	mov x3,x19
009fe96c	bl 0x009fe654
009fe970	cbz w0,0x009fea28
009fe974	ldrb w8,[x23], #0x1
009fe978	cbnz w8,0x009fe958
009fe97c	cmp w28,#0x1
009fe980	b.lt 0x009fe9b0
009fe984	add w23,w28,#0x1
009fe988	orr w4,wzr,#0x30
009fe98c	mov x0,x22
009fe990	mov x1,x21
009fe994	mov x2,x20
009fe998	mov x3,x19
009fe99c	bl 0x009fe654
009fe9a0	cbz w0,0x009fea28
009fe9a4	sub w23,w23,#0x1
009fe9a8	cmp w23,#0x1
009fe9ac	b.gt 0x009fe988
009fe9b0	sxtw x8,w26
009fe9b4	add x23,sp,#0x14
009fe9b8	cmp x8,#0x0
009fe9bc	b.le 0x009fe9ec
009fe9c0	add x9,x23,x8
009fe9c4	ldurb w4,[x9, #-0x1]
009fe9c8	mov x0,x22
009fe9cc	mov x1,x21
009fe9d0	mov x2,x20
009fe9d4	mov x3,x19
009fe9d8	sub x24,x8,#0x1
009fe9dc	bl 0x009fe654
009fe9e0	mov x8,x24
009fe9e4	cbnz w0,0x009fe9b8
009fe9e8	b 0x009fea28
009fe9ec	tbnz w25,#0x1f,0x009fe9f8
009fe9f0	mov w0,#0x1
009fe9f4	b 0x009fea28
009fe9f8	sub w23,w25,#0x1
009fe9fc	mov w4,#0x20
009fea00	mov x0,x22
009fea04	mov x1,x21
009fea08	mov x2,x20
009fea0c	mov x3,x19
009fea10	bl 0x009fe654
009fea14	cbz w0,0x009fea28
009fea18	add w23,w23,#0x1
009fea1c	cmn w23,#0x2
009fea20	mov w0,#0x1
009fea24	b.le 0x009fe9fc
009fea28	ldp x29,x30,[sp, #0x80]
009fea2c	ldp x20,x19,[sp, #0x70]
009fea30	ldp x22,x21,[sp, #0x60]
009fea34	ldp x24,x23,[sp, #0x50]
009fea38	ldp x26,x25,[sp, #0x40]
009fea3c	ldp x28,x27,[sp, #0x30]
009fea40	add sp,sp,#0x90
009fea44	ret

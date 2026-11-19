; FUN_00ac871c @ 00ac871c
00ac871c	sub sp,sp,#0x190
00ac8720	stp x29,x30,[sp, #0x180]
00ac8724	add x29,sp,#0x180
00ac8728	stur w2,[x29, #-0x24]
00ac872c	adrp x2,0xc7c000
00ac8730	stp x20,x19,[sp, #0x170]
00ac8734	mov x19,x1
00ac8738	add x2,x2,#0xa38
00ac873c	mov w1,#0x5
00ac8740	str x28,[sp, #0x150]
00ac8744	stp x22,x21,[sp, #0x160]
00ac8748	mov x21,x0
00ac874c	stur x3,[x29, #-0x38]
00ac8750	bl 0x00c3b520
00ac8754	cbz x0,0x00ac8978
00ac8758	ldr x8,[x0, #0x20]
00ac875c	ldr x2,[x0, #0x38]
00ac8760	adrp x9,0x2b6000
00ac8764	add x9,x9,#0x3a3
00ac8768	cmp x8,#0x0
00ac876c	mov x20,x0
00ac8770	csel x1,x9,x8,eq
00ac8774	mov x0,x21
00ac8778	bl 0x00c3d170
00ac877c	cbz x0,0x00ac894c
00ac8780	mov x1,x19
00ac8784	mov x21,x0
00ac8788	bl 0x00c3d150
00ac878c	mov x19,x0
00ac8790	mov x0,x21
00ac8794	bl 0x00c3d180
00ac8798	cbz x19,0x00ac8998
00ac879c	ldr x8,[x20, #0x28]
00ac87a0	adrp x9,0x2a0000
00ac87a4	add x9,x9,#0x94a
00ac87a8	adrp x0,0x2ad000
00ac87ac	cmp x8,#0x0
00ac87b0	add x22,sp,#0x30
00ac87b4	csel x1,x9,x8,eq
00ac87b8	add x0,x0,#0x804
00ac87bc	add x8,sp,#0x8
00ac87c0	mov x2,xzr
00ac87c4	add x21,x22,#0x28
00ac87c8	bl 0x00c36280
00ac87cc	ldr x8,[sp, #0x28]
00ac87d0	ldur q0,[sp, #0x18]
00ac87d4	ldur q1,[sp, #0x8]
00ac87d8	str x8,[sp, #0x50]
00ac87dc	stp q1,q0,[sp, #0x30]
00ac87e0	ldr x1,[x20, #0x30]
00ac87e4	cbz x1,0x00ac8818
00ac87e8	adrp x0,0x29d000
00ac87ec	add x0,x0,#0xe2e
00ac87f0	add x8,sp,#0x8
00ac87f4	mov x2,xzr
00ac87f8	add x22,x22,#0x50
00ac87fc	bl 0x00c36280
00ac8800	ldr x8,[sp, #0x28]
00ac8804	ldur q0,[sp, #0x8]
00ac8808	ldur q1,[sp, #0x18]
00ac880c	str x8,[x21, #0x20]
00ac8810	stp q0,q1,[x21]
00ac8814	mov x21,x22
00ac8818	ldr x1,[x20, #0x38]
00ac881c	cbz x1,0x00ac8850
00ac8820	adrp x0,0x2d3000
00ac8824	add x0,x0,#0x7c2
00ac8828	add x8,sp,#0x8
00ac882c	mov x2,xzr
00ac8830	add x20,x21,#0x28
00ac8834	bl 0x00c36280
00ac8838	ldr x8,[sp, #0x28]
00ac883c	ldur q0,[sp, #0x8]
00ac8840	ldur q1,[sp, #0x18]
00ac8844	str x8,[x21, #0x20]
00ac8848	stp q0,q1,[x21]
00ac884c	mov x21,x20
00ac8850	adrp x0,0x2d4000
00ac8854	adrp x1,0x2c3000
00ac8858	add x0,x0,#0x2ff
00ac885c	add x1,x1,#0x5d3
00ac8860	add x8,sp,#0x8
00ac8864	mov x2,xzr
00ac8868	bl 0x00c36280
00ac886c	ldr x8,[sp, #0x28]
00ac8870	ldur q0,[sp, #0x8]
00ac8874	ldur q1,[sp, #0x18]
00ac8878	adrp x0,0x2ce000
00ac887c	str x8,[x21, #0x20]
00ac8880	add x0,x0,#0x281
00ac8884	add x8,sp,#0x8
00ac8888	sub x1,x29,#0x24
00ac888c	stp q0,q1,[x21]
00ac8890	bl 0x00c37340
00ac8894	ldr x8,[sp, #0x28]
00ac8898	ldur q0,[sp, #0x18]
00ac889c	ldur q1,[sp, #0x8]
00ac88a0	adrp x0,0x2c6000
00ac88a4	str x8,[x21, #0x48]
00ac88a8	add x0,x0,#0x228
00ac88ac	add x8,sp,#0x8
00ac88b0	sub x1,x29,#0x38
00ac88b4	stur q0,[x21, #0x38]
00ac88b8	stur q1,[x21, #0x28]
00ac88bc	bl 0x00c3e900
00ac88c0	ldr x8,[sp, #0x28]
00ac88c4	ldur q0,[sp, #0x8]
00ac88c8	ldur q1,[sp, #0x18]
00ac88cc	str x8,[x21, #0x70]
00ac88d0	add x8,sp,#0x8
00ac88d4	stp q0,q1,[x21, #0x50]
00ac88d8	bl 0x00c34c40
00ac88dc	ldr x8,[sp, #0x28]
00ac88e0	ldur q0,[sp, #0x18]
00ac88e4	ldur q1,[sp, #0x8]
00ac88e8	add x5,sp,#0x30
00ac88ec	mov x0,x19
00ac88f0	mov w1,wzr
00ac88f4	mov w2,wzr
00ac88f8	mov x3,xzr
00ac88fc	mov x4,xzr
00ac8900	str x8,[x21, #0x98]
00ac8904	stur q0,[x21, #0x88]
00ac8908	stur q1,[x21, #0x78]
00ac890c	bl 0x00c3d1b0
00ac8910	cbnz w0,0x00ac897c
00ac8914	bl 0x00c342a0
00ac8918	adrp x0,0x2da000
00ac891c	adrp x2,0x2a6000
00ac8920	add x0,x0,#0x554
00ac8924	add x2,x2,#0x72d
00ac8928	mov w1,#0x25f
00ac892c	bl 0x00c342b0
00ac8930	mov w0,#0x24
00ac8934	mov w1,#0x6c
00ac8938	mov x2,xzr
00ac893c	bl 0x00c342c0
00ac8940	mov x0,x19
00ac8944	bl 0x00c3d140
00ac8948	b 0x00ac8978
00ac894c	bl 0x00c342a0
00ac8950	adrp x0,0x2da000
00ac8954	adrp x2,0x2a6000
00ac8958	add x0,x0,#0x554
00ac895c	add x2,x2,#0x72d
00ac8960	mov w1,#0x241
00ac8964	bl 0x00c342b0
00ac8968	mov w0,#0x24
00ac896c	mov w1,#0x90
00ac8970	mov x2,xzr
00ac8974	bl 0x00c342c0
00ac8978	mov x19,xzr
00ac897c	mov x0,x19
00ac8980	ldp x29,x30,[sp, #0x180]
00ac8984	ldp x20,x19,[sp, #0x170]
00ac8988	ldp x22,x21,[sp, #0x160]
00ac898c	ldr x28,[sp, #0x150]
00ac8990	add sp,sp,#0x190
00ac8994	ret
00ac8998	bl 0x00c342a0
00ac899c	adrp x0,0x2da000
00ac89a0	adrp x2,0x2a6000
00ac89a4	add x0,x0,#0x554
00ac89a8	add x2,x2,#0x72d
00ac89ac	mov w1,#0x247
00ac89b0	bl 0x00c342b0
00ac89b4	mov w0,#0x24
00ac89b8	mov w1,#0x8f
00ac89bc	mov x2,xzr
00ac89c0	bl 0x00c342c0
00ac89c4	b 0x00ac897c

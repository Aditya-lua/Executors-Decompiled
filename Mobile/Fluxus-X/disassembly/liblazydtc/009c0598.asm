; FUN_009c0598 @ 009c0598
009c0598	stp x28,x27,[sp, #-0x60]!
009c059c	stp x26,x25,[sp, #0x10]
009c05a0	stp x24,x23,[sp, #0x20]
009c05a4	stp x22,x21,[sp, #0x30]
009c05a8	stp x20,x19,[sp, #0x40]
009c05ac	stp x29,x30,[sp, #0x50]
009c05b0	add x29,sp,#0x50
009c05b4	sub sp,sp,#0x1b0
009c05b8	ldr w24,[x29, #0x38]
009c05bc	mov x20,x7
009c05c0	mov x22,x6
009c05c4	mov x25,x5
009c05c8	mov x26,x4
009c05cc	mov x27,x3
009c05d0	mov x28,x2
009c05d4	mov x21,x1
009c05d8	mov x19,x0
009c05dc	bl 0x00c35440
009c05e0	cbz x0,0x009c07dc
009c05e4	ldr x8,[x19, #0x9a8]
009c05e8	mov x23,x0
009c05ec	adrp x1,0x2db000
009c05f0	add x1,x1,#0xbe2
009c05f4	ldr x0,[x8]
009c05f8	ldr x2,[x8, #0x440]
009c05fc	str x22,[sp, #0x30]
009c0600	bl 0x00c36210
009c0604	cbz x0,0x009c0818
009c0608	mov x22,x0
009c060c	str x20,[sp, #0x28]
009c0610	bl 0x00c361f0
009c0614	mov x20,x0
009c0618	mov x0,x22
009c061c	bl 0x00c36220
009c0620	cbz x20,0x009c0844
009c0624	ldr x8,[x29, #0x30]
009c0628	mov x0,x23
009c062c	str w24,[sp, #0x4]
009c0630	add x24,sp,#0x60
009c0634	str x8,[sp, #0x20]
009c0638	ldr x8,[x29, #0x28]
009c063c	str x8,[sp, #0x18]
009c0640	ldr x8,[x29, #0x20]
009c0644	str x8,[sp, #0x8]
009c0648	ldp x8,x22,[x29, #0x10]
009c064c	str x8,[sp, #0x10]
009c0650	bl 0x00c36230
009c0654	mov x1,x0
009c0658	adrp x0,0x29d000
009c065c	add x0,x0,#0xe2e
009c0660	add x8,sp,#0x38
009c0664	mov x2,xzr
009c0668	bl 0x00c36280
009c066c	ldr x8,[sp, #0x58]
009c0670	ldur q0,[sp, #0x48]
009c0674	ldur q1,[sp, #0x38]
009c0678	ldr x2,[sp, #0x8]
009c067c	adrp x0,0x2cd000
009c0680	str x8,[sp, #0x80]
009c0684	add x0,x0,#0x6e9
009c0688	add x8,sp,#0x38
009c068c	mov x1,x22
009c0690	stp q1,q0,[sp, #0x60]
009c0694	bl 0x00c34c50
009c0698	ldr x8,[sp, #0x58]
009c069c	ldur q0,[sp, #0x48]
009c06a0	ldur q1,[sp, #0x38]
009c06a4	adrp x22,0x2bb000
009c06a8	add x22,x22,#0x864
009c06ac	str x8,[sp, #0xa8]
009c06b0	add x8,sp,#0x38
009c06b4	mov x0,x22
009c06b8	mov x1,x21
009c06bc	mov x2,x28
009c06c0	stur q0,[sp, #0x98]
009c06c4	stur q1,[sp, #0x88]
009c06c8	bl 0x00c34c50
009c06cc	ldr x8,[sp, #0x58]
009c06d0	ldur q0,[sp, #0x48]
009c06d4	ldur q1,[sp, #0x38]
009c06d8	mov x0,x22
009c06dc	str x8,[sp, #0xd0]
009c06e0	add x8,sp,#0x38
009c06e4	mov x1,x27
009c06e8	mov x2,x26
009c06ec	str q0,[x24, #0x60]
009c06f0	str q1,[sp, #0xb0]
009c06f4	bl 0x00c34c50
009c06f8	ldr x8,[sp, #0x58]
009c06fc	ldur q0,[sp, #0x48]
009c0700	ldur q1,[sp, #0x38]
009c0704	ldr x2,[sp, #0x30]
009c0708	str x8,[sp, #0xf8]
009c070c	add x8,sp,#0x38
009c0710	mov x0,x22
009c0714	mov x1,x25
009c0718	stur q0,[x24, #0x88]
009c071c	stur q1,[x24, #0x78]
009c0720	bl 0x00c34c50
009c0724	ldr x8,[sp, #0x58]
009c0728	ldur q0,[sp, #0x38]
009c072c	ldur q1,[sp, #0x48]
009c0730	ldr x1,[sp, #0x28]
009c0734	ldr x2,[sp, #0x10]
009c0738	str x8,[sp, #0x120]
009c073c	add x8,sp,#0x38
009c0740	mov x0,x22
009c0744	stp q0,q1,[x24, #0xa0]
009c0748	bl 0x00c34c50
009c074c	ldr x8,[sp, #0x58]
009c0750	ldur q0,[sp, #0x48]
009c0754	ldur q1,[sp, #0x38]
009c0758	add x21,sp,#0x60
009c075c	str x8,[sp, #0x148]
009c0760	add x8,sp,#0x38
009c0764	mov x0,x22
009c0768	mov x1,xzr
009c076c	mov x2,xzr
009c0770	stur q0,[x24, #0xd8]
009c0774	stur q1,[x24, #0xc8]
009c0778	add x23,x21,#0x118
009c077c	bl 0x00c34c50
009c0780	ldr x8,[sp, #0x58]
009c0784	ldur q0,[sp, #0x38]
009c0788	ldur q1,[sp, #0x48]
009c078c	str x8,[sp, #0x170]
009c0790	add x8,sp,#0x38
009c0794	stp q0,q1,[x24, #0xf0]
009c0798	bl 0x00c34c40
009c079c	ldur q0,[sp, #0x48]
009c07a0	ldur q1,[sp, #0x38]
009c07a4	ldr x8,[sp, #0x58]
009c07a8	ldp x1,x2,[sp, #0x18]
009c07ac	add x9,x21,#0x128
009c07b0	add x3,sp,#0x60
009c07b4	mov x0,x20
009c07b8	str q0,[x9]
009c07bc	str q1,[x23]
009c07c0	str x8,[sp, #0x198]
009c07c4	bl 0x00c36200
009c07c8	cbz w0,0x009c0840
009c07cc	mov x0,x20
009c07d0	bl 0x00c361e0
009c07d4	mov w0,#0x1
009c07d8	b 0x009c08a8
009c07dc	bl 0x00c342a0
009c07e0	adrp x0,0x2d7000
009c07e4	adrp x2,0x2c9000
009c07e8	add x0,x0,#0xa4c
009c07ec	add x2,x2,#0x4dd
009c07f0	cbz w24,0x009c0820
009c07f4	mov w1,#0x2b
009c07f8	bl 0x00c342b0
009c07fc	mov w2,#0x103
009c0800	mov w1,#0x50
009c0804	movk w2,#0xc, LSL #16
009c0808	mov x0,x19
009c080c	mov x3,xzr
009c0810	bl 0x00c34410
009c0814	b 0x009c08a4
009c0818	mov x20,xzr
009c081c	b 0x009c0844
009c0820	mov w1,#0x2d
009c0824	bl 0x00c342b0
009c0828	mov w1,#0x103
009c082c	mov w0,#0x14
009c0830	movk w1,#0xc, LSL #16
009c0834	mov x2,xzr
009c0838	bl 0x00c342c0
009c083c	b 0x009c08a4
009c0840	ldr w24,[sp, #0x4]
009c0844	bl 0x00c342a0
009c0848	adrp x0,0x2d7000
009c084c	adrp x2,0x2c9000
009c0850	add x0,x0,#0xa4c
009c0854	add x2,x2,#0x4dd
009c0858	cbz w24,0x009c0880
009c085c	mov w1,#0x4f
009c0860	bl 0x00c342b0
009c0864	mov w2,#0x103
009c0868	mov w1,#0x50
009c086c	movk w2,#0xc, LSL #16
009c0870	mov x0,x19
009c0874	mov x3,xzr
009c0878	bl 0x00c34410
009c087c	b 0x009c089c
009c0880	mov w1,#0x51
009c0884	bl 0x00c342b0
009c0888	mov w1,#0x103
009c088c	mov w0,#0x14
009c0890	movk w1,#0xc, LSL #16
009c0894	mov x2,xzr
009c0898	bl 0x00c342c0
009c089c	mov x0,x20
009c08a0	bl 0x00c361e0
009c08a4	mov w0,wzr
009c08a8	add sp,sp,#0x1b0
009c08ac	ldp x29,x30,[sp, #0x50]
009c08b0	ldp x20,x19,[sp, #0x40]
009c08b4	ldp x22,x21,[sp, #0x30]
009c08b8	ldp x24,x23,[sp, #0x20]
009c08bc	ldp x26,x25,[sp, #0x10]
009c08c0	ldp x28,x27,[sp], #0x60
009c08c4	ret

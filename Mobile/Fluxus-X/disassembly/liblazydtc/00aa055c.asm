; BN_bn2dec @ 00aa055c
00aa055c	str x25,[sp, #-0x50]!
00aa0560	stp x24,x23,[sp, #0x10]
00aa0564	stp x22,x21,[sp, #0x20]
00aa0568	stp x20,x19,[sp, #0x30]
00aa056c	stp x29,x30,[sp, #0x40]
00aa0570	add x29,sp,#0x40
00aa0574	mov x21,x0
00aa0578	bl 0x00c322f0
00aa057c	mov w9,#0x6667
00aa0580	add w8,w0,w0, LSL #0x1
00aa0584	movk w9,#0x6666, LSL #16
00aa0588	mov w10,#0x4dd3
00aa058c	movk w10,#0x1062, LSL #16
00aa0590	smull x9,w8,w9
00aa0594	smull x8,w8,w10
00aa0598	lsr x10,x9,#0x3f
00aa059c	asr x9,x9,#0x22
00aa05a0	add w9,w9,w10
00aa05a4	lsr x10,x8,#0x3f
00aa05a8	asr x8,x8,#0x26
00aa05ac	add w8,w8,w10
00aa05b0	mov w10,#0x1af3
00aa05b4	add w8,w9,w8
00aa05b8	movk w10,#0x6bca, LSL #16
00aa05bc	add w9,w8,#0x2
00aa05c0	add w22,w8,#0x5
00aa05c4	smull x8,w9,w10
00aa05c8	lsr x9,x8,#0x3f
00aa05cc	asr x8,x8,#0x23
00aa05d0	add w8,w8,w9
00aa05d4	adrp x19,0x2a6000
00aa05d8	add w25,w8,#0x1
00aa05dc	add x19,x19,#0x3aa
00aa05e0	sbfiz x0,x25,#0x3,#0x20
00aa05e4	mov w2,#0x47
00aa05e8	mov x1,x19
00aa05ec	bl 0x00c32320
00aa05f0	sxtw x22,w22
00aa05f4	mov x20,x0
00aa05f8	mov w2,#0x48
00aa05fc	mov x0,x22
00aa0600	mov x1,x19
00aa0604	bl 0x00c32320
00aa0608	mov x19,x0
00aa060c	cbz x20,0x00aa0654
00aa0610	cbz x19,0x00aa0654
00aa0614	mov x0,x21
00aa0618	bl 0x00c369a0
00aa061c	cbz x0,0x00aa0698
00aa0620	mov x21,x0
00aa0624	bl 0x00c369b0
00aa0628	cbz w0,0x00aa06e8
00aa062c	orr w8,wzr,#0x30
00aa0630	strh w8,[x19]
00aa0634	adrp x1,0x2a6000
00aa0638	add x1,x1,#0x3aa
00aa063c	mov w2,#0x75
00aa0640	mov x0,x20
00aa0644	bl 0x00c32310
00aa0648	mov x0,x21
00aa064c	bl 0x00c36290
00aa0650	b 0x00aa06cc
00aa0654	bl 0x00c342a0
00aa0658	adrp x21,0x2a6000
00aa065c	add x21,x21,#0x3aa
00aa0660	adrp x2,0x2c7000
00aa0664	add x2,x2,#0xbec
00aa0668	mov w1,#0x4a
00aa066c	mov x0,x21
00aa0670	bl 0x00c342b0
00aa0674	mov w1,#0x100
00aa0678	orr w0,wzr,#0x3
00aa067c	movk w1,#0xc, LSL #16
00aa0680	mov x2,xzr
00aa0684	bl 0x00c342c0
00aa0688	mov w2,#0x75
00aa068c	mov x0,x20
00aa0690	mov x1,x21
00aa0694	b 0x00aa06a8
00aa0698	adrp x1,0x2a6000
00aa069c	add x1,x1,#0x3aa
00aa06a0	mov w2,#0x75
00aa06a4	mov x0,x20
00aa06a8	bl 0x00c32310
00aa06ac	mov x0,xzr
00aa06b0	bl 0x00c36290
00aa06b4	adrp x1,0x2a6000
00aa06b8	add x1,x1,#0x3aa
00aa06bc	mov w2,#0x79
00aa06c0	mov x0,x19
00aa06c4	bl 0x00c32310
00aa06c8	mov x19,xzr
00aa06cc	mov x0,x19
00aa06d0	ldp x29,x30,[sp, #0x40]
00aa06d4	ldp x20,x19,[sp, #0x30]
00aa06d8	ldp x22,x21,[sp, #0x20]
00aa06dc	ldp x24,x23,[sp, #0x10]
00aa06e0	ldr x25,[sp], #0x50
00aa06e4	ret
00aa06e8	mov x0,x21
00aa06ec	bl 0x00c37f40
00aa06f0	mov x23,x19
00aa06f4	cbz w0,0x00aa0704
00aa06f8	mov w8,#0x2d
00aa06fc	mov x23,x19
00aa0700	strb w8,[x23], #0x1
00aa0704	mov x0,x21
00aa0708	bl 0x00c369b0
00aa070c	mov x24,x20
00aa0710	cbz w0,0x00aa0770
00aa0714	ldr x3,[x24, #-0x8]!
00aa0718	add x25,x22,x19
00aa071c	adrp x2,0x2a6000
00aa0720	sub x1,x25,x23
00aa0724	add x2,x2,#0x3be
00aa0728	mov x0,x23
00aa072c	bl 0x00c34d30
00aa0730	tbnz w0,#0x1f,0x00aa07bc
00aa0734	cmp x24,x20
00aa0738	b.eq 0x00aa0634
00aa073c	add x22,x23,w0, SXTW 
00aa0740	adrp x23,0x2b0000
00aa0744	add x23,x23,#0x387
00aa0748	ldr x3,[x24, #-0x8]!
00aa074c	sub x1,x25,x22
00aa0750	mov x0,x22
00aa0754	mov x2,x23
00aa0758	bl 0x00c34d30
00aa075c	tbnz w0,#0x1f,0x00aa07bc
00aa0760	cmp x20,x24
00aa0764	add x22,x22,w0, SXTW 
00aa0768	b.ne 0x00aa0748
00aa076c	b 0x00aa0634
00aa0770	sxtw x25,w25
00aa0774	mov x24,x20
00aa0778	sub x8,x24,x20
00aa077c	asr x8,x8,#0x3
00aa0780	cmp x8,x25
00aa0784	b.ge 0x00aa07bc
00aa0788	mov x1,#0x89e80000
00aa078c	movk x1,#0x2304, LSL #32
00aa0790	movk x1,#0x8ac7, LSL #48
00aa0794	mov x0,x21
00aa0798	bl 0x00c376f0
00aa079c	cmn x0,#0x1
00aa07a0	str x0,[x24]
00aa07a4	b.eq 0x00aa07bc
00aa07a8	mov x0,x21
00aa07ac	add x24,x24,#0x8
00aa07b0	bl 0x00c369b0
00aa07b4	cbz w0,0x00aa0778
00aa07b8	b 0x00aa0714
00aa07bc	adrp x1,0x2a6000
00aa07c0	add x1,x1,#0x3aa
00aa07c4	mov w2,#0x75
00aa07c8	mov x0,x20
00aa07cc	bl 0x00c32310
00aa07d0	mov x0,x21
00aa07d4	b 0x00aa06b0

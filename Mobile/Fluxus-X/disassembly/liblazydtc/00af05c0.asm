; WHIRLPOOL_Final @ 00af05c0
00af05c0	stp x20,x19,[sp, #-0x20]!
00af05c4	stp x29,x30,[sp, #0x10]
00af05c8	ldr w9,[x1, #0x80]
00af05cc	mov x19,x1
00af05d0	mov x20,x0
00af05d4	add x29,sp,#0x10
00af05d8	ands w10,w9,#0x7
00af05dc	lsr w8,w9,#0x3
00af05e0	b.eq 0x00af0600
00af05e4	add x11,x19,w8, UXTW 
00af05e8	ldrb w12,[x11, #0x40]
00af05ec	mov w13,#0x80
00af05f0	lsr w10,w13,w10
00af05f4	orr w10,w12,w10
00af05f8	strb w10,[x11, #0x40]
00af05fc	b 0x00af060c
00af0600	add x10,x19,w8, UXTW 
00af0604	mov w11,#0x80
00af0608	strb w11,[x10, #0x40]
00af060c	cmp w9,#0x100
00af0610	add w9,w8,#0x1
00af0614	b.cc 0x00af0650
00af0618	cmp w9,#0x3f
00af061c	b.hi 0x00af0638
00af0620	add x9,x19,w9, UXTW 
00af0624	orr w10,wzr,#0x3f
00af0628	add x0,x9,#0x40
00af062c	sub w2,w10,w8
00af0630	mov w1,wzr
00af0634	bl 0x00c301c0
00af0638	add x1,x19,#0x40
00af063c	mov w2,#0x1
00af0640	mov x0,x19
00af0644	bl 0x00c40430
00af0648	mov w9,wzr
00af064c	b 0x00af0658
00af0650	cmp w9,#0x1f
00af0654	b.hi 0x00af0670
00af0658	add x8,x19,w9, UXTW 
00af065c	mov w10,#0x20
00af0660	add x0,x8,#0x40
00af0664	sub w2,w10,w9
00af0668	mov w1,wzr
00af066c	bl 0x00c301c0
00af0670	ldp x8,x9,[x19, #0x88]
00af0674	add x1,x19,#0x40
00af0678	mov w2,#0x1
00af067c	mov x0,x19
00af0680	lsr x10,x8,#0x8
00af0684	strb w10,[x19, #0x7e]
00af0688	lsr x10,x8,#0x10
00af068c	strb w10,[x19, #0x7d]
00af0690	lsr x10,x8,#0x18
00af0694	strb w10,[x19, #0x7c]
00af0698	lsr x10,x8,#0x20
00af069c	strb w10,[x19, #0x7b]
00af06a0	lsr x10,x8,#0x28
00af06a4	strb w8,[x19, #0x7f]
00af06a8	strb w10,[x19, #0x7a]
00af06ac	lsr x10,x8,#0x30
00af06b0	lsr x8,x8,#0x38
00af06b4	strb w10,[x19, #0x79]
00af06b8	lsr x10,x9,#0x8
00af06bc	strb w8,[x19, #0x78]
00af06c0	lsr x8,x9,#0x10
00af06c4	strb w10,[x19, #0x76]
00af06c8	lsr x10,x9,#0x18
00af06cc	strb w8,[x19, #0x75]
00af06d0	lsr x8,x9,#0x20
00af06d4	strb w10,[x19, #0x74]
00af06d8	lsr x10,x9,#0x28
00af06dc	strb w8,[x19, #0x73]
00af06e0	lsr x8,x9,#0x30
00af06e4	strb w10,[x19, #0x72]
00af06e8	strb w8,[x19, #0x71]
00af06ec	ldp x8,x10,[x19, #0x98]
00af06f0	strb w9,[x19, #0x77]
00af06f4	lsr x9,x9,#0x38
00af06f8	strb w9,[x19, #0x70]
00af06fc	lsr x9,x8,#0x8
00af0700	strb w9,[x19, #0x6e]
00af0704	lsr x9,x8,#0x10
00af0708	strb w9,[x19, #0x6d]
00af070c	lsr x9,x8,#0x18
00af0710	strb w9,[x19, #0x6c]
00af0714	lsr x9,x8,#0x20
00af0718	strb w9,[x19, #0x6b]
00af071c	lsr x9,x8,#0x28
00af0720	strb w9,[x19, #0x6a]
00af0724	lsr x9,x8,#0x30
00af0728	strb w8,[x19, #0x6f]
00af072c	lsr x8,x8,#0x38
00af0730	strb w8,[x19, #0x68]
00af0734	lsr x8,x10,#0x8
00af0738	strb w8,[x19, #0x66]
00af073c	lsr x8,x10,#0x10
00af0740	strb w8,[x19, #0x65]
00af0744	lsr x8,x10,#0x18
00af0748	strb w8,[x19, #0x64]
00af074c	lsr x8,x10,#0x20
00af0750	strb w8,[x19, #0x63]
00af0754	lsr x8,x10,#0x28
00af0758	strb w9,[x19, #0x69]
00af075c	strb w8,[x19, #0x62]
00af0760	lsr x8,x10,#0x30
00af0764	lsr x9,x10,#0x38
00af0768	strb w10,[x19, #0x67]
00af076c	strb w8,[x19, #0x61]
00af0770	strb w9,[x19, #0x60]
00af0774	bl 0x00c40430
00af0778	cbz x20,0x00af07b0
00af077c	ldr q0,[x19, #0x30]
00af0780	mov w1,#0xa8
00af0784	mov x0,x19
00af0788	str q0,[x20, #0x30]
00af078c	ldr q0,[x19, #0x20]
00af0790	str q0,[x20, #0x20]
00af0794	ldr q0,[x19, #0x10]
00af0798	str q0,[x20, #0x10]
00af079c	ldr q0,[x19]
00af07a0	str q0,[x20]
00af07a4	bl 0x00c34750
00af07a8	mov w0,#0x1
00af07ac	b 0x00af07b4
00af07b0	mov w0,wzr
00af07b4	ldp x29,x30,[sp, #0x10]
00af07b8	ldp x20,x19,[sp], #0x20
00af07bc	ret

; _INIT_181 @ 0097b678
0097b678	stp x22,x21,[sp, #-0x30]!
0097b67c	stp x20,x19,[sp, #0x10]
0097b680	stp x29,x30,[sp, #0x20]
0097b684	add x29,sp,#0x20
0097b688	adrp x1,0xcb4000
0097b68c	ldr x1,[x1, #0xf08]
0097b690	mov w8,#0x4f50
0097b694	mov w21,#0x8
0097b698	movk w8,#0x5453, LSL #16
0097b69c	stp xzr,xzr,[x1]
0097b6a0	str xzr,[x1, #0x10]
0097b6a4	strb w21,[x1]
0097b6a8	stur w8,[x1, #0x1]
0097b6ac	strb wzr,[x1, #0x5]
0097b6b0	adrp x19,0xcb4000
0097b6b4	ldr x19,[x19, #0x9c0]
0097b6b8	adrp x20,0xc48000
0097b6bc	add x20,x20,#0x880
0097b6c0	mov x2,x20
0097b6c4	mov x0,x19
0097b6c8	bl 0x00c2fe70
0097b6cc	adrp x1,0xcb4000
0097b6d0	ldr x1,[x1, #0xef0]
0097b6d4	mov w8,#0x4547
0097b6d8	orr w22,wzr,#0x6
0097b6dc	movk w8,#0x54, LSL #16
0097b6e0	mov x0,x19
0097b6e4	mov x2,x20
0097b6e8	stp xzr,xzr,[x1, #0x8]
0097b6ec	str xzr,[x1]
0097b6f0	strb w22,[x1]
0097b6f4	stur w8,[x1, #0x1]
0097b6f8	bl 0x00c2fe70
0097b6fc	adrp x1,0xcb4000
0097b700	ldr x1,[x1, #0xf00]
0097b704	mov w8,#0x4548
0097b708	movk w8,#0x4441, LSL #16
0097b70c	mov x0,x19
0097b710	mov x2,x20
0097b714	stp xzr,xzr,[x1, #0x8]
0097b718	str xzr,[x1]
0097b71c	strb w21,[x1]
0097b720	stur w8,[x1, #0x1]
0097b724	strb wzr,[x1, #0x5]
0097b728	bl 0x00c2fe70
0097b72c	adrp x1,0xcb4000
0097b730	ldr x1,[x1, #0xf18]
0097b734	mov w10,#0x4544
0097b738	orr w8,wzr,#0xc
0097b73c	mov w9,#0x4554
0097b740	movk w10,#0x454c, LSL #16
0097b744	mov x0,x19
0097b748	mov x2,x20
0097b74c	stp xzr,xzr,[x1, #0x8]
0097b750	strb w8,[x1]
0097b754	sturh w9,[x1, #0x5]
0097b758	stur w10,[x1, #0x1]
0097b75c	strb wzr,[x1, #0x7]
0097b760	bl 0x00c2fe70
0097b764	adrp x1,0xcb4000
0097b768	ldr x1,[x1, #0xef8]
0097b76c	mov w8,#0x5550
0097b770	movk w8,#0x54, LSL #16
0097b774	mov x0,x19
0097b778	mov x2,x20
0097b77c	stp xzr,xzr,[x1, #0x8]
0097b780	str xzr,[x1]
0097b784	strb w22,[x1]
0097b788	stur w8,[x1, #0x1]
0097b78c	bl 0x00c2fe70
0097b790	adrp x1,0xcb4000
0097b794	ldr x1,[x1, #0xf10]
0097b798	mov w9,#0x4150
0097b79c	mov w8,#0xa
0097b7a0	movk w9,#0x4354, LSL #16
0097b7a4	mov w10,#0x48
0097b7a8	stp xzr,xzr,[x1, #0x8]
0097b7ac	str xzr,[x1]
0097b7b0	strb w8,[x1]
0097b7b4	stur w9,[x1, #0x1]
0097b7b8	sturh w10,[x1, #0x5]
0097b7bc	mov x0,x19
0097b7c0	mov x2,x20
0097b7c4	ldp x29,x30,[sp, #0x20]
0097b7c8	ldp x20,x19,[sp, #0x10]
0097b7cc	ldp x22,x21,[sp], #0x30
0097b7d0	b 0x00c2fe70

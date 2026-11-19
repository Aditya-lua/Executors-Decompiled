; FUN_0083c680 @ 0083c680
0083c680	sub sp,sp,#0x70
0083c684	stp x29,x30,[sp, #0x10]
0083c688	str x27,[sp, #0x20]
0083c68c	stp x26,x25,[sp, #0x30]
0083c690	stp x24,x23,[sp, #0x40]
0083c694	stp x22,x21,[sp, #0x50]
0083c698	stp x20,x19,[sp, #0x60]
0083c69c	add x29,sp,#0x10
0083c6a0	mrs x23,tpidr_el0
0083c6a4	mov x21,x1
0083c6a8	mov x20,x0
0083c6ac	ldr x8,[x23, #0x28]
0083c6b0	str x8,[sp, #0x8]
0083c6b4	ldrb w8,[x1]
0083c6b8	ldp x10,x9,[x1, #0x8]
0083c6bc	lsr x11,x8,#0x1
0083c6c0	tst w8,#0x1
0083c6c4	csinc x1,x9,x1,ne
0083c6c8	csel x2,x11,x10,eq
0083c6cc	add x0,sp,#0x7
0083c6d0	bl 0x0083ba34
0083c6d4	ldr x24,[x20, #0x8]
0083c6d8	cbz x24,0x0083c7cc
0083c6dc	fmov d0,x24
0083c6e0	mov x19,x0
0083c6e4	cnt v0.8B,v0.8B
0083c6e8	addv b0,v0.8B
0083c6ec	fmov x25,d0
0083c6f0	cmp x25,#0x1
0083c6f4	b.hi 0x0083c704
0083c6f8	sub x8,x24,#0x1
0083c6fc	and x26,x8,x19
0083c700	b 0x0083c718
0083c704	cmp x19,x24
0083c708	mov x26,x19
0083c70c	b.cc 0x0083c718
0083c710	udiv x8,x19,x24
0083c714	msub x26,x8,x24,x19
0083c718	ldr x8,[x20]
0083c71c	ldr x8,[x8, x26, LSL #0x3]
0083c720	cbz x8,0x0083c7cc
0083c724	ldr x20,[x8]
0083c728	cbz x20,0x0083c7d0
0083c72c	ldrb w8,[x21]
0083c730	ldp x10,x11,[x21, #0x8]
0083c734	add x12,x21,#0x1
0083c738	sub x27,x24,#0x1
0083c73c	lsr x9,x8,#0x1
0083c740	tst w8,#0x1
0083c744	csel x22,x12,x11,eq
0083c748	csel x21,x9,x10,eq
0083c74c	b 0x0083c764
0083c750	and x8,x8,x27
0083c754	cmp x8,x26
0083c758	b.ne 0x0083c7cc
0083c75c	ldr x20,[x20]
0083c760	cbz x20,0x0083c7d0
0083c764	ldr x8,[x20, #0x8]
0083c768	cmp x8,x19
0083c76c	b.ne 0x0083c7b0
0083c770	ldrb w8,[x20, #0x10]
0083c774	ldr x9,[x20, #0x18]
0083c778	lsr x10,x8,#0x1
0083c77c	tst w8,#0x1
0083c780	csel x9,x10,x9,eq
0083c784	cmp x9,x21
0083c788	b.ne 0x0083c75c
0083c78c	ldr x9,[x20, #0x20]
0083c790	add x10,x20,#0x11
0083c794	tst w8,#0x1
0083c798	mov x1,x22
0083c79c	mov x2,x21
0083c7a0	csel x0,x10,x9,eq
0083c7a4	bl 0x00c300b0
0083c7a8	cbnz w0,0x0083c75c
0083c7ac	b 0x0083c7d0
0083c7b0	cmp x25,#0x1
0083c7b4	b.ls 0x0083c750
0083c7b8	cmp x8,x24
0083c7bc	b.cc 0x0083c754
0083c7c0	udiv x9,x8,x24
0083c7c4	msub x8,x9,x24,x8
0083c7c8	b 0x0083c754
0083c7cc	mov x20,xzr
0083c7d0	ldr x8,[x23, #0x28]
0083c7d4	ldr x9,[sp, #0x8]
0083c7d8	cmp x8,x9
0083c7dc	b.ne 0x0083c804
0083c7e0	mov x0,x20
0083c7e4	ldp x20,x19,[sp, #0x60]
0083c7e8	ldr x27,[sp, #0x20]
0083c7ec	ldp x22,x21,[sp, #0x50]
0083c7f0	ldp x24,x23,[sp, #0x40]
0083c7f4	ldp x26,x25,[sp, #0x30]
0083c7f8	ldp x29,x30,[sp, #0x10]
0083c7fc	add sp,sp,#0x70
0083c800	ret
0083c804	bl 0x00c2fec0

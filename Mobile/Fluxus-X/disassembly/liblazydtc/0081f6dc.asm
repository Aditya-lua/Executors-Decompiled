; FUN_0081f6dc @ 0081f6dc
0081f6dc	stp x29,x30,[sp, #-0x30]!
0081f6e0	stp x22,x21,[sp, #0x10]
0081f6e4	stp x20,x19,[sp, #0x20]
0081f6e8	mov x29,sp
0081f6ec	ldrb w8,[x1]
0081f6f0	ldp x11,x10,[x1, #0x8]
0081f6f4	ldrb w13,[x0]
0081f6f8	mov w9,#0x16
0081f6fc	mov x19,x0
0081f700	tst w8,#0x1
0081f704	lsr x12,x8,#0x1
0081f708	csinc x7,x10,x1,ne
0081f70c	ldp x8,x10,[x0]
0081f710	csel x6,x12,x11,eq
0081f714	tst w13,#0x1
0081f718	and x11,x8,#-0x2
0081f71c	ubfx x12,x8,#0x1,#0x7
0081f720	sub x11,x11,#0x1
0081f724	csel x1,x9,x11,eq
0081f728	tst x8,#0x1
0081f72c	csel x20,x12,x10,eq
0081f730	sub x9,x1,x20
0081f734	cmp x9,x6
0081f738	b.cs 0x0081f75c
0081f73c	sub x8,x6,x1
0081f740	mov x0,x19
0081f744	mov x3,x20
0081f748	add x2,x8,x20
0081f74c	mov x4,x20
0081f750	mov x5,xzr
0081f754	bl 0x00c30200
0081f758	b 0x0081f7a0
0081f75c	cbz x6,0x0081f7a0
0081f760	ldr x9,[x19, #0x10]
0081f764	tst x8,#0x1
0081f768	mov x1,x7
0081f76c	mov x2,x6
0081f770	mov x22,x6
0081f774	csinc x21,x9,x19,ne
0081f778	add x0,x21,x20
0081f77c	bl 0x00c2ff60
0081f780	ldrb w9,[x19]
0081f784	add x8,x20,x22
0081f788	tbnz w9,#0x0,0x0081f798
0081f78c	lsl w9,w8,#0x1
0081f790	strb w9,[x19]
0081f794	b 0x0081f79c
0081f798	str x8,[x19, #0x8]
0081f79c	strb wzr,[x21, x8]
0081f7a0	mov x0,x19
0081f7a4	ldp x20,x19,[sp, #0x20]
0081f7a8	ldp x22,x21,[sp, #0x10]
0081f7ac	ldp x29,x30,[sp], #0x30
0081f7b0	ret

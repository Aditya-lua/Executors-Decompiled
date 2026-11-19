; FUN_00bcb00c @ 00bcb00c
00bcb00c	paciasp
00bcb010	stp x29,x30,[sp, #-0x40]!
00bcb014	stp x28,x23,[sp, #0x10]
00bcb018	stp x22,x21,[sp, #0x20]
00bcb01c	stp x20,x19,[sp, #0x30]
00bcb020	mov x29,sp
00bcb024	sub sp,sp,#0x400
00bcb028	mov w22,w1
00bcb02c	mov x19,x8
00bcb030	bl 0x00c30710
00bcb034	mov x21,x0
00bcb038	ldr w23,[x0]
00bcb03c	mov x1,sp
00bcb040	mov w0,w22
00bcb044	mov w2,#0x400
00bcb048	mov x20,sp
00bcb04c	bl 0x00c31fe0
00bcb050	cbz w0,0x00bcb070
00bcb054	cmn w0,#0x1
00bcb058	b.ne 0x00bcb060
00bcb05c	ldr w0,[x21]
00bcb060	cmp w0,#0x16
00bcb064	b.ne 0x00bcb120
00bcb068	adrp x20,0x2ab000
00bcb06c	add x20,x20,#0x32c
00bcb070	ldrb w8,[x20]
00bcb074	cbnz w8,0x00bcb094
00bcb078	adrp x2,0x2c8000
00bcb07c	add x2,x2,#0xf39
00bcb080	mov x0,sp
00bcb084	mov w1,#0x400
00bcb088	mov w3,w22
00bcb08c	mov x20,sp
00bcb090	bl 0x00c31ed0
00bcb094	mov x0,x20
00bcb098	str w23,[x21]
00bcb09c	bl 0x00c2ff50
00bcb0a0	cmn x0,#0x8
00bcb0a4	b.cs 0x00bcb11c
00bcb0a8	mov x21,x0
00bcb0ac	cmp x0,#0x17
00bcb0b0	b.cs 0x00bcb0c4
00bcb0b4	lsl w8,w21,#0x1
00bcb0b8	strb w8,[x19], #0x1
00bcb0bc	cbnz x21,0x00bcb0ec
00bcb0c0	b 0x00bcb0fc
00bcb0c4	orr x8,x21,#0x7
00bcb0c8	mov w9,#0x1a
00bcb0cc	cmp x8,#0x17
00bcb0d0	csinc x22,x9,x8,eq
00bcb0d4	mov x0,x22
00bcb0d8	bl 0x00c2fed0
00bcb0dc	orr x8,x22,#0x1
00bcb0e0	stp x21,x0,[x19, #0x8]
00bcb0e4	str x8,[x19]
00bcb0e8	mov x19,x0
00bcb0ec	mov x0,x19
00bcb0f0	mov x1,x20
00bcb0f4	mov x2,x21
00bcb0f8	bl 0x00c2ff60
00bcb0fc	strb wzr,[x19, x21]
00bcb100	add sp,sp,#0x400
00bcb104	ldp x20,x19,[sp, #0x30]
00bcb108	ldp x22,x21,[sp, #0x20]
00bcb10c	ldp x28,x23,[sp, #0x10]
00bcb110	ldp x29,x30,[sp], #0x40
00bcb114	autiasp
00bcb118	ret
00bcb11c	bl 0x007fe124
00bcb120	bl 0x00c30b40

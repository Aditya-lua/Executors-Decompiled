; FUN_0091e888 @ 0091e888
0091e888	adrp x8,0x746000
0091e88c	add x8,x8,#0xb08
0091e890	mov x4,x3
0091e894	mov x3,x2
0091e898	mov x2,x1
0091e89c	mov x1,x0
0091e8a0	mov x0,x8
0091e8a4	b 0x0091e8a8
0091e8a8	str x23,[sp, #-0x40]!
0091e8ac	stp x22,x21,[sp, #0x10]
0091e8b0	stp x20,x19,[sp, #0x20]
0091e8b4	stp x29,x30,[sp, #0x30]
0091e8b8	add x29,sp,#0x30
0091e8bc	mov x19,x4
0091e8c0	mov x20,x3
0091e8c4	mov x23,x2
0091e8c8	mov x22,x1
0091e8cc	mov x21,x0
0091e8d0	str xzr,[x3]
0091e8d4	str xzr,[x4]
0091e8d8	cbnz x2,0x0091e8e8
0091e8dc	mov x0,x22
0091e8e0	bl 0x00c2ff50
0091e8e4	mov x23,x0
0091e8e8	adrp x8,0xcc4000
0091e8ec	add x8,x8,#0x670
0091e8f0	orr x10,xzr,#-0x5555555555555556
0091e8f4	add x9,x23,#0x2
0091e8f8	movk x10,#0xaaab
0091e8fc	ldr x8,[x8]
0091e900	umulh x9,x9,x10
0091e904	lsr x9,x9,#0x1
0091e908	mov w0,#0x1
0091e90c	bfm x0,x9,#0x3e,#0x3d
0091e910	blr x8
0091e914	cbz x0,0x0091e994
0091e918	cmp x23,#0x3
0091e91c	b.cc 0x0091e99c
0091e920	mov x8,x0
0091e924	ldrb w9,[x22]
0091e928	sub x23,x23,#0x3
0091e92c	cmp x23,#0x2
0091e930	lsr w9,w9,#0x2
0091e934	ldrb w9,[x21, w9, UXTW ]
0091e938	strb w9,[x8]
0091e93c	ldrb w9,[x22, #0x1]
0091e940	ldrb w10,[x22]
0091e944	lsr w9,w9,#0x4
0091e948	bfm w9,w10,#0x1c,#0x1
0091e94c	ldrb w9,[x21, w9, UXTW ]
0091e950	strb w9,[x8, #0x1]
0091e954	ldrb w9,[x22, #0x2]
0091e958	ldrb w10,[x22, #0x1]
0091e95c	lsr w9,w9,#0x6
0091e960	bfm w9,w10,#0x1e,#0x3
0091e964	ldrb w9,[x21, w9, UXTW ]
0091e968	strb w9,[x8, #0x2]
0091e96c	ldrb w9,[x22, #0x2]
0091e970	add x22,x22,#0x3
0091e974	and x9,x9,#0x3f
0091e978	ldrb w10,[x21, x9]
0091e97c	add x9,x8,#0x4
0091e980	strb w10,[x8, #0x3]
0091e984	mov x8,x9
0091e988	b.hi 0x0091e924
0091e98c	cbnz x23,0x0091e9a4
0091e990	b 0x0091ea2c
0091e994	mov w8,#0x1b
0091e998	b 0x0091ea40
0091e99c	mov x9,x0
0091e9a0	cbz x23,0x0091ea2c
0091e9a4	ldrb w8,[x22]
0091e9a8	cmp x23,#0x1
0091e9ac	lsr w8,w8,#0x2
0091e9b0	ldrb w8,[x21, w8, UXTW ]
0091e9b4	strb w8,[x9]
0091e9b8	ldrb w8,[x22]
0091e9bc	ubfiz w8,w8,#0x4,#0x2
0091e9c0	b.ne 0x0091e9e4
0091e9c4	and x8,x8,#0xff
0091e9c8	ldrb w8,[x21, x8]
0091e9cc	strb w8,[x9, #0x1]
0091e9d0	ldrb w8,[x21, #0x40]
0091e9d4	cbz w8,0x0091ea20
0091e9d8	strb w8,[x9, #0x2]
0091e9dc	ldrb w8,[x21, #0x40]
0091e9e0	b 0x0091ea10
0091e9e4	ldrb w10,[x22, #0x1]
0091e9e8	orr w8,w8,w10, LSR #0x4
0091e9ec	and x8,x8,#0xff
0091e9f0	ldrb w8,[x21, x8]
0091e9f4	strb w8,[x9, #0x1]
0091e9f8	ldrb w8,[x22, #0x1]
0091e9fc	ubfiz w8,w8,#0x2,#0x4
0091ea00	ldrb w8,[x21, w8, UXTW ]
0091ea04	strb w8,[x9, #0x2]
0091ea08	ldrb w8,[x21, #0x40]
0091ea0c	cbz w8,0x0091ea28
0091ea10	add x10,x9,#0x4
0091ea14	strb w8,[x9, #0x3]
0091ea18	mov x9,x10
0091ea1c	b 0x0091ea2c
0091ea20	add x9,x9,#0x2
0091ea24	b 0x0091ea2c
0091ea28	add x9,x9,#0x3
0091ea2c	mov w8,wzr
0091ea30	strb wzr,[x9]
0091ea34	sub x9,x9,x0
0091ea38	str x0,[x20]
0091ea3c	str x9,[x19]
0091ea40	ldp x29,x30,[sp, #0x30]
0091ea44	ldp x20,x19,[sp, #0x20]
0091ea48	ldp x22,x21,[sp, #0x10]
0091ea4c	mov w0,w8
0091ea50	ldr x23,[sp], #0x40
0091ea54	ret

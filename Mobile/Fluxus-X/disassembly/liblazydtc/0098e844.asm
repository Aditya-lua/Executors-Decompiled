; ix::WebSocket::connectToSocket @ 0098e844
0098e844	sub sp,sp,#0x150
0098e848	str x28,[sp, #0xf0]
0098e84c	stp x26,x25,[sp, #0x100]
0098e850	stp x24,x23,[sp, #0x110]
0098e854	stp x22,x21,[sp, #0x120]
0098e858	stp x20,x19,[sp, #0x130]
0098e85c	stp x29,x30,[sp, #0x140]
0098e860	add x29,sp,#0x140
0098e864	mrs x26,tpidr_el0
0098e868	mov x19,x8
0098e86c	ldr x8,[x26, #0x28]
0098e870	add x25,x0,#0x3a0
0098e874	mov x21,x0
0098e878	mov x0,x25
0098e87c	mov x23,x4
0098e880	mov w22,w3
0098e884	mov w20,w2
0098e888	mov x24,x1
0098e88c	stur x8,[x29, #-0x58]
0098e890	bl 0x00c2ff10
0098e894	ldr w4,[x21, #0x4a4]
0098e898	ldrb w3,[x21, #0x4a0]
0098e89c	add x1,x21,#0x310
0098e8a0	add x2,x21,#0x318
0098e8a4	mov x0,x21
0098e8a8	bl 0x00c338d0
0098e8ac	mov x0,x25
0098e8b0	bl 0x00c2ff20
0098e8b4	ldr x8,[x24]
0098e8b8	str xzr,[x24]
0098e8bc	str x8,[sp, #0x80]
0098e8c0	ldr x8,[x23]
0098e8c4	str x8,[sp, #0x70]
0098e8c8	ldr x8,[x23, #0x8]
0098e8cc	str x8,[sp, #0x78]
0098e8d0	cbz x8,0x0098e8e8
0098e8d4	add x8,x8,#0x8
0098e8d8	ldxr x9,[x8]
0098e8dc	add x9,x9,#0x1
0098e8e0	stxr w10,x9,[x8]
0098e8e4	cbnz w10,0x0098e8d8
0098e8e8	and w3,w22,#0x1
0098e8ec	add x1,sp,#0x80
0098e8f0	add x4,sp,#0x70
0098e8f4	mov x8,x19
0098e8f8	mov x0,x21
0098e8fc	mov w2,w20
0098e900	bl 0x00c33860
0098e904	ldr x20,[sp, #0x78]
0098e908	cbz x20,0x0098e93c
0098e90c	add x8,x20,#0x8
0098e910	ldaxr x9,[x8]
0098e914	sub x10,x9,#0x1
0098e918	stlxr w11,x10,[x8]
0098e91c	cbnz w11,0x0098e910
0098e920	cbnz x9,0x0098e93c
0098e924	ldr x8,[x20]
0098e928	mov x0,x20
0098e92c	ldr x8,[x8, #0x10]
0098e930	blr x8
0098e934	mov x0,x20
0098e938	bl 0x00c2ff00
0098e93c	ldr x0,[sp, #0x80]
0098e940	str xzr,[sp, #0x80]
0098e944	cbz x0,0x0098e954
0098e948	ldr x8,[x0]
0098e94c	ldr x8,[x8, #0x8]
0098e950	blr x8
0098e954	ldrb w8,[x19]
0098e958	cbz w8,0x0098eaac
0098e95c	mov w8,#0x1
0098e960	movi v0.2D,#0x0
0098e964	add x20,x19,#0x38
0098e968	stp wzr,w8,[sp, #0x60]
0098e96c	stur xzr,[x29, #-0x60]
0098e970	add x2,x19,#0x20
0098e974	stp xzr,xzr,[sp]
0098e978	stp q0,q0,[x29, #-0x80]
0098e97c	stur q0,[x29, #-0x90]
0098e980	str xzr,[sp, #0x10]
0098e984	add x0,sp,#0x18
0098e988	mov x3,sp
0098e98c	mov x1,x20
0098e990	bl 0x00c337d0
0098e994	strh wzr,[sp, #0x88]
0098e998	stp xzr,xzr,[sp, #0x98]
0098e99c	strb wzr,[sp, #0xa8]
0098e9a0	str xzr,[sp, #0x90]
0098e9a4	adrp x1,0xd21000
0098e9a8	add x1,x1,#0x6c0
0098e9ac	add x8,sp,#0x68
0098e9b0	add x0,sp,#0x64
0098e9b4	add x2,sp,#0x60
0098e9b8	sub x3,x29,#0x90
0098e9bc	add x4,sp,#0x18
0098e9c0	add x5,sp,#0x88
0098e9c4	bl 0x00c33790
0098e9c8	ldr x0,[x21, #0x3f0]
0098e9cc	cbz x0,0x0098eb04
0098e9d0	ldr x8,[x0]
0098e9d4	ldr x8,[x8, #0x30]
0098e9d8	add x1,sp,#0x68
0098e9dc	blr x8
0098e9e0	ldr x22,[sp, #0x68]
0098e9e4	str xzr,[sp, #0x68]
0098e9e8	cbz x22,0x0098ea40
0098e9ec	ldrb w8,[x22, #0xa0]
0098e9f0	tbz w8,#0x0,0x0098e9fc
0098e9f4	ldr x0,[x22, #0xb0]
0098e9f8	bl 0x00c301d0
0098e9fc	ldrb w8,[x22, #0x80]
0098ea00	tbz w8,#0x0,0x0098ea0c
0098ea04	ldr x0,[x22, #0x90]
0098ea08	bl 0x00c301d0
0098ea0c	ldr x1,[x22, #0x70]
0098ea10	add x0,x22,#0x68
0098ea14	bl 0x00c32fc0
0098ea18	ldrb w8,[x22, #0x50]
0098ea1c	tbz w8,#0x0,0x0098ea28
0098ea20	ldr x0,[x22, #0x60]
0098ea24	bl 0x00c301d0
0098ea28	ldrb w8,[x22, #0x30]
0098ea2c	tbz w8,#0x0,0x0098ea38
0098ea30	ldr x0,[x22, #0x40]
0098ea34	bl 0x00c301d0
0098ea38	mov x0,x22
0098ea3c	bl 0x00c301d0
0098ea40	ldrb w8,[sp, #0x90]
0098ea44	tbz w8,#0x0,0x0098ea50
0098ea48	ldr x0,[sp, #0xa0]
0098ea4c	bl 0x00c301d0
0098ea50	ldrb w8,[sp, #0x48]
0098ea54	tbz w8,#0x0,0x0098ea60
0098ea58	ldr x0,[sp, #0x58]
0098ea5c	bl 0x00c301d0
0098ea60	ldr x1,[sp, #0x38]
0098ea64	add x8,sp,#0x18
0098ea68	add x0,x8,#0x18
0098ea6c	bl 0x00c32fc0
0098ea70	ldrb w8,[sp, #0x18]
0098ea74	tbnz w8,#0x0,0x0098eadc
0098ea78	ldrb w8,[sp]
0098ea7c	tbnz w8,#0x0,0x0098eaec
0098ea80	ldurb w8,[x29, #-0x78]
0098ea84	tbz w8,#0x0,0x0098ea90
0098ea88	ldur x0,[x29, #-0x68]
0098ea8c	bl 0x00c301d0
0098ea90	ldr w8,[x21, #0x4a4]
0098ea94	cmp w8,#0x1
0098ea98	b.lt 0x0098eaac
0098ea9c	ldr w1,[x21, #0x4c8]
0098eaa0	add x8,sp,#0x18
0098eaa4	mov x0,x21
0098eaa8	bl 0x00c33840
0098eaac	ldr x8,[x26, #0x28]
0098eab0	ldur x9,[x29, #-0x58]
0098eab4	cmp x8,x9
0098eab8	b.ne 0x0098eb00
0098eabc	ldp x29,x30,[sp, #0x140]
0098eac0	ldp x20,x19,[sp, #0x130]
0098eac4	ldp x22,x21,[sp, #0x120]
0098eac8	ldp x24,x23,[sp, #0x110]
0098eacc	ldp x26,x25,[sp, #0x100]
0098ead0	ldr x28,[sp, #0xf0]
0098ead4	add sp,sp,#0x150
0098ead8	ret
0098eadc	ldr x0,[sp, #0x28]
0098eae0	bl 0x00c301d0
0098eae4	ldrb w8,[sp]
0098eae8	tbz w8,#0x0,0x0098ea80
0098eaec	ldr x0,[sp, #0x10]
0098eaf0	bl 0x00c301d0
0098eaf4	ldurb w8,[x29, #-0x78]
0098eaf8	tbnz w8,#0x0,0x0098ea88
0098eafc	b 0x0098ea90
0098eb00	bl 0x00c2fec0
0098eb04	mov w0,#0x8
0098eb08	bl 0x00c30000
0098eb0c	adrp x8,0xcb4000
0098eb10	ldr x8,[x8, #0xb50]
0098eb14	add x8,x8,#0x10
0098eb18	str x8,[x0]
0098eb1c	adrp x1,0xcb4000
0098eb20	adrp x2,0xcb4000
0098eb24	ldr x1,[x1, #0xb58]
0098eb28	ldr x2,[x2, #0xb38]
0098eb2c	bl 0x00c30020

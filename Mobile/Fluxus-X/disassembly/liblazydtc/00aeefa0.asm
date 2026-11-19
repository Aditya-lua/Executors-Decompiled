; UI_set_result_ex @ 00aeefa0
00aeefa0	str x23,[sp, #-0x40]!
00aeefa4	stp x22,x21,[sp, #0x10]
00aeefa8	stp x20,x19,[sp, #0x20]
00aeefac	stp x29,x30,[sp, #0x30]
00aeefb0	ldr w8,[x0, #0x28]
00aeefb4	mov w20,w3
00aeefb8	mov x19,x1
00aeefbc	add x29,sp,#0x30
00aeefc0	and w9,w8,#0xfffffffe
00aeefc4	str w9,[x0, #0x28]
00aeefc8	ldr w9,[x1]
00aeefcc	sub w10,w9,#0x1
00aeefd0	cmp w10,#0x2
00aeefd4	b.cs 0x00aef020
00aeefd8	ldr w9,[x19, #0x28]
00aeefdc	cmp w9,w20
00aeefe0	b.le 0x00aef080
00aeefe4	orr w8,w8,#0x1
00aeefe8	str w8,[x0, #0x28]
00aeefec	bl 0x00c342a0
00aeeff0	adrp x0,0x2a0000
00aeeff4	adrp x2,0x2ac000
00aeeff8	add x0,x0,#0xc2f
00aeeffc	add x2,x2,#0x812
00aef000	mov w1,#0x378
00aef004	bl 0x00c342b0
00aef008	ldp w3,w4,[x19, #0x28]
00aef00c	adrp x2,0x2a2000
00aef010	add x2,x2,#0xd0f
00aef014	mov w0,#0x28
00aef018	mov w1,#0x65
00aef01c	b 0x00aef0c4
00aef020	cmp w9,#0x3
00aef024	mov w0,wzr
00aef028	b.ne 0x00aef170
00aef02c	ldr x8,[x19, #0x18]
00aef030	cbz x8,0x00aef108
00aef034	strb wzr,[x8]
00aef038	ldrb w8,[x2]
00aef03c	cbz w8,0x00aef078
00aef040	ldr x20,[x19, #0x30]
00aef044	add x23,x2,#0x1
00aef048	and w21,w8,#0xff
00aef04c	mov x0,x20
00aef050	mov w1,w21
00aef054	bl 0x00c30890
00aef058	cbnz x0,0x00aef158
00aef05c	ldr x22,[x19, #0x38]
00aef060	mov w1,w21
00aef064	mov x0,x22
00aef068	bl 0x00c30890
00aef06c	cbnz x0,0x00aef160
00aef070	ldrb w8,[x23], #0x1
00aef074	cbnz w8,0x00aef048
00aef078	mov w0,wzr
00aef07c	b 0x00aef170
00aef080	ldr w9,[x19, #0x2c]
00aef084	cmp w9,w20
00aef088	b.ge 0x00aef0d0
00aef08c	orr w8,w8,#0x1
00aef090	str w8,[x0, #0x28]
00aef094	bl 0x00c342a0
00aef098	adrp x0,0x2a0000
00aef09c	adrp x2,0x2ac000
00aef0a0	add x0,x0,#0xc2f
00aef0a4	add x2,x2,#0x812
00aef0a8	orr w1,wzr,#0x380
00aef0ac	bl 0x00c342b0
00aef0b0	ldp w3,w4,[x19, #0x28]
00aef0b4	adrp x2,0x2a2000
00aef0b8	add x2,x2,#0xd0f
00aef0bc	mov w0,#0x28
00aef0c0	mov w1,#0x64
00aef0c4	bl 0x00c342c0
00aef0c8	mov w0,#0xffffffff
00aef0cc	b 0x00aef170
00aef0d0	ldr x0,[x19, #0x18]
00aef0d4	cbz x0,0x00aef124
00aef0d8	sxtw x21,w20
00aef0dc	mov x1,x2
00aef0e0	mov x2,x21
00aef0e4	bl 0x00c2ffd0
00aef0e8	ldr w8,[x19, #0x2c]
00aef0ec	cmp w8,w20
00aef0f0	b.lt 0x00aef0fc
00aef0f4	ldr x8,[x19, #0x18]
00aef0f8	strb wzr,[x8, x21]
00aef0fc	mov w0,wzr
00aef100	str x21,[x19, #0x20]
00aef104	b 0x00aef170
00aef108	bl 0x00c342a0
00aef10c	adrp x0,0x2a0000
00aef110	adrp x2,0x2ac000
00aef114	add x0,x0,#0xc2f
00aef118	add x2,x2,#0x812
00aef11c	mov w1,#0x396
00aef120	b 0x00aef13c
00aef124	bl 0x00c342a0
00aef128	adrp x0,0x2a0000
00aef12c	adrp x2,0x2ac000
00aef130	add x0,x0,#0xc2f
00aef134	add x2,x2,#0x812
00aef138	mov w1,#0x388
00aef13c	bl 0x00c342b0
00aef140	mov w0,#0x28
00aef144	mov w1,#0x69
00aef148	mov x2,xzr
00aef14c	bl 0x00c342c0
00aef150	mov w0,#0xffffffff
00aef154	b 0x00aef170
00aef158	ldrb w8,[x20]
00aef15c	b 0x00aef164
00aef160	ldrb w8,[x22]
00aef164	mov w0,wzr
00aef168	ldr x9,[x19, #0x18]
00aef16c	strb w8,[x9]
00aef170	ldp x29,x30,[sp, #0x30]
00aef174	ldp x20,x19,[sp, #0x20]
00aef178	ldp x22,x21,[sp, #0x10]
00aef17c	ldr x23,[sp], #0x40
00aef180	ret

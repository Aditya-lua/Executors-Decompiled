; curl_multi_cleanup @ 0092adb0
0092adb0	sub sp,sp,#0x60
0092adb4	stp x24,x23,[sp, #0x20]
0092adb8	stp x22,x21,[sp, #0x30]
0092adbc	stp x20,x19,[sp, #0x40]
0092adc0	stp x29,x30,[sp, #0x50]
0092adc4	add x29,sp,#0x50
0092adc8	mrs x21,tpidr_el0
0092adcc	ldr x8,[x21, #0x28]
0092add0	mov x19,x0
0092add4	str x8,[sp, #0x18]
0092add8	cbz x0,0x0092afc8
0092addc	ldr w8,[x19]
0092ade0	mov w9,#0xab1e
0092ade4	movk w9,#0xb, LSL #16
0092ade8	cmp w8,w9
0092adec	b.ne 0x0092afc8
0092adf0	ldrb w8,[x19, #0x231]
0092adf4	tbnz w8,#0x2,0x0092ae3c
0092adf8	ldr x8,[x19, #0x60]
0092adfc	str wzr,[x19]
0092ae00	cbz x8,0x0092ae0c
0092ae04	ldr x8,[x8]
0092ae08	str xzr,[x8, #0xc0]
0092ae0c	ldr x8,[x19, #0x40]
0092ae10	cbz x8,0x0092ae44
0092ae14	ldr x20,[x8]
0092ae18	mov x22,x19
0092ae1c	str xzr,[x20, #0x10]
0092ae20	ldr x8,[x22, #0x8]!
0092ae24	cbz x8,0x0092ae54
0092ae28	mov x8,x19
0092ae2c	ldr x9,[x8, #0x10]!
0092ae30	str x20,[x9, #0x10]
0092ae34	str x9,[x20, #0x18]
0092ae38	b 0x0092ae60
0092ae3c	mov w0,#0x8
0092ae40	b 0x0092afcc
0092ae44	add x22,x19,#0x8
0092ae48	ldr x20,[x22]
0092ae4c	cbnz x20,0x0092aea8
0092ae50	b 0x0092af14
0092ae54	add x8,x19,#0x10
0092ae58	str xzr,[x20, #0x18]
0092ae5c	str x20,[x19, #0x8]
0092ae60	str x20,[x8]
0092ae64	ldr w8,[x20, #0x58]
0092ae68	cmp w8,#0x3
0092ae6c	b.eq 0x0092ae80
0092ae70	orr w8,wzr,#0x3
0092ae74	mov x0,x20
0092ae78	str w8,[x20, #0x58]
0092ae7c	bl 0x009425cc
0092ae80	add x0,x19,#0x40
0092ae84	add x1,x20,#0x28
0092ae88	mov x2,xzr
0092ae8c	bl 0x00925d80
0092ae90	mov w2,#0x8
0092ae94	mov x0,x20
0092ae98	mov x1,xzr
0092ae9c	bl 0x0092aff8
0092aea0	ldr x20,[x22]
0092aea4	cbz x20,0x0092af14
0092aea8	mov w22,#0xdbad
0092aeac	movk w22,#0xc0de, LSL #16
0092aeb0	mov w23,#0x131d
0092aeb4	ldr w8,[x20]
0092aeb8	cmp w8,w22
0092aebc	b.ne 0x0092afc8
0092aec0	ldrb w8,[x20, x23]
0092aec4	ldr x24,[x20, #0x10]
0092aec8	tbnz w8,#0x2,0x0092aee4
0092aecc	ldr x8,[x20, #0x20]
0092aed0	cbz x8,0x0092aee4
0092aed4	mov w2,#0x1
0092aed8	mov x0,x20
0092aedc	mov w1,wzr
0092aee0	bl 0x0092b674
0092aee4	ldr w8,[x20, #0xb8]
0092aee8	cmp w8,#0x1
0092aeec	b.ne 0x0092af04
0092aef0	ldr x1,[x20, #0xb0]
0092aef4	mov x0,x20
0092aef8	bl 0x00917c84
0092aefc	str xzr,[x20, #0xb0]
0092af00	str wzr,[x20, #0xb8]
0092af04	str xzr,[x20, #0xc38]
0092af08	str xzr,[x20, #0xc0]
0092af0c	mov x20,x24
0092af10	cbnz x24,0x0092aeb4
0092af14	mov x0,x19
0092af18	bl 0x00911360
0092af1c	add x20,x19,#0xf8
0092af20	mov x1,sp
0092af24	mov x0,x20
0092af28	bl 0x00916a74
0092af2c	b 0x0092af38
0092af30	ldr x0,[x0, #0x18]
0092af34	bl 0x00916838
0092af38	mov x0,sp
0092af3c	bl 0x00916a80
0092af40	cbnz x0,0x0092af30
0092af44	mov x0,x20
0092af48	bl 0x00916838
0092af4c	add x0,x19,#0x128
0092af50	bl 0x00916838
0092af54	add x0,x19,#0x158
0092af58	bl 0x0090fb7c
0092af5c	add x0,x19,#0xa0
0092af60	bl 0x00916838
0092af64	ldr w0,[x19, #0x220]
0092af68	bl 0x00c31bf0
0092af6c	ldr w0,[x19, #0x224]
0092af70	bl 0x00c31bf0
0092af74	adrp x20,0xcc4000
0092af78	add x20,x20,#0x678
0092af7c	ldr x0,[x19, #0xd8]
0092af80	ldr x8,[x20]
0092af84	blr x8
0092af88	ldrb w8,[x19, #0x231]
0092af8c	stp xzr,xzr,[x19, #0xd8]
0092af90	ldr x0,[x19, #0xe8]
0092af94	and w8,w8,#0xffffffdf
0092af98	strb w8,[x19, #0x231]
0092af9c	ldr x8,[x20]
0092afa0	blr x8
0092afa4	ldrb w8,[x19, #0x231]
0092afa8	stp xzr,xzr,[x19, #0xe8]
0092afac	mov x0,x19
0092afb0	and w8,w8,#0xffffffbf
0092afb4	strb w8,[x19, #0x231]
0092afb8	ldr x8,[x20]
0092afbc	blr x8
0092afc0	mov w0,wzr
0092afc4	b 0x0092afcc
0092afc8	mov w0,#0x1
0092afcc	ldr x8,[x21, #0x28]
0092afd0	ldr x9,[sp, #0x18]
0092afd4	cmp x8,x9
0092afd8	b.ne 0x0092aff4
0092afdc	ldp x29,x30,[sp, #0x50]
0092afe0	ldp x20,x19,[sp, #0x40]
0092afe4	ldp x22,x21,[sp, #0x30]
0092afe8	ldp x24,x23,[sp, #0x20]
0092afec	add sp,sp,#0x60
0092aff0	ret
0092aff4	bl 0x00c2fec0

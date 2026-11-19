; FUN_0084aeac @ 0084aeac
0084aeac	stp x29,x30,[sp, #-0x40]!
0084aeb0	stp x24,x23,[sp, #0x10]
0084aeb4	stp x22,x21,[sp, #0x20]
0084aeb8	stp x20,x19,[sp, #0x30]
0084aebc	mov x29,sp
0084aec0	ldr q0,[x3]
0084aec4	ldr q1,[x0]
0084aec8	orr x10,xzr,#-0x5555555555555556
0084aecc	movk x10,#0xaaab
0084aed0	ldr x24,[x3, #0x30]
0084aed4	mov w21,w4
0084aed8	zip2 v2.2D,v1.2D,v0.2D
0084aedc	zip1 v0.2D,v1.2D,v0.2D
0084aee0	mov x19,x3
0084aee4	mov x22,x2
0084aee8	mov x20,x0
0084aeec	mov x23,x1
0084aef0	sub v0.2D,v2.2D,v0.2D
0084aef4	sshr v2.2D,v0.2D,#0x3
0084aef8	mov x8,v2.D[0x1]
0084aefc	fmov x9,d2
0084af00	mul x9,x9,x10
0084af04	mul x8,x8,x10
0084af08	subs x8,x8,x9
0084af0c	b.ls 0x0084af2c
0084af10	mov x0,x20
0084af14	mov x1,x8
0084af18	bl 0x0084d3b8
0084af1c	ldp x11,x8,[x20]
0084af20	subs x8,x8,x11
0084af24	b.ne 0x0084af48
0084af28	b 0x0084afc8
0084af2c	fmov x11,d1
0084af30	b.cs 0x0084afbc
0084af34	mov x8,v0.D[0x1]
0084af38	add x8,x11,x8
0084af3c	str x8,[x20, #0x8]
0084af40	subs x8,x8,x11
0084af44	b.eq 0x0084afc8
0084af48	ldp x10,x12,[x19]
0084af4c	asr x8,x8,#0x3
0084af50	orr x13,xzr,#-0x5555555555555556
0084af54	mov x9,xzr
0084af58	add x11,x11,#0x10
0084af5c	movk x13,#0xaaab
0084af60	sub x12,x12,x10
0084af64	mul x14,x8,x13
0084af68	asr x8,x12,#0x3
0084af6c	mul x12,x8,x13
0084af70	add x13,x19,#0x18
0084af74	sub x8,x23,x24
0084af78	cmp x14,#0x1
0084af7c	csinc x14,x14,xzr,hi
0084af80	cmp x9,x12
0084af84	add x9,x9,#0x1
0084af88	csel x15,x10,x13,cc
0084af8c	cmp x14,x9
0084af90	add x10,x10,#0x18
0084af94	ldr x16,[x15]
0084af98	add x16,x8,x16
0084af9c	stur x16,[x11, #-0x10]
0084afa0	ldr x16,[x15, #0x8]
0084afa4	ldrb w15,[x15, #0x10]
0084afa8	add x16,x8,x16
0084afac	stur x16,[x11, #-0x8]
0084afb0	strb w15,[x11], #0x18
0084afb4	b.ne 0x0084af80
0084afb8	b 0x0084afcc
0084afbc	ldr x8,[x20, #0x8]
0084afc0	subs x8,x8,x11
0084afc4	b.ne 0x0084af48
0084afc8	sub x8,x23,x24
0084afcc	stp x22,x22,[x20, #0x18]
0084afd0	ldrb w11,[x19, #0x40]
0084afd4	ldr x9,[x19, #0x30]
0084afd8	strb wzr,[x20, #0x28]
0084afdc	strb w11,[x20, #0x40]
0084afe0	add x9,x8,x9
0084afe4	str x9,[x20, #0x30]
0084afe8	ldr x10,[x19, #0x38]
0084afec	add x10,x8,x10
0084aff0	str x10,[x20, #0x38]
0084aff4	ldr x10,[x19, #0x48]
0084aff8	add x10,x8,x10
0084affc	str x10,[x20, #0x48]
0084b000	ldr x10,[x19, #0x50]
0084b004	add x8,x8,x10
0084b008	ldrb w10,[x19, #0x58]
0084b00c	str x8,[x20, #0x50]
0084b010	strb w10,[x20, #0x58]
0084b014	tbnz w21,#0x0,0x0084b01c
0084b018	str x9,[x20, #0x68]
0084b01c	ldrb w8,[x19, #0x60]
0084b020	strb w8,[x20, #0x60]
0084b024	ldp x20,x19,[sp, #0x30]
0084b028	ldp x22,x21,[sp, #0x20]
0084b02c	ldp x24,x23,[sp, #0x10]
0084b030	ldp x29,x30,[sp], #0x40
0084b034	ret

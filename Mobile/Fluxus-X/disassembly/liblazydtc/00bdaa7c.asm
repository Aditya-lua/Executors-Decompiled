; FUN_00bdaa7c @ 00bdaa7c
00bdaa7c	paciasp
00bdaa80	sub sp,sp,#0x180
00bdaa84	stp x29,x30,[sp, #0x120]
00bdaa88	stp x28,x27,[sp, #0x130]
00bdaa8c	stp x26,x25,[sp, #0x140]
00bdaa90	stp x24,x23,[sp, #0x150]
00bdaa94	stp x22,x21,[sp, #0x160]
00bdaa98	stp x20,x19,[sp, #0x170]
00bdaa9c	add x29,sp,#0x120
00bdaaa0	ldr w8,[x3, #0x8]
00bdaaa4	mov w9,#0x4a
00bdaaa8	mov x22,x4
00bdaaac	mov x0,x3
00bdaab0	mov x21,x2
00bdaab4	mov x19,x1
00bdaab8	ands w8,w8,w9
00bdaabc	sub x26,x29,#0x48
00bdaac0	str x5,[sp, #0x18]
00bdaac4	b.eq 0x00bdaae8
00bdaac8	cmp w8,#0x40
00bdaacc	b.eq 0x00bdaae0
00bdaad0	cmp w8,#0x8
00bdaad4	b.ne 0x00bdaaf0
00bdaad8	mov w23,#0x10
00bdaadc	b 0x00bdaaf4
00bdaae0	mov w23,#0x8
00bdaae4	b 0x00bdaaf4
00bdaae8	mov w23,wzr
00bdaaec	b 0x00bdaaf4
00bdaaf0	mov w23,#0xa
00bdaaf4	sub x8,x29,#0x28
00bdaaf8	sub x1,x29,#0xc
00bdaafc	bl 0x00c0bec0
00bdab00	stp xzr,xzr,[x26, #0x8]
00bdab04	str xzr,[x26, #0x18]
00bdab08	sub x0,x29,#0x40
00bdab0c	mov w1,#0x16
00bdab10	mov w2,wzr
00bdab14	sub x20,x29,#0x40
00bdab18	bl 0x00c30250
00bdab1c	ldurb w8,[x29, #-0x40]
00bdab20	add x10,sp,#0x38
00bdab24	str x22,[sp, #0x20]
00bdab28	ldr x9,[x26, #0x18]
00bdab2c	str x10,[sp, #0x30]
00bdab30	adrp x28,0xcb5000
00bdab34	tst w8,#0x1
00bdab38	ldr x28,[x28, #0xc08]
00bdab3c	orr x27,x20,#0x1
00bdab40	csinc x24,x9,x20,ne
00bdab44	mov w20,#0x16
00bdab48	add x22,sp,#0x30
00bdab4c	str x24,[x26]
00bdab50	str wzr,[sp, #0x2c]
00bdab54	b 0x00bdab60
00bdab58	add x8,x8,#0x1
00bdab5c	str x8,[x19, #0x18]
00bdab60	cbz x19,0x00bdab8c
00bdab64	ldp x8,x9,[x19, #0x18]
00bdab68	cmp x8,x9
00bdab6c	b.eq 0x00bdab9c
00bdab70	mov w25,wzr
00bdab74	cbz x21,0x00bdab94
00bdab78	ldp x8,x9,[x21, #0x18]
00bdab7c	cmp x8,x9
00bdab80	b.eq 0x00bdabc0
00bdab84	tbnz w25,#0x0,0x00bdabe4
00bdab88	b 0x00bdad28
00bdab8c	mov w25,#0x1
00bdab90	cbnz x21,0x00bdab78
00bdab94	tbz w25,#0x0,0x00bdabe4
00bdab98	b 0x00bdad28
00bdab9c	ldr x8,[x19]
00bdaba0	ldr x8,[x8, #0x48]
00bdaba4	mov x0,x19
00bdaba8	blr x8
00bdabac	cmn w0,#0x1
00bdabb0	cset w25,eq
00bdabb4	csel x19,xzr,x19,eq
00bdabb8	cbnz x21,0x00bdab78
00bdabbc	b 0x00bdab94
00bdabc0	ldr x8,[x21]
00bdabc4	ldr x8,[x8, #0x48]
00bdabc8	mov x0,x21
00bdabcc	blr x8
00bdabd0	cmn w0,#0x1
00bdabd4	cset w8,eq
00bdabd8	csel x21,xzr,x21,eq
00bdabdc	cmp w25,w8
00bdabe0	b.eq 0x00bdad28
00bdabe4	ldurb w8,[x29, #-0x40]
00bdabe8	ldr x9,[x26, #0x10]
00bdabec	ldr x11,[x26]
00bdabf0	lsr x10,x8,#0x1
00bdabf4	tst w8,#0x1
00bdabf8	csel x25,x10,x9,eq
00bdabfc	add x9,x24,x25
00bdac00	cmp x11,x9
00bdac04	b.ne 0x00bdacbc
00bdac08	cmp x25,#0x1
00bdac0c	b.lt 0x00bdac24
00bdac10	sub x0,x29,#0x40
00bdac14	mov x1,x25
00bdac18	mov w2,wzr
00bdac1c	bl 0x00c30250
00bdac20	b 0x00bdac48
00bdac24	lsl x9,x25,#0x1
00bdac28	tbnz w8,#0x0,0x00bdac3c
00bdac2c	lsl w8,w9,#0x1
00bdac30	sturb w8,[x29, #-0x40]
00bdac34	mov x8,x27
00bdac38	b 0x00bdac44
00bdac3c	ldr x8,[x26, #0x18]
00bdac40	str x9,[x26, #0x10]
00bdac44	strb wzr,[x8, x9]
00bdac48	ldp x9,x10,[x26, #0x8]
00bdac4c	ldurb w8,[x29, #-0x40]
00bdac50	tst w8,#0x1
00bdac54	and x11,x9,#-0x2
00bdac58	ubfx x12,x9,#0x1,#0x7
00bdac5c	sub x11,x11,#0x1
00bdac60	csel x8,x20,x11,eq
00bdac64	tst x9,#0x1
00bdac68	csel x10,x12,x10,eq
00bdac6c	subs x1,x8,x10
00bdac70	b.ls 0x00bdac84
00bdac74	sub x0,x29,#0x40
00bdac78	mov w2,wzr
00bdac7c	bl 0x00c30250
00bdac80	b 0x00bdaca4
00bdac84	tbnz w9,#0x0,0x00bdac98
00bdac88	lsl w9,w8,#0x1
00bdac8c	sturb w9,[x29, #-0x40]
00bdac90	mov x9,x27
00bdac94	b 0x00bdaca0
00bdac98	ldr x9,[x26, #0x18]
00bdac9c	str x8,[x26, #0x10]
00bdaca0	strb wzr,[x9, x8]
00bdaca4	ldurb w8,[x29, #-0x40]
00bdaca8	ldr x9,[x26, #0x18]
00bdacac	tst w8,#0x1
00bdacb0	csel x24,x27,x9,eq
00bdacb4	add x8,x24,x25
00bdacb8	str x8,[x26]
00bdacbc	ldp x8,x9,[x19, #0x18]
00bdacc0	cmp x8,x9
00bdacc4	b.eq 0x00bdacd0
00bdacc8	ldrb w0,[x8]
00bdaccc	b 0x00bdace0
00bdacd0	ldr x8,[x19]
00bdacd4	ldr x8,[x8, #0x48]
00bdacd8	mov x0,x19
00bdacdc	blr x8
00bdace0	ldurb w5,[x29, #-0xc]
00bdace4	sub x3,x29,#0x48
00bdace8	add x4,sp,#0x2c
00bdacec	sub x6,x29,#0x28
00bdacf0	add x7,sp,#0x38
00bdacf4	mov w1,w23
00bdacf8	mov x2,x24
00bdacfc	stp x22,x28,[sp]
00bdad00	bl 0x00c440f0
00bdad04	cbnz w0,0x00bdad28
00bdad08	ldp x8,x9,[x19, #0x18]
00bdad0c	cmp x8,x9
00bdad10	b.ne 0x00bdab58
00bdad14	ldr x8,[x19]
00bdad18	ldr x8,[x8, #0x50]
00bdad1c	mov x0,x19
00bdad20	blr x8
00bdad24	b 0x00bdab60
00bdad28	ldurb w8,[x29, #-0x28]
00bdad2c	ldr x9,[x26, #0x28]
00bdad30	ldr x22,[sp, #0x20]
00bdad34	lsr x10,x8,#0x1
00bdad38	tst w8,#0x1
00bdad3c	csel x8,x10,x9,eq
00bdad40	cbz x8,0x00bdad64
00bdad44	ldr x8,[sp, #0x30]
00bdad48	add x9,sp,#0x38
00bdad4c	sub x9,x8,x9
00bdad50	cmp x9,#0x9f
00bdad54	b.gt 0x00bdad64
00bdad58	ldr w9,[sp, #0x2c]
00bdad5c	str w9,[x8], #0x4
00bdad60	str x8,[sp, #0x30]
00bdad64	ldr x1,[x26]
00bdad68	mov x0,x24
00bdad6c	mov x2,x22
00bdad70	mov w3,w23
00bdad74	bl 0x00c0bfac
00bdad78	ldurb w10,[x29, #-0x28]
00bdad7c	ldr x12,[sp, #0x30]
00bdad80	add x11,sp,#0x38
00bdad84	ldr x8,[x26, #0x28]
00bdad88	lsr x9,x10,#0x1
00bdad8c	ands w13,w10,#0x1
00bdad90	sub x11,x12,x11
00bdad94	csel x8,x9,x8,eq
00bdad98	ldr x9,[sp, #0x18]
00bdad9c	cmp x11,#0x5
00bdada0	str x0,[x9]
00bdada4	b.lt 0x00bdaf04
00bdada8	cbz x8,0x00bdaf04
00bdadac	sub x8,x12,#0x4
00bdadb0	add x9,sp,#0x38
00bdadb4	cmp x9,x8
00bdadb8	cset w11,cc
00bdadbc	cmp x9,x12
00bdadc0	b.eq 0x00bdae70
00bdadc4	cbz w11,0x00bdae70
00bdadc8	add x10,sp,#0x38
00bdadcc	sub x14,x12,#0x8
00bdadd0	add x11,x10,#0x4
00bdadd4	cmp x14,x11
00bdadd8	csel x13,x14,x11,hi
00bdaddc	sub x13,x13,#0x4
00bdade0	cmp x13,x10
00bdade4	cinc x15,x10,ne
00bdade8	cmp x13,x10
00bdadec	sub x15,x13,x15
00bdadf0	lsr x15,x15,#0x3
00bdadf4	cinc x13,x15,ne
00bdadf8	cmp x13,#0x13
00bdadfc	b.cc 0x00bdae44
00bdae00	cmp x14,x11
00bdae04	csel x14,x14,x11,hi
00bdae08	sub x14,x14,#0x4
00bdae0c	cmp x14,x10
00bdae10	cinc x15,x10,ne
00bdae14	cmp x14,x10
00bdae18	sub x15,x14,x15
00bdae1c	lsr x15,x15,#0x3
00bdae20	cinc x14,x15,ne
00bdae24	cmp x10,x12
00bdae28	b.cs 0x00bdafe8
00bdae2c	lsl x14,x14,#0x2
00bdae30	sub x15,x12,x14
00bdae34	add x11,x11,x14
00bdae38	sub x14,x15,#0x4
00bdae3c	cmp x14,x11
00bdae40	b.cs 0x00bdafe8
00bdae44	mov x11,x8
00bdae48	add x10,x10,#0x4
00bdae4c	ldr w12,[x11]
00bdae50	ldur w13,[x10, #-0x4]
00bdae54	stur w12,[x10, #-0x4]
00bdae58	str w13,[x11], #-0x4
00bdae5c	cmp x10,x11
00bdae60	add x10,x10,#0x4
00bdae64	b.cc 0x00bdae4c
00bdae68	ldurb w10,[x29, #-0x28]
00bdae6c	and w13,w10,#0x1
00bdae70	ldr x11,[x26, #0x30]
00bdae74	cmp w13,#0x0
00bdae78	sub x12,x29,#0x28
00bdae7c	csinc x11,x11,x12,ne
00bdae80	cmp x9,x8
00bdae84	b.cs 0x00bdaedc
00bdae88	lsr w9,w10,#0x1
00bdae8c	ldr x10,[x26, #0x28]
00bdae90	cmp w13,#0x0
00bdae94	csel x9,x9,x10,eq
00bdae98	add x10,sp,#0x38
00bdae9c	add x9,x11,x9
00bdaea0	b 0x00bdaebc
00bdaea4	sub x12,x9,x11
00bdaea8	add x10,x10,#0x4
00bdaeac	cmp x12,#0x1
00bdaeb0	cinc x11,x11,gt
00bdaeb4	cmp x10,x8
00bdaeb8	b.cs 0x00bdaedc
00bdaebc	ldrb w12,[x11]
00bdaec0	cbz w12,0x00bdaea4
00bdaec4	cmp w12,#0xff
00bdaec8	b.eq 0x00bdaea4
00bdaecc	ldr w13,[x10]
00bdaed0	cmp w13,w12
00bdaed4	b.eq 0x00bdaea4
00bdaed8	b 0x00bdaefc
00bdaedc	ldrb w9,[x11]
00bdaee0	cbz w9,0x00bdaf04
00bdaee4	cmp w9,#0xff
00bdaee8	b.eq 0x00bdaf04
00bdaeec	ldr w8,[x8]
00bdaef0	sub w8,w8,#0x1
00bdaef4	cmp w8,w9
00bdaef8	b.cc 0x00bdaf04
00bdaefc	mov w8,#0x4
00bdaf00	str w8,[x22]
00bdaf04	cbz x19,0x00bdaf90
00bdaf08	ldp x8,x9,[x19, #0x18]
00bdaf0c	cmp x8,x9
00bdaf10	b.eq 0x00bdafa0
00bdaf14	mov w20,wzr
00bdaf18	cbz x21,0x00bdaf98
00bdaf1c	ldp x8,x9,[x21, #0x18]
00bdaf20	cmp x8,x9
00bdaf24	b.eq 0x00bdafc4
00bdaf28	tbnz w20,#0x0,0x00bdaf38
00bdaf2c	ldr w8,[x22]
00bdaf30	orr w8,w8,#0x2
00bdaf34	str w8,[x22]
00bdaf38	ldurb w8,[x29, #-0x40]
00bdaf3c	tbz w8,#0x0,0x00bdaf50
00bdaf40	ldr x8,[x26, #0x8]
00bdaf44	ldr x0,[x26, #0x18]
00bdaf48	and x1,x8,#-0x2
00bdaf4c	bl 0x00c2fe80
00bdaf50	ldurb w8,[x29, #-0x28]
00bdaf54	tbz w8,#0x0,0x00bdaf68
00bdaf58	ldr x8,[x26, #0x20]
00bdaf5c	ldr x0,[x26, #0x30]
00bdaf60	and x1,x8,#-0x2
00bdaf64	bl 0x00c2fe80
00bdaf68	mov x0,x19
00bdaf6c	ldp x20,x19,[sp, #0x170]
00bdaf70	ldp x22,x21,[sp, #0x160]
00bdaf74	ldp x24,x23,[sp, #0x150]
00bdaf78	ldp x26,x25,[sp, #0x140]
00bdaf7c	ldp x28,x27,[sp, #0x130]
00bdaf80	ldp x29,x30,[sp, #0x120]
00bdaf84	add sp,sp,#0x180
00bdaf88	autiasp
00bdaf8c	ret
00bdaf90	mov w20,#0x1
00bdaf94	cbnz x21,0x00bdaf1c
00bdaf98	tbnz w20,#0x0,0x00bdaf2c
00bdaf9c	b 0x00bdaf38
00bdafa0	ldr x8,[x19]
00bdafa4	ldr x8,[x8, #0x48]
00bdafa8	mov x0,x19
00bdafac	blr x8
00bdafb0	cmn w0,#0x1
00bdafb4	cset w20,eq
00bdafb8	csel x19,xzr,x19,eq
00bdafbc	cbnz x21,0x00bdaf1c
00bdafc0	b 0x00bdaf98
00bdafc4	ldr x8,[x21]
00bdafc8	ldr x8,[x8, #0x48]
00bdafcc	mov x0,x21
00bdafd0	blr x8
00bdafd4	cmn w0,#0x1
00bdafd8	cset w8,eq
00bdafdc	eor w8,w20,w8
00bdafe0	tbz w8,#0x0,0x00bdaf2c
00bdafe4	b 0x00bdaf38
00bdafe8	add x13,x13,#0x1
00bdafec	add x15,sp,#0x38
00bdaff0	sub x12,x12,#0x10
00bdaff4	and x14,x13,#0x7ffffffffffffff8
00bdaff8	lsl x10,x14,#0x2
00bdaffc	mov x16,x14
00bdb000	sub x11,x8,x10
00bdb004	add x10,x15,x10
00bdb008	add x15,x15,#0x10
00bdb00c	ldp q1,q0,[x12, #-0x10]
00bdb010	sub x16,x16,#0x8
00bdb014	ldp q2,q3,[x15, #-0x10]
00bdb018	rev64 v0.4S,v0.4S
00bdb01c	rev64 v1.4S,v1.4S
00bdb020	rev64 v2.4S,v2.4S
00bdb024	rev64 v3.4S,v3.4S
00bdb028	ext v0.16B,v0.16B,v0.16B,0x8
00bdb02c	ext v1.16B,v1.16B,v1.16B,0x8
00bdb030	ext v2.16B,v2.16B,v2.16B,0x8
00bdb034	ext v3.16B,v3.16B,v3.16B,0x8
00bdb038	stp q0,q1,[x15, #-0x10]
00bdb03c	add x15,x15,#0x20
00bdb040	stp q3,q2,[x12, #-0x10]
00bdb044	sub x12,x12,#0x20
00bdb048	cbnz x16,0x00bdb00c
00bdb04c	cmp x13,x14
00bdb050	b.eq 0x00bdae68
00bdb054	b 0x00bdae48

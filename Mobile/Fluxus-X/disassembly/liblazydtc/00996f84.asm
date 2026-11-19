; ix::WebSocketInitResult::operator= @ 00996f84
00996f84	stp x22,x21,[sp, #-0x30]!
00996f88	stp x20,x19,[sp, #0x10]
00996f8c	stp x29,x30,[sp, #0x20]
00996f90	add x29,sp,#0x20
00996f94	mov x21,x1
00996f98	ldr x8,[x21], #0x8
00996f9c	mov x22,x0
00996fa0	mov x20,x1
00996fa4	mov x19,x0
00996fa8	str x8,[x22], #0x8
00996fac	ldrb w8,[x22]
00996fb0	tbnz w8,#0x0,0x00996fbc
00996fb4	strh wzr,[x22]
00996fb8	b 0x00996fdc
00996fbc	ldr x8,[x19, #0x18]
00996fc0	strb wzr,[x8]
00996fc4	ldrb w8,[x19, #0x8]
00996fc8	str xzr,[x19, #0x10]
00996fcc	tbz w8,#0x0,0x00996fdc
00996fd0	ldr x0,[x19, #0x18]
00996fd4	bl 0x00c301d0
00996fd8	str xzr,[x19, #0x8]
00996fdc	ldr x8,[x21, #0x10]
00996fe0	str x8,[x22, #0x10]
00996fe4	ldr q0,[x21]
00996fe8	str q0,[x22]
00996fec	stp xzr,xzr,[x21, #0x8]
00996ff0	str xzr,[x21]
00996ff4	mov x22,x19
00996ff8	ldr x1,[x22, #0x28]!
00996ffc	sub x21,x22,#0x8
00997000	mov x0,x21
00997004	bl 0x00c32fc0
00997008	ldr x8,[x20, #0x20]
0099700c	stur x8,[x22, #-0x8]
00997010	mov x8,x20
00997014	ldr x9,[x8, #0x28]!
00997018	str x9,[x22]
0099701c	ldr x10,[x8, #0x8]
00997020	str x10,[x22, #0x8]
00997024	cbz x10,0x00997038
00997028	str x22,[x9, #0x10]
0099702c	str x8,[x20, #0x20]
00997030	stp xzr,xzr,[x8]
00997034	b 0x0099703c
00997038	str x22,[x21]
0099703c	mov x22,x19
00997040	ldrb w8,[x22, #0x38]!
00997044	add x21,x20,#0x38
00997048	tbnz w8,#0x0,0x00997054
0099704c	strh wzr,[x22]
00997050	b 0x00997074
00997054	ldr x8,[x19, #0x48]
00997058	strb wzr,[x8]
0099705c	ldrb w8,[x19, #0x38]
00997060	str xzr,[x19, #0x40]
00997064	tbz w8,#0x0,0x00997074
00997068	ldr x0,[x19, #0x48]
0099706c	bl 0x00c301d0
00997070	str xzr,[x19, #0x38]
00997074	ldr x8,[x21, #0x10]
00997078	add x20,x20,#0x50
0099707c	str x8,[x22, #0x10]
00997080	ldr q0,[x21]
00997084	str q0,[x22]
00997088	stp xzr,xzr,[x21, #0x8]
0099708c	str xzr,[x21]
00997090	mov x21,x19
00997094	ldrb w8,[x21, #0x50]!
00997098	tbnz w8,#0x0,0x009970a4
0099709c	strh wzr,[x21]
009970a0	b 0x009970c4
009970a4	ldr x8,[x19, #0x60]
009970a8	strb wzr,[x8]
009970ac	ldrb w8,[x19, #0x50]
009970b0	str xzr,[x19, #0x58]
009970b4	tbz w8,#0x0,0x009970c4
009970b8	ldr x0,[x19, #0x60]
009970bc	bl 0x00c301d0
009970c0	str xzr,[x19, #0x50]
009970c4	ldr x8,[x20, #0x10]
009970c8	mov x0,x19
009970cc	str x8,[x21, #0x10]
009970d0	ldr q0,[x20]
009970d4	str q0,[x21]
009970d8	stp xzr,xzr,[x20]
009970dc	str xzr,[x20, #0x10]
009970e0	ldp x29,x30,[sp, #0x20]
009970e4	ldp x20,x19,[sp, #0x10]
009970e8	ldp x22,x21,[sp], #0x30
009970ec	ret

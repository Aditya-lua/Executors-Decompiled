; ZSTD_findDecompressedSize @ 00bb0214
00bb0214	sub sp,sp,#0x80
00bb0218	stp x29,x30,[sp, #0x40]
00bb021c	stp x24,x23,[sp, #0x50]
00bb0220	stp x22,x21,[sp, #0x60]
00bb0224	stp x20,x19,[sp, #0x70]
00bb0228	add x29,sp,#0x40
00bb022c	mrs x21,tpidr_el0
00bb0230	mov x19,x1
00bb0234	ldr x8,[x21, #0x28]
00bb0238	cmp x1,#0x5
00bb023c	stur x8,[x29, #-0x8]
00bb0240	b.cs 0x00bb0258
00bb0244	mov x22,xzr
00bb0248	cmp x19,#0x0
00bb024c	mov x8,#-0x2
00bb0250	csel x0,x22,x8,eq
00bb0254	b 0x00bb0314
00bb0258	mov w23,#0xd2a5
00bb025c	mov x20,x0
00bb0260	mov x22,xzr
00bb0264	movk w23,#0x184, LSL #16
00bb0268	mov x24,#-0x2
00bb026c	b 0x00bb0280
00bb0270	sub x19,x19,x8
00bb0274	add x20,x20,x8
00bb0278	cmp x19,#0x4
00bb027c	b.ls 0x00bb0248
00bb0280	ldr w8,[x20]
00bb0284	cmp w23,w8, LSR #0x4
00bb0288	b.ne 0x00bb02b4
00bb028c	cmp x19,#0x8
00bb0290	b.cc 0x00bb0310
00bb0294	ldr w8,[x20, #0x4]
00bb0298	mov x0,#-0x2
00bb029c	cmn w8,#0x9
00bb02a0	b.hi 0x00bb0314
00bb02a4	add x8,x8,#0x8
00bb02a8	cmp x8,x19
00bb02ac	b.ls 0x00bb0270
00bb02b0	b 0x00bb0314
00bb02b4	add x0,sp,#0x8
00bb02b8	mov x1,x20
00bb02bc	mov x2,x19
00bb02c0	mov w3,wzr
00bb02c4	bl 0x00c435f0
00bb02c8	ldr w8,[sp, #0x1c]
00bb02cc	ldr x9,[sp, #0x8]
00bb02d0	cmp w8,#0x1
00bb02d4	csel x8,xzr,x9,eq
00bb02d8	cmp x0,#0x0
00bb02dc	csel x0,x8,x24,eq
00bb02e0	cmn x0,#0x3
00bb02e4	b.hi 0x00bb0314
00bb02e8	adds x22,x0,x22
00bb02ec	b.cs 0x00bb0310
00bb02f0	add x8,sp,#0x8
00bb02f4	mov x0,x20
00bb02f8	mov x1,x19
00bb02fc	mov w2,wzr
00bb0300	bl 0x00bb04a4
00bb0304	ldr x8,[sp, #0x10]
00bb0308	cmn x8,#0x78
00bb030c	b.ls 0x00bb0270
00bb0310	mov x0,#-0x2
00bb0314	ldr x8,[x21, #0x28]
00bb0318	ldur x9,[x29, #-0x8]
00bb031c	cmp x8,x9
00bb0320	b.ne 0x00bb033c
00bb0324	ldp x20,x19,[sp, #0x70]
00bb0328	ldp x22,x21,[sp, #0x60]
00bb032c	ldp x24,x23,[sp, #0x50]
00bb0330	ldp x29,x30,[sp, #0x40]
00bb0334	add sp,sp,#0x80
00bb0338	ret
00bb033c	bl 0x00c2fec0

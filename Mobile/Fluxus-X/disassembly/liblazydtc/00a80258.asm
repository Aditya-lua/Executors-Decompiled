; OPENSSL_LH_retrieve @ 00a80258
00a80258	str x23,[sp, #-0x40]!
00a8025c	stp x22,x21,[sp, #0x10]
00a80260	stp x20,x19,[sp, #0x20]
00a80264	stp x29,x30,[sp, #0x30]
00a80268	ldr w8,[x0, #0x40]
00a8026c	mov x21,x0
00a80270	mov x19,x1
00a80274	add x29,sp,#0x30
00a80278	cbz w8,0x00a80280
00a8027c	str wzr,[x21, #0x40]
00a80280	ldr x8,[x21, #0x10]
00a80284	mov x0,x19
00a80288	blr x8
00a8028c	ldp w9,w8,[x21, #0x20]
00a80290	mov x20,x0
00a80294	udiv x10,x0,x8
00a80298	msub x8,x10,x8,x0
00a8029c	cmp x8,x9
00a802a0	b.cs 0x00a802b0
00a802a4	ldr w8,[x21, #0x1c]
00a802a8	udiv x9,x20,x8
00a802ac	msub x8,x9,x8,x20
00a802b0	ldr x9,[x21]
00a802b4	lsl x8,x8,#0x20
00a802b8	add x22,x9,x8, ASR #0x1d
00a802bc	ldr x23,[x22]
00a802c0	cbz x23,0x00a802f4
00a802c4	ldr x21,[x21, #0x8]
00a802c8	ldr x8,[x23, #0x10]
00a802cc	cmp x8,x20
00a802d0	b.ne 0x00a802e4
00a802d4	ldr x0,[x23]
00a802d8	mov x1,x19
00a802dc	blr x21
00a802e0	cbz w0,0x00a8030c
00a802e4	ldr x8,[x23, #0x8]!
00a802e8	mov x22,x23
00a802ec	mov x23,x8
00a802f0	cbnz x8,0x00a802c8
00a802f4	mov x0,xzr
00a802f8	ldp x29,x30,[sp, #0x30]
00a802fc	ldp x20,x19,[sp, #0x20]
00a80300	ldp x22,x21,[sp, #0x10]
00a80304	ldr x23,[sp], #0x40
00a80308	ret
00a8030c	ldr x8,[x22]
00a80310	cbz x8,0x00a802f4
00a80314	ldr x0,[x8]
00a80318	b 0x00a802f8

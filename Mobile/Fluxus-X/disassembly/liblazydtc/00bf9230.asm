; FUN_00bf9230 @ 00bf9230
00bf9230	paciasp
00bf9234	sub sp,sp,#0x50
00bf9238	stp x29,x30,[sp, #0x20]
00bf923c	stp x22,x21,[sp, #0x30]
00bf9240	stp x20,x19,[sp, #0x40]
00bf9244	add x29,sp,#0x20
00bf9248	adrp x20,0xcb5000
00bf924c	mov x19,x1
00bf9250	mov x21,x0
00bf9254	ldr x20,[x20, #0xc38]
00bf9258	str x20,[sp, #0x8]
00bf925c	ldar x8,[x20]
00bf9260	cmn x8,#0x1
00bf9264	b.eq 0x00bf9290
00bf9268	add x8,sp,#0x8
00bf926c	sub x9,x29,#0x8
00bf9270	adrp x0,0xcb5000
00bf9274	stur x8,[x29, #-0x8]
00bf9278	nop
00bf927c	adr x2,0xc0bab0
00bf9280	str x9,[sp, #0x10]
00bf9284	add x1,sp,#0x10
00bf9288	ldr x0,[x0, #0xc38]
00bf928c	bl 0x00c305d0
00bf9290	ldp x8,x10,[x19, #0x10]
00bf9294	ldrsw x9,[x20, #0x8]
00bf9298	sub x22,x9,#0x1
00bf929c	sub x9,x10,x8
00bf92a0	cmp x22,x9, ASR #0x3
00bf92a4	b.cs 0x00bf9344
00bf92a8	ldr x19,[x8, x22, LSL #0x3]
00bf92ac	cbz x19,0x00bf9344
00bf92b0	add x1,x19,#0x8
00bf92b4	mov w0,#0x1
00bf92b8	bl 0x00c2bce0
00bf92bc	mov x20,x21
00bf92c0	ldp x8,x9,[x20, #0x10]!
00bf92c4	sub x9,x9,x8
00bf92c8	asr x10,x9,#0x3
00bf92cc	cmp x10,x22
00bf92d0	b.hi 0x00bf92fc
00bf92d4	add x9,x22,#0x1
00bf92d8	subs x1,x9,x10
00bf92dc	b.ls 0x00bf92f0
00bf92e0	mov x0,x20
00bf92e4	bl 0x00c0b6e4
00bf92e8	ldr x8,[x20]
00bf92ec	b 0x00bf92fc
00bf92f0	b.cs 0x00bf92fc
00bf92f4	add x9,x8,x9, LSL #0x3
00bf92f8	str x9,[x21, #0x18]
00bf92fc	ldr x21,[x8, x22, LSL #0x3]
00bf9300	cbz x21,0x00bf9324
00bf9304	add x1,x21,#0x8
00bf9308	mov x0,#-0x1
00bf930c	bl 0x00c2bd10
00bf9310	cbnz x0,0x00bf9324
00bf9314	ldr x8,[x21]
00bf9318	mov x0,x21
00bf931c	ldr x8,[x8, #0x10]
00bf9320	blr x8
00bf9324	ldr x8,[x20]
00bf9328	str x19,[x8, x22, LSL #0x3]
00bf932c	ldp x20,x19,[sp, #0x40]
00bf9330	ldp x22,x21,[sp, #0x30]
00bf9334	ldp x29,x30,[sp, #0x20]
00bf9338	add sp,sp,#0x50
00bf933c	autiasp
00bf9340	ret
00bf9344	bl 0x00bd8968

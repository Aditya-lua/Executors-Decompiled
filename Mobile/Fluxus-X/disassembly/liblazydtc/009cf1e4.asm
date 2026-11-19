; tls1_mac @ 009cf1e4
009cf1e4	sub sp,sp,#0xf0
009cf1e8	cmp w3,#0x0
009cf1ec	mov w8,#0x4
009cf1f0	mov w9,#0x8
009cf1f4	mov w11,#0x860
009cf1f8	mov w12,#0x890
009cf1fc	str x27,[sp, #0x90]
009cf200	stp x26,x25,[sp, #0xa0]
009cf204	stp x24,x23,[sp, #0xb0]
009cf208	stp x22,x21,[sp, #0xc0]
009cf20c	stp x20,x19,[sp, #0xd0]
009cf210	stp x29,x30,[sp, #0xe0]
009cf214	csel w27,w9,w8,ne
009cf218	csel x9,x12,x11,ne
009cf21c	ldr x24,[x0, x9#0x0]
009cf220	ldr w26,[x0, #0x540]
009cf224	mov w10,#0x1d00
009cf228	mov w9,#0x1cf8
009cf22c	mov x21,x0
009cf230	add x8,x0,x10
009cf234	add x9,x0,x9
009cf238	mov x0,x24
009cf23c	add x29,sp,#0xe0
009cf240	mov w25,w3
009cf244	mov x22,x2
009cf248	mov x23,x1
009cf24c	csel x20,x8,x9,ne
009cf250	bl 0x00c34c00
009cf254	bl 0x00c34c20
009cf258	tbnz w0,#0x1f,0x009cf2cc
009cf25c	cmp w25,#0x0
009cf260	mov w8,#0x1
009cf264	cinc w8,w8,ne
009cf268	tst w26,w8
009cf26c	sxtw x8,w0
009cf270	stur x8,[x29, #-0x48]
009cf274	b.eq 0x009cf2d4
009cf278	mov x19,xzr
009cf27c	ldr x8,[x21, #0x8]
009cf280	and w9,w26,w27
009cf284	ldr x8,[x8, #0xc0]
009cf288	ldr w8,[x8, #0x60]
009cf28c	cbz w9,0x009cf2bc
009cf290	tbnz w8,#0x3,0x009cf2bc
009cf294	mov w1,#0x4
009cf298	mov x0,x24
009cf29c	mov w2,wzr
009cf2a0	mov x3,x20
009cf2a4	bl 0x00c36db0
009cf2a8	cmp w0,#0x1
009cf2ac	b.lt 0x009cf4ec
009cf2b0	ldr x8,[x21, #0x8]
009cf2b4	ldr x8,[x8, #0xc0]
009cf2b8	ldr w8,[x8, #0x60]
009cf2bc	tbnz w8,#0x3,0x009cf2f8
009cf2c0	ldr x8,[x20]
009cf2c4	stur x8,[x29, #-0x60]
009cf2c8	b 0x009cf324
009cf2cc	mov w20,wzr
009cf2d0	b 0x009cf4f8
009cf2d4	bl 0x00c31fa0
009cf2d8	mov x19,x0
009cf2dc	cbz x0,0x009cf4ec
009cf2e0	mov x0,x19
009cf2e4	mov x1,x24
009cf2e8	bl 0x00c36da0
009cf2ec	cbz w0,0x009cf4ec
009cf2f0	mov x24,x19
009cf2f4	b 0x009cf27c
009cf2f8	ldr x8,[x21, #0x1d10]
009cf2fc	cmp w25,#0x0
009cf300	cset w9,ne
009cf304	ldrh w8,[x8, w9, UXTW #0x1]
009cf308	lsr w9,w8,#0x8
009cf30c	sturb w9,[x29, #-0x60]
009cf310	sturb w8,[x29, #-0x5f]
009cf314	ldrh w8,[x20, #0x6]
009cf318	sturh w8,[x29, #-0x5a]
009cf31c	ldur w8,[x20, #0x2]
009cf320	stur w8,[x29, #-0x5e]
009cf324	ldr w8,[x23, #0x4]
009cf328	sturb w8,[x29, #-0x58]
009cf32c	ldr w8,[x21]
009cf330	lsr w9,w8,#0x8
009cf334	sturb w9,[x29, #-0x57]
009cf338	sturb w8,[x29, #-0x56]
009cf33c	ldr x8,[x23, #0x8]
009cf340	lsr x9,x8,#0x8
009cf344	sturb w9,[x29, #-0x55]
009cf348	sturb w8,[x29, #-0x54]
009cf34c	cbnz w25,0x009cf3f4
009cf350	ldrb w8,[x21, #0xa9]
009cf354	tbnz w8,#0x0,0x009cf3f4
009cf358	ldr x0,[x21, #0x848]
009cf35c	bl 0x00c34b80
009cf360	bl 0x00c35290
009cf364	cmp w0,#0x2
009cf368	b.ne 0x009cf3f4
009cf36c	mov x0,x24
009cf370	bl 0x00c34c00
009cf374	bl 0x00c34c30
009cf378	sub w8,w0,#0x2a0
009cf37c	cmp w8,#0x4
009cf380	b.cs 0x009cf3e4
009cf384	adrp x0,0x2d5000
009cf388	add x1,x23,#0x10
009cf38c	add x0,x0,#0x970
009cf390	add x8,sp,#0x8
009cf394	bl 0x00c36270
009cf398	ldr x8,[sp, #0x28]
009cf39c	ldur q0,[sp, #0x18]
009cf3a0	ldur q1,[sp, #0x8]
009cf3a4	str x8,[sp, #0x50]
009cf3a8	add x8,sp,#0x8
009cf3ac	stp q1,q0,[sp, #0x30]
009cf3b0	bl 0x00c34c40
009cf3b4	ldr x8,[sp, #0x28]
009cf3b8	ldur q0,[sp, #0x18]
009cf3bc	ldur q1,[sp, #0x8]
009cf3c0	mov x0,x24
009cf3c4	str x8,[sp, #0x78]
009cf3c8	stur q0,[sp, #0x68]
009cf3cc	stur q1,[sp, #0x58]
009cf3d0	bl 0x00c36dc0
009cf3d4	add x1,sp,#0x30
009cf3d8	bl 0x00c36dd0
009cf3dc	cbnz w0,0x009cf3f4
009cf3e0	b 0x009cf4ec
009cf3e4	cmp w0,#0x40
009cf3e8	b.eq 0x009cf384
009cf3ec	cmp w0,#0x4
009cf3f0	b.eq 0x009cf384
009cf3f4	sub x1,x29,#0x60
009cf3f8	mov w2,#0xd
009cf3fc	mov x0,x24
009cf400	bl 0x00c36d90
009cf404	cmp w0,#0x1
009cf408	b.lt 0x009cf4ec
009cf40c	ldr x1,[x23, #0x28]
009cf410	ldr x2,[x23, #0x8]
009cf414	mov x0,x24
009cf418	bl 0x00c36d90
009cf41c	cmp w0,#0x1
009cf420	b.lt 0x009cf4ec
009cf424	sub x2,x29,#0x48
009cf428	mov x0,x24
009cf42c	mov x1,x22
009cf430	bl 0x00c36d80
009cf434	cmp w0,#0x1
009cf438	b.lt 0x009cf4ec
009cf43c	ldr x8,[x21, #0x8]
009cf440	ldr x8,[x8, #0xc0]
009cf444	ldrb w8,[x8, #0x60]
009cf448	tbnz w8,#0x3,0x009cf4e4
009cf44c	ldrb w8,[x20, #0x7]
009cf450	add w8,w8,#0x1
009cf454	tst w8,#0xff
009cf458	strb w8,[x20, #0x7]
009cf45c	b.ne 0x009cf4e4
009cf460	ldrb w8,[x20, #0x6]
009cf464	add w8,w8,#0x1
009cf468	tst w8,#0xff
009cf46c	strb w8,[x20, #0x6]
009cf470	b.ne 0x009cf4e4
009cf474	ldrb w8,[x20, #0x5]
009cf478	add w8,w8,#0x1
009cf47c	tst w8,#0xff
009cf480	strb w8,[x20, #0x5]
009cf484	b.ne 0x009cf4e4
009cf488	ldrb w8,[x20, #0x4]
009cf48c	add w8,w8,#0x1
009cf490	tst w8,#0xff
009cf494	strb w8,[x20, #0x4]
009cf498	b.ne 0x009cf4e4
009cf49c	ldrb w8,[x20, #0x3]
009cf4a0	add w8,w8,#0x1
009cf4a4	tst w8,#0xff
009cf4a8	strb w8,[x20, #0x3]
009cf4ac	b.ne 0x009cf4e4
009cf4b0	ldrb w8,[x20, #0x2]
009cf4b4	add w8,w8,#0x1
009cf4b8	tst w8,#0xff
009cf4bc	strb w8,[x20, #0x2]
009cf4c0	b.ne 0x009cf4e4
009cf4c4	ldrb w8,[x20, #0x1]
009cf4c8	add w8,w8,#0x1
009cf4cc	tst w8,#0xff
009cf4d0	strb w8,[x20, #0x1]
009cf4d4	b.ne 0x009cf4e4
009cf4d8	ldrb w8,[x20]
009cf4dc	add w8,w8,#0x1
009cf4e0	strb w8,[x20]
009cf4e4	mov w20,#0x1
009cf4e8	b 0x009cf4f0
009cf4ec	mov w20,wzr
009cf4f0	mov x0,x19
009cf4f4	bl 0x00c31f90
009cf4f8	mov w0,w20
009cf4fc	ldp x29,x30,[sp, #0xe0]
009cf500	ldp x20,x19,[sp, #0xd0]
009cf504	ldp x22,x21,[sp, #0xc0]
009cf508	ldp x24,x23,[sp, #0xb0]
009cf50c	ldp x26,x25,[sp, #0xa0]
009cf510	ldr x27,[sp, #0x90]
009cf514	add sp,sp,#0xf0
009cf518	ret

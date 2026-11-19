; PKCS12_setup_mac @ 00abc194
00abc194	str x23,[sp, #-0x40]!
00abc198	stp x22,x21,[sp, #0x10]
00abc19c	stp x20,x19,[sp, #0x20]
00abc1a0	stp x29,x30,[sp, #0x30]
00abc1a4	mov x20,x0
00abc1a8	ldr x0,[x0, #0x8]
00abc1ac	add x29,sp,#0x30
00abc1b0	mov x19,x4
00abc1b4	mov w22,w3
00abc1b8	mov x21,x2
00abc1bc	mov w23,w1
00abc1c0	bl 0x00c3f3f0
00abc1c4	str xzr,[x20, #0x8]
00abc1c8	bl 0x00c3f400
00abc1cc	str x0,[x20, #0x8]
00abc1d0	cbz x0,0x00abc338
00abc1d4	cmp w23,#0x2
00abc1d8	b.lt 0x00abc1f8
00abc1dc	bl 0x00c37f30
00abc1e0	ldr x8,[x20, #0x8]
00abc1e4	str x0,[x8, #0x10]
00abc1e8	cbz x0,0x00abc26c
00abc1ec	sxtw x1,w23
00abc1f0	bl 0x00c375b0
00abc1f4	cbz w0,0x00abc2e8
00abc1f8	cbz w22,0x00abc204
00abc1fc	tbz w22,#0x1f,0x00abc208
00abc200	b 0x00abc334
00abc204	mov w22,#0x8
00abc208	sxtw x23,w22
00abc20c	adrp x1,0x2ca000
00abc210	add x1,x1,#0x250
00abc214	mov w2,#0x10a
00abc218	mov x0,x23
00abc21c	bl 0x00c32320
00abc220	ldr x8,[x20, #0x8]
00abc224	ldr x8,[x8, #0x8]
00abc228	str x0,[x8, #0x8]
00abc22c	cbz x0,0x00abc250
00abc230	mov x1,x0
00abc234	str w22,[x8]
00abc238	cbz x21,0x00abc288
00abc23c	mov x0,x1
00abc240	mov x1,x21
00abc244	mov x2,x23
00abc248	bl 0x00c2ffd0
00abc24c	b 0x00abc2a4
00abc250	bl 0x00c342a0
00abc254	adrp x0,0x2ca000
00abc258	adrp x2,0x2b6000
00abc25c	add x0,x0,#0x250
00abc260	add x2,x2,#0x30e
00abc264	mov w1,#0x10b
00abc268	b 0x00abc31c
00abc26c	bl 0x00c342a0
00abc270	adrp x0,0x2ca000
00abc274	adrp x2,0x2b6000
00abc278	add x0,x0,#0x250
00abc27c	add x2,x2,#0x30e
00abc280	orr w1,wzr,#0xfe
00abc284	b 0x00abc31c
00abc288	ldr x8,[x20, #0x10]
00abc28c	mov x2,x23
00abc290	mov w3,wzr
00abc294	ldr x0,[x8, #0x28]
00abc298	bl 0x00c347b0
00abc29c	cmp w0,#0x1
00abc2a0	b.lt 0x00abc334
00abc2a4	ldr x8,[x20, #0x8]
00abc2a8	add x1,sp,#0x8
00abc2ac	mov x2,xzr
00abc2b0	ldr x0,[x8]
00abc2b4	bl 0x00c38310
00abc2b8	ldr x20,[sp, #0x8]
00abc2bc	mov x0,x19
00abc2c0	bl 0x00c34c30
00abc2c4	bl 0x00c37740
00abc2c8	mov x1,x0
00abc2cc	mov w2,#0x5
00abc2d0	mov x0,x20
00abc2d4	mov x3,xzr
00abc2d8	bl 0x00c37ee0
00abc2dc	cbz w0,0x00abc304
00abc2e0	mov w0,#0x1
00abc2e4	b 0x00abc338
00abc2e8	bl 0x00c342a0
00abc2ec	adrp x0,0x2ca000
00abc2f0	adrp x2,0x2b6000
00abc2f4	add x0,x0,#0x250
00abc2f8	add x2,x2,#0x30e
00abc2fc	mov w1,#0x102
00abc300	b 0x00abc31c
00abc304	bl 0x00c342a0
00abc308	adrp x0,0x2ca000
00abc30c	adrp x2,0x2b6000
00abc310	add x0,x0,#0x250
00abc314	add x2,x2,#0x30e
00abc318	mov w1,#0x119
00abc31c	bl 0x00c342b0
00abc320	mov w1,#0x100
00abc324	mov w0,#0x23
00abc328	movk w1,#0xc, LSL #16
00abc32c	mov x2,xzr
00abc330	bl 0x00c342c0
00abc334	mov w0,wzr
00abc338	ldp x29,x30,[sp, #0x30]
00abc33c	ldp x20,x19,[sp, #0x20]
00abc340	ldp x22,x21,[sp, #0x10]
00abc344	ldr x23,[sp], #0x40
00abc348	ret

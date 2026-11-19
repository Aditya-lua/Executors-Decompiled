; FUN_00871a60 @ 00871a60
00871a60	sub sp,sp,#0x70
00871a64	stp x29,x30,[sp, #0x10]
00871a68	str x27,[sp, #0x20]
00871a6c	stp x26,x25,[sp, #0x30]
00871a70	stp x24,x23,[sp, #0x40]
00871a74	stp x22,x21,[sp, #0x50]
00871a78	stp x20,x19,[sp, #0x60]
00871a7c	add x29,sp,#0x10
00871a80	mrs x23,tpidr_el0
00871a84	mov x21,x1
00871a88	mov x20,x0
00871a8c	ldr x8,[x23, #0x28]
00871a90	str x8,[sp, #0x8]
00871a94	ldrb w8,[x1]
00871a98	ldp x10,x9,[x1, #0x8]
00871a9c	lsr x11,x8,#0x1
00871aa0	tst w8,#0x1
00871aa4	csinc x1,x9,x1,ne
00871aa8	csel x2,x11,x10,eq
00871aac	add x0,sp,#0x7
00871ab0	bl 0x0083ba34
00871ab4	ldr x24,[x20, #0x8]
00871ab8	cbz x24,0x00871bac
00871abc	fmov d0,x24
00871ac0	mov x19,x0
00871ac4	cnt v0.8B,v0.8B
00871ac8	addv b0,v0.8B
00871acc	fmov x25,d0
00871ad0	cmp x25,#0x1
00871ad4	b.hi 0x00871ae4
00871ad8	sub x8,x24,#0x1
00871adc	and x26,x8,x19
00871ae0	b 0x00871af8
00871ae4	cmp x19,x24
00871ae8	mov x26,x19
00871aec	b.cc 0x00871af8
00871af0	udiv x8,x19,x24
00871af4	msub x26,x8,x24,x19
00871af8	ldr x8,[x20]
00871afc	ldr x8,[x8, x26, LSL #0x3]
00871b00	cbz x8,0x00871bac
00871b04	ldr x20,[x8]
00871b08	cbz x20,0x00871bb0
00871b0c	ldrb w8,[x21]
00871b10	ldp x10,x11,[x21, #0x8]
00871b14	add x12,x21,#0x1
00871b18	sub x27,x24,#0x1
00871b1c	lsr x9,x8,#0x1
00871b20	tst w8,#0x1
00871b24	csel x22,x12,x11,eq
00871b28	csel x21,x9,x10,eq
00871b2c	b 0x00871b44
00871b30	and x8,x8,x27
00871b34	cmp x8,x26
00871b38	b.ne 0x00871bac
00871b3c	ldr x20,[x20]
00871b40	cbz x20,0x00871bb0
00871b44	ldr x8,[x20, #0x8]
00871b48	cmp x19,x8
00871b4c	b.ne 0x00871b90
00871b50	ldrb w8,[x20, #0x10]
00871b54	ldr x9,[x20, #0x18]
00871b58	lsr x10,x8,#0x1
00871b5c	tst w8,#0x1
00871b60	csel x9,x10,x9,eq
00871b64	cmp x9,x21
00871b68	b.ne 0x00871b3c
00871b6c	ldr x9,[x20, #0x20]
00871b70	add x10,x20,#0x11
00871b74	tst w8,#0x1
00871b78	mov x1,x22
00871b7c	mov x2,x21
00871b80	csel x0,x10,x9,eq
00871b84	bl 0x00c300b0
00871b88	cbnz w0,0x00871b3c
00871b8c	b 0x00871bb0
00871b90	cmp x25,#0x1
00871b94	b.ls 0x00871b30
00871b98	cmp x8,x24
00871b9c	b.cc 0x00871b34
00871ba0	udiv x9,x8,x24
00871ba4	msub x8,x9,x24,x8
00871ba8	b 0x00871b34
00871bac	mov x20,xzr
00871bb0	ldr x8,[x23, #0x28]
00871bb4	ldr x9,[sp, #0x8]
00871bb8	cmp x8,x9
00871bbc	b.ne 0x00871be4
00871bc0	mov x0,x20
00871bc4	ldp x20,x19,[sp, #0x60]
00871bc8	ldr x27,[sp, #0x20]
00871bcc	ldp x22,x21,[sp, #0x50]
00871bd0	ldp x24,x23,[sp, #0x40]
00871bd4	ldp x26,x25,[sp, #0x30]
00871bd8	ldp x29,x30,[sp, #0x10]
00871bdc	add sp,sp,#0x70
00871be0	ret
00871be4	bl 0x00c2fec0

; FUN_00b88a80 @ 00b88a80
00b88a80	sub sp,sp,#0x70
00b88a84	stp x26,x25,[sp, #0x20]
00b88a88	stp x24,x23,[sp, #0x30]
00b88a8c	stp x22,x21,[sp, #0x40]
00b88a90	stp x20,x19,[sp, #0x50]
00b88a94	stp x29,x30,[sp, #0x60]
00b88a98	add x29,sp,#0x60
00b88a9c	mrs x26,tpidr_el0
00b88aa0	ldr x8,[x26, #0x28]
00b88aa4	mov w25,w1
00b88aa8	cmp w7,#0x0
00b88aac	mov w9,#0x400
00b88ab0	str x8,[sp, #0x18]
00b88ab4	mov w8,#0x800
00b88ab8	mov x23,x3
00b88abc	mov x24,x2
00b88ac0	csel w2,w8,w9,eq
00b88ac4	add x1,sp,#0x10
00b88ac8	mov w3,w25
00b88acc	mov x21,x6
00b88ad0	mov x19,x5
00b88ad4	mov x20,x4
00b88ad8	strb wzr,[sp, #0xc]
00b88adc	bl 0x00b86e5c
00b88ae0	mov w22,w0
00b88ae4	cbnz w0,0x00b88b54
00b88ae8	ldr x1,[sp, #0x10]
00b88aec	add x2,sp,#0xc
00b88af0	mov w0,w25
00b88af4	bl 0x00b91284
00b88af8	mov w22,w0
00b88afc	cbnz w0,0x00b88b54
00b88b00	ldrb w7,[sp, #0xc]
00b88b04	cmp x7,x19
00b88b08	b.ls 0x00b88b14
00b88b0c	mov w22,#0xffffff76
00b88b10	b 0x00b88b54
00b88b14	ldr x0,[sp, #0x10]
00b88b18	ldr w8,[x0, #0x4]
00b88b1c	cmp w8,#0x100
00b88b20	b.cs 0x00b88b50
00b88b24	ldp x1,x2,[x0, #0x28]
00b88b28	mov w3,w25
00b88b2c	mov x4,x24
00b88b30	mov x5,x23
00b88b34	mov x6,x20
00b88b38	str x21,[sp]
00b88b3c	bl 0x00c43050
00b88b40	mov w22,w0
00b88b44	cbz w0,0x00b88bc0
00b88b48	mov w23,wzr
00b88b4c	b 0x00b88b5c
00b88b50	mov w22,#0xffffff79
00b88b54	cmp w22,#0x0
00b88b58	cset w23,eq
00b88b5c	str x19,[x21]
00b88b60	strb wzr,[sp, #0xc]
00b88b64	cbz x19,0x00b88b84
00b88b68	ldr x8,[x21]
00b88b6c	cmp w23,#0x0
00b88b70	mov w1,#0x21
00b88b74	csel x8,x8,xzr,ne
00b88b78	add x0,x20,x8
00b88b7c	sub x2,x19,x8
00b88b80	bl 0x00c301c0
00b88b84	ldr x0,[sp, #0x10]
00b88b88	bl 0x00c431e0
00b88b8c	ldr x8,[x26, #0x28]
00b88b90	ldr x9,[sp, #0x18]
00b88b94	cmp w23,#0x0
00b88b98	csel w0,w0,w22,ne
00b88b9c	cmp x8,x9
00b88ba0	b.ne 0x00b88bcc
00b88ba4	ldp x29,x30,[sp, #0x60]
00b88ba8	ldp x20,x19,[sp, #0x50]
00b88bac	ldp x22,x21,[sp, #0x40]
00b88bb0	ldp x24,x23,[sp, #0x30]
00b88bb4	ldp x26,x25,[sp, #0x20]
00b88bb8	add sp,sp,#0x70
00b88bbc	ret
00b88bc0	mov w23,#0x1
00b88bc4	cbnz x19,0x00b88b68
00b88bc8	b 0x00b88b84
00b88bcc	bl 0x00c2fec0

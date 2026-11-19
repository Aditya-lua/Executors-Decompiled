; FUN_00904b80 @ 00904b80
00904b80	str x28,[sp, #-0x40]!
00904b84	stp x22,x21,[sp, #0x10]
00904b88	stp x20,x19,[sp, #0x20]
00904b8c	stp x29,x30,[sp, #0x30]
00904b90	add x29,sp,#0x30
00904b94	sub sp,sp,#0x200
00904b98	stp q6,q7,[sp, #0x60]
00904b9c	stp q4,q5,[sp, #0x40]
00904ba0	stp q2,q3,[sp, #0x20]
00904ba4	stp q0,q1,[sp]
00904ba8	stp x6,x7,[sp, #0xa0]
00904bac	stp x4,x5,[sp, #0x90]
00904bb0	stp x2,x3,[sp, #0x80]
00904bb4	mrs x21,tpidr_el0
00904bb8	ldr x8,[x21, #0x28]
00904bbc	mov x19,x0
00904bc0	mov x2,x1
00904bc4	stur x8,[x29, #-0x38]
00904bc8	ldrb w8,[x0, #0xa85]
00904bcc	tbnz w8,#0x4,0x00904bd8
00904bd0	ldr x8,[x19, #0x1c8]
00904bd4	cbz x8,0x00904c6c
00904bd8	orr x8,xzr,#-0x7f00000080
00904bdc	movk x8,#0xffd0
00904be0	mov x9,sp
00904be4	add x10,sp,#0x80
00904be8	add x11,x29,#0x10
00904bec	str x8,[sp, #0xe8]
00904bf0	add x8,x9,#0x80
00904bf4	add x9,x10,#0x30
00904bf8	stp x11,x9,[sp, #0xd0]
00904bfc	str x8,[sp, #0xe0]
00904c00	ldp q1,q0,[sp, #0xd0]
00904c04	add x0,sp,#0xf4
00904c08	mov w1,#0x100
00904c0c	add x3,sp,#0xb0
00904c10	stp q1,q0,[sp, #0xb0]
00904c14	add x22,sp,#0xf4
00904c18	bl 0x00c31b80
00904c1c	ldr x8,[x19, #0x1c8]
00904c20	mov w20,w0
00904c24	cbz x8,0x00904c4c
00904c28	mov w9,#0x131c
00904c2c	ldrb w9,[x19, x9]
00904c30	tbnz w9,#0x3,0x00904c4c
00904c34	add x1,sp,#0xf4
00904c38	mov x0,x8
00904c3c	bl 0x00c31b90
00904c40	ldr w8,[x19, #0x131c]
00904c44	orr w8,w8,#0x8
00904c48	str w8,[x19, #0x131c]
00904c4c	sxtw x8,w20
00904c50	mov w9,#0xa
00904c54	add x3,x8,#0x1
00904c58	add x2,sp,#0xf4
00904c5c	mov x0,x19
00904c60	mov w1,wzr
00904c64	strh w9,[x22, x8#0x0]
00904c68	bl 0x00904a98
00904c6c	ldr x8,[x21, #0x28]
00904c70	ldur x9,[x29, #-0x38]
00904c74	cmp x8,x9
00904c78	b.ne 0x00904c94
00904c7c	add sp,sp,#0x200
00904c80	ldp x29,x30,[sp, #0x30]
00904c84	ldp x20,x19,[sp, #0x20]
00904c88	ldp x22,x21,[sp, #0x10]
00904c8c	ldr x28,[sp], #0x40
00904c90	ret
00904c94	bl 0x00c2fec0

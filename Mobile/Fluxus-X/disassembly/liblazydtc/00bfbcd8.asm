; std::__ndk1::collate_byname<char>::do_transform @ 00bfbcd8
00bfbcd8	paciasp
00bfbcdc	sub sp,sp,#0x60
00bfbce0	stp x29,x30,[sp, #0x20]
00bfbce4	stp x24,x23,[sp, #0x30]
00bfbce8	stp x22,x21,[sp, #0x40]
00bfbcec	stp x20,x19,[sp, #0x50]
00bfbcf0	add x29,sp,#0x20
00bfbcf4	sub x21,x2,x1
00bfbcf8	cmn x21,#0x8
00bfbcfc	b.cs 0x00bfbe6c
00bfbd00	mov x22,x2
00bfbd04	mov x20,x0
00bfbd08	mov x19,x8
00bfbd0c	cmp x21,#0x16
00bfbd10	b.hi 0x00bfbd30
00bfbd14	lsl w8,w21,#0x1
00bfbd18	add x9,sp,#0x8
00bfbd1c	orr x23,x9,#0x1
00bfbd20	strb w8,[sp, #0x8]
00bfbd24	cmp x22,x1
00bfbd28	b.ne 0x00bfbd68
00bfbd2c	b 0x00bfbd74
00bfbd30	orr x8,x21,#0x7
00bfbd34	mov w9,#0x1a
00bfbd38	mov x23,x1
00bfbd3c	cmp x8,#0x17
00bfbd40	csinc x24,x9,x8,eq
00bfbd44	mov x0,x24
00bfbd48	bl 0x00c2fed0
00bfbd4c	mov x1,x23
00bfbd50	mov x23,x0
00bfbd54	orr x8,x24,#0x1
00bfbd58	stp x21,x0,[sp, #0x10]
00bfbd5c	str x8,[sp, #0x8]
00bfbd60	cmp x22,x1
00bfbd64	b.eq 0x00bfbd74
00bfbd68	mov x0,x23
00bfbd6c	mov x2,x21
00bfbd70	bl 0x00c2ffd0
00bfbd74	strb wzr,[x23, x21]
00bfbd78	add x24,sp,#0x8
00bfbd7c	ldr x3,[x20, #0x10]
00bfbd80	ldrb w8,[sp, #0x8]
00bfbd84	ldr x9,[sp, #0x18]
00bfbd88	tst w8,#0x1
00bfbd8c	csinc x1,x9,x24,ne
00bfbd90	mov x0,xzr
00bfbd94	mov x2,xzr
00bfbd98	bl 0x00c438d0
00bfbd9c	mov x21,x0
00bfbda0	cmn x0,#0x8
00bfbda4	b.cs 0x00bfbe70
00bfbda8	cmp x21,#0x17
00bfbdac	b.cs 0x00bfbdc4
00bfbdb0	lsl w8,w21,#0x1
00bfbdb4	mov x22,x19
00bfbdb8	strb w8,[x22], #0x1
00bfbdbc	cbnz x21,0x00bfbdec
00bfbdc0	b 0x00bfbdfc
00bfbdc4	orr x8,x21,#0x7
00bfbdc8	mov w9,#0x1a
00bfbdcc	cmp x8,#0x17
00bfbdd0	csinc x23,x9,x8,eq
00bfbdd4	mov x0,x23
00bfbdd8	bl 0x00c2fed0
00bfbddc	orr x8,x23,#0x1
00bfbde0	mov x22,x0
00bfbde4	stp x21,x0,[x19, #0x8]
00bfbde8	str x8,[x19]
00bfbdec	mov x0,x22
00bfbdf0	mov w1,wzr
00bfbdf4	mov x2,x21
00bfbdf8	bl 0x00c301c0
00bfbdfc	ldrb w8,[sp, #0x8]
00bfbe00	strb wzr,[x22, x21]
00bfbe04	orr x10,x24,#0x1
00bfbe08	ldrb w9,[x19]
00bfbe0c	ldr x11,[sp, #0x18]
00bfbe10	ldr x3,[x20, #0x10]
00bfbe14	tst w8,#0x1
00bfbe18	ldp x12,x8,[x19, #0x8]
00bfbe1c	lsr x13,x9,#0x1
00bfbe20	csel x1,x10,x11,eq
00bfbe24	tst w9,#0x1
00bfbe28	csinc x0,x8,x19,ne
00bfbe2c	csel x8,x13,x12,eq
00bfbe30	add x2,x8,#0x1
00bfbe34	bl 0x00c438d0
00bfbe38	ldrb w8,[sp, #0x8]
00bfbe3c	tbz w8,#0x0,0x00bfbe50
00bfbe40	ldr x8,[sp, #0x8]
00bfbe44	ldr x0,[sp, #0x18]
00bfbe48	and x1,x8,#-0x2
00bfbe4c	bl 0x00c2fe80
00bfbe50	ldp x20,x19,[sp, #0x50]
00bfbe54	ldp x22,x21,[sp, #0x40]
00bfbe58	ldp x24,x23,[sp, #0x30]
00bfbe5c	ldp x29,x30,[sp, #0x20]
00bfbe60	add sp,sp,#0x60
00bfbe64	autiasp
00bfbe68	ret
00bfbe6c	bl 0x007fe124
00bfbe70	bl 0x007fe124

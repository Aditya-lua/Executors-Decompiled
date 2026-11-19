; UI_dup_verify_string @ 00aedc10
00aedc10	stp x24,x23,[sp, #-0x40]!
00aedc14	stp x22,x21,[sp, #0x10]
00aedc18	stp x20,x19,[sp, #0x20]
00aedc1c	mov x19,x6
00aedc20	mov w20,w5
00aedc24	mov w21,w4
00aedc28	mov x23,x3
00aedc2c	mov w24,w2
00aedc30	mov x22,x0
00aedc34	stp x29,x30,[sp, #0x30]
00aedc38	add x29,sp,#0x30
00aedc3c	cbz x1,0x00aedc90
00aedc40	adrp x8,0x2a0000
00aedc44	add x8,x8,#0xc2f
00aedc48	orr w2,wzr,#0xf0
00aedc4c	mov x0,x1
00aedc50	mov x1,x8
00aedc54	bl 0x00c34600
00aedc58	cbnz x0,0x00aedc94
00aedc5c	bl 0x00c342a0
00aedc60	adrp x0,0x2a0000
00aedc64	adrp x2,0x2bc000
00aedc68	add x0,x0,#0xc2f
00aedc6c	add x2,x2,#0x508
00aedc70	mov w1,#0xf2
00aedc74	bl 0x00c342b0
00aedc78	mov w1,#0x100
00aedc7c	mov w0,#0x28
00aedc80	movk w1,#0xc, LSL #16
00aedc84	mov x2,xzr
00aedc88	bl 0x00c342c0
00aedc8c	b 0x00aedcfc
00aedc90	mov x0,xzr
00aedc94	mov w1,#0x1
00aedc98	mov w2,#0x2
00aedc9c	mov w3,w24
00aedca0	mov x4,x23
00aedca4	bl 0x00aef184
00aedca8	cbz x0,0x00aedcfc
00aedcac	ldr x8,[x22, #0x8]!
00aedcb0	mov x23,x0
00aedcb4	cbnz x8,0x00aedcc4
00aedcb8	bl 0x00c34780
00aedcbc	str x0,[x22]
00aedcc0	cbz x0,0x00aedcf4
00aedcc4	stp w21,w20,[x23, #0x28]
00aedcc8	str x19,[x23, #0x30]
00aedccc	ldr x0,[x22]
00aedcd0	mov x1,x23
00aedcd4	bl 0x00c347a0
00aedcd8	mov w19,w0
00aedcdc	cmp w0,#0x0
00aedce0	b.gt 0x00aedd00
00aedce4	mov x0,x23
00aedce8	sub w19,w19,#0x1
00aedcec	bl 0x00aed930
00aedcf0	b 0x00aedd00
00aedcf4	mov x0,x23
00aedcf8	bl 0x00aed930
00aedcfc	mov w19,#0xffffffff
00aedd00	mov w0,w19
00aedd04	ldp x29,x30,[sp, #0x30]
00aedd08	ldp x20,x19,[sp, #0x20]
00aedd0c	ldp x22,x21,[sp, #0x10]
00aedd10	ldp x24,x23,[sp], #0x40
00aedd14	ret

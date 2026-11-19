; FUN_00c0cd14 @ 00c0cd14
00c0cd14	paciasp
00c0cd18	sub sp,sp,#0x120
00c0cd1c	stp x29,x30,[sp, #0xe0]
00c0cd20	str x28,[sp, #0xf0]
00c0cd24	stp x22,x21,[sp, #0x100]
00c0cd28	stp x20,x19,[sp, #0x110]
00c0cd2c	add x29,sp,#0xe0
00c0cd30	mov x8,#-0x20
00c0cd34	mov x9,sp
00c0cd38	sub x10,x29,#0x60
00c0cd3c	movk x8,#0xff80, LSL #32
00c0cd40	add x9,x9,#0x80
00c0cd44	mov x21,x0
00c0cd48	stp x9,x8,[x29, #-0x10]
00c0cd4c	add x8,x10,#0x20
00c0cd50	add x9,x29,#0x40
00c0cd54	mov x0,x2
00c0cd58	mov x19,x3
00c0cd5c	mov x20,x1
00c0cd60	stp x4,x5,[x29, #-0x60]
00c0cd64	stp x6,x7,[x29, #-0x50]
00c0cd68	stp q0,q1,[sp]
00c0cd6c	stp q2,q3,[sp, #0x20]
00c0cd70	stp q4,q5,[sp, #0x40]
00c0cd74	stp q6,q7,[sp, #0x60]
00c0cd78	stp x9,x8,[x29, #-0x20]
00c0cd7c	bl 0x00c43880
00c0cd80	ldp q0,q1,[x29, #-0x20]
00c0cd84	mov x22,x0
00c0cd88	sub x3,x29,#0x40
00c0cd8c	mov x0,x21
00c0cd90	mov x1,x20
00c0cd94	mov x2,x19
00c0cd98	stp q0,q1,[x29, #-0x40]
00c0cd9c	bl 0x00c30740
00c0cda0	mov w19,w0
00c0cda4	cbz x22,0x00c0cdb0
00c0cda8	mov x0,x22
00c0cdac	bl 0x00c43880
00c0cdb0	mov w0,w19
00c0cdb4	ldp x20,x19,[sp, #0x110]
00c0cdb8	ldr x28,[sp, #0xf0]
00c0cdbc	ldp x22,x21,[sp, #0x100]
00c0cdc0	ldp x29,x30,[sp, #0xe0]
00c0cdc4	add sp,sp,#0x120
00c0cdc8	autiasp
00c0cdcc	ret

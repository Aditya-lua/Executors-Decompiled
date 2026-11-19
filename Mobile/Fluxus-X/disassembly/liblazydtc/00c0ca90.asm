; FUN_00c0ca90 @ 00c0ca90
00c0ca90	paciasp
00c0ca94	sub sp,sp,#0x120
00c0ca98	stp x29,x30,[sp, #0xf0]
00c0ca9c	stp x28,x21,[sp, #0x100]
00c0caa0	stp x20,x19,[sp, #0x110]
00c0caa4	add x29,sp,#0xf0
00c0caa8	mov x8,#-0x28
00c0caac	mov x9,sp
00c0cab0	sub x10,x29,#0x68
00c0cab4	movk x8,#0xff80, LSL #32
00c0cab8	add x9,x9,#0x80
00c0cabc	mov x20,x0
00c0cac0	stp x9,x8,[x29, #-0x10]
00c0cac4	add x8,x10,#0x28
00c0cac8	add x9,x29,#0x30
00c0cacc	mov x0,x1
00c0cad0	mov x19,x2
00c0cad4	stp x3,x4,[x29, #-0x68]
00c0cad8	stp x5,x6,[x29, #-0x58]
00c0cadc	stur x7,[x29, #-0x48]
00c0cae0	stp q0,q1,[sp]
00c0cae4	stp q2,q3,[sp, #0x20]
00c0cae8	stp q4,q5,[sp, #0x40]
00c0caec	stp q6,q7,[sp, #0x60]
00c0caf0	stp x9,x8,[x29, #-0x20]
00c0caf4	bl 0x00c43880
00c0caf8	ldp q0,q1,[x29, #-0x20]
00c0cafc	mov x21,x0
00c0cb00	sub x2,x29,#0x40
00c0cb04	mov x0,x20
00c0cb08	mov x1,x19
00c0cb0c	stp q0,q1,[x29, #-0x40]
00c0cb10	bl 0x00c43b90
00c0cb14	mov w19,w0
00c0cb18	cbz x21,0x00c0cb24
00c0cb1c	mov x0,x21
00c0cb20	bl 0x00c43880
00c0cb24	mov w0,w19
00c0cb28	ldp x20,x19,[sp, #0x110]
00c0cb2c	ldp x28,x21,[sp, #0x100]
00c0cb30	ldp x29,x30,[sp, #0xf0]
00c0cb34	add sp,sp,#0x120
00c0cb38	autiasp
00c0cb3c	ret

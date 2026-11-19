; FUN_00c0cdd4 @ 00c0cdd4
00c0cdd4	paciasp
00c0cdd8	sub sp,sp,#0x130
00c0cddc	stp x29,x30,[sp, #0x100]
00c0cde0	stp x28,x21,[sp, #0x110]
00c0cde4	stp x20,x19,[sp, #0x120]
00c0cde8	add x29,sp,#0x100
00c0cdec	mov x8,#-0x28
00c0cdf0	mov x9,sp
00c0cdf4	sub x10,x29,#0x78
00c0cdf8	movk x8,#0xff80, LSL #32
00c0cdfc	add x9,x9,#0x80
00c0ce00	mov x21,x0
00c0ce04	stp x9,x8,[x29, #-0x10]
00c0ce08	add x8,x10,#0x28
00c0ce0c	add x9,x29,#0x30
00c0ce10	mov x0,x1
00c0ce14	mov x20,x2
00c0ce18	stp x3,x4,[x29, #-0x78]
00c0ce1c	stp x5,x6,[x29, #-0x68]
00c0ce20	stur x7,[x29, #-0x58]
00c0ce24	stp q0,q1,[sp]
00c0ce28	stp q2,q3,[sp, #0x20]
00c0ce2c	stp q4,q5,[sp, #0x40]
00c0ce30	stp q6,q7,[sp, #0x60]
00c0ce34	stp x9,x8,[x29, #-0x20]
00c0ce38	bl 0x00c43880
00c0ce3c	ldp q0,q1,[x29, #-0x20]
00c0ce40	mov x19,x0
00c0ce44	stur x0,[x29, #-0x28]
00c0ce48	stp q0,q1,[x29, #-0x50]
00c0ce4c	sub x2,x29,#0x50
00c0ce50	mov x0,x21
00c0ce54	mov x1,x20
00c0ce58	bl 0x00c43b20
00c0ce5c	mov w20,w0
00c0ce60	cbz x19,0x00c0ce6c
00c0ce64	mov x0,x19
00c0ce68	bl 0x00c43880
00c0ce6c	mov w0,w20
00c0ce70	ldp x20,x19,[sp, #0x120]
00c0ce74	ldp x28,x21,[sp, #0x110]
00c0ce78	ldp x29,x30,[sp, #0x100]
00c0ce7c	add sp,sp,#0x130
00c0ce80	autiasp
00c0ce84	ret

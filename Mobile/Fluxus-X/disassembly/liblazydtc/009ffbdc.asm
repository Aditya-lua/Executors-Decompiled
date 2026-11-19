; BIO_bind @ 009ffbdc
009ffbdc	str x21,[sp, #-0x30]!
009ffbe0	mov w8,#0x1
009ffbe4	cmn w0,#0x1
009ffbe8	stp x20,x19,[sp, #0x10]
009ffbec	stp x29,x30,[sp, #0x20]
009ffbf0	add x29,sp,#0x20
009ffbf4	str w8,[sp, #0xc]
009ffbf8	b.eq 0x009ffd04
009ffbfc	mov x20,x1
009ffc00	mov w19,w0
009ffc04	tbz w2,#0x0,0x009ffc80
009ffc08	mov w1,#0x1
009ffc0c	mov w2,#0x2
009ffc10	add x3,sp,#0xc
009ffc14	mov w4,#0x4
009ffc18	mov w0,w19
009ffc1c	bl 0x00c31c60
009ffc20	cbz w0,0x009ffc80
009ffc24	bl 0x00c342a0
009ffc28	adrp x19,0x2c5000
009ffc2c	adrp x20,0x2d5000
009ffc30	add x19,x19,#0x7d7
009ffc34	add x20,x20,#0xad0
009ffc38	mov w1,#0xa7
009ffc3c	mov x0,x19
009ffc40	mov x2,x20
009ffc44	bl 0x00c342b0
009ffc48	bl 0x00c30710
009ffc4c	ldr w1,[x0]
009ffc50	adrp x2,0x2cf000
009ffc54	add x2,x2,#0x948
009ffc58	mov w0,#0x2
009ffc5c	bl 0x00c342c0
009ffc60	bl 0x00c342a0
009ffc64	mov w1,#0xa9
009ffc68	mov x0,x19
009ffc6c	mov x2,x20
009ffc70	bl 0x00c342b0
009ffc74	mov w0,#0x20
009ffc78	mov w1,#0x8b
009ffc7c	b 0x009ffd28
009ffc80	mov x0,x20
009ffc84	bl 0x00c38560
009ffc88	mov x21,x0
009ffc8c	mov x0,x20
009ffc90	bl 0x00c38580
009ffc94	mov w2,w0
009ffc98	mov w0,w19
009ffc9c	mov x1,x21
009ffca0	bl 0x00c31be0
009ffca4	cbz w0,0x009ffd44
009ffca8	bl 0x00c342a0
009ffcac	adrp x19,0x2c5000
009ffcb0	adrp x20,0x2d5000
009ffcb4	add x19,x19,#0x7d7
009ffcb8	add x20,x20,#0xad0
009ffcbc	mov w1,#0xb0
009ffcc0	mov x0,x19
009ffcc4	mov x2,x20
009ffcc8	bl 0x00c342b0
009ffccc	bl 0x00c30710
009ffcd0	ldr w1,[x0]
009ffcd4	adrp x2,0x2af000
009ffcd8	add x2,x2,#0xd3d
009ffcdc	mov w0,#0x2
009ffce0	bl 0x00c342c0
009ffce4	bl 0x00c342a0
009ffce8	mov w1,#0xb2
009ffcec	mov x0,x19
009ffcf0	mov x2,x20
009ffcf4	bl 0x00c342b0
009ffcf8	mov w0,#0x20
009ffcfc	mov w1,#0x75
009ffd00	b 0x009ffd28
009ffd04	bl 0x00c342a0
009ffd08	adrp x0,0x2c5000
009ffd0c	adrp x2,0x2d5000
009ffd10	add x0,x0,#0x7d7
009ffd14	add x2,x2,#0xad0
009ffd18	mov w1,#0x9b
009ffd1c	bl 0x00c342b0
009ffd20	mov w0,#0x20
009ffd24	mov w1,#0x87
009ffd28	mov x2,xzr
009ffd2c	bl 0x00c342c0
009ffd30	mov w0,wzr
009ffd34	ldp x29,x30,[sp, #0x20]
009ffd38	ldp x20,x19,[sp, #0x10]
009ffd3c	ldr x21,[sp], #0x30
009ffd40	ret
009ffd44	mov w0,#0x1
009ffd48	b 0x009ffd34

; std::__ndk1::ios_base::iword @ 00bcdc0c
00bcdc0c	paciasp
00bcdc10	stp x29,x30,[sp, #-0x40]!
00bcdc14	stp x24,x23,[sp, #0x10]
00bcdc18	stp x22,x21,[sp, #0x20]
00bcdc1c	stp x20,x19,[sp, #0x30]
00bcdc20	mov x29,sp
00bcdc24	sxtw x21,w1
00bcdc28	ldr x8,[x0, #0x68]
00bcdc2c	mov x19,x0
00bcdc30	add x22,x21,#0x1
00bcdc34	cmp x22,x8
00bcdc38	b.ls 0x00bcdcc4
00bcdc3c	lsl x8,x8,#0x1
00bcdc40	mov x9,#0xfffffffffffffff
00bcdc44	ldr x0,[x19, #0x58]
00bcdc48	cmp x8,x22
00bcdc4c	csel x8,x8,x22,hi
00bcdc50	cmp x22,x9
00bcdc54	mov x9,#0x1fffffffffffffff
00bcdc58	csel x23,x8,x9,cc
00bcdc5c	lsl x20,x23,#0x3
00bcdc60	mov x1,x20
00bcdc64	bl 0x00c30950
00bcdc68	cbz x0,0x00bcdcf0
00bcdc6c	ldr x24,[x19, #0x60]
00bcdc70	str x0,[x19, #0x58]
00bcdc74	cmp x24,x23
00bcdc78	b.cs 0x00bcdcbc
00bcdc7c	lsl x9,x24,#0x3
00bcdc80	add x11,x20,x0
00bcdc84	mov x20,x0
00bcdc88	mov w1,wzr
00bcdc8c	add x8,x0,x9
00bcdc90	add x10,x8,#0x8
00bcdc94	cmp x10,x11
00bcdc98	csel x10,x10,x11,hi
00bcdc9c	mvn x11,x0
00bcdca0	mov x0,x8
00bcdca4	add x10,x10,x11
00bcdca8	sub x9,x10,x9
00bcdcac	and x9,x9,#-0x8
00bcdcb0	add x2,x9,#0x8
00bcdcb4	bl 0x00c301c0
00bcdcb8	mov x0,x20
00bcdcbc	str x23,[x19, #0x68]
00bcdcc0	b 0x00bcdcc8
00bcdcc4	ldp x0,x24,[x19, #0x58]
00bcdcc8	cmp x24,x22
00bcdccc	add x0,x0,x21, LSL #0x3
00bcdcd0	csel x8,x24,x22,hi
00bcdcd4	str x8,[x19, #0x60]
00bcdcd8	ldp x20,x19,[sp, #0x30]
00bcdcdc	ldp x22,x21,[sp, #0x20]
00bcdce0	ldp x24,x23,[sp, #0x10]
00bcdce4	ldp x29,x30,[sp], #0x40
00bcdce8	autiasp
00bcdcec	ret
00bcdcf0	ldp w8,w9,[x19, #0x20]
00bcdcf4	orr w8,w8,#0x1
00bcdcf8	tst w9,w8
00bcdcfc	str w8,[x19, #0x20]
00bcdd00	b.ne 0x00bcdd14
00bcdd04	adrp x0,0xd26000
00bcdd08	add x0,x0,#0x730
00bcdd0c	str xzr,[x0]
00bcdd10	b 0x00bcdcd8
00bcdd14	adrp x0,0x2ac000
00bcdd18	add x0,x0,#0xd42
00bcdd1c	bl 0x00bce038

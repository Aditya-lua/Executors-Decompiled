; FUN_0091fdcc @ 0091fdcc
0091fdcc	str x21,[sp, #-0x30]!
0091fdd0	stp x20,x19,[sp, #0x10]
0091fdd4	stp x29,x30,[sp, #0x20]
0091fdd8	add x29,sp,#0x20
0091fddc	mov x19,x0
0091fde0	ldr x0,[x0]
0091fde4	cbz x0,0x0091fe38
0091fde8	ldr x8,[x19, #0x8]
0091fdec	cbz x8,0x0091fe38
0091fdf0	adrp x20,0xcb4000
0091fdf4	ldr x0,[x0]
0091fdf8	ldr x20,[x20, #0xdd8]
0091fdfc	ldr x8,[x20]
0091fe00	blr x8
0091fe04	ldr x8,[x19, #0x8]
0091fe08	cmp x8,#0x2
0091fe0c	b.cc 0x0091fe34
0091fe10	mov w21,#0x1
0091fe14	ldr x8,[x19]
0091fe18	ldr x0,[x8, x21, LSL #0x3]
0091fe1c	ldr x8,[x20]
0091fe20	blr x8
0091fe24	ldr x8,[x19, #0x8]
0091fe28	add x21,x21,#0x1
0091fe2c	cmp x21,x8
0091fe30	b.cc 0x0091fe14
0091fe34	ldr x0,[x19]
0091fe38	adrp x8,0xcc4000
0091fe3c	add x8,x8,#0x678
0091fe40	ldr x8,[x8]
0091fe44	blr x8
0091fe48	str xzr,[x19, #0x20]
0091fe4c	stp xzr,xzr,[x19, #0x8]
0091fe50	str xzr,[x19]
0091fe54	ldp x29,x30,[sp, #0x20]
0091fe58	ldp x20,x19,[sp, #0x10]
0091fe5c	ldr x21,[sp], #0x30
0091fe60	ret

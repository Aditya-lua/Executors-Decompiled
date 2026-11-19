; ZSTD_sizeof_DStream @ 00bb2d1c
00bb2d1c	cbz x0,0x00bb2d5c
00bb2d20	stp x29,x30,[sp, #-0x20]!
00bb2d24	str x19,[sp, #0x10]
00bb2d28	mov x29,sp
00bb2d2c	ldr x8,[x0, #0x75e8]
00bb2d30	mov x19,x0
00bb2d34	mov x0,x8
00bb2d38	bl 0x00c435c0
00bb2d3c	ldr x8,[x19, #0x7628]
00bb2d40	ldr x9,[x19, #0x7648]
00bb2d44	add x8,x8,x9
00bb2d48	add x8,x0,x8
00bb2d4c	add x8,x8,#0x17, LSL #12
00bb2d50	add x0,x8,#0x6e8
00bb2d54	ldr x19,[sp, #0x10]
00bb2d58	ldp x29,x30,[sp], #0x20
00bb2d5c	ret

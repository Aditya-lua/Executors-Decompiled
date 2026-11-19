; ZSTD_getDictID_fromFrame @ 00bb1d4c
00bb1d4c	sub sp,sp,#0x60
00bb1d50	stp x29,x30,[sp, #0x40]
00bb1d54	str x19,[sp, #0x50]
00bb1d58	add x29,sp,#0x40
00bb1d5c	movi v0.2D,#0x0
00bb1d60	mrs x19,tpidr_el0
00bb1d64	mov x2,x1
00bb1d68	ldr x8,[x19, #0x28]
00bb1d6c	mov x1,x0
00bb1d70	mov x0,sp
00bb1d74	mov w3,wzr
00bb1d78	stur x8,[x29, #-0x8]
00bb1d7c	stp q0,q0,[sp, #0x10]
00bb1d80	str q0,[sp]
00bb1d84	bl 0x00c435f0
00bb1d88	ldr w8,[sp, #0x1c]
00bb1d8c	ldr x9,[x19, #0x28]
00bb1d90	cmn x0,#0x77
00bb1d94	ldur x10,[x29, #-0x8]
00bb1d98	csel w0,w8,wzr,cc
00bb1d9c	cmp x9,x10
00bb1da0	b.ne 0x00bb1db4
00bb1da4	ldp x29,x30,[sp, #0x40]
00bb1da8	ldr x19,[sp, #0x50]
00bb1dac	add sp,sp,#0x60
00bb1db0	ret
00bb1db4	bl 0x00c2fec0

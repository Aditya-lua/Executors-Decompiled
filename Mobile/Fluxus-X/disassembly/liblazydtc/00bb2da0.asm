; ZSTD_estimateDStreamSize_fromFrame @ 00bb2da0
00bb2da0	sub sp,sp,#0x60
00bb2da4	stp x29,x30,[sp, #0x40]
00bb2da8	str x19,[sp, #0x50]
00bb2dac	add x29,sp,#0x40
00bb2db0	mrs x19,tpidr_el0
00bb2db4	mov x2,x1
00bb2db8	mov x1,x0
00bb2dbc	ldr x8,[x19, #0x28]
00bb2dc0	add x0,sp,#0x8
00bb2dc4	mov w3,wzr
00bb2dc8	stur x8,[x29, #-0x8]
00bb2dcc	bl 0x00c435f0
00bb2dd0	cmn x0,#0x78
00bb2dd4	b.hi 0x00bb2e18
00bb2dd8	cbz x0,0x00bb2de4
00bb2ddc	mov x0,#-0x48
00bb2de0	b 0x00bb2e18
00bb2de4	ldr x8,[sp, #0x10]
00bb2de8	mov w9,#0x80000000
00bb2dec	cmp x8,x9
00bb2df0	b.ls 0x00bb2dfc
00bb2df4	mov x0,#-0x10
00bb2df8	b 0x00bb2e18
00bb2dfc	cmp x8,#0x20, LSL #12
00bb2e00	mov w9,#0x20000
00bb2e04	csel x9,x8,x9,cc
00bb2e08	add x8,x8,x9
00bb2e0c	add x8,x8,x9, LSL #0x1
00bb2e10	add x8,x8,#0x17, LSL #12
00bb2e14	add x0,x8,#0x728
00bb2e18	ldr x8,[x19, #0x28]
00bb2e1c	ldur x9,[x29, #-0x8]
00bb2e20	cmp x8,x9
00bb2e24	b.ne 0x00bb2e38
00bb2e28	ldp x29,x30,[sp, #0x40]
00bb2e2c	ldr x19,[sp, #0x50]
00bb2e30	add sp,sp,#0x60
00bb2e34	ret
00bb2e38	bl 0x00c2fec0

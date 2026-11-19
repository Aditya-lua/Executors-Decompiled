; DSO_global_lookup @ 00a22df4
00a22df4	str x19,[sp, #-0x20]!
00a22df8	stp x29,x30,[sp, #0x10]
00a22dfc	add x29,sp,#0x10
00a22e00	mov x19,x0
00a22e04	bl 0x00c3a3f0
00a22e08	ldr x1,[x0, #0x50]
00a22e0c	cbz x1,0x00a22e20
00a22e10	ldp x29,x30,[sp, #0x10]
00a22e14	mov x0,x19
00a22e18	ldr x19,[sp], #0x20
00a22e1c	br x1
00a22e20	bl 0x00c342a0
00a22e24	adrp x0,0x2a7000
00a22e28	adrp x2,0x2bd000
00a22e2c	add x0,x0,#0xdd6
00a22e30	add x2,x2,#0x887
00a22e34	mov w1,#0x14e
00a22e38	bl 0x00c342b0
00a22e3c	mov w0,#0x25
00a22e40	mov w1,#0x6c
00a22e44	mov x2,xzr
00a22e48	bl 0x00c342c0
00a22e4c	ldp x29,x30,[sp, #0x10]
00a22e50	mov x0,xzr
00a22e54	ldr x19,[sp], #0x20
00a22e58	ret

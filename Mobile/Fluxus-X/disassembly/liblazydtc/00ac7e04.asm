; RAND_seed @ 00ac7e04
00ac7e04	stp x20,x19,[sp, #-0x20]!
00ac7e08	stp x29,x30,[sp, #0x10]
00ac7e0c	add x29,sp,#0x10
00ac7e10	mov w20,w1
00ac7e14	mov x19,x0
00ac7e18	bl 0x00ac7d50
00ac7e1c	cbz x0,0x00ac7e3c
00ac7e20	ldr x2,[x0]
00ac7e24	cbz x2,0x00ac7e3c
00ac7e28	ldp x29,x30,[sp, #0x10]
00ac7e2c	mov x0,x19
00ac7e30	mov w1,w20
00ac7e34	ldp x20,x19,[sp], #0x20
00ac7e38	br x2
00ac7e3c	mov x0,xzr
00ac7e40	bl 0x00ac7f78
00ac7e44	cmp w20,#0x1
00ac7e48	b.lt 0x00ac7e70
00ac7e4c	cbz x0,0x00ac7e70
00ac7e50	ldp x29,x30,[sp, #0x10]
00ac7e54	sxtw x5,w20
00ac7e58	mov w1,wzr
00ac7e5c	mov x2,xzr
00ac7e60	mov x3,xzr
00ac7e64	mov x4,x19
00ac7e68	ldp x20,x19,[sp], #0x20
00ac7e6c	b 0x00c3d1c0
00ac7e70	ldp x29,x30,[sp, #0x10]
00ac7e74	ldp x20,x19,[sp], #0x20
00ac7e78	ret

; NCONF_dump_fp @ 00a0da48
00a0da48	stp x20,x19,[sp, #-0x20]!
00a0da4c	mov x20,x0
00a0da50	mov x0,x1
00a0da54	mov w1,wzr
00a0da58	stp x29,x30,[sp, #0x10]
00a0da5c	add x29,sp,#0x10
00a0da60	bl 0x00c37810
00a0da64	cbz x0,0x00a0da8c
00a0da68	mov x19,x0
00a0da6c	cbz x20,0x00a0dac4
00a0da70	ldr x8,[x20]
00a0da74	mov x0,x20
00a0da78	mov x1,x19
00a0da7c	ldr x8,[x8, #0x30]
00a0da80	blr x8
00a0da84	mov w20,w0
00a0da88	b 0x00a0daf0
00a0da8c	bl 0x00c342a0
00a0da90	adrp x0,0x2af000
00a0da94	adrp x2,0x2d5000
00a0da98	add x0,x0,#0xd73
00a0da9c	add x2,x2,#0xb19
00a0daa0	mov w1,#0x182
00a0daa4	bl 0x00c342b0
00a0daa8	mov w1,#0x7
00a0daac	orr w0,wzr,#0xe
00a0dab0	movk w1,#0x8, LSL #16
00a0dab4	mov x2,xzr
00a0dab8	bl 0x00c342c0
00a0dabc	mov w20,wzr
00a0dac0	b 0x00a0daf8
00a0dac4	bl 0x00c342a0
00a0dac8	adrp x0,0x2af000
00a0dacc	adrp x2,0x2bd000
00a0dad0	add x0,x0,#0xd73
00a0dad4	add x2,x2,#0x83a
00a0dad8	mov w1,#0x18e
00a0dadc	bl 0x00c342b0
00a0dae0	orr w0,wzr,#0xe
00a0dae4	mov w1,#0x69
00a0dae8	mov x2,xzr
00a0daec	bl 0x00c342c0
00a0daf0	mov x0,x19
00a0daf4	bl 0x00c31a40
00a0daf8	ldp x29,x30,[sp, #0x10]
00a0dafc	mov w0,w20
00a0db00	ldp x20,x19,[sp], #0x20
00a0db04	ret

; EC_POINT_point2oct @ 00a34b70
00a34b70	stp x29,x30,[sp, #-0x10]!
00a34b74	ldr x8,[x0]
00a34b78	mov x29,sp
00a34b7c	ldr x6,[x8, #0x90]
00a34b80	cbnz x6,0x00a34bb8
00a34b84	ldrb w9,[x8]
00a34b88	tbnz w9,#0x0,0x00a34bb8
00a34b8c	bl 0x00c342a0
00a34b90	adrp x0,0x2bd000
00a34b94	adrp x2,0x2cf000
00a34b98	add x0,x0,#0x968
00a34b9c	add x2,x2,#0xaa4
00a34ba0	mov w1,#0x4f
00a34ba4	bl 0x00c342b0
00a34ba8	mov w1,#0x101
00a34bac	mov w0,#0x10
00a34bb0	movk w1,#0xc, LSL #16
00a34bb4	b 0x00a34be8
00a34bb8	ldr x9,[x1]
00a34bbc	cmp x8,x9
00a34bc0	b.eq 0x00a34bfc
00a34bc4	bl 0x00c342a0
00a34bc8	adrp x0,0x2bd000
00a34bcc	adrp x2,0x2cf000
00a34bd0	add x0,x0,#0x968
00a34bd4	add x2,x2,#0xaa4
00a34bd8	mov w1,#0x53
00a34bdc	bl 0x00c342b0
00a34be0	mov w0,#0x10
00a34be4	mov w1,#0x65
00a34be8	mov x2,xzr
00a34bec	bl 0x00c342c0
00a34bf0	mov x0,xzr
00a34bf4	ldp x29,x30,[sp], #0x10
00a34bf8	ret
00a34bfc	ldr w9,[x0, #0x20]
00a34c00	cbz w9,0x00a34c14
00a34c04	ldr w10,[x1, #0x8]
00a34c08	cbz w10,0x00a34c14
00a34c0c	cmp w9,w10
00a34c10	b.ne 0x00a34bc4
00a34c14	ldrb w9,[x8]
00a34c18	tbnz w9,#0x0,0x00a34c24
00a34c1c	ldp x29,x30,[sp], #0x10
00a34c20	br x6
00a34c24	ldr w8,[x8, #0x4]
00a34c28	cmp w8,#0x196
00a34c2c	b.ne 0x00a34c38
00a34c30	ldp x29,x30,[sp], #0x10
00a34c34	b 0x00c3b150
00a34c38	ldp x29,x30,[sp], #0x10
00a34c3c	b 0x00c3a6d0

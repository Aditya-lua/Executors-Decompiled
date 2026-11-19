; ENGINE_remove @ 00a51df0
00a51df0	stp x20,x19,[sp, #-0x20]!
00a51df4	mov x19,x0
00a51df8	stp x29,x30,[sp, #0x10]
00a51dfc	add x29,sp,#0x10
00a51e00	cbz x0,0x00a51e94
00a51e04	adrp x20,0xcb5000
00a51e08	ldr x20,[x20, #0x5d8]
00a51e0c	ldr x0,[x20]
00a51e10	bl 0x00c356a0
00a51e14	cbz w0,0x00a51ec8
00a51e18	adrp x9,0xd21000
00a51e1c	add x9,x9,#0x9b8
00a51e20	ldr x8,[x9]
00a51e24	cmp x8,x19
00a51e28	b.eq 0x00a51e34
00a51e2c	add x9,x8,#0xc0
00a51e30	cbnz x8,0x00a51e20
00a51e34	cbz x8,0x00a51ed0
00a51e38	ldr x9,[x19, #0xc0]
00a51e3c	cbz x9,0x00a51e48
00a51e40	ldr x8,[x19, #0xb8]
00a51e44	str x8,[x9, #0xb8]
00a51e48	ldr x8,[x19, #0xb8]
00a51e4c	cbz x8,0x00a51e54
00a51e50	str x9,[x8, #0xc0]
00a51e54	adrp x9,0xd21000
00a51e58	ldr x10,[x9, #0x9b8]
00a51e5c	cmp x10,x19
00a51e60	b.ne 0x00a51e6c
00a51e64	ldr x10,[x19, #0xc0]
00a51e68	str x10,[x9, #0x9b8]
00a51e6c	adrp x9,0xd21000
00a51e70	ldr x10,[x9, #0x9c0]
00a51e74	cmp x10,x19
00a51e78	b.ne 0x00a51e80
00a51e7c	str x8,[x9, #0x9c0]
00a51e80	mov x0,x19
00a51e84	mov w1,wzr
00a51e88	bl 0x00c3bb10
00a51e8c	mov w19,#0x1
00a51e90	b 0x00a51f2c
00a51e94	bl 0x00c342a0
00a51e98	adrp x0,0x2cd000
00a51e9c	adrp x2,0x2c7000
00a51ea0	add x0,x0,#0x9e1
00a51ea4	add x2,x2,#0x92c
00a51ea8	mov w1,#0x14a
00a51eac	bl 0x00c342b0
00a51eb0	mov w1,#0x102
00a51eb4	mov w0,#0x26
00a51eb8	movk w1,#0xc, LSL #16
00a51ebc	mov x2,xzr
00a51ec0	bl 0x00c342c0
00a51ec4	b 0x00a51f34
00a51ec8	mov w19,wzr
00a51ecc	b 0x00a51f34
00a51ed0	bl 0x00c342a0
00a51ed4	adrp x19,0x2cd000
00a51ed8	add x19,x19,#0x9e1
00a51edc	adrp x2,0x2a7000
00a51ee0	add x2,x2,#0xef5
00a51ee4	mov w1,#0x7b
00a51ee8	mov x0,x19
00a51eec	bl 0x00c342b0
00a51ef0	mov w0,#0x26
00a51ef4	mov w1,#0x69
00a51ef8	mov x2,xzr
00a51efc	bl 0x00c342c0
00a51f00	bl 0x00c342a0
00a51f04	adrp x2,0x2c7000
00a51f08	add x2,x2,#0x92c
00a51f0c	mov w1,#0x150
00a51f10	mov x0,x19
00a51f14	bl 0x00c342b0
00a51f18	mov w0,#0x26
00a51f1c	mov w1,#0x6e
00a51f20	mov x2,xzr
00a51f24	bl 0x00c342c0
00a51f28	mov w19,wzr
00a51f2c	ldr x0,[x20]
00a51f30	bl 0x00c35690
00a51f34	ldp x29,x30,[sp, #0x10]
00a51f38	mov w0,w19
00a51f3c	ldp x20,x19,[sp], #0x20
00a51f40	ret

; FUN_00aa3e00 @ 00aa3e00
00aa3e00	str x21,[sp, #-0x30]!
00aa3e04	stp x20,x19,[sp, #0x10]
00aa3e08	stp x29,x30,[sp, #0x20]
00aa3e0c	mov x19,x0
00aa3e10	ldr x0,[x0, #0x50]
00aa3e14	adrp x2,0xc6d000
00aa3e18	add x2,x2,#0x4c8
00aa3e1c	mov w1,#0x1
00aa3e20	add x29,sp,#0x20
00aa3e24	bl 0x00c3b520
00aa3e28	cbz x0,0x00aa3eb4
00aa3e2c	mov x20,x0
00aa3e30	ldr x0,[x0, #0x20]
00aa3e34	bl 0x00c35680
00aa3e38	cbz w0,0x00aa3ef0
00aa3e3c	ldr x0,[x20, #0x20]
00aa3e40	ldrb w21,[x20, #0x48]
00aa3e44	bl 0x00c35690
00aa3e48	tbnz w21,#0x1,0x00aa3eec
00aa3e4c	ldr x0,[x19, #0xb8]
00aa3e50	bl 0x00c356a0
00aa3e54	cbz w0,0x00aa3ef0
00aa3e58	ldr x0,[x19, #0xa8]
00aa3e5c	adrp x1,0x2aa000
00aa3e60	add x1,x1,#0x4b5
00aa3e64	mov w2,#0x4ce
00aa3e68	bl 0x00c32310
00aa3e6c	ldr x0,[x19, #0xb8]
00aa3e70	stp xzr,xzr,[x19, #0xa8]
00aa3e74	bl 0x00c35690
00aa3e78	mov x0,x19
00aa3e7c	bl 0x00c3cdd0
00aa3e80	mov w20,w0
00aa3e84	mov x0,x19
00aa3e88	bl 0x00c3b950
00aa3e8c	add w20,w0,w20
00aa3e90	mov x0,x19
00aa3e94	bl 0x00c3b510
00aa3e98	add w20,w20,w0
00aa3e9c	mov x0,x19
00aa3ea0	bl 0x00c3ec20
00aa3ea4	add w8,w20,w0
00aa3ea8	cmp w8,#0x4
00aa3eac	cset w0,eq
00aa3eb0	b 0x00aa3ef0
00aa3eb4	bl 0x00c342a0
00aa3eb8	adrp x0,0x2aa000
00aa3ebc	adrp x2,0x2bb000
00aa3ec0	add x0,x0,#0x4b5
00aa3ec4	add x2,x2,#0xf7d
00aa3ec8	mov w1,#0x156
00aa3ecc	bl 0x00c342b0
00aa3ed0	mov w1,#0x103
00aa3ed4	orr w0,wzr,#0xf
00aa3ed8	movk w1,#0xc, LSL #16
00aa3edc	mov x2,xzr
00aa3ee0	bl 0x00c342c0
00aa3ee4	mov w0,wzr
00aa3ee8	b 0x00aa3ef0
00aa3eec	mov w0,#0x1
00aa3ef0	ldp x29,x30,[sp, #0x20]
00aa3ef4	ldp x20,x19,[sp, #0x10]
00aa3ef8	ldr x21,[sp], #0x30
00aa3efc	ret

; std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00be3d94
00be3d94	paciasp
00be3d98	sub sp,sp,#0x60
00be3d9c	stp x29,x30,[sp, #0x30]
00be3da0	stp x22,x21,[sp, #0x40]
00be3da4	stp x20,x19,[sp, #0x50]
00be3da8	add x29,sp,#0x30
00be3dac	ldrb w8,[x2, #0x8]
00be3db0	mov w20,w4
00be3db4	mov x19,x1
00be3db8	tbnz w8,#0x0,0x00be3de4
00be3dbc	ldr x8,[x0]
00be3dc0	and x4,x20,#0x1
00be3dc4	ldr x16,[x8, #0x30]
00be3dc8	mov x1,x19
00be3dcc	ldp x20,x19,[sp, #0x50]
00be3dd0	ldp x22,x21,[sp, #0x40]
00be3dd4	ldp x29,x30,[sp, #0x30]
00be3dd8	add sp,sp,#0x60
00be3ddc	autiasp
00be3de0	br x16
00be3de4	add x8,sp,#0x18
00be3de8	mov x0,x2
00be3dec	bl 0x00c30070
00be3df0	adrp x22,0xcb5000
00be3df4	ldr x22,[x22, #0xc00]
00be3df8	ldr x21,[sp, #0x18]
00be3dfc	stur x22,[x29, #-0x10]
00be3e00	ldar x8,[x22]
00be3e04	cmn x8,#0x1
00be3e08	b.eq 0x00be3e34
00be3e0c	sub x8,x29,#0x10
00be3e10	mov x9,sp
00be3e14	str x8,[sp]
00be3e18	stur x9,[x29, #-0x8]
00be3e1c	adrp x0,0xcb5000
00be3e20	nop
00be3e24	adr x2,0xc0bab0
00be3e28	ldr x0,[x0, #0xc00]
00be3e2c	sub x1,x29,#0x8
00be3e30	bl 0x00c305d0
00be3e34	ldp x8,x10,[x21, #0x10]
00be3e38	ldrsw x9,[x22, #0x8]
00be3e3c	sub x9,x9,#0x1
00be3e40	sub x10,x10,x8
00be3e44	cmp x9,x10, ASR #0x3
00be3e48	b.cs 0x00be3f38
00be3e4c	ldr x21,[x8, x9, LSL #0x3]
00be3e50	cbz x21,0x00be3f38
00be3e54	add x0,sp,#0x18
00be3e58	bl 0x00c30090
00be3e5c	ldr x8,[x21]
00be3e60	tst w20,#0x1
00be3e64	mov w9,#0x38
00be3e68	mov w10,#0x30
00be3e6c	mov x0,x21
00be3e70	mov x20,sp
00be3e74	csel x9,x10,x9,ne
00be3e78	ldr x9,[x8, x9#0x0]
00be3e7c	mov x8,sp
00be3e80	blr x9
00be3e84	ldrb w8,[sp]
00be3e88	ldp x9,x0,[sp, #0x8]
00be3e8c	lsr x10,x8,#0x1
00be3e90	tst w8,#0x1
00be3e94	csel x9,x10,x9,eq
00be3e98	cbz x9,0x00be3f0c
00be3e9c	orr x20,x20,#0x1
00be3ea0	csel x21,x20,x0,eq
00be3ea4	b 0x00be3edc
00be3ea8	add x9,x8,#0x1
00be3eac	str x9,[x19, #0x30]
00be3eb0	strb w1,[x8]
00be3eb4	ldrb w8,[sp]
00be3eb8	ldp x9,x0,[sp, #0x8]
00be3ebc	add x21,x21,#0x1
00be3ec0	lsr x10,x8,#0x1
00be3ec4	tst w8,#0x1
00be3ec8	csel x11,x20,x0,eq
00be3ecc	csel x9,x10,x9,eq
00be3ed0	add x9,x11,x9
00be3ed4	cmp x21,x9
00be3ed8	b.eq 0x00be3f0c
00be3edc	cbz x19,0x00be3eb4
00be3ee0	ldp x8,x9,[x19, #0x30]
00be3ee4	ldrb w1,[x21]
00be3ee8	cmp x8,x9
00be3eec	b.ne 0x00be3ea8
00be3ef0	ldr x8,[x19]
00be3ef4	ldr x8,[x8, #0x68]
00be3ef8	mov x0,x19
00be3efc	blr x8
00be3f00	cmn w0,#0x1
00be3f04	csel x19,xzr,x19,eq
00be3f08	b 0x00be3eb4
00be3f0c	tbz w8,#0x0,0x00be3f1c
00be3f10	ldr x8,[sp]
00be3f14	and x1,x8,#-0x2
00be3f18	bl 0x00c2fe80
00be3f1c	mov x0,x19
00be3f20	ldp x20,x19,[sp, #0x50]
00be3f24	ldp x22,x21,[sp, #0x40]
00be3f28	ldp x29,x30,[sp, #0x30]
00be3f2c	add sp,sp,#0x60
00be3f30	autiasp
00be3f34	ret
00be3f38	bl 0x00bd8968

; FUN_00c02e28 @ 00c02e28
00c02e28	paciasp
00c02e2c	stp x29,x30,[sp, #-0x20]!
00c02e30	stp x20,x19,[sp, #0x10]
00c02e34	mov x29,sp
00c02e38	adrp x8,0xd27000
00c02e3c	add x8,x8,#0x6a8
00c02e40	ldarb w8,[x8]
00c02e44	tbz w8,#0x0,0x00c030c4
00c02e48	adrp x19,0xd27000
00c02e4c	add x19,x19,#0x558
00c02e50	adrp x1,0x789000
00c02e54	add x1,x1,#0xf5c
00c02e58	mov x0,x19
00c02e5c	mov w2,#0x6
00c02e60	mov w20,#0x6
00c02e64	bl 0x00bc5e50
00c02e68	adrp x1,0x78a000
00c02e6c	add x1,x1,#0xac
00c02e70	add x0,x19,#0x18
00c02e74	mov w2,#0x6
00c02e78	bl 0x00bc5e50
00c02e7c	adrp x1,0x789000
00c02e80	add x1,x1,#0xe18
00c02e84	add x0,x19,#0x30
00c02e88	mov w2,#0x7
00c02e8c	bl 0x00bc5e50
00c02e90	adrp x1,0x78a000
00c02e94	add x1,x1,#0xec
00c02e98	add x0,x19,#0x48
00c02e9c	mov w2,#0x9
00c02ea0	bl 0x00bc5e50
00c02ea4	adrp x1,0x78a000
00c02ea8	add x1,x1,#0xc
00c02eac	add x0,x19,#0x60
00c02eb0	mov w2,#0x8
00c02eb4	bl 0x00bc5e50
00c02eb8	adrp x1,0x789000
00c02ebc	add x1,x1,#0xf9c
00c02ec0	add x0,x19,#0x78
00c02ec4	mov w2,#0x6
00c02ec8	bl 0x00bc5e50
00c02ecc	adrp x1,0x78a000
00c02ed0	add x1,x1,#0x30
00c02ed4	add x0,x19,#0x90
00c02ed8	mov w2,#0x8
00c02edc	bl 0x00bc5e50
00c02ee0	ldrb w8,[x19, #0xa8]
00c02ee4	tbnz w8,#0x0,0x00c02ef8
00c02ee8	adrp x8,0xd27000
00c02eec	add x8,x8,#0x600
00c02ef0	strb w20,[x8], #0x4
00c02ef4	b 0x00c02f0c
00c02ef8	adrp x9,0xd27000
00c02efc	add x9,x9,#0x608
00c02f00	mov w10,#0x3
00c02f04	ldr x8,[x9, #0x8]
00c02f08	str x10,[x9]
00c02f0c	mov x9,#0x53
00c02f10	mov w10,#0x6e
00c02f14	movk x9,#0x75, LSL #32
00c02f18	stp x9,x10,[x8]
00c02f1c	adrp x8,0xd27000
00c02f20	ldrb w8,[x8, #0x618]
00c02f24	tbnz w8,#0x0,0x00c02f3c
00c02f28	adrp x8,0xd27000
00c02f2c	add x8,x8,#0x618
00c02f30	mov w9,#0x6
00c02f34	strb w9,[x8], #0x4
00c02f38	b 0x00c02f50
00c02f3c	adrp x9,0xd27000
00c02f40	add x9,x9,#0x620
00c02f44	mov w10,#0x3
00c02f48	ldr x8,[x9, #0x8]
00c02f4c	str x10,[x9]
00c02f50	mov x9,#0x4d
00c02f54	mov w10,#0x6e
00c02f58	movk x9,#0x6f, LSL #32
00c02f5c	stp x9,x10,[x8]
00c02f60	adrp x8,0xd27000
00c02f64	ldrb w8,[x8, #0x630]
00c02f68	tbnz w8,#0x0,0x00c02f80
00c02f6c	adrp x8,0xd27000
00c02f70	add x8,x8,#0x630
00c02f74	mov w9,#0x6
00c02f78	strb w9,[x8], #0x4
00c02f7c	b 0x00c02f94
00c02f80	adrp x9,0xd27000
00c02f84	add x9,x9,#0x638
00c02f88	mov w10,#0x3
00c02f8c	ldr x8,[x9, #0x8]
00c02f90	str x10,[x9]
00c02f94	mov x9,#0x54
00c02f98	mov w10,#0x65
00c02f9c	movk x9,#0x75, LSL #32
00c02fa0	stp x9,x10,[x8]
00c02fa4	adrp x8,0xd27000
00c02fa8	ldrb w8,[x8, #0x648]
00c02fac	tbnz w8,#0x0,0x00c02fc4
00c02fb0	adrp x8,0xd27000
00c02fb4	add x8,x8,#0x648
00c02fb8	mov w9,#0x6
00c02fbc	strb w9,[x8], #0x4
00c02fc0	b 0x00c02fd8
00c02fc4	adrp x9,0xd27000
00c02fc8	add x9,x9,#0x650
00c02fcc	mov w10,#0x3
00c02fd0	ldr x8,[x9, #0x8]
00c02fd4	str x10,[x9]
00c02fd8	mov x9,#0x57
00c02fdc	mov w10,#0x64
00c02fe0	movk x9,#0x65, LSL #32
00c02fe4	stp x9,x10,[x8]
00c02fe8	adrp x8,0xd27000
00c02fec	ldrb w8,[x8, #0x660]
00c02ff0	tbnz w8,#0x0,0x00c03008
00c02ff4	adrp x8,0xd27000
00c02ff8	add x8,x8,#0x660
00c02ffc	mov w9,#0x6
00c03000	strb w9,[x8], #0x4
00c03004	b 0x00c0301c
00c03008	adrp x9,0xd27000
00c0300c	add x9,x9,#0x668
00c03010	mov w10,#0x3
00c03014	ldr x8,[x9, #0x8]
00c03018	str x10,[x9]
00c0301c	mov x9,#0x54
00c03020	mov w10,#0x75
00c03024	movk x9,#0x68, LSL #32
00c03028	stp x9,x10,[x8]
00c0302c	adrp x8,0xd27000
00c03030	ldrb w8,[x8, #0x678]
00c03034	tbnz w8,#0x0,0x00c0304c
00c03038	adrp x8,0xd27000
00c0303c	add x8,x8,#0x678
00c03040	mov w9,#0x6
00c03044	strb w9,[x8], #0x4
00c03048	b 0x00c03060
00c0304c	adrp x9,0xd27000
00c03050	add x9,x9,#0x680
00c03054	mov w10,#0x3
00c03058	ldr x8,[x9, #0x8]
00c0305c	str x10,[x9]
00c03060	mov x9,#0x46
00c03064	mov w10,#0x69
00c03068	movk x9,#0x72, LSL #32
00c0306c	stp x9,x10,[x8]
00c03070	adrp x8,0xd27000
00c03074	ldrb w8,[x8, #0x690]
00c03078	tbnz w8,#0x0,0x00c03090
00c0307c	adrp x8,0xd27000
00c03080	add x8,x8,#0x690
00c03084	mov w9,#0x6
00c03088	strb w9,[x8], #0x4
00c0308c	b 0x00c030a4
00c03090	adrp x9,0xd27000
00c03094	add x9,x9,#0x698
00c03098	mov w10,#0x3
00c0309c	ldr x8,[x9, #0x8]
00c030a0	str x10,[x9]
00c030a4	mov x9,#0x53
00c030a8	mov w10,#0x74
00c030ac	movk x9,#0x61, LSL #32
00c030b0	stp x9,x10,[x8]
00c030b4	ldp x20,x19,[sp, #0x10]
00c030b8	ldp x29,x30,[sp], #0x20
00c030bc	autiasp
00c030c0	ret
00c030c4	adrp x0,0xd27000
00c030c8	add x0,x0,#0x6a8
00c030cc	bl 0x00c2fe90
00c030d0	cbz w0,0x00c02e48
00c030d4	adrp x0,0xc0b000
00c030d8	add x0,x0,#0x8d0
00c030dc	nop
00c030e0	adr x2,0xc48880
00c030e4	mov x1,xzr
00c030e8	bl 0x00c2fe70
00c030ec	adrp x0,0xd27000
00c030f0	add x0,x0,#0x6a8
00c030f4	bl 0x00c2fea0
00c030f8	b 0x00c02e48

; FUN_00b58f10 @ 00b58f10
00b58f10	sub sp,sp,#0x50
00b58f14	stp x24,x23,[sp, #0x10]
00b58f18	stp x22,x21,[sp, #0x20]
00b58f1c	stp x20,x19,[sp, #0x30]
00b58f20	stp x29,x30,[sp, #0x40]
00b58f24	str x0,[sp, #0x8]
00b58f28	ldr x8,[x0, #0x30]
00b58f2c	mov x19,x4
00b58f30	mov x20,x3
00b58f34	mov x23,x0
00b58f38	mov x22,x1
00b58f3c	add x29,sp,#0x40
00b58f40	cbz x8,0x00b58f9c
00b58f44	mov x24,x23
00b58f48	ldr x8,[x24, #0x60]!
00b58f4c	cbz x8,0x00b58fb8
00b58f50	add x1,sp,#0x4
00b58f54	mov x0,x23
00b58f58	mov w21,w5
00b58f5c	bl 0x00b59874
00b58f60	cbz w0,0x00b58fe4
00b58f64	ldr w2,[x23, #0x80]
00b58f68	ldr w8,[sp, #0x4]
00b58f6c	cmp w2,w8
00b58f70	b.ls 0x00b59004
00b58f74	bl 0x00c342a0
00b58f78	adrp x0,0x2be000
00b58f7c	adrp x2,0x2da000
00b58f80	add x0,x0,#0xab1
00b58f84	add x2,x2,#0xc68
00b58f88	mov w1,#0xdd
00b58f8c	bl 0x00c342b0
00b58f90	mov w0,#0x39
00b58f94	mov w1,#0xc2
00b58f98	b 0x00b58fdc
00b58f9c	ldr x0,[x23, #0x8]
00b58fa0	mov x1,x22
00b58fa4	mov x3,x20
00b58fa8	mov x4,x19
00b58fac	bl 0x00c410a0
00b58fb0	mov x19,x0
00b58fb4	b 0x00b58fe8
00b58fb8	bl 0x00c342a0
00b58fbc	adrp x0,0x2be000
00b58fc0	adrp x2,0x2da000
00b58fc4	add x0,x0,#0xab1
00b58fc8	add x2,x2,#0xc68
00b58fcc	mov w1,#0xd3
00b58fd0	bl 0x00c342b0
00b58fd4	mov w0,#0x39
00b58fd8	mov w1,#0xbb
00b58fdc	mov x2,xzr
00b58fe0	bl 0x00c342c0
00b58fe4	mov x19,xzr
00b58fe8	mov x0,x19
00b58fec	ldp x29,x30,[sp, #0x40]
00b58ff0	ldp x20,x19,[sp, #0x30]
00b58ff4	ldp x22,x21,[sp, #0x20]
00b58ff8	ldp x24,x23,[sp, #0x10]
00b58ffc	add sp,sp,#0x50
00b59000	ret
00b59004	ldr x0,[x23, #0x30]
00b59008	cbz x0,0x00b5902c
00b5900c	ldr x8,[x23, #0x40]
00b59010	cbz x8,0x00b5902c
00b59014	blr x8
00b59018	cbz w0,0x00b59070
00b5901c	ldr x8,[sp, #0x8]
00b59020	ldr x0,[x8, #0x30]
00b59024	ldr w2,[x8, #0x80]
00b59028	add x24,x8,#0x60
00b5902c	ldr x8,[x24]
00b59030	add x6,sp,#0x8
00b59034	mov w7,#0x8
00b59038	mov x1,x22
00b5903c	mov x3,x20
00b59040	mov x4,x19
00b59044	mov w5,w21
00b59048	blr x8
00b5904c	ldr x9,[sp, #0x8]
00b59050	mov x19,x0
00b59054	ldr x8,[x9, #0x30]
00b59058	cbz x8,0x00b58fe8
00b5905c	ldr x9,[x9, #0x48]
00b59060	cbz x9,0x00b58fe8
00b59064	mov x0,x8
00b59068	blr x9
00b5906c	b 0x00b58fe8
00b59070	bl 0x00c342a0
00b59074	adrp x0,0x2be000
00b59078	adrp x2,0x2be000
00b5907c	add x0,x0,#0xab1
00b59080	add x2,x2,#0xad8
00b59084	mov w1,#0x46
00b59088	bl 0x00c342b0
00b5908c	mov w0,#0x39
00b59090	mov w1,#0xb6
00b59094	b 0x00b58fdc

; o2i_SCT @ 00a12e4c
00a12e4c	sub sp,sp,#0x50
00a12e50	sub x8,x2,#0x1
00a12e54	orr w9,wzr,#0xffff
00a12e58	cmp x8,x9
00a12e5c	stp x24,x23,[sp, #0x10]
00a12e60	stp x22,x21,[sp, #0x20]
00a12e64	stp x20,x19,[sp, #0x30]
00a12e68	stp x29,x30,[sp, #0x40]
00a12e6c	add x29,sp,#0x40
00a12e70	b.cc 0x00a12ea8
00a12e74	bl 0x00c342a0
00a12e78	adrp x0,0x2d9000
00a12e7c	adrp x2,0x29f000
00a12e80	add x0,x0,#0xa3f
00a12e84	add x2,x2,#0xf9d
00a12e88	mov w1,#0x4c
00a12e8c	bl 0x00c342b0
00a12e90	mov w0,#0x32
00a12e94	mov w1,#0x68
00a12e98	mov x2,xzr
00a12e9c	bl 0x00c342c0
00a12ea0	mov x19,xzr
00a12ea4	b 0x00a1308c
00a12ea8	mov x22,x2
00a12eac	mov x21,x1
00a12eb0	mov x20,x0
00a12eb4	bl 0x00c397b0
00a12eb8	mov x19,x0
00a12ebc	cbz x0,0x00a1308c
00a12ec0	ldr x23,[x21]
00a12ec4	str x23,[sp, #0x8]
00a12ec8	ldrb w8,[x23]
00a12ecc	str w8,[x19]
00a12ed0	cbz w8,0x00a12f14
00a12ed4	adrp x2,0x2d9000
00a12ed8	add x2,x2,#0xa3f
00a12edc	mov w3,#0x87
00a12ee0	mov x0,x23
00a12ee4	mov x1,x22
00a12ee8	bl 0x00c345f0
00a12eec	str x0,[x19, #0x8]
00a12ef0	cbz x0,0x00a1308c
00a12ef4	add x8,x23,x22
00a12ef8	str x22,[x19, #0x10]
00a12efc	str x8,[x21]
00a12f00	cbz x20,0x00a13098
00a12f04	ldr x0,[x20]
00a12f08	bl 0x00c35930
00a12f0c	str x19,[x20]
00a12f10	b 0x00a13098
00a12f14	cmp x22,#0x2a
00a12f18	b.hi 0x00a12f38
00a12f1c	bl 0x00c342a0
00a12f20	adrp x0,0x2d9000
00a12f24	adrp x2,0x29f000
00a12f28	add x0,x0,#0xa3f
00a12f2c	add x2,x2,#0xf9d
00a12f30	mov w1,#0x63
00a12f34	b 0x00a13078
00a12f38	adrp x2,0x2d9000
00a12f3c	add x0,x23,#0x1
00a12f40	add x2,x2,#0xa3f
00a12f44	mov w1,#0x20
00a12f48	mov w3,#0x68
00a12f4c	str x0,[sp, #0x8]
00a12f50	bl 0x00c345f0
00a12f54	str x0,[x19, #0x18]
00a12f58	cbz x0,0x00a1308c
00a12f5c	mov w8,#0x20
00a12f60	str x8,[x19, #0x20]
00a12f64	ldrb w8,[x23, #0x21]
00a12f68	lsl x8,x8,#0x38
00a12f6c	str x8,[x19, #0x28]
00a12f70	ldrb w9,[x23, #0x22]
00a12f74	bfm x8,x9,#0x10,#0x7
00a12f78	str x8,[x19, #0x28]
00a12f7c	ldrb w9,[x23, #0x23]
00a12f80	bfm x8,x9,#0x18,#0x7
00a12f84	str x8,[x19, #0x28]
00a12f88	ldrb w9,[x23, #0x24]
00a12f8c	bfm x8,x9,#0x20,#0x7
00a12f90	str x8,[x19, #0x28]
00a12f94	ldrb w9,[x23, #0x25]
00a12f98	bfm x8,x9,#0x28,#0x7
00a12f9c	str x8,[x19, #0x28]
00a12fa0	ldrb w9,[x23, #0x26]
00a12fa4	bfm x8,x9,#0x30,#0x7
00a12fa8	str x8,[x19, #0x28]
00a12fac	ldrb w9,[x23, #0x27]
00a12fb0	bfm x8,x9,#0x38,#0x7
00a12fb4	str x8,[x19, #0x28]
00a12fb8	ldrb w9,[x23, #0x28]
00a12fbc	orr x8,x8,x9
00a12fc0	str x8,[x19, #0x28]
00a12fc4	ldrb w8,[x23, #0x29]
00a12fc8	ldrb w24,[x23, #0x2a]
00a12fcc	sub x9,x22,#0x2b
00a12fd0	add x23,x23,#0x2b
00a12fd4	str x23,[sp, #0x8]
00a12fd8	bfm x24,x8,#0x38,#0x7
00a12fdc	subs x22,x9,x24
00a12fe0	b.cs 0x00a13000
00a12fe4	bl 0x00c342a0
00a12fe8	adrp x0,0x2d9000
00a12fec	adrp x2,0x29f000
00a12ff0	add x0,x0,#0xa3f
00a12ff4	add x2,x2,#0xf9d
00a12ff8	mov w1,#0x72
00a12ffc	b 0x00a13078
00a13000	cbz x24,0x00a13024
00a13004	adrp x2,0x2d9000
00a13008	add x2,x2,#0xa3f
00a1300c	mov w3,#0x76
00a13010	mov x0,x23
00a13014	mov x1,x24
00a13018	bl 0x00c345f0
00a1301c	str x0,[x19, #0x30]
00a13020	cbz x0,0x00a1308c
00a13024	add x8,x23,x24
00a13028	add x1,sp,#0x8
00a1302c	mov x0,x19
00a13030	mov x2,x22
00a13034	str x24,[x19, #0x38]
00a13038	str x8,[sp, #0x8]
00a1303c	bl 0x00a12d0c
00a13040	cmp w0,#0x0
00a13044	b.le 0x00a13060
00a13048	ldr x8,[sp, #0x8]
00a1304c	sub x9,x22,w0, SXTW 
00a13050	add x8,x8,x9
00a13054	str x8,[x21]
00a13058	cbnz x20,0x00a12f04
00a1305c	b 0x00a13098
00a13060	bl 0x00c342a0
00a13064	adrp x0,0x2d9000
00a13068	adrp x2,0x29f000
00a1306c	add x0,x0,#0xa3f
00a13070	add x2,x2,#0xf9d
00a13074	mov w1,#0x80
00a13078	bl 0x00c342b0
00a1307c	mov w0,#0x32
00a13080	mov w1,#0x68
00a13084	mov x2,xzr
00a13088	bl 0x00c342c0
00a1308c	mov x0,x19
00a13090	bl 0x00c35930
00a13094	mov x19,xzr
00a13098	mov x0,x19
00a1309c	ldp x29,x30,[sp, #0x40]
00a130a0	ldp x20,x19,[sp, #0x30]
00a130a4	ldp x22,x21,[sp, #0x20]
00a130a8	ldp x24,x23,[sp, #0x10]
00a130ac	add sp,sp,#0x50
00a130b0	ret

; EC_POINTs_mul @ 00a31eac
00a31eac	str x25,[sp, #-0x50]!
00a31eb0	stp x24,x23,[sp, #0x10]
00a31eb4	stp x22,x21,[sp, #0x20]
00a31eb8	stp x20,x19,[sp, #0x30]
00a31ebc	stp x29,x30,[sp, #0x40]
00a31ec0	ldr x8,[x0]
00a31ec4	ldr x9,[x1]
00a31ec8	add x29,sp,#0x40
00a31ecc	cmp x8,x9
00a31ed0	b.eq 0x00a31f20
00a31ed4	bl 0x00c342a0
00a31ed8	adrp x0,0x29e000
00a31edc	adrp x2,0x2b7000
00a31ee0	add x0,x0,#0xa7
00a31ee4	add x2,x2,#0xac8
00a31ee8	mov w1,#0x436
00a31eec	bl 0x00c342b0
00a31ef0	mov w0,#0x10
00a31ef4	mov w1,#0x65
00a31ef8	mov x2,xzr
00a31efc	bl 0x00c342c0
00a31f00	mov w19,wzr
00a31f04	mov w0,w19
00a31f08	ldp x29,x30,[sp, #0x40]
00a31f0c	ldp x20,x19,[sp, #0x30]
00a31f10	ldp x22,x21,[sp, #0x20]
00a31f14	ldp x24,x23,[sp, #0x10]
00a31f18	ldr x25,[sp], #0x50
00a31f1c	ret
00a31f20	ldr w9,[x0, #0x20]
00a31f24	mov x19,x5
00a31f28	mov x20,x4
00a31f2c	mov x21,x3
00a31f30	mov x22,x1
00a31f34	mov x23,x0
00a31f38	mov x24,x2
00a31f3c	cbz w9,0x00a31f50
00a31f40	ldr w10,[x22, #0x8]
00a31f44	cbz w10,0x00a31f50
00a31f48	cmp w9,w10
00a31f4c	b.ne 0x00a31ed4
00a31f50	cbnz x24,0x00a31f78
00a31f54	cbnz x21,0x00a31f78
00a31f58	mov x0,x23
00a31f5c	mov x1,x22
00a31f60	ldp x29,x30,[sp, #0x40]
00a31f64	ldp x20,x19,[sp, #0x30]
00a31f68	ldp x22,x21,[sp, #0x20]
00a31f6c	ldp x24,x23,[sp, #0x10]
00a31f70	ldr x25,[sp], #0x50
00a31f74	b 0x00a31588
00a31f78	cbz x21,0x00a31fb0
00a31f7c	mov x10,xzr
00a31f80	ldr x11,[x20, x10, LSL #0x3]
00a31f84	ldr x12,[x11]
00a31f88	cmp x8,x12
00a31f8c	b.ne 0x00a31fe0
00a31f90	cbz w9,0x00a31fa4
00a31f94	ldr w11,[x11, #0x8]
00a31f98	cbz w11,0x00a31fa4
00a31f9c	cmp w9,w11
00a31fa0	b.ne 0x00a31fe0
00a31fa4	add x10,x10,#0x1
00a31fa8	cmp x10,x21
00a31fac	b.cc 0x00a31f80
00a31fb0	cbz x6,0x00a31ffc
00a31fb4	mov x25,xzr
00a31fb8	ldr x8,[x8, #0xe0]
00a31fbc	cbz x8,0x00a32018
00a31fc0	mov x0,x23
00a31fc4	mov x1,x22
00a31fc8	mov x2,x24
00a31fcc	mov x3,x21
00a31fd0	mov x4,x20
00a31fd4	mov x5,x19
00a31fd8	blr x8
00a31fdc	b 0x00a32034
00a31fe0	bl 0x00c342a0
00a31fe4	adrp x0,0x29e000
00a31fe8	adrp x2,0x2b7000
00a31fec	add x0,x0,#0xa7
00a31ff0	add x2,x2,#0xac8
00a31ff4	mov w1,#0x43f
00a31ff8	b 0x00a31eec
00a31ffc	bl 0x00c38a70
00a32000	cbz x0,0x00a32044
00a32004	ldr x8,[x23]
00a32008	mov x25,x0
00a3200c	mov x6,x0
00a32010	ldr x8,[x8, #0xe0]
00a32014	cbnz x8,0x00a31fc0
00a32018	mov x0,x23
00a3201c	mov x1,x22
00a32020	mov x2,x24
00a32024	mov x3,x21
00a32028	mov x4,x20
00a3202c	mov x5,x19
00a32030	bl 0x00c3af30
00a32034	mov w19,w0
00a32038	mov x0,x25
00a3203c	bl 0x00c38a30
00a32040	b 0x00a31f04
00a32044	bl 0x00c342a0
00a32048	adrp x0,0x29e000
00a3204c	adrp x2,0x2b7000
00a32050	add x0,x0,#0xa7
00a32054	add x2,x2,#0xac8
00a32058	mov w1,#0x449
00a3205c	bl 0x00c342b0
00a32060	mov w1,#0x103
00a32064	mov w0,#0x10
00a32068	movk w1,#0xc, LSL #16
00a3206c	b 0x00a31ef8

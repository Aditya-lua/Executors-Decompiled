; FUN_00af3e8c @ 00af3e8c
00af3e8c	stp x26,x25,[sp, #-0x50]!
00af3e90	stp x24,x23,[sp, #0x10]
00af3e94	mov x23,x0
00af3e98	mov x0,x4
00af3e9c	stp x22,x21,[sp, #0x20]
00af3ea0	stp x20,x19,[sp, #0x30]
00af3ea4	stp x29,x30,[sp, #0x40]
00af3ea8	add x29,sp,#0x40
00af3eac	mov x20,x4
00af3eb0	mov x19,x3
00af3eb4	mov x22,x2
00af3eb8	mov x21,x1
00af3ebc	bl 0x00c2ff50
00af3ec0	cmp x0,#0x9
00af3ec4	b.cc 0x00af3ee0
00af3ec8	adrp x1,0x2a0000
00af3ecc	add x1,x1,#0xc8d
00af3ed0	mov w2,#0x9
00af3ed4	mov x0,x20
00af3ed8	bl 0x00c31bb0
00af3edc	cbz w0,0x00af3fa0
00af3ee0	mov w24,wzr
00af3ee4	mov x0,x20
00af3ee8	bl 0x00c2ff50
00af3eec	cmp x0,#0x4
00af3ef0	b.cc 0x00af3f38
00af3ef4	adrp x1,0x2d6000
00af3ef8	mov x25,x0
00af3efc	add x1,x1,#0x64b
00af3f00	mov w2,#0x4
00af3f04	mov x0,x20
00af3f08	mov w26,#0x4
00af3f0c	bl 0x00c31bb0
00af3f10	cbz w0,0x00af3fbc
00af3f14	cmp x25,#0x5
00af3f18	b.cc 0x00af3f38
00af3f1c	adrp x1,0x2a2000
00af3f20	add x1,x1,#0xd63
00af3f24	mov w2,#0x5
00af3f28	mov x0,x20
00af3f2c	mov w26,#0x5
00af3f30	bl 0x00c31bb0
00af3f34	cbz w0,0x00af4004
00af3f38	mov x0,x19
00af3f3c	bl 0x00c36490
00af3f40	mov w2,w0
00af3f44	mov x0,x23
00af3f48	mov x1,x21
00af3f4c	mov w3,w24
00af3f50	mov x4,x20
00af3f54	bl 0x00af4350
00af3f58	cbnz x0,0x00af3fec
00af3f5c	bl 0x00c342a0
00af3f60	adrp x0,0x2aa000
00af3f64	adrp x2,0x2da000
00af3f68	add x0,x0,#0x9f7
00af3f6c	add x2,x2,#0x63f
00af3f70	cbz x22,0x00af3fc4
00af3f74	orr w1,wzr,#0x30
00af3f78	bl 0x00c342b0
00af3f7c	adrp x2,0x2ac000
00af3f80	add x2,x2,#0x2d
00af3f84	mov w0,#0x22
00af3f88	mov w1,#0x80
00af3f8c	mov x3,x22
00af3f90	mov x4,x19
00af3f94	mov x5,x20
00af3f98	bl 0x00c342c0
00af3f9c	b 0x00af3fe8
00af3fa0	add x20,x20,#0x8
00af3fa4	ldrb w0,[x20, #0x1]!
00af3fa8	mov w1,#0x8
00af3fac	bl 0x00c377c0
00af3fb0	cbnz w0,0x00af3fa4
00af3fb4	mov w24,#0x1
00af3fb8	b 0x00af3ee4
00af3fbc	mov w22,#0x1
00af3fc0	b 0x00af4008
00af3fc4	mov w1,#0x34
00af3fc8	bl 0x00c342b0
00af3fcc	adrp x2,0x2cb000
00af3fd0	add x2,x2,#0x74d
00af3fd4	mov w0,#0x22
00af3fd8	mov w1,#0x80
00af3fdc	mov x3,x19
00af3fe0	mov x4,x20
00af3fe4	bl 0x00c342c0
00af3fe8	mov x0,xzr
00af3fec	ldp x29,x30,[sp, #0x40]
00af3ff0	ldp x20,x19,[sp, #0x30]
00af3ff4	ldp x22,x21,[sp, #0x20]
00af3ff8	ldp x24,x23,[sp, #0x10]
00af3ffc	ldp x26,x25,[sp], #0x50
00af4000	ret
00af4004	mov w22,#0x2
00af4008	add x8,x20,x26
00af400c	sub x20,x8,#0x1
00af4010	ldrb w0,[x20, #0x1]!
00af4014	mov w1,#0x8
00af4018	bl 0x00c377c0
00af401c	cbnz w0,0x00af4010
00af4020	mov x0,x19
00af4024	mov x1,x20
00af4028	mov w2,w24
00af402c	mov w3,w22
00af4030	mov x4,x21
00af4034	ldp x29,x30,[sp, #0x40]
00af4038	ldp x20,x19,[sp, #0x30]
00af403c	ldp x22,x21,[sp, #0x20]
00af4040	ldp x24,x23,[sp, #0x10]
00af4044	ldp x26,x25,[sp], #0x50
00af4048	b 0x00af4190

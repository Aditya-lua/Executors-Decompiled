; FUN_00a49f0c @ 00a49f0c
00a49f0c	add w8,w2,#0x1
00a49f10	mov w11,#0x1be
00a49f14	ldrh w9,[x1]
00a49f18	mov w10,#0x1
00a49f1c	udiv w11,w11,w8
00a49f20	movi d0,#0xffffffff
00a49f24	lsl w12,w10,w8
00a49f28	add w14,w11,#0x2
00a49f2c	sub w13,w12,#0x1
00a49f30	add w8,w11,#0x1
00a49f34	str d0,[x0,w14, uxtw #3]
00a49f38	add x14,x0,#0x4
00a49f3c	cmp w10,#0x1b
00a49f40	b.hi 0x00a49f5c
00a49f44	lsr w15,w10,#0x2
00a49f48	ldr x15,[x1, w15, UXTW #0x3]
00a49f4c	ubfiz w16,w10,#0x4,#0x2
00a49f50	lsr x15,x15,x16
00a49f54	ubfiz x15,x15,#0x10,#0x10
00a49f58	add x9,x15,x9
00a49f5c	tst x9,#0xffff
00a49f60	b.eq 0x00a49fac
00a49f64	lsl w15,w10,#0x4
00a49f68	sub w15,w15,#0x10
00a49f6c	add x16,x14,w8, SXTW  #0x3
00a49f70	rbit w17,w9
00a49f74	clz w17,w17
00a49f78	lsr w18,w9,w17
00a49f7c	tst w18,w12
00a49f80	and w3,w18,w13
00a49f84	csel w18,wzr,w12,eq
00a49f88	sub w18,w3,w18
00a49f8c	add w2,w15,w17
00a49f90	lsl w17,w18,w17
00a49f94	sub x9,x9,w17, SXTW 
00a49f98	stp w2,w18,[x16, #-0x4]
00a49f9c	and x17,x9,#0xffff
00a49fa0	sub x16,x16,#0x8
00a49fa4	sub w8,w8,#0x1
00a49fa8	cbnz x17,0x00a49f70
00a49fac	add w10,w10,#0x1
00a49fb0	cmp w10,#0x1e
00a49fb4	lsr x9,x9,#0x10
00a49fb8	b.ne 0x00a49f3c
00a49fbc	mvn w9,w8
00a49fc0	add w9,w11,w9
00a49fc4	adds w9,w9,#0x3
00a49fc8	b.eq 0x00a4a080
00a49fcc	mov x10,xzr
00a49fd0	cmp w9,#0x4
00a49fd4	mov w9,w9
00a49fd8	b.cc 0x00a4a060
00a49fdc	sub x10,x9,#0x1
00a49fe0	add w11,w8,#0x1
00a49fe4	cmn w11,w10
00a49fe8	b.cs 0x00a4a05c
00a49fec	lsr x12,x10,#0x20
00a49ff0	mov x10,xzr
00a49ff4	cbnz x12,0x00a4a060
00a49ff8	add w10,w8,#0x1
00a49ffc	add x12,x9,x10
00a4a000	add x12,x0,x12, LSL #0x3
00a4a004	cmp x12,x0
00a4a008	b.ls 0x00a4a020
00a4a00c	add x12,x0,x9, LSL #0x3
00a4a010	add x10,x0,w10, UXTW  #0x3
00a4a014	cmp x10,x12
00a4a018	mov x10,xzr
00a4a01c	b.cc 0x00a4a060
00a4a020	mov x12,xzr
00a4a024	and x10,x9,#0xfffffffc
00a4a028	add x13,x0,#0x10
00a4a02c	mov w11,w11
00a4a030	add w14,w11,w12
00a4a034	add x14,x0,w14, UXTW  #0x3
00a4a038	ldp q0,q1,[x14]
00a4a03c	add x12,x12,#0x4
00a4a040	cmp x12,x10
00a4a044	stp q0,q1,[x13, #-0x10]
00a4a048	add x13,x13,#0x20
00a4a04c	b.ne 0x00a4a030
00a4a050	cmp x10,x9
00a4a054	b.ne 0x00a4a060
00a4a058	b 0x00a4a080
00a4a05c	mov x10,xzr
00a4a060	mov w8,w8
00a4a064	add w11,w8,w10
00a4a068	add w11,w11,#0x1
00a4a06c	ldr x11,[x0, w11, UXTW #0x3]
00a4a070	str x11,[x0, x10, LSL #0x3]
00a4a074	add x10,x10,#0x1
00a4a078	cmp x10,x9
00a4a07c	b.cc 0x00a4a064
00a4a080	ret

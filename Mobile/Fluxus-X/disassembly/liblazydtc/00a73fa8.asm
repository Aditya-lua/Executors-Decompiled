; FUN_00a73fa8 @ 00a73fa8
00a73fa8	stp x20,x19,[sp, #-0x20]!
00a73fac	stp x29,x30,[sp, #0x10]
00a73fb0	ldr x19,[x0, #0x88]
00a73fb4	add x29,sp,#0x10
00a73fb8	cbz x19,0x00a73ff8
00a73fbc	mov w2,w1
00a73fc0	mov w1,#0x2
00a73fc4	mov x20,x0
00a73fc8	bl 0x00a741fc
00a73fcc	cmn w0,#0x1
00a73fd0	b.ne 0x00a7406c
00a73fd4	ldr w8,[x19]
00a73fd8	cbz w8,0x00a7403c
00a73fdc	ldr x8,[x20, #0x78]
00a73fe0	ldr x1,[x8, #0xe8]
00a73fe4	cbz x1,0x00a7402c
00a73fe8	ldp x29,x30,[sp, #0x10]
00a73fec	mov x0,x19
00a73ff0	ldp x20,x19,[sp], #0x20
00a73ff4	br x1
00a73ff8	bl 0x00c342a0
00a73ffc	adrp x0,0x2a6000
00a74000	adrp x2,0x2cf000
00a74004	add x0,x0,#0x4f
00a74008	add x2,x2,#0xc22
00a7400c	mov w1,#0x35
00a74010	bl 0x00c342b0
00a74014	orr w0,wzr,#0x6
00a74018	mov w1,#0x9a
00a7401c	mov x2,xzr
00a74020	bl 0x00c342c0
00a74024	mov w0,wzr
00a74028	b 0x00a7406c
00a7402c	ldr x8,[x19, #0x8]
00a74030	cbz x8,0x00a7403c
00a74034	ldr x1,[x8, #0xe8]
00a74038	cbnz x1,0x00a73fe8
00a7403c	bl 0x00c342a0
00a74040	adrp x0,0x2a6000
00a74044	adrp x2,0x2cf000
00a74048	add x0,x0,#0x4f
00a7404c	add x2,x2,#0xc22
00a74050	mov w1,#0x4d
00a74054	bl 0x00c342b0
00a74058	orr w0,wzr,#0x6
00a7405c	mov w1,#0x96
00a74060	mov x2,xzr
00a74064	bl 0x00c342c0
00a74068	orr w0,wzr,#0xfffffffe
00a7406c	ldp x29,x30,[sp, #0x10]
00a74070	ldp x20,x19,[sp], #0x20
00a74074	ret

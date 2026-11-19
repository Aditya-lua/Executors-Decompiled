; RIPEMD160_Init @ 00acd6a8
00acd6a8	str x19,[sp, #-0x20]!
00acd6ac	mov x19,x0
00acd6b0	add x0,x0,#0x14
00acd6b4	mov w2,#0x4c
00acd6b8	mov w1,wzr
00acd6bc	stp x29,x30,[sp, #0x10]
00acd6c0	add x29,sp,#0x10
00acd6c4	bl 0x00c301c0
00acd6c8	adrp x8,0x29c000
00acd6cc	ldr q0,[x8, #0x2e0]
00acd6d0	mov w8,#0xe1f0
00acd6d4	movk w8,#0xc3d2, LSL #16
00acd6d8	str w8,[x19, #0x10]
00acd6dc	str q0,[x19]
00acd6e0	ldp x29,x30,[sp, #0x10]
00acd6e4	mov w0,#0x1
00acd6e8	ldr x19,[sp], #0x20
00acd6ec	ret

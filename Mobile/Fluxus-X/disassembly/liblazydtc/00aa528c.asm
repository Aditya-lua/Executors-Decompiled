; OSSL_SELF_TEST_onend @ 00aa528c
00aa528c	str x19,[sp, #-0x20]!
00aa5290	stp x29,x30,[sp, #0x10]
00aa5294	add x29,sp,#0x10
00aa5298	cbz x0,0x00aa52f0
00aa529c	ldr x8,[x0, #0x18]
00aa52a0	mov x19,x0
00aa52a4	cbz x8,0x00aa52f0
00aa52a8	adrp x8,0x2c3000
00aa52ac	adrp x9,0x2c9000
00aa52b0	add x8,x8,#0xd2a
00aa52b4	add x9,x9,#0xdcb
00aa52b8	cmp w1,#0x1
00aa52bc	csel x8,x9,x8,eq
00aa52c0	mov x0,x19
00aa52c4	str x8,[x19]
00aa52c8	bl 0x00aa513c
00aa52cc	ldr x8,[x19, #0x18]
00aa52d0	ldr x1,[x19, #0xc0]
00aa52d4	add x0,x19,#0x20
00aa52d8	blr x8
00aa52dc	adrp x8,0x2c9000
00aa52e0	add x8,x8,#0x34f
00aa52e4	dup v0.2D,x8
00aa52e8	str q0,[x19]
00aa52ec	str x8,[x19, #0x10]
00aa52f0	ldp x29,x30,[sp, #0x10]
00aa52f4	ldr x19,[sp], #0x20
00aa52f8	ret

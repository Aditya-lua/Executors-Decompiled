; FUN_00850864 @ 00850864
00850864	adrp x8,0xd1b000
00850868	adrp x9,0xc4a000
0085086c	add x9,x9,#0x508
00850870	ldr w8,[x8, #0x210]
00850874	str x9,[x0]
00850878	ldr x9,[sp]
0085087c	ldrb w10,[sp, #0x8]
00850880	str w8,[x0, #0x8]
00850884	adrp x8,0xc49000
00850888	add x8,x8,#0xb20
0085088c	ldr q0,[x1]
00850890	strb wzr,[x0, #0x1c]
00850894	str x8,[x0]
00850898	stur q0,[x0, #0xc]
0085089c	ldr q0,[x2]
008508a0	str q0,[x0, #0x20]
008508a4	ldr x8,[x3]
008508a8	str x8,[x0, #0x30]
008508ac	ldr q0,[x4]
008508b0	stur q0,[x0, #0x38]
008508b4	ldr q0,[x5]
008508b8	stur q0,[x0, #0x48]
008508bc	ldr q0,[x6]
008508c0	stur q0,[x0, #0x58]
008508c4	ldr q0,[x7]
008508c8	ldr x8,[x7, #0x10]
008508cc	stur q0,[x0, #0x68]
008508d0	str x8,[x0, #0x78]
008508d4	ldr x8,[sp, #0x10]
008508d8	ldr q0,[x9]
008508dc	strb w10,[x0, #0x90]
008508e0	str q0,[x0, #0x80]
008508e4	ldr q0,[x8]
008508e8	ldr x8,[sp, #0x18]
008508ec	stur q0,[x0, #0x94]
008508f0	str x8,[x0, #0xa8]
008508f4	ret

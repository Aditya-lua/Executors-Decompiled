; FUN_0085068c @ 0085068c
0085068c	adrp x8,0xd1b000
00850690	adrp x9,0xc4a000
00850694	add x9,x9,#0x508
00850698	ldr w8,[x8, #0x220]
0085069c	str x9,[x0]
008506a0	cmp w7,#0x0
008506a4	str w8,[x0, #0x8]
008506a8	adrp x8,0xc49000
008506ac	add x8,x8,#0xb58
008506b0	ldr q0,[x1]
008506b4	str x8,[x0]
008506b8	ldrb w8,[sp]
008506bc	strb wzr,[x0, #0x1c]
008506c0	strb w8,[x0, #0x44]
008506c4	csel x8,x2,x3,eq
008506c8	stur q0,[x0, #0xc]
008506cc	str x5,[x0, #0x30]
008506d0	str x6,[x0, #0x38]
008506d4	str w7,[x0, #0x40]
008506d8	stp x8,x4,[x0, #0x20]
008506dc	ret

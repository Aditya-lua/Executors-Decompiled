; BN_free @ 00a0189c
00a0189c	str x19,[sp, #-0x20]!
00a018a0	stp x29,x30,[sp, #0x10]
00a018a4	add x29,sp,#0x10
00a018a8	cbz x0,0x00a018d8
00a018ac	ldr w8,[x0, #0x14]
00a018b0	mov x19,x0
00a018b4	tbnz w8,#0x1,0x00a018d0
00a018b8	ldr x0,[x19]
00a018bc	tbnz w8,#0x3,0x00a018e4
00a018c0	adrp x1,0x2b5000
00a018c4	add x1,x1,#0xa6d
00a018c8	mov w2,#0xd1
00a018cc	bl 0x00c32310
00a018d0	ldrb w8,[x19, #0x14]
00a018d4	tbnz w8,#0x0,0x00a01904
00a018d8	ldp x29,x30,[sp, #0x10]
00a018dc	ldr x19,[sp], #0x20
00a018e0	ret
00a018e4	ldrsw x8,[x19, #0xc]
00a018e8	adrp x2,0x2b5000
00a018ec	add x2,x2,#0xa6d
00a018f0	mov w3,#0xcd
00a018f4	lsl x1,x8,#0x3
00a018f8	bl 0x00c38e10
00a018fc	ldrb w8,[x19, #0x14]
00a01900	tbz w8,#0x0,0x00a018d8
00a01904	ldp x29,x30,[sp, #0x10]
00a01908	adrp x1,0x2b5000
00a0190c	add x1,x1,#0xa6d
00a01910	mov w2,#0xe8
00a01914	mov x0,x19
00a01918	ldr x19,[sp], #0x20
00a0191c	b 0x00c32310

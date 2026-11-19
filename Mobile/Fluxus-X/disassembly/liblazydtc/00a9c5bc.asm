; WPACKET_get_curr @ 00a9c5bc
00a9c5bc	ldr x8,[x0, #0x8]
00a9c5c0	cbz x8,0x00a9c5ec
00a9c5c4	ldrb w9,[x0, #0x30]
00a9c5c8	tbnz w9,#0x0,0x00a9c5d8
00a9c5cc	ldr x9,[x0, #0x10]
00a9c5d0	add x0,x8,x9
00a9c5d4	ret
00a9c5d8	ldr x9,[x0, #0x20]
00a9c5dc	ldr x10,[x0, #0x10]
00a9c5e0	add x8,x8,x9
00a9c5e4	sub x0,x8,x10
00a9c5e8	ret
00a9c5ec	ldr x8,[x0]
00a9c5f0	cbz x8,0x00a9c604
00a9c5f4	ldr x8,[x8, #0x8]
00a9c5f8	cbnz x8,0x00a9c5c4
00a9c5fc	mov x0,xzr
00a9c600	ret
00a9c604	mov x0,xzr
00a9c608	ret

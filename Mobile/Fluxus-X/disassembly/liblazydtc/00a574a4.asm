; FUN_00a574a4 @ 00a574a4
00a574a4	stp x20,x19,[sp, #-0x20]!
00a574a8	stp x29,x30,[sp, #0x10]
00a574ac	ldr x8,[x0, #0x8]
00a574b0	add x29,sp,#0x10
00a574b4	cbz x8,0x00a57534
00a574b8	ldr x8,[x8, #0x40]
00a574bc	mov x19,x0
00a574c0	mov w20,w1
00a574c4	cbz x8,0x00a574e8
00a574c8	mov w1,#0x2
00a574cc	mov x0,x19
00a574d0	bl 0x00c3c1d0
00a574d4	cbnz w0,0x00a574e8
00a574d8	ldr x8,[x19, #0x8]
00a574dc	mov x0,x19
00a574e0	ldr x8,[x8, #0x40]
00a574e4	blr x8
00a574e8	ldr x8,[x19, #0x20]
00a574ec	cbz x8,0x00a57534
00a574f0	ldr x8,[x19, #0x8]
00a574f4	ldr w8,[x8, #0x4c]
00a574f8	cmp w8,#0x1
00a574fc	b.lt 0x00a57534
00a57500	mov w1,#0x4
00a57504	mov x0,x19
00a57508	bl 0x00c3c1d0
00a5750c	cbnz w20,0x00a57514
00a57510	cbnz w0,0x00a57534
00a57514	ldr x8,[x19, #0x8]
00a57518	ldr x0,[x19, #0x20]
00a5751c	adrp x2,0x2b7000
00a57520	add x2,x2,#0xc61
00a57524	ldrsw x1,[x8, #0x4c]
00a57528	mov w3,#0x25
00a5752c	bl 0x00c345e0
00a57530	str xzr,[x19, #0x20]
00a57534	ldp x29,x30,[sp, #0x10]
00a57538	ldp x20,x19,[sp], #0x20
00a5753c	ret

; FUN_00a9b18c @ 00a9b18c
00a9b18c	stp x29,x30,[sp, #-0x10]!
00a9b190	mov x29,sp
00a9b194	tbnz w1,#0x1f,0x00a9b208
00a9b198	adrp x8,0xd22000
00a9b19c	add x8,x8,#0x108
00a9b1a0	ldr x9,[x8, #0x28]
00a9b1a4	cmp x9,w1, SXTW 
00a9b1a8	b.le 0x00a9b208
00a9b1ac	ldp x9,x11,[x8, #0x10]
00a9b1b0	mov w10,w1
00a9b1b4	lsr x11,x11,x10
00a9b1b8	sub x9,x0,x9
00a9b1bc	sub x12,x11,#0x1
00a9b1c0	tst x12,x9
00a9b1c4	b.ne 0x00a9b238
00a9b1c8	mov w12,#0x1
00a9b1cc	lsl x10,x12,x10
00a9b1d0	udiv x9,x9,x11
00a9b1d4	adds x9,x9,x10
00a9b1d8	b.eq 0x00a9b220
00a9b1dc	ldr x8,[x8, #0x48]
00a9b1e0	cmp x9,x8
00a9b1e4	b.cs 0x00a9b220
00a9b1e8	lsr x8,x9,#0x3
00a9b1ec	ldrb w8,[x2, x8]
00a9b1f0	and x9,x9,#0x7
00a9b1f4	mov w10,#0x1
00a9b1f8	lsl w9,w10,w9
00a9b1fc	and w0,w9,w8
00a9b200	ldp x29,x30,[sp], #0x10
00a9b204	ret
00a9b208	adrp x0,0x2a0000
00a9b20c	adrp x1,0x2d6000
00a9b210	add x0,x0,#0x625
00a9b214	add x1,x1,#0xc
00a9b218	mov w2,#0x157
00a9b21c	bl 0x00c3c240
00a9b220	adrp x0,0x2d1000
00a9b224	adrp x1,0x2d6000
00a9b228	add x0,x0,#0xd40
00a9b22c	add x1,x1,#0xc
00a9b230	mov w2,#0x15a
00a9b234	bl 0x00c3c240
00a9b238	adrp x0,0x2a8000
00a9b23c	adrp x1,0x2d6000
00a9b240	add x0,x0,#0x368
00a9b244	add x1,x1,#0xc
00a9b248	mov w2,#0x158
00a9b24c	bl 0x00c3c240

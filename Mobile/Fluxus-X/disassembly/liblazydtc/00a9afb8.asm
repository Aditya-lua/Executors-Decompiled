; FUN_00a9afb8 @ 00a9afb8
00a9afb8	stp x29,x30,[sp, #-0x10]!
00a9afbc	mov x29,sp
00a9afc0	tbnz w1,#0x1f,0x00a9b040
00a9afc4	adrp x8,0xd22000
00a9afc8	add x8,x8,#0x108
00a9afcc	ldr x9,[x8, #0x28]
00a9afd0	cmp x9,w1, SXTW 
00a9afd4	b.le 0x00a9b040
00a9afd8	ldp x9,x11,[x8, #0x10]
00a9afdc	mov w10,w1
00a9afe0	lsr x11,x11,x10
00a9afe4	sub x9,x0,x9
00a9afe8	sub x12,x11,#0x1
00a9afec	tst x12,x9
00a9aff0	b.ne 0x00a9b070
00a9aff4	mov w12,#0x1
00a9aff8	lsl x10,x12,x10
00a9affc	udiv x9,x9,x11
00a9b000	adds x10,x9,x10
00a9b004	b.eq 0x00a9b058
00a9b008	ldr x8,[x8, #0x48]
00a9b00c	cmp x10,x8
00a9b010	b.cs 0x00a9b058
00a9b014	lsr x8,x10,#0x3
00a9b018	ldrb w9,[x2, x8]
00a9b01c	and x10,x10,#0x7
00a9b020	mov w11,#0x1
00a9b024	lsl x10,x11,x10
00a9b028	tst x10,x9
00a9b02c	b.ne 0x00a9b088
00a9b030	orr w9,w9,w10
00a9b034	strb w9,[x2, x8]
00a9b038	ldp x29,x30,[sp], #0x10
00a9b03c	ret
00a9b040	adrp x0,0x2a0000
00a9b044	adrp x1,0x2d6000
00a9b048	add x0,x0,#0x625
00a9b04c	add x1,x1,#0xc
00a9b050	mov w2,#0x16e
00a9b054	bl 0x00c3c240
00a9b058	adrp x0,0x2d1000
00a9b05c	adrp x1,0x2d6000
00a9b060	add x0,x0,#0xd40
00a9b064	add x1,x1,#0xc
00a9b068	mov w2,#0x171
00a9b06c	bl 0x00c3c240
00a9b070	adrp x0,0x2a8000
00a9b074	adrp x1,0x2d6000
00a9b078	add x0,x0,#0x368
00a9b07c	add x1,x1,#0xc
00a9b080	mov w2,#0x16f
00a9b084	bl 0x00c3c240
00a9b088	adrp x0,0x2d1000
00a9b08c	adrp x1,0x2d6000
00a9b090	add x0,x0,#0xd74
00a9b094	add x1,x1,#0xc
00a9b098	mov w2,#0x172
00a9b09c	bl 0x00c3c240

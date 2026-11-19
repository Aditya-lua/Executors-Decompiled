; _INIT_5 @ 007fbe84
007fbe84	stp x29,x30,[sp, #-0x10]!
007fbe88	mov x29,sp
007fbe8c	adrp x8,0xcca000
007fbe90	add x8,x8,#0x890
007fbe94	ldarb w8,[x8]
007fbe98	tbnz w8,#0x0,0x007fbf24
007fbe9c	adrp x0,0xcca000
007fbea0	add x0,x0,#0x890
007fbea4	bl 0x00c2fe90
007fbea8	cbz w0,0x007fbf24
007fbeac	adrp x8,0xcca000
007fbeb0	add x8,x8,#0x9a0
007fbeb4	ldarb w9,[x8]
007fbeb8	adrp x8,0xcca000
007fbebc	add x8,x8,#0x998
007fbec0	tbz w9,#0x0,0x007fbf2c
007fbec4	adrp x9,0xcca000
007fbec8	ldrb w9,[x9, #0x99e]
007fbecc	cmp w9,#0x1
007fbed0	b.ne 0x007fbf0c
007fbed4	ldr s0,[x8]
007fbed8	adrp x9,0x29b000
007fbedc	ldrb w10,[x8, #0x5]
007fbee0	ldr d1,[x9, #0xba0]
007fbee4	ldrb w9,[x8, #0x4]
007fbee8	strb wzr,[x8, #0x6]
007fbeec	uxtl v0.8H,v0.8B
007fbef0	eor w10,w10,#0x3
007fbef4	eor w9,w9,#0xffffffbf
007fbef8	strb w10,[x8, #0x5]
007fbefc	strb w9,[x8, #0x4]
007fbf00	eor v0.8B,v0.8B,v1.8B
007fbf04	uzp1 v0.8B,v0.8B,v0.8B
007fbf08	str s0,[x8]
007fbf0c	adrp x9,0xcca000
007fbf10	adrp x0,0xcca000
007fbf14	add x0,x0,#0x890
007fbf18	str x8,[x9, #0x888]
007fbf1c	ldp x29,x30,[sp], #0x10
007fbf20	b 0x00c2fea0
007fbf24	ldp x29,x30,[sp], #0x10
007fbf28	ret
007fbf2c	adrp x0,0xcca000
007fbf30	add x0,x0,#0x9a0
007fbf34	bl 0x00c2fe90
007fbf38	adrp x8,0xcca000
007fbf3c	add x8,x8,#0x998
007fbf40	cbz w0,0x007fbec4
007fbf44	adrp x9,0x29a000
007fbf48	mov w10,#0x1
007fbf4c	nop
007fbf50	adr x0,0x7fdd48
007fbf54	ldr d0,[x9, #0xc50]
007fbf58	mov w9,#0x38f
007fbf5c	adrp x2,0xc48000
007fbf60	add x2,x2,#0x880
007fbf64	adrp x1,0xcca000
007fbf68	add x1,x1,#0x998
007fbf6c	strb w10,[x8, #0x6]
007fbf70	str s0,[x8]
007fbf74	strh w9,[x8, #0x4]
007fbf78	bl 0x00c2fe70
007fbf7c	adrp x0,0xcca000
007fbf80	add x0,x0,#0x9a0
007fbf84	bl 0x00c2fea0
007fbf88	adrp x8,0xcca000
007fbf8c	add x8,x8,#0x998
007fbf90	b 0x007fbec4

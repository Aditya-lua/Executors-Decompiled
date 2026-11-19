; FUN_00ac70bc @ 00ac70bc
00ac70bc	str x25,[sp, #-0x50]!
00ac70c0	stp x24,x23,[sp, #0x10]
00ac70c4	stp x22,x21,[sp, #0x20]
00ac70c8	stp x20,x19,[sp, #0x30]
00ac70cc	stp x29,x30,[sp, #0x40]
00ac70d0	ldr x8,[x0]
00ac70d4	mov x23,#0x2f
00ac70d8	orr x24,xzr,#0x6666666666666666
00ac70dc	mov x20,x1
00ac70e0	mov x19,x0
00ac70e4	mov x21,xzr
00ac70e8	movk x23,#0x8000, LSL #48
00ac70ec	movk x24,#0x6667
00ac70f0	sub x22,x8,#0x1
00ac70f4	mov w25,#0xa
00ac70f8	add x29,sp,#0x40
00ac70fc	ldrb w0,[x22, #0x1]
00ac7100	bl 0x00c37770
00ac7104	cbz w0,0x00ac7174
00ac7108	ldrb w8,[x22, #0x1]
00ac710c	sub x9,x23,x8
00ac7110	smulh x9,x9,x24
00ac7114	asr x10,x9,#0x2
00ac7118	add x9,x10,x9, LSR #0x3f
00ac711c	cmp x21,x9
00ac7120	b.gt 0x00ac71a8
00ac7124	ldrb w0,[x22, #0x2]
00ac7128	nop
00ac712c	madd x8,x21,x25,x8
00ac7130	sub x21,x8,#0x30
00ac7134	bl 0x00c37770
00ac7138	add x22,x22,#0x1
00ac713c	cbnz w0,0x00ac70fc
00ac7140	ldrb w0,[x22, #0x1]
00ac7144	mov w1,#0x8
00ac7148	bl 0x00c377c0
00ac714c	cbz w0,0x00ac71f8
00ac7150	ldrb w0,[x22, #0x1]!
00ac7154	mov w1,#0x8
00ac7158	bl 0x00c377c0
00ac715c	cbnz w0,0x00ac7150
00ac7160	mov w0,#0x1
00ac7164	str x22,[x19]
00ac7168	str w0,[x20, #0x4]
00ac716c	str x21,[x20, #0x10]
00ac7170	b 0x00ac71e0
00ac7174	bl 0x00c342a0
00ac7178	adrp x0,0x2d8000
00ac717c	adrp x2,0x2d4000
00ac7180	add x0,x0,#0x6ba
00ac7184	add x2,x2,#0x3c0
00ac7188	mov w1,#0x67
00ac718c	bl 0x00c342b0
00ac7190	ldr x3,[x19]
00ac7194	adrp x2,0x2b7000
00ac7198	add x2,x2,#0x91b
00ac719c	mov w0,#0x37
00ac71a0	mov w1,#0x69
00ac71a4	b 0x00ac71d8
00ac71a8	bl 0x00c342a0
00ac71ac	adrp x0,0x2d8000
00ac71b0	adrp x2,0x2d4000
00ac71b4	add x0,x0,#0x6ba
00ac71b8	add x2,x2,#0x3c0
00ac71bc	mov w1,#0x6d
00ac71c0	bl 0x00c342b0
00ac71c4	ldr x3,[x19]
00ac71c8	adrp x2,0x2a6000
00ac71cc	add x2,x2,#0x701
00ac71d0	mov w0,#0x37
00ac71d4	mov w1,#0x6c
00ac71d8	bl 0x00c342c0
00ac71dc	mov w0,wzr
00ac71e0	ldp x29,x30,[sp, #0x40]
00ac71e4	ldp x20,x19,[sp, #0x30]
00ac71e8	ldp x22,x21,[sp, #0x20]
00ac71ec	ldp x24,x23,[sp, #0x10]
00ac71f0	ldr x25,[sp], #0x50
00ac71f4	ret
00ac71f8	ldrb w8,[x22, #0x1]
00ac71fc	cbz w8,0x00ac7150
00ac7200	cmp w8,#0x2c
00ac7204	b.eq 0x00ac7150
00ac7208	bl 0x00c342a0
00ac720c	adrp x0,0x2d8000
00ac7210	adrp x2,0x2d4000
00ac7214	add x0,x0,#0x6ba
00ac7218	add x2,x2,#0x3c0
00ac721c	mov w1,#0x74
00ac7220	b 0x00ac718c

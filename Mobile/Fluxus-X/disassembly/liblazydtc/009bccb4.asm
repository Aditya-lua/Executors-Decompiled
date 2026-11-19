; FUN_009bccb4 @ 009bccb4
009bccb4	str x27,[sp, #-0x60]!
009bccb8	add x8,x0,#0x898
009bccbc	add x9,x1,#0x158
009bccc0	cmp x0,#0x0
009bccc4	stp x26,x25,[sp, #0x10]
009bccc8	stp x24,x23,[sp, #0x20]
009bcccc	stp x22,x21,[sp, #0x30]
009bccd0	stp x20,x19,[sp, #0x40]
009bccd4	stp x29,x30,[sp, #0x50]
009bccd8	csel x8,x9,x8,eq
009bccdc	ldr x27,[x8]
009bcce0	mov x21,x4
009bcce4	mov x23,x3
009bcce8	mov w4,#0x1
009bccec	mov w3,wzr
009bccf0	add x29,sp,#0x50
009bccf4	mov w22,w5
009bccf8	mov x19,x1
009bccfc	mov x24,x0
009bcd00	mov x20,x2
009bcd04	bl 0x00c351a0
009bcd08	cmp w0,#0x1
009bcd0c	b.ne 0x009bcdc0
009bcd10	mov x0,x21
009bcd14	bl 0x00c325e0
009bcd18	cmp w0,#0x1
009bcd1c	b.lt 0x009bcd64
009bcd20	mov w25,wzr
009bcd24	mov x0,x21
009bcd28	mov w1,w25
009bcd2c	bl 0x00c32610
009bcd30	mov x2,x0
009bcd34	mov x0,x24
009bcd38	mov x1,x19
009bcd3c	mov w3,wzr
009bcd40	mov w4,wzr
009bcd44	bl 0x00c351a0
009bcd48	cmp w0,#0x1
009bcd4c	b.ne 0x009bcdec
009bcd50	mov x0,x21
009bcd54	add w25,w25,#0x1
009bcd58	bl 0x00c325e0
009bcd5c	cmp w25,w0
009bcd60	b.lt 0x009bcd24
009bcd64	mov x0,x20
009bcd68	bl 0x00c32d00
009bcd6c	mov x19,x0
009bcd70	cbz x0,0x009bd024
009bcd74	mov x24,x19
009bcd78	cbz x23,0x009bce80
009bcd7c	mov x0,x23
009bcd80	bl 0x00c35f80
009bcd84	mov w24,w0
009bcd88	mov x0,x19
009bcd8c	bl 0x00c35f80
009bcd90	cbz w24,0x009bce28
009bcd94	cbz w0,0x009bce58
009bcd98	bl 0x00c342a0
009bcd9c	adrp x0,0x2db000
009bcda0	adrp x2,0x29d000
009bcda4	add x0,x0,#0xaec
009bcda8	add x2,x2,#0xd84
009bcdac	mov w1,#0x3be
009bcdb0	bl 0x00c342b0
009bcdb4	mov w0,#0x14
009bcdb8	mov w1,#0x122
009bcdbc	b 0x009bd01c
009bcdc0	mov w25,w0
009bcdc4	bl 0x00c342a0
009bcdc8	adrp x0,0x2db000
009bcdcc	adrp x2,0x29d000
009bcdd0	add x0,x0,#0xaec
009bcdd4	add x2,x2,#0xd84
009bcdd8	mov w1,#0x3a9
009bcddc	bl 0x00c342b0
009bcde0	mov w0,#0x14
009bcde4	mov w1,w25
009bcde8	b 0x009bce14
009bcdec	mov w26,w0
009bcdf0	bl 0x00c342a0
009bcdf4	adrp x0,0x2db000
009bcdf8	adrp x2,0x29d000
009bcdfc	add x0,x0,#0xaec
009bce00	add x2,x2,#0xd84
009bce04	mov w1,#0x3af
009bce08	bl 0x00c342b0
009bce0c	mov w0,#0x14
009bce10	mov w1,w26
009bce14	mov x2,xzr
009bce18	bl 0x00c342c0
009bce1c	mov w20,wzr
009bce20	mov x19,xzr
009bce24	b 0x009bd028
009bce28	cbz w0,0x009bce68
009bce2c	mov x0,x19
009bce30	mov x1,x23
009bce34	bl 0x00c32440
009bce38	cbnz w0,0x009bce68
009bce3c	bl 0x00c342a0
009bce40	adrp x0,0x2db000
009bce44	adrp x2,0x29d000
009bce48	add x0,x0,#0xaec
009bce4c	add x2,x2,#0xd84
009bce50	mov w1,#0x3ca
009bce54	b 0x009bcfe4
009bce58	mov x0,x23
009bce5c	mov x1,x19
009bce60	bl 0x00c32440
009bce64	cbz w0,0x009bcfcc
009bce68	mov x0,x19
009bce6c	mov x1,x23
009bce70	bl 0x00c35f70
009bce74	cmp w0,#0x1
009bce78	mov x24,x23
009bce7c	b.ne 0x009bcf48
009bce80	add x1,sp,#0x8
009bce84	mov x0,x19
009bce88	bl 0x00c35150
009bce8c	cbz x0,0x009bcf20
009bce90	cbz w22,0x009bcf70
009bce94	cbz x21,0x009bcea8
009bce98	mov x0,x21
009bce9c	bl 0x00c35070
009bcea0	mov x21,x0
009bcea4	cbz x0,0x009bcff4
009bcea8	ldr x8,[sp, #0x8]
009bceac	mov w22,#0x28
009bceb0	add x23,x27,#0x20
009bceb4	adrp x1,0xcb4000
009bceb8	madd x8,x8,x22,x23
009bcebc	ldr x0,[x8, #0x10]
009bcec0	ldr x1,[x1, #0xd88]
009bcec4	bl 0x00c32600
009bcec8	ldr x8,[sp, #0x8]
009bcecc	nop
009bced0	madd x8,x8,x22,x23
009bced4	ldr x0,[x8]
009bced8	str x21,[x8, #0x10]
009bcedc	bl 0x00c31a90
009bcee0	mov x0,x20
009bcee4	bl 0x00c350b0
009bcee8	ldr x8,[sp, #0x8]
009bceec	nop
009bcef0	madd x8,x8,x22,x23
009bcef4	ldr x0,[x8, #0x8]
009bcef8	str x20,[x8]
009bcefc	bl 0x00c32450
009bcf00	mov x0,x24
009bcf04	bl 0x00c34730
009bcf08	ldr x8,[sp, #0x8]
009bcf0c	mov w20,#0x1
009bcf10	madd x8,x8,x22,x23
009bcf14	str x24,[x8, #0x8]
009bcf18	str x8,[x27]
009bcf1c	b 0x009bd028
009bcf20	bl 0x00c342a0
009bcf24	adrp x0,0x2db000
009bcf28	adrp x2,0x29d000
009bcf2c	add x0,x0,#0xaec
009bcf30	add x2,x2,#0xd84
009bcf34	mov w1,#0x3d6
009bcf38	bl 0x00c342b0
009bcf3c	mov w0,#0x14
009bcf40	mov w1,#0xf7
009bcf44	b 0x009bd01c
009bcf48	bl 0x00c342a0
009bcf4c	adrp x0,0x2db000
009bcf50	adrp x2,0x29d000
009bcf54	add x0,x0,#0xaec
009bcf58	add x2,x2,#0xd84
009bcf5c	mov w1,#0x3d1
009bcf60	bl 0x00c342b0
009bcf64	mov w0,#0x14
009bcf68	mov w1,#0x120
009bcf6c	b 0x009bd01c
009bcf70	ldr x8,[sp, #0x8]
009bcf74	mov w9,#0x28
009bcf78	madd x9,x8,x9,x27
009bcf7c	ldr x9,[x9, #0x20]
009bcf80	cbnz x9,0x009bcfa4
009bcf84	mov w9,#0x28
009bcf88	madd x9,x8,x9,x27
009bcf8c	ldr x9,[x9, #0x28]
009bcf90	cbnz x9,0x009bcfa4
009bcf94	mov w9,#0x28
009bcf98	madd x8,x8,x9,x27
009bcf9c	ldr x8,[x8, #0x30]
009bcfa0	cbz x8,0x009bce94
009bcfa4	bl 0x00c342a0
009bcfa8	adrp x0,0x2db000
009bcfac	adrp x2,0x29d000
009bcfb0	add x0,x0,#0xaec
009bcfb4	add x2,x2,#0xd84
009bcfb8	mov w1,#0x3de
009bcfbc	bl 0x00c342b0
009bcfc0	mov w0,#0x14
009bcfc4	mov w1,#0x121
009bcfc8	b 0x009bd01c
009bcfcc	bl 0x00c342a0
009bcfd0	adrp x0,0x2db000
009bcfd4	adrp x2,0x29d000
009bcfd8	add x0,x0,#0xaec
009bcfdc	add x2,x2,#0xd84
009bcfe0	mov w1,#0x3c3
009bcfe4	bl 0x00c342b0
009bcfe8	mov w0,#0x14
009bcfec	mov w1,#0x128
009bcff0	b 0x009bd01c
009bcff4	bl 0x00c342a0
009bcff8	adrp x0,0x2db000
009bcffc	adrp x2,0x29d000
009bd000	add x0,x0,#0xaec
009bd004	add x2,x2,#0xd84
009bd008	mov w1,#0x3e5
009bd00c	bl 0x00c342b0
009bd010	mov w1,#0x100
009bd014	mov w0,#0x14
009bd018	movk w1,#0xc, LSL #16
009bd01c	mov x2,xzr
009bd020	bl 0x00c342c0
009bd024	mov w20,wzr
009bd028	mov x0,x19
009bd02c	bl 0x00c32450
009bd030	mov w0,w20
009bd034	ldp x29,x30,[sp, #0x50]
009bd038	ldp x20,x19,[sp, #0x40]
009bd03c	ldp x22,x21,[sp, #0x30]
009bd040	ldp x24,x23,[sp, #0x20]
009bd044	ldp x26,x25,[sp, #0x10]
009bd048	ldr x27,[sp], #0x60
009bd04c	ret

; FUN_00abbc20 @ 00abbc20
00abbc20	sub sp,sp,#0x190
00abbc24	stp x28,x27,[sp, #0x130]
00abbc28	stp x26,x25,[sp, #0x140]
00abbc2c	stp x24,x23,[sp, #0x150]
00abbc30	stp x22,x21,[sp, #0x160]
00abbc34	stp x20,x19,[sp, #0x170]
00abbc38	stp x29,x30,[sp, #0x180]
00abbc3c	ldr x8,[x0, #0x10]
00abbc40	mov x22,x0
00abbc44	add x29,sp,#0x180
00abbc48	mov x20,x4
00abbc4c	ldr x0,[x8, #0x18]
00abbc50	mov x21,x3
00abbc54	mov w23,w2
00abbc58	mov x24,x1
00abbc5c	bl 0x00c37750
00abbc60	cmp w0,#0x15
00abbc64	b.ne 0x00abbc98
00abbc68	ldr x8,[x22, #0x10]
00abbc6c	ldr x8,[x8, #0x20]
00abbc70	cbz x8,0x00abbcc0
00abbc74	ldr x8,[x22, #0x8]
00abbc78	ldp x9,x0,[x8, #0x8]
00abbc7c	ldr x27,[x9, #0x8]
00abbc80	ldr w26,[x9]
00abbc84	cbz x0,0x00abbd14
00abbc88	bl 0x00c37580
00abbc8c	ldr x8,[x22, #0x8]
00abbc90	mov x25,x0
00abbc94	b 0x00abbd18
00abbc98	bl 0x00c342a0
00abbc9c	adrp x0,0x2ca000
00abbca0	adrp x2,0x2b8000
00abbca4	add x0,x0,#0x250
00abbca8	add x2,x2,#0x51c
00abbcac	mov w1,#0x61
00abbcb0	bl 0x00c342b0
00abbcb4	mov w0,#0x23
00abbcb8	mov w1,#0x79
00abbcbc	b 0x00abbce4
00abbcc0	bl 0x00c342a0
00abbcc4	adrp x0,0x2ca000
00abbcc8	adrp x2,0x2b8000
00abbccc	add x0,x0,#0x250
00abbcd0	add x2,x2,#0x51c
00abbcd4	mov w1,#0x66
00abbcd8	bl 0x00c342b0
00abbcdc	mov w0,#0x23
00abbce0	mov w1,#0x65
00abbce4	mov x2,xzr
00abbce8	bl 0x00c342c0
00abbcec	mov w20,wzr
00abbcf0	mov w0,w20
00abbcf4	ldp x29,x30,[sp, #0x180]
00abbcf8	ldp x20,x19,[sp, #0x170]
00abbcfc	ldp x22,x21,[sp, #0x160]
00abbd00	ldp x24,x23,[sp, #0x150]
00abbd04	ldp x26,x25,[sp, #0x140]
00abbd08	ldp x28,x27,[sp, #0x130]
00abbd0c	add sp,sp,#0x190
00abbd10	ret
00abbd14	mov w25,#0x1
00abbd18	ldr x0,[x8]
00abbd1c	add x1,sp,#0x28
00abbd20	mov x2,xzr
00abbd24	bl 0x00c38300
00abbd28	ldr x3,[sp, #0x28]
00abbd2c	add x0,sp,#0x20
00abbd30	mov x1,xzr
00abbd34	mov x2,xzr
00abbd38	bl 0x00c32b50
00abbd3c	ldr x2,[sp, #0x20]
00abbd40	add x0,sp,#0x30
00abbd44	mov w1,#0x50
00abbd48	mov w3,wzr
00abbd4c	bl 0x00c32500
00abbd50	tbnz w0,#0x1f,0x00abbcec
00abbd54	bl 0x00c35250
00abbd58	ldr x8,[x22, #0x10]
00abbd5c	add x1,sp,#0x30
00abbd60	ldp x0,x2,[x8, #0x28]
00abbd64	bl 0x00c357f0
00abbd68	mov x19,x0
00abbd6c	mov x28,x0
00abbd70	cbnz x0,0x00abbd8c
00abbd74	ldr x0,[sp, #0x20]
00abbd78	bl 0x00c37750
00abbd7c	bl 0x00c324f0
00abbd80	bl 0x00c35310
00abbd84	mov x28,x0
00abbd88	cbz x0,0x00abbee8
00abbd8c	str x19,[sp, #0x18]
00abbd90	mov x19,x25
00abbd94	bl 0x00c35240
00abbd98	mov x0,x28
00abbd9c	bl 0x00c34c20
00abbda0	mov w25,w0
00abbda4	mov x0,x28
00abbda8	bl 0x00c34c30
00abbdac	tbnz w25,#0x1f,0x00abbf40
00abbdb0	sub w8,w0,#0x3d6
00abbdb4	cmp w8,#0x2
00abbdb8	b.cc 0x00abbdc4
00abbdbc	cmp w0,#0x329
00abbdc0	b.ne 0x00abbdd4
00abbdc4	adrp x0,0x2a2000
00abbdc8	add x0,x0,#0xb94
00abbdcc	bl 0x00c395b0
00abbdd0	cbz x0,0x00abbe40
00abbdd4	ldr x8,[x22, #0x10]
00abbdd8	orr w4,wzr,#0x3
00abbddc	add x7,sp,#0x80
00abbde0	mov x0,x24
00abbde4	ldp x9,x8,[x8, #0x28]
00abbde8	mov w1,w23
00abbdec	mov x2,x27
00abbdf0	mov w3,w26
00abbdf4	mov w5,w19
00abbdf8	mov w6,w25
00abbdfc	stp x9,x8,[sp, #0x8]
00abbe00	str x28,[sp]
00abbe04	bl 0x00c3f470
00abbe08	ldr x19,[sp, #0x18]
00abbe0c	cbnz w0,0x00abbe88
00abbe10	bl 0x00c342a0
00abbe14	adrp x0,0x2ca000
00abbe18	adrp x2,0x2b8000
00abbe1c	add x0,x0,#0x250
00abbe20	add x2,x2,#0x51c
00abbe24	mov w1,#0x9d
00abbe28	bl 0x00c342b0
00abbe2c	mov w0,#0x23
00abbe30	mov w1,#0x6b
00abbe34	mov x2,xzr
00abbe38	bl 0x00c342c0
00abbe3c	b 0x00abbf44
00abbe40	orr w6,wzr,#0x60
00abbe44	sub x7,x29,#0xb8
00abbe48	mov x0,x24
00abbe4c	mov w1,w23
00abbe50	mov x2,x27
00abbe54	mov w3,w26
00abbe58	mov w4,w19
00abbe5c	mov x5,x28
00abbe60	bl 0x00c3d8b0
00abbe64	cbz w0,0x00abbf14
00abbe68	ldur q0,[x29, #-0x68]
00abbe6c	ldur q1,[x29, #-0x78]
00abbe70	sub x0,x29,#0xb8
00abbe74	orr w1,wzr,#0x60
00abbe78	stp q1,q0,[sp, #0x80]
00abbe7c	bl 0x00c34750
00abbe80	ldr x19,[sp, #0x18]
00abbe84	mov w25,#0x20
00abbe88	bl 0x00c36910
00abbe8c	mov x23,x0
00abbe90	cbz x0,0x00abbf48
00abbe94	add x1,sp,#0x80
00abbe98	mov x0,x23
00abbe9c	mov w2,w25
00abbea0	mov x3,x28
00abbea4	mov x4,xzr
00abbea8	bl 0x00c36930
00abbeac	cbz w0,0x00abbf48
00abbeb0	ldr x8,[x22, #0x10]
00abbeb4	mov x0,x23
00abbeb8	ldr x8,[x8, #0x20]
00abbebc	ldr x1,[x8, #0x8]
00abbec0	ldrsw x2,[x8]
00abbec4	bl 0x00c36940
00abbec8	cbz w0,0x00abbf48
00abbecc	mov x0,x23
00abbed0	mov x1,x21
00abbed4	mov x2,x20
00abbed8	bl 0x00c36920
00abbedc	cmp w0,#0x0
00abbee0	cset w20,ne
00abbee4	b 0x00abbf4c
00abbee8	bl 0x00c35ed0
00abbeec	bl 0x00c342a0
00abbef0	adrp x0,0x2ca000
00abbef4	adrp x2,0x2b8000
00abbef8	add x0,x0,#0x250
00abbefc	add x2,x2,#0x51c
00abbf00	mov w1,#0x7d
00abbf04	bl 0x00c342b0
00abbf08	mov w0,#0x23
00abbf0c	mov w1,#0x76
00abbf10	b 0x00abbce4
00abbf14	bl 0x00c342a0
00abbf18	adrp x0,0x2ca000
00abbf1c	adrp x2,0x2b8000
00abbf20	add x0,x0,#0x250
00abbf24	add x2,x2,#0x51c
00abbf28	mov w1,#0x8d
00abbf2c	bl 0x00c342b0
00abbf30	mov w0,#0x23
00abbf34	mov w1,#0x6b
00abbf38	mov x2,xzr
00abbf3c	bl 0x00c342c0
00abbf40	ldr x19,[sp, #0x18]
00abbf44	mov x23,xzr
00abbf48	mov w20,wzr
00abbf4c	add x0,sp,#0x80
00abbf50	mov w1,#0x40
00abbf54	bl 0x00c34750
00abbf58	mov x0,x23
00abbf5c	bl 0x00c36900
00abbf60	mov x0,x19
00abbf64	bl 0x00c35800
00abbf68	b 0x00abbcf0

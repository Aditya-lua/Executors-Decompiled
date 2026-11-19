; ossl_statem_client_process_message @ 009dd960
009dd960	sub sp,sp,#0x40
009dd964	stp x20,x19,[sp, #0x20]
009dd968	stp x29,x30,[sp, #0x30]
009dd96c	ldr w8,[x0, #0x5c]
009dd970	mov x19,x0
009dd974	add x29,sp,#0x30
009dd978	sub w8,w8,#0x2
009dd97c	cmp w8,#0x2b
009dd980	b.hi 0x009ddaa8
009dd984	adrp x9,0x74d000
009dd988	add x9,x9,#0x5f4
009dd98c	ldrsw x8,[x9, x8, LSL #0x2]
009dd990	add x8,x8,x9
009dd994	br x8
009dd998	ldr x9,[x1, #0x8]
009dd99c	cmp x9,#0x2
009dd9a0	b.cc 0x009dd9c8
009dd9a4	ldr x8,[x1]
009dd9a8	subs x10,x9,#0x2
009dd9ac	add x11,x8,#0x2
009dd9b0	stp x11,x10,[x1]
009dd9b4	b.eq 0x009dd9c8
009dd9b8	ldrb w20,[x8, #0x2]
009dd9bc	sub x9,x9,#0x3
009dd9c0	subs x9,x9,x20
009dd9c4	b.cs 0x009ddc08
009dd9c8	bl 0x00c342a0
009dd9cc	adrp x0,0x2d7000
009dd9d0	adrp x2,0x2cd000
009dd9d4	add x0,x0,#0xb1a
009dd9d8	add x2,x2,#0x778
009dd9dc	mov w1,#0x505
009dd9e0	bl 0x00c342b0
009dd9e4	mov w1,#0x32
009dd9e8	mov w2,#0x9f
009dd9ec	b 0x009ddad0
009dd9f0	mov x0,x19
009dd9f4	ldp x29,x30,[sp, #0x30]
009dd9f8	ldp x20,x19,[sp, #0x20]
009dd9fc	add sp,sp,#0x40
009dda00	b 0x009ddc34
009dda04	mov x0,x19
009dda08	ldp x29,x30,[sp, #0x30]
009dda0c	ldp x20,x19,[sp, #0x20]
009dda10	add sp,sp,#0x40
009dda14	b 0x009de5a4
009dda18	mov x0,x19
009dda1c	bl 0x009e09c0
009dda20	cmp w0,#0x0
009dda24	orr w8,wzr,#0x3
009dda28	csel w0,wzr,w8,eq
009dda2c	b 0x009ddbf8
009dda30	mov x0,x19
009dda34	ldp x29,x30,[sp, #0x30]
009dda38	ldp x20,x19,[sp, #0x20]
009dda3c	add sp,sp,#0x40
009dda40	b 0x009de9b0
009dda44	mov x0,x19
009dda48	ldp x29,x30,[sp, #0x30]
009dda4c	ldp x20,x19,[sp, #0x20]
009dda50	add sp,sp,#0x40
009dda54	b 0x009df5ec
009dda58	mov x0,x19
009dda5c	ldp x29,x30,[sp, #0x30]
009dda60	ldp x20,x19,[sp, #0x20]
009dda64	add sp,sp,#0x40
009dda68	b 0x009dfa54
009dda6c	mov x0,x19
009dda70	ldp x29,x30,[sp, #0x30]
009dda74	ldp x20,x19,[sp, #0x20]
009dda78	add sp,sp,#0x40
009dda7c	b 0x009dfb04
009dda80	mov x0,x19
009dda84	ldp x29,x30,[sp, #0x30]
009dda88	ldp x20,x19,[sp, #0x20]
009dda8c	add sp,sp,#0x40
009dda90	b 0x00c37200
009dda94	mov x0,x19
009dda98	ldp x29,x30,[sp, #0x30]
009dda9c	ldp x20,x19,[sp, #0x20]
009ddaa0	add sp,sp,#0x40
009ddaa4	b 0x00c37210
009ddaa8	bl 0x00c342a0
009ddaac	adrp x0,0x2d7000
009ddab0	adrp x2,0x2d9000
009ddab4	add x0,x0,#0xb1a
009ddab8	add x2,x2,#0x907
009ddabc	orr w1,wzr,#0x3ff
009ddac0	bl 0x00c342b0
009ddac4	mov w2,#0x103
009ddac8	mov w1,#0x50
009ddacc	movk w2,#0xc, LSL #16
009ddad0	mov x0,x19
009ddad4	mov x3,xzr
009ddad8	bl 0x00c34410
009ddadc	b 0x009ddbf4
009ddae0	str xzr,[sp, #0x8]
009ddae4	ldr x8,[x1, #0x8]
009ddae8	subs x10,x8,#0x2
009ddaec	b.cc 0x009ddbb0
009ddaf0	ldr x9,[x1]
009ddaf4	ldrb w11,[x9]
009ddaf8	ldrb w8,[x9, #0x1]
009ddafc	bfm x8,x11,#0x38,#0x7
009ddb00	cmp x10,x8
009ddb04	b.ne 0x009ddbb0
009ddb08	add x9,x9,#0x2
009ddb0c	add x10,x9,x8
009ddb10	stp x10,xzr,[x1]
009ddb14	add x1,sp,#0x10
009ddb18	mov w2,#0x400
009ddb1c	add x3,sp,#0x8
009ddb20	mov w5,#0x1
009ddb24	mov x0,x19
009ddb28	mov x4,xzr
009ddb2c	stp x9,x8,[sp, #0x10]
009ddb30	bl 0x00c36e50
009ddb34	cbz w0,0x009ddbe0
009ddb38	ldr x2,[sp, #0x8]
009ddb3c	mov w1,#0x400
009ddb40	mov w5,#0x1
009ddb44	mov x0,x19
009ddb48	mov x3,xzr
009ddb4c	mov x4,xzr
009ddb50	bl 0x00c36e70
009ddb54	cbz w0,0x009ddbe0
009ddb58	ldr x0,[sp, #0x8]
009ddb5c	adrp x1,0x2d7000
009ddb60	add x1,x1,#0xb1a
009ddb64	mov w2,#0xe42
009ddb68	bl 0x00c32310
009ddb6c	orr w0,wzr,#0x3
009ddb70	b 0x009ddbf8
009ddb74	mov x0,x19
009ddb78	ldp x29,x30,[sp, #0x30]
009ddb7c	ldp x20,x19,[sp, #0x20]
009ddb80	add sp,sp,#0x40
009ddb84	b 0x00c371f0
009ddb88	mov x0,x19
009ddb8c	ldp x29,x30,[sp, #0x30]
009ddb90	ldp x20,x19,[sp, #0x20]
009ddb94	add sp,sp,#0x40
009ddb98	b 0x009e0080
009ddb9c	mov x0,x19
009ddba0	ldp x29,x30,[sp, #0x30]
009ddba4	ldp x20,x19,[sp, #0x20]
009ddba8	add sp,sp,#0x40
009ddbac	b 0x00c37230
009ddbb0	bl 0x00c342a0
009ddbb4	adrp x0,0x2d7000
009ddbb8	adrp x2,0x2ad000
009ddbbc	add x0,x0,#0xb1a
009ddbc0	add x2,x2,#0x937
009ddbc4	mov w1,#0xe35
009ddbc8	bl 0x00c342b0
009ddbcc	mov w1,#0x32
009ddbd0	mov w2,#0x9f
009ddbd4	mov x0,x19
009ddbd8	mov x3,xzr
009ddbdc	bl 0x00c34410
009ddbe0	ldr x0,[sp, #0x8]
009ddbe4	adrp x1,0x2d7000
009ddbe8	add x1,x1,#0xb1a
009ddbec	mov w2,#0xe46
009ddbf0	bl 0x00c32310
009ddbf4	mov w0,wzr
009ddbf8	ldp x29,x30,[sp, #0x30]
009ddbfc	ldp x20,x19,[sp, #0x20]
009ddc00	add sp,sp,#0x40
009ddc04	ret
009ddc08	add x8,x8,#0x3
009ddc0c	add x10,x8,x20
009ddc10	stp x10,x9,[x1]
009ddc14	ldr x0,[x19, #0x4b8]
009ddc18	mov x1,x8
009ddc1c	mov x2,x20
009ddc20	bl 0x00c2ffd0
009ddc24	ldr x8,[x19, #0x4b8]
009ddc28	mov w0,#0x1
009ddc2c	str x20,[x8, #0x100]
009ddc30	b 0x009ddbf8

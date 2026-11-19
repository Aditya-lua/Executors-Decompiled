; FUN_00a11948 @ 00a11948
00a11948	str x23,[sp, #-0x40]!
00a1194c	stp x22,x21,[sp, #0x10]
00a11950	stp x20,x19,[sp, #0x20]
00a11954	stp x29,x30,[sp, #0x30]
00a11958	add x29,sp,#0x30
00a1195c	cbz x0,0x00a119f8
00a11960	mov x22,x2
00a11964	mov w20,w1
00a11968	add x1,sp,#0x8
00a1196c	mov w2,#0xa
00a11970	mov x19,x3
00a11974	mov x21,x0
00a11978	bl 0x00c300c0
00a1197c	ldr x23,[sp, #0x8]
00a11980	mov x8,x0
00a11984	cbz x23,0x00a119a0
00a11988	ldrb w9,[x23]
00a1198c	cbz w9,0x00a119a0
00a11990	add x9,x21,w20, SXTW 
00a11994	cmp x23,x9
00a11998	mov w0,wzr
00a1199c	b.hi 0x00a119f8
00a119a0	tbnz x8,#0x3f,0x00a119c8
00a119a4	str w8,[x22]
00a119a8	cbz x23,0x00a119b8
00a119ac	sub w8,w21,w23
00a119b0	cmn w8,w20
00a119b4	b.ne 0x00a11a0c
00a119b8	mov w8,#0x80
00a119bc	str w8,[x19]
00a119c0	mov w0,#0x1
00a119c4	b 0x00a119f8
00a119c8	bl 0x00c342a0
00a119cc	adrp x0,0x2a9000
00a119d0	adrp x2,0x2a7000
00a119d4	add x0,x0,#0xfe8
00a119d8	add x2,x2,#0xd78
00a119dc	mov w1,#0x166
00a119e0	bl 0x00c342b0
00a119e4	mov w0,#0xd
00a119e8	mov w1,#0xbb
00a119ec	mov x2,xzr
00a119f0	bl 0x00c342c0
00a119f4	mov w0,wzr
00a119f8	ldp x29,x30,[sp, #0x30]
00a119fc	ldp x20,x19,[sp, #0x20]
00a11a00	ldp x22,x21,[sp, #0x10]
00a11a04	ldr x23,[sp], #0x40
00a11a08	ret
00a11a0c	ldrb w8,[x23]
00a11a10	sub w8,w8,#0x41
00a11a14	cmp w8,#0x14
00a11a18	b.hi 0x00a11a38
00a11a1c	adrp x9,0x752000
00a11a20	add x9,x9,#0x670
00a11a24	ldrsw x8,[x9, x8, LSL #0x2]
00a11a28	add x8,x8,x9
00a11a2c	br x8
00a11a30	mov w8,#0x40
00a11a34	b 0x00a119bc
00a11a38	bl 0x00c342a0
00a11a3c	adrp x0,0x2a9000
00a11a40	adrp x2,0x2a7000
00a11a44	add x0,x0,#0xfe8
00a11a48	add x2,x2,#0xd78
00a11a4c	mov w1,#0x183
00a11a50	bl 0x00c342b0
00a11a54	ldrb w3,[x23]
00a11a58	adrp x2,0x2bd000
00a11a5c	add x2,x2,#0x857
00a11a60	mov w0,#0xd
00a11a64	mov w1,#0xba
00a11a68	bl 0x00c342c0
00a11a6c	b 0x00a119f4
00a11a70	orr w8,wzr,#0xc0
00a11a74	b 0x00a119bc
00a11a78	str wzr,[x19]
00a11a7c	b 0x00a119c0

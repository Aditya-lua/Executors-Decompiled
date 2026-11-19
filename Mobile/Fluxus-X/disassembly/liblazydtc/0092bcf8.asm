; FUN_0092bcf8 @ 0092bcf8
0092bcf8	stp x20,x19,[sp, #-0x20]!
0092bcfc	stp x29,x30,[sp, #0x10]
0092bd00	add x29,sp,#0x10
0092bd04	mov x20,x1
0092bd08	mov x19,x0
0092bd0c	bl 0x00908420
0092bd10	ldr x8,[x19, #0x20]
0092bd14	cbz x8,0x0092be14
0092bd18	ldr w2,[x19, #0x58]
0092bd1c	cmp w2,#0x11
0092bd20	b.hi 0x0092bd68
0092bd24	adrp x8,0x746000
0092bd28	add x8,x8,#0xf78
0092bd2c	ldrsw x9,[x8, x2, LSL #0x2]
0092bd30	add x8,x9,x8
0092bd34	br x8
0092bd38	nop
0092bd3c	adr x2,0x92f550
0092bd40	b 0x0092bda4
0092bd44	nop
0092bd48	adr x2,0x92f594
0092bd4c	b 0x0092bda4
0092bd50	nop
0092bd54	adr x2,0x92f5f8
0092bd58	b 0x0092bda4
0092bd5c	nop
0092bd60	adr x2,0x92f688
0092bd64	b 0x0092bda4
0092bd68	ldp x29,x30,[sp, #0x10]
0092bd6c	adrp x1,0x2b5000
0092bd70	add x1,x1,#0x38f
0092bd74	mov x0,x19
0092bd78	ldp x20,x19,[sp], #0x20
0092bd7c	b 0x00904b80
0092bd80	nop
0092bd84	adr x2,0x918210
0092bd88	ldp x29,x30,[sp, #0x10]
0092bd8c	mov x0,x19
0092bd90	mov x1,x20
0092bd94	ldp x20,x19,[sp], #0x20
0092bd98	b 0x00908518
0092bd9c	nop
0092bda0	adr x2,0x92f640
0092bda4	mov x0,x19
0092bda8	mov x1,x20
0092bdac	bl 0x00908518
0092bdb0	mov x0,x19
0092bdb4	mov x1,x20
0092bdb8	bl 0x00907984
0092bdbc	ldr w8,[x20, #0x14]
0092bdc0	cbnz w8,0x0092be14
0092bdc4	ldrb w8,[x19, #0x128]
0092bdc8	tst w8,#0x30
0092bdcc	b.ne 0x0092be14
0092bdd0	mov x0,x19
0092bdd4	mov w1,wzr
0092bdd8	bl 0x009077ec
0092bddc	tbz w0,#0x0,0x0092be14
0092bde0	ldrb w8,[x19, #0xa85]
0092bde4	tbz w8,#0x4,0x0092be14
0092bde8	ldr x8,[x19, #0x12a0]
0092bdec	cbz x8,0x0092bdfc
0092bdf0	ldr w8,[x8, #0x8]
0092bdf4	cmp w8,#0x1
0092bdf8	b.lt 0x0092be14
0092bdfc	ldp x29,x30,[sp, #0x10]
0092be00	adrp x1,0x2bc000
0092be04	add x1,x1,#0xf6d
0092be08	mov x0,x19
0092be0c	ldp x20,x19,[sp], #0x20
0092be10	b 0x00904c98
0092be14	ldp x29,x30,[sp, #0x10]
0092be18	ldp x20,x19,[sp], #0x20
0092be1c	ret

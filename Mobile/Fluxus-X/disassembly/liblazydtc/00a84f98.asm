; OSSL_CMP_print_to_bio @ 00a84f98
00a84f98	mov x3,x5
00a84f9c	cmp w4,#0x7
00a84fa0	b.cs 0x00a84fb4
00a84fa4	adrp x8,0xc61000
00a84fa8	add x8,x8,#0x440
00a84fac	ldr x2,[x8, w4, SXTW #0x3]
00a84fb0	b 0x00a84fc8
00a84fb4	adrp x8,0x2cb000
00a84fb8	adrp x9,0x2c7000
00a84fbc	add x8,x8,#0xa2c
00a84fc0	add x9,x9,#0xa83
00a84fc4	csel x2,x9,x8,eq
00a84fc8	stp x29,x30,[sp, #-0x10]!
00a84fcc	adrp x1,0x2cb000
00a84fd0	add x1,x1,#0xa3c
00a84fd4	mov x29,sp
00a84fd8	bl 0x00c32250
00a84fdc	lsr w8,w0,#0x1f
00a84fe0	eor w0,w8,#0x1
00a84fe4	ldp x29,x30,[sp], #0x10
00a84fe8	ret

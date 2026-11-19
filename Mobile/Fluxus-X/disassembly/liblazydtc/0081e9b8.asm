; FUN_0081e9b8 @ 0081e9b8
0081e9b8	stp x29,x30,[sp, #-0x50]!
0081e9bc	stp x26,x25,[sp, #0x10]
0081e9c0	stp x24,x23,[sp, #0x20]
0081e9c4	stp x22,x21,[sp, #0x30]
0081e9c8	stp x20,x19,[sp, #0x40]
0081e9cc	mov x29,sp
0081e9d0	mov x19,x8
0081e9d4	adrp x8,0xd1c000
0081e9d8	add x8,x8,#0x618
0081e9dc	ldarb w8,[x8]
0081e9e0	mov x20,x0
0081e9e4	adrp x21,0xd1c000
0081e9e8	add x21,x21,#0x610
0081e9ec	tbz w8,#0x0,0x0081ebbc
0081e9f0	adrp x8,0xd1c000
0081e9f4	ldrb w8,[x8, #0x613]
0081e9f8	cmp w8,#0x1
0081e9fc	b.ne 0x0081ea30
0081ea00	ldrb w8,[x21]
0081ea04	ldrb w9,[x21, #0x1]
0081ea08	mov w10,#0xb5
0081ea0c	ldrb w11,[x21, #0x2]
0081ea10	mov w12,#0xc9
0081ea14	strb wzr,[x21, #0x3]
0081ea18	eor w8,w8,#0xffffffef
0081ea1c	eor w9,w9,w10
0081ea20	strb w8,[x21]
0081ea24	eor w8,w11,w12
0081ea28	strb w9,[x21, #0x1]
0081ea2c	strb w8,[x21, #0x2]
0081ea30	ldrb w8,[x20]
0081ea34	ldp x10,x9,[x20, #0x8]
0081ea38	adrp x0,0xd1c000
0081ea3c	add x0,x0,#0x610
0081ea40	lsr x11,x8,#0x1
0081ea44	tst w8,#0x1
0081ea48	csinc x25,x9,x20,ne
0081ea4c	csel x24,x11,x10,eq
0081ea50	bl 0x00c2ff50
0081ea54	cbz x0,0x0081eaf8
0081ea58	mov x21,x0
0081ea5c	cmp x24,x0
0081ea60	b.ge 0x0081ea8c
0081ea64	adrp x0,0xd1c000
0081ea68	add x0,x0,#0x5c0
0081ea6c	mov x8,x19
0081ea70	mov x1,x20
0081ea74	ldp x20,x19,[sp, #0x40]
0081ea78	ldp x22,x21,[sp, #0x30]
0081ea7c	ldp x24,x23,[sp, #0x20]
0081ea80	ldp x26,x25,[sp, #0x10]
0081ea84	ldp x29,x30,[sp], #0x50
0081ea88	b 0x0081ef14
0081ea8c	adrp x8,0xd1c000
0081ea90	add x26,x25,x24
0081ea94	adrp x23,0xd1c000
0081ea98	add x23,x23,#0x610
0081ea9c	ldrb w22,[x8, #0x610]
0081eaa0	mov x0,x25
0081eaa4	sub x8,x24,x21
0081eaa8	adds x2,x8,#0x1
0081eaac	b.cs 0x0081ea64
0081eab0	mov w1,w22
0081eab4	bl 0x00c300a0
0081eab8	cbz x0,0x0081ea64
0081eabc	mov x1,x23
0081eac0	mov x2,x21
0081eac4	mov x24,x0
0081eac8	bl 0x00c300b0
0081eacc	cbz w0,0x0081eae4
0081ead0	add x0,x24,#0x1
0081ead4	sub x24,x26,x0
0081ead8	cmp x24,x21
0081eadc	b.ge 0x0081eaa4
0081eae0	b 0x0081ea64
0081eae4	cmp x24,x26
0081eae8	b.eq 0x0081ea64
0081eaec	sub x8,x24,x25
0081eaf0	cmn x8,#0x1
0081eaf4	b.eq 0x0081ea64
0081eaf8	adrp x8,0xd1c000
0081eafc	add x8,x8,#0x628
0081eb00	adrp x20,0xd1c000
0081eb04	add x20,x20,#0x620
0081eb08	ldarb w8,[x8]
0081eb0c	tbz w8,#0x0,0x0081ec00
0081eb10	adrp x8,0xd1c000
0081eb14	ldrb w8,[x8, #0x621]
0081eb18	cmp w8,#0x1
0081eb1c	b.ne 0x0081eb34
0081eb20	ldrb w8,[x20]
0081eb24	mov w9,#0xed
0081eb28	strb wzr,[x20, #0x1]
0081eb2c	eor w8,w8,w9
0081eb30	strb w8,[x20]
0081eb34	adrp x0,0xd1c000
0081eb38	add x0,x0,#0x620
0081eb3c	bl 0x00c2ff50
0081eb40	cmn x0,#0x8
0081eb44	b.cs 0x0081ec40
0081eb48	mov x20,x0
0081eb4c	cmp x0,#0x17
0081eb50	b.cs 0x0081eb64
0081eb54	lsl w8,w20,#0x1
0081eb58	strb w8,[x19], #0x1
0081eb5c	cbnz x20,0x0081eb8c
0081eb60	b 0x0081eba0
0081eb64	orr x8,x20,#0x7
0081eb68	mov w9,#0x1a
0081eb6c	cmp x8,#0x17
0081eb70	csinc x21,x9,x8,eq
0081eb74	mov x0,x21
0081eb78	bl 0x00c2fed0
0081eb7c	orr x8,x21,#0x1
0081eb80	stp x20,x0,[x19, #0x8]
0081eb84	str x8,[x19]
0081eb88	mov x19,x0
0081eb8c	adrp x1,0xd1c000
0081eb90	add x1,x1,#0x620
0081eb94	mov x0,x19
0081eb98	mov x2,x20
0081eb9c	bl 0x00c2ffd0
0081eba0	strb wzr,[x19, x20]
0081eba4	ldp x20,x19,[sp, #0x40]
0081eba8	ldp x22,x21,[sp, #0x30]
0081ebac	ldp x24,x23,[sp, #0x20]
0081ebb0	ldp x26,x25,[sp, #0x10]
0081ebb4	ldp x29,x30,[sp], #0x50
0081ebb8	ret
0081ebbc	adrp x0,0xd1c000
0081ebc0	add x0,x0,#0x618
0081ebc4	bl 0x00c2fe90
0081ebc8	cbz w0,0x0081e9f0
0081ebcc	adrp x8,0x29a000
0081ebd0	nop
0081ebd4	adr x0,0x81f020
0081ebd8	ldr d0,[x8, #0x270]
0081ebdc	adrp x2,0xc48000
0081ebe0	add x2,x2,#0x880
0081ebe4	mov x1,x21
0081ebe8	str s0,[x21]
0081ebec	bl 0x00c2fe70
0081ebf0	adrp x0,0xd1c000
0081ebf4	add x0,x0,#0x618
0081ebf8	bl 0x00c2fea0
0081ebfc	b 0x0081e9f0
0081ec00	adrp x0,0xd1c000
0081ec04	add x0,x0,#0x628
0081ec08	bl 0x00c2fe90
0081ec0c	cbz w0,0x0081eb10
0081ec10	mov w8,#0x1ed
0081ec14	nop
0081ec18	adr x0,0x81f02c
0081ec1c	adrp x2,0xc48000
0081ec20	add x2,x2,#0x880
0081ec24	mov x1,x20
0081ec28	strh w8,[x20]
0081ec2c	bl 0x00c2fe70
0081ec30	adrp x0,0xd1c000
0081ec34	add x0,x0,#0x628
0081ec38	bl 0x00c2fea0
0081ec3c	b 0x0081eb10
0081ec40	bl 0x007fe124

; ossl_sha3_final @ 00ae0cb4
00ae0cb4	ldr x8,[x1, #0xd0]
00ae0cb8	cbz x8,0x00ae0d48
00ae0cbc	stp x24,x23,[sp, #-0x40]!
00ae0cc0	stp x22,x21,[sp, #0x10]
00ae0cc4	stp x20,x19,[sp, #0x20]
00ae0cc8	stp x29,x30,[sp, #0x30]
00ae0ccc	ldr x8,[x1, #0xd8]
00ae0cd0	ldr x21,[x1, #0xc8]
00ae0cd4	add x22,x1,#0xe0
00ae0cd8	mov x19,x1
00ae0cdc	add x23,x22,x8
00ae0ce0	mov x20,x0
00ae0ce4	sub x2,x21,x8
00ae0ce8	mov x0,x23
00ae0cec	mov w1,wzr
00ae0cf0	add x29,sp,#0x30
00ae0cf4	add x24,x22,x21
00ae0cf8	bl 0x00c301c0
00ae0cfc	ldrb w8,[x19, #0x188]
00ae0d00	mov x0,x19
00ae0d04	mov x1,x22
00ae0d08	mov x2,x21
00ae0d0c	strb w8,[x23]
00ae0d10	ldurb w8,[x24, #-0x1]
00ae0d14	mov x3,x21
00ae0d18	orr w8,w8,#0x80
00ae0d1c	sturb w8,[x24, #-0x1]
00ae0d20	bl 0x00c400c0
00ae0d24	ldr x2,[x19, #0xd0]
00ae0d28	mov x0,x19
00ae0d2c	mov x1,x20
00ae0d30	mov x3,x21
00ae0d34	bl 0x00c400d0
00ae0d38	ldp x29,x30,[sp, #0x30]
00ae0d3c	ldp x20,x19,[sp, #0x20]
00ae0d40	ldp x22,x21,[sp, #0x10]
00ae0d44	ldp x24,x23,[sp], #0x40
00ae0d48	mov w0,#0x1
00ae0d4c	ret

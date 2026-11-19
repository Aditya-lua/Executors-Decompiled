; X509_time_adj_ex @ 00b0eca4
00b0eca4	str x21,[sp, #-0x30]!
00b0eca8	stp x20,x19,[sp, #0x10]
00b0ecac	mov x19,x2
00b0ecb0	mov w20,w1
00b0ecb4	mov x21,x0
00b0ecb8	stp x29,x30,[sp, #0x20]
00b0ecbc	add x29,sp,#0x20
00b0ecc0	cbz x3,0x00b0ed04
00b0ecc4	ldr x8,[x3]
00b0ecc8	str x8,[sp, #0x8]
00b0eccc	cbz x21,0x00b0ed10
00b0ecd0	ldrb w8,[x21, #0x10]
00b0ecd4	tbnz w8,#0x6,0x00b0ed10
00b0ecd8	ldr w8,[x21, #0x4]
00b0ecdc	cmp w8,#0x18
00b0ece0	b.eq 0x00b0ed34
00b0ece4	cmp w8,#0x17
00b0ece8	b.ne 0x00b0ed10
00b0ecec	ldr x1,[sp, #0x8]
00b0ecf0	mov x0,x21
00b0ecf4	mov w2,w20
00b0ecf8	mov x3,x19
00b0ecfc	bl 0x00c37ad0
00b0ed00	b 0x00b0ed24
00b0ed04	add x0,sp,#0x8
00b0ed08	bl 0x00c30970
00b0ed0c	cbnz x21,0x00b0ecd0
00b0ed10	ldr x1,[sp, #0x8]
00b0ed14	mov x0,x21
00b0ed18	mov w2,w20
00b0ed1c	mov x3,x19
00b0ed20	bl 0x00c378f0
00b0ed24	ldp x29,x30,[sp, #0x20]
00b0ed28	ldp x20,x19,[sp, #0x10]
00b0ed2c	ldr x21,[sp], #0x30
00b0ed30	ret
00b0ed34	ldr x1,[sp, #0x8]
00b0ed38	mov x0,x21
00b0ed3c	mov w2,w20
00b0ed40	mov x3,x19
00b0ed44	bl 0x00c374b0
00b0ed48	b 0x00b0ed24

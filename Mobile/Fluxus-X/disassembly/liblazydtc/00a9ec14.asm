; OSSL_PARAM_get_uint64 @ 00a9ec14
00a9ec14	str x21,[sp, #-0x30]!
00a9ec18	mov x8,x0
00a9ec1c	mov w0,wzr
00a9ec20	stp x20,x19,[sp, #0x10]
00a9ec24	stp x29,x30,[sp, #0x20]
00a9ec28	add x29,sp,#0x20
00a9ec2c	cbz x8,0x00a9ed9c
00a9ec30	mov x19,x1
00a9ec34	cbz x1,0x00a9ed9c
00a9ec38	ldr w9,[x8, #0x8]
00a9ec3c	cmp w9,#0x1
00a9ec40	b.eq 0x00a9ec78
00a9ec44	cmp w9,#0x3
00a9ec48	b.eq 0x00a9ec9c
00a9ec4c	cmp w9,#0x2
00a9ec50	mov w0,wzr
00a9ec54	b.ne 0x00a9ed9c
00a9ec58	ldr x21,[x8, #0x18]
00a9ec5c	subs x9,x21,#0x8
00a9ec60	b.eq 0x00a9ece4
00a9ec64	cmp x21,#0x4
00a9ec68	b.ne 0x00a9ecf0
00a9ec6c	ldr x8,[x8, #0x10]
00a9ec70	ldr w8,[x8]
00a9ec74	b 0x00a9ed8c
00a9ec78	ldr x21,[x8, #0x18]
00a9ec7c	subs x9,x21,#0x8
00a9ec80	b.eq 0x00a9ed1c
00a9ec84	cmp x21,#0x4
00a9ec88	b.ne 0x00a9ed2c
00a9ec8c	ldr x8,[x8, #0x10]
00a9ec90	ldrsw x8,[x8]
00a9ec94	tbz w8,#0x1f,0x00a9ed8c
00a9ec98	b 0x00a9ed98
00a9ec9c	ldr x9,[x8, #0x18]
00a9eca0	mov w0,wzr
00a9eca4	cmp x9,#0x8
00a9eca8	b.ne 0x00a9ed9c
00a9ecac	ldr x8,[x8, #0x10]
00a9ecb0	ldr d0,[x8]
00a9ecb4	fcmp d0,#0.0
00a9ecb8	b.lt 0x00a9ed98
00a9ecbc	adrp x8,0x29a000
00a9ecc0	ldr d1,[x8, #0x9c0]
00a9ecc4	mov w0,wzr
00a9ecc8	fcmp d0,d1
00a9eccc	b.pl 0x00a9ed9c
00a9ecd0	fcvtzu x8,d0
00a9ecd4	ucvtf d1,x8
00a9ecd8	fcmp d0,d1
00a9ecdc	b.eq 0x00a9ed8c
00a9ece0	b 0x00a9ed98
00a9ece4	ldr x8,[x8, #0x10]
00a9ece8	ldr x8,[x8]
00a9ecec	b 0x00a9ed8c
00a9ecf0	ldr x20,[x8, #0x10]
00a9ecf4	cmp x21,#0x7
00a9ecf8	b.ls 0x00a9ed44
00a9ecfc	mov x8,xzr
00a9ed00	add x10,x20,#0x8
00a9ed04	ldrb w11,[x10, x8]
00a9ed08	cbnz w11,0x00a9ed98
00a9ed0c	add x8,x8,#0x1
00a9ed10	cmp x8,x9
00a9ed14	b.cc 0x00a9ed04
00a9ed18	b 0x00a9ed88
00a9ed1c	ldr x8,[x8, #0x10]
00a9ed20	ldr x8,[x8]
00a9ed24	tbz x8,#0x3f,0x00a9ed8c
00a9ed28	b 0x00a9ed98
00a9ed2c	ldr x20,[x8, #0x10]
00a9ed30	add x8,x20,x21
00a9ed34	ldursb w8,[x8, #-0x1]
00a9ed38	tbnz w8,#0x1f,0x00a9ed98
00a9ed3c	cmp x21,#0x7
00a9ed40	b.hi 0x00a9ed6c
00a9ed44	mov w8,#0x8
00a9ed48	sub x2,x8,x21
00a9ed4c	add x0,x19,x21
00a9ed50	mov w1,wzr
00a9ed54	bl 0x00c301c0
00a9ed58	mov x0,x19
00a9ed5c	mov x1,x20
00a9ed60	mov x2,x21
00a9ed64	bl 0x00c2ffd0
00a9ed68	b 0x00a9ed90
00a9ed6c	mov x8,xzr
00a9ed70	add x10,x20,#0x8
00a9ed74	ldrb w11,[x10, x8]
00a9ed78	cbnz w11,0x00a9ed98
00a9ed7c	add x8,x8,#0x1
00a9ed80	cmp x8,x9
00a9ed84	b.cc 0x00a9ed74
00a9ed88	ldr x8,[x20]
00a9ed8c	str x8,[x19]
00a9ed90	mov w0,#0x1
00a9ed94	b 0x00a9ed9c
00a9ed98	mov w0,wzr
00a9ed9c	ldp x29,x30,[sp, #0x20]
00a9eda0	ldp x20,x19,[sp, #0x10]
00a9eda4	ldr x21,[sp], #0x30
00a9eda8	ret

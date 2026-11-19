; mbedtls_des_crypt_cbc @ 00b75304
00b75304	str x25,[sp, #-0x50]!
00b75308	stp x24,x23,[sp, #0x10]
00b7530c	stp x22,x21,[sp, #0x20]
00b75310	stp x20,x19,[sp, #0x30]
00b75314	stp x29,x30,[sp, #0x40]
00b75318	add x29,sp,#0x40
00b7531c	mov x19,x5
00b75320	mov x23,x4
00b75324	mov x20,x3
00b75328	mov x21,x2
00b7532c	tst x2,#0x7
00b75330	mov x22,x0
00b75334	b.eq 0x00b75340
00b75338	mov w0,#0xffffffce
00b7533c	b 0x00b754a8
00b75340	cmp w1,#0x1
00b75344	b.ne 0x00b753f4
00b75348	cbz x21,0x00b754a4
00b7534c	ldrb w8,[x20]
00b75350	ldrb w9,[x23]
00b75354	mov x0,x22
00b75358	mov x1,x19
00b7535c	mov x2,x19
00b75360	eor w8,w8,w9
00b75364	strb w8,[x19]
00b75368	ldrb w8,[x23, #0x1]
00b7536c	ldrb w9,[x20, #0x1]
00b75370	eor w8,w9,w8
00b75374	strb w8,[x19, #0x1]
00b75378	ldrb w8,[x23, #0x2]
00b7537c	ldrb w9,[x20, #0x2]
00b75380	eor w8,w9,w8
00b75384	strb w8,[x19, #0x2]
00b75388	ldrb w8,[x23, #0x3]
00b7538c	ldrb w9,[x20, #0x3]
00b75390	eor w8,w9,w8
00b75394	strb w8,[x19, #0x3]
00b75398	ldrb w8,[x23, #0x4]
00b7539c	ldrb w9,[x20, #0x4]
00b753a0	eor w8,w9,w8
00b753a4	strb w8,[x19, #0x4]
00b753a8	ldrb w8,[x23, #0x5]
00b753ac	ldrb w9,[x20, #0x5]
00b753b0	eor w8,w9,w8
00b753b4	strb w8,[x19, #0x5]
00b753b8	ldrb w8,[x23, #0x6]
00b753bc	ldrb w9,[x20, #0x6]
00b753c0	eor w8,w9,w8
00b753c4	strb w8,[x19, #0x6]
00b753c8	ldrb w8,[x23, #0x7]
00b753cc	ldrb w9,[x20, #0x7]
00b753d0	eor w8,w9,w8
00b753d4	strb w8,[x19, #0x7]
00b753d8	bl 0x00c42330
00b753dc	ldr x8,[x19], #0x8
00b753e0	subs x21,x21,#0x8
00b753e4	add x23,x23,#0x8
00b753e8	str x8,[x20]
00b753ec	b.ne 0x00b75350
00b753f0	b 0x00b754a4
00b753f4	cbz x21,0x00b754a4
00b753f8	mov x24,x23
00b753fc	ldr x25,[x24], #0x8
00b75400	mov x0,x22
00b75404	mov x1,x23
00b75408	mov x2,x19
00b7540c	bl 0x00c42330
00b75410	ldrb w8,[x19]
00b75414	ldrb w9,[x20]
00b75418	subs x21,x21,#0x8
00b7541c	mov x23,x24
00b75420	eor w8,w9,w8
00b75424	strb w8,[x19]
00b75428	ldrb w9,[x19, #0x1]
00b7542c	ldrb w8,[x20, #0x1]
00b75430	eor w8,w8,w9
00b75434	strb w8,[x19, #0x1]
00b75438	ldrb w9,[x19, #0x2]
00b7543c	ldrb w8,[x20, #0x2]
00b75440	eor w8,w8,w9
00b75444	strb w8,[x19, #0x2]
00b75448	ldrb w9,[x19, #0x3]
00b7544c	ldrb w8,[x20, #0x3]
00b75450	eor w8,w8,w9
00b75454	strb w8,[x19, #0x3]
00b75458	ldrb w9,[x19, #0x4]
00b7545c	ldrb w8,[x20, #0x4]
00b75460	eor w8,w8,w9
00b75464	strb w8,[x19, #0x4]
00b75468	ldrb w9,[x19, #0x5]
00b7546c	ldrb w8,[x20, #0x5]
00b75470	eor w8,w8,w9
00b75474	strb w8,[x19, #0x5]
00b75478	ldrb w9,[x19, #0x6]
00b7547c	ldrb w8,[x20, #0x6]
00b75480	eor w8,w8,w9
00b75484	strb w8,[x19, #0x6]
00b75488	ldrb w9,[x19, #0x7]
00b7548c	ldrb w8,[x20, #0x7]
00b75490	eor w8,w8,w9
00b75494	strb w8,[x19, #0x7]
00b75498	add x19,x19,#0x8
00b7549c	str x25,[x20]
00b754a0	b.ne 0x00b753fc
00b754a4	mov w0,wzr
00b754a8	ldp x29,x30,[sp, #0x40]
00b754ac	ldp x20,x19,[sp, #0x30]
00b754b0	ldp x22,x21,[sp, #0x20]
00b754b4	ldp x24,x23,[sp, #0x10]
00b754b8	ldr x25,[sp], #0x50
00b754bc	ret

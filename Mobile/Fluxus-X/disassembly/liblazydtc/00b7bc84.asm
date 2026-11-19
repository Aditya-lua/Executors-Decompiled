; mbedtls_ecdsa_raw_to_der @ 00b7bc84
00b7bc84	sub sp,sp,#0x100
00b7bc88	str x27,[sp, #0xa0]
00b7bc8c	stp x26,x25,[sp, #0xb0]
00b7bc90	stp x24,x23,[sp, #0xc0]
00b7bc94	stp x22,x21,[sp, #0xd0]
00b7bc98	stp x20,x19,[sp, #0xe0]
00b7bc9c	stp x29,x30,[sp, #0xf0]
00b7bca0	add x29,sp,#0xf0
00b7bca4	mrs x25,tpidr_el0
00b7bca8	add x8,x0,#0x7
00b7bcac	ldr x9,[x25, #0x28]
00b7bcb0	lsr x21,x8,#0x3
00b7bcb4	lsl x10,x21,#0x1
00b7bcb8	mov x19,x5
00b7bcbc	mov x22,x4
00b7bcc0	mov x20,x3
00b7bcc4	mov x24,x1
00b7bcc8	add x26,x3,x4
00b7bccc	cmp x10,x2
00b7bcd0	stur x9,[x29, #-0x58]
00b7bcd4	str x26,[sp]
00b7bcd8	b.ne 0x00b7bd34
00b7bcdc	cmp x8,#0x217
00b7bce0	b.hi 0x00b7bd48
00b7bce4	add x0,sp,#0x54
00b7bce8	mov x1,x24
00b7bcec	mov x2,x21
00b7bcf0	add x23,sp,#0x10
00b7bcf4	bl 0x00c2ffd0
00b7bcf8	add x1,x24,x21
00b7bcfc	add x0,sp,#0x10
00b7bd00	mov x2,x21
00b7bd04	bl 0x00c2ffd0
00b7bd08	lsl x24,x21,#0x20
00b7bd0c	orr x9,xzr,#-0x100000000
00b7bd10	mov x8,x24
00b7bd14	mov x27,x21
00b7bd18	str x26,[sp, #0x8]
00b7bd1c	ldrb w10,[x23]
00b7bd20	cbnz w10,0x00b7bd3c
00b7bd24	add x23,x23,#0x1
00b7bd28	subs x27,x27,#0x1
00b7bd2c	add x8,x8,x9
00b7bd30	b.ne 0x00b7bd1c
00b7bd34	mov w22,#0xffffff98
00b7bd38	b 0x00b7bd4c
00b7bd3c	asr x2,x8,#0x20
00b7bd40	cmp x2,x22
00b7bd44	b.le 0x00b7bd80
00b7bd48	mov w22,#0xffffff94
00b7bd4c	ldr x8,[x25, #0x28]
00b7bd50	ldur x9,[x29, #-0x58]
00b7bd54	cmp x8,x9
00b7bd58	b.ne 0x00b7bf04
00b7bd5c	mov w0,w22
00b7bd60	ldp x29,x30,[sp, #0xf0]
00b7bd64	ldp x20,x19,[sp, #0xe0]
00b7bd68	ldp x22,x21,[sp, #0xd0]
00b7bd6c	ldp x24,x23,[sp, #0xc0]
00b7bd70	ldp x26,x25,[sp, #0xb0]
00b7bd74	ldr x27,[sp, #0xa0]
00b7bd78	add sp,sp,#0x100
00b7bd7c	ret
00b7bd80	sub x22,x26,x2
00b7bd84	mov x0,x22
00b7bd88	mov x1,x23
00b7bd8c	str x22,[sp, #0x8]
00b7bd90	bl 0x00c2ffd0
00b7bd94	ldrsb w8,[x22]
00b7bd98	tbz w8,#0x1f,0x00b7bdb8
00b7bd9c	sub x8,x22,x20
00b7bda0	cmp x8,#0x1
00b7bda4	b.lt 0x00b7bd48
00b7bda8	sub x8,x22,#0x1
00b7bdac	add w27,w27,#0x1
00b7bdb0	str x8,[sp, #0x8]
00b7bdb4	sturb wzr,[x22, #-0x1]
00b7bdb8	sxtw x2,w27
00b7bdbc	add x0,sp,#0x8
00b7bdc0	mov x1,x20
00b7bdc4	bl 0x00c41ac0
00b7bdc8	mov w22,w0
00b7bdcc	tbnz w0,#0x1f,0x00b7bd4c
00b7bdd0	add x0,sp,#0x8
00b7bdd4	mov w2,#0x2
00b7bdd8	mov x1,x20
00b7bddc	bl 0x00c41ae0
00b7bde0	tbnz w0,#0x1f,0x00b7befc
00b7bde4	add w8,w22,w27
00b7bde8	adds w22,w8,w0
00b7bdec	b.mi 0x00b7bd4c
00b7bdf0	sxtw x23,w22
00b7bdf4	add x1,sp,#0x54
00b7bdf8	sub x26,x26,x23
00b7bdfc	orr x8,xzr,#-0x100000000
00b7be00	stp x26,x26,[sp]
00b7be04	ldrb w9,[x1]
00b7be08	cbnz w9,0x00b7be20
00b7be0c	add x1,x1,#0x1
00b7be10	subs x21,x21,#0x1
00b7be14	add x24,x24,x8
00b7be18	b.ne 0x00b7be04
00b7be1c	b 0x00b7bd34
00b7be20	sub x8,x26,x20
00b7be24	asr x2,x24,#0x20
00b7be28	cmp x8,x2
00b7be2c	b.lt 0x00b7bd48
00b7be30	sub x22,x26,x2
00b7be34	mov x0,x22
00b7be38	str x22,[sp, #0x8]
00b7be3c	bl 0x00c2ffd0
00b7be40	ldrsb w8,[x22]
00b7be44	tbz w8,#0x1f,0x00b7be64
00b7be48	sub x8,x22,x20
00b7be4c	cmp x8,#0x1
00b7be50	b.lt 0x00b7bd48
00b7be54	sub x8,x22,#0x1
00b7be58	add w21,w21,#0x1
00b7be5c	str x8,[sp, #0x8]
00b7be60	sturb wzr,[x22, #-0x1]
00b7be64	sxtw x2,w21
00b7be68	add x0,sp,#0x8
00b7be6c	mov x1,x20
00b7be70	bl 0x00c41ac0
00b7be74	mov w22,w0
00b7be78	tbnz w0,#0x1f,0x00b7bd4c
00b7be7c	add x0,sp,#0x8
00b7be80	mov w2,#0x2
00b7be84	mov x1,x20
00b7be88	bl 0x00c41ae0
00b7be8c	tbnz w0,#0x1f,0x00b7befc
00b7be90	add w8,w22,w21
00b7be94	adds w22,w8,w0
00b7be98	b.mi 0x00b7bd4c
00b7be9c	sxtw x8,w22
00b7bea0	add x21,x8,x23
00b7bea4	sub x9,x26,x8
00b7bea8	mov x0,sp
00b7beac	mov x1,x20
00b7beb0	mov x2,x21
00b7beb4	str x9,[sp]
00b7beb8	bl 0x00c41ac0
00b7bebc	mov w22,w0
00b7bec0	tbnz w0,#0x1f,0x00b7bd4c
00b7bec4	mov x0,sp
00b7bec8	orr w2,wzr,#0x30
00b7becc	mov x1,x20
00b7bed0	bl 0x00c41ae0
00b7bed4	tbnz w0,#0x1f,0x00b7befc
00b7bed8	ldr x1,[sp]
00b7bedc	add x8,x21,w22, SXTW 
00b7bee0	add x21,x8,w0, SXTW 
00b7bee4	mov x0,x20
00b7bee8	mov x2,x21
00b7beec	bl 0x00c2ff60
00b7bef0	mov w22,wzr
00b7bef4	str x21,[x19]
00b7bef8	b 0x00b7bd4c
00b7befc	mov w22,w0
00b7bf00	b 0x00b7bd4c
00b7bf04	bl 0x00c2fec0

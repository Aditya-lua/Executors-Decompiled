; FUN_00a5bc20 @ 00a5bc20
00a5bc20	str x27,[sp, #-0x60]!
00a5bc24	stp x24,x23,[sp, #0x20]
00a5bc28	mov x23,x1
00a5bc2c	mov w1,#0x2000
00a5bc30	stp x26,x25,[sp, #0x10]
00a5bc34	stp x22,x21,[sp, #0x30]
00a5bc38	stp x20,x19,[sp, #0x40]
00a5bc3c	stp x29,x30,[sp, #0x50]
00a5bc40	add x29,sp,#0x50
00a5bc44	mov w22,w4
00a5bc48	mov x21,x3
00a5bc4c	mov x19,x2
00a5bc50	mov x20,x0
00a5bc54	bl 0x00c3cce0
00a5bc58	mov w10,w22
00a5bc5c	cbz w0,0x00a5bc74
00a5bc60	add w8,w22,#0x7
00a5bc64	add w9,w22,#0xe
00a5bc68	cmp w8,#0x0
00a5bc6c	csel w8,w9,w8,lt
00a5bc70	asr w10,w8,#0x3
00a5bc74	ldr x8,[x20]
00a5bc78	ldrb w9,[x8, #0x12]
00a5bc7c	ldr w27,[x8, #0x4]
00a5bc80	tbnz w9,#0x4,0x00a5bce0
00a5bc84	cmp w22,#0x0
00a5bc88	b.le 0x00a5bd78
00a5bc8c	ldrsw x9,[x20, #0x14]
00a5bc90	sxtw x11,w10
00a5bc94	neg x12,x11
00a5bc98	add x13,x23,x9
00a5bc9c	sub x13,x13,x21
00a5bca0	cmp x13,x11
00a5bca4	cset w11,cc
00a5bca8	cmp x13,x12
00a5bcac	cset w12,hi
00a5bcb0	cmp w10,#0x1
00a5bcb4	b.lt 0x00a5bd9c
00a5bcb8	cbz x13,0x00a5bd9c
00a5bcbc	orr w10,w11,w12
00a5bcc0	cbz w10,0x00a5bd9c
00a5bcc4	bl 0x00c342a0
00a5bcc8	adrp x0,0x2a5000
00a5bccc	adrp x2,0x2bd000
00a5bcd0	add x0,x0,#0xf9d
00a5bcd4	add x2,x2,#0xabf
00a5bcd8	mov w1,#0x24d
00a5bcdc	b 0x00a5bd30
00a5bce0	cmp w27,#0x1
00a5bce4	b.ne 0x00a5bd48
00a5bce8	sub x12,x23,x21
00a5bcec	sxtw x9,w10
00a5bcf0	cmp x12,x9
00a5bcf4	neg x11,x9
00a5bcf8	cset w9,cc
00a5bcfc	cmp x12,x11
00a5bd00	cset w11,hi
00a5bd04	cbz x12,0x00a5bd48
00a5bd08	cmp w10,#0x1
00a5bd0c	b.lt 0x00a5bd48
00a5bd10	orr w9,w9,w11
00a5bd14	cbz w9,0x00a5bd48
00a5bd18	bl 0x00c342a0
00a5bd1c	adrp x0,0x2a5000
00a5bd20	adrp x2,0x2bd000
00a5bd24	add x0,x0,#0xf9d
00a5bd28	add x2,x2,#0xabf
00a5bd2c	mov w1,#0x23c
00a5bd30	bl 0x00c342b0
00a5bd34	orr w0,wzr,#0x6
00a5bd38	mov w1,#0xa2
00a5bd3c	mov x2,xzr
00a5bd40	bl 0x00c342c0
00a5bd44	b 0x00a5bd70
00a5bd48	ldr x8,[x8, #0x28]
00a5bd4c	sxtw x3,w22
00a5bd50	mov x0,x20
00a5bd54	mov x1,x23
00a5bd58	mov x2,x21
00a5bd5c	blr x8
00a5bd60	tbnz w0,#0x1f,0x00a5bd70
00a5bd64	str w0,[x19]
00a5bd68	mov w0,#0x1
00a5bd6c	b 0x00a5bd80
00a5bd70	mov w0,wzr
00a5bd74	b 0x00a5bd80
00a5bd78	str wzr,[x19]
00a5bd7c	cset w0,eq
00a5bd80	ldp x29,x30,[sp, #0x50]
00a5bd84	ldp x20,x19,[sp, #0x40]
00a5bd88	ldp x22,x21,[sp, #0x30]
00a5bd8c	ldp x24,x23,[sp, #0x20]
00a5bd90	ldp x26,x25,[sp, #0x10]
00a5bd94	ldr x27,[sp], #0x60
00a5bd98	ret
00a5bd9c	cbnz w9,0x00a5bdac
00a5bda0	ldr w10,[x20, #0x84]
00a5bda4	tst w10,w22
00a5bda8	b.eq 0x00a5be38
00a5bdac	cmp w27,#0x21
00a5bdb0	b.ge 0x00a5bf0c
00a5bdb4	cbz w9,0x00a5bdec
00a5bdb8	sub w8,w27,w9
00a5bdbc	cmp w8,w22
00a5bdc0	b.le 0x00a5bdf4
00a5bdc4	add x8,x20,x9
00a5bdc8	add x0,x8,#0x38
00a5bdcc	sxtw x2,w22
00a5bdd0	mov x1,x21
00a5bdd4	bl 0x00c2ffd0
00a5bdd8	ldr w8,[x20, #0x14]
00a5bddc	add w8,w8,w22
00a5bde0	str w8,[x20, #0x14]
00a5bde4	str wzr,[x19]
00a5bde8	b 0x00a5bd68
00a5bdec	mov w8,wzr
00a5bdf0	b 0x00a5bea4
00a5bdf4	sub w22,w22,w8
00a5bdf8	neg w10,w27
00a5bdfc	orr w11,wzr,#0x7fffffff
00a5be00	and w10,w22,w10
00a5be04	sub w11,w11,w27
00a5be08	cmp w10,w11
00a5be0c	b.le 0x00a5be5c
00a5be10	bl 0x00c342a0
00a5be14	adrp x0,0x2a5000
00a5be18	adrp x2,0x2bd000
00a5be1c	add x0,x0,#0xf9d
00a5be20	add x2,x2,#0xabf
00a5be24	mov w1,#0x26d
00a5be28	bl 0x00c342b0
00a5be2c	orr w0,wzr,#0x6
00a5be30	mov w1,#0xca
00a5be34	b 0x00a5bd3c
00a5be38	ldr x8,[x8, #0x28]
00a5be3c	sxtw x3,w22
00a5be40	mov x0,x20
00a5be44	mov x1,x23
00a5be48	mov x2,x21
00a5be4c	blr x8
00a5be50	cbz w0,0x00a5bf04
00a5be54	str w22,[x19]
00a5be58	b 0x00a5bd68
00a5be5c	add x26,x20,#0x38
00a5be60	sxtw x25,w8
00a5be64	add x0,x26,x9
00a5be68	mov x1,x21
00a5be6c	mov x2,x25
00a5be70	sxtw x24,w27
00a5be74	bl 0x00c2ffd0
00a5be78	ldr x8,[x20]
00a5be7c	mov x0,x20
00a5be80	mov x1,x23
00a5be84	mov x2,x26
00a5be88	ldr x8,[x8, #0x28]
00a5be8c	mov x3,x24
00a5be90	blr x8
00a5be94	cbz w0,0x00a5bd80
00a5be98	add x21,x21,x25
00a5be9c	add x23,x23,x24
00a5bea0	mov w8,w27
00a5bea4	sub w9,w27,#0x1
00a5bea8	and w24,w22,w9
00a5beac	sub w22,w22,w24
00a5beb0	cmp w22,#0x1
00a5beb4	str w8,[x19]
00a5beb8	b.lt 0x00a5bee8
00a5bebc	ldr x8,[x20]
00a5bec0	sxtw x3,w22
00a5bec4	mov x0,x20
00a5bec8	mov x1,x23
00a5becc	ldr x8,[x8, #0x28]
00a5bed0	mov x2,x21
00a5bed4	blr x8
00a5bed8	cbz w0,0x00a5bd80
00a5bedc	ldr w8,[x19]
00a5bee0	add w8,w8,w22
00a5bee4	str w8,[x19]
00a5bee8	cbz w24,0x00a5befc
00a5beec	add x0,x20,#0x38
00a5bef0	add x1,x21,w22, SXTW 
00a5bef4	sxtw x2,w24
00a5bef8	bl 0x00c2ffd0
00a5befc	str w24,[x20, #0x14]
00a5bf00	b 0x00a5bd68
00a5bf04	str wzr,[x19]
00a5bf08	b 0x00a5bd80
00a5bf0c	adrp x0,0x2d1000
00a5bf10	adrp x1,0x2a5000
00a5bf14	add x0,x0,#0xa0a
00a5bf18	add x1,x1,#0xf9d
00a5bf1c	mov w2,#0x25b
00a5bf20	bl 0x00c3c240

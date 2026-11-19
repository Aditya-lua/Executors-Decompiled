; mbedtls_ecdsa_verify_restartable @ 00b9bb90
00b9bb90	sub sp,sp,#0xd0
00b9bb94	stp x26,x25,[sp, #0x80]
00b9bb98	stp x24,x23,[sp, #0x90]
00b9bb9c	stp x22,x21,[sp, #0xa0]
00b9bba0	stp x20,x19,[sp, #0xb0]
00b9bba4	stp x29,x30,[sp, #0xc0]
00b9bba8	add x29,sp,#0xc0
00b9bbac	mrs x26,tpidr_el0
00b9bbb0	ldr x8,[x26, #0x28]
00b9bbb4	mov x21,x0
00b9bbb8	add x0,sp,#0x8
00b9bbbc	mov x23,x5
00b9bbc0	mov x19,x4
00b9bbc4	mov x20,x3
00b9bbc8	mov x25,x2
00b9bbcc	mov x24,x1
00b9bbd0	stur x8,[x29, #-0x48]
00b9bbd4	bl 0x00c42760
00b9bbd8	sub x0,x29,#0x58
00b9bbdc	bl 0x00c41c00
00b9bbe0	add x0,sp,#0x58
00b9bbe4	bl 0x00c41c00
00b9bbe8	add x0,sp,#0x48
00b9bbec	bl 0x00c41c00
00b9bbf0	add x0,sp,#0x38
00b9bbf4	bl 0x00c41c00
00b9bbf8	ldr w8,[x21]
00b9bbfc	orr w8,w8,#0x4
00b9bc00	cmp w8,#0xd
00b9bc04	b.ne 0x00b9bc10
00b9bc08	mov w24,#0xffffb080
00b9bc0c	b 0x00b9bc68
00b9bc10	mov x22,x21
00b9bc14	ldr x8,[x22, #0x68]!
00b9bc18	cbz x8,0x00b9bc08
00b9bc1c	mov w1,#0x1
00b9bc20	mov x0,x19
00b9bc24	bl 0x00c41b40
00b9bc28	tbnz w0,#0x1f,0x00b9bc3c
00b9bc2c	mov x0,x19
00b9bc30	mov x1,x22
00b9bc34	bl 0x00c41b50
00b9bc38	tbnz w0,#0x1f,0x00b9bc98
00b9bc3c	mov w24,#0xffffb200
00b9bc40	add x0,sp,#0x8
00b9bc44	bl 0x00c42750
00b9bc48	sub x0,x29,#0x58
00b9bc4c	bl 0x00c41bb0
00b9bc50	add x0,sp,#0x58
00b9bc54	bl 0x00c41bb0
00b9bc58	add x0,sp,#0x48
00b9bc5c	bl 0x00c41bb0
00b9bc60	add x0,sp,#0x38
00b9bc64	bl 0x00c41bb0
00b9bc68	ldr x8,[x26, #0x28]
00b9bc6c	ldur x9,[x29, #-0x48]
00b9bc70	cmp x8,x9
00b9bc74	b.ne 0x00b9be0c
00b9bc78	mov w0,w24
00b9bc7c	ldp x29,x30,[sp, #0xc0]
00b9bc80	ldp x20,x19,[sp, #0xb0]
00b9bc84	ldp x22,x21,[sp, #0xa0]
00b9bc88	ldp x24,x23,[sp, #0x90]
00b9bc8c	ldp x26,x25,[sp, #0x80]
00b9bc90	add sp,sp,#0xd0
00b9bc94	ret
00b9bc98	mov w1,#0x1
00b9bc9c	mov x0,x23
00b9bca0	bl 0x00c41b40
00b9bca4	tbnz w0,#0x1f,0x00b9bc3c
00b9bca8	mov x0,x23
00b9bcac	mov x1,x22
00b9bcb0	bl 0x00c41b50
00b9bcb4	tbz w0,#0x1f,0x00b9bc3c
00b9bcb8	ldr x8,[x21, #0x80]
00b9bcbc	sub x0,x29,#0x58
00b9bcc0	mov x1,x24
00b9bcc4	add x8,x8,#0x7
00b9bcc8	lsr x8,x8,#0x3
00b9bccc	cmp x8,x25
00b9bcd0	csel x25,x8,x25,cc
00b9bcd4	mov x2,x25
00b9bcd8	bl 0x00c41ca0
00b9bcdc	mov w24,w0
00b9bce0	cbnz w0,0x00b9bc40
00b9bce4	ldr x8,[x21, #0x80]
00b9bce8	lsl x9,x25,#0x3
00b9bcec	subs x1,x9,x8
00b9bcf0	b.ls 0x00b9bd04
00b9bcf4	sub x0,x29,#0x58
00b9bcf8	bl 0x00c41d10
00b9bcfc	mov w24,w0
00b9bd00	cbnz w0,0x00b9bc40
00b9bd04	sub x0,x29,#0x58
00b9bd08	mov x1,x22
00b9bd0c	bl 0x00c41b50
00b9bd10	tbnz w0,#0x1f,0x00b9bd2c
00b9bd14	sub x0,x29,#0x58
00b9bd18	sub x1,x29,#0x58
00b9bd1c	mov x2,x22
00b9bd20	bl 0x00c41d60
00b9bd24	mov w24,w0
00b9bd28	cbnz w0,0x00b9bc40
00b9bd2c	add x0,sp,#0x58
00b9bd30	mov x1,x23
00b9bd34	mov x2,x22
00b9bd38	bl 0x00c41c10
00b9bd3c	mov w24,w0
00b9bd40	cbnz w0,0x00b9bc40
00b9bd44	add x0,sp,#0x48
00b9bd48	sub x1,x29,#0x58
00b9bd4c	add x2,sp,#0x58
00b9bd50	bl 0x00c41c80
00b9bd54	mov w24,w0
00b9bd58	cbnz w0,0x00b9bc40
00b9bd5c	add x0,sp,#0x48
00b9bd60	add x1,sp,#0x48
00b9bd64	mov x2,x22
00b9bd68	bl 0x00c41c60
00b9bd6c	mov w24,w0
00b9bd70	cbnz w0,0x00b9bc40
00b9bd74	add x0,sp,#0x38
00b9bd78	add x2,sp,#0x58
00b9bd7c	mov x1,x19
00b9bd80	bl 0x00c41c80
00b9bd84	mov w24,w0
00b9bd88	cbnz w0,0x00b9bc40
00b9bd8c	add x0,sp,#0x38
00b9bd90	add x1,sp,#0x38
00b9bd94	mov x2,x22
00b9bd98	bl 0x00c41c60
00b9bd9c	mov w24,w0
00b9bda0	cbnz w0,0x00b9bc40
00b9bda4	add x3,x21,#0x38
00b9bda8	add x1,sp,#0x8
00b9bdac	add x2,sp,#0x48
00b9bdb0	add x4,sp,#0x38
00b9bdb4	mov x0,x21
00b9bdb8	mov x5,x20
00b9bdbc	mov x6,xzr
00b9bdc0	bl 0x00c42730
00b9bdc4	mov w24,w0
00b9bdc8	cbnz w0,0x00b9bc40
00b9bdcc	add x0,sp,#0x8
00b9bdd0	bl 0x00c426d0
00b9bdd4	cbnz w0,0x00b9bc3c
00b9bdd8	add x0,sp,#0x8
00b9bddc	add x1,sp,#0x8
00b9bde0	mov x2,x22
00b9bde4	bl 0x00c41c60
00b9bde8	mov w24,w0
00b9bdec	cbnz w0,0x00b9bc40
00b9bdf0	add x0,sp,#0x8
00b9bdf4	mov x1,x19
00b9bdf8	bl 0x00c41b50
00b9bdfc	cmp w0,#0x0
00b9be00	mov w8,#0xffffb200
00b9be04	csel w24,wzr,w8,eq
00b9be08	b 0x00b9bc40
00b9be0c	bl 0x00c2fec0

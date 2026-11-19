; ossl_pool_acquire_entropy @ 00b5bbe8
00b5bbe8	sub sp,sp,#0x170
00b5bbec	mov w1,#0x1
00b5bbf0	stp x28,x27,[sp, #0x110]
00b5bbf4	stp x26,x25,[sp, #0x120]
00b5bbf8	stp x24,x23,[sp, #0x130]
00b5bbfc	stp x22,x21,[sp, #0x140]
00b5bc00	stp x20,x19,[sp, #0x150]
00b5bc04	stp x29,x30,[sp, #0x160]
00b5bc08	add x29,sp,#0x160
00b5bc0c	mov x19,x0
00b5bc10	bl 0x00c3f9c0
00b5bc14	cbz x0,0x00b5bcc0
00b5bc18	adrp x23,0xcb5000
00b5bc1c	ldr x23,[x23, #0x8f8]
00b5bc20	mov x20,x0
00b5bc24	orr w24,wzr,#0x3
00b5bc28	subs w24,w24,#0x1
00b5bc2c	b.lt 0x00b5bcc0
00b5bc30	mov x0,x19
00b5bc34	mov x1,x20
00b5bc38	bl 0x00c3f9a0
00b5bc3c	mov x21,x0
00b5bc40	cbz x23,0x00b5bc68
00b5bc44	mov x0,x21
00b5bc48	mov x1,x20
00b5bc4c	bl 0x00c41820
00b5bc50	mov x22,x20
00b5bc54	cbz w0,0x00b5bc80
00b5bc58	bl 0x00c30710
00b5bc5c	ldr w8,[x0]
00b5bc60	cmp w8,#0x26
00b5bc64	b.ne 0x00b5bcb4
00b5bc68	mov w0,#0x116
00b5bc6c	mov x1,x21
00b5bc70	mov x2,x20
00b5bc74	mov w3,wzr
00b5bc78	bl 0x00c30bb0
00b5bc7c	mov x22,x0
00b5bc80	cmp x22,#0x1
00b5bc84	b.lt 0x00b5bca8
00b5bc88	lsl x2,x22,#0x3
00b5bc8c	mov x0,x19
00b5bc90	mov x1,x22
00b5bc94	bl 0x00c3f9b0
00b5bc98	sub x20,x20,x22
00b5bc9c	orr w24,wzr,#0x3
00b5bca0	cbnz x20,0x00b5bc28
00b5bca4	b 0x00b5bcc0
00b5bca8	tbz x22,#0x3f,0x00b5bcbc
00b5bcac	bl 0x00c30710
00b5bcb0	ldr w8,[x0]
00b5bcb4	cmp w8,#0x4
00b5bcb8	b.ne 0x00b5bcc0
00b5bcbc	cbnz x20,0x00b5bc28
00b5bcc0	mov x0,x19
00b5bcc4	bl 0x00c3f9d0
00b5bcc8	cbnz x0,0x00b5bf04
00b5bccc	mov w1,#0x1
00b5bcd0	mov x0,x19
00b5bcd4	bl 0x00c3f9c0
00b5bcd8	cbz x0,0x00b5bef8
00b5bcdc	adrp x25,0xd23000
00b5bce0	adrp x26,0xca4000
00b5bce4	mov x20,x0
00b5bce8	mov x23,xzr
00b5bcec	mov w24,#0x28
00b5bcf0	add x25,x25,#0x828
00b5bcf4	add x26,x26,#0xf58
00b5bcf8	madd x28,x23,x24,x25
00b5bcfc	ldr w0,[x28]
00b5bd00	cmn w0,#0x1
00b5bd04	b.eq 0x00b5bd6c
00b5bd08	add x1,sp,#0x88
00b5bd0c	bl 0x00c31d70
00b5bd10	cmn w0,#0x1
00b5bd14	b.eq 0x00b5bd6c
00b5bd18	madd x8,x23,x24,x25
00b5bd1c	ldr x8,[x8, #0x8]
00b5bd20	ldr x9,[sp, #0x88]
00b5bd24	cmp x8,x9
00b5bd28	b.ne 0x00b5bd6c
00b5bd2c	madd x8,x23,x24,x25
00b5bd30	ldr x8,[x8, #0x10]
00b5bd34	ldr x9,[sp, #0x90]
00b5bd38	cmp x8,x9
00b5bd3c	b.ne 0x00b5bd6c
00b5bd40	madd x8,x23,x24,x25
00b5bd44	ldr w8,[x8, #0x18]
00b5bd48	ldr w9,[sp, #0x98]
00b5bd4c	eor w8,w9,w8
00b5bd50	cmp w8,#0x200
00b5bd54	b.cs 0x00b5bd6c
00b5bd58	madd x8,x23,x24,x25
00b5bd5c	ldr x8,[x8, #0x20]
00b5bd60	ldr x9,[sp, #0xa8]
00b5bd64	cmp x8,x9
00b5bd68	b.eq 0x00b5bdb4
00b5bd6c	ldr x0,[x26, x23, LSL #0x3]
00b5bd70	mov w1,wzr
00b5bd74	bl 0x00c31d80
00b5bd78	cmn w0,#0x1
00b5bd7c	str w0,[x28]
00b5bd80	b.eq 0x00b5bed0
00b5bd84	mov x1,sp
00b5bd88	bl 0x00c31d70
00b5bd8c	cmn w0,#0x1
00b5bd90	b.eq 0x00b5bee4
00b5bd94	ldr q0,[sp]
00b5bd98	ldr w8,[sp, #0x10]
00b5bd9c	ldr x9,[sp, #0x20]
00b5bda0	nop
00b5bda4	madd x10,x23,x24,x25
00b5bda8	stur q0,[x10, #0x8]
00b5bdac	str w8,[x10, #0x18]
00b5bdb0	str x9,[x10, #0x20]
00b5bdb4	ldr w21,[x28]
00b5bdb8	cmn w21,#0x1
00b5bdbc	b.eq 0x00b5bed0
00b5bdc0	mov x22,xzr
00b5bdc4	orr w27,wzr,#0x3
00b5bdc8	subs w27,w27,#0x1
00b5bdcc	b.lt 0x00b5be30
00b5bdd0	mov x0,x19
00b5bdd4	mov x1,x20
00b5bdd8	bl 0x00c3f9a0
00b5bddc	mov x1,x0
00b5bde0	mov w0,w21
00b5bde4	mov x2,x20
00b5bde8	bl 0x00c31ef0
00b5bdec	mov x22,x0
00b5bdf0	cmp x0,#0x1
00b5bdf4	b.lt 0x00b5be18
00b5bdf8	lsl x2,x22,#0x3
00b5bdfc	mov x0,x19
00b5be00	mov x1,x22
00b5be04	bl 0x00c3f9b0
00b5be08	sub x20,x20,x22
00b5be0c	orr w27,wzr,#0x3
00b5be10	cbnz x20,0x00b5bdc8
00b5be14	b 0x00b5be30
00b5be18	tbz x22,#0x3f,0x00b5be2c
00b5be1c	bl 0x00c30710
00b5be20	ldr w8,[x0]
00b5be24	cmp w8,#0x4
00b5be28	b.ne 0x00b5be40
00b5be2c	cbnz x20,0x00b5bdc8
00b5be30	tbnz x22,#0x3f,0x00b5be40
00b5be34	adrp x8,0xcca000
00b5be38	ldr w8,[x8, #0x448]
00b5be3c	cbnz w8,0x00b5bec0
00b5be40	ldr w0,[x28]
00b5be44	cmn w0,#0x1
00b5be48	b.eq 0x00b5beb8
00b5be4c	add x1,sp,#0x88
00b5be50	bl 0x00c31d70
00b5be54	cmn w0,#0x1
00b5be58	b.eq 0x00b5beb8
00b5be5c	madd x8,x23,x24,x25
00b5be60	ldr x8,[x8, #0x8]
00b5be64	ldr x9,[sp, #0x88]
00b5be68	cmp x8,x9
00b5be6c	b.ne 0x00b5beb8
00b5be70	madd x8,x23,x24,x25
00b5be74	ldr x8,[x8, #0x10]
00b5be78	ldr x9,[sp, #0x90]
00b5be7c	cmp x8,x9
00b5be80	b.ne 0x00b5beb8
00b5be84	madd x8,x23,x24,x25
00b5be88	ldr w8,[x8, #0x18]
00b5be8c	ldr w9,[sp, #0x98]
00b5be90	eor w8,w9,w8
00b5be94	cmp w8,#0x200
00b5be98	b.cs 0x00b5beb8
00b5be9c	madd x8,x23,x24,x25
00b5bea0	ldr x8,[x8, #0x20]
00b5bea4	ldr x9,[sp, #0xa8]
00b5bea8	cmp x8,x9
00b5beac	b.ne 0x00b5beb8
00b5beb0	ldr w0,[x28]
00b5beb4	bl 0x00c31bf0
00b5beb8	mov w8,#0xffffffff
00b5bebc	str w8,[x28]
00b5bec0	mov w1,#0x1
00b5bec4	mov x0,x19
00b5bec8	bl 0x00c3f9c0
00b5becc	mov x20,x0
00b5bed0	cbz x20,0x00b5bef8
00b5bed4	add x23,x23,#0x1
00b5bed8	cmp x23,#0x4
00b5bedc	b.cc 0x00b5bcf8
00b5bee0	b 0x00b5bef8
00b5bee4	ldr w0,[x28]
00b5bee8	bl 0x00c31bf0
00b5beec	mov w8,#0xffffffff
00b5bef0	str w8,[x28]
00b5bef4	cbnz x20,0x00b5bed4
00b5bef8	mov x0,x19
00b5befc	bl 0x00c3f9d0
00b5bf00	cbz x0,0x00b5bf24
00b5bf04	ldp x29,x30,[sp, #0x160]
00b5bf08	ldp x20,x19,[sp, #0x150]
00b5bf0c	ldp x22,x21,[sp, #0x140]
00b5bf10	ldp x24,x23,[sp, #0x130]
00b5bf14	ldp x26,x25,[sp, #0x120]
00b5bf18	ldp x28,x27,[sp, #0x110]
00b5bf1c	add sp,sp,#0x170
00b5bf20	ret
00b5bf24	mov x0,x19
00b5bf28	ldp x29,x30,[sp, #0x160]
00b5bf2c	ldp x20,x19,[sp, #0x150]
00b5bf30	ldp x22,x21,[sp, #0x140]
00b5bf34	ldp x24,x23,[sp, #0x130]
00b5bf38	ldp x26,x25,[sp, #0x120]
00b5bf3c	ldp x28,x27,[sp, #0x110]
00b5bf40	add sp,sp,#0x170
00b5bf44	b 0x00c3f9d0

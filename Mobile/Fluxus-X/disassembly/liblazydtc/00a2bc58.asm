; BN_GF2m_mod_mul_arr @ 00a2bc58
00a2bc58	sub sp,sp,#0xd0
00a2bc5c	stp x26,x25,[sp, #0x80]
00a2bc60	stp x24,x23,[sp, #0x90]
00a2bc64	stp x22,x21,[sp, #0xa0]
00a2bc68	mov x23,x4
00a2bc6c	mov x24,x3
00a2bc70	mov x22,x1
00a2bc74	cmp x1,x2
00a2bc78	mov x25,x0
00a2bc7c	stp x28,x27,[sp, #0x70]
00a2bc80	stp x20,x19,[sp, #0xb0]
00a2bc84	stp x29,x30,[sp, #0xc0]
00a2bc88	add x29,sp,#0xc0
00a2bc8c	b.eq 0x00a2be74
00a2bc90	mov x0,x23
00a2bc94	mov x26,x2
00a2bc98	bl 0x00c38a90
00a2bc9c	mov x0,x23
00a2bca0	bl 0x00c38a40
00a2bca4	cbz x0,0x00a2be90
00a2bca8	ldr w20,[x22, #0x8]
00a2bcac	ldr w21,[x26, #0x8]
00a2bcb0	mov x27,x0
00a2bcb4	add w8,w20,w21
00a2bcb8	add w19,w8,#0x4
00a2bcbc	mov w1,w19
00a2bcc0	bl 0x00c38e80
00a2bcc4	cbz x0,0x00a2be90
00a2bcc8	cmp w19,#0x1
00a2bccc	stp x25,x24,[sp]
00a2bcd0	str x23,[sp, #0x10]
00a2bcd4	str w19,[x27, #0x8]
00a2bcd8	b.lt 0x00a2bcf8
00a2bcdc	ldr x0,[x27]
00a2bce0	add w8,w20,w21
00a2bce4	add w8,w8,#0x3
00a2bce8	lsl x8,x8,#0x3
00a2bcec	add x2,x8,#0x8
00a2bcf0	mov w1,wzr
00a2bcf4	bl 0x00c301c0
00a2bcf8	ldr w8,[x26, #0x8]
00a2bcfc	str x27,[sp, #0x38]
00a2bd00	cmp w8,#0x1
00a2bd04	b.lt 0x00a2be4c
00a2bd08	add x9,sp,#0x40
00a2bd0c	add x10,x9,#0x18
00a2bd10	mov x24,xzr
00a2bd14	mov x11,xzr
00a2bd18	str x10,[sp, #0x30]
00a2bd1c	add x10,x9,#0x10
00a2bd20	add x27,x9,#0x8
00a2bd24	str x10,[sp, #0x28]
00a2bd28	str x26,[sp, #0x18]
00a2bd2c	ldr x9,[x26]
00a2bd30	orr x10,x11,#0x1
00a2bd34	cmp x10,w8, UXTW 
00a2bd38	mov x20,xzr
00a2bd3c	ldr x28,[x9, x11, LSL #0x3]
00a2bd40	b.eq 0x00a2bd48
00a2bd44	ldr x20,[x9, x10, LSL #0x3]
00a2bd48	ldr w9,[x22, #0x8]
00a2bd4c	cmp w9,#0x1
00a2bd50	b.lt 0x00a2be3c
00a2bd54	mov x25,xzr
00a2bd58	eor x21,x20,x28
00a2bd5c	orr w26,wzr,#0x18
00a2bd60	str x11,[sp, #0x20]
00a2bd64	ldr x8,[x22]
00a2bd68	add x10,x25,#0x1
00a2bd6c	cmp x10,w9, UXTW 
00a2bd70	mov x23,xzr
00a2bd74	ldr x19,[x8, x25, LSL #0x3]
00a2bd78	b.eq 0x00a2bd84
00a2bd7c	add x8,x8,x25, LSL #0x3
00a2bd80	ldr x23,[x8, #0x8]
00a2bd84	ldp x1,x0,[sp, #0x28]
00a2bd88	mov x2,x23
00a2bd8c	mov x3,x20
00a2bd90	bl 0x00a2e40c
00a2bd94	add x1,sp,#0x40
00a2bd98	mov x0,x27
00a2bd9c	mov x2,x19
00a2bda0	mov x3,x28
00a2bda4	bl 0x00a2e40c
00a2bda8	eor x2,x23,x19
00a2bdac	sub x0,x29,#0x58
00a2bdb0	add x1,sp,#0x60
00a2bdb4	mov x3,x21
00a2bdb8	bl 0x00a2e40c
00a2bdbc	ldp x8,x9,[sp, #0x48]
00a2bdc0	ldur x10,[x29, #-0x58]
00a2bdc4	ldp x11,x12,[sp, #0x58]
00a2bdc8	eor x8,x9,x8
00a2bdcc	eor x9,x8,x10
00a2bdd0	ldr x10,[sp, #0x40]
00a2bdd4	eor x9,x9,x11
00a2bdd8	eor x8,x8,x10
00a2bddc	eor x8,x8,x12
00a2bde0	ldr x12,[sp, #0x38]
00a2bde4	stp x8,x9,[sp, #0x48]
00a2bde8	ldr x12,[x12]
00a2bdec	add x12,x12,x24
00a2bdf0	add x13,x12,x26
00a2bdf4	ldur x14,[x13, #-0x18]
00a2bdf8	add x12,x12,x25, LSL #0x3
00a2bdfc	add x25,x25,#0x2
00a2be00	add x26,x26,#0x10
00a2be04	eor x10,x14,x10
00a2be08	stur x10,[x13, #-0x18]
00a2be0c	ldp x10,x14,[x12, #0x8]
00a2be10	eor x8,x10,x8
00a2be14	eor x9,x14,x9
00a2be18	stp x8,x9,[x12, #0x8]
00a2be1c	ldr x8,[x13]
00a2be20	eor x8,x8,x11
00a2be24	str x8,[x13]
00a2be28	ldr w9,[x22, #0x8]
00a2be2c	cmp w9,w25
00a2be30	b.gt 0x00a2bd64
00a2be34	ldp x26,x11,[sp, #0x18]
00a2be38	ldr w8,[x26, #0x8]
00a2be3c	add x11,x11,#0x2
00a2be40	cmp w8,w11
00a2be44	add x24,x24,#0x10
00a2be48	b.gt 0x00a2bd2c
00a2be4c	ldr x19,[sp, #0x38]
00a2be50	mov x0,x19
00a2be54	bl 0x00c38e40
00a2be58	ldp x0,x2,[sp]
00a2be5c	mov x1,x19
00a2be60	bl 0x00a2b7b0
00a2be64	ldr x23,[sp, #0x10]
00a2be68	cmp w0,#0x0
00a2be6c	cset w19,ne
00a2be70	b 0x00a2be94
00a2be74	mov x0,x25
00a2be78	mov x1,x22
00a2be7c	mov x2,x24
00a2be80	mov x3,x23
00a2be84	bl 0x00a2bec0
00a2be88	mov w19,w0
00a2be8c	b 0x00a2be9c
00a2be90	mov w19,wzr
00a2be94	mov x0,x23
00a2be98	bl 0x00c38a20
00a2be9c	mov w0,w19
00a2bea0	ldp x29,x30,[sp, #0xc0]
00a2bea4	ldp x20,x19,[sp, #0xb0]
00a2bea8	ldp x22,x21,[sp, #0xa0]
00a2beac	ldp x24,x23,[sp, #0x90]
00a2beb0	ldp x26,x25,[sp, #0x80]
00a2beb4	ldp x28,x27,[sp, #0x70]
00a2beb8	add sp,sp,#0xd0
00a2bebc	ret

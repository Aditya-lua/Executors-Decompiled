; X509_NAME_oneline @ 00b0baf0
00b0baf0	sub sp,sp,#0xf0
00b0baf4	stp x26,x25,[sp, #0xa0]
00b0baf8	stp x22,x21,[sp, #0xc0]
00b0bafc	stp x20,x19,[sp, #0xd0]
00b0bb00	mov w21,w2
00b0bb04	mov x20,x1
00b0bb08	mov x25,x0
00b0bb0c	str d8,[sp, #0x80]
00b0bb10	stp x28,x27,[sp, #0x90]
00b0bb14	stp x24,x23,[sp, #0xb0]
00b0bb18	stp x29,x30,[sp, #0xe0]
00b0bb1c	add x29,sp,#0xe0
00b0bb20	cbz x1,0x00b0be50
00b0bb24	mov x0,xzr
00b0bb28	cbz w21,0x00b0bf78
00b0bb2c	cbz x25,0x00b0be7c
00b0bb30	stp x20,x0,[sp, #0x10]
00b0bb34	ldr x0,[x25]
00b0bb38	bl 0x00c325e0
00b0bb3c	cmp w0,#0x1
00b0bb40	b.lt 0x00b0bec0
00b0bb44	add x28,sp,#0x70
00b0bb48	str x21,[sp, #0x8]
00b0bb4c	mov w27,wzr
00b0bb50	mov w23,wzr
00b0bb54	mov w20,#0xffffffff
00b0bb58	mov w22,#0x1
00b0bb5c	movi v8.2S,#0x1
00b0bb60	mov w21,#0x4
00b0bb64	add x8,x28,#0xc
00b0bb68	str x8,[sp]
00b0bb6c	ldr x0,[x25]
00b0bb70	mov w1,w23
00b0bb74	stur w20,[x29, #-0x54]
00b0bb78	bl 0x00c32610
00b0bb7c	mov x24,x0
00b0bb80	ldr x0,[x0]
00b0bb84	bl 0x00c37750
00b0bb88	cbz w0,0x00b0bb98
00b0bb8c	bl 0x00c324f0
00b0bb90	mov x19,x0
00b0bb94	cbnz x0,0x00b0bbac
00b0bb98	ldr x2,[x24]
00b0bb9c	add x0,sp,#0x20
00b0bba0	mov w1,#0x50
00b0bba4	add x19,sp,#0x20
00b0bba8	bl 0x00c32dc0
00b0bbac	mov x0,x19
00b0bbb0	bl 0x00c2ff50
00b0bbb4	ldr x9,[x24, #0x8]
00b0bbb8	ldr w20,[x9]
00b0bbbc	cmp w20,#0x100, LSL #12
00b0bbc0	b.gt 0x00b0bf28
00b0bbc4	ldr x8,[x9, #0x8]
00b0bbc8	mov x26,x0
00b0bbcc	tst w20,#0x3
00b0bbd0	b.ne 0x00b0bc88
00b0bbd4	ldr w9,[x9, #0x4]
00b0bbd8	cmp w9,#0x1b
00b0bbdc	b.ne 0x00b0bc88
00b0bbe0	cmp w20,#0x1
00b0bbe4	stp xzr,xzr,[sp, #0x70]
00b0bbe8	b.lt 0x00b0bc70
00b0bbec	cmp w20,#0x1
00b0bbf0	b.eq 0x00b0be40
00b0bbf4	sub x9,x20,#0x1
00b0bbf8	cmp x9,#0x3
00b0bbfc	mov x9,xzr
00b0bc00	b.hi 0x00b0bc48
00b0bc04	mov x10,xzr
00b0bc08	and x9,x20,#0xfffffffe
00b0bc0c	add x11,x8,x10
00b0bc10	ldrb w12,[x11]
00b0bc14	ldrb w11,[x11, #0x1]
00b0bc18	cbz w12,0x00b0bc24
00b0bc1c	and x12,x10,#0x2
00b0bc20	str w22,[x28, x12, LSL #0x2]
00b0bc24	cbz w11,0x00b0bc34
00b0bc28	add x11,x10,#0x1
00b0bc2c	and x11,x11,#0x3
00b0bc30	str w22,[x28, x11, LSL #0x2]
00b0bc34	add x10,x10,#0x2
00b0bc38	cmp x9,x10
00b0bc3c	b.ne 0x00b0bc0c
00b0bc40	cmp x9,x20
00b0bc44	b.eq 0x00b0bc64
00b0bc48	ldrb w10,[x8, x9]
00b0bc4c	cbz w10,0x00b0bc58
00b0bc50	and x10,x9,#0x3
00b0bc54	str w22,[x28, x10, LSL #0x2]
00b0bc58	add x9,x9,#0x1
00b0bc5c	cmp x20,x9
00b0bc60	b.ne 0x00b0bc48
00b0bc64	ldp w9,w11,[sp, #0x70]
00b0bc68	ldr w10,[sp, #0x78]
00b0bc6c	b 0x00b0bc7c
00b0bc70	mov w10,wzr
00b0bc74	mov w11,wzr
00b0bc78	mov w9,wzr
00b0bc7c	orr w9,w11,w9
00b0bc80	orr w9,w9,w10
00b0bc84	cbz w9,0x00b0be30
00b0bc88	add x9,sp,#0x70
00b0bc8c	str w22,[sp, #0x7c]
00b0bc90	stur d8,[sp, #0x74]
00b0bc94	cmp w20,#0x1
00b0bc98	str w22,[x9]
00b0bc9c	b.lt 0x00b0bcec
00b0bca0	mov x10,xzr
00b0bca4	mov w9,wzr
00b0bca8	and x11,x10,#0x3
00b0bcac	ldr w11,[x28, x11, LSL #0x2]
00b0bcb0	cbz w11,0x00b0bcdc
00b0bcb4	ldrb w11,[x8, x10]
00b0bcb8	orr w12,w11,#0x4
00b0bcbc	cmp w12,#0x2f
00b0bcc0	b.ne 0x00b0bccc
00b0bcc4	add w9,w9,#0x2
00b0bcc8	b 0x00b0bcdc
00b0bccc	sub w11,w11,#0x20
00b0bcd0	cmp w11,#0x5e
00b0bcd4	csinc w11,w21,wzr,hi
00b0bcd8	add w9,w11,w9
00b0bcdc	add x10,x10,#0x1
00b0bce0	cmp x20,x10
00b0bce4	b.ne 0x00b0bca8
00b0bce8	b 0x00b0bcf0
00b0bcec	mov w9,wzr
00b0bcf0	add w8,w9,w27
00b0bcf4	add w8,w8,w26
00b0bcf8	add w22,w8,#0x2
00b0bcfc	cmp w22,#0x100, LSL #12
00b0bd00	b.gt 0x00b0bf44
00b0bd04	ldr x0,[sp, #0x18]
00b0bd08	cbz x0,0x00b0bd34
00b0bd0c	add w8,w22,#0x1
00b0bd10	sxtw x1,w8
00b0bd14	mov x21,x25
00b0bd18	mov x25,x0
00b0bd1c	bl 0x00c37000
00b0bd20	cbz x0,0x00b0beec
00b0bd24	ldr x8,[x25, #0x8]
00b0bd28	mov x25,x21
00b0bd2c	mov w21,#0x4
00b0bd30	b 0x00b0bd44
00b0bd34	ldr x8,[sp, #0x8]
00b0bd38	cmp w22,w8
00b0bd3c	ldr x8,[sp, #0x10]
00b0bd40	b.ge 0x00b0bf18
00b0bd44	ldr w9,[x24, #0x10]
00b0bd48	add x27,x8,w27, SXTW 
00b0bd4c	ldur w8,[x29, #-0x54]
00b0bd50	and x2,x26,#0xffffffff
00b0bd54	mov x1,x19
00b0bd58	cmp w8,w9
00b0bd5c	mov w8,#0x2f
00b0bd60	mov w9,#0x2b
00b0bd64	csel w8,w9,w8,eq
00b0bd68	strb w8,[x27], #0x1
00b0bd6c	mov x0,x27
00b0bd70	bl 0x00c2ffd0
00b0bd74	add x8,x27,w26, SXTW 
00b0bd78	mov w9,#0x3d
00b0bd7c	cmp w20,#0x1
00b0bd80	strb w9,[x8], #0x1
00b0bd84	b.lt 0x00b0be08
00b0bd88	ldr x9,[x24, #0x8]
00b0bd8c	adrp x14,0x2a3000
00b0bd90	mov x10,xzr
00b0bd94	mov w13,#0x785c
00b0bd98	ldr x9,[x9, #0x8]
00b0bd9c	add x14,x14,#0x64c
00b0bda0	mov w15,#0x5c
00b0bda4	and x11,x10,#0x3
00b0bda8	ldr w11,[x28, x11, LSL #0x2]
00b0bdac	cbz w11,0x00b0bdfc
00b0bdb0	ldrb w11,[x9, x10]
00b0bdb4	sub w12,w11,#0x20
00b0bdb8	cmp w12,#0x5f
00b0bdbc	b.cc 0x00b0bde8
00b0bdc0	lsr w12,w11,#0x4
00b0bdc4	ldrb w12,[x14, w12, UXTW ]
00b0bdc8	and w11,w11,#0xf
00b0bdcc	ldrb w11,[x14, w11, UXTW ]
00b0bdd0	strh w13,[x8]
00b0bdd4	strb w12,[x8, #0x2]
00b0bdd8	add x12,x8,#0x4
00b0bddc	strb w11,[x8, #0x3]
00b0bde0	mov x8,x12
00b0bde4	b 0x00b0bdfc
00b0bde8	orr w12,w11,#0x4
00b0bdec	cmp w12,#0x2f
00b0bdf0	b.ne 0x00b0bdf8
00b0bdf4	strb w15,[x8], #0x1
00b0bdf8	strb w11,[x8], #0x1
00b0bdfc	add x10,x10,#0x1
00b0be00	cmp x20,x10
00b0be04	b.ne 0x00b0bda4
00b0be08	strb wzr,[x8]
00b0be0c	ldr x0,[x25]
00b0be10	ldr w20,[x24, #0x10]
00b0be14	add w23,w23,#0x1
00b0be18	bl 0x00c325e0
00b0be1c	cmp w23,w0
00b0be20	mov w27,w22
00b0be24	mov w22,#0x1
00b0be28	b.lt 0x00b0bb6c
00b0be2c	b 0x00b0bec4
00b0be30	ldr x9,[sp]
00b0be34	str wzr,[sp, #0x78]
00b0be38	str xzr,[sp, #0x70]
00b0be3c	b 0x00b0bc94
00b0be40	mov x9,xzr
00b0be44	ldrb w10,[x8, x9]
00b0be48	cbnz w10,0x00b0bc50
00b0be4c	b 0x00b0bc58
00b0be50	bl 0x00c37020
00b0be54	cbz x0,0x00b0beb8
00b0be58	mov w1,#0xc8
00b0be5c	mov x19,x0
00b0be60	bl 0x00c37000
00b0be64	cbz x0,0x00b0bee8
00b0be68	ldr x8,[x19, #0x8]
00b0be6c	mov w21,#0xc8
00b0be70	mov x0,x19
00b0be74	strb wzr,[x8]
00b0be78	cbnz x25,0x00b0bb30
00b0be7c	cbz x0,0x00b0be94
00b0be80	ldr x20,[x0, #0x8]
00b0be84	adrp x1,0x2ca000
00b0be88	add x1,x1,#0x57f
00b0be8c	mov w2,#0x37
00b0be90	bl 0x00c32310
00b0be94	sxtw x19,w21
00b0be98	adrp x1,0x2dc000
00b0be9c	add x1,x1,#0xb7e
00b0bea0	mov x0,x20
00b0bea4	mov x2,x19
00b0bea8	bl 0x00c30ba0
00b0beac	add x8,x20,x19
00b0beb0	sturb wzr,[x8, #-0x1]
00b0beb4	b 0x00b0bf7c
00b0beb8	str xzr,[sp, #0x18]
00b0bebc	b 0x00b0beec
00b0bec0	mov w23,wzr
00b0bec4	ldr x0,[sp, #0x18]
00b0bec8	cbz x0,0x00b0bf18
00b0becc	ldr x20,[x0, #0x8]
00b0bed0	adrp x1,0x2ca000
00b0bed4	add x1,x1,#0x57f
00b0bed8	mov w2,#0xb0
00b0bedc	bl 0x00c32310
00b0bee0	cbnz w23,0x00b0bf7c
00b0bee4	b 0x00b0bf20
00b0bee8	str x19,[sp, #0x18]
00b0beec	bl 0x00c342a0
00b0bef0	adrp x0,0x2ca000
00b0bef4	adrp x2,0x2b0000
00b0bef8	add x0,x0,#0x57f
00b0befc	add x2,x2,#0xa72
00b0bf00	mov w1,#0xb7
00b0bf04	bl 0x00c342b0
00b0bf08	mov w1,#0x100
00b0bf0c	mov w0,#0xb
00b0bf10	movk w1,#0xc, LSL #16
00b0bf14	b 0x00b0bf68
00b0bf18	ldr x20,[sp, #0x10]
00b0bf1c	cbnz w23,0x00b0bf7c
00b0bf20	strb wzr,[x20]
00b0bf24	b 0x00b0bf7c
00b0bf28	bl 0x00c342a0
00b0bf2c	adrp x0,0x2ca000
00b0bf30	adrp x2,0x2b0000
00b0bf34	add x0,x0,#0x57f
00b0bf38	add x2,x2,#0xa72
00b0bf3c	mov w1,#0x4c
00b0bf40	b 0x00b0bf5c
00b0bf44	bl 0x00c342a0
00b0bf48	adrp x0,0x2ca000
00b0bf4c	adrp x2,0x2b0000
00b0bf50	add x0,x0,#0x57f
00b0bf54	add x2,x2,#0xa72
00b0bf58	mov w1,#0x7a
00b0bf5c	bl 0x00c342b0
00b0bf60	mov w0,#0xb
00b0bf64	mov w1,#0x86
00b0bf68	mov x2,xzr
00b0bf6c	bl 0x00c342c0
00b0bf70	ldr x0,[sp, #0x18]
00b0bf74	bl 0x00c35660
00b0bf78	mov x20,xzr
00b0bf7c	mov x0,x20
00b0bf80	ldp x29,x30,[sp, #0xe0]
00b0bf84	ldp x20,x19,[sp, #0xd0]
00b0bf88	ldp x22,x21,[sp, #0xc0]
00b0bf8c	ldp x24,x23,[sp, #0xb0]
00b0bf90	ldp x26,x25,[sp, #0xa0]
00b0bf94	ldp x28,x27,[sp, #0x90]
00b0bf98	ldr d8,[sp, #0x80]
00b0bf9c	add sp,sp,#0xf0
00b0bfa0	ret

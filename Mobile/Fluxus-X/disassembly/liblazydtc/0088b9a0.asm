; FUN_0088b9a0 @ 0088b9a0
0088b9a0	sub sp,sp,#0x90
0088b9a4	stp x29,x30,[sp, #0x30]
0088b9a8	stp x28,x27,[sp, #0x40]
0088b9ac	stp x26,x25,[sp, #0x50]
0088b9b0	stp x24,x23,[sp, #0x60]
0088b9b4	stp x22,x21,[sp, #0x70]
0088b9b8	stp x20,x19,[sp, #0x80]
0088b9bc	add x29,sp,#0x30
0088b9c0	mrs x8,tpidr_el0
0088b9c4	mov x28,#0x2d69
0088b9c8	mov x10,#0x959d
0088b9cc	str x8,[sp, #0x18]
0088b9d0	movk x28,#0xeb38, LSL #16
0088b9d4	movk x10,#0xb8f4, LSL #16
0088b9d8	ldr x8,[x8, #0x28]
0088b9dc	movk x28,#0xea08, LSL #32
0088b9e0	movk x10,#0xd34f, LSL #32
0088b9e4	mov w23,w3
0088b9e8	mov w20,w2
0088b9ec	mov x21,x1
0088b9f0	stur x8,[x29, #-0x8]
0088b9f4	mov x19,x0
0088b9f8	movk x28,#0x9ddf, LSL #48
0088b9fc	ldr x8,[x0, #0x90]
0088ba00	movk x10,#0x949d, LSL #48
0088ba04	cbz x8,0x0088ba84
0088ba08	lsl w8,w21,#0x3
0088ba0c	lsr x9,x21,#0x20
0088ba10	add x8,x8,#0x8
0088ba14	eor x8,x8,x9
0088ba18	mul x8,x8,x28
0088ba1c	eor x9,x9,x8, LSR #0x2f
0088ba20	eor x8,x9,x8
0088ba24	ldrb w9,[x19, #0x98]
0088ba28	mul x8,x8,x28
0088ba2c	eor x8,x8,x8, LSR #0x2f
0088ba30	mul x8,x8,x10
0088ba34	lsr x9,x8,x9
0088ba38	ldr x8,[x19, #0x80]
0088ba3c	lsr x10,x9,#0x6
0088ba40	ldr x10,[x8, x10, LSL #0x3]
0088ba44	lsr x10,x10,x9
0088ba48	tbz w10,#0x0,0x0088ba84
0088ba4c	ldr x11,[x19, #0x88]
0088ba50	ldr x10,[x19, #0x68]
0088ba54	mov w12,#0x50
0088ba58	sub x11,x11,#0x1
0088ba5c	madd x13,x9,x12,x10
0088ba60	ldr x14,[x13]
0088ba64	cmp x14,x21
0088ba68	b.eq 0x0088ba88
0088ba6c	add x9,x9,#0x1
0088ba70	and x9,x9,x11
0088ba74	lsr x13,x9,#0x6
0088ba78	ldr x13,[x8, x13, LSL #0x3]
0088ba7c	lsr x13,x13,x9
0088ba80	tbnz w13,#0x0,0x0088ba5c
0088ba84	mov x13,xzr
0088ba88	add x8,x13,#0x8
0088ba8c	cmp x13,#0x0
0088ba90	ldr x0,[x19]
0088ba94	csel x27,xzr,x8,eq
0088ba98	ldr w8,[x19, #0x64c]
0088ba9c	ldr w1,[x27]
0088baa0	str w8,[sp, #0x14]
0088baa4	bl 0x008756fc
0088baa8	sxth w22,w0
0088baac	tbnz w22,#0x1f,0x0088c218
0088bab0	ldr x24,[x19, #0x800]
0088bab4	ldr x10,[x19, #0x810]
0088bab8	str x24,[x19, #0x808]
0088babc	sub x25,x10,x24
0088bac0	ldp x9,x8,[x27, #0x8]
0088bac4	sub x26,x8,x9
0088bac8	cmp x26,x25
0088bacc	b.ls 0x0088bafc
0088bad0	tbnz x26,#0x3f,0x0088c268
0088bad4	mov x0,x26
0088bad8	bl 0x00c2fed0
0088badc	add x8,x0,x26
0088bae0	str x0,[x19, #0x800]
0088bae4	str x0,[x19, #0x808]
0088bae8	str x8,[x19, #0x810]
0088baec	cbz x24,0x0088bafc
0088baf0	mov x0,x24
0088baf4	mov x1,x25
0088baf8	bl 0x00c2fe80
0088bafc	str w20,[sp, #0x10]
0088bb00	adrp x8,0xd1e000
0088bb04	add x8,x8,#0xc80
0088bb08	str w22,[sp, #0xc]
0088bb0c	ldrb w8,[x8]
0088bb10	cmp w8,#0x1
0088bb14	b.ne 0x0088bbe0
0088bb18	ldr x8,[x19, #0xd28]
0088bb1c	cbz x8,0x0088bba8
0088bb20	lsl w8,w21,#0x3
0088bb24	lsr x9,x21,#0x20
0088bb28	add x8,x8,#0x8
0088bb2c	eor x8,x8,x9
0088bb30	mul x8,x8,x28
0088bb34	eor x9,x9,x8, LSR #0x2f
0088bb38	eor x8,x9,x8
0088bb3c	mov x9,#0x959d
0088bb40	mul x8,x8,x28
0088bb44	movk x9,#0xb8f4, LSL #16
0088bb48	movk x9,#0xd34f, LSL #32
0088bb4c	movk x9,#0x949d, LSL #48
0088bb50	eor x8,x8,x8, LSR #0x2f
0088bb54	mul x8,x8,x9
0088bb58	ldrb w9,[x19, #0xd30]
0088bb5c	lsr x8,x8,x9
0088bb60	ldr x9,[x19, #0xd18]
0088bb64	lsr x10,x8,#0x6
0088bb68	ldr x10,[x9, x10, LSL #0x3]
0088bb6c	lsr x10,x10,x8
0088bb70	tbz w10,#0x0,0x0088bba8
0088bb74	ldr x11,[x19, #0xd20]
0088bb78	ldr x10,[x19, #0xd00]
0088bb7c	sub x11,x11,#0x1
0088bb80	lsl x12,x8,#0x5
0088bb84	ldr x12,[x10, x12#0x0]
0088bb88	cmp x12,x21
0088bb8c	b.eq 0x0088c160
0088bb90	add x8,x8,#0x1
0088bb94	and x8,x8,x11
0088bb98	lsr x12,x8,#0x6
0088bb9c	ldr x12,[x9, x12, LSL #0x3]
0088bba0	lsr x12,x12,x8
0088bba4	tbnz w12,#0x0,0x0088bb80
0088bba8	mov x24,xzr
0088bbac	ldp x8,x9,[x27, #0x8]
0088bbb0	mov x20,#0x959d
0088bbb4	movk x20,#0xb8f4, LSL #16
0088bbb8	movk x20,#0xd34f, LSL #32
0088bbbc	sub x9,x9,x8
0088bbc0	movk x20,#0x949d, LSL #48
0088bbc4	cmp x24,x9, ASR #0x3
0088bbc8	b.cs 0x0088c05c
0088bbcc	mov w25,#0x2
0088bbd0	mov w26,#0x30
0088bbd4	mov w22,#0x18
0088bbd8	mov w23,#0x28
0088bbdc	b 0x0088be60
0088bbe0	ldp x24,x25,[x27, #0x8]
0088bbe4	mov x23,#0x959d
0088bbe8	movk x23,#0xb8f4, LSL #16
0088bbec	movk x23,#0xd34f, LSL #32
0088bbf0	cmp x24,x25
0088bbf4	movk x23,#0x949d, LSL #48
0088bbf8	b.eq 0x0088c070
0088bbfc	mov w22,#0x2
0088bc00	mov w26,#0x30
0088bc04	mov w20,#0x18
0088bc08	b 0x0088bc34
0088bc0c	mov w9,wzr
0088bc10	ldrb w8,[x8, #0x8]
0088bc14	stur w9,[x29, #-0x10]
0088bc18	sturb w8,[x29, #-0xc]
0088bc1c	add x0,x19,#0x800
0088bc20	sub x1,x29,#0x10
0088bc24	bl 0x00899d1c
0088bc28	add x24,x24,#0x8
0088bc2c	cmp x24,x25
0088bc30	b.eq 0x0088c070
0088bc34	ldr x1,[x24]
0088bc38	ldr x8,[x19, #0xc8]
0088bc3c	lsr x9,x1,#0x20
0088bc40	lsl w10,w1,#0x3
0088bc44	cbz x8,0x0088bd28
0088bc48	add x8,x10,#0x8
0088bc4c	ldr x12,[x19, #0xb8]
0088bc50	eor x8,x8,x9
0088bc54	mul x8,x8,x28
0088bc58	eor x11,x9,x8, LSR #0x2f
0088bc5c	eor x8,x11,x8
0088bc60	mul x8,x8,x28
0088bc64	eor x8,x8,x8, LSR #0x2f
0088bc68	mul x11,x8,x23
0088bc6c	ldrb w8,[x19, #0xd0]
0088bc70	lsr x13,x11,x8
0088bc74	lsr x8,x13,#0x6
0088bc78	ldr x8,[x12, x8, LSL #0x3]
0088bc7c	lsr x8,x8,x13
0088bc80	tbz w8,#0x0,0x0088bd28
0088bc84	ldr x8,[x19, #0xc0]
0088bc88	ldr x14,[x19, #0xa0]
0088bc8c	sub x15,x8,#0x1
0088bc90	madd x8,x13,x20,x14
0088bc94	ldr x16,[x8]
0088bc98	cmp x16,x1
0088bc9c	b.eq 0x0088bcbc
0088bca0	add x8,x13,#0x1
0088bca4	and x13,x8,x15
0088bca8	lsr x8,x13,#0x6
0088bcac	ldr x8,[x12, x8, LSL #0x3]
0088bcb0	lsr x8,x8,x13
0088bcb4	tbnz w8,#0x0,0x0088bc90
0088bcb8	b 0x0088bd28
0088bcbc	ldrb w12,[x8, #0x9]
0088bcc0	cmp w12,#0x1
0088bcc4	b.ne 0x0088bd28
0088bcc8	ldr x9,[x19, #0x138]
0088bccc	cbz x9,0x0088bc10
0088bcd0	ldrb w9,[x19, #0x140]
0088bcd4	lsr x10,x11,x9
0088bcd8	ldr x9,[x19, #0x128]
0088bcdc	lsr x11,x10,#0x6
0088bce0	ldr x11,[x9, x11, LSL #0x3]
0088bce4	lsr x11,x11,x10
0088bce8	tbz w11,#0x0,0x0088bc0c
0088bcec	ldr x12,[x19, #0x130]
0088bcf0	ldr x11,[x19, #0x110]
0088bcf4	sub x12,x12,#0x1
0088bcf8	mov w13,#0x28
0088bcfc	madd x13,x10,x13,x11
0088bd00	ldr x14,[x13]
0088bd04	cmp x14,x1
0088bd08	b.eq 0x0088be28
0088bd0c	add x10,x10,#0x1
0088bd10	and x10,x10,x12
0088bd14	lsr x13,x10,#0x6
0088bd18	ldr x13,[x9, x13, LSL #0x3]
0088bd1c	lsr x13,x13,x10
0088bd20	tbnz w13,#0x0,0x0088bcf8
0088bd24	b 0x0088bc0c
0088bd28	ldr x8,[x19, #0x1a8]
0088bd2c	cbz x8,0x0088be08
0088bd30	add x8,x10,#0x8
0088bd34	eor x8,x8,x9
0088bd38	mul x8,x8,x28
0088bd3c	eor x9,x9,x8, LSR #0x2f
0088bd40	eor x8,x9,x8
0088bd44	ldrb w9,[x19, #0x1b0]
0088bd48	mul x8,x8,x28
0088bd4c	eor x8,x8,x8, LSR #0x2f
0088bd50	mul x8,x8,x23
0088bd54	lsr x9,x8,x9
0088bd58	ldr x8,[x19, #0x198]
0088bd5c	lsr x10,x9,#0x6
0088bd60	ldr x10,[x8, x10, LSL #0x3]
0088bd64	lsr x10,x10,x9
0088bd68	tbz w10,#0x0,0x0088be08
0088bd6c	ldr x11,[x19, #0x1a0]
0088bd70	ldr x10,[x19, #0x180]
0088bd74	sub x11,x11,#0x1
0088bd78	madd x2,x9,x26,x10
0088bd7c	ldr x12,[x2]
0088bd80	cmp x12,x1
0088bd84	b.eq 0x0088bda4
0088bd88	add x9,x9,#0x1
0088bd8c	and x9,x9,x11
0088bd90	lsr x12,x9,#0x6
0088bd94	ldr x12,[x8, x12, LSL #0x3]
0088bd98	lsr x12,x12,x9
0088bd9c	tbnz w12,#0x0,0x0088bd78
0088bda0	b 0x0088be08
0088bda4	ldr w8,[x2, #0x8]!
0088bda8	cbz w8,0x0088be08
0088bdac	ldr w23,[x19, #0x64c]
0088bdb0	add w8,w23,#0x1
0088bdb4	cmp w8,#0x100
0088bdb8	b.cs 0x0088c1ec
0088bdbc	ldr w9,[x19, #0x650]
0088bdc0	str w8,[x19, #0x64c]
0088bdc4	cmp w9,w8
0088bdc8	csel w8,w9,w8,hi
0088bdcc	str w8,[x19, #0x650]
0088bdd0	mov x0,x19
0088bdd4	mov x1,x21
0088bdd8	mov w3,w23
0088bddc	bl 0x0088d98c
0088bde0	stur wzr,[x29, #-0x10]
0088bde4	sturb w23,[x29, #-0xc]
0088bde8	add x0,x19,#0x800
0088bdec	sub x1,x29,#0x10
0088bdf0	bl 0x00899d1c
0088bdf4	mov x23,#0x959d
0088bdf8	movk x23,#0xb8f4, LSL #16
0088bdfc	movk x23,#0xd34f, LSL #32
0088be00	movk x23,#0x949d, LSL #48
0088be04	b 0x0088bc28
0088be08	mov x0,x19
0088be0c	bl 0x0088dd6c
0088be10	stur w22,[x29, #-0x10]
0088be14	sturb w0,[x29, #-0xc]
0088be18	add x0,x19,#0x800
0088be1c	sub x1,x29,#0x10
0088be20	bl 0x00899d1c
0088be24	b 0x0088bc28
0088be28	ldrb w9,[x13, #0x20]
0088be2c	b 0x0088bc10
0088be30	mov w9,wzr
0088be34	ldrb w8,[x8, #0x8]
0088be38	stur w9,[x29, #-0x10]
0088be3c	sturb w8,[x29, #-0xc]
0088be40	add x0,x19,#0x800
0088be44	sub x1,x29,#0x10
0088be48	bl 0x00899d1c
0088be4c	ldp x8,x9,[x27, #0x8]
0088be50	add x24,x24,#0x1
0088be54	sub x9,x9,x8
0088be58	cmp x24,x9, ASR #0x3
0088be5c	b.cs 0x0088c05c
0088be60	ldr x1,[x8, x24, LSL #0x3]
0088be64	ldr x8,[x19, #0xc8]
0088be68	lsr x9,x1,#0x20
0088be6c	lsl w10,w1,#0x3
0088be70	cbz x8,0x0088bf50
0088be74	add x8,x10,#0x8
0088be78	ldr x12,[x19, #0xb8]
0088be7c	eor x8,x8,x9
0088be80	mul x8,x8,x28
0088be84	eor x11,x9,x8, LSR #0x2f
0088be88	eor x8,x11,x8
0088be8c	mul x8,x8,x28
0088be90	eor x8,x8,x8, LSR #0x2f
0088be94	mul x11,x8,x20
0088be98	ldrb w8,[x19, #0xd0]
0088be9c	lsr x13,x11,x8
0088bea0	lsr x8,x13,#0x6
0088bea4	ldr x8,[x12, x8, LSL #0x3]
0088bea8	lsr x8,x8,x13
0088beac	tbz w8,#0x0,0x0088bf50
0088beb0	ldr x8,[x19, #0xc0]
0088beb4	ldr x14,[x19, #0xa0]
0088beb8	sub x15,x8,#0x1
0088bebc	madd x8,x13,x22,x14
0088bec0	ldr x16,[x8]
0088bec4	cmp x16,x1
0088bec8	b.eq 0x0088bee8
0088becc	add x8,x13,#0x1
0088bed0	and x13,x8,x15
0088bed4	lsr x8,x13,#0x6
0088bed8	ldr x8,[x12, x8, LSL #0x3]
0088bedc	lsr x8,x8,x13
0088bee0	tbnz w8,#0x0,0x0088bebc
0088bee4	b 0x0088bf50
0088bee8	ldrb w12,[x8, #0x9]
0088beec	cmp w12,#0x1
0088bef0	b.ne 0x0088bf50
0088bef4	ldr x9,[x19, #0x138]
0088bef8	cbz x9,0x0088be34
0088befc	ldrb w9,[x19, #0x140]
0088bf00	lsr x10,x11,x9
0088bf04	ldr x9,[x19, #0x128]
0088bf08	lsr x11,x10,#0x6
0088bf0c	ldr x11,[x9, x11, LSL #0x3]
0088bf10	lsr x11,x11,x10
0088bf14	tbz w11,#0x0,0x0088be30
0088bf18	ldr x12,[x19, #0x130]
0088bf1c	ldr x11,[x19, #0x110]
0088bf20	sub x12,x12,#0x1
0088bf24	madd x13,x10,x23,x11
0088bf28	ldr x14,[x13]
0088bf2c	cmp x14,x1
0088bf30	b.eq 0x0088c054
0088bf34	add x10,x10,#0x1
0088bf38	and x10,x10,x12
0088bf3c	lsr x13,x10,#0x6
0088bf40	ldr x13,[x9, x13, LSL #0x3]
0088bf44	lsr x13,x13,x10
0088bf48	tbnz w13,#0x0,0x0088bf24
0088bf4c	b 0x0088be30
0088bf50	ldr x8,[x19, #0x1a8]
0088bf54	cbz x8,0x0088c034
0088bf58	add x8,x10,#0x8
0088bf5c	eor x8,x8,x9
0088bf60	mul x8,x8,x28
0088bf64	eor x9,x9,x8, LSR #0x2f
0088bf68	eor x8,x9,x8
0088bf6c	ldrb w9,[x19, #0x1b0]
0088bf70	mul x8,x8,x28
0088bf74	eor x8,x8,x8, LSR #0x2f
0088bf78	mul x8,x8,x20
0088bf7c	lsr x9,x8,x9
0088bf80	ldr x8,[x19, #0x198]
0088bf84	lsr x10,x9,#0x6
0088bf88	ldr x10,[x8, x10, LSL #0x3]
0088bf8c	lsr x10,x10,x9
0088bf90	tbz w10,#0x0,0x0088c034
0088bf94	ldr x11,[x19, #0x1a0]
0088bf98	ldr x10,[x19, #0x180]
0088bf9c	sub x11,x11,#0x1
0088bfa0	madd x2,x9,x26,x10
0088bfa4	ldr x12,[x2]
0088bfa8	cmp x12,x1
0088bfac	b.eq 0x0088bfcc
0088bfb0	add x9,x9,#0x1
0088bfb4	and x9,x9,x11
0088bfb8	lsr x12,x9,#0x6
0088bfbc	ldr x12,[x8, x12, LSL #0x3]
0088bfc0	lsr x12,x12,x9
0088bfc4	tbnz w12,#0x0,0x0088bfa0
0088bfc8	b 0x0088c034
0088bfcc	ldr w8,[x2, #0x8]!
0088bfd0	cbz w8,0x0088c034
0088bfd4	ldr w23,[x19, #0x64c]
0088bfd8	add w8,w23,#0x1
0088bfdc	cmp w8,#0x100
0088bfe0	b.cs 0x0088c23c
0088bfe4	ldr w9,[x19, #0x650]
0088bfe8	str w8,[x19, #0x64c]
0088bfec	cmp w9,w8
0088bff0	csel w8,w9,w8,hi
0088bff4	str w8,[x19, #0x650]
0088bff8	mov x0,x19
0088bffc	mov x1,x21
0088c000	mov w3,w23
0088c004	bl 0x0088d98c
0088c008	stur wzr,[x29, #-0x10]
0088c00c	sturb w23,[x29, #-0xc]
0088c010	add x0,x19,#0x800
0088c014	sub x1,x29,#0x10
0088c018	bl 0x00899d1c
0088c01c	mov x20,#0x959d
0088c020	mov w23,#0x28
0088c024	movk x20,#0xb8f4, LSL #16
0088c028	movk x20,#0xd34f, LSL #32
0088c02c	movk x20,#0x949d, LSL #48
0088c030	b 0x0088be4c
0088c034	mov x0,x19
0088c038	bl 0x0088dd6c
0088c03c	stur w25,[x29, #-0x10]
0088c040	sturb w0,[x29, #-0xc]
0088c044	add x0,x19,#0x800
0088c048	sub x1,x29,#0x10
0088c04c	bl 0x00899d1c
0088c050	b 0x0088be4c
0088c054	ldrb w9,[x13, #0x20]
0088c058	b 0x0088be34
0088c05c	ldr x8,[x19, #0x808]
0088c060	ldr x9,[x19, #0x800]
0088c064	sub x8,x8,x9
0088c068	cmp x8,#0x639
0088c06c	b.cs 0x0088c280
0088c070	ldr w8,[x19, #0x8]
0088c074	ldp w22,w20,[sp, #0xc]
0088c078	cmp w8,#0x1
0088c07c	b.lt 0x0088c0b8
0088c080	mov x0,x19
0088c084	mov x1,x21
0088c088	bl 0x00899e00
0088c08c	tbz w0,#0x0,0x0088c0b8
0088c090	ldrb w8,[x19, #0x679]
0088c094	tbnz w8,#0x0,0x0088c0b8
0088c098	ldr x0,[x19]
0088c09c	ldr w1,[x27]
0088c0a0	bl 0x008754b0
0088c0a4	cmp w0,#0x8, LSL #12
0088c0a8	b.cs 0x0088c0b8
0088c0ac	mov w1,#0x40
0088c0b0	mov w22,w0
0088c0b4	b 0x0088c0dc
0088c0b8	ldr x8,[x19, #0x808]
0088c0bc	ldr x9,[x19, #0x800]
0088c0c0	ldr x0,[x19]
0088c0c4	sub x8,x8,x9
0088c0c8	lsr x2,x8,#0x3
0088c0cc	adrp x1,0x2d0000
0088c0d0	add x1,x1,#0xcba
0088c0d4	bl 0x008769e0
0088c0d8	mov w1,#0x13
0088c0dc	ldr x0,[x19]
0088c0e0	mov w2,w20
0088c0e4	mov w3,w22
0088c0e8	bl 0x00875cac
0088c0ec	ldr x20,[x19, #0x800]
0088c0f0	ldr x21,[x19, #0x808]
0088c0f4	cmp x20,x21
0088c0f8	b.eq 0x0088c124
0088c0fc	ldr x0,[x19]
0088c100	ldrb w2,[x20]
0088c104	ldrb w3,[x20, #0x4]
0088c108	cmp w2,#0x1
0088c10c	mov w1,#0x46
0088c110	csetm w4,eq
0088c114	bl 0x00875b54
0088c118	add x20,x20,#0x8
0088c11c	cmp x20,x21
0088c120	b.ne 0x0088c0fc
0088c124	ldr w8,[sp, #0x14]
0088c128	str w8,[x19, #0x64c]
0088c12c	ldr x8,[sp, #0x18]
0088c130	ldr x8,[x8, #0x28]
0088c134	ldur x9,[x29, #-0x8]
0088c138	cmp x8,x9
0088c13c	b.ne 0x0088c314
0088c140	ldp x20,x19,[sp, #0x80]
0088c144	ldp x22,x21,[sp, #0x70]
0088c148	ldp x24,x23,[sp, #0x60]
0088c14c	ldp x26,x25,[sp, #0x50]
0088c150	ldp x28,x27,[sp, #0x40]
0088c154	ldp x29,x30,[sp, #0x30]
0088c158	add sp,sp,#0x90
0088c15c	ret
0088c160	add x22,x10,x8, LSL #0x5
0088c164	ldp x9,x8,[x22, #0x8]
0088c168	sub x20,x8,x9
0088c16c	cmp x20,#0x8
0088c170	b.ne 0x0088c17c
0088c174	mov w8,wzr
0088c178	b 0x0088c1bc
0088c17c	mov x24,xzr
0088c180	mov w25,#0x2
0088c184	stur w25,[x29, #-0x10]
0088c188	sturb w24,[x29, #-0xc]
0088c18c	add x0,x19,#0x800
0088c190	sub x1,x29,#0x10
0088c194	bl 0x00899d1c
0088c198	ldp x9,x8,[x22, #0x8]
0088c19c	add x24,x24,#0x1
0088c1a0	sub x8,x8,x9
0088c1a4	asr x9,x8,#0x3
0088c1a8	sub x9,x9,#0x1
0088c1ac	cmp x24,x9
0088c1b0	b.cc 0x0088c184
0088c1b4	lsr x8,x8,#0x3
0088c1b8	sub w8,w8,#0x1
0088c1bc	and w9,w23,#0xff
0088c1c0	cmp w9,#0xff
0088c1c4	cset w9,eq
0088c1c8	csel w8,w8,w23,eq
0088c1cc	lsl w9,w9,#0x1
0088c1d0	sturb w8,[x29, #-0xc]
0088c1d4	stur w9,[x29, #-0x10]
0088c1d8	add x0,x19,#0x800
0088c1dc	sub x1,x29,#0x10
0088c1e0	bl 0x00899d1c
0088c1e4	asr x24,x20,#0x3
0088c1e8	b 0x0088bbac
0088c1ec	ldr x8,[sp, #0x18]
0088c1f0	ldr x8,[x8, #0x28]
0088c1f4	ldur x9,[x29, #-0x8]
0088c1f8	cmp x8,x9
0088c1fc	b.ne 0x0088c314
0088c200	adrp x1,0x2d0000
0088c204	add x1,x1,#0xc00
0088c208	add x0,x21,#0xc
0088c20c	mov w2,#0x1
0088c210	mov w3,#0xff
0088c214	bl 0x0087fcd8
0088c218	ldr x8,[sp, #0x18]
0088c21c	ldr x8,[x8, #0x28]
0088c220	ldur x9,[x29, #-0x8]
0088c224	cmp x8,x9
0088c228	b.ne 0x0088c314
0088c22c	adrp x1,0x2b8000
0088c230	add x1,x1,#0xfe6
0088c234	add x0,x21,#0xc
0088c238	bl 0x0087fcd8
0088c23c	ldr x8,[sp, #0x18]
0088c240	ldr x8,[x8, #0x28]
0088c244	ldur x9,[x29, #-0x8]
0088c248	cmp x8,x9
0088c24c	b.ne 0x0088c314
0088c250	adrp x1,0x2d0000
0088c254	add x1,x1,#0xc00
0088c258	add x0,x21,#0xc
0088c25c	mov w2,#0x1
0088c260	mov w3,#0xff
0088c264	bl 0x0087fcd8
0088c268	ldr x8,[sp, #0x18]
0088c26c	ldr x8,[x8, #0x28]
0088c270	ldur x9,[x29, #-0x8]
0088c274	cmp x8,x9
0088c278	b.ne 0x0088c314
0088c27c	bl 0x0089a058
0088c280	ldr x8,[sp, #0x18]
0088c284	ldr x2,[x21, #0xa0]
0088c288	ldr x8,[x8, #0x28]
0088c28c	ldur x9,[x29, #-0x8]
0088c290	cmp x8,x9
0088c294	b.ne 0x0088c314
0088c298	adrp x1,0x2c4000
0088c29c	add x1,x1,#0xc91
0088c2a0	add x0,x21,#0xc
0088c2a4	mov w3,#0xc8
0088c2a8	bl 0x0087fcd8
0088c314	bl 0x00c2fec0

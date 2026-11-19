; FUN_0088cc80 @ 0088cc80
0088cc80	sub sp,sp,#0x90
0088cc84	stp x29,x30,[sp, #0x30]
0088cc88	stp x28,x27,[sp, #0x40]
0088cc8c	stp x26,x25,[sp, #0x50]
0088cc90	stp x24,x23,[sp, #0x60]
0088cc94	stp x22,x21,[sp, #0x70]
0088cc98	stp x20,x19,[sp, #0x80]
0088cc9c	add x29,sp,#0x30
0088cca0	mrs x8,tpidr_el0
0088cca4	mov x25,#0x2d69
0088cca8	mov x24,#0x959d
0088ccac	stp x8,x3,[sp]
0088ccb0	movk x25,#0xeb38, LSL #16
0088ccb4	movk x24,#0xb8f4, LSL #16
0088ccb8	ldr x8,[x8, #0x28]
0088ccbc	movk x25,#0xea08, LSL #32
0088ccc0	movk x24,#0xd34f, LSL #32
0088ccc4	mov w22,w4
0088ccc8	mov x23,x2
0088cccc	mov x21,x1
0088ccd0	mov x19,x0
0088ccd4	movk x25,#0x9ddf, LSL #48
0088ccd8	adrp x26,0xd1b000
0088ccdc	adrp x27,0xd1b000
0088cce0	adrp x28,0xd1a000
0088cce4	movk x24,#0x949d, LSL #48
0088cce8	mov w20,#0x30
0088ccec	stur x8,[x29, #-0x8]
0088ccf0	ldr x8,[x19, #0x170]
0088ccf4	cbz x8,0x0088cd7c
0088ccf8	lsl w8,w21,#0x3
0088ccfc	lsr x9,x21,#0x20
0088cd00	add x8,x8,#0x8
0088cd04	eor x8,x8,x9
0088cd08	mul x8,x8,x25
0088cd0c	eor x9,x9,x8, LSR #0x2f
0088cd10	eor x8,x9,x8
0088cd14	ldrb w9,[x19, #0x178]
0088cd18	mul x8,x8,x25
0088cd1c	eor x8,x8,x8, LSR #0x2f
0088cd20	mul x8,x8,x24
0088cd24	lsr x9,x8,x9
0088cd28	ldr x8,[x19, #0x160]
0088cd2c	lsr x10,x9,#0x6
0088cd30	ldr x10,[x8, x10, LSL #0x3]
0088cd34	lsr x10,x10,x9
0088cd38	tbz w10,#0x0,0x0088cd7c
0088cd3c	ldr x11,[x19, #0x168]
0088cd40	ldr x10,[x19, #0x148]
0088cd44	sub x11,x11,#0x1
0088cd48	madd x12,x9,x20,x10
0088cd4c	ldr x13,[x12]
0088cd50	cmp x13,x21
0088cd54	b.eq 0x0088cd74
0088cd58	add x9,x9,#0x1
0088cd5c	and x9,x9,x11
0088cd60	lsr x12,x9,#0x6
0088cd64	ldr x12,[x8, x12, LSL #0x3]
0088cd68	lsr x12,x12,x9
0088cd6c	tbnz w12,#0x0,0x0088cd48
0088cd70	b 0x0088cd7c
0088cd74	ldr w8,[x12, #0x8]
0088cd78	cbnz w8,0x0088ce90
0088cd7c	ldr w8,[x21, #0x8]
0088cd80	cbz x21,0x0088cde0
0088cd84	ldr w9,[x26, #0xa0]
0088cd88	cmp w8,w9
0088cd8c	b.ne 0x0088cde0
0088cd90	ldr w9,[x21, #0x1c]
0088cd94	sub w10,w9,#0xe
0088cd98	cmp w10,#0x2
0088cd9c	b.cs 0x0088cdd4
0088cda0	cmp w9,#0xe
0088cda4	and w4,w22,#0x1
0088cda8	cset w8,ne
0088cdac	cmp w4,w8
0088cdb0	b.ne 0x0088cea8
0088cdb4	ldr x1,[x21, #0x20]
0088cdb8	ldr x3,[sp, #0x8]
0088cdbc	mov x0,x19
0088cdc0	mov x2,x23
0088cdc4	bl 0x0088cc80
0088cdc8	mov w8,#0x28
0088cdcc	ldr x21,[x21, x8#0x0]
0088cdd0	b 0x0088ccf0
0088cdd4	sub w9,w9,#0x8
0088cdd8	cmp w9,#0x6
0088cddc	b.cc 0x0088ce28
0088cde0	ldr w9,[x27, #0x90]
0088cde4	cmp w8,w9
0088cde8	csel x9,x21,xzr,eq
0088cdec	cbnz x23,0x0088cdfc
0088cdf0	cbz x9,0x0088cdfc
0088cdf4	ldr w10,[x9, #0x1c]
0088cdf8	cbz w10,0x0088ce18
0088cdfc	cbz x21,0x0088ce6c
0088ce00	ldr w9,[x28, #0xfc0]
0088ce04	cmp w8,w9
0088ce08	b.ne 0x0088ce6c
0088ce0c	mov w8,#0x20
0088ce10	ldr x21,[x21, x8#0x0]
0088ce14	b 0x0088ccf0
0088ce18	ldr x21,[x9, #0x20]
0088ce1c	mov x23,xzr
0088ce20	eor w22,w22,#0x1
0088ce24	b 0x0088ccf0
0088ce28	cbz x23,0x0088ce44
0088ce2c	ldr x0,[x19]
0088ce30	ldrb w2,[x23]
0088ce34	and w3,w22,#0x1
0088ce38	mov w1,#0x3
0088ce3c	mov w4,wzr
0088ce40	bl 0x00875b54
0088ce44	mov w8,#0x1
0088ce48	mov x0,x19
0088ce4c	mov x1,x21
0088ce50	bic w2,w8,w22
0088ce54	bl 0x00893480
0088ce58	str x0,[sp, #0x10]
0088ce5c	ldr x0,[sp, #0x8]
0088ce60	add x1,sp,#0x10
0088ce64	bl 0x00894434
0088ce68	b 0x0088d01c
0088ce6c	ldr w24,[x19, #0x64c]
0088ce70	cbz x23,0x0088cf3c
0088ce74	ldrb w23,[x23]
0088ce78	mov x0,x19
0088ce7c	mov x1,x21
0088ce80	mov w2,w23
0088ce84	mov w3,#0x1
0088ce88	bl 0x0088d1d0
0088ce8c	b 0x0088cf88
0088ce90	cmp w8,#0x2
0088ce94	b.eq 0x0088cfc4
0088ce98	cmp w8,#0x1
0088ce9c	b.ne 0x0088cfd4
0088cea0	tbz w22,#0x0,0x0088cfd8
0088cea4	b 0x0088d01c
0088cea8	ldr x1,[x21, #0x20]
0088ceac	stp xzr,xzr,[sp, #0x10]
0088ceb0	mov w8,#0x1
0088ceb4	str xzr,[sp, #0x20]
0088ceb8	add x3,sp,#0x10
0088cebc	bic w4,w8,w22
0088cec0	mov x0,x19
0088cec4	mov x2,xzr
0088cec8	bl 0x0088cc80
0088cecc	ldr x1,[x21, #0x28]
0088ced0	ldr x3,[sp, #0x8]
0088ced4	and w4,w22,#0x1
0088ced8	mov x0,x19
0088cedc	mov x2,x23
0088cee0	bl 0x0088cc80
0088cee4	ldr x0,[x19]
0088cee8	bl 0x00875ec8
0088ceec	ldp x20,x23,[sp, #0x10]
0088cef0	cmp x20,x23
0088cef4	b.eq 0x0088cf20
0088cef8	mov x22,x0
0088cefc	ldr x1,[x20]
0088cf00	ldr x0,[x19]
0088cf04	mov x2,x22
0088cf08	bl 0x00875ed8
0088cf0c	tbz w0,#0x0,0x0088d050
0088cf10	add x20,x20,#0x8
0088cf14	cmp x20,x23
0088cf18	b.ne 0x0088cefc
0088cf1c	ldr x20,[sp, #0x10]
0088cf20	cbz x20,0x0088d01c
0088cf24	ldr x8,[sp, #0x20]
0088cf28	mov x0,x20
0088cf2c	str x20,[sp, #0x18]
0088cf30	sub x1,x8,x20
0088cf34	bl 0x00c2fe80
0088cf38	b 0x0088d01c
0088cf3c	mov x0,x19
0088cf40	mov x1,x21
0088cf44	bl 0x0088df20
0088cf48	mov w23,w0
0088cf4c	tbz w0,#0x1f,0x0088cf88
0088cf50	ldr w2,[x19, #0x64c]
0088cf54	add w8,w2,#0x1
0088cf58	cmp w8,#0x100
0088cf5c	b.cs 0x0088d074
0088cf60	ldr w9,[x19, #0x650]
0088cf64	str w8,[x19, #0x64c]
0088cf68	cmp w9,w8
0088cf6c	csel w8,w9,w8,hi
0088cf70	str w8,[x19, #0x650]
0088cf74	mov x0,x19
0088cf78	mov x1,x21
0088cf7c	mov w3,#0xff
0088cf80	bl 0x00891438
0088cf84	mov w23,w0
0088cf88	ldr x0,[x19]
0088cf8c	bl 0x00875ec8
0088cf90	str x0,[sp, #0x10]
0088cf94	ldr x0,[sp, #0x8]
0088cf98	add x1,sp,#0x10
0088cf9c	bl 0x00894350
0088cfa0	ldr x0,[x19]
0088cfa4	tst w22,#0x1
0088cfa8	mov w8,#0x19
0088cfac	cinc w1,w8,eq
0088cfb0	mov w2,w23
0088cfb4	mov w3,wzr
0088cfb8	bl 0x00875cac
0088cfbc	str w24,[x19, #0x64c]
0088cfc0	b 0x0088d01c
0088cfc4	ldrb w8,[x12, #0x10]
0088cfc8	eor w8,w22,w8
0088cfcc	tbz w8,#0x0,0x0088cfd8
0088cfd0	b 0x0088d01c
0088cfd4	tbz w22,#0x0,0x0088d01c
0088cfd8	cbz x23,0x0088cff0
0088cfdc	ldrb w2,[x23]
0088cfe0	mov x0,x19
0088cfe4	mov x1,x21
0088cfe8	mov w3,#0x1
0088cfec	bl 0x0088d1d0
0088cff0	ldr x0,[x19]
0088cff4	bl 0x00875ec8
0088cff8	str x0,[sp, #0x10]
0088cffc	ldr x0,[sp, #0x8]
0088d000	add x1,sp,#0x10
0088d004	bl 0x00894350
0088d008	ldr x0,[x19]
0088d00c	mov w1,#0x17
0088d010	mov w2,wzr
0088d014	mov w3,wzr
0088d018	bl 0x00875cac
0088d01c	ldr x8,[sp]
0088d020	ldr x8,[x8, #0x28]
0088d024	ldur x9,[x29, #-0x8]
0088d028	cmp x8,x9
0088d02c	b.ne 0x0088d0f0
0088d030	ldp x20,x19,[sp, #0x80]
0088d034	ldp x22,x21,[sp, #0x70]
0088d038	ldp x24,x23,[sp, #0x60]
0088d03c	ldp x26,x25,[sp, #0x50]
0088d040	ldp x28,x27,[sp, #0x40]
0088d044	ldp x29,x30,[sp, #0x30]
0088d048	add sp,sp,#0x90
0088d04c	ret
0088d050	ldr x8,[sp]
0088d054	ldr x8,[x8, #0x28]
0088d058	ldur x9,[x29, #-0x8]
0088d05c	cmp x8,x9
0088d060	b.ne 0x0088d0f0
0088d064	adrp x1,0x2ab000
0088d068	add x1,x1,#0x47b
0088d06c	add x0,x21,#0xc
0088d070	bl 0x0087fcd8
0088d074	ldr x8,[sp]
0088d078	ldr x8,[x8, #0x28]
0088d07c	ldur x9,[x29, #-0x8]
0088d080	cmp x8,x9
0088d084	b.ne 0x0088d0f0
0088d088	adrp x1,0x2d0000
0088d08c	add x1,x1,#0xc00
0088d090	add x0,x21,#0xc
0088d094	mov w2,#0x1
0088d098	mov w3,#0xff
0088d09c	bl 0x0087fcd8
0088d0f0	bl 0x00c2fec0

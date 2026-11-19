; FUN_00a6cba4 @ 00a6cba4
00a6cba4	sub sp,sp,#0xf0
00a6cba8	stp x26,x25,[sp, #0xa0]
00a6cbac	stp x24,x23,[sp, #0xb0]
00a6cbb0	stp x22,x21,[sp, #0xc0]
00a6cbb4	stp x20,x19,[sp, #0xd0]
00a6cbb8	stp x29,x30,[sp, #0xe0]
00a6cbbc	add x29,sp,#0xe0
00a6cbc0	mov w22,w7
00a6cbc4	mov x20,x6
00a6cbc8	mov x21,x5
00a6cbcc	mov x23,x4
00a6cbd0	mov w24,w3
00a6cbd4	mov x25,x1
00a6cbd8	mov x19,xzr
00a6cbdc	stp x28,x27,[sp, #0x90]
00a6cbe0	stur xzr,[x29, #-0x58]
00a6cbe4	cbnz x4,0x00a6cd00
00a6cbe8	mov x26,x2
00a6cbec	mov x27,x0
00a6cbf0	str xzr,[sp, #0x30]
00a6cbf4	cbz x25,0x00a6cc0c
00a6cbf8	add x0,sp,#0x30
00a6cbfc	mov w2,#0xffffffff
00a6cc00	mov x1,x25
00a6cc04	bl 0x00c352c0
00a6cc08	b 0x00a6cc1c
00a6cc0c	cbz w24,0x00a6cdd8
00a6cc10	add x0,sp,#0x30
00a6cc14	mov w1,w24
00a6cc18	bl 0x00c37b20
00a6cc1c	mov x19,x0
00a6cc20	ldr x28,[sp, #0x30]
00a6cc24	mov x0,x28
00a6cc28	bl 0x00c32360
00a6cc2c	cbz x19,0x00a6cc38
00a6cc30	mov x19,xzr
00a6cc34	cbnz x28,0x00a6cd00
00a6cc38	mov x1,x25
00a6cc3c	cbnz x25,0x00a6cc4c
00a6cc40	mov w0,w24
00a6cc44	bl 0x00c324f0
00a6cc48	mov x1,x0
00a6cc4c	mov x0,x27
00a6cc50	mov x2,x26
00a6cc54	bl 0x00c34630
00a6cc58	mov x19,x0
00a6cc5c	cbz x0,0x00a6ce28
00a6cc60	bl 0x00c35250
00a6cc64	mov x0,x19
00a6cc68	bl 0x00c36410
00a6cc6c	cmp w0,#0x1
00a6cc70	b.ne 0x00a6ccfc
00a6cc74	add x0,sp,#0x30
00a6cc78	mov w2,#0x50
00a6cc7c	mov w1,wzr
00a6cc80	bl 0x00c301c0
00a6cc84	bl 0x00c35ed0
00a6cc88	adrp x8,0x2a3000
00a6cc8c	adrp x9,0x2ad000
00a6cc90	add x8,x8,#0xe83
00a6cc94	add x9,x9,#0x463
00a6cc98	cmp w22,#0x0
00a6cc9c	csel x0,x9,x8,eq
00a6cca0	add x8,sp,#0x8
00a6cca4	mov x1,x21
00a6cca8	mov x2,x20
00a6ccac	bl 0x00c34c50
00a6ccb0	ldr x8,[sp, #0x28]
00a6ccb4	ldur q0,[sp, #0x18]
00a6ccb8	ldur q1,[sp, #0x8]
00a6ccbc	sub x1,x29,#0x58
00a6ccc0	mov w2,#0x87
00a6ccc4	add x3,sp,#0x30
00a6ccc8	mov x0,x19
00a6cccc	str x8,[sp, #0x50]
00a6ccd0	stp q1,q0,[sp, #0x30]
00a6ccd4	bl 0x00c36400
00a6ccd8	cmp w0,#0x1
00a6ccdc	b.eq 0x00a6ce34
00a6cce0	bl 0x00c342a0
00a6cce4	adrp x0,0x2c1000
00a6cce8	adrp x2,0x2cd000
00a6ccec	add x0,x0,#0xcf9
00a6ccf0	add x2,x2,#0xb03
00a6ccf4	mov w1,#0x1ad
00a6ccf8	b 0x00a6cdc8
00a6ccfc	bl 0x00c35240
00a6cd00	bl 0x00a6edc4
00a6cd04	stur x0,[x29, #-0x58]
00a6cd08	cbz x0,0x00a6cd6c
00a6cd0c	mov w4,#0xffffffff
00a6cd10	mov x1,x23
00a6cd14	mov w2,w24
00a6cd18	mov x3,x25
00a6cd1c	mov x5,xzr
00a6cd20	bl 0x00a6d2f4
00a6cd24	cbz w0,0x00a6ce28
00a6cd28	ldur x0,[x29, #-0x58]
00a6cd2c	ldr x8,[x0, #0x8]
00a6cd30	cbz x8,0x00a6ce28
00a6cd34	cbz w22,0x00a6cd98
00a6cd38	ldr x8,[x8, #0xf8]
00a6cd3c	cbz x8,0x00a6cde0
00a6cd40	mov x1,x21
00a6cd44	mov x2,x20
00a6cd48	blr x8
00a6cd4c	cbnz w0,0x00a6ce34
00a6cd50	bl 0x00c342a0
00a6cd54	adrp x0,0x2c1000
00a6cd58	adrp x2,0x2cd000
00a6cd5c	add x0,x0,#0xcf9
00a6cd60	add x2,x2,#0xb03
00a6cd64	mov w1,#0x1d0
00a6cd68	b 0x00a6cdc8
00a6cd6c	bl 0x00c342a0
00a6cd70	adrp x0,0x2c1000
00a6cd74	adrp x2,0x2cd000
00a6cd78	add x0,x0,#0xcf9
00a6cd7c	add x2,x2,#0xb03
00a6cd80	mov w1,#0x1bd
00a6cd84	bl 0x00c342b0
00a6cd88	mov w1,#0x100
00a6cd8c	orr w0,wzr,#0x6
00a6cd90	movk w1,#0xc, LSL #16
00a6cd94	b 0x00a6ce20
00a6cd98	ldr x8,[x8, #0x100]
00a6cd9c	cbz x8,0x00a6cdfc
00a6cda0	mov x1,x21
00a6cda4	mov x2,x20
00a6cda8	blr x8
00a6cdac	cbnz w0,0x00a6ce34
00a6cdb0	bl 0x00c342a0
00a6cdb4	adrp x0,0x2c1000
00a6cdb8	adrp x2,0x2cd000
00a6cdbc	add x0,x0,#0xcf9
00a6cdc0	add x2,x2,#0xb03
00a6cdc4	mov w1,#0x1da
00a6cdc8	bl 0x00c342b0
00a6cdcc	orr w0,wzr,#0x6
00a6cdd0	mov w1,#0xb4
00a6cdd4	b 0x00a6ce20
00a6cdd8	mov x19,xzr
00a6cddc	b 0x00a6cc20
00a6cde0	bl 0x00c342a0
00a6cde4	adrp x0,0x2c1000
00a6cde8	adrp x2,0x2cd000
00a6cdec	add x0,x0,#0xcf9
00a6cdf0	add x2,x2,#0xb03
00a6cdf4	mov w1,#0x1cb
00a6cdf8	b 0x00a6ce14
00a6cdfc	bl 0x00c342a0
00a6ce00	adrp x0,0x2c1000
00a6ce04	adrp x2,0x2cd000
00a6ce08	add x0,x0,#0xcf9
00a6ce0c	add x2,x2,#0xb03
00a6ce10	mov w1,#0x1d5
00a6ce14	bl 0x00c342b0
00a6ce18	orr w0,wzr,#0x6
00a6ce1c	mov w1,#0x96
00a6ce20	mov x2,xzr
00a6ce24	bl 0x00c342c0
00a6ce28	ldur x0,[x29, #-0x58]
00a6ce2c	bl 0x00a6c7fc
00a6ce30	stur xzr,[x29, #-0x58]
00a6ce34	mov x0,x19
00a6ce38	bl 0x00c34620
00a6ce3c	ldur x0,[x29, #-0x58]
00a6ce40	ldp x29,x30,[sp, #0xe0]
00a6ce44	ldp x20,x19,[sp, #0xd0]
00a6ce48	ldp x22,x21,[sp, #0xc0]
00a6ce4c	ldp x24,x23,[sp, #0xb0]
00a6ce50	ldp x26,x25,[sp, #0xa0]
00a6ce54	ldp x28,x27,[sp, #0x90]
00a6ce58	add sp,sp,#0xf0
00a6ce5c	ret

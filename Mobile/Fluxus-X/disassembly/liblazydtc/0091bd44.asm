; FUN_0091bd44 @ 0091bd44
0091bd44	sub sp,sp,#0x70
0091bd48	stp x28,x27,[sp, #0x10]
0091bd4c	stp x26,x25,[sp, #0x20]
0091bd50	stp x24,x23,[sp, #0x30]
0091bd54	stp x22,x21,[sp, #0x40]
0091bd58	stp x20,x19,[sp, #0x50]
0091bd5c	stp x29,x30,[sp, #0x60]
0091bd60	add x29,sp,#0x60
0091bd64	ldr x8,[x0, #0x808]
0091bd68	mov x19,x2
0091bd6c	mov x21,x0
0091bd70	mov x24,x1
0091bd74	cbz x8,0x0091bdc8
0091bd78	adrp x1,0x2ce000
0091bd7c	add x1,x1,#0xfdf
0091bd80	orr w2,wzr,#0x6
0091bd84	mov x0,x21
0091bd88	bl 0x00941e8c
0091bd8c	mov x20,xzr
0091bd90	cbz x0,0x0091bfa0
0091bd94	ldr x8,[x21, #0xa90]
0091bd98	cbnz x20,0x0091bdd4
0091bd9c	mov w23,wzr
0091bda0	cbnz x8,0x0091bdd4
0091bda4	mov w0,w23
0091bda8	ldp x29,x30,[sp, #0x60]
0091bdac	ldp x20,x19,[sp, #0x50]
0091bdb0	ldp x22,x21,[sp, #0x40]
0091bdb4	ldp x24,x23,[sp, #0x30]
0091bdb8	ldp x26,x25,[sp, #0x20]
0091bdbc	ldp x28,x27,[sp, #0x10]
0091bdc0	add sp,sp,#0x70
0091bdc4	ret
0091bdc8	mov x20,xzr
0091bdcc	ldr x8,[x21, #0xa90]
0091bdd0	cbz x20,0x0091bd9c
0091bdd4	cbz x8,0x0091bf18
0091bdd8	mov w8,#0x131d
0091bddc	ldrb w8,[x21, x8]
0091bde0	tbz w8,#0x3,0x0091bf18
0091bde4	ldr x22,[x21, #0x12d8]
0091bde8	cbnz x22,0x0091bdf0
0091bdec	ldr x22,[x24, #0x50]
0091bdf0	ldr x8,[x24, #0x3a8]
0091bdf4	ldrb w8,[x8, #0x8c]
0091bdf8	tbnz w8,#0x1,0x0091be10
0091bdfc	adrp x0,0x2af000
0091be00	add x0,x0,#0x1f0
0091be04	mov x1,x22
0091be08	bl 0x00c31b40
0091be0c	cbz w0,0x0091bfd0
0091be10	mov w23,#0x1
0091be14	mov w1,#0x2
0091be18	mov w2,#0x2
0091be1c	mov x0,x21
0091be20	bl 0x0093f628
0091be24	ldr x1,[x21, #0xa90]
0091be28	ldr x3,[x21, #0x11a8]
0091be2c	mov x0,x21
0091be30	mov x2,x22
0091be34	mov w4,w23
0091be38	bl 0x009144b4
0091be3c	mov x25,x0
0091be40	mov w1,#0x2
0091be44	mov x0,x21
0091be48	bl 0x0093f680
0091be4c	cbz x25,0x0091bf18
0091be50	adrp x24,0x2a7000
0091be54	mov w28,wzr
0091be58	mov w22,#0x8
0091be5c	add x24,x24,#0x315
0091be60	str x25,[sp, #0x8]
0091be64	ldr x26,[x25, #0x10]
0091be68	cbz x26,0x0091bf04
0091be6c	cbnz w28,0x0091be90
0091be70	adrp x1,0x2a5000
0091be74	mov w2,#0x8
0091be78	mov x0,x19
0091be7c	add x1,x1,#0x359
0091be80	bl 0x009045fc
0091be84	mov w23,w0
0091be88	cbnz w0,0x0091c044
0091be8c	ldr x26,[x25, #0x10]
0091be90	ldr x23,[x25, #0x8]
0091be94	mov x0,x23
0091be98	bl 0x00c2ff50
0091be9c	mov x27,x0
0091bea0	mov x0,x26
0091bea4	bl 0x00c2ff50
0091bea8	add x8,x27,x0
0091beac	add x8,x8,x22
0091beb0	add x22,x8,#0x1
0091beb4	lsr x8,x22,#0x1
0091beb8	cmp x8,#0xfff
0091bebc	b.cs 0x0091c000
0091bec0	adrp x8,0x2ab000
0091bec4	adrp x9,0x2ba000
0091bec8	cmp w28,#0x0
0091becc	add x8,x8,#0x32c
0091bed0	add x9,x9,#0xf99
0091bed4	csel x2,x9,x8,ne
0091bed8	mov x0,x19
0091bedc	mov x1,x24
0091bee0	mov x3,x23
0091bee4	mov x4,x26
0091bee8	bl 0x009048cc
0091beec	mov w23,w0
0091bef0	cbnz w0,0x0091c048
0091bef4	cmp w28,#0x0
0091bef8	cset w8,ne
0091befc	add x22,x22,w8, UXTW  #0x1
0091bf00	add w28,w28,#0x1
0091bf04	ldr x25,[x25]
0091bf08	cbnz x25,0x0091be64
0091bf0c	mov w21,wzr
0091bf10	mov w23,wzr
0091bf14	b 0x0091c04c
0091bf18	mov w28,wzr
0091bf1c	mov w21,wzr
0091bf20	mov w23,wzr
0091bf24	tbnz w21,#0x0,0x0091bf68
0091bf28	cbz x20,0x0091bf68
0091bf2c	cbnz w23,0x0091bf68
0091bf30	cbz w28,0x0091bfb0
0091bf34	adrp x8,0x2ab000
0091bf38	adrp x9,0x2ba000
0091bf3c	add x8,x8,#0x32c
0091bf40	add x9,x9,#0xf99
0091bf44	cmp w28,#0x0
0091bf48	adrp x1,0x2a3000
0091bf4c	csel x2,x9,x8,ne
0091bf50	add x1,x1,#0x68e
0091bf54	mov x0,x19
0091bf58	mov x3,x20
0091bf5c	bl 0x009048cc
0091bf60	mov w23,w0
0091bf64	add w28,w28,#0x1
0091bf68	cbz w28,0x0091bda4
0091bf6c	cbnz w23,0x0091bda4
0091bf70	mov x0,x19
0091bf74	ldp x29,x30,[sp, #0x60]
0091bf78	ldp x20,x19,[sp, #0x50]
0091bf7c	ldp x22,x21,[sp, #0x40]
0091bf80	ldp x24,x23,[sp, #0x30]
0091bf84	ldp x26,x25,[sp, #0x20]
0091bf88	ldp x28,x27,[sp, #0x10]
0091bf8c	adrp x1,0x2b9000
0091bf90	add x1,x1,#0x17a
0091bf94	mov w2,#0x2
0091bf98	add sp,sp,#0x70
0091bf9c	b 0x009045fc
0091bfa0	ldr x20,[x21, #0x808]
0091bfa4	ldr x8,[x21, #0xa90]
0091bfa8	cbz x20,0x0091bd9c
0091bfac	b 0x0091bdd4
0091bfb0	adrp x1,0x2a5000
0091bfb4	add x1,x1,#0x359
0091bfb8	mov w2,#0x8
0091bfbc	mov x0,x19
0091bfc0	bl 0x009045fc
0091bfc4	mov w23,w0
0091bfc8	cbnz w0,0x0091bda4
0091bfcc	b 0x0091bf34
0091bfd0	adrp x1,0x2a1000
0091bfd4	add x1,x1,#0x77e
0091bfd8	mov x0,x22
0091bfdc	bl 0x00c301f0
0091bfe0	cbz w0,0x0091be10
0091bfe4	adrp x1,0x2d0000
0091bfe8	add x1,x1,#0xdf0
0091bfec	mov x0,x22
0091bff0	bl 0x00c301f0
0091bff4	cmp w0,#0x0
0091bff8	cset w23,eq
0091bffc	b 0x0091be14
0091c000	ldr x22,[sp, #0x8]
0091c004	cbz x21,0x0091c038
0091c008	ldrb w8,[x21, #0xa85]
0091c00c	tbz w8,#0x4,0x0091c038
0091c010	ldr x8,[x21, #0x12a0]
0091c014	cbz x8,0x0091c024
0091c018	ldr w8,[x8, #0x8]
0091c01c	cmp w8,#0x1
0091c020	b.lt 0x0091c038
0091c024	adrp x1,0x2a7000
0091c028	add x1,x1,#0x2d7
0091c02c	mov x0,x21
0091c030	mov x2,x23
0091c034	bl 0x00904c98
0091c038	mov w23,wzr
0091c03c	mov w21,#0x1
0091c040	b 0x0091c050
0091c044	mov w28,wzr
0091c048	mov w21,wzr
0091c04c	ldr x22,[sp, #0x8]
0091c050	mov x0,x22
0091c054	bl 0x00914b48
0091c058	tbz w21,#0x0,0x0091bf28
0091c05c	b 0x0091bf68

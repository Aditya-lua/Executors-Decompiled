; ossl_rsa_param_decode @ 00acfc74
00acfc74	sub sp,sp,#0x70
00acfc78	stp x20,x19,[sp, #0x50]
00acfc7c	mov x20,x1
00acfc80	mov x19,x0
00acfc84	add x0,sp,#0x10
00acfc88	add x1,sp,#0x4
00acfc8c	add x2,sp,#0x8
00acfc90	mov x3,x20
00acfc94	str x21,[sp, #0x40]
00acfc98	stp x29,x30,[sp, #0x60]
00acfc9c	add x29,sp,#0x60
00acfca0	bl 0x00c32b50
00acfca4	ldr x0,[sp, #0x10]
00acfca8	bl 0x00c37750
00acfcac	cmp w0,#0x390
00acfcb0	b.ne 0x00acfdc0
00acfcb4	ldr w8,[sp, #0x4]
00acfcb8	cmn w8,#0x1
00acfcbc	b.eq 0x00acfdc0
00acfcc0	cmp w8,#0x10
00acfcc4	b.ne 0x00acfdd8
00acfcc8	bl 0x00c3fa50
00acfccc	ldr x1,[x20, #0x8]
00acfcd0	bl 0x00c37a80
00acfcd4	mov x20,x0
00acfcd8	cbz x0,0x00acfe18
00acfcdc	ldr x0,[x20, #0x8]
00acfce0	cbz x0,0x00acfcf0
00acfce4	bl 0x00c38290
00acfce8	str x0,[x20, #0x20]
00acfcec	cbz x0,0x00acfe0c
00acfcf0	mov x0,x19
00acfcf4	mov x1,x20
00acfcf8	bl 0x00c3fd50
00acfcfc	cbz w0,0x00acfe18
00acfd00	cbz x19,0x00acfdc0
00acfd04	mov x0,x19
00acfd08	bl 0x00c3fc90
00acfd0c	cbz x0,0x00acfdc0
00acfd10	mov x20,x0
00acfd14	mov x0,x19
00acfd18	bl 0x00c3fcd0
00acfd1c	cbz x0,0x00acfdc0
00acfd20	mov x19,x0
00acfd24	sub x1,x29,#0x18
00acfd28	sub x2,x29,#0x28
00acfd2c	sub x3,x29,#0x2c
00acfd30	add x4,sp,#0x30
00acfd34	mov x0,x20
00acfd38	stur xzr,[x29, #-0x18]
00acfd3c	stur xzr,[x29, #-0x28]
00acfd40	bl 0x00acfbc0
00acfd44	cbz w0,0x00acfe20
00acfd48	ldur x0,[x29, #-0x18]
00acfd4c	bl 0x00c34c30
00acfd50	ldur x8,[x29, #-0x28]
00acfd54	mov w21,w0
00acfd58	mov x0,x8
00acfd5c	bl 0x00c34c30
00acfd60	mov w20,w0
00acfd64	add x0,sp,#0x18
00acfd68	bl 0x00c3fbb0
00acfd6c	cbz w0,0x00acfe20
00acfd70	add x0,sp,#0x18
00acfd74	mov w1,w21
00acfd78	bl 0x00c3fbc0
00acfd7c	cbz w0,0x00acfe20
00acfd80	add x0,sp,#0x18
00acfd84	mov w1,w20
00acfd88	bl 0x00c3fbd0
00acfd8c	cbz w0,0x00acfe20
00acfd90	ldur w1,[x29, #-0x2c]
00acfd94	add x0,sp,#0x18
00acfd98	bl 0x00c3fbe0
00acfd9c	cbz w0,0x00acfe20
00acfda0	ldr w1,[sp, #0x30]
00acfda4	add x0,sp,#0x18
00acfda8	bl 0x00c3fd20
00acfdac	cbz w0,0x00acfe20
00acfdb0	ldr w8,[sp, #0x28]
00acfdb4	str w8,[x19, #0x10]
00acfdb8	ldur q0,[sp, #0x18]
00acfdbc	str q0,[x19]
00acfdc0	mov w0,#0x1
00acfdc4	ldp x29,x30,[sp, #0x60]
00acfdc8	ldp x20,x19,[sp, #0x50]
00acfdcc	ldr x21,[sp, #0x40]
00acfdd0	add sp,sp,#0x70
00acfdd4	ret
00acfdd8	bl 0x00c342a0
00acfddc	adrp x0,0x2c4000
00acfde0	adrp x2,0x2c8000
00acfde4	add x0,x0,#0x1a6
00acfde8	add x2,x2,#0x1eb
00acfdec	mov w1,#0x217
00acfdf0	bl 0x00c342b0
00acfdf4	mov w0,#0x4
00acfdf8	mov w1,#0x95
00acfdfc	mov x2,xzr
00acfe00	bl 0x00c342c0
00acfe04	mov w0,wzr
00acfe08	b 0x00acfdc4
00acfe0c	mov x0,x20
00acfe10	bl 0x00c3fa40
00acfe14	mov x20,xzr
00acfe18	mov x0,x20
00acfe1c	bl 0x00c3fa40
00acfe20	mov w0,wzr
00acfe24	b 0x00acfdc4

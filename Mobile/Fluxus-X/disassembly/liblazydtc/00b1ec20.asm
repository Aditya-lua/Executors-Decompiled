; d2i_X509_AUX @ 00b1ec20
00b1ec20	str x23,[sp, #-0x40]!
00b1ec24	stp x22,x21,[sp, #0x10]
00b1ec28	stp x20,x19,[sp, #0x20]
00b1ec2c	stp x29,x30,[sp, #0x30]
00b1ec30	ldr x8,[x1]
00b1ec34	mov x22,x2
00b1ec38	mov x20,x1
00b1ec3c	mov x19,x0
00b1ec40	add x29,sp,#0x30
00b1ec44	str x8,[sp, #0x8]
00b1ec48	cbz x0,0x00b1ec58
00b1ec4c	ldr x8,[x19]
00b1ec50	mov w23,wzr
00b1ec54	cbnz x8,0x00b1ec5c
00b1ec58	mov w23,#0x1
00b1ec5c	adrp x3,0xc82000
00b1ec60	add x3,x3,#0x968
00b1ec64	add x1,sp,#0x8
00b1ec68	mov x0,x19
00b1ec6c	mov x2,x22
00b1ec70	bl 0x00c36150
00b1ec74	mov x21,x0
00b1ec78	cbz x0,0x00b1ecac
00b1ec7c	ldr x8,[sp, #0x8]
00b1ec80	ldr x9,[x20]
00b1ec84	sub x9,x9,x8
00b1ec88	add x2,x9,x22
00b1ec8c	cmp x2,#0x1
00b1ec90	b.lt 0x00b1eca8
00b1ec94	add x0,x21,#0x150
00b1ec98	add x1,sp,#0x8
00b1ec9c	bl 0x00c40f60
00b1eca0	cbz x0,0x00b1ecc4
00b1eca4	ldr x8,[sp, #0x8]
00b1eca8	str x8,[x20]
00b1ecac	mov x0,x21
00b1ecb0	ldp x29,x30,[sp, #0x30]
00b1ecb4	ldp x20,x19,[sp, #0x20]
00b1ecb8	ldp x22,x21,[sp, #0x10]
00b1ecbc	ldr x23,[sp], #0x40
00b1ecc0	ret
00b1ecc4	cbz w23,0x00b1ece8
00b1ecc8	adrp x1,0xc82000
00b1eccc	add x1,x1,#0x968
00b1ecd0	mov x0,x21
00b1ecd4	bl 0x00c36160
00b1ecd8	mov x21,xzr
00b1ecdc	cbz x19,0x00b1ecac
00b1ece0	str xzr,[x19]
00b1ece4	b 0x00b1ecac
00b1ece8	mov x21,xzr
00b1ecec	b 0x00b1ecac

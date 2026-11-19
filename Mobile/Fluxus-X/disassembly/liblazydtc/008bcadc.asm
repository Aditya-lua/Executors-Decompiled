; FUN_008bcadc @ 008bcadc
008bcadc	stp x29,x30,[sp, #-0x60]!
008bcae0	stp x28,x27,[sp, #0x10]
008bcae4	stp x26,x25,[sp, #0x20]
008bcae8	stp x24,x23,[sp, #0x30]
008bcaec	stp x22,x21,[sp, #0x40]
008bcaf0	stp x20,x19,[sp, #0x50]
008bcaf4	mov x29,sp
008bcaf8	eor w8,w3,w3, LSR #0x10
008bcafc	mov w9,#0xca6b
008bcb00	mov w28,#0x3700
008bcb04	movk w9,#0x85eb, LSL #16
008bcb08	mov x21,x2
008bcb0c	mov x19,x1
008bcb10	mul w8,w8,w9
008bcb14	mov w9,#0xae35
008bcb18	mov x20,x0
008bcb1c	movk w9,#0xc2b2, LSL #16
008bcb20	mov w24,#0xffffffff
008bcb24	adrp x22,0xd1f000
008bcb28	add x22,x22,#0xc90
008bcb2c	adrp x27,0xd1f000
008bcb30	movk w28,#0x7f, LSL #16
008bcb34	eor w8,w8,w8, LSR #0xd
008bcb38	mov w26,#0x1
008bcb3c	mul w8,w8,w9
008bcb40	eor w25,w8,w8, LSR #0x10
008bcb44	ldrb w8,[x19, #0x5]
008bcb48	ldr x9,[x19, #0x28]
008bcb4c	lsl w8,w24,w8
008bcb50	bic w8,w25,w8
008bcb54	add x23,x9,x8, LSL #0x5
008bcb58	ldr w8,[x23, #0xc]
008bcb5c	cbnz w8,0x008bcb78
008bcb60	ldarb w8,[x22]
008bcb64	tbz w8,#0x0,0x008bcc44
008bcb68	ldr x8,[x27, #0xc88]
008bcb6c	add x8,x8,x28
008bcb70	cmp x23,x8
008bcb74	b.ne 0x008bcc7c
008bcb78	ldr w8,[x19, #0xc]
008bcb7c	cmp w8,#0x1
008bcb80	b.lt 0x008bcba8
008bcb84	sub x8,x8,#0x1
008bcb88	ldr x9,[x19, #0x28]
008bcb8c	mov w10,w8
008bcb90	str w8,[x19, #0xc]
008bcb94	add x2,x9,x10, LSL #0x5
008bcb98	ldrb w9,[x2, #0x1c]
008bcb9c	tst w9,#0xf
008bcba0	b.ne 0x008bcb7c
008bcba4	b 0x008bcc6c
008bcba8	ldrb w8,[x19, #0x5]
008bcbac	ldr x9,[x19, #0x28]
008bcbb0	mov w11,wzr
008bcbb4	lsl w10,w26,w8
008bcbb8	sxtw x10,w10
008bcbbc	cbz x8,0x008bcc0c
008bcbc0	add x14,x9,x10, LSL #0x5
008bcbc4	and x13,x10,#-0x2
008bcbc8	mov w12,wzr
008bcbcc	and x8,x10,#0x1
008bcbd0	mov x15,x13
008bcbd4	sub x14,x14,#0x14
008bcbd8	ldr w16,[x14]
008bcbdc	ldur w17,[x14, #-0x20]
008bcbe0	sub x15,x15,#0x2
008bcbe4	sub x14,x14,#0x40
008bcbe8	cmp w16,#0x0
008bcbec	cinc w11,w11,ne
008bcbf0	cmp w17,#0x0
008bcbf4	cinc w12,w12,ne
008bcbf8	cbnz x15,0x008bcbd8
008bcbfc	cmp x13,x10
008bcc00	add w11,w12,w11
008bcc04	b.ne 0x008bcc10
008bcc08	b 0x008bcc2c
008bcc0c	mov x8,x10
008bcc10	add x9,x9,x8, LSL #0x5
008bcc14	sub x9,x9,#0x14
008bcc18	ldr w10,[x9], #-0x20
008bcc1c	sub x8,x8,#0x1
008bcc20	cmp w10,#0x0
008bcc24	cinc w11,w11,ne
008bcc28	cbnz x8,0x008bcc18
008bcc2c	ldr w2,[x19, #0x8]
008bcc30	add w3,w11,#0x1
008bcc34	mov x0,x20
008bcc38	mov x1,x19
008bcc3c	bl 0x008ba968
008bcc40	b 0x008bcb44
008bcc44	mov x0,x22
008bcc48	bl 0x00c2fe90
008bcc4c	cbz w0,0x008bcb68
008bcc50	adrp x8,0xcca000
008bcc54	ldr x0,[x8, #0x8c8]
008bcc58	bl 0x007fe1ec
008bcc5c	str x0,[x27, #0xc88]
008bcc60	mov x0,x22
008bcc64	bl 0x00c2fea0
008bcc68	b 0x008bcb68
008bcc6c	mov x0,x19
008bcc70	mov x1,x23
008bcc74	bl 0x008bda50
008bcc78	mov x23,x0
008bcc7c	ldr x8,[x21]
008bcc80	ldr w9,[x23, #0x1c]
008bcc84	str x8,[x23, #0x10]
008bcc88	ldr w8,[x21, #0x8]
008bcc8c	str w8,[x23, #0x18]
008bcc90	ldr w8,[x21, #0xc]
008bcc94	bfxil w9,w8,#0x0,#0x4
008bcc98	str w9,[x23, #0x1c]
008bcc9c	ldr w8,[x21, #0xc]
008bcca0	cmp w8,#0x5
008bcca4	b.lt 0x008bcccc
008bcca8	ldrb w8,[x19, #0x2]
008bccac	tbz w8,#0x2,0x008bcccc
008bccb0	ldr x2,[x21]
008bccb4	ldrb w8,[x2, #0x2]
008bccb8	tst w8,#0x3
008bccbc	b.eq 0x008bcccc
008bccc0	mov x0,x20
008bccc4	mov x1,x19
008bccc8	bl 0x008b6370
008bcccc	mov x0,x23
008bccd0	ldp x20,x19,[sp, #0x50]
008bccd4	ldp x22,x21,[sp, #0x40]
008bccd8	ldp x24,x23,[sp, #0x30]
008bccdc	ldp x26,x25,[sp, #0x20]
008bcce0	ldp x28,x27,[sp, #0x10]
008bcce4	ldp x29,x30,[sp], #0x60
008bcce8	ret

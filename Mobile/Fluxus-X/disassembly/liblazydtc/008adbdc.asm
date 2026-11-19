; FUN_008adbdc @ 008adbdc
008adbdc	stp x29,x30,[sp, #-0x20]!
008adbe0	stp x20,x19,[sp, #0x10]
008adbe4	mov x29,sp
008adbe8	cmp w1,#0x1
008adbec	mov x19,x0
008adbf0	b.lt 0x008adc2c
008adbf4	ldp x9,x8,[x19, #0x68]
008adbf8	add x8,x8,w1, UXTW  #0x4
008adbfc	sub x0,x8,#0x10
008adc00	cmp x0,x9
008adc04	b.cc 0x008adc4c
008adc08	adrp x8,0xd1f000
008adc0c	add x8,x8,#0x1e0
008adc10	ldarb w9,[x8]
008adc14	adrp x8,0xd1f000
008adc18	tbz w9,#0x0,0x008adcf4
008adc1c	ldr x8,[x8, #0x1d8]
008adc20	add x8,x8,#0x7f2, LSL #12
008adc24	add x0,x8,#0xef0
008adc28	b 0x008adc4c
008adc2c	mov w8,#0xffffd8f1
008adc30	cmp w1,w8
008adc34	b.lt 0x008adc44
008adc38	ldr x8,[x19, #0x68]
008adc3c	add x0,x8,w1, SXTW  #0x4
008adc40	b 0x008adc4c
008adc44	mov x0,x19
008adc48	bl 0x008aea7c
008adc4c	ldr x8,[x19, #0x68]
008adc50	ldur w9,[x8, #-0x4]
008adc54	cbz w9,0x008adc60
008adc58	ldur x2,[x8, #-0x10]
008adc5c	b 0x008adc64
008adc60	mov x2,xzr
008adc64	ldr w8,[x0, #0xc]
008adc68	cmp w8,#0x8
008adc6c	b.eq 0x008adc90
008adc70	cmp w8,#0x6
008adc74	b.ne 0x008adcc0
008adc78	ldr x8,[x0]
008adc7c	ldrb w9,[x8, #0x7]
008adc80	cbnz w9,0x008adcec
008adc84	str x2,[x8, #0x10]
008adc88	cbnz x2,0x008adc9c
008adc8c	b 0x008adcd0
008adc90	ldr x8,[x0]
008adc94	str x2,[x8, #0x8]
008adc98	cbz x2,0x008adcd0
008adc9c	ldr x1,[x0]
008adca0	ldrb w8,[x1, #0x2]
008adca4	tbz w8,#0x2,0x008adcd0
008adca8	ldrb w8,[x2, #0x2]
008adcac	tst w8,#0x3
008adcb0	b.eq 0x008adcd0
008adcb4	mov x0,x19
008adcb8	bl 0x008b6188
008adcbc	b 0x008adcd0
008adcc0	sxtw x8,w8
008adcc4	ldr x9,[x19, #0x60]
008adcc8	add x8,x9,x8, LSL #0x3
008adccc	str x2,[x8, #0x448]
008adcd0	ldr x8,[x19, #0x68]
008adcd4	mov w0,#0x1
008adcd8	sub x8,x8,#0x10
008adcdc	str x8,[x19, #0x68]
008adce0	ldp x20,x19,[sp, #0x10]
008adce4	ldp x29,x30,[sp], #0x20
008adce8	ret
008adcec	mov x0,x19
008adcf0	bl 0x008b3cec
008adcf4	adrp x0,0xd1f000
008adcf8	add x0,x0,#0x1e0
008adcfc	bl 0x00c2fe90
008add00	adrp x8,0xd1f000
008add04	cbz w0,0x008adc1c
008add08	adrp x8,0xcca000
008add0c	ldr x0,[x8, #0x8c8]
008add10	bl 0x007fe1ec
008add14	adrp x20,0xd1f000
008add18	str x0,[x20, #0x1d8]
008add1c	adrp x0,0xd1f000
008add20	add x0,x0,#0x1e0
008add24	bl 0x00c2fea0
008add28	mov x8,x20
008add2c	b 0x008adc1c

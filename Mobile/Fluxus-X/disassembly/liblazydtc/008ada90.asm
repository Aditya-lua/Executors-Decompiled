; FUN_008ada90 @ 008ada90
008ada90	stp x29,x30,[sp, #-0x30]!
008ada94	str x21,[sp, #0x10]
008ada98	stp x20,x19,[sp, #0x20]
008ada9c	mov x29,sp
008adaa0	cmp w1,#0x1
008adaa4	mov x19,x0
008adaa8	b.lt 0x008adae4
008adaac	ldp x9,x8,[x19, #0x68]
008adab0	add x8,x8,w1, UXTW  #0x4
008adab4	sub x20,x8,#0x10
008adab8	cmp x20,x9
008adabc	b.cc 0x008adb10
008adac0	adrp x8,0xd1f000
008adac4	add x8,x8,#0x1e0
008adac8	adrp x20,0xd1f000
008adacc	ldarb w8,[x8]
008adad0	tbz w8,#0x0,0x008adb88
008adad4	ldr x8,[x20, #0x1d8]
008adad8	add x8,x8,#0x7f2, LSL #12
008adadc	add x20,x8,#0xef0
008adae0	b 0x008adb10
008adae4	mov w8,#0xffffd8f1
008adae8	cmp w1,w8
008adaec	b.lt 0x008adafc
008adaf0	ldr x8,[x19, #0x68]
008adaf4	add x20,x8,w1, SXTW  #0x4
008adaf8	b 0x008adb10
008adafc	mov x0,x19
008adb00	mov w20,w2
008adb04	bl 0x008aea7c
008adb08	mov w2,w20
008adb0c	mov x20,x0
008adb10	ldr x1,[x20]
008adb14	ldrb w8,[x1, #0x7]
008adb18	cbnz w8,0x008adb80
008adb1c	ldr x21,[x19, #0x68]
008adb20	mov x0,x19
008adb24	bl 0x008bcd04
008adb28	ldur q0,[x21, #-0x10]
008adb2c	str q0,[x0]
008adb30	ldr x8,[x19, #0x68]
008adb34	ldur w9,[x8, #-0x4]
008adb38	cmp w9,#0x5
008adb3c	b.lt 0x008adb68
008adb40	ldr x1,[x20]
008adb44	ldrb w9,[x1, #0x2]
008adb48	tbz w9,#0x2,0x008adb68
008adb4c	ldur x2,[x8, #-0x10]
008adb50	ldrb w9,[x2, #0x2]
008adb54	tst w9,#0x3
008adb58	b.eq 0x008adb68
008adb5c	mov x0,x19
008adb60	bl 0x008b6370
008adb64	ldr x8,[x19, #0x68]
008adb68	sub x8,x8,#0x10
008adb6c	str x8,[x19, #0x68]
008adb70	ldp x20,x19,[sp, #0x20]
008adb74	ldr x21,[sp, #0x10]
008adb78	ldp x29,x30,[sp], #0x30
008adb7c	ret
008adb80	mov x0,x19
008adb84	bl 0x008b3cec
008adb88	adrp x0,0xd1f000
008adb8c	add x0,x0,#0x1e0
008adb90	str w2,[x29, #0x1c]
008adb94	bl 0x00c2fe90
008adb98	ldr w2,[x29, #0x1c]
008adb9c	cbz w0,0x008adad4
008adba0	adrp x8,0xcca000
008adba4	ldr x0,[x8, #0x8c8]
008adba8	bl 0x007fe1ec
008adbac	str x0,[x20, #0x1d8]
008adbb0	adrp x0,0xd1f000
008adbb4	add x0,x0,#0x1e0
008adbb8	bl 0x00c2fea0
008adbbc	ldr w2,[x29, #0x1c]
008adbc0	b 0x008adad4

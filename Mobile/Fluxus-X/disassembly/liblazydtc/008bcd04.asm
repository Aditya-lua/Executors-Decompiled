; FUN_008bcd04 @ 008bcd04
008bcd04	sub sp,sp,#0x60
008bcd08	stp x29,x30,[sp, #0x20]
008bcd0c	str x23,[sp, #0x30]
008bcd10	stp x22,x21,[sp, #0x40]
008bcd14	stp x20,x19,[sp, #0x50]
008bcd18	add x29,sp,#0x20
008bcd1c	mrs x22,tpidr_el0
008bcd20	ldr x8,[x22, #0x28]
008bcd24	stur x8,[x29, #-0x8]
008bcd28	sub w8,w2,#0x1
008bcd2c	ldr w9,[x1, #0x8]
008bcd30	cmp w8,w9
008bcd34	b.cs 0x008bcd44
008bcd38	ldr x9,[x1, #0x20]
008bcd3c	add x0,x9,w8, SXTW  #0x4
008bcd40	b 0x008bcda8
008bcd44	mov x20,x0
008bcd48	mov x21,x1
008bcd4c	mov x0,x1
008bcd50	mov w1,w2
008bcd54	mov w19,w2
008bcd58	bl 0x008bb19c
008bcd5c	adrp x8,0xd1f000
008bcd60	add x8,x8,#0x1e0
008bcd64	adrp x9,0xd1f000
008bcd68	ldarb w8,[x8]
008bcd6c	tbz w8,#0x0,0x008bcdd0
008bcd70	ldr x8,[x9, #0x1d8]
008bcd74	add x8,x8,#0x7f2, LSL #12
008bcd78	add x8,x8,#0xef0
008bcd7c	cmp x0,x8
008bcd80	b.ne 0x008bcda8
008bcd84	scvtf d0,w19
008bcd88	mov w8,#0x3
008bcd8c	add x2,sp,#0x8
008bcd90	mov x0,x20
008bcd94	mov x1,x21
008bcd98	mov w3,w19
008bcd9c	str w8,[sp, #0x14]
008bcda0	str d0,[sp, #0x8]
008bcda4	bl 0x008bc2bc
008bcda8	ldr x8,[x22, #0x28]
008bcdac	ldur x9,[x29, #-0x8]
008bcdb0	cmp x8,x9
008bcdb4	b.ne 0x008bce48
008bcdb8	ldp x20,x19,[sp, #0x50]
008bcdbc	ldr x23,[sp, #0x30]
008bcdc0	ldp x22,x21,[sp, #0x40]
008bcdc4	ldp x29,x30,[sp, #0x20]
008bcdc8	add sp,sp,#0x60
008bcdcc	ret
008bcdd0	adrp x8,0xd1f000
008bcdd4	add x8,x8,#0x1e0
008bcdd8	str x0,[sp]
008bcddc	mov x0,x8
008bcde0	bl 0x00c2fe90
008bcde4	mov w8,w0
008bcde8	ldr x0,[sp]
008bcdec	adrp x9,0xd1f000
008bcdf0	cbz w8,0x008bcd70
008bcdf4	adrp x8,0xcca000
008bcdf8	ldr x0,[x8, #0x8c8]
008bcdfc	bl 0x007fe1ec
008bce00	adrp x23,0xd1f000
008bce04	str x0,[x23, #0x1d8]
008bce08	adrp x0,0xd1f000
008bce0c	add x0,x0,#0x1e0
008bce10	bl 0x00c2fea0
008bce14	ldr x0,[sp]
008bce18	mov x9,x23
008bce1c	b 0x008bcd70
008bce48	bl 0x00c2fec0

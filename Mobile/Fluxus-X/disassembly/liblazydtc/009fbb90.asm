; BIO_hex_string @ 009fbb90
009fbb90	sub sp,sp,#0x70
009fbb94	stp x24,x23,[sp, #0x30]
009fbb98	subs w23,w4,#0x1
009fbb9c	stp x28,x27,[sp, #0x10]
009fbba0	stp x26,x25,[sp, #0x20]
009fbba4	stp x22,x21,[sp, #0x40]
009fbba8	stp x20,x19,[sp, #0x50]
009fbbac	stp x29,x30,[sp, #0x60]
009fbbb0	add x29,sp,#0x60
009fbbb4	b.lt 0x009fbc94
009fbbb8	mov x27,x3
009fbbbc	mov x20,x0
009fbbc0	b.eq 0x009fbc80
009fbbc4	str w23,[sp, #0x4]
009fbbc8	mov w28,w23
009fbbcc	adrp x23,0x2c3000
009fbbd0	adrp x24,0x2c4000
009fbbd4	adrp x25,0x2bb000
009fbbd8	adrp x26,0x2ab000
009fbbdc	mov w22,w2
009fbbe0	mov w21,w1
009fbbe4	mov w19,wzr
009fbbe8	mov w8,#0x1
009fbbec	add x23,x23,#0x714
009fbbf0	add x24,x24,#0xdae
009fbbf4	add x25,x25,#0x9d8
009fbbf8	add x26,x26,#0x32c
009fbbfc	str x27,[sp, #0x8]
009fbc00	tbnz w8,#0x0,0x009fbc18
009fbc04	mov x0,x20
009fbc08	mov x1,x25
009fbc0c	mov w2,w21
009fbc10	mov x3,x26
009fbc14	bl 0x00c32250
009fbc18	ldrb w2,[x27]
009fbc1c	mov x0,x20
009fbc20	mov x1,x23
009fbc24	bl 0x00c32250
009fbc28	add w8,w19,#0x1
009fbc2c	sdiv w9,w8,w22
009fbc30	msub w19,w9,w22,w8
009fbc34	cbnz w19,0x009fbc44
009fbc38	mov x0,x20
009fbc3c	mov x1,x24
009fbc40	bl 0x00c32250
009fbc44	cmp w19,#0x0
009fbc48	cset w8,ne
009fbc4c	subs x28,x28,#0x1
009fbc50	add x27,x27,#0x1
009fbc54	b.ne 0x009fbc00
009fbc58	ldr x27,[sp, #0x8]
009fbc5c	ldr w23,[sp, #0x4]
009fbc60	cbnz w19,0x009fbc80
009fbc64	adrp x1,0x2bb000
009fbc68	adrp x3,0x2ab000
009fbc6c	add x1,x1,#0x9d8
009fbc70	add x3,x3,#0x32c
009fbc74	mov x0,x20
009fbc78	mov w2,w21
009fbc7c	bl 0x00c32250
009fbc80	ldrb w2,[x27, w23, SXTW ]
009fbc84	adrp x1,0x2c7000
009fbc88	add x1,x1,#0x74b
009fbc8c	mov x0,x20
009fbc90	bl 0x00c32250
009fbc94	ldp x29,x30,[sp, #0x60]
009fbc98	ldp x20,x19,[sp, #0x50]
009fbc9c	ldp x22,x21,[sp, #0x40]
009fbca0	ldp x24,x23,[sp, #0x30]
009fbca4	ldp x26,x25,[sp, #0x20]
009fbca8	ldp x28,x27,[sp, #0x10]
009fbcac	mov w0,#0x1
009fbcb0	add sp,sp,#0x70
009fbcb4	ret

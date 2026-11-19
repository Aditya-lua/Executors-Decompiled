; ASN1_TYPE_set @ 009efafc
009efafc	sub sp,sp,#0x30
009efb00	stp x20,x19,[sp, #0x10]
009efb04	stp x29,x30,[sp, #0x20]
009efb08	str x0,[sp, #0x8]
009efb0c	ldr w8,[x0]
009efb10	mov x19,x2
009efb14	mov w20,w1
009efb18	add x29,sp,#0x20
009efb1c	orr w8,w8,#0x4
009efb20	cmp w8,#0x5
009efb24	b.eq 0x009efb44
009efb28	ldr x8,[x0, #0x8]
009efb2c	cbz x8,0x009efb44
009efb30	add x0,sp,#0x8
009efb34	mov x1,xzr
009efb38	mov w2,wzr
009efb3c	bl 0x00c37ac0
009efb40	ldr x0,[sp, #0x8]
009efb44	cmp w20,#0x1
009efb48	str w20,[x0]
009efb4c	b.ne 0x009efb64
009efb50	cmp x19,#0x0
009efb54	orr w8,wzr,#0xff
009efb58	csel w8,wzr,w8,eq
009efb5c	str w8,[x0, #0x8]
009efb60	b 0x009efb68
009efb64	str x19,[x0, #0x8]
009efb68	ldp x29,x30,[sp, #0x20]
009efb6c	ldp x20,x19,[sp, #0x10]
009efb70	add sp,sp,#0x30
009efb74	ret

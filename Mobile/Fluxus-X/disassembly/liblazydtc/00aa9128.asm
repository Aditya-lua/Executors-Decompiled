; CRYPTO_cfb128_8_encrypt @ 00aa9128
00aa9128	sub sp,sp,#0x60
00aa912c	stp x26,x25,[sp, #0x10]
00aa9130	stp x24,x23,[sp, #0x20]
00aa9134	stp x22,x21,[sp, #0x30]
00aa9138	stp x20,x19,[sp, #0x40]
00aa913c	stp x29,x30,[sp, #0x50]
00aa9140	add x29,sp,#0x50
00aa9144	cbz x2,0x00aa91b8
00aa9148	mov x8,sp
00aa914c	mov x19,x7
00aa9150	mov w20,w6
00aa9154	mov x21,x4
00aa9158	mov x22,x3
00aa915c	mov x23,x2
00aa9160	mov x24,x1
00aa9164	mov x25,x0
00aa9168	orr x26,x8,#0x1
00aa916c	ldr q0,[x21]
00aa9170	mov x0,x21
00aa9174	mov x1,x21
00aa9178	mov x2,x22
00aa917c	str q0,[sp]
00aa9180	blr x19
00aa9184	ldrb w8,[x25], #0x1
00aa9188	ldrb w9,[x21]
00aa918c	cmp w20,#0x0
00aa9190	eor w9,w9,w8
00aa9194	strb w9,[x24], #0x1
00aa9198	ldur x10,[x26, #0x7]
00aa919c	csel w8,w8,w9,eq
00aa91a0	subs x23,x23,#0x1
00aa91a4	stur x10,[x21, #0x7]
00aa91a8	ldr x10,[x26]
00aa91ac	strb w8,[x21, #0xf]
00aa91b0	str x10,[x21]
00aa91b4	b.ne 0x00aa916c
00aa91b8	ldp x29,x30,[sp, #0x50]
00aa91bc	ldp x20,x19,[sp, #0x40]
00aa91c0	ldp x22,x21,[sp, #0x30]
00aa91c4	ldp x24,x23,[sp, #0x20]
00aa91c8	ldp x26,x25,[sp, #0x10]
00aa91cc	add sp,sp,#0x60
00aa91d0	ret

; EVP_PKEY_set1_DH @ 00a6dbec
00a6dbec	str x21,[sp, #-0x30]!
00a6dbf0	stp x20,x19,[sp, #0x10]
00a6dbf4	mov x20,x0
00a6dbf8	mov x0,x1
00a6dbfc	stp x29,x30,[sp, #0x20]
00a6dc00	add x29,sp,#0x20
00a6dc04	mov x19,x1
00a6dc08	bl 0x00c39ee0
00a6dc0c	orr w21,wzr,#0x1c
00a6dc10	cbnz w0,0x00a6dc28
00a6dc14	mov x0,x19
00a6dc18	bl 0x00c39b00
00a6dc1c	cmp x0,#0x0
00a6dc20	mov w8,#0x398
00a6dc24	csel w21,w21,w8,eq
00a6dc28	mov x0,x20
00a6dc2c	mov w1,w21
00a6dc30	mov x2,x19
00a6dc34	bl 0x00a6d628
00a6dc38	mov w20,w0
00a6dc3c	cbz w0,0x00a6dc48
00a6dc40	mov x0,x19
00a6dc44	bl 0x00c3a000
00a6dc48	mov w0,w20
00a6dc4c	ldp x29,x30,[sp, #0x20]
00a6dc50	ldp x20,x19,[sp, #0x10]
00a6dc54	ldr x21,[sp], #0x30
00a6dc58	ret

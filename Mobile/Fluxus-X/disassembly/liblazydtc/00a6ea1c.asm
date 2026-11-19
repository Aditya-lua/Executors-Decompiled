; EVP_PKEY_set1_encoded_public_key @ 00a6ea1c
00a6ea1c	cbz x0,0x00a6ea88
00a6ea20	ldr x9,[x0, #0x60]
00a6ea24	mov x8,x2
00a6ea28	mov x3,x1
00a6ea2c	cbz x9,0x00a6ea44
00a6ea30	adrp x1,0x2bd000
00a6ea34	add x1,x1,#0xb5e
00a6ea38	mov x2,x3
00a6ea3c	mov x3,x8
00a6ea40	b 0x00a6ea94
00a6ea44	lsr x10,x8,#0x1f
00a6ea48	cbnz x10,0x00a6ea8c
00a6ea4c	ldr x9,[x0, #0x8]
00a6ea50	cbz x9,0x00a6ea88
00a6ea54	ldr x9,[x9, #0xb0]
00a6ea58	cbz x9,0x00a6ea88
00a6ea5c	stp x29,x30,[sp, #-0x10]!
00a6ea60	sxtw x2,w8
00a6ea64	mov w1,#0x9
00a6ea68	mov x29,sp
00a6ea6c	blr x9
00a6ea70	cmp w0,#0x0
00a6ea74	ldp x29,x30,[sp], #0x10
00a6ea78	b.le 0x00a6ea88
00a6ea7c	mov w9,#0x1
00a6ea80	mov w0,w9
00a6ea84	ret
00a6ea88	mov w9,wzr
00a6ea8c	mov w0,w9
00a6ea90	ret

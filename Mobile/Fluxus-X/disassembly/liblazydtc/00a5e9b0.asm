; EVP_CIPHER_set_asn1_iv @ 00a5e9b0
00a5e9b0	sub sp,sp,#0xc0
00a5e9b4	stp x22,x21,[sp, #0x90]
00a5e9b8	stp x20,x19,[sp, #0xa0]
00a5e9bc	stp x29,x30,[sp, #0xb0]
00a5e9c0	add x29,sp,#0xb0
00a5e9c4	cbz x1,0x00a5ea54
00a5e9c8	mov x19,x1
00a5e9cc	mov x20,x0
00a5e9d0	add x8,x0,#0x18
00a5e9d4	add x0,sp,#0x30
00a5e9d8	mov w2,#0x50
00a5e9dc	mov w1,wzr
00a5e9e0	stur x8,[x29, #-0x28]
00a5e9e4	bl 0x00c301c0
00a5e9e8	adrp x0,0x2bd000
00a5e9ec	add x0,x0,#0xad8
00a5e9f0	add x8,sp,#0x8
00a5e9f4	sub x1,x29,#0x28
00a5e9f8	mov w2,#0x10
00a5e9fc	bl 0x00c36de0
00a5ea00	ldr x8,[sp, #0x28]
00a5ea04	ldur q0,[sp, #0x18]
00a5ea08	ldur q1,[sp, #0x8]
00a5ea0c	add x2,sp,#0x30
00a5ea10	str x8,[sp, #0x50]
00a5ea14	stp q1,q0,[sp, #0x30]
00a5ea18	ldr x0,[x20]
00a5ea1c	ldr x1,[x20, #0xa8]
00a5ea20	bl 0x00c3cd60
00a5ea24	ldur x22,[x29, #-0x28]
00a5ea28	mov w21,w0
00a5ea2c	mov x0,x20
00a5ea30	bl 0x00a5e8c0
00a5ea34	cmp w0,#0x11
00a5ea38	b.cs 0x00a5ea6c
00a5ea3c	cmp w21,#0x0
00a5ea40	mov w2,w0
00a5ea44	csel x1,xzr,x22,eq
00a5ea48	mov x0,x19
00a5ea4c	bl 0x00c37da0
00a5ea50	b 0x00a5ea58
00a5ea54	mov w0,wzr
00a5ea58	ldp x29,x30,[sp, #0xb0]
00a5ea5c	ldp x20,x19,[sp, #0xa0]
00a5ea60	ldp x22,x21,[sp, #0x90]
00a5ea64	add sp,sp,#0xc0
00a5ea68	ret
00a5ea6c	adrp x0,0x2b4000
00a5ea70	adrp x1,0x2a0000
00a5ea74	add x0,x0,#0x296
00a5ea78	add x1,x1,#0x246
00a5ea7c	mov w2,#0x4a
00a5ea80	bl 0x00c3c240

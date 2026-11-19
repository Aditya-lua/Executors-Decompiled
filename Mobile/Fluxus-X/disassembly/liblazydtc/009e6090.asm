; construct_key_exchange_tbs @ 009e6090
009e6090	stp x24,x23,[sp, #-0x40]!
009e6094	stp x22,x21,[sp, #0x10]
009e6098	stp x20,x19,[sp, #0x20]
009e609c	mov x21,x1
009e60a0	add x20,x3,#0x40
009e60a4	adrp x1,0x2bb000
009e60a8	mov x23,x2
009e60ac	mov x19,x0
009e60b0	add x1,x1,#0x912
009e60b4	mov w2,#0x932
009e60b8	mov x0,x20
009e60bc	stp x29,x30,[sp, #0x30]
009e60c0	add x29,sp,#0x30
009e60c4	mov x22,x3
009e60c8	bl 0x00c32320
009e60cc	cbz x0,0x009e610c
009e60d0	ldr q0,[x19, #0x170]
009e60d4	mov x24,x0
009e60d8	mov x1,x23
009e60dc	mov x2,x22
009e60e0	str q0,[x0, #0x10]
009e60e4	ldr q0,[x19, #0x160]
009e60e8	str q0,[x0]
009e60ec	ldr q0,[x19, #0x140]
009e60f0	str q0,[x0, #0x20]
009e60f4	ldr q0,[x19, #0x150]
009e60f8	str q0,[x0, #0x30]
009e60fc	add x0,x0,#0x40
009e6100	bl 0x00c2ffd0
009e6104	str x24,[x21]
009e6108	b 0x009e6144
009e610c	bl 0x00c342a0
009e6110	adrp x0,0x2bb000
009e6114	adrp x2,0x2a5000
009e6118	add x0,x0,#0x912
009e611c	add x2,x2,#0xbb0
009e6120	mov w1,#0x935
009e6124	bl 0x00c342b0
009e6128	mov w2,#0x100
009e612c	mov w1,#0x50
009e6130	movk w2,#0xc, LSL #16
009e6134	mov x0,x19
009e6138	mov x3,xzr
009e613c	bl 0x00c34410
009e6140	mov x20,xzr
009e6144	mov x0,x20
009e6148	ldp x29,x30,[sp, #0x30]
009e614c	ldp x20,x19,[sp, #0x20]
009e6150	ldp x22,x21,[sp, #0x10]
009e6154	ldp x24,x23,[sp], #0x40
009e6158	ret

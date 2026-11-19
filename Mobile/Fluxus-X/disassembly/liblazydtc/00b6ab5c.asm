; mbedtls_cipher_check_tag @ 00b6ab5c
00b6ab5c	sub sp,sp,#0x60
00b6ab60	str x23,[sp, #0x20]
00b6ab64	stp x22,x21,[sp, #0x30]
00b6ab68	stp x20,x19,[sp, #0x40]
00b6ab6c	stp x29,x30,[sp, #0x50]
00b6ab70	add x29,sp,#0x50
00b6ab74	mrs x23,tpidr_el0
00b6ab78	ldr x8,[x23, #0x28]
00b6ab7c	mov x19,x2
00b6ab80	mov x21,x0
00b6ab84	mov x20,x1
00b6ab88	str x8,[sp, #0x18]
00b6ab8c	ldr x8,[x0]
00b6ab90	cbz x8,0x00b6ab9c
00b6ab94	ldr w9,[x21, #0xc]
00b6ab98	cbz w9,0x00b6abcc
00b6ab9c	mov w22,#0xffff9f00
00b6aba0	ldr x8,[x23, #0x28]
00b6aba4	ldr x9,[sp, #0x18]
00b6aba8	cmp x8,x9
00b6abac	b.ne 0x00b6ac8c
00b6abb0	mov w0,w22
00b6abb4	ldp x29,x30,[sp, #0x50]
00b6abb8	ldp x20,x19,[sp, #0x40]
00b6abbc	ldp x22,x21,[sp, #0x30]
00b6abc0	ldr x23,[sp, #0x20]
00b6abc4	add sp,sp,#0x60
00b6abc8	ret
00b6abcc	ldr w8,[x8, #0x8]
00b6abd0	and w9,w8,#0xf000
00b6abd4	cmp w9,#0x6, LSL #12
00b6abd8	b.ne 0x00b6ac24
00b6abdc	cmp x19,#0x10
00b6abe0	b.hi 0x00b6ab9c
00b6abe4	ldr x0,[x21, #0x50]
00b6abe8	mov x3,sp
00b6abec	add x4,sp,#0x8
00b6abf0	mov x1,xzr
00b6abf4	mov x2,xzr
00b6abf8	mov x5,x19
00b6abfc	bl 0x00c421c0
00b6ac00	mov w22,w0
00b6ac04	cbnz w0,0x00b6aba0
00b6ac08	add x1,sp,#0x8
00b6ac0c	mov x0,x20
00b6ac10	mov x2,x19
00b6ac14	bl 0x00c42190
00b6ac18	cbz w0,0x00b6ac7c
00b6ac1c	mov w22,#0xffff9d00
00b6ac20	b 0x00b6ac6c
00b6ac24	mov w22,#0xffff9f80
00b6ac28	and w8,w8,#0xff0000
00b6ac2c	cmp w8,#0x4d0, LSL #12
00b6ac30	b.ne 0x00b6ac6c
00b6ac34	cmp x19,#0x10
00b6ac38	b.ne 0x00b6ab9c
00b6ac3c	ldr x0,[x21, #0x50]
00b6ac40	add x1,sp,#0x8
00b6ac44	bl 0x00c420e0
00b6ac48	mov w22,w0
00b6ac4c	cbnz w0,0x00b6aba0
00b6ac50	add x1,sp,#0x8
00b6ac54	mov w2,#0x10
00b6ac58	mov x0,x20
00b6ac5c	bl 0x00c42190
00b6ac60	cmp w0,#0x0
00b6ac64	mov w8,#0xffff9d00
00b6ac68	csel w22,wzr,w8,eq
00b6ac6c	add x0,sp,#0x8
00b6ac70	mov x1,x19
00b6ac74	bl 0x00c42220
00b6ac78	b 0x00b6aba0
00b6ac7c	ldr x8,[x21]
00b6ac80	mov w22,wzr
00b6ac84	ldr w8,[x8, #0x8]
00b6ac88	b 0x00b6ac28
00b6ac8c	bl 0x00c2fec0

; FUN_00afc06c @ 00afc06c
00afc06c	stp x26,x25,[sp, #-0x50]!
00afc070	stp x22,x21,[sp, #0x20]
00afc074	stp x20,x19,[sp, #0x30]
00afc078	mov w22,w3
00afc07c	mov x20,x1
00afc080	adrp x1,0x2c6000
00afc084	adrp x3,0x2ab000
00afc088	mov x19,x2
00afc08c	add x1,x1,#0x2f2
00afc090	add x3,x3,#0x32c
00afc094	mov x0,x2
00afc098	mov w2,w22
00afc09c	stp x24,x23,[sp, #0x10]
00afc0a0	stp x29,x30,[sp, #0x40]
00afc0a4	add x29,sp,#0x40
00afc0a8	bl 0x00c32250
00afc0ac	cmp w0,#0x1
00afc0b0	b.lt 0x00afc188
00afc0b4	ldr x1,[x20]
00afc0b8	mov w3,#0x31f
00afc0bc	movk w3,#0x82, LSL #16
00afc0c0	mov x0,x19
00afc0c4	mov w2,wzr
00afc0c8	bl 0x00c32bd0
00afc0cc	cmp w0,#0x1
00afc0d0	b.lt 0x00afc188
00afc0d4	ldr x0,[x20, #0x8]
00afc0d8	bl 0x00c325e0
00afc0dc	cmp w0,#0x1
00afc0e0	b.lt 0x00afc180
00afc0e4	adrp x23,0x2dc000
00afc0e8	adrp x24,0x2ab000
00afc0ec	adrp x25,0x2b2000
00afc0f0	mov w21,wzr
00afc0f4	lsl w22,w22,#0x1
00afc0f8	add x23,x23,#0xa61
00afc0fc	add x24,x24,#0x32c
00afc100	add x25,x25,#0xc7c
00afc104	ldr x0,[x20, #0x8]
00afc108	mov w1,w21
00afc10c	bl 0x00c32610
00afc110	mov x26,x0
00afc114	mov x0,x19
00afc118	mov x1,x23
00afc11c	mov w2,w22
00afc120	mov x3,x24
00afc124	bl 0x00c32250
00afc128	cmp w0,#0x1
00afc12c	b.lt 0x00afc188
00afc130	ldr x1,[x26]
00afc134	mov x0,x19
00afc138	bl 0x00c32da0
00afc13c	cmp w0,#0x1
00afc140	b.lt 0x00afc188
00afc144	mov x0,x19
00afc148	mov x1,x25
00afc14c	bl 0x00c32260
00afc150	cmp w0,#0x1
00afc154	b.lt 0x00afc188
00afc158	ldr x1,[x26, #0x8]
00afc15c	mov x0,x19
00afc160	bl 0x00c3f070
00afc164	cmp w0,#0x0
00afc168	b.le 0x00afc188
00afc16c	ldr x0,[x20, #0x8]
00afc170	add w21,w21,#0x1
00afc174	bl 0x00c325e0
00afc178	cmp w21,w0
00afc17c	b.lt 0x00afc104
00afc180	mov w0,#0x1
00afc184	b 0x00afc18c
00afc188	mov w0,wzr
00afc18c	ldp x29,x30,[sp, #0x40]
00afc190	ldp x20,x19,[sp, #0x30]
00afc194	ldp x22,x21,[sp, #0x20]
00afc198	ldp x24,x23,[sp, #0x10]
00afc19c	ldp x26,x25,[sp], #0x50
00afc1a0	ret

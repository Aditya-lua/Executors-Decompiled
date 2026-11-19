; ossl_rand_pool_add @ 00aca9ec
00aca9ec	stp x22,x21,[sp, #-0x30]!
00aca9f0	stp x20,x19,[sp, #0x10]
00aca9f4	stp x29,x30,[sp, #0x20]
00aca9f8	ldr x9,[x0, #0x20]
00aca9fc	ldr x8,[x0, #0x8]
00acaa00	add x29,sp,#0x20
00acaa04	sub x9,x9,x8
00acaa08	cmp x9,x2
00acaa0c	b.cs 0x00acaa38
00acaa10	bl 0x00c342a0
00acaa14	adrp x0,0x29e000
00acaa18	adrp x2,0x2a2000
00acaa1c	add x0,x0,#0x966
00acaa20	add x2,x2,#0xc24
00acaa24	mov w1,#0x135
00acaa28	bl 0x00c342b0
00acaa2c	mov w0,#0x24
00acaa30	mov w1,#0x6a
00acaa34	b 0x00acaab0
00acaa38	ldr x9,[x0]
00acaa3c	mov x21,x0
00acaa40	cbz x9,0x00acaa88
00acaa44	mov x20,x2
00acaa48	cbz x2,0x00acab08
00acaa4c	add x9,x9,x8
00acaa50	mov x19,x3
00acaa54	mov x22,x1
00acaa58	cmp x9,x1
00acaa5c	b.ne 0x00acaacc
00acaa60	ldr x9,[x21, #0x28]
00acaa64	cmp x9,x8
00acaa68	b.ls 0x00acaacc
00acaa6c	bl 0x00c342a0
00acaa70	adrp x0,0x29e000
00acaa74	adrp x2,0x2a2000
00acaa78	add x0,x0,#0x966
00acaa7c	add x2,x2,#0xc24
00acaa80	mov w1,#0x148
00acaa84	b 0x00acaaa0
00acaa88	bl 0x00c342a0
00acaa8c	adrp x0,0x29e000
00acaa90	adrp x2,0x2a2000
00acaa94	add x0,x0,#0x966
00acaa98	add x2,x2,#0xc24
00acaa9c	mov w1,#0x13a
00acaaa0	bl 0x00c342b0
00acaaa4	mov w1,#0x103
00acaaa8	mov w0,#0x24
00acaaac	movk w1,#0xc, LSL #16
00acaab0	mov x2,xzr
00acaab4	bl 0x00c342c0
00acaab8	mov w0,wzr
00acaabc	ldp x29,x30,[sp, #0x20]
00acaac0	ldp x20,x19,[sp, #0x10]
00acaac4	ldp x22,x21,[sp], #0x30
00acaac8	ret
00acaacc	mov x0,x21
00acaad0	mov x1,x20
00acaad4	bl 0x00aca884
00acaad8	cbz w0,0x00acaabc
00acaadc	ldp x8,x9,[x21]
00acaae0	mov x1,x22
00acaae4	mov x2,x20
00acaae8	add x0,x8,x9
00acaaec	bl 0x00c2ffd0
00acaaf0	ldr x8,[x21, #0x8]
00acaaf4	ldr x9,[x21, #0x30]
00acaaf8	add x8,x8,x20
00acaafc	add x9,x9,x19
00acab00	str x8,[x21, #0x8]
00acab04	str x9,[x21, #0x30]
00acab08	mov w0,#0x1
00acab0c	b 0x00acaabc

; OSSL_STORE_supports_search @ 00aea9a8
00aea9a8	sub sp,sp,#0x80
00aea9ac	stp x24,x23,[sp, #0x40]
00aea9b0	stp x22,x21,[sp, #0x50]
00aea9b4	stp x20,x19,[sp, #0x60]
00aea9b8	stp x29,x30,[sp, #0x70]
00aea9bc	mov x20,x0
00aea9c0	ldr x0,[x0, #0x8]
00aea9c4	mov w19,w1
00aea9c8	str x25,[sp, #0x30]
00aea9cc	add x29,sp,#0x70
00aea9d0	cbz x0,0x00aeaabc
00aea9d4	bl 0x00c402e0
00aea9d8	bl 0x00c3b680
00aea9dc	ldr x8,[x20, #0x8]
00aea9e0	ldr x8,[x8, #0xa0]
00aea9e4	cbz x8,0x00aeaadc
00aea9e8	blr x8
00aea9ec	adrp x1,0x2be000
00aea9f0	add x1,x1,#0x36f
00aea9f4	mov x25,x0
00aea9f8	bl 0x00c36530
00aea9fc	adrp x1,0x2cd000
00aeaa00	mov x21,x0
00aeaa04	add x1,x1,#0xe11
00aeaa08	mov x0,x25
00aeaa0c	bl 0x00c36530
00aeaa10	adrp x1,0x2d2000
00aeaa14	mov x22,x0
00aeaa18	add x1,x1,#0x274
00aeaa1c	mov x0,x25
00aeaa20	bl 0x00c36530
00aeaa24	adrp x1,0x2c6000
00aeaa28	mov x23,x0
00aeaa2c	add x1,x1,#0x28a
00aeaa30	mov x0,x25
00aeaa34	bl 0x00c36530
00aeaa38	adrp x1,0x2dc000
00aeaa3c	mov x24,x0
00aeaa40	add x1,x1,#0x974
00aeaa44	mov x0,x25
00aeaa48	bl 0x00c36530
00aeaa4c	sub w8,w19,#0x1
00aeaa50	cmp w8,#0x3
00aeaa54	b.hi 0x00aeaa74
00aeaa58	adrp x9,0x777000
00aeaa5c	add x9,x9,#0x1d0
00aeaa60	ldrsw x8,[x9, x8, LSL #0x2]
00aeaa64	add x8,x8,x9
00aeaa68	br x8
00aeaa6c	cmp x21,#0x0
00aeaa70	b 0x00aeaab0
00aeaa74	mov w0,wzr
00aeaa78	ldr x8,[x20, #0x8]
00aeaa7c	cbnz x8,0x00aeaae0
00aeaa80	b 0x00aeaabc
00aeaa84	cmp x22,#0x0
00aeaa88	cset w8,ne
00aeaa8c	cmp x23,#0x0
00aeaa90	cset w9,ne
00aeaa94	and w0,w8,w9
00aeaa98	ldr x8,[x20, #0x8]
00aeaa9c	cbnz x8,0x00aeaae0
00aeaaa0	b 0x00aeaabc
00aeaaa4	cmp x24,#0x0
00aeaaa8	b 0x00aeaab0
00aeaaac	cmp x0,#0x0
00aeaab0	cset w0,ne
00aeaab4	ldr x8,[x20, #0x8]
00aeaab8	cbnz x8,0x00aeaae0
00aeaabc	ldr x8,[x20]
00aeaac0	ldr x8,[x8, #0x30]
00aeaac4	cbz x8,0x00aeaadc
00aeaac8	mov x1,sp
00aeaacc	mov x0,xzr
00aeaad0	str w19,[sp]
00aeaad4	blr x8
00aeaad8	b 0x00aeaae0
00aeaadc	mov w0,wzr
00aeaae0	ldp x29,x30,[sp, #0x70]
00aeaae4	ldp x20,x19,[sp, #0x60]
00aeaae8	ldp x22,x21,[sp, #0x50]
00aeaaec	ldp x24,x23,[sp, #0x40]
00aeaaf0	ldr x25,[sp, #0x30]
00aeaaf4	add sp,sp,#0x80
00aeaaf8	ret

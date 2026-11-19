; FUN_00946e30 @ 00946e30
00946e30	stp x22,x21,[sp, #-0x30]!
00946e34	stp x20,x19,[sp, #0x10]
00946e38	stp x29,x30,[sp, #0x20]
00946e3c	add x29,sp,#0x20
00946e40	mov x20,x0
00946e44	bl 0x00c2ff50
00946e48	sub x8,x0,#0x1
00946e4c	mov x19,x0
00946e50	cmp x8,#0x6
00946e54	mov x21,xzr
00946e58	b.hi 0x00946ecc
00946e5c	mov x21,xzr
00946e60	mov w8,#0x3d2
00946e64	ldrb w0,[x20, x21]
00946e68	lsl w22,w8,#0x5
00946e6c	bl 0x009416e0
00946e70	add x21,x21,#0x1
00946e74	cmp x19,x21
00946e78	add w8,w22,w0, UXTB 
00946e7c	b.ne 0x00946e64
00946e80	mov w9,#0x4c6b
00946e84	movk w9,#0x7a4, LSL #16
00946e88	umull x9,w8,w9
00946e8c	mov w10,#0x43
00946e90	lsr x9,x9,#0x21
00946e94	msub w8,w9,w10,w8
00946e98	adrp x9,0xc50000
00946e9c	add x9,x9,#0x448
00946ea0	ldr x21,[x9, w8, UXTW #0x3]
00946ea4	cbz x21,0x00946ec8
00946ea8	ldr x1,[x21]
00946eac	mov x0,x20
00946eb0	mov x2,x19
00946eb4	bl 0x00c31b50
00946eb8	cbz w0,0x00946ec8
00946ebc	ldr x8,[x21]
00946ec0	ldrb w8,[x8, x19]
00946ec4	cbz w8,0x00946ecc
00946ec8	mov x21,xzr
00946ecc	ldp x29,x30,[sp, #0x20]
00946ed0	ldp x20,x19,[sp, #0x10]
00946ed4	mov x0,x21
00946ed8	ldp x22,x21,[sp], #0x30
00946edc	ret

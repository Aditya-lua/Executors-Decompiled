; ssl3_change_cipher_state @ 009aa9a0
009aa9a0	str x27,[sp, #-0x60]!
009aa9a4	stp x26,x25,[sp, #0x10]
009aa9a8	stp x24,x23,[sp, #0x20]
009aa9ac	stp x22,x21,[sp, #0x30]
009aa9b0	stp x20,x19,[sp, #0x40]
009aa9b4	stp x29,x30,[sp, #0x50]
009aa9b8	ldr x20,[x0, #0x328]
009aa9bc	mov x19,x0
009aa9c0	add x29,sp,#0x50
009aa9c4	cbz x20,0x009aaa4c
009aa9c8	ldr x8,[x19, #0x340]
009aa9cc	ldr x21,[x19, #0x320]
009aa9d0	mov w22,w1
009aa9d4	cbz x8,0x009aaa68
009aa9d8	ldr x24,[x8, #0x10]
009aa9dc	tbnz w22,#0x0,0x009aaa70
009aa9e0	ldr x23,[x19, #0x878]
009aa9e4	mov w25,#0x1
009aa9e8	str w25,[x19, #0x7c]
009aa9ec	cbnz x23,0x009aaa08
009aa9f0	bl 0x00c34b90
009aa9f4	str x0,[x19, #0x878]
009aa9f8	cbz x0,0x009aac28
009aa9fc	bl 0x00c34ba0
009aaa00	ldr x23,[x19, #0x878]
009aaa04	mov w25,wzr
009aaa08	add x0,x19,#0x890
009aaa0c	mov x1,x20
009aaa10	bl 0x00c34cb0
009aaa14	cbz x0,0x009aab30
009aaa18	ldr x0,[x19, #0x868]
009aaa1c	bl 0x00c34b60
009aaa20	str xzr,[x19, #0x868]
009aaa24	cbz x24,0x009aaa38
009aaa28	mov x0,x24
009aaa2c	bl 0x00c34b70
009aaa30	str x0,[x19, #0x868]
009aaa34	cbz x0,0x009aac74
009aaa38	add x0,x19,#0xc58
009aaa3c	bl 0x00c34c70
009aaa40	add x24,x19,#0x100
009aaa44	cbnz w25,0x009aaad8
009aaa48	b 0x009aaae0
009aaa4c	bl 0x00c342a0
009aaa50	adrp x0,0x2a3000
009aaa54	adrp x2,0x2ad000
009aaa58	add x0,x0,#0xb34
009aaa5c	add x2,x2,#0x69a
009aaa60	mov w1,#0x6b
009aaa64	b 0x009aacd0
009aaa68	mov x24,xzr
009aaa6c	tbz w22,#0x0,0x009aa9e0
009aaa70	ldr x23,[x19, #0x848]
009aaa74	cbz x23,0x009aaa80
009aaa78	mov w25,#0x1
009aaa7c	b 0x009aaa98
009aaa80	bl 0x00c34b90
009aaa84	str x0,[x19, #0x848]
009aaa88	cbz x0,0x009aac44
009aaa8c	bl 0x00c34ba0
009aaa90	ldr x23,[x19, #0x848]
009aaa94	mov w25,wzr
009aaa98	add x0,x19,#0x860
009aaa9c	mov x1,x20
009aaaa0	bl 0x00c34cb0
009aaaa4	cbz x0,0x009aab4c
009aaaa8	ldr x0,[x19, #0x870]
009aaaac	bl 0x00c34b60
009aaab0	str xzr,[x19, #0x870]
009aaab4	cbz x24,0x009aaac8
009aaab8	mov x0,x24
009aaabc	bl 0x00c34b70
009aaac0	str x0,[x19, #0x870]
009aaac4	cbz x0,0x009aac90
009aaac8	add x0,x19,#0xc58
009aaacc	bl 0x00c34c60
009aaad0	add x24,x19,#0xb8
009aaad4	cbz w25,0x009aaae0
009aaad8	mov x0,x23
009aaadc	bl 0x00c34ba0
009aaae0	ldr x27,[x19, #0x318]
009aaae4	mov x0,x20
009aaae8	bl 0x00c34c20
009aaaec	tbnz w0,#0x1f,0x009aab68
009aaaf0	sxtw x25,w0
009aaaf4	mov x0,x21
009aaaf8	bl 0x00c34bd0
009aaafc	sxtw x26,w0
009aab00	mov x0,x21
009aab04	bl 0x00c34bc0
009aab08	cmp w22,#0x21
009aab0c	sxtw x10,w0
009aab10	b.eq 0x009aab1c
009aab14	cmp w22,#0x12
009aab18	b.ne 0x009aab84
009aab1c	lsl x8,x25,#0x1
009aab20	add x9,x8,x26, LSL #0x1
009aab24	add x10,x9,x10, LSL #0x1
009aab28	mov x1,x27
009aab2c	b 0x009aab98
009aab30	bl 0x00c342a0
009aab34	adrp x0,0x2a3000
009aab38	adrp x2,0x2ad000
009aab3c	add x0,x0,#0xb34
009aab40	add x2,x2,#0x69a
009aab44	mov w1,#0xa5
009aab48	b 0x009aac5c
009aab4c	bl 0x00c342a0
009aab50	adrp x0,0x2a3000
009aab54	adrp x2,0x2ad000
009aab58	add x0,x0,#0xb34
009aab5c	add x2,x2,#0x69a
009aab60	mov w1,#0x84
009aab64	b 0x009aacd0
009aab68	bl 0x00c342a0
009aab6c	adrp x0,0x2a3000
009aab70	adrp x2,0x2ad000
009aab74	add x0,x0,#0xb34
009aab78	add x2,x2,#0x69a
009aab7c	mov w1,#0xbf
009aab80	b 0x009aacd0
009aab84	add x8,x26,x25, LSL #0x1
009aab88	add x9,x10,x26
009aab8c	add x9,x9,x8
009aab90	add x1,x27,x25
009aab94	add x10,x9,x10
009aab98	ldr x11,[x19, #0x310]
009aab9c	cmp x10,x11
009aaba0	b.ls 0x009aabc0
009aaba4	bl 0x00c342a0
009aaba8	adrp x0,0x2a3000
009aabac	adrp x2,0x2ad000
009aabb0	add x0,x0,#0xb34
009aabb4	add x2,x2,#0x69a
009aabb8	mov w1,#0xd9
009aabbc	b 0x009aacd0
009aabc0	mov x0,x24
009aabc4	mov x2,x25
009aabc8	add x26,x27,x8
009aabcc	add x27,x27,x9
009aabd0	bl 0x00c2ffd0
009aabd4	and w5,w22,#0x2
009aabd8	mov x0,x23
009aabdc	mov x1,x21
009aabe0	mov x2,xzr
009aabe4	mov x3,x26
009aabe8	mov x4,x27
009aabec	bl 0x00c34be0
009aabf0	cbz w0,0x009aacb8
009aabf4	mov x0,x23
009aabf8	bl 0x00c34b80
009aabfc	bl 0x00c34bb0
009aac00	cbz x0,0x009aac1c
009aac04	mov x0,x19
009aac08	mov x1,x23
009aac0c	mov x2,x21
009aac10	mov x3,x20
009aac14	bl 0x00c34cc0
009aac18	cbz w0,0x009aacf0
009aac1c	mov w0,#0x1
009aac20	str wzr,[x19, #0x7c]
009aac24	b 0x009aacf0
009aac28	bl 0x00c342a0
009aac2c	adrp x0,0x2a3000
009aac30	adrp x2,0x2ad000
009aac34	add x0,x0,#0xb34
009aac38	add x2,x2,#0x69a
009aac3c	mov w1,#0x9b
009aac40	b 0x009aac5c
009aac44	bl 0x00c342a0
009aac48	adrp x0,0x2a3000
009aac4c	adrp x2,0x2ad000
009aac50	add x0,x0,#0xb34
009aac54	add x2,x2,#0x69a
009aac58	mov w1,#0x79
009aac5c	bl 0x00c342b0
009aac60	mov w8,#0x103
009aac64	movk w8,#0xc, LSL #16
009aac68	sub w2,w8,#0x3
009aac6c	mov w1,#0x50
009aac70	b 0x009aace0
009aac74	bl 0x00c342a0
009aac78	adrp x0,0x2a3000
009aac7c	adrp x2,0x2ad000
009aac80	add x0,x0,#0xb34
009aac84	add x2,x2,#0x69a
009aac88	mov w1,#0xb0
009aac8c	b 0x009aaca8
009aac90	bl 0x00c342a0
009aac94	adrp x0,0x2a3000
009aac98	adrp x2,0x2ad000
009aac9c	add x0,x0,#0xb34
009aaca0	add x2,x2,#0x69a
009aaca4	mov w1,#0x8f
009aaca8	bl 0x00c342b0
009aacac	mov w1,#0x50
009aacb0	mov w2,#0x8e
009aacb4	b 0x009aace0
009aacb8	bl 0x00c342a0
009aacbc	adrp x0,0x2a3000
009aacc0	adrp x2,0x2ad000
009aacc4	add x0,x0,#0xb34
009aacc8	add x2,x2,#0x69a
009aaccc	orr w1,wzr,#0xe0
009aacd0	bl 0x00c342b0
009aacd4	mov w2,#0x103
009aacd8	mov w1,#0x50
009aacdc	movk w2,#0xc, LSL #16
009aace0	mov x0,x19
009aace4	mov x3,xzr
009aace8	bl 0x00c34410
009aacec	mov w0,wzr
009aacf0	ldp x29,x30,[sp, #0x50]
009aacf4	ldp x20,x19,[sp, #0x40]
009aacf8	ldp x22,x21,[sp, #0x30]
009aacfc	ldp x24,x23,[sp, #0x20]
009aad00	ldp x26,x25,[sp, #0x10]
009aad04	ldr x27,[sp], #0x60
009aad08	ret

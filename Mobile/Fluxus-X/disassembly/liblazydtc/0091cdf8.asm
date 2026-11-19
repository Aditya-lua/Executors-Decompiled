; FUN_0091cdf8 @ 0091cdf8
0091cdf8	stp x20,x19,[sp, #-0x20]!
0091cdfc	stp x29,x30,[sp, #0x10]
0091ce00	add x29,sp,#0x10
0091ce04	ldr w9,[x0, #0x120]
0091ce08	mov x19,x0
0091ce0c	mov x20,x1
0091ce10	and w8,w9,#0xfffffffe
0091ce14	cmp w8,#0xa
0091ce18	b.ne 0x0091cefc
0091ce1c	ldrb w8,[x20, #0x574]
0091ce20	cbz w8,0x0091ce54
0091ce24	mov w10,#0x6667
0091ce28	movk w10,#0x6666, LSL #16
0091ce2c	mov w11,#0xcccd
0091ce30	movk w11,#0xcccc, LSL #16
0091ce34	smull x10,w9,w10
0091ce38	umull x8,w8,w11
0091ce3c	lsr x11,x10,#0x3f
0091ce40	asr x10,x10,#0x22
0091ce44	add w3,w10,w11
0091ce48	lsr x2,x8,#0x23
0091ce4c	cmp w3,w2
0091ce50	b.ne 0x0091cf2c
0091ce54	ldr w8,[x19, #0x124]
0091ce58	mov w10,#0x1319
0091ce5c	str w9,[x19, #0x1330]
0091ce60	add x10,x19,x10
0091ce64	str w8,[x19, #0x1328]
0091ce68	strb w9,[x20, #0x574]
0091ce6c	ldrb w11,[x10]
0091ce70	cbz w11,0x0091ce7c
0091ce74	cmp w9,w11
0091ce78	b.ge 0x0091ce80
0091ce7c	strb w9,[x10]
0091ce80	ldr x10,[x19, #0x1118]
0091ce84	cbz x10,0x0091ceac
0091ce88	cmp w8,#0x1a0
0091ce8c	b.ne 0x0091ceac
0091ce90	mov w10,#0x131a
0091ce94	ldrb w10,[x19, x10]
0091ce98	cbnz w10,0x0091ceac
0091ce9c	add x10,x19,#0x1b1
0091cea0	ldr w11,[x10]
0091cea4	orr w11,w11,#0x200
0091cea8	str w11,[x10]
0091ceac	cmp w9,#0x14
0091ceb0	b.eq 0x0091cf58
0091ceb4	cmp w9,#0xa
0091ceb8	b.ne 0x0091cf44
0091cebc	ldrb w8,[x19, #0xa85]
0091cec0	tbz w8,#0x4,0x0091cee8
0091cec4	ldr x8,[x19, #0x12a0]
0091cec8	cbz x8,0x0091ced8
0091cecc	ldr w8,[x8, #0x8]
0091ced0	cmp w8,#0x1
0091ced4	b.lt 0x0091cee8
0091ced8	adrp x1,0x2b9000
0091cedc	add x1,x1,#0x17d
0091cee0	mov x0,x19
0091cee4	bl 0x00904c98
0091cee8	mov w1,#0x1
0091ceec	mov x0,x20
0091cef0	bl 0x00908c4c
0091cef4	ldr w8,[x19, #0x124]
0091cef8	b 0x0091cf64
0091cefc	mov w8,#0x6667
0091cf00	movk w8,#0x6666, LSL #16
0091cf04	smull x8,w9,w8
0091cf08	lsr x10,x8,#0x3f
0091cf0c	asr x8,x8,#0x22
0091cf10	add w2,w8,w10
0091cf14	mov w8,#0xa
0091cf18	adrp x1,0x2af000
0091cf1c	msub w3,w2,w8,w9
0091cf20	add x1,x1,#0x27e
0091cf24	mov x0,x19
0091cf28	b 0x0091cf38
0091cf2c	adrp x1,0x2c4000
0091cf30	add x1,x1,#0xf30
0091cf34	mov x0,x19
0091cf38	bl 0x00904b80
0091cf3c	mov w0,#0x1
0091cf40	b 0x0091cfc8
0091cf44	cmp w8,#0x65
0091cf48	b.ne 0x0091cf64
0091cf4c	ldr w9,[x19, #0x12c]
0091cf50	cmp w9,#0x2
0091cf54	b.ne 0x0091cf64
0091cf58	ldr x9,[x20, #0x540]
0091cf5c	mov w10,#0x2
0091cf60	str w10,[x9]
0091cf64	add x9,x19,#0x1b1
0091cf68	ldr w10,[x9]
0091cf6c	cmp w8,#0xc8
0091cf70	cset w11,lt
0091cf74	cmp w8,#0x63
0091cf78	lsl w11,w11,#0xa
0091cf7c	csel w11,w11,wzr,gt
0091cf80	and w12,w10,#0xfffffbff
0091cf84	orr w11,w11,w12
0091cf88	cmp w8,#0xcc
0091cf8c	str w11,[x9]
0091cf90	b.eq 0x0091cfb8
0091cf94	cmp w8,#0x130
0091cf98	mov w0,wzr
0091cf9c	b.ne 0x0091cfc8
0091cfa0	ldrb w8,[x19, #0x528]
0091cfa4	cbz w8,0x0091cfb8
0091cfa8	mov w8,#0x140c
0091cfac	ldrb w11,[x19, x8]
0091cfb0	orr w11,w11,#0x1
0091cfb4	strb w11,[x19, x8]
0091cfb8	mov w0,wzr
0091cfbc	orr w8,w10,#0x400
0091cfc0	stp xzr,xzr,[x19, #0xd8]
0091cfc4	str w8,[x9]
0091cfc8	ldp x29,x30,[sp, #0x10]
0091cfcc	ldp x20,x19,[sp], #0x20
0091cfd0	ret

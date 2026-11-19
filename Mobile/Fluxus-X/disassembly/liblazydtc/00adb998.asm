; RSA_padding_check_X931 @ 00adb998
00adb998	str x19,[sp, #-0x20]!
00adb99c	cmp w4,w3
00adb9a0	stp x29,x30,[sp, #0x10]
00adb9a4	add x29,sp,#0x10
00adb9a8	b.ne 0x00adba04
00adb9ac	ldrb w8,[x2]
00adb9b0	and w9,w8,#0xfe
00adb9b4	cmp w9,#0x6a
00adb9b8	b.ne 0x00adba04
00adb9bc	cmp w8,#0x6b
00adb9c0	b.ne 0x00adba44
00adb9c4	cmp w4,#0x4
00adb9c8	b.lt 0x00adbaa8
00adb9cc	mov x10,xzr
00adb9d0	sub w8,w4,#0x3
00adb9d4	mov x9,x10
00adb9d8	add x10,x2,x10
00adb9dc	ldrb w10,[x10, #0x1]
00adb9e0	cmp w10,#0xbb
00adb9e4	b.ne 0x00adba8c
00adb9e8	add x10,x9,#0x1
00adb9ec	cmp w8,w10
00adb9f0	b.gt 0x00adb9d4
00adb9f4	add x9,x2,x9
00adb9f8	add x1,x9,#0x2
00adb9fc	sub w19,w8,w10
00adba00	b 0x00adba4c
00adba04	bl 0x00c342a0
00adba08	adrp x0,0x2a6000
00adba0c	adrp x2,0x2c0000
00adba10	add x0,x0,#0x7a3
00adba14	add x2,x2,#0x558
00adba18	mov w1,#0x43
00adba1c	bl 0x00c342b0
00adba20	mov w0,#0x4
00adba24	mov w1,#0x89
00adba28	mov x2,xzr
00adba2c	bl 0x00c342c0
00adba30	mov w19,#0xffffffff
00adba34	ldp x29,x30,[sp, #0x10]
00adba38	mov w0,w19
00adba3c	ldr x19,[sp], #0x20
00adba40	ret
00adba44	add x1,x2,#0x1
00adba48	sub w19,w4,#0x2
00adba4c	ldrb w8,[x1, w19, SXTW ]
00adba50	cmp w8,#0xcc
00adba54	b.ne 0x00adba64
00adba58	mov w2,w19
00adba5c	bl 0x00c2ffd0
00adba60	b 0x00adba34
00adba64	bl 0x00c342a0
00adba68	adrp x0,0x2a6000
00adba6c	adrp x2,0x2c0000
00adba70	add x0,x0,#0x7a3
00adba74	add x2,x2,#0x558
00adba78	mov w1,#0x5f
00adba7c	bl 0x00c342b0
00adba80	mov w0,#0x4
00adba84	mov w1,#0x8b
00adba88	b 0x00adba28
00adba8c	cmp w10,#0xba
00adba90	b.ne 0x00adbad0
00adba94	cbz w9,0x00adbaa8
00adba98	sub x19,x8,x9
00adba9c	add x8,x2,x9
00adbaa0	add x1,x8,#0x2
00adbaa4	b 0x00adba4c
00adbaa8	bl 0x00c342a0
00adbaac	adrp x0,0x2a6000
00adbab0	adrp x2,0x2c0000
00adbab4	add x0,x0,#0x7a3
00adbab8	add x2,x2,#0x558
00adbabc	mov w1,#0x56
00adbac0	bl 0x00c342b0
00adbac4	mov w0,#0x4
00adbac8	mov w1,#0x8a
00adbacc	b 0x00adba28
00adbad0	bl 0x00c342a0
00adbad4	adrp x0,0x2a6000
00adbad8	adrp x2,0x2c0000
00adbadc	add x0,x0,#0x7a3
00adbae0	add x2,x2,#0x558
00adbae4	mov w1,#0x4e
00adbae8	b 0x00adbac0

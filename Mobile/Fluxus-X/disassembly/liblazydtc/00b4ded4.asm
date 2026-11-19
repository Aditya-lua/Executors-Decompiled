; FUN_00b4ded4 @ 00b4ded4
00b4ded4	stp x20,x19,[sp, #-0x20]!
00b4ded8	stp x29,x30,[sp, #0x10]
00b4dedc	mov x20,x0
00b4dee0	ldr x0,[x0, #0x8]
00b4dee4	mov x19,x1
00b4dee8	add x29,sp,#0x10
00b4deec	cbz x0,0x00b4df30
00b4def0	ldr x8,[x20, #0x10]
00b4def4	cbz x8,0x00b4df30
00b4def8	bl 0x00c322f0
00b4defc	mov w8,#0x2711
00b4df00	cmp w0,w8
00b4df04	b.lt 0x00b4df74
00b4df08	bl 0x00c342a0
00b4df0c	adrp x0,0x2c4000
00b4df10	adrp x2,0x2b6000
00b4df14	add x0,x0,#0x723
00b4df18	add x2,x2,#0x9b6
00b4df1c	orr w1,wzr,#0x1f
00b4df20	bl 0x00c342b0
00b4df24	mov w0,#0xa
00b4df28	mov w1,#0x67
00b4df2c	b 0x00b4df54
00b4df30	bl 0x00c342a0
00b4df34	adrp x0,0x2c4000
00b4df38	adrp x2,0x2b6000
00b4df3c	add x0,x0,#0x723
00b4df40	add x2,x2,#0x9b6
00b4df44	mov w1,#0x19
00b4df48	bl 0x00c342b0
00b4df4c	mov w0,#0xa
00b4df50	mov w1,#0x72
00b4df54	mov x2,xzr
00b4df58	bl 0x00c342c0
00b4df5c	mov w0,wzr
00b4df60	mov w8,#0x800
00b4df64	str w8,[x19]
00b4df68	ldp x29,x30,[sp, #0x10]
00b4df6c	ldp x20,x19,[sp], #0x20
00b4df70	ret
00b4df74	ldr x0,[x20, #0x10]
00b4df78	bl 0x00c322f0
00b4df7c	ldr x8,[x20, #0x8]
00b4df80	mov w20,w0
00b4df84	mov x0,x8
00b4df88	bl 0x00c322f0
00b4df8c	cmp w20,w0
00b4df90	b.ge 0x00b4df9c
00b4df94	mov w0,#0x1
00b4df98	b 0x00b4df68
00b4df9c	bl 0x00c342a0
00b4dfa0	adrp x0,0x2c4000
00b4dfa4	adrp x2,0x2b6000
00b4dfa8	add x0,x0,#0x723
00b4dfac	add x2,x2,#0x9b6
00b4dfb0	mov w1,#0x25
00b4dfb4	bl 0x00c342b0
00b4dfb8	mov w0,#0xa
00b4dfbc	mov w1,#0x66
00b4dfc0	b 0x00b4df54

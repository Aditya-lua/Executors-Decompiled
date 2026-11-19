; FUN_00970a7c @ 00970a7c
00970a7c	stp x22,x21,[sp, #-0x30]!
00970a80	stp x20,x19,[sp, #0x10]
00970a84	stp x29,x30,[sp, #0x20]
00970a88	add x29,sp,#0x20
00970a8c	mov x19,x3
00970a90	mov w21,w1
00970a94	mov x20,x0
00970a98	mov w0,wzr
00970a9c	tbnz w1,#0x1f,0x00970ad8
00970aa0	cbnz w2,0x00970ad8
00970aa4	mov x0,x19
00970aa8	bl 0x00c2ff50
00970aac	bl 0x00963a5c
00970ab0	mov w22,w0
00970ab4	cmp w0,w21
00970ab8	mov w0,wzr
00970abc	b.ge 0x00970ad8
00970ac0	add w8,w22,#0x1
00970ac4	sxtw x2,w8
00970ac8	mov x0,x20
00970acc	mov x1,x19
00970ad0	bl 0x00c2ffd0
00970ad4	mov w0,w22
00970ad8	ldp x29,x30,[sp, #0x20]
00970adc	ldp x20,x19,[sp, #0x10]
00970ae0	ldp x22,x21,[sp], #0x30
00970ae4	ret

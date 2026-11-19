; FUN_00b36a9c @ 00b36a9c
00b36a9c	stp x26,x25,[sp, #-0x50]!
00b36aa0	stp x24,x23,[sp, #0x10]
00b36aa4	stp x22,x21,[sp, #0x20]
00b36aa8	stp x20,x19,[sp, #0x30]
00b36aac	stp x29,x30,[sp, #0x40]
00b36ab0	add x29,sp,#0x40
00b36ab4	mov x20,x6
00b36ab8	mov x26,x5
00b36abc	mov w23,w4
00b36ac0	mov x22,x3
00b36ac4	mov w25,w2
00b36ac8	mov x24,x1
00b36acc	mov x21,x0
00b36ad0	bl 0x00c31fa0
00b36ad4	adrp x1,0x2d1000
00b36ad8	mov x19,x0
00b36adc	add x1,x1,#0x42e
00b36ae0	mov x0,x26
00b36ae4	mov x2,x20
00b36ae8	bl 0x00c357f0
00b36aec	mov x20,x0
00b36af0	mov w26,wzr
00b36af4	cbz x19,0x00b36b58
00b36af8	cbz x20,0x00b36b58
00b36afc	mov x0,x19
00b36b00	mov x1,x20
00b36b04	mov x2,xzr
00b36b08	bl 0x00c31f70
00b36b0c	cbz w0,0x00b36b54
00b36b10	mov w2,w25
00b36b14	mov x0,x19
00b36b18	mov x1,x24
00b36b1c	bl 0x00c31f80
00b36b20	cbz w0,0x00b36b54
00b36b24	sxtw x2,w23
00b36b28	mov x0,x19
00b36b2c	mov x1,x22
00b36b30	bl 0x00c31f80
00b36b34	cbz w0,0x00b36b54
00b36b38	mov x0,x19
00b36b3c	mov x1,x21
00b36b40	mov x2,xzr
00b36b44	bl 0x00c31f60
00b36b48	cmp w0,#0x0
00b36b4c	cset w26,ne
00b36b50	b 0x00b36b58
00b36b54	mov w26,wzr
00b36b58	mov x0,x19
00b36b5c	bl 0x00c31f90
00b36b60	mov x0,x20
00b36b64	bl 0x00c35800
00b36b68	ldp x29,x30,[sp, #0x40]
00b36b6c	ldp x20,x19,[sp, #0x30]
00b36b70	ldp x22,x21,[sp, #0x20]
00b36b74	ldp x24,x23,[sp, #0x10]
00b36b78	mov w0,w26
00b36b7c	ldp x26,x25,[sp], #0x50
00b36b80	ret

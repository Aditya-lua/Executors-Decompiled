; FUN_00ac1dec @ 00ac1dec
00ac1dec	stp x20,x19,[sp, #-0x20]!
00ac1df0	stp x29,x30,[sp, #0x10]
00ac1df4	add x29,sp,#0x10
00ac1df8	cbz x0,0x00ac1e48
00ac1dfc	mov x19,x0
00ac1e00	bl 0x00c321b0
00ac1e04	cbz x0,0x00ac1e48
00ac1e08	mov x20,x0
00ac1e0c	ldr x0,[x0, #0x18]
00ac1e10	bl 0x00c342d0
00ac1e14	adrp x2,0x2be000
00ac1e18	add x2,x2,#0x21a
00ac1e1c	mov w1,#0x1150
00ac1e20	mov w3,#0x63
00ac1e24	mov x0,x20
00ac1e28	bl 0x00c345e0
00ac1e2c	mov x0,x19
00ac1e30	mov x1,xzr
00ac1e34	bl 0x00c32290
00ac1e38	mov x0,x19
00ac1e3c	mov w1,wzr
00ac1e40	bl 0x00c322b0
00ac1e44	mov w0,#0x1
00ac1e48	ldp x29,x30,[sp, #0x10]
00ac1e4c	ldp x20,x19,[sp], #0x20
00ac1e50	ret

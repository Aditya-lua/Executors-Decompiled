; RSA_padding_check_none @ 00ad4dc4
00ad4dc4	stp x22,x21,[sp, #-0x30]!
00ad4dc8	mov w21,w3
00ad4dcc	subs w8,w1,w3
00ad4dd0	stp x20,x19,[sp, #0x10]
00ad4dd4	stp x29,x30,[sp, #0x20]
00ad4dd8	add x29,sp,#0x20
00ad4ddc	b.ge 0x00ad4e14
00ad4de0	bl 0x00c342a0
00ad4de4	adrp x0,0x2d2000
00ad4de8	adrp x2,0x2a4000
00ad4dec	add x0,x0,#0x2f3
00ad4df0	add x2,x2,#0x88e
00ad4df4	mov w1,#0x2a
00ad4df8	bl 0x00c342b0
00ad4dfc	mov w0,#0x4
00ad4e00	mov w1,#0x6d
00ad4e04	mov x2,xzr
00ad4e08	bl 0x00c342c0
00ad4e0c	mov w19,#0xffffffff
00ad4e10	b 0x00ad4e40
00ad4e14	mov x20,x2
00ad4e18	mov w19,w1
00ad4e1c	sxtw x2,w8
00ad4e20	mov w1,wzr
00ad4e24	mov x22,x0
00ad4e28	bl 0x00c301c0
00ad4e2c	add x8,x22,w19, SXTW 
00ad4e30	sxtw x2,w21
00ad4e34	sub x0,x8,x2
00ad4e38	mov x1,x20
00ad4e3c	bl 0x00c2ffd0
00ad4e40	mov w0,w19
00ad4e44	ldp x29,x30,[sp, #0x20]
00ad4e48	ldp x20,x19,[sp, #0x10]
00ad4e4c	ldp x22,x21,[sp], #0x30
00ad4e50	ret

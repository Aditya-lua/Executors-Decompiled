; UI_dup_input_string @ 00aeda5c
00aeda5c	str x23,[sp, #-0x40]!
00aeda60	stp x22,x21,[sp, #0x10]
00aeda64	stp x20,x19,[sp, #0x20]
00aeda68	mov w19,w5
00aeda6c	mov w20,w4
00aeda70	mov x22,x3
00aeda74	mov w23,w2
00aeda78	mov x21,x0
00aeda7c	stp x29,x30,[sp, #0x30]
00aeda80	add x29,sp,#0x30
00aeda84	cbz x1,0x00aedadc
00aeda88	adrp x8,0x2a0000
00aeda8c	add x8,x8,#0xc2f
00aeda90	mov w2,#0xd4
00aeda94	mov x0,x1
00aeda98	mov x1,x8
00aeda9c	bl 0x00c34600
00aedaa0	cbnz x0,0x00aedae0
00aedaa4	bl 0x00c342a0
00aedaa8	adrp x0,0x2a0000
00aedaac	adrp x2,0x2c2000
00aedab0	add x0,x0,#0xc2f
00aedab4	add x2,x2,#0x48a
00aedab8	mov w1,#0xd6
00aedabc	bl 0x00c342b0
00aedac0	mov w1,#0x100
00aedac4	mov w0,#0x28
00aedac8	movk w1,#0xc, LSL #16
00aedacc	mov x2,xzr
00aedad0	bl 0x00c342c0
00aedad4	mov w19,wzr
00aedad8	b 0x00aedb4c
00aedadc	mov x0,xzr
00aedae0	mov w1,#0x1
00aedae4	mov w2,#0x1
00aedae8	mov w3,w23
00aedaec	mov x4,x22
00aedaf0	bl 0x00aef184
00aedaf4	cbz x0,0x00aedb48
00aedaf8	ldr x8,[x21, #0x8]!
00aedafc	mov x22,x0
00aedb00	cbnz x8,0x00aedb10
00aedb04	bl 0x00c34780
00aedb08	str x0,[x21]
00aedb0c	cbz x0,0x00aedb40
00aedb10	stp w20,w19,[x22, #0x28]
00aedb14	str xzr,[x22, #0x30]
00aedb18	ldr x0,[x21]
00aedb1c	mov x1,x22
00aedb20	bl 0x00c347a0
00aedb24	mov w19,w0
00aedb28	cmp w0,#0x0
00aedb2c	b.gt 0x00aedb4c
00aedb30	mov x0,x22
00aedb34	sub w19,w19,#0x1
00aedb38	bl 0x00aed930
00aedb3c	b 0x00aedb4c
00aedb40	mov x0,x22
00aedb44	bl 0x00aed930
00aedb48	mov w19,#0xffffffff
00aedb4c	mov w0,w19
00aedb50	ldp x29,x30,[sp, #0x30]
00aedb54	ldp x20,x19,[sp, #0x20]
00aedb58	ldp x22,x21,[sp, #0x10]
00aedb5c	ldr x23,[sp], #0x40
00aedb60	ret

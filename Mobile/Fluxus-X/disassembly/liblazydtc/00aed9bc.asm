; UI_add_input_string @ 00aed9bc
00aed9bc	stp x22,x21,[sp, #-0x30]!
00aed9c0	mov w21,w4
00aed9c4	mov x4,x3
00aed9c8	mov w3,w2
00aed9cc	mov x22,x0
00aed9d0	mov w2,#0x1
00aed9d4	mov x0,x1
00aed9d8	mov w1,wzr
00aed9dc	stp x20,x19,[sp, #0x10]
00aed9e0	stp x29,x30,[sp, #0x20]
00aed9e4	add x29,sp,#0x20
00aed9e8	mov w20,w5
00aed9ec	bl 0x00aef184
00aed9f0	cbz x0,0x00aeda44
00aed9f4	ldr x8,[x22, #0x8]!
00aed9f8	mov x19,x0
00aed9fc	cbnz x8,0x00aeda0c
00aeda00	bl 0x00c34780
00aeda04	str x0,[x22]
00aeda08	cbz x0,0x00aeda3c
00aeda0c	stp w21,w20,[x19, #0x28]
00aeda10	str xzr,[x19, #0x30]
00aeda14	ldr x0,[x22]
00aeda18	mov x1,x19
00aeda1c	bl 0x00c347a0
00aeda20	mov w20,w0
00aeda24	cmp w0,#0x0
00aeda28	b.gt 0x00aeda48
00aeda2c	mov x0,x19
00aeda30	sub w20,w20,#0x1
00aeda34	bl 0x00aed930
00aeda38	b 0x00aeda48
00aeda3c	mov x0,x19
00aeda40	bl 0x00aed930
00aeda44	mov w20,#0xffffffff
00aeda48	mov w0,w20
00aeda4c	ldp x29,x30,[sp, #0x20]
00aeda50	ldp x20,x19,[sp, #0x10]
00aeda54	ldp x22,x21,[sp], #0x30
00aeda58	ret

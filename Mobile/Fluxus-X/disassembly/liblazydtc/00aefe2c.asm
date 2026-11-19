; UI_UTIL_read_pw @ 00aefe2c
00aefe2c	str x25,[sp, #-0x50]!
00aefe30	stp x24,x23,[sp, #0x10]
00aefe34	subs w24,w2,#0x1
00aefe38	stp x22,x21,[sp, #0x20]
00aefe3c	stp x20,x19,[sp, #0x30]
00aefe40	stp x29,x30,[sp, #0x40]
00aefe44	add x29,sp,#0x40
00aefe48	b.lt 0x00aefecc
00aefe4c	mov w25,w4
00aefe50	mov x23,x3
00aefe54	mov x22,x1
00aefe58	mov x21,x0
00aefe5c	bl 0x00c3e9f0
00aefe60	cbz x0,0x00aefed4
00aefe64	mov x1,x23
00aefe68	mov w2,wzr
00aefe6c	mov x3,x21
00aefe70	mov w4,wzr
00aefe74	mov w5,w24
00aefe78	mov x19,x0
00aefe7c	bl 0x00c3e990
00aefe80	mov w20,w0
00aefe84	cbz w25,0x00aefeb0
00aefe88	tbnz w20,#0x1f,0x00aefeb0
00aefe8c	mov x0,x19
00aefe90	mov x1,x23
00aefe94	mov w2,wzr
00aefe98	mov x3,x22
00aefe9c	mov w4,wzr
00aefea0	mov w5,w24
00aefea4	mov x6,x21
00aefea8	bl 0x00c3e9b0
00aefeac	mov w20,w0
00aefeb0	tbnz w20,#0x1f,0x00aefec0
00aefeb4	mov x0,x19
00aefeb8	bl 0x00c3ea00
00aefebc	mov w20,w0
00aefec0	mov x0,x19
00aefec4	bl 0x00c3e9d0
00aefec8	b 0x00aefed8
00aefecc	mov w20,#0xffffffff
00aefed0	b 0x00aefed8
00aefed4	orr w20,wzr,#0xfffffffe
00aefed8	mov w0,w20
00aefedc	ldp x29,x30,[sp, #0x40]
00aefee0	ldp x20,x19,[sp, #0x30]
00aefee4	ldp x22,x21,[sp, #0x20]
00aefee8	ldp x24,x23,[sp, #0x10]
00aefeec	ldr x25,[sp], #0x50
00aefef0	ret

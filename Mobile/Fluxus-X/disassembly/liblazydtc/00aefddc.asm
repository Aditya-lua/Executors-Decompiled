; UI_UTIL_read_pw_string @ 00aefddc
00aefddc	stp x28,x19,[sp, #-0x20]!
00aefde0	stp x29,x30,[sp, #0x10]
00aefde4	add x29,sp,#0x10
00aefde8	sub sp,sp,#0x400
00aefdec	cmp w1,#0x400
00aefdf0	mov w8,#0x400
00aefdf4	mov w4,w3
00aefdf8	mov x3,x2
00aefdfc	csel w2,w1,w8,lt
00aefe00	mov x1,sp
00aefe04	bl 0x00aefe2c
00aefe08	mov w19,w0
00aefe0c	mov x0,sp
00aefe10	mov w1,#0x400
00aefe14	bl 0x00c34750
00aefe18	mov w0,w19
00aefe1c	add sp,sp,#0x400
00aefe20	ldp x29,x30,[sp, #0x10]
00aefe24	ldp x28,x19,[sp], #0x20
00aefe28	ret

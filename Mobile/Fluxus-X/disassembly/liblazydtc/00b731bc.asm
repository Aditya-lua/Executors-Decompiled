; mbedtls_ct_memmove_left @ 00b731bc
00b731bc	cbz x1,0x00b7323c
00b731c0	mov x8,xzr
00b731c4	sub x9,x1,x2
00b731c8	sub x10,x1,#0x1
00b731cc	mov x11,x8
00b731d0	eor x12,x9,x11
00b731d4	sub x11,x11,x9
00b731d8	bic x11,x11,x12
00b731dc	and x12,x12,x9
00b731e0	orr x12,x11,x12
00b731e4	asr x11,x12,#0x3f
00b731e8	mov x12,x10
00b731ec	mov x13,x0
00b731f0	cbz x10,0x00b73224
00b731f4	mov x15,x13
00b731f8	ldrb w14,[x13]
00b731fc	ldrb w16,[x15, #0x1]!
00b73200	mov x17,x11
00b73204	subs x12,x12,#0x1
00b73208	and x14,x14,x17
00b7320c	mvn x17,x17
00b73210	and x17,x17,x16
00b73214	orr x17,x14,x17
00b73218	strb w17,[x13]
00b7321c	mov x13,x15
00b73220	b.ne 0x00b731f4
00b73224	ldrb w12,[x0, x10]
00b73228	add x8,x8,#0x1
00b7322c	cmp x8,x1
00b73230	and w11,w12,w11
00b73234	strb w11,[x0, x10]
00b73238	b.ne 0x00b731cc
00b7323c	ret

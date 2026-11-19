; HMAC_CTX_new @ 00a7f9f0
00a7f9f0	str x19,[sp, #-0x20]!
00a7f9f4	adrp x1,0x2a2000
00a7f9f8	add x1,x1,#0x4c1
00a7f9fc	mov w0,#0x20
00a7fa00	mov w2,#0x93
00a7fa04	stp x29,x30,[sp, #0x10]
00a7fa08	add x29,sp,#0x10
00a7fa0c	bl 0x00c34250
00a7fa10	mov x19,x0
00a7fa14	cbz x0,0x00a7fa30
00a7fa18	mov x0,x19
00a7fa1c	bl 0x00a7f88c
00a7fa20	cbnz w0,0x00a7fa30
00a7fa24	mov x0,x19
00a7fa28	bl 0x00a7fa40
00a7fa2c	mov x19,xzr
00a7fa30	ldp x29,x30,[sp, #0x10]
00a7fa34	mov x0,x19
00a7fa38	ldr x19,[sp], #0x20
00a7fa3c	ret

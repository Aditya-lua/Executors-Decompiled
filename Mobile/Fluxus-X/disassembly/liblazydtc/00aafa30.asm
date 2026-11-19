; OCSP_request_add0_id @ 00aafa30
00aafa30	str x21,[sp, #-0x30]!
00aafa34	stp x20,x19,[sp, #0x10]
00aafa38	stp x29,x30,[sp, #0x20]
00aafa3c	add x29,sp,#0x20
00aafa40	mov x21,x1
00aafa44	mov x20,x0
00aafa48	bl 0x00c3ee80
00aafa4c	mov x19,x0
00aafa50	cbz x0,0x00aafa84
00aafa54	ldr x0,[x19]
00aafa58	bl 0x00c32520
00aafa5c	str x21,[x19]
00aafa60	cbz x20,0x00aafa84
00aafa64	ldr x0,[x20, #0x10]
00aafa68	mov x1,x19
00aafa6c	bl 0x00c347a0
00aafa70	cbnz w0,0x00aafa84
00aafa74	mov x0,x19
00aafa78	str xzr,[x19]
00aafa7c	bl 0x00c3ee70
00aafa80	mov x19,xzr
00aafa84	mov x0,x19
00aafa88	ldp x29,x30,[sp, #0x20]
00aafa8c	ldp x20,x19,[sp, #0x10]
00aafa90	ldr x21,[sp], #0x30
00aafa94	ret

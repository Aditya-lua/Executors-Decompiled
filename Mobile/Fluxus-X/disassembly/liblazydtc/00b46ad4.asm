; FUN_00b46ad4 @ 00b46ad4
00b46ad4	cbz x0,0x00b46b40
00b46ad8	stp x20,x19,[sp, #-0x20]!
00b46adc	mov x19,x0
00b46ae0	add x0,x0,#0x30
00b46ae4	stp x29,x30,[sp, #0x10]
00b46ae8	add x29,sp,#0x10
00b46aec	bl 0x00c41170
00b46af0	ldr x0,[x19, #0x18]
00b46af4	adrp x20,0x2d8000
00b46af8	add x20,x20,#0xc50
00b46afc	mov w2,#0x56
00b46b00	mov x1,x20
00b46b04	bl 0x00c32310
00b46b08	ldp x0,x1,[x19, #0x8]
00b46b0c	mov w3,#0x57
00b46b10	mov x2,x20
00b46b14	bl 0x00c345e0
00b46b18	mov w2,#0x50
00b46b1c	mov x0,x19
00b46b20	mov w1,wzr
00b46b24	bl 0x00c301c0
00b46b28	ldp x29,x30,[sp, #0x10]
00b46b2c	mov w2,#0x61
00b46b30	mov x0,x19
00b46b34	mov x1,x20
00b46b38	ldp x20,x19,[sp], #0x20
00b46b3c	b 0x00c32310
00b46b40	ret

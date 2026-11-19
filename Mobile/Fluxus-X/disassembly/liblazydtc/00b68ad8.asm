; ssl3_cbc_remove_padding_and_mac @ 00b68ad8
00b68ad8	ldr x9,[x0]
00b68adc	add x8,x6,#0x1
00b68ae0	cmp x8,x9
00b68ae4	b.ls 0x00b68af0
00b68ae8	mov w0,wzr
00b68aec	ret
00b68af0	sub sp,sp,#0x20
00b68af4	stp x29,x30,[sp, #0x10]
00b68af8	add x10,x2,x9
00b68afc	ldurb w10,[x10, #-0x1]
00b68b00	mov x11,#-0x1
00b68b04	add x29,sp,#0x10
00b68b08	add x8,x8,x10
00b68b0c	sub x12,x9,x8
00b68b10	add x10,x10,#0x1
00b68b14	eor x12,x12,x8
00b68b18	eor x8,x8,x9
00b68b1c	orr x8,x12,x8
00b68b20	sub x12,x5,x10
00b68b24	bic x12,x12,x5
00b68b28	eor x8,x8,x9
00b68b2c	orr x12,x8,x12
00b68b30	bic x10,x10,x12, ASR #0x3f
00b68b34	eor x8,x11,x12, ASR #0x3f
00b68b38	sub x9,x9,x10
00b68b3c	str x9,[x0]
00b68b40	str x7,[sp]
00b68b44	mov x7,x8
00b68b48	bl 0x00b68b58
00b68b4c	ldp x29,x30,[sp, #0x10]
00b68b50	add sp,sp,#0x20
00b68b54	ret

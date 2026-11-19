; X509V3_conf_free @ 00b05ad4
00b05ad4	cbz x0,0x00b05b38
00b05ad8	stp x20,x19,[sp, #-0x20]!
00b05adc	stp x29,x30,[sp, #0x10]
00b05ae0	mov x19,x0
00b05ae4	ldr x0,[x0, #0x8]
00b05ae8	adrp x20,0x2c2000
00b05aec	add x20,x20,#0x5ca
00b05af0	mov w2,#0x6b
00b05af4	mov x1,x20
00b05af8	add x29,sp,#0x10
00b05afc	bl 0x00c32310
00b05b00	ldr x0,[x19, #0x10]
00b05b04	mov w2,#0x6c
00b05b08	mov x1,x20
00b05b0c	bl 0x00c32310
00b05b10	ldr x0,[x19]
00b05b14	mov w2,#0x6d
00b05b18	mov x1,x20
00b05b1c	bl 0x00c32310
00b05b20	ldp x29,x30,[sp, #0x10]
00b05b24	mov w2,#0x6e
00b05b28	mov x0,x19
00b05b2c	mov x1,x20
00b05b30	ldp x20,x19,[sp], #0x20
00b05b34	b 0x00c32310
00b05b38	ret

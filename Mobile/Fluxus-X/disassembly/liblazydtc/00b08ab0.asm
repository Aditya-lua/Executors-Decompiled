; ossl_x509at_dup @ 00b08ab0
00b08ab0	str x21,[sp, #-0x30]!
00b08ab4	stp x20,x19,[sp, #0x10]
00b08ab8	stp x29,x30,[sp, #0x20]
00b08abc	add x29,sp,#0x20
00b08ac0	mov x19,x0
00b08ac4	str xzr,[sp, #0x8]
00b08ac8	bl 0x00c325e0
00b08acc	cmp w0,#0x1
00b08ad0	b.lt 0x00b08b1c
00b08ad4	mov w20,w0
00b08ad8	mov w21,wzr
00b08adc	mov x0,x19
00b08ae0	mov w1,w21
00b08ae4	bl 0x00c32610
00b08ae8	mov x1,x0
00b08aec	add x0,sp,#0x8
00b08af0	bl 0x00b08040
00b08af4	cbz x0,0x00b08b0c
00b08af8	add w21,w21,#0x1
00b08afc	cmp w21,w20
00b08b00	b.lt 0x00b08adc
00b08b04	ldr x0,[sp, #0x8]
00b08b08	b 0x00b08b20
00b08b0c	adrp x1,0xcb5000
00b08b10	ldr x0,[sp, #0x8]
00b08b14	ldr x1,[x1, #0x640]
00b08b18	bl 0x00c32600
00b08b1c	mov x0,xzr
00b08b20	ldp x29,x30,[sp, #0x20]
00b08b24	ldp x20,x19,[sp, #0x10]
00b08b28	ldr x21,[sp], #0x30
00b08b2c	ret

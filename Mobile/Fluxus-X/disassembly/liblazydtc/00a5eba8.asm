; evp_cipher_get_asn1_aead_params @ 00a5eba8
00a5eba8	sub sp,sp,#0x40
00a5ebac	stp x20,x19,[sp, #0x20]
00a5ebb0	mov w20,wzr
00a5ebb4	str x21,[sp, #0x10]
00a5ebb8	stp x29,x30,[sp, #0x30]
00a5ebbc	add x29,sp,#0x30
00a5ebc0	cbz x1,0x00a5ec20
00a5ebc4	mov x19,x2
00a5ebc8	cbz x2,0x00a5ec20
00a5ebcc	mov x21,x1
00a5ebd0	add x1,sp,#0x18
00a5ebd4	mov w3,#0x10
00a5ebd8	mov x0,x21
00a5ebdc	mov x2,xzr
00a5ebe0	bl 0x00c37db0
00a5ebe4	mov w20,w0
00a5ebe8	cmp w0,#0x1
00a5ebec	b.lt 0x00a5ec1c
00a5ebf0	add x1,sp,#0x18
00a5ebf4	mov x2,sp
00a5ebf8	mov x0,x21
00a5ebfc	mov w3,w20
00a5ec00	bl 0x00c37db0
00a5ec04	sxtw x2,w20
00a5ec08	mov x1,sp
00a5ec0c	mov x0,x19
00a5ec10	bl 0x00c2ffd0
00a5ec14	str w20,[x19, #0x10]
00a5ec18	b 0x00a5ec20
00a5ec1c	mov w20,#0xffffffff
00a5ec20	mov w0,w20
00a5ec24	ldp x29,x30,[sp, #0x30]
00a5ec28	ldp x20,x19,[sp, #0x20]
00a5ec2c	ldr x21,[sp, #0x10]
00a5ec30	add sp,sp,#0x40
00a5ec34	ret

; PEM_write_bio_RSAPrivateKey @ 00ab4aac
00ab4aac	sub sp,sp,#0x20
00ab4ab0	stp x29,x30,[sp, #0x10]
00ab4ab4	mov w8,w4
00ab4ab8	mov x4,x2
00ab4abc	mov x2,x0
00ab4ac0	adrp x0,0xcb5000
00ab4ac4	ldr x0,[x0, #0x728]
00ab4ac8	mov x7,x5
00ab4acc	mov x5,x3
00ab4ad0	mov x3,x1
00ab4ad4	adrp x1,0x2b4000
00ab4ad8	add x1,x1,#0x80d
00ab4adc	str x6,[sp]
00ab4ae0	mov w6,w8
00ab4ae4	add x29,sp,#0x10
00ab4ae8	bl 0x00c36070
00ab4aec	ldp x29,x30,[sp, #0x10]
00ab4af0	add sp,sp,#0x20
00ab4af4	ret

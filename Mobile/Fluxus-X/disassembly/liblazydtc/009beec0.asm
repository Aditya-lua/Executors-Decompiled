; PEM_write_bio_SSL_SESSION @ 009beec0
009beec0	sub sp,sp,#0x20
009beec4	stp x29,x30,[sp, #0x10]
009beec8	mov x2,x0
009beecc	adrp x0,0xcb5000
009beed0	ldr x0,[x0, #0x160]
009beed4	mov x3,x1
009beed8	adrp x1,0x2ad000
009beedc	add x1,x1,#0x860
009beee0	mov x4,xzr
009beee4	mov x5,xzr
009beee8	mov w6,wzr
009beeec	mov x7,xzr
009beef0	add x29,sp,#0x10
009beef4	str xzr,[sp]
009beef8	bl 0x00c36070
009beefc	ldp x29,x30,[sp, #0x10]
009bef00	add sp,sp,#0x20
009bef04	ret

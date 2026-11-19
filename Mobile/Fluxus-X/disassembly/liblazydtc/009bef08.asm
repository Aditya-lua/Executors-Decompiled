; PEM_write_SSL_SESSION @ 009bef08
009bef08	sub sp,sp,#0x20
009bef0c	stp x29,x30,[sp, #0x10]
009bef10	mov x2,x0
009bef14	adrp x0,0xcb5000
009bef18	ldr x0,[x0, #0x160]
009bef1c	mov x3,x1
009bef20	adrp x1,0x2ad000
009bef24	add x1,x1,#0x860
009bef28	mov x4,xzr
009bef2c	mov x5,xzr
009bef30	mov w6,wzr
009bef34	mov x7,xzr
009bef38	add x29,sp,#0x10
009bef3c	str xzr,[sp]
009bef40	bl 0x00c36060
009bef44	ldp x29,x30,[sp, #0x10]
009bef48	add sp,sp,#0x20
009bef4c	ret

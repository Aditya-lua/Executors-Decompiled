; PEM_write_X509 @ 00ab9fe8
00ab9fe8	sub sp,sp,#0x20
00ab9fec	stp x29,x30,[sp, #0x10]
00ab9ff0	mov x2,x0
00ab9ff4	adrp x0,0xcb5000
00ab9ff8	ldr x0,[x0, #0x2b8]
00ab9ffc	mov x3,x1
00aba000	adrp x1,0x2d0000
00aba004	add x1,x1,#0x239
00aba008	mov x4,xzr
00aba00c	mov x5,xzr
00aba010	mov w6,wzr
00aba014	mov x7,xzr
00aba018	add x29,sp,#0x10
00aba01c	str xzr,[sp]
00aba020	bl 0x00c36060
00aba024	ldp x29,x30,[sp, #0x10]
00aba028	add sp,sp,#0x20
00aba02c	ret

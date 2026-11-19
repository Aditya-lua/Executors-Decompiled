; PEM_write_DSAparams @ 00ab4fdc
00ab4fdc	sub sp,sp,#0x20
00ab4fe0	stp x29,x30,[sp, #0x10]
00ab4fe4	mov x2,x0
00ab4fe8	adrp x0,0xcb5000
00ab4fec	ldr x0,[x0, #0x508]
00ab4ff0	mov x3,x1
00ab4ff4	adrp x1,0x2c8000
00ab4ff8	add x1,x1,#0xb6
00ab4ffc	mov x4,xzr
00ab5000	mov x5,xzr
00ab5004	mov w6,wzr
00ab5008	mov x7,xzr
00ab500c	add x29,sp,#0x10
00ab5010	str xzr,[sp]
00ab5014	bl 0x00c36060
00ab5018	ldp x29,x30,[sp, #0x10]
00ab501c	add sp,sp,#0x20
00ab5020	ret

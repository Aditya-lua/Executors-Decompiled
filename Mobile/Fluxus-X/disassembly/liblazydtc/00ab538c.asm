; PEM_write_DHparams @ 00ab538c
00ab538c	sub sp,sp,#0x20
00ab5390	stp x29,x30,[sp, #0x10]
00ab5394	mov x2,x0
00ab5398	adrp x0,0xcb5000
00ab539c	ldr x0,[x0, #0x4d0]
00ab53a0	mov x3,x1
00ab53a4	adrp x1,0x2b8000
00ab53a8	add x1,x1,#0x4cf
00ab53ac	mov x4,xzr
00ab53b0	mov x5,xzr
00ab53b4	mov w6,wzr
00ab53b8	mov x7,xzr
00ab53bc	add x29,sp,#0x10
00ab53c0	str xzr,[sp]
00ab53c4	bl 0x00c36060
00ab53c8	ldp x29,x30,[sp, #0x10]
00ab53cc	add sp,sp,#0x20
00ab53d0	ret

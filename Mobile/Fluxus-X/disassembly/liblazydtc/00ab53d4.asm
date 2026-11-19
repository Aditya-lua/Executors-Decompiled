; PEM_write_bio_DHxparams @ 00ab53d4
00ab53d4	sub sp,sp,#0x20
00ab53d8	stp x29,x30,[sp, #0x10]
00ab53dc	mov x2,x0
00ab53e0	adrp x0,0xcb5000
00ab53e4	ldr x0,[x0, #0x4d8]
00ab53e8	mov x3,x1
00ab53ec	adrp x1,0x2c6000
00ab53f0	add x1,x1,#0xe6
00ab53f4	mov x4,xzr
00ab53f8	mov x5,xzr
00ab53fc	mov w6,wzr
00ab5400	mov x7,xzr
00ab5404	add x29,sp,#0x10
00ab5408	str xzr,[sp]
00ab540c	bl 0x00c36070
00ab5410	ldp x29,x30,[sp, #0x10]
00ab5414	add sp,sp,#0x20
00ab5418	ret

; RAND_bytes_ex @ 00ac84a0
00ac84a0	str x23,[sp, #-0x40]!
00ac84a4	stp x22,x21,[sp, #0x10]
00ac84a8	stp x20,x19,[sp, #0x20]
00ac84ac	stp x29,x30,[sp, #0x30]
00ac84b0	add x29,sp,#0x30
00ac84b4	mov w21,w3
00ac84b8	mov x19,x2
00ac84bc	mov x20,x1
00ac84c0	mov x22,x0
00ac84c4	bl 0x00ac7d50
00ac84c8	cbz x0,0x00ac8500
00ac84cc	mov x23,x0
00ac84d0	bl 0x00c3e1c0
00ac84d4	cmp x23,x0
00ac84d8	b.eq 0x00ac8500
00ac84dc	ldr x2,[x23, #0x8]
00ac84e0	cbz x2,0x00ac8538
00ac84e4	mov x0,x20
00ac84e8	mov w1,w19
00ac84ec	ldp x29,x30,[sp, #0x30]
00ac84f0	ldp x20,x19,[sp, #0x20]
00ac84f4	ldp x22,x21,[sp, #0x10]
00ac84f8	ldr x23,[sp], #0x40
00ac84fc	br x2
00ac8500	mov x0,x22
00ac8504	bl 0x00ac857c
00ac8508	cbz x0,0x00ac8568
00ac850c	mov x1,x20
00ac8510	mov x2,x19
00ac8514	mov w3,w21
00ac8518	ldp x29,x30,[sp, #0x30]
00ac851c	ldp x20,x19,[sp, #0x20]
00ac8520	ldp x22,x21,[sp, #0x10]
00ac8524	mov w4,wzr
00ac8528	mov x5,xzr
00ac852c	mov x6,xzr
00ac8530	ldr x23,[sp], #0x40
00ac8534	b 0x00c3d190
00ac8538	bl 0x00c342a0
00ac853c	adrp x0,0x2da000
00ac8540	adrp x2,0x2d8000
00ac8544	add x0,x0,#0x554
00ac8548	add x2,x2,#0x705
00ac854c	mov w1,#0x16c
00ac8550	bl 0x00c342b0
00ac8554	mov w0,#0x24
00ac8558	mov w1,#0x65
00ac855c	mov x2,xzr
00ac8560	bl 0x00c342c0
00ac8564	mov w0,#0xffffffff
00ac8568	ldp x29,x30,[sp, #0x30]
00ac856c	ldp x20,x19,[sp, #0x20]
00ac8570	ldp x22,x21,[sp, #0x10]
00ac8574	ldr x23,[sp], #0x40
00ac8578	ret

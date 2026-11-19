; RSA_set_method @ 00ad1534
00ad1534	stp x20,x19,[sp, #-0x20]!
00ad1538	stp x29,x30,[sp, #0x10]
00ad153c	ldr x8,[x0, #0x18]
00ad1540	mov x19,x0
00ad1544	mov x20,x1
00ad1548	add x29,sp,#0x10
00ad154c	ldr x8,[x8, #0x40]
00ad1550	cbz x8,0x00ad155c
00ad1554	mov x0,x19
00ad1558	blr x8
00ad155c	ldr x0,[x19, #0x20]
00ad1560	bl 0x00c32360
00ad1564	stp x20,xzr,[x19, #0x18]
00ad1568	ldr x8,[x20, #0x38]
00ad156c	cbz x8,0x00ad1578
00ad1570	mov x0,x19
00ad1574	blr x8
00ad1578	ldp x29,x30,[sp, #0x10]
00ad157c	mov w0,#0x1
00ad1580	ldp x20,x19,[sp], #0x20
00ad1584	ret

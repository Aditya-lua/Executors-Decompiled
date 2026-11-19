; mbedtls_ecjpake_write_shared_key @ 00ba14ac
00ba14ac	sub sp,sp,#0x90
00ba14b0	str x25,[sp, #0x40]
00ba14b4	stp x24,x23,[sp, #0x50]
00ba14b8	stp x22,x21,[sp, #0x60]
00ba14bc	stp x20,x19,[sp, #0x70]
00ba14c0	stp x29,x30,[sp, #0x80]
00ba14c4	add x29,sp,#0x80
00ba14c8	mrs x25,tpidr_el0
00ba14cc	ldr x8,[x25, #0x28]
00ba14d0	mov x22,x0
00ba14d4	add x0,sp,#0x8
00ba14d8	mov x23,x5
00ba14dc	mov x24,x4
00ba14e0	mov x20,x3
00ba14e4	mov x19,x2
00ba14e8	mov x21,x1
00ba14ec	str x8,[sp, #0x38]
00ba14f0	bl 0x00c42760
00ba14f4	add x1,sp,#0x8
00ba14f8	mov x0,x22
00ba14fc	mov x2,x24
00ba1500	mov x3,x23
00ba1504	bl 0x00ba1398
00ba1508	mov w23,w0
00ba150c	cbnz w0,0x00ba1530
00ba1510	ldr w2,[x22, #0xcc]
00ba1514	add x0,x22,#0x8
00ba1518	add x1,sp,#0x8
00ba151c	mov x3,x20
00ba1520	mov x4,x21
00ba1524	mov x5,x19
00ba1528	bl 0x00c42780
00ba152c	mov w23,w0
00ba1530	add x0,sp,#0x8
00ba1534	bl 0x00c42750
00ba1538	ldr x8,[x25, #0x28]
00ba153c	ldr x9,[sp, #0x38]
00ba1540	cmp x8,x9
00ba1544	b.ne 0x00ba1568
00ba1548	mov w0,w23
00ba154c	ldp x29,x30,[sp, #0x80]
00ba1550	ldp x20,x19,[sp, #0x70]
00ba1554	ldp x22,x21,[sp, #0x60]
00ba1558	ldp x24,x23,[sp, #0x50]
00ba155c	ldr x25,[sp, #0x40]
00ba1560	add sp,sp,#0x90
00ba1564	ret
00ba1568	bl 0x00c2fec0

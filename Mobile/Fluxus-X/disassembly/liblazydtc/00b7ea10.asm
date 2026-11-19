; mbedtls_mpi_read_binary_le @ 00b7ea10
00b7ea10	str x21,[sp, #-0x30]!
00b7ea14	stp x20,x19,[sp, #0x10]
00b7ea18	stp x29,x30,[sp, #0x20]
00b7ea1c	add x29,sp,#0x20
00b7ea20	lsr x8,x2,#0x3
00b7ea24	tst x2,#0x7
00b7ea28	mov x20,x1
00b7ea2c	cinc x1,x8,ne
00b7ea30	mov x19,x2
00b7ea34	mov x21,x0
00b7ea38	bl 0x00b7ea70
00b7ea3c	cbz w0,0x00b7ea50
00b7ea40	ldp x29,x30,[sp, #0x20]
00b7ea44	ldp x20,x19,[sp, #0x10]
00b7ea48	ldr x21,[sp], #0x30
00b7ea4c	ret
00b7ea50	ldr x0,[x21]
00b7ea54	ldrh w1,[x21, #0xa]
00b7ea58	mov x2,x20
00b7ea5c	mov x3,x19
00b7ea60	ldp x29,x30,[sp, #0x20]
00b7ea64	ldp x20,x19,[sp, #0x10]
00b7ea68	ldr x21,[sp], #0x30
00b7ea6c	b 0x00c41ed0

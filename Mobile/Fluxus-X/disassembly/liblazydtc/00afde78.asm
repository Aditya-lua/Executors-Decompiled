; NAMING_AUTHORITY_set0_authorityURL @ 00afde78
00afde78	stp x20,x19,[sp, #-0x20]!
00afde7c	stp x29,x30,[sp, #0x10]
00afde80	mov x19,x0
00afde84	ldr x0,[x0, #0x8]
00afde88	add x29,sp,#0x10
00afde8c	mov x20,x1
00afde90	bl 0x00c38140
00afde94	str x20,[x19, #0x8]
00afde98	ldp x29,x30,[sp, #0x10]
00afde9c	ldp x20,x19,[sp], #0x20
00afdea0	ret

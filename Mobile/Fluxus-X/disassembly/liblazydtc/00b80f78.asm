; mbedtls_mpi_fill_random @ 00b80f78
00b80f78	stp x22,x21,[sp, #-0x30]!
00b80f7c	stp x20,x19,[sp, #0x10]
00b80f80	stp x29,x30,[sp, #0x20]
00b80f84	add x29,sp,#0x20
00b80f88	lsr x8,x1,#0x3
00b80f8c	tst x1,#0x7
00b80f90	mov x21,x1
00b80f94	cinc x1,x8,ne
00b80f98	mov x19,x3
00b80f9c	mov x20,x2
00b80fa0	mov x22,x0
00b80fa4	bl 0x00b7ea70
00b80fa8	cbz w0,0x00b80fbc
00b80fac	ldp x29,x30,[sp, #0x20]
00b80fb0	ldp x20,x19,[sp, #0x10]
00b80fb4	ldp x22,x21,[sp], #0x30
00b80fb8	ret
00b80fbc	cbz x21,0x00b80fe4
00b80fc0	ldr x0,[x22]
00b80fc4	ldrh w1,[x22, #0xa]
00b80fc8	mov x3,x20
00b80fcc	mov x4,x19
00b80fd0	ldp x29,x30,[sp, #0x20]
00b80fd4	ldp x20,x19,[sp, #0x10]
00b80fd8	mov x2,x21
00b80fdc	ldp x22,x21,[sp], #0x30
00b80fe0	b 0x00c41e30
00b80fe4	mov w0,wzr
00b80fe8	b 0x00b80fac

; mbedtls_rsa_deduce_crt @ 00baabac
00baabac	sub sp,sp,#0x70
00baabb0	stp x26,x25,[sp, #0x20]
00baabb4	stp x24,x23,[sp, #0x30]
00baabb8	stp x22,x21,[sp, #0x40]
00baabbc	stp x20,x19,[sp, #0x50]
00baabc0	stp x29,x30,[sp, #0x60]
00baabc4	add x29,sp,#0x60
00baabc8	mrs x26,tpidr_el0
00baabcc	ldr x8,[x26, #0x28]
00baabd0	mov x20,x0
00baabd4	add x0,sp,#0x8
00baabd8	mov x19,x5
00baabdc	mov x22,x4
00baabe0	mov x25,x3
00baabe4	mov x23,x2
00baabe8	mov x21,x1
00baabec	str x8,[sp, #0x18]
00baabf0	bl 0x00c41c00
00baabf4	cbz x25,0x00baac28
00baabf8	add x0,sp,#0x8
00baabfc	mov w2,#0x1
00baac00	mov x1,x20
00baac04	bl 0x00c41d50
00baac08	mov w24,w0
00baac0c	cbnz w0,0x00baac84
00baac10	add x2,sp,#0x8
00baac14	mov x0,x25
00baac18	mov x1,x23
00baac1c	bl 0x00c41c60
00baac20	mov w24,w0
00baac24	cbnz w0,0x00baac84
00baac28	cbz x22,0x00baac64
00baac2c	add x0,sp,#0x8
00baac30	mov w2,#0x1
00baac34	mov x1,x21
00baac38	bl 0x00c41d50
00baac3c	mov w24,w0
00baac40	cbnz w0,0x00baac84
00baac44	add x2,sp,#0x8
00baac48	mov x0,x22
00baac4c	mov x1,x23
00baac50	bl 0x00c41c60
00baac54	mov w24,w0
00baac58	cbz x19,0x00baac84
00baac5c	cbz w24,0x00baac68
00baac60	b 0x00baac84
00baac64	cbz x19,0x00baac80
00baac68	mov x0,x19
00baac6c	mov x1,x21
00baac70	mov x2,x20
00baac74	bl 0x00c41c10
00baac78	mov w24,w0
00baac7c	b 0x00baac84
00baac80	mov w24,wzr
00baac84	add x0,sp,#0x8
00baac88	bl 0x00c41bb0
00baac8c	ldr x8,[x26, #0x28]
00baac90	ldr x9,[sp, #0x18]
00baac94	cmp x8,x9
00baac98	b.ne 0x00baacbc
00baac9c	mov w0,w24
00baaca0	ldp x29,x30,[sp, #0x60]
00baaca4	ldp x20,x19,[sp, #0x50]
00baaca8	ldp x22,x21,[sp, #0x40]
00baacac	ldp x24,x23,[sp, #0x30]
00baacb0	ldp x26,x25,[sp, #0x20]
00baacb4	add sp,sp,#0x70
00baacb8	ret
00baacbc	bl 0x00c2fec0

; ossl_statem_server_post_process_message @ 009eac0c
009eac0c	str x19,[sp, #-0x20]!
009eac10	stp x29,x30,[sp, #0x10]
009eac14	ldr w8,[x0, #0x5c]
009eac18	mov x19,x0
009eac1c	add x29,sp,#0x10
009eac20	cmp w8,#0x1c
009eac24	b.eq 0x009eac40
009eac28	cmp w8,#0x14
009eac2c	b.ne 0x009eac50
009eac30	ldp x29,x30,[sp, #0x10]
009eac34	mov x0,x19
009eac38	ldr x19,[sp], #0x20
009eac3c	b 0x009eac94
009eac40	ldp x29,x30,[sp, #0x10]
009eac44	mov x0,x19
009eac48	ldr x19,[sp], #0x20
009eac4c	b 0x009ebbc4
009eac50	bl 0x00c342a0
009eac54	adrp x0,0x2bd000
009eac58	adrp x2,0x2b3000
009eac5c	add x0,x0,#0x74c
009eac60	add x2,x2,#0xfd6
009eac64	mov w1,#0x4d0
009eac68	bl 0x00c342b0
009eac6c	mov w2,#0x103
009eac70	mov w1,#0x50
009eac74	movk w2,#0xc, LSL #16
009eac78	mov x0,x19
009eac7c	mov x3,xzr
009eac80	bl 0x00c34410
009eac84	ldp x29,x30,[sp, #0x10]
009eac88	mov w0,wzr
009eac8c	ldr x19,[sp], #0x20
009eac90	ret

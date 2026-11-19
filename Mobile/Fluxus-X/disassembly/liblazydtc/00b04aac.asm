; ossl_x509_pubkey_hash @ 00b04aac
00b04aac	sub sp,sp,#0x90
00b04ab0	str x21,[sp, #0x60]
00b04ab4	stp x20,x19,[sp, #0x70]
00b04ab8	stp x29,x30,[sp, #0x80]
00b04abc	add x29,sp,#0x80
00b04ac0	cbz x0,0x00b04b58
00b04ac4	mov x21,x0
00b04ac8	add x0,sp,#0x8
00b04acc	add x1,sp,#0x10
00b04ad0	mov x2,x21
00b04ad4	bl 0x00c3a9d0
00b04ad8	cbz w0,0x00b04b98
00b04adc	ldp x0,x2,[sp, #0x8]
00b04ae0	adrp x1,0x2d1000
00b04ae4	add x1,x1,#0x42e
00b04ae8	bl 0x00c357f0
00b04aec	cbz x0,0x00b04b98
00b04af0	mov x20,x0
00b04af4	bl 0x00c38170
00b04af8	mov x19,x0
00b04afc	cbz x0,0x00b04b4c
00b04b00	sub x1,x29,#0x18
00b04b04	sub x2,x29,#0x24
00b04b08	mov x0,xzr
00b04b0c	mov x3,xzr
00b04b10	mov x4,x21
00b04b14	bl 0x00c32be0
00b04b18	ldur x0,[x29, #-0x18]
00b04b1c	ldursw x1,[x29, #-0x24]
00b04b20	add x2,sp,#0x1c
00b04b24	add x3,sp,#0x18
00b04b28	mov x4,x20
00b04b2c	mov x5,xzr
00b04b30	bl 0x00c370c0
00b04b34	cbz w0,0x00b04b88
00b04b38	ldr w2,[sp, #0x18]
00b04b3c	add x1,sp,#0x1c
00b04b40	mov x0,x19
00b04b44	bl 0x00c377a0
00b04b48	cbz w0,0x00b04b88
00b04b4c	mov x0,x20
00b04b50	bl 0x00c35800
00b04b54	b 0x00b04b9c
00b04b58	bl 0x00c342a0
00b04b5c	adrp x0,0x2c2000
00b04b60	adrp x2,0x2b8000
00b04b64	add x0,x0,#0x5ae
00b04b68	add x2,x2,#0x771
00b04b6c	mov w1,#0x43
00b04b70	bl 0x00c342b0
00b04b74	mov w0,#0x22
00b04b78	mov w1,#0x72
00b04b7c	mov x2,xzr
00b04b80	bl 0x00c342c0
00b04b84	b 0x00b04b98
00b04b88	mov x0,x20
00b04b8c	bl 0x00c35800
00b04b90	mov x0,x19
00b04b94	bl 0x00c35530
00b04b98	mov x19,xzr
00b04b9c	mov x0,x19
00b04ba0	ldp x29,x30,[sp, #0x80]
00b04ba4	ldp x20,x19,[sp, #0x70]
00b04ba8	ldr x21,[sp, #0x60]
00b04bac	add sp,sp,#0x90
00b04bb0	ret

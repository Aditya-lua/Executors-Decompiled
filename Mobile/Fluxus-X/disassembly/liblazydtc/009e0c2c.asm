; ossl_gost_ukm @ 009e0c2c
009e0c2c	sub sp,sp,#0x40
009e0c30	stp x22,x21,[sp, #0x10]
009e0c34	stp x20,x19,[sp, #0x20]
009e0c38	stp x29,x30,[sp, #0x30]
009e0c3c	ldr x8,[x0, #0x9a8]
009e0c40	mov x22,x0
009e0c44	mov x20,x1
009e0c48	mov w1,#0x3d6
009e0c4c	ldr x0,[x8]
009e0c50	ldr x2,[x8, #0x440]
009e0c54	add x29,sp,#0x30
009e0c58	bl 0x00c34ca0
009e0c5c	cbz x0,0x009e0cf8
009e0c60	mov x19,x0
009e0c64	bl 0x00c31fa0
009e0c68	mov x21,x0
009e0c6c	cbz x0,0x009e0ce4
009e0c70	mov x0,x21
009e0c74	mov x1,x19
009e0c78	bl 0x00c32430
009e0c7c	cmp w0,#0x1
009e0c80	b.lt 0x009e0ce4
009e0c84	add x1,x22,#0x160
009e0c88	mov w2,#0x20
009e0c8c	mov x0,x21
009e0c90	bl 0x00c31f80
009e0c94	cmp w0,#0x1
009e0c98	b.lt 0x009e0ce4
009e0c9c	add x1,x22,#0x140
009e0ca0	mov w2,#0x20
009e0ca4	mov x0,x21
009e0ca8	bl 0x00c31f80
009e0cac	cmp w0,#0x1
009e0cb0	b.lt 0x009e0ce4
009e0cb4	add x2,sp,#0xc
009e0cb8	mov x0,x21
009e0cbc	mov x1,x20
009e0cc0	bl 0x00c31f60
009e0cc4	cmp w0,#0x0
009e0cc8	b.le 0x009e0ce4
009e0ccc	mov x0,x21
009e0cd0	bl 0x00c31f90
009e0cd4	mov x0,x19
009e0cd8	bl 0x00c34980
009e0cdc	mov w0,#0x1
009e0ce0	b 0x009e0cf8
009e0ce4	mov x0,x21
009e0ce8	bl 0x00c31f90
009e0cec	mov x0,x19
009e0cf0	bl 0x00c34980
009e0cf4	mov w0,wzr
009e0cf8	ldp x29,x30,[sp, #0x30]
009e0cfc	ldp x20,x19,[sp, #0x20]
009e0d00	ldp x22,x21,[sp, #0x10]
009e0d04	add sp,sp,#0x40
009e0d08	ret

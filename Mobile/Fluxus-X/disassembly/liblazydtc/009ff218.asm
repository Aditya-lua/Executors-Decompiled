; BIO_get_port @ 009ff218
009ff218	sub sp,sp,#0x30
009ff21c	stp x20,x19,[sp, #0x10]
009ff220	stp x29,x30,[sp, #0x20]
009ff224	add x29,sp,#0x20
009ff228	str xzr,[sp, #0x8]
009ff22c	cbz x0,0x009ff288
009ff230	mov x20,x0
009ff234	mov x19,x1
009ff238	mov w3,#0x2
009ff23c	mov w4,#0x1
009ff240	add x5,sp,#0x8
009ff244	mov x0,xzr
009ff248	mov x1,x20
009ff24c	mov w2,wzr
009ff250	bl 0x00c38590
009ff254	cbz w0,0x009ff2b8
009ff258	ldr x0,[sp, #0x8]
009ff25c	bl 0x00c384c0
009ff260	cmp w0,#0x2
009ff264	b.ne 0x009ff2d4
009ff268	ldr x0,[sp, #0x8]
009ff26c	bl 0x00c384b0
009ff270	bl 0x00c38540
009ff274	rev w8,w0
009ff278	lsr w8,w8,#0x10
009ff27c	strh w8,[x19]
009ff280	mov w19,#0x1
009ff284	b 0x009ff304
009ff288	bl 0x00c342a0
009ff28c	adrp x0,0x2c3000
009ff290	adrp x2,0x2ab000
009ff294	add x0,x0,#0x72e
009ff298	add x2,x2,#0xe5e
009ff29c	mov w1,#0x51
009ff2a0	bl 0x00c342b0
009ff2a4	mov w0,#0x20
009ff2a8	mov w1,#0x71
009ff2ac	mov x2,xzr
009ff2b0	bl 0x00c342c0
009ff2b4	b 0x009ff2cc
009ff2b8	adrp x1,0x2d3000
009ff2bc	add x1,x1,#0x8ff
009ff2c0	mov w0,#0x2
009ff2c4	mov x2,x20
009ff2c8	bl 0x00c37fb0
009ff2cc	mov w19,wzr
009ff2d0	b 0x009ff30c
009ff2d4	bl 0x00c342a0
009ff2d8	adrp x0,0x2c3000
009ff2dc	adrp x2,0x2ab000
009ff2e0	add x0,x0,#0x72e
009ff2e4	add x2,x2,#0xe5e
009ff2e8	mov w1,#0x5a
009ff2ec	bl 0x00c342b0
009ff2f0	mov w0,#0x20
009ff2f4	mov w1,#0x8d
009ff2f8	mov x2,xzr
009ff2fc	bl 0x00c342c0
009ff300	mov w19,wzr
009ff304	ldr x0,[sp, #0x8]
009ff308	bl 0x00c384d0
009ff30c	mov w0,w19
009ff310	ldp x29,x30,[sp, #0x20]
009ff314	ldp x20,x19,[sp, #0x10]
009ff318	add sp,sp,#0x30
009ff31c	ret

; ssl3_finish_mac @ 009ab288
009ab288	stp x20,x19,[sp, #-0x20]!
009ab28c	stp x29,x30,[sp, #0x10]
009ab290	mov x19,x0
009ab294	ldr x0,[x0, #0x190]
009ab298	mov x20,x2
009ab29c	add x29,sp,#0x10
009ab2a0	cbz x0,0x009ab2b8
009ab2a4	mov x2,x20
009ab2a8	bl 0x00c31f80
009ab2ac	cbz w0,0x009ab2e8
009ab2b0	mov w0,#0x1
009ab2b4	b 0x009ab358
009ab2b8	lsr x8,x20,#0x1f
009ab2bc	cbz x8,0x009ab304
009ab2c0	bl 0x00c342a0
009ab2c4	adrp x0,0x2a3000
009ab2c8	adrp x2,0x2cf000
009ab2cc	add x0,x0,#0xb34
009ab2d0	add x2,x2,#0x631
009ab2d4	mov w1,#0x161
009ab2d8	bl 0x00c342b0
009ab2dc	mov w1,#0x50
009ab2e0	mov w2,#0xed
009ab2e4	b 0x009ab348
009ab2e8	bl 0x00c342a0
009ab2ec	adrp x0,0x2a3000
009ab2f0	adrp x2,0x2cf000
009ab2f4	add x0,x0,#0xb34
009ab2f8	add x2,x2,#0x631
009ab2fc	mov w1,#0x16c
009ab300	b 0x009ab338
009ab304	ldr x0,[x19, #0x188]
009ab308	mov w2,w20
009ab30c	bl 0x00c34240
009ab310	cmp w0,#0x1
009ab314	b.lt 0x009ab320
009ab318	cmp w0,w20
009ab31c	b.eq 0x009ab2b0
009ab320	bl 0x00c342a0
009ab324	adrp x0,0x2a3000
009ab328	adrp x2,0x2cf000
009ab32c	add x0,x0,#0xb34
009ab330	add x2,x2,#0x631
009ab334	mov w1,#0x166
009ab338	bl 0x00c342b0
009ab33c	mov w2,#0x103
009ab340	mov w1,#0x50
009ab344	movk w2,#0xc, LSL #16
009ab348	mov x0,x19
009ab34c	mov x3,xzr
009ab350	bl 0x00c34410
009ab354	mov w0,wzr
009ab358	ldp x29,x30,[sp, #0x10]
009ab35c	ldp x20,x19,[sp], #0x20
009ab360	ret

; SSL_CONF_CTX_free @ 009ba2f4
009ba2f4	cbz x0,0x009ba3d8
009ba2f8	stp x20,x19,[sp, #-0x20]!
009ba2fc	stp x29,x30,[sp, #0x10]
009ba300	mov x19,x0
009ba304	ldr x0,[x0, #0x30]
009ba308	adrp x20,0x2ad000
009ba30c	add x20,x20,#0x7c2
009ba310	mov w2,#0x3f9
009ba314	mov x1,x20
009ba318	add x29,sp,#0x10
009ba31c	bl 0x00c32310
009ba320	ldr x0,[x19, #0x38]
009ba324	mov w2,#0x3f9
009ba328	mov x1,x20
009ba32c	bl 0x00c32310
009ba330	ldr x0,[x19, #0x40]
009ba334	mov w2,#0x3f9
009ba338	mov x1,x20
009ba33c	bl 0x00c32310
009ba340	ldr x0,[x19, #0x48]
009ba344	mov w2,#0x3f9
009ba348	mov x1,x20
009ba34c	bl 0x00c32310
009ba350	ldr x0,[x19, #0x50]
009ba354	mov w2,#0x3f9
009ba358	mov x1,x20
009ba35c	bl 0x00c32310
009ba360	ldr x0,[x19, #0x58]
009ba364	mov w2,#0x3f9
009ba368	mov x1,x20
009ba36c	bl 0x00c32310
009ba370	ldr x0,[x19, #0x60]
009ba374	mov w2,#0x3f9
009ba378	mov x1,x20
009ba37c	bl 0x00c32310
009ba380	ldr x0,[x19, #0x68]
009ba384	mov w2,#0x3f9
009ba388	mov x1,x20
009ba38c	bl 0x00c32310
009ba390	ldr x0,[x19, #0x70]
009ba394	mov w2,#0x3f9
009ba398	mov x1,x20
009ba39c	bl 0x00c32310
009ba3a0	ldr x0,[x19, #0x8]
009ba3a4	mov w2,#0x3fa
009ba3a8	mov x1,x20
009ba3ac	bl 0x00c32310
009ba3b0	adrp x1,0xcb5000
009ba3b4	ldr x0,[x19, #0xa8]
009ba3b8	ldr x1,[x1, #0x140]
009ba3bc	bl 0x00c32600
009ba3c0	ldp x29,x30,[sp, #0x10]
009ba3c4	orr w2,wzr,#0x3fc
009ba3c8	mov x0,x19
009ba3cc	mov x1,x20
009ba3d0	ldp x20,x19,[sp], #0x20
009ba3d4	b 0x00c32310
009ba3d8	ret

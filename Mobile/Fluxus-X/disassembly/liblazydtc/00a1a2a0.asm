; ossl_dh_check_priv_key @ 00a1a2a0
00a1a2a0	str x23,[sp, #-0x40]!
00a1a2a4	stp x22,x21,[sp, #0x10]
00a1a2a8	stp x20,x19,[sp, #0x20]
00a1a2ac	stp x29,x30,[sp, #0x30]
00a1a2b0	add x29,sp,#0x30
00a1a2b4	mov x21,x2
00a1a2b8	mov x20,x1
00a1a2bc	mov x23,x0
00a1a2c0	str wzr,[x2]
00a1a2c4	bl 0x00c37710
00a1a2c8	cbz x0,0x00a1a334
00a1a2cc	ldr x22,[x23, #0x10]
00a1a2d0	mov x19,x0
00a1a2d4	cbz x22,0x00a1a33c
00a1a2d8	mov x0,x23
00a1a2dc	bl 0x00c39e10
00a1a2e0	cbz w0,0x00a1a318
00a1a2e4	ldr w8,[x23, #0x68]
00a1a2e8	cbz w8,0x00a1a318
00a1a2ec	bl 0x00c38de0
00a1a2f0	ldr w2,[x23, #0x68]
00a1a2f4	mov x1,x0
00a1a2f8	mov x0,x19
00a1a2fc	bl 0x00c38fc0
00a1a300	cbz w0,0x00a1a360
00a1a304	ldr x1,[x23, #0x10]
00a1a308	mov x0,x19
00a1a30c	bl 0x00c38cc0
00a1a310	cmp w0,#0x0
00a1a314	csel x22,x19,x22,lt
00a1a318	mov x0,x22
00a1a31c	mov x1,x20
00a1a320	mov x2,x21
00a1a324	bl 0x00c39e60
00a1a328	cmp w0,#0x0
00a1a32c	cset w21,ne
00a1a330	b 0x00a1a364
00a1a334	mov w21,wzr
00a1a338	b 0x00a1a36c
00a1a33c	ldr x0,[x23, #0x8]
00a1a340	cbz x0,0x00a1a360
00a1a344	ldr w21,[x23, #0x68]
00a1a348	cbz w21,0x00a1a384
00a1a34c	mov x0,x20
00a1a350	bl 0x00c322f0
00a1a354	cmp w0,w21
00a1a358	cset w21,eq
00a1a35c	b 0x00a1a364
00a1a360	mov w21,wzr
00a1a364	mov x0,x19
00a1a368	bl 0x00c36290
00a1a36c	mov w0,w21
00a1a370	ldp x29,x30,[sp, #0x30]
00a1a374	ldp x20,x19,[sp, #0x20]
00a1a378	ldp x22,x21,[sp, #0x10]
00a1a37c	ldr x23,[sp], #0x40
00a1a380	ret
00a1a384	bl 0x00c322f0
00a1a388	mov w21,w0
00a1a38c	mov x0,x20
00a1a390	bl 0x00c322f0
00a1a394	cmp w0,w21
00a1a398	mov w21,wzr
00a1a39c	b.ge 0x00a1a364
00a1a3a0	mov x0,x20
00a1a3a4	bl 0x00c322f0
00a1a3a8	cmp w0,#0x1
00a1a3ac	cset w21,gt
00a1a3b0	b 0x00a1a364

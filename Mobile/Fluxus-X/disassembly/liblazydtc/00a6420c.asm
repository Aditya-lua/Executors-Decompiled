; EVP_KDF_CTX_get_kdf_size @ 00a6420c
00a6420c	sub sp,sp,#0xa0
00a64210	str x19,[sp, #0x80]
00a64214	mov x19,x0
00a64218	add x0,sp,#0x30
00a6421c	mov w2,#0x50
00a64220	mov w1,wzr
00a64224	stp x29,x30,[sp, #0x90]
00a64228	add x29,sp,#0x90
00a6422c	bl 0x00c301c0
00a64230	stur xzr,[x29, #-0x8]
00a64234	cbz x19,0x00a642a8
00a64238	adrp x0,0x2d7000
00a6423c	add x0,x0,#0xe7d
00a64240	add x8,sp,#0x8
00a64244	sub x1,x29,#0x8
00a64248	bl 0x00c36270
00a6424c	ldr x8,[sp, #0x28]
00a64250	ldur q0,[sp, #0x18]
00a64254	ldur q1,[sp, #0x8]
00a64258	str x8,[sp, #0x50]
00a6425c	stp q1,q0,[sp, #0x30]
00a64260	ldr x8,[x19]
00a64264	ldr x9,[x8, #0x78]
00a64268	cbz x9,0x00a64288
00a6426c	ldr x0,[x19, #0x8]
00a64270	add x1,sp,#0x30
00a64274	blr x9
00a64278	cbz w0,0x00a64284
00a6427c	ldur x0,[x29, #-0x8]
00a64280	b 0x00a642ac
00a64284	ldr x8,[x19]
00a64288	ldr x8,[x8, #0x70]
00a6428c	cbz x8,0x00a642a8
00a64290	add x0,sp,#0x30
00a64294	blr x8
00a64298	ldur x8,[x29, #-0x8]
00a6429c	cmp w0,#0x0
00a642a0	csel x0,xzr,x8,eq
00a642a4	b 0x00a642ac
00a642a8	mov x0,xzr
00a642ac	ldp x29,x30,[sp, #0x90]
00a642b0	ldr x19,[sp, #0x80]
00a642b4	add sp,sp,#0xa0
00a642b8	ret

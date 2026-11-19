; PKCS1_MGF1 @ 00ad5268
00ad5268	sub sp,sp,#0xb0
00ad526c	stp x28,x27,[sp, #0x50]
00ad5270	stp x26,x25,[sp, #0x60]
00ad5274	stp x24,x23,[sp, #0x70]
00ad5278	stp x22,x21,[sp, #0x80]
00ad527c	stp x20,x19,[sp, #0x90]
00ad5280	stp x29,x30,[sp, #0xa0]
00ad5284	add x29,sp,#0xa0
00ad5288	mov x22,x4
00ad528c	mov x23,x3
00ad5290	mov x24,x2
00ad5294	mov x20,x1
00ad5298	mov x21,x0
00ad529c	bl 0x00c31fa0
00ad52a0	mov x19,x0
00ad52a4	cbz x0,0x00ad5380
00ad52a8	mov x0,x22
00ad52ac	bl 0x00c34c20
00ad52b0	tbnz w0,#0x1f,0x00ad5380
00ad52b4	cmp x20,#0x1
00ad52b8	b.lt 0x00ad5378
00ad52bc	mov x25,xzr
00ad52c0	mov x27,xzr
00ad52c4	sxtw x26,w0
00ad52c8	lsr x8,x25,#0x18
00ad52cc	lsr x9,x25,#0x10
00ad52d0	lsr x10,x25,#0x8
00ad52d4	mov x0,x19
00ad52d8	mov x1,x22
00ad52dc	mov x2,xzr
00ad52e0	strb w8,[sp, #0x4c]
00ad52e4	strb w9,[sp, #0x4d]
00ad52e8	strb w10,[sp, #0x4e]
00ad52ec	strb w25,[sp, #0x4f]
00ad52f0	bl 0x00c31f70
00ad52f4	cbz w0,0x00ad5380
00ad52f8	mov x0,x19
00ad52fc	mov x1,x24
00ad5300	mov x2,x23
00ad5304	bl 0x00c31f80
00ad5308	cbz w0,0x00ad5380
00ad530c	add x1,sp,#0x4c
00ad5310	mov w2,#0x4
00ad5314	mov x0,x19
00ad5318	bl 0x00c31f80
00ad531c	cbz w0,0x00ad5380
00ad5320	add x28,x27,x26
00ad5324	cmp x28,x20
00ad5328	b.gt 0x00ad5354
00ad532c	add x1,x21,x27
00ad5330	mov x0,x19
00ad5334	mov x2,xzr
00ad5338	bl 0x00c31f60
00ad533c	cbz w0,0x00ad5380
00ad5340	cmp x28,x20
00ad5344	add x25,x25,#0x1
00ad5348	mov x27,x28
00ad534c	b.lt 0x00ad52c8
00ad5350	b 0x00ad5378
00ad5354	add x1,sp,#0xc
00ad5358	mov x0,x19
00ad535c	mov x2,xzr
00ad5360	bl 0x00c31f60
00ad5364	cbz w0,0x00ad5380
00ad5368	add x0,x21,x27
00ad536c	sub x2,x20,x27
00ad5370	add x1,sp,#0xc
00ad5374	bl 0x00c2ffd0
00ad5378	mov w20,wzr
00ad537c	b 0x00ad5384
00ad5380	mov w20,#0xffffffff
00ad5384	add x0,sp,#0xc
00ad5388	mov w1,#0x40
00ad538c	bl 0x00c34750
00ad5390	mov x0,x19
00ad5394	bl 0x00c31f90
00ad5398	mov w0,w20
00ad539c	ldp x29,x30,[sp, #0xa0]
00ad53a0	ldp x20,x19,[sp, #0x90]
00ad53a4	ldp x22,x21,[sp, #0x80]
00ad53a8	ldp x24,x23,[sp, #0x70]
00ad53ac	ldp x26,x25,[sp, #0x60]
00ad53b0	ldp x28,x27,[sp, #0x50]
00ad53b4	add sp,sp,#0xb0
00ad53b8	ret

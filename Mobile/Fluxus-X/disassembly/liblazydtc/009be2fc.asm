; FUN_009be2fc @ 009be2fc
009be2fc	str x23,[sp, #-0x40]!
009be300	stp x22,x21,[sp, #0x10]
009be304	stp x20,x19,[sp, #0x20]
009be308	stp x29,x30,[sp, #0x30]
009be30c	add x29,sp,#0x30
009be310	cbz x1,0x009be40c
009be314	ldr x8,[x1, #0x250]
009be318	mov x19,x1
009be31c	cbz x8,0x009be40c
009be320	mov w21,w2
009be324	mov x20,x0
009be328	cbz w2,0x009be338
009be32c	ldr x0,[x20, #0x3c8]
009be330	bl 0x00c356a0
009be334	cbz w0,0x009be410
009be338	ldr x0,[x20, #0x30]
009be33c	mov x1,x19
009be340	bl 0x00c34de0
009be344	cbz x0,0x009be394
009be348	mov x1,x0
009be34c	ldr x0,[x20, #0x30]
009be350	bl 0x00c36010
009be354	ldr x9,[x0, #0x328]
009be358	mov x22,x0
009be35c	cbz x9,0x009be3cc
009be360	ldr x10,[x22, #0x320]
009be364	cbz x10,0x009be3cc
009be368	add x12,x20,#0x48
009be36c	add x8,x22,#0x320
009be370	cmp x9,x12
009be374	add x11,x20,#0x40
009be378	b.eq 0x009be3a0
009be37c	cmp x10,x11
009be380	b.eq 0x009be3b4
009be384	str x10,[x9, #0x320]
009be388	ldr x10,[x8]
009be38c	str x9,[x10, #0x328]
009be390	b 0x009be3c4
009be394	mov x22,xzr
009be398	mov w23,wzr
009be39c	b 0x009be3d0
009be3a0	cmp x10,x11
009be3a4	b.eq 0x009be3c0
009be3a8	str x10,[x12]
009be3ac	str x12,[x10, #0x328]
009be3b0	b 0x009be3c4
009be3b4	str x9,[x11]
009be3b8	str x11,[x9, #0x320]
009be3bc	b 0x009be3c4
009be3c0	stp xzr,xzr,[x11]
009be3c4	str xzr,[x22, #0x390]
009be3c8	stp xzr,xzr,[x8]
009be3cc	mov w23,#0x1
009be3d0	mov w8,#0x1
009be3d4	str w8,[x19, #0x2b0]
009be3d8	cbz w21,0x009be3e4
009be3dc	ldr x0,[x20, #0x3c8]
009be3e0	bl 0x00c35690
009be3e4	ldr x8,[x20, #0x68]
009be3e8	cbz x8,0x009be3f8
009be3ec	mov x0,x20
009be3f0	mov x1,x19
009be3f4	blr x8
009be3f8	cbz w23,0x009be40c
009be3fc	mov x0,x22
009be400	bl 0x009bdb1c
009be404	mov w0,#0x1
009be408	b 0x009be410
009be40c	mov w0,wzr
009be410	ldp x29,x30,[sp, #0x30]
009be414	ldp x20,x19,[sp, #0x20]
009be418	ldp x22,x21,[sp, #0x10]
009be41c	ldr x23,[sp], #0x40
009be420	ret

; FUN_008be320 @ 008be320
008be320	stp x29,x30,[sp, #-0x30]!
008be324	str x21,[sp, #0x10]
008be328	stp x20,x19,[sp, #0x20]
008be32c	mov x29,sp
008be330	ldrsb x8,[x1, #0x3]
008be334	mov x19,x2
008be338	tbnz x8,#0x3f,0x008be350
008be33c	ldr x9,[x0, #0x60]
008be340	add x8,x9,x8, LSL #0x3
008be344	ldr x8,[x8, #0x4048]
008be348	cbnz x8,0x008be368
008be34c	b 0x008be380
008be350	cmn w8,#0x80
008be354	b.ne 0x008be380
008be358	ldrsw x8,[x1, #0x4]
008be35c	add x8,x1,x8
008be360	ldr x8,[x8, #0x8]
008be364	cbz x8,0x008be380
008be368	mov x21,x1
008be36c	add x1,x1,#0x10
008be370	mov x20,x0
008be374	blr x8
008be378	mov x0,x20
008be37c	mov x1,x21
008be380	ldr w8,[x1, #0x4]
008be384	ldrb w3,[x1, #0x1]
008be388	add w9,w8,#0xf
008be38c	cmp w8,#0x10
008be390	and w9,w9,#0x7ffffff0
008be394	csel w8,w9,w8,gt
008be398	sxtw x8,w8
008be39c	add x2,x8,#0x10
008be3a0	mov x4,x19
008be3a4	ldp x20,x19,[sp, #0x20]
008be3a8	ldr x21,[sp, #0x10]
008be3ac	ldp x29,x30,[sp], #0x30
008be3b0	b 0x008b7bd4

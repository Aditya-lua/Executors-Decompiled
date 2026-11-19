; ossl_statem_fatal @ 009da2d4
009da2d4	sub sp,sp,#0x110
009da2d8	orr x9,xzr,#-0x7f00000080
009da2dc	stp x29,x30,[sp, #0x100]
009da2e0	add x29,sp,#0x100
009da2e4	movk x9,#0xffe0
009da2e8	stur x9,[x29, #-0x28]
009da2ec	add x9,x29,#0x10
009da2f0	mov x10,sp
009da2f4	stur x9,[x29, #-0x40]
009da2f8	add x9,sp,#0x80
009da2fc	add x10,x10,#0x80
009da300	add x9,x9,#0x20
009da304	stp x9,x10,[x29, #-0x38]
009da308	stp q0,q1,[sp]
009da30c	ldp q1,q0,[x29, #-0x40]
009da310	mov x8,x3
009da314	stp x20,x19,[sp, #0xf0]
009da318	mov w19,w1
009da31c	mov x20,x0
009da320	mov w0,#0x14
009da324	sub x3,x29,#0x60
009da328	mov w1,w2
009da32c	mov x2,x8
009da330	str x28,[sp, #0xe0]
009da334	stp q6,q7,[sp, #0x60]
009da338	stp q4,q5,[sp, #0x40]
009da33c	stp q2,q3,[sp, #0x20]
009da340	stp x6,x7,[sp, #0x90]
009da344	stp x4,x5,[sp, #0x80]
009da348	stp q1,q0,[x29, #-0x60]
009da34c	bl 0x00c37030
009da350	ldr w8,[x20, #0x64]
009da354	cbz w8,0x009da364
009da358	ldr w8,[x20, #0x48]
009da35c	cmp w8,#0x1
009da360	b.eq 0x009da394
009da364	mov w8,#0x1
009da368	cmn w19,#0x1
009da36c	str w8,[x20, #0x64]
009da370	str w8,[x20, #0x48]
009da374	b.eq 0x009da394
009da378	ldr w8,[x20, #0x7c]
009da37c	cmp w8,#0x1
009da380	b.eq 0x009da394
009da384	mov w1,#0x2
009da388	mov x0,x20
009da38c	mov w2,w19
009da390	bl 0x00c34890
009da394	ldp x29,x30,[sp, #0x100]
009da398	ldp x20,x19,[sp, #0xf0]
009da39c	ldr x28,[sp, #0xe0]
009da3a0	add sp,sp,#0x110
009da3a4	ret

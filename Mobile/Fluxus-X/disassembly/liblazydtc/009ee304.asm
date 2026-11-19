; FUN_009ee304 @ 009ee304
009ee304	sub sp,sp,#0x60
009ee308	stp x26,x25,[sp, #0x10]
009ee30c	stp x24,x23,[sp, #0x20]
009ee310	stp x22,x21,[sp, #0x30]
009ee314	stp x20,x19,[sp, #0x40]
009ee318	stp x29,x30,[sp, #0x50]
009ee31c	add x29,sp,#0x50
009ee320	cbz w1,0x009ee410
009ee324	mov x19,x4
009ee328	mov x20,x3
009ee32c	mov w21,w2
009ee330	mov w22,w1
009ee334	mov x23,x0
009ee338	mov w24,#0x1004
009ee33c	mov w25,#0x1002
009ee340	mov w26,#0x1001
009ee344	cmp w21,w24
009ee348	b.eq 0x009ee370
009ee34c	cmp w21,w25
009ee350	b.eq 0x009ee3b0
009ee354	cmp w21,w26
009ee358	b.ne 0x009ee3d8
009ee35c	ldrb w8,[x23], #0x1
009ee360	sub w22,w22,#0x1
009ee364	str x8,[sp, #0x8]
009ee368	cbnz x20,0x009ee3f8
009ee36c	b 0x009ee40c
009ee370	ldrb w8,[x23]
009ee374	sub w22,w22,#0x4
009ee378	lsl x8,x8,#0x18
009ee37c	str x8,[sp, #0x8]
009ee380	ldrb w9,[x23, #0x1]
009ee384	bfm x8,x9,#0x30,#0x7
009ee388	str x8,[sp, #0x8]
009ee38c	ldrb w9,[x23, #0x2]
009ee390	bfm x8,x9,#0x38,#0x7
009ee394	str x8,[sp, #0x8]
009ee398	ldrb w9,[x23, #0x3]
009ee39c	add x23,x23,#0x4
009ee3a0	orr x8,x8,x9
009ee3a4	str x8,[sp, #0x8]
009ee3a8	cbnz x20,0x009ee3f8
009ee3ac	b 0x009ee40c
009ee3b0	ldrb w8,[x23]
009ee3b4	sub w22,w22,#0x2
009ee3b8	lsl x9,x8,#0x8
009ee3bc	str x9,[sp, #0x8]
009ee3c0	ldrb w9,[x23, #0x1]
009ee3c4	add x23,x23,#0x2
009ee3c8	bfm x9,x8,#0x38,#0x7
009ee3cc	str x9,[sp, #0x8]
009ee3d0	cbnz x20,0x009ee3f8
009ee3d4	b 0x009ee40c
009ee3d8	add x2,sp,#0x8
009ee3dc	mov x0,x23
009ee3e0	mov w1,w22
009ee3e4	bl 0x00c37820
009ee3e8	tbnz w0,#0x1f,0x009ee430
009ee3ec	sub w22,w22,w0
009ee3f0	add x23,x23,w0, SXTW 
009ee3f4	cbz x20,0x009ee40c
009ee3f8	ldr x0,[sp, #0x8]
009ee3fc	mov x1,x19
009ee400	blr x20
009ee404	cmp w0,#0x1
009ee408	b.lt 0x009ee414
009ee40c	cbnz w22,0x009ee344
009ee410	mov w0,#0x1
009ee414	ldp x29,x30,[sp, #0x50]
009ee418	ldp x20,x19,[sp, #0x40]
009ee41c	ldp x22,x21,[sp, #0x30]
009ee420	ldp x24,x23,[sp, #0x20]
009ee424	ldp x26,x25,[sp, #0x10]
009ee428	add sp,sp,#0x60
009ee42c	ret
009ee430	mov w0,#0xffffffff
009ee434	b 0x009ee414

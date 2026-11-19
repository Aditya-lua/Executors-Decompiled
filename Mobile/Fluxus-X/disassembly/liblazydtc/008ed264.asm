; cpr::Session::SetHeaderCallback @ 008ed264
008ed264	sub sp,sp,#0x80
008ed268	str x23,[sp, #0x40]
008ed26c	stp x22,x21,[sp, #0x50]
008ed270	stp x20,x19,[sp, #0x60]
008ed274	stp x29,x30,[sp, #0x70]
008ed278	add x29,sp,#0x70
008ed27c	mrs x23,tpidr_el0
008ed280	ldr x8,[x23, #0x28]
008ed284	adrp x2,0xcb4000
008ed288	mov x19,x0
008ed28c	mov x22,x1
008ed290	str x8,[sp, #0x38]
008ed294	ldr x8,[x0, #0x18]
008ed298	mov w1,#0x4e6f
008ed29c	ldr x0,[x8]
008ed2a0	ldr x2,[x2, #0xcf8]
008ed2a4	bl 0x00c317c0
008ed2a8	ldr x8,[x22]
008ed2ac	add x20,x19,#0x120
008ed2b0	add x21,x19,#0x130
008ed2b4	str x8,[x19, #0x120]
008ed2b8	ldr x0,[x22, #0x30]
008ed2bc	cbz x0,0x008ed2e0
008ed2c0	add x8,x22,#0x10
008ed2c4	cmp x8,x0
008ed2c8	b.eq 0x008ed2e8
008ed2cc	ldr x8,[x0]
008ed2d0	ldr x8,[x8, #0x10]
008ed2d4	blr x8
008ed2d8	str x0,[sp, #0x20]
008ed2dc	b 0x008ed300
008ed2e0	str xzr,[sp, #0x20]
008ed2e4	b 0x008ed300
008ed2e8	mov x8,sp
008ed2ec	str x8,[sp, #0x20]
008ed2f0	ldr x8,[x0]
008ed2f4	mov x1,sp
008ed2f8	ldr x8,[x8, #0x18]
008ed2fc	blr x8
008ed300	mov x0,sp
008ed304	mov x1,x21
008ed308	mov x22,sp
008ed30c	bl 0x00c31720
008ed310	ldr x0,[sp, #0x20]
008ed314	cmp x22,x0
008ed318	b.eq 0x008ed32c
008ed31c	cbz x0,0x008ed338
008ed320	ldr x8,[x0]
008ed324	ldr x8,[x8, #0x28]
008ed328	b 0x008ed334
008ed32c	ldr x8,[x0]
008ed330	ldr x8,[x8, #0x20]
008ed334	blr x8
008ed338	ldr x8,[x19, #0x18]
008ed33c	mov w1,#0x272d
008ed340	mov x2,x20
008ed344	ldr x0,[x8]
008ed348	bl 0x00c317c0
008ed34c	ldr x8,[x23, #0x28]
008ed350	ldr x9,[sp, #0x38]
008ed354	cmp x8,x9
008ed358	b.ne 0x008ed374
008ed35c	ldp x29,x30,[sp, #0x70]
008ed360	ldp x20,x19,[sp, #0x60]
008ed364	ldp x22,x21,[sp, #0x50]
008ed368	ldr x23,[sp, #0x40]
008ed36c	add sp,sp,#0x80
008ed370	ret
008ed374	bl 0x00c2fec0

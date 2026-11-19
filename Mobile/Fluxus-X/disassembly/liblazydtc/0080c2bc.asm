; FUN_0080c2bc @ 0080c2bc
0080c2bc	sub sp,sp,#0x40
0080c2c0	stp x29,x30,[sp, #0x10]
0080c2c4	stp x22,x21,[sp, #0x20]
0080c2c8	stp x20,x19,[sp, #0x30]
0080c2cc	add x29,sp,#0x10
0080c2d0	mrs x22,tpidr_el0
0080c2d4	mov x21,x2
0080c2d8	mov x19,x1
0080c2dc	ldr x8,[x22, #0x28]
0080c2e0	mov x20,x0
0080c2e4	str x8,[sp, #0x8]
0080c2e8	ldrb w8,[x2, #0xd]
0080c2ec	cmp w8,#0x1
0080c2f0	b.ne 0x0080c338
0080c2f4	ldr s0,[x21, #0x8]
0080c2f8	adrp x8,0x29b000
0080c2fc	mov w9,#0xb5
0080c300	ldr d1,[x8, #0x498]
0080c304	adrp x8,0x29a000
0080c308	strb wzr,[x21, #0xd]
0080c30c	uxtl v0.8H,v0.8B
0080c310	ldr d2,[x8, #0x428]
0080c314	ldrb w8,[x21, #0xc]
0080c318	eor w8,w8,w9
0080c31c	eor v0.8B,v0.8B,v1.8B
0080c320	ldr d1,[x21]
0080c324	strb w8,[x21, #0xc]
0080c328	eor v1.8B,v1.8B,v2.8B
0080c32c	uzp1 v0.8B,v0.8B,v0.8B
0080c330	str d1,[x21]
0080c334	str s0,[x21, #0x8]
0080c338	mov x0,x20
0080c33c	mov x1,x19
0080c340	mov x2,x21
0080c344	mov w3,wzr
0080c348	mov x4,xzr
0080c34c	bl 0x008ac76c
0080c350	mov x0,x20
0080c354	mov w1,#0xffffffff
0080c358	bl 0x008aa2e4
0080c35c	ldr x8,[x0]
0080c360	adrp x0,0xd1b000
0080c364	add x0,x0,#0x520
0080c368	mov x1,sp
0080c36c	mov x2,sp
0080c370	str x8,[sp]
0080c374	bl 0x00807f14
0080c378	adrp x0,0xcca000
0080c37c	add x0,x0,#0x848
0080c380	mov x1,sp
0080c384	mov x2,sp
0080c388	str x19,[sp]
0080c38c	bl 0x0080837c
0080c390	mov x0,x20
0080c394	mov w1,#0xffffd8ee
0080c398	mov x2,x21
0080c39c	bl 0x008ad800
0080c3a0	ldr x8,[x22, #0x28]
0080c3a4	ldr x9,[sp, #0x8]
0080c3a8	cmp x8,x9
0080c3ac	b.ne 0x0080c3c4
0080c3b0	ldp x20,x19,[sp, #0x30]
0080c3b4	ldp x22,x21,[sp, #0x20]
0080c3b8	ldp x29,x30,[sp, #0x10]
0080c3bc	add sp,sp,#0x40
0080c3c0	ret
0080c3c4	bl 0x00c2fec0

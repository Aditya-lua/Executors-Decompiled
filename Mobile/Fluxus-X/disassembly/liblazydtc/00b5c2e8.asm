; FUN_00b5c2e8 @ 00b5c2e8
00b5c2e8	sub sp,sp,#0x90
00b5c2ec	stp x29,x30,[sp, #0x80]
00b5c2f0	add x29,sp,#0x80
00b5c2f4	str x25,[sp, #0x40]
00b5c2f8	stp x24,x23,[sp, #0x50]
00b5c2fc	stp x22,x21,[sp, #0x60]
00b5c300	stp x20,x19,[sp, #0x70]
00b5c304	mov x22,x3
00b5c308	mov x19,x2
00b5c30c	mov x20,x1
00b5c310	mov x21,x0
00b5c314	stur wzr,[x29, #-0x38]
00b5c318	bl 0x00c41000
00b5c31c	mov w8,w0
00b5c320	mov w0,wzr
00b5c324	cbz x21,0x00b5c3f4
00b5c328	cbz w8,0x00b5c3f4
00b5c32c	ldr x0,[x21, #0x168]
00b5c330	cbz x0,0x00b5c3f4
00b5c334	cbz x20,0x00b5c350
00b5c338	mov x1,sp
00b5c33c	sub x2,x29,#0x38
00b5c340	bl 0x00c31f60
00b5c344	cbz w0,0x00b5c3f4
00b5c348	ldur w24,[x29, #-0x38]
00b5c34c	b 0x00b5c354
00b5c350	mov w24,wzr
00b5c354	ldrb w8,[x21, #0x18]
00b5c358	ldr x0,[x21, #0x10]
00b5c35c	orr w8,w8,#0x1
00b5c360	strb w8,[x21, #0x18]
00b5c364	bl 0x00c3a120
00b5c368	ldr x8,[x21, #0x160]
00b5c36c	mov w23,w0
00b5c370	cbz x8,0x00b5c3e0
00b5c374	mov x0,x8
00b5c378	bl 0x00c34c20
00b5c37c	sxtw x25,w0
00b5c380	bl 0x00c41000
00b5c384	cbz w0,0x00b5c3f4
00b5c388	sxtw x8,w23
00b5c38c	cbz x20,0x00b5c3d4
00b5c390	cmp x8,x22
00b5c394	mov w0,wzr
00b5c398	b.hi 0x00b5c3f4
00b5c39c	mov w2,w24
00b5c3a0	cbz x25,0x00b5c3b0
00b5c3a4	cmp x25,x2
00b5c3a8	mov w0,wzr
00b5c3ac	b.ne 0x00b5c3f4
00b5c3b0	ldr x5,[x21, #0x10]
00b5c3b4	mov x1,sp
00b5c3b8	sub x4,x29,#0x34
00b5c3bc	mov w0,wzr
00b5c3c0	mov x3,x20
00b5c3c4	bl 0x00c3a3d0
00b5c3c8	cmp w0,#0x1
00b5c3cc	b.lt 0x00b5c3f0
00b5c3d0	ldur w8,[x29, #-0x34]
00b5c3d4	mov w0,#0x1
00b5c3d8	str x8,[x19]
00b5c3dc	b 0x00b5c3f4
00b5c3e0	mov x25,xzr
00b5c3e4	bl 0x00c41000
00b5c3e8	cbnz w0,0x00b5c388
00b5c3ec	b 0x00b5c3f4
00b5c3f0	mov w0,wzr
00b5c3f4	ldp x29,x30,[sp, #0x80]
00b5c3f8	ldp x20,x19,[sp, #0x70]
00b5c3fc	ldp x22,x21,[sp, #0x60]
00b5c400	ldp x24,x23,[sp, #0x50]
00b5c404	ldr x25,[sp, #0x40]
00b5c408	add sp,sp,#0x90
00b5c40c	ret

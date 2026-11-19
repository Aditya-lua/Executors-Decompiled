; UI_add_error_string @ 00aee2e0
00aee2e0	str x21,[sp, #-0x30]!
00aee2e4	stp x20,x19,[sp, #0x10]
00aee2e8	stp x29,x30,[sp, #0x20]
00aee2ec	add x29,sp,#0x20
00aee2f0	cbz x1,0x00aee370
00aee2f4	mov x21,x1
00aee2f8	adrp x1,0x2a0000
00aee2fc	mov x20,x0
00aee300	add x1,x1,#0xc2f
00aee304	mov w0,#0x48
00aee308	mov w2,#0x6d
00aee30c	bl 0x00c34250
00aee310	cbz x0,0x00aee3a0
00aee314	mov w8,#0x5
00aee318	str x21,[x0, #0x8]
00aee31c	str wzr,[x0, #0x40]
00aee320	str wzr,[x0, #0x10]
00aee324	str w8,[x0]
00aee328	str xzr,[x0, #0x18]
00aee32c	ldr x8,[x20, #0x8]!
00aee330	mov x19,x0
00aee334	cbnz x8,0x00aee344
00aee338	bl 0x00c34780
00aee33c	str x0,[x20]
00aee340	cbz x0,0x00aee3b8
00aee344	stp xzr,xzr,[x19, #0x28]
00aee348	ldr x0,[x20]
00aee34c	mov x1,x19
00aee350	bl 0x00c347a0
00aee354	mov w20,w0
00aee358	cmp w0,#0x0
00aee35c	b.gt 0x00aee3a4
00aee360	mov x0,x19
00aee364	sub w20,w20,#0x1
00aee368	bl 0x00aed930
00aee36c	b 0x00aee3a4
00aee370	bl 0x00c342a0
00aee374	adrp x0,0x2a0000
00aee378	adrp x2,0x2bc000
00aee37c	add x0,x0,#0xc2f
00aee380	add x2,x2,#0x531
00aee384	mov w1,#0x69
00aee388	bl 0x00c342b0
00aee38c	mov w1,#0x102
00aee390	mov w0,#0x28
00aee394	movk w1,#0xc, LSL #16
00aee398	mov x2,xzr
00aee39c	bl 0x00c342c0
00aee3a0	mov w20,#0xffffffff
00aee3a4	mov w0,w20
00aee3a8	ldp x29,x30,[sp, #0x20]
00aee3ac	ldp x20,x19,[sp, #0x10]
00aee3b0	ldr x21,[sp], #0x30
00aee3b4	ret
00aee3b8	mov x0,x19
00aee3bc	bl 0x00aed930
00aee3c0	b 0x00aee3a0

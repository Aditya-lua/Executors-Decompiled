; SSL_use_certificate @ 009bb34c
009bb34c	str x21,[sp, #-0x30]!
009bb350	stp x20,x19,[sp, #0x10]
009bb354	stp x29,x30,[sp, #0x20]
009bb358	add x29,sp,#0x20
009bb35c	cbz x1,0x009bb39c
009bb360	mov x19,x1
009bb364	mov w4,#0x1
009bb368	mov x1,xzr
009bb36c	mov x2,x19
009bb370	mov w3,wzr
009bb374	mov x21,x0
009bb378	bl 0x00c351a0
009bb37c	cmp w0,#0x1
009bb380	b.ne 0x009bb3c8
009bb384	ldr x0,[x21, #0x898]
009bb388	mov x1,x19
009bb38c	ldp x29,x30,[sp, #0x20]
009bb390	ldp x20,x19,[sp, #0x10]
009bb394	ldr x21,[sp], #0x30
009bb398	b 0x009bb40c
009bb39c	bl 0x00c342a0
009bb3a0	adrp x0,0x2db000
009bb3a4	adrp x2,0x2a9000
009bb3a8	add x0,x0,#0xaec
009bb3ac	add x2,x2,#0xdf2
009bb3b0	mov w1,#0x20
009bb3b4	bl 0x00c342b0
009bb3b8	mov w1,#0x102
009bb3bc	mov w0,#0x14
009bb3c0	movk w1,#0xc, LSL #16
009bb3c4	b 0x009bb3f0
009bb3c8	mov w20,w0
009bb3cc	bl 0x00c342a0
009bb3d0	adrp x0,0x2db000
009bb3d4	adrp x2,0x2a9000
009bb3d8	add x0,x0,#0xaec
009bb3dc	add x2,x2,#0xdf2
009bb3e0	mov w1,#0x26
009bb3e4	bl 0x00c342b0
009bb3e8	mov w0,#0x14
009bb3ec	mov w1,w20
009bb3f0	mov x2,xzr
009bb3f4	bl 0x00c342c0
009bb3f8	ldp x29,x30,[sp, #0x20]
009bb3fc	ldp x20,x19,[sp, #0x10]
009bb400	mov w0,wzr
009bb404	ldr x21,[sp], #0x30
009bb408	ret

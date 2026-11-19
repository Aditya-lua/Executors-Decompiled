; FUN_008bc2bc @ 008bc2bc
008bc2bc	sub sp,sp,#0x70
008bc2c0	stp x29,x30,[sp, #0x10]
008bc2c4	stp x28,x27,[sp, #0x20]
008bc2c8	stp x26,x25,[sp, #0x30]
008bc2cc	stp x24,x23,[sp, #0x40]
008bc2d0	stp x22,x21,[sp, #0x50]
008bc2d4	stp x20,x19,[sp, #0x60]
008bc2d8	add x29,sp,#0x10
008bc2dc	fmov x8,d0
008bc2e0	mov w10,#0xe995
008bc2e4	mov w27,#0x3700
008bc2e8	movk w10,#0x5bd1, LSL #16
008bc2ec	mov w21,w3
008bc2f0	mov x19,x2
008bc2f4	mov x20,x1
008bc2f8	mov x22,x0
008bc2fc	sub w24,w3,#0x1
008bc300	ubfx x9,x8,#0x20,#0x1f
008bc304	mov w26,#0xffffffff
008bc308	adrp x23,0xd1f000
008bc30c	add x23,x23,#0xc90
008bc310	adrp x28,0xd1f000
008bc314	movk w27,#0x7f, LSL #16
008bc318	eor w8,w8,w9, LSR #0x12
008bc31c	mul w8,w8,w10
008bc320	eor w9,w9,w8, LSR #0x16
008bc324	mul w9,w9,w10
008bc328	eor w8,w8,w9, LSR #0x11
008bc32c	mul w8,w8,w10
008bc330	eor w8,w9,w8, LSR #0x13
008bc334	mul w25,w8,w10
008bc338	ldr w8,[x1, #0x8]
008bc33c	b 0x008bc35c
008bc340	mov x0,x22
008bc344	mov x1,x20
008bc348	mov w2,w21
008bc34c	bl 0x008bdb7c
008bc350	ldr w8,[x20, #0x8]
008bc354	cmp w24,w8
008bc358	b.cc 0x008bc450
008bc35c	add w8,w8,#0x1
008bc360	cmp w21,w8
008bc364	b.eq 0x008bc340
008bc368	ldrb w8,[x20, #0x5]
008bc36c	ldr x9,[x20, #0x28]
008bc370	lsl w8,w26,w8
008bc374	bic w8,w25,w8
008bc378	add x1,x9,x8, LSL #0x5
008bc37c	ldr w8,[x1, #0xc]
008bc380	cbnz w8,0x008bc39c
008bc384	ldarb w8,[x23]
008bc388	tbz w8,#0x0,0x008bc3cc
008bc38c	ldr x8,[x28, #0xc88]
008bc390	add x8,x8,x27
008bc394	cmp x1,x8
008bc398	b.ne 0x008bc40c
008bc39c	ldr w8,[x20, #0xc]
008bc3a0	cmp w8,#0x1
008bc3a4	b.lt 0x008bc340
008bc3a8	sub x8,x8,#0x1
008bc3ac	ldr x9,[x20, #0x28]
008bc3b0	mov w10,w8
008bc3b4	str w8,[x20, #0xc]
008bc3b8	add x2,x9,x10, LSL #0x5
008bc3bc	ldrb w9,[x2, #0x1c]
008bc3c0	tst w9,#0xf
008bc3c4	b.ne 0x008bc3a0
008bc3c8	b 0x008bc400
008bc3cc	mov x0,x23
008bc3d0	str x1,[sp, #0x8]
008bc3d4	bl 0x00c2fe90
008bc3d8	ldr x1,[sp, #0x8]
008bc3dc	cbz w0,0x008bc38c
008bc3e0	adrp x8,0xcca000
008bc3e4	ldr x0,[x8, #0x8c8]
008bc3e8	bl 0x007fe1ec
008bc3ec	str x0,[x28, #0xc88]
008bc3f0	mov x0,x23
008bc3f4	bl 0x00c2fea0
008bc3f8	ldr x1,[sp, #0x8]
008bc3fc	b 0x008bc38c
008bc400	mov x0,x20
008bc404	bl 0x008bda50
008bc408	mov x1,x0
008bc40c	ldr x8,[x19]
008bc410	ldr w9,[x1, #0x1c]
008bc414	str x8,[x1, #0x10]
008bc418	ldr w8,[x19, #0x8]
008bc41c	str w8,[x1, #0x18]
008bc420	ldr w8,[x19, #0xc]
008bc424	bfxil w9,w8,#0x0,#0x4
008bc428	str w9,[x1, #0x1c]
008bc42c	mov x0,x1
008bc430	ldp x20,x19,[sp, #0x60]
008bc434	ldp x22,x21,[sp, #0x50]
008bc438	ldp x24,x23,[sp, #0x40]
008bc43c	ldp x26,x25,[sp, #0x30]
008bc440	ldp x28,x27,[sp, #0x20]
008bc444	ldp x29,x30,[sp, #0x10]
008bc448	add sp,sp,#0x70
008bc44c	ret
008bc450	ldr x8,[x20, #0x20]
008bc454	add x1,x8,w24, SXTW  #0x4
008bc458	b 0x008bc42c

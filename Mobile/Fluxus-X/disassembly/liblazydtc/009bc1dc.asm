; FUN_009bc1dc @ 009bc1dc
009bc1dc	sub sp,sp,#0x60
009bc1e0	stp x24,x23,[sp, #0x20]
009bc1e4	stp x22,x21,[sp, #0x30]
009bc1e8	stp x20,x19,[sp, #0x40]
009bc1ec	mov x24,x2
009bc1f0	mov x20,x1
009bc1f4	mov x21,x0
009bc1f8	stp x26,x25,[sp, #0x10]
009bc1fc	stp x29,x30,[sp, #0x50]
009bc200	add x29,sp,#0x50
009bc204	str xzr,[sp, #0x8]
009bc208	cbz x1,0x009bc214
009bc20c	ldr x26,[x20, #0x9a8]
009bc210	b 0x009bc21c
009bc214	mov x26,x21
009bc218	cbz x21,0x009bc314
009bc21c	bl 0x00c323e0
009bc220	mov w10,#0x1d18
009bc224	mov w11,#0x1d20
009bc228	add x8,x21,#0xb8
009bc22c	add x9,x21,#0xc0
009bc230	cmp x21,#0x0
009bc234	add x10,x20,x10
009bc238	add x11,x20,x11
009bc23c	csel x8,x8,x10,ne
009bc240	csel x9,x9,x11,ne
009bc244	ldr x22,[x9]
009bc248	ldr x23,[x8]
009bc24c	bl 0x00c32270
009bc250	bl 0x00c32240
009bc254	mov x19,x0
009bc258	cbz x0,0x009bc2b8
009bc25c	mov w1,#0x6c
009bc260	orr w2,wzr,#0x3
009bc264	mov x0,x19
009bc268	mov x3,x24
009bc26c	bl 0x00c321a0
009bc270	cmp w0,#0x0
009bc274	b.le 0x009bc2e8
009bc278	ldr x0,[x26]
009bc27c	ldr x1,[x26, #0x440]
009bc280	bl 0x00c350a0
009bc284	str x0,[sp, #0x8]
009bc288	cbz x0,0x009bc31c
009bc28c	add x1,sp,#0x8
009bc290	mov x0,x19
009bc294	mov x2,x23
009bc298	mov x3,x22
009bc29c	bl 0x00c32650
009bc2a0	cbz x0,0x009bc380
009bc2a4	ldr x1,[sp, #0x8]
009bc2a8	cbz x21,0x009bc3ac
009bc2ac	mov x0,x21
009bc2b0	bl 0x009bbbc8
009bc2b4	b 0x009bc3b4
009bc2b8	bl 0x00c342a0
009bc2bc	adrp x0,0x2db000
009bc2c0	adrp x2,0x2d9000
009bc2c4	add x0,x0,#0xaec
009bc2c8	add x2,x2,#0x7cf
009bc2cc	mov w1,#0x1bb
009bc2d0	bl 0x00c342b0
009bc2d4	mov w8,#0x2
009bc2d8	movk w8,#0x8, LSL #16
009bc2dc	add w1,w8,#0x5
009bc2e0	mov w0,#0x14
009bc2e4	b 0x009bc344
009bc2e8	bl 0x00c342a0
009bc2ec	adrp x0,0x2db000
009bc2f0	adrp x2,0x2d9000
009bc2f4	add x0,x0,#0xaec
009bc2f8	add x2,x2,#0x7cf
009bc2fc	orr w1,wzr,#0x1c0
009bc300	bl 0x00c342b0
009bc304	mov w1,#0x2
009bc308	mov w0,#0x14
009bc30c	movk w1,#0x8, LSL #16
009bc310	b 0x009bc344
009bc314	mov w25,wzr
009bc318	b 0x009bc360
009bc31c	bl 0x00c342a0
009bc320	adrp x0,0x2db000
009bc324	adrp x2,0x2d9000
009bc328	add x0,x0,#0xaec
009bc32c	add x2,x2,#0x7cf
009bc330	mov w1,#0x1c6
009bc334	bl 0x00c342b0
009bc338	mov w1,#0x100
009bc33c	mov w0,#0x14
009bc340	movk w1,#0xc, LSL #16
009bc344	mov x2,xzr
009bc348	bl 0x00c342c0
009bc34c	mov w25,wzr
009bc350	ldr x0,[sp, #0x8]
009bc354	bl 0x00c31a90
009bc358	mov x0,x19
009bc35c	bl 0x00c31a40
009bc360	mov w0,w25
009bc364	ldp x29,x30,[sp, #0x50]
009bc368	ldp x20,x19,[sp, #0x40]
009bc36c	ldp x22,x21,[sp, #0x30]
009bc370	ldp x24,x23,[sp, #0x20]
009bc374	ldp x26,x25,[sp, #0x10]
009bc378	add sp,sp,#0x60
009bc37c	ret
009bc380	bl 0x00c342a0
009bc384	adrp x0,0x2db000
009bc388	adrp x2,0x2d9000
009bc38c	add x0,x0,#0xaec
009bc390	add x2,x2,#0x7cf
009bc394	mov w1,#0x1cb
009bc398	bl 0x00c342b0
009bc39c	mov w8,#0x2
009bc3a0	movk w8,#0x8, LSL #16
009bc3a4	add w1,w8,#0x7
009bc3a8	b 0x009bc2e0
009bc3ac	mov x0,x20
009bc3b0	bl 0x009bb34c
009bc3b4	mov w24,w0
009bc3b8	bl 0x00c32410
009bc3bc	mov w25,wzr
009bc3c0	cbz w24,0x009bc350
009bc3c4	cbnz x0,0x009bc350
009bc3c8	cbz x21,0x009bc3e8
009bc3cc	mov w1,#0x58
009bc3d0	mov x0,x21
009bc3d4	mov x2,xzr
009bc3d8	mov x3,xzr
009bc3dc	bl 0x00c32710
009bc3e0	cbnz w0,0x009bc400
009bc3e4	b 0x009bc34c
009bc3e8	mov w1,#0x58
009bc3ec	mov x0,x20
009bc3f0	mov x2,xzr
009bc3f4	mov x3,xzr
009bc3f8	bl 0x00c328a0
009bc3fc	cbz w0,0x009bc34c
009bc400	ldr x0,[x26]
009bc404	ldr x1,[x26, #0x440]
009bc408	bl 0x00c350a0
009bc40c	str x0,[sp]
009bc410	cbz x0,0x009bc468
009bc414	mov x1,sp
009bc418	mov x0,x19
009bc41c	mov x2,x23
009bc420	mov x3,x22
009bc424	bl 0x00c31a60
009bc428	cbz x0,0x009bc49c
009bc42c	ldr x3,[sp]
009bc430	mov w1,#0x59
009bc434	cbz x21,0x009bc44c
009bc438	mov x0,x21
009bc43c	mov x2,xzr
009bc440	bl 0x00c32710
009bc444	cbnz w0,0x009bc400
009bc448	b 0x009bc45c
009bc44c	mov x0,x20
009bc450	mov x2,xzr
009bc454	bl 0x00c328a0
009bc458	cbnz w0,0x009bc400
009bc45c	ldr x0,[sp]
009bc460	bl 0x00c31a90
009bc464	b 0x009bc34c
009bc468	bl 0x00c342a0
009bc46c	adrp x0,0x2db000
009bc470	adrp x2,0x2d9000
009bc474	add x0,x0,#0xaec
009bc478	add x2,x2,#0x7cf
009bc47c	mov w1,#0x1ed
009bc480	bl 0x00c342b0
009bc484	mov w1,#0x100
009bc488	mov w0,#0x14
009bc48c	movk w1,#0xc, LSL #16
009bc490	mov x2,xzr
009bc494	bl 0x00c342c0
009bc498	b 0x009bc4dc
009bc49c	ldr x0,[sp]
009bc4a0	bl 0x00c31a90
009bc4a4	bl 0x00c32420
009bc4a8	and x8,x0,#0xff800000
009bc4ac	mov w9,#0x4800000
009bc4b0	cmp x8,x9
009bc4b4	mov w25,wzr
009bc4b8	b.ne 0x009bc350
009bc4bc	asr w8,w0,#0x1f
009bc4c0	and w8,w8,#0x7f800000
009bc4c4	orr w8,w8,#0x7fffff
009bc4c8	and w8,w8,w0
009bc4cc	cmp w8,#0x6c
009bc4d0	mov w25,wzr
009bc4d4	b.ne 0x009bc350
009bc4d8	bl 0x00c323e0
009bc4dc	mov w25,w24
009bc4e0	b 0x009bc350

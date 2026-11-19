; ssl3_digest_cached_records @ 009ab364
009ab364	str x21,[sp, #-0x30]!
009ab368	stp x20,x19,[sp, #0x10]
009ab36c	stp x29,x30,[sp, #0x20]
009ab370	ldr x8,[x0, #0x190]
009ab374	mov x19,x0
009ab378	mov w20,w1
009ab37c	add x29,sp,#0x20
009ab380	cbz x8,0x009ab39c
009ab384	cbnz w20,0x009ab394
009ab388	ldr x0,[x19, #0x188]
009ab38c	bl 0x00c31a40
009ab390	str xzr,[x19, #0x188]
009ab394	mov w0,#0x1
009ab398	b 0x009ab4b4
009ab39c	ldr x0,[x19, #0x188]
009ab3a0	orr w1,wzr,#0x3
009ab3a4	add x3,sp,#0x8
009ab3a8	mov x2,xzr
009ab3ac	bl 0x00c321a0
009ab3b0	cmp x0,#0x0
009ab3b4	b.le 0x009ab42c
009ab3b8	mov x21,x0
009ab3bc	bl 0x00c31fa0
009ab3c0	str x0,[x19, #0x190]
009ab3c4	cbz x0,0x009ab454
009ab3c8	mov x0,x19
009ab3cc	bl 0x00c34a10
009ab3d0	cbz x0,0x009ab480
009ab3d4	mov x1,x0
009ab3d8	ldr x0,[x19, #0x190]
009ab3dc	mov x2,xzr
009ab3e0	bl 0x00c31f70
009ab3e4	cbz w0,0x009ab3fc
009ab3e8	ldr x0,[x19, #0x190]
009ab3ec	ldr x1,[sp, #0x8]
009ab3f0	mov x2,x21
009ab3f4	bl 0x00c31f80
009ab3f8	cbnz w0,0x009ab384
009ab3fc	bl 0x00c342a0
009ab400	adrp x0,0x2a3000
009ab404	adrp x2,0x2bf000
009ab408	add x0,x0,#0xb34
009ab40c	add x2,x2,#0x748
009ab410	mov w1,#0x18e
009ab414	bl 0x00c342b0
009ab418	mov w8,#0x100
009ab41c	movk w8,#0xc, LSL #16
009ab420	add w2,w8,#0x3
009ab424	mov w1,#0x50
009ab428	b 0x009ab4a4
009ab42c	bl 0x00c342a0
009ab430	adrp x0,0x2a3000
009ab434	adrp x2,0x2bf000
009ab438	add x0,x0,#0xb34
009ab43c	add x2,x2,#0x748
009ab440	mov w1,#0x17c
009ab444	bl 0x00c342b0
009ab448	mov w1,#0x50
009ab44c	mov w2,#0x14c
009ab450	b 0x009ab4a4
009ab454	bl 0x00c342a0
009ab458	adrp x0,0x2a3000
009ab45c	adrp x2,0x2bf000
009ab460	add x0,x0,#0xb34
009ab464	add x2,x2,#0x748
009ab468	mov w1,#0x182
009ab46c	bl 0x00c342b0
009ab470	mov w2,#0x100
009ab474	mov w1,#0x50
009ab478	movk w2,#0xc, LSL #16
009ab47c	b 0x009ab4a4
009ab480	bl 0x00c342a0
009ab484	adrp x0,0x2a3000
009ab488	adrp x2,0x2bf000
009ab48c	add x0,x0,#0xb34
009ab490	add x2,x2,#0x748
009ab494	mov w1,#0x189
009ab498	bl 0x00c342b0
009ab49c	mov w1,#0x50
009ab4a0	mov w2,#0x129
009ab4a4	mov x0,x19
009ab4a8	mov x3,xzr
009ab4ac	bl 0x00c34410
009ab4b0	mov w0,wzr
009ab4b4	ldp x29,x30,[sp, #0x20]
009ab4b8	ldp x20,x19,[sp, #0x10]
009ab4bc	ldr x21,[sp], #0x30
009ab4c0	ret

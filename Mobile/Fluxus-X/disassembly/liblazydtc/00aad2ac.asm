; OBJ_NAME_new_index @ 00aad2ac
00aad2ac	sub sp,sp,#0x70
00aad2b0	stp x22,x21,[sp, #0x40]
00aad2b4	stp x20,x19,[sp, #0x50]
00aad2b8	mov x20,x1
00aad2bc	mov x21,x0
00aad2c0	adrp x0,0xd22000
00aad2c4	adrp x1,0xaad000
00aad2c8	add x0,x0,#0x160
00aad2cc	add x1,x1,#0x21c
00aad2d0	stp x28,x27,[sp, #0x10]
00aad2d4	stp x26,x25,[sp, #0x20]
00aad2d8	stp x24,x23,[sp, #0x30]
00aad2dc	stp x29,x30,[sp, #0x60]
00aad2e0	add x29,sp,#0x60
00aad2e4	mov x23,x2
00aad2e8	bl 0x00c34d60
00aad2ec	mov w22,wzr
00aad2f0	cbz w0,0x00aad46c
00aad2f4	adrp x8,0xd22000
00aad2f8	ldr w8,[x8, #0x164]
00aad2fc	cbz w8,0x00aad46c
00aad300	adrp x19,0xd22000
00aad304	ldr x0,[x19, #0x168]
00aad308	bl 0x00c356a0
00aad30c	cbz w0,0x00aad3d4
00aad310	adrp x27,0xd22000
00aad314	ldr x0,[x27, #0x170]
00aad318	cbnz x0,0x00aad328
00aad31c	bl 0x00c34780
00aad320	str x0,[x27, #0x170]
00aad324	cbz x0,0x00aad3dc
00aad328	adrp x28,0xcc9000
00aad32c	ldr w22,[x28, #0x158]
00aad330	str x23,[sp, #0x8]
00aad334	add w8,w22,#0x1
00aad338	str w8,[x28, #0x158]
00aad33c	bl 0x00c325e0
00aad340	ldr w8,[x28, #0x158]
00aad344	cmp w0,w8
00aad348	b.ge 0x00aad3a4
00aad34c	adrp x26,0xcb5000
00aad350	adrp x19,0xcb5000
00aad354	ldr x26,[x26, #0x650]
00aad358	ldr x19,[x19, #0x1c0]
00aad35c	adrp x25,0x2b2000
00aad360	mov w23,w0
00aad364	add x25,x25,#0x57b
00aad368	orr w0,wzr,#0x18
00aad36c	mov w2,#0x5a
00aad370	mov x1,x25
00aad374	bl 0x00c34250
00aad378	cbz x0,0x00aad3e4
00aad37c	stp x26,x19,[x0]
00aad380	mov x24,x0
00aad384	ldr x0,[x27, #0x170]
00aad388	mov x1,x24
00aad38c	bl 0x00c347a0
00aad390	cbz w0,0x00aad418
00aad394	ldr w8,[x28, #0x158]
00aad398	add w23,w23,#0x1
00aad39c	cmp w23,w8
00aad3a0	b.lt 0x00aad368
00aad3a4	ldr x0,[x27, #0x170]
00aad3a8	mov w1,w22
00aad3ac	bl 0x00c32610
00aad3b0	cbz x21,0x00aad3b8
00aad3b4	str x21,[x0]
00aad3b8	ldr x8,[sp, #0x8]
00aad3bc	adrp x19,0xd22000
00aad3c0	cbz x20,0x00aad3c8
00aad3c4	str x20,[x0, #0x8]
00aad3c8	cbz x8,0x00aad464
00aad3cc	str x8,[x0, #0x10]
00aad3d0	b 0x00aad464
00aad3d4	mov w22,wzr
00aad3d8	b 0x00aad46c
00aad3dc	mov w22,wzr
00aad3e0	b 0x00aad464
00aad3e4	bl 0x00c342a0
00aad3e8	adrp x0,0x2b2000
00aad3ec	adrp x2,0x2c9000
00aad3f0	add x0,x0,#0x57b
00aad3f4	add x2,x2,#0xddb
00aad3f8	mov w1,#0x5c
00aad3fc	bl 0x00c342b0
00aad400	mov w1,#0x100
00aad404	mov w0,#0x8
00aad408	movk w1,#0xc, LSL #16
00aad40c	mov x2,xzr
00aad410	bl 0x00c342c0
00aad414	b 0x00aad45c
00aad418	bl 0x00c342a0
00aad41c	adrp x19,0x2b2000
00aad420	add x19,x19,#0x57b
00aad424	adrp x2,0x2c9000
00aad428	add x2,x2,#0xddb
00aad42c	mov w1,#0x65
00aad430	mov x0,x19
00aad434	bl 0x00c342b0
00aad438	mov w1,#0x100
00aad43c	mov w0,#0x8
00aad440	movk w1,#0xc, LSL #16
00aad444	mov x2,xzr
00aad448	bl 0x00c342c0
00aad44c	mov w2,#0x66
00aad450	mov x0,x24
00aad454	mov x1,x19
00aad458	bl 0x00c32310
00aad45c	mov w22,wzr
00aad460	adrp x19,0xd22000
00aad464	ldr x0,[x19, #0x168]
00aad468	bl 0x00c35690
00aad46c	mov w0,w22
00aad470	ldp x29,x30,[sp, #0x60]
00aad474	ldp x20,x19,[sp, #0x50]
00aad478	ldp x22,x21,[sp, #0x40]
00aad47c	ldp x24,x23,[sp, #0x30]
00aad480	ldp x26,x25,[sp, #0x20]
00aad484	ldp x28,x27,[sp, #0x10]
00aad488	add sp,sp,#0x70
00aad48c	ret

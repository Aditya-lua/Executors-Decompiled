; std::__ndk1::ios_base::swap @ 00bce478
00bce478	paciasp
00bce47c	sub sp,sp,#0x30
00bce480	stp x29,x30,[sp, #0x10]
00bce484	stp x20,x19,[sp, #0x20]
00bce488	add x29,sp,#0x10
00bce48c	ldr w8,[x1, #0x8]
00bce490	ldr x9,[x1, #0x10]
00bce494	mov x20,x0
00bce498	ldr w10,[x0, #0x8]
00bce49c	mov x19,x1
00bce4a0	str w8,[x0, #0x8]
00bce4a4	ldr x8,[x0, #0x10]
00bce4a8	str x9,[x0, #0x10]
00bce4ac	ldr x9,[x1, #0x18]
00bce4b0	str w10,[x1, #0x8]
00bce4b4	str x8,[x1, #0x10]
00bce4b8	ldr w8,[x1, #0x20]
00bce4bc	ldr x10,[x0, #0x18]
00bce4c0	str x9,[x0, #0x18]
00bce4c4	ldr w9,[x0, #0x20]
00bce4c8	str w8,[x0, #0x20]
00bce4cc	str w9,[x1, #0x20]
00bce4d0	ldr w8,[x1, #0x24]
00bce4d4	ldr w9,[x0, #0x24]
00bce4d8	str x10,[x1, #0x18]
00bce4dc	str w8,[x0, #0x24]
00bce4e0	add x0,sp,#0x8
00bce4e4	str w9,[x1, #0x24]
00bce4e8	add x1,x20,#0x30
00bce4ec	bl 0x00c30660
00bce4f0	add x0,x20,#0x30
00bce4f4	add x1,x19,#0x30
00bce4f8	bl 0x00c43f00
00bce4fc	add x0,x19,#0x30
00bce500	add x1,sp,#0x8
00bce504	bl 0x00c43f00
00bce508	add x0,sp,#0x8
00bce50c	bl 0x00c30090
00bce510	ldr x8,[x19, #0x38]
00bce514	ldr x9,[x20, #0x38]
00bce518	str x8,[x20, #0x38]
00bce51c	str x9,[x19, #0x38]
00bce520	ldp x8,x9,[x19, #0x40]
00bce524	ldp x10,x11,[x20, #0x40]
00bce528	stp x8,x9,[x20, #0x40]
00bce52c	stp x10,x11,[x19, #0x40]
00bce530	ldp x8,x9,[x19, #0x50]
00bce534	ldp x10,x11,[x20, #0x50]
00bce538	stp x8,x9,[x20, #0x50]
00bce53c	str x10,[x19, #0x50]
00bce540	ldr x8,[x19, #0x60]
00bce544	ldr x9,[x20, #0x60]
00bce548	str x8,[x20, #0x60]
00bce54c	stp x11,x9,[x19, #0x58]
00bce550	ldp x8,x9,[x19, #0x68]
00bce554	ldp x10,x11,[x20, #0x68]
00bce558	stp x8,x9,[x20, #0x68]
00bce55c	str x10,[x19, #0x68]
00bce560	ldr x8,[x19, #0x78]
00bce564	ldr x9,[x20, #0x78]
00bce568	str x8,[x20, #0x78]
00bce56c	stp x11,x9,[x19, #0x70]
00bce570	ldr x8,[x19, #0x80]
00bce574	ldr x9,[x20, #0x80]
00bce578	str x8,[x20, #0x80]
00bce57c	str x9,[x19, #0x80]
00bce580	ldp x20,x19,[sp, #0x20]
00bce584	ldp x29,x30,[sp, #0x10]
00bce588	add sp,sp,#0x30
00bce58c	autiasp
00bce590	ret
